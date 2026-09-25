"""Contract tests for provenance interpretation; no Unity project writes."""
import importlib.util
import struct
import json
import tempfile
import sys
import unittest
from unittest.mock import patch
from pathlib import Path

spec = importlib.util.spec_from_file_location('audit', Path(__file__).with_name('Audit-MetadataProvenance.py'))
audit = importlib.util.module_from_spec(spec)
spec.loader.exec_module(audit)


class ProvenanceTests(unittest.TestCase):
    def test_integrity_missing_changed_duplicate_and_repeat(self):
        with tempfile.TemporaryDirectory() as root:
            root = Path(root)
            project = root / 'project'
            (project / 'Assets').mkdir(parents=True)
            (project / 'AuxiliaryFiles').mkdir()
            (project / 'AuxiliaryFiles/path_id_map.json').write_text('{"Files": []}')
            meta = project / 'Assets/example.asset.meta'
            meta.write_text('guid: ' + 'a'*32 + '\n')
            baseline = root / 'baseline.json'
            baseline.write_text(json.dumps([{'Path':'Assets/example.asset.meta','Hash':audit.sha(meta)}]))
            apk = root / 'fixture.apk'
            apk.write_bytes(b'fixture')
            output = root / 'report'
            argv = ['audit','--project',str(project),'--apk',str(apk),'--baseline',str(baseline),'--output',str(output)]
            evidence = dict(files={}, containers=[], metadataTypes=[], matchingMetadataTypes=[], scanErrors=[])
            with patch.object(sys, 'argv', argv), patch.object(audit, 'scan_apk', return_value=evidence), patch('builtins.print'):
                self.assertEqual(0, audit.main())
                first = (output / 'metadata-provenance.json').read_bytes()
                self.assertEqual(0, audit.main())
                self.assertEqual(first, (output / 'metadata-provenance.json').read_bytes())
                duplicate = project / 'Assets/duplicate.asset.meta'
                duplicate.write_bytes(meta.read_bytes())
                self.assertEqual(1, audit.main())
                self.assertTrue(json.loads((output / 'summary.json').read_text())['duplicateGuids'])
                duplicate.unlink()
                meta.write_text('guid: ' + 'b'*32 + '\n')
                self.assertEqual(1, audit.main())
                self.assertEqual('changed', json.loads((output / 'summary.json').read_text())['baselineIssues'][0]['status'])
                meta.unlink()
                self.assertEqual(1, audit.main())
                self.assertEqual('missing', json.loads((output / 'summary.json').read_text())['baselineIssues'][0]['status'])

    def test_guid_requires_one_exact_value(self):
        self.assertEqual('a'*32, audit.read_guid('guid: '+'a'*32+'\n'))
        for value in ['guid: 123\n', 'guid: '+'a'*32+'\nguid: '+'b'*32, 'missing']:
            self.assertIsNone(audit.read_guid(value))

    def test_path_ids_are_scoped_to_serialized_file(self):
        mapping = {'Files': [{'Name': name, 'Assets': [{'Name': 'Sample', 'PathID': 12, 'Type': 'MonoScript'}]}
                             for name in ['globalgamemanagers.assets', 'CAB-other']]}
        values = audit.map_candidates(mapping)['sample']
        self.assertEqual(2, len(values))
        self.assertNotEqual(values[0]['serializedFile'], values[1]['serializedFile'])

    def test_unknown_name_has_no_invented_mapping(self):
        self.assertEqual([], audit.map_candidates({'Files': []}).get('unknown', []))

    def test_missing_metadata_is_rejected(self):
        with self.assertRaises((ValueError, struct.error)):
            audit.metadata_types(b'')

    def test_v27_typedef_reading_and_token_validation(self):
        data = bytearray(320)
        struct.pack_into('<II', data, 0, 0xFAB11BAF, 27)
        struct.pack_into('<II', data, 24, 288, 5)
        struct.pack_into('<II', data, 160, 200, 88)
        data[288:293] = b'Test\0'
        struct.pack_into('<II', data, 200, 0, 4)
        struct.pack_into('<I', data, 284, 0x02000001)
        self.assertEqual('Test', audit.metadata_types(data)[0]['name'])
        struct.pack_into('<I', data, 284, 0)
        with self.assertRaises(ValueError):
            audit.metadata_types(data)


if __name__ == '__main__':
    unittest.main()
