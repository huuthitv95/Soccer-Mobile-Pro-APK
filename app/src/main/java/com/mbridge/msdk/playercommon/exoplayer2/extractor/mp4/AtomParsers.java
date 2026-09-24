package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.audio.Ac3Util;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.AvcConfig;
import com.mbridge.msdk.playercommon.exoplayer2.video.HevcConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 3;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_vide = Util.getIntegerCodeForString("vide");
    private static final int TYPE_soun = Util.getIntegerCodeForString("soun");
    private static final int TYPE_text = Util.getIntegerCodeForString("text");
    private static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
    private static final int TYPE_subt = Util.getIntegerCodeForString("subt");
    private static final int TYPE_clcp = Util.getIntegerCodeForString("clcp");
    private static final int TYPE_meta = Util.getIntegerCodeForString(Constants.REFERRER_API_META);

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            Assertions.checkState(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private interface SampleSizeBox {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fixedSampleSize = parsableByteArray.readUnsignedIntToInt();
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return this.fixedSampleSize != 0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == 0 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }
    }

    private static final class TkhdData {
        private final long duration;

        /* JADX INFO: renamed from: id */
        private final int f37399id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.f37399id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    public static final class UnhandledEditListException extends ParserException {
    }

    private AtomParsers() {
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(3, 0, length)] && jArr[Util.constrainValue(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i, int i2) {
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            Assertions.checkArgument(i3 > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_esds) {
                return position;
            }
            position += i3;
        }
        return -1;
    }

    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int unsignedShort;
        int unsignedFixedPoint1616;
        int unsignedIntToInt;
        String str2;
        int i6;
        DrmInitData drmInitData2;
        int i7;
        String str3;
        int i8;
        boolean z2;
        int i9;
        int i10 = i2;
        int i11 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i10 + 16);
        if (z) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        int i12 = 2;
        boolean z3 = true;
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            unsignedIntToInt = unsignedShort2;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
        }
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == Atom.TYPE_enca) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i10, i11);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        String str4 = "audio/raw";
        if (iIntValue == Atom.TYPE_ac_3) {
            str2 = "audio/ac3";
        } else if (iIntValue == Atom.TYPE_ec_3) {
            str2 = "audio/eac3";
        } else if (iIntValue == Atom.TYPE_dtsc) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == Atom.TYPE_dtsh || iIntValue == Atom.TYPE_dtsl) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == Atom.TYPE_dtse) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == Atom.TYPE_samr) {
            str2 = "audio/3gpp";
        } else if (iIntValue == Atom.TYPE_sawb) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == Atom.TYPE_lpcm || iIntValue == Atom.TYPE_sowt) {
            str2 = "audio/raw";
        } else if (iIntValue == Atom.TYPE__mp3) {
            str2 = "audio/mpeg";
        } else {
            str2 = iIntValue == Atom.TYPE_alac ? "audio/alac" : null;
        }
        int i13 = unsignedFixedPoint1616;
        String str5 = str2;
        int i14 = i13;
        int iIntValue2 = unsignedIntToInt;
        int i15 = position;
        byte[] bArr = null;
        while (i15 - i10 < i11) {
            parsableByteArray.setPosition(i15);
            int i16 = parsableByteArray.readInt();
            Assertions.checkArgument(i16 > 0 ? z3 : false, "childAtomSize should be positive");
            int i17 = parsableByteArray.readInt();
            int i18 = Atom.TYPE_esds;
            if (i17 == i18 || (z && i17 == Atom.TYPE_wave)) {
                i6 = i15;
                drmInitData2 = drmInitData3;
                i7 = i16;
                str3 = str4;
                i8 = 2;
                z2 = true;
                i9 = i14;
                int iFindEsdsPosition = i17 == i18 ? i6 : findEsdsPosition(parsableByteArray, i6, i7);
                if (iFindEsdsPosition != -1) {
                    Pair<String, byte[]> esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindEsdsPosition);
                    str5 = (String) esdsFromParent.first;
                    bArr = (byte[]) esdsFromParent.second;
                    if ("audio/mp4a-latm".equals(str5)) {
                        Pair<Integer, Integer> aacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                        int iIntValue3 = ((Integer) aacAudioSpecificConfig.first).intValue();
                        iIntValue2 = ((Integer) aacAudioSpecificConfig.second).intValue();
                        i14 = iIntValue3;
                    }
                }
                i15 = i7 + i6;
                str4 = str3;
                drmInitData3 = drmInitData2;
                i12 = i8;
                z3 = z2;
                i10 = i2;
                i11 = i3;
            } else {
                if (i17 == Atom.TYPE_dac3) {
                    parsableByteArray.setPosition(i15 + 8);
                    stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData3);
                } else if (i17 == Atom.TYPE_dec3) {
                    parsableByteArray.setPosition(i15 + 8);
                    stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData3);
                } else if (i17 == Atom.TYPE_ddts) {
                    drmInitData2 = drmInitData3;
                    i9 = i14;
                    i6 = i15;
                    i7 = i16;
                    str3 = str4;
                    i8 = 2;
                    z2 = true;
                    stsdData.format = Format.createAudioSampleFormat(Integer.toString(i4), str5, null, -1, -1, iIntValue2, i9, null, drmInitData2, 0, str);
                } else {
                    i6 = i15;
                    drmInitData2 = drmInitData3;
                    i7 = i16;
                    str3 = str4;
                    i8 = 2;
                    z2 = true;
                    i9 = i14;
                    if (i17 == Atom.TYPE_alac) {
                        byte[] bArr2 = new byte[i7];
                        parsableByteArray.setPosition(i6);
                        parsableByteArray.readBytes(bArr2, 0, i7);
                        bArr = bArr2;
                    }
                }
                i6 = i15;
                drmInitData2 = drmInitData3;
                i7 = i16;
                str3 = str4;
                i8 = 2;
                z2 = true;
                i9 = i14;
            }
            i14 = i9;
            i15 = i7 + i6;
            str4 = str3;
            drmInitData3 = drmInitData2;
            i12 = i8;
            z3 = z2;
            i10 = i2;
            i11 = i3;
        }
        int i19 = i12;
        DrmInitData drmInitData4 = drmInitData3;
        String str6 = str4;
        int i20 = i14;
        if (stsdData.format != null || str5 == null) {
            return;
        }
        stsdData.format = Format.createAudioSampleFormat(Integer.toString(i4), str5, null, -1, -1, iIntValue2, i20, str6.equals(str5) ? i19 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData4, 0, str);
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i6 = parsableByteArray.readInt();
            int i7 = parsableByteArray.readInt();
            if (i7 == Atom.TYPE_frma) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i7 == Atom.TYPE_schm) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i7 == Atom.TYPE_schi) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        Assertions.checkArgument(numValueOf != null, "frma atom is mandatory");
        Assertions.checkArgument(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, string);
        Assertions.checkArgument(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, schiFromParent);
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType;
        if (containerAtom == null || (leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst)) == null) {
            return Pair.create(null, null);
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (unsignedByte & 127);
        }
        return i;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        int i = parsableByteArray.readInt();
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == TYPE_meta ? 4 : -1;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    private static Metadata parseMetaAtom(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_ilst) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i2);
            }
            parsableByteArray.skipBytes(i2 - 8);
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i4 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_proj) {
                return Arrays.copyOfRange(parsableByteArray.data, i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            Assertions.checkArgument(i3 > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_sinf && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i3)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i3;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int i6 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_tenc) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i4 = (unsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0165 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100 A[ADDED_TO_REGION, LOOP:1: B:49:0x0100->B:50:0x0102, LOOP_START, PHI: r2 r7 r29
  0x0100: PHI (r2v31 int) = (r2v29 int), (r2v34 int) binds: [B:48:0x00fe, B:50:0x0102] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r7v22 int) = (r7v21 int), (r7v25 int) binds: [B:48:0x00fe, B:50:0x0102] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r29v4 long) = (r29v3 long), (r29v6 long) binds: [B:48:0x00fe, B:50:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0102 A[LOOP:1: B:49:0x0100->B:50:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0118 A[ADDED_TO_REGION, LOOP:2: B:53:0x0118->B:55:0x011c, LOOP_START, PHI: r4 r15 r23
  0x0118: PHI (r4v17 int) = (r4v15 int), (r4v18 int) binds: [B:52:0x0116, B:55:0x011c] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r15v8 int) = (r15v4 int), (r15v9 int) binds: [B:52:0x0116, B:55:0x011c] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r23v11 int) = (r23v9 int), (r23v13 int) binds: [B:52:0x0116, B:55:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:82:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x018b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x019e  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ec A[LOOP:8: B:92:0x01e6->B:94:0x01ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0228  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x019e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int i;
        int i2;
        int i3;
        int i4;
        long[] jArr;
        int[] iArr;
        int i5;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long j;
        int i6;
        long jScaleLargeTimestamp;
        Track track2;
        long[] jArr4;
        long[] jArr5;
        long[] jArr6;
        int[] iArr4;
        ParsableByteArray parsableByteArray;
        long[] jArr7;
        int[] iArr5;
        int unsignedIntToInt3;
        SampleSizeBox sampleSizeBox;
        int i7;
        int i8;
        int i9;
        int unsignedIntToInt4;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        int nextSampleSize;
        int i10;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_co64);
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stsc).data;
        ParsableByteArray parsableByteArray4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stts).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray5 = null;
        ParsableByteArray parsableByteArray6 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray7 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray3, parsableByteArray2, z);
        parsableByteArray4.setPosition(12);
        int unsignedIntToInt5 = parsableByteArray4.readUnsignedIntToInt() - 1;
        int unsignedIntToInt6 = parsableByteArray4.readUnsignedIntToInt();
        int unsignedIntToInt7 = parsableByteArray4.readUnsignedIntToInt();
        if (parsableByteArray7 != null) {
            parsableByteArray7.setPosition(12);
            unsignedIntToInt = parsableByteArray7.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        int unsignedIntToInt8 = -1;
        if (parsableByteArray6 != null) {
            parsableByteArray6.setPosition(12);
            unsignedIntToInt2 = parsableByteArray6.readUnsignedIntToInt();
            unsignedIntToInt8 = unsignedIntToInt2 > 0 ? parsableByteArray6.readUnsignedIntToInt() - 1 : -1;
            if (stz2SampleSizeBox.isFixedSampleSize()) {
                i = 0;
                if (!"audio/raw".equals(track.format.sampleMimeType) && unsignedIntToInt5 == 0 && unsignedIntToInt == 0 && unsignedIntToInt2 == 0) {
                    i2 = 1;
                }
                String str = TAG;
                if (i2 == 0) {
                    jArr6 = new long[sampleCount];
                    i4 = 1;
                    iArr4 = new int[sampleCount];
                    parsableByteArray = parsableByteArray7;
                    jArr7 = new long[sampleCount];
                    iArr5 = new int[sampleCount];
                    unsignedIntToInt3 = unsignedIntToInt8;
                    sampleSizeBox = stz2SampleSizeBox;
                    i7 = i;
                    i8 = i7;
                    i9 = i8;
                    i5 = i9;
                    unsignedIntToInt4 = i5;
                    j2 = 0;
                    j3 = 0;
                    while (i7 < sampleCount) {
                        while (i9 == 0) {
                            Assertions.checkState(chunkIterator.moveNext());
                            long j4 = chunkIterator.offset;
                            i9 = chunkIterator.numSamples;
                            j3 = j4;
                            sampleCount = sampleCount;
                        }
                        int i11 = sampleCount;
                        if (parsableByteArray != null) {
                            while (unsignedIntToInt4 == 0 && unsignedIntToInt > 0) {
                                unsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                                i8 = parsableByteArray.readInt();
                                unsignedIntToInt--;
                            }
                            unsignedIntToInt4--;
                        }
                        jArr6[i7] = j3;
                        nextSampleSize = sampleSizeBox.readNextSampleSize();
                        iArr4[i7] = nextSampleSize;
                        if (nextSampleSize > i5) {
                            i5 = nextSampleSize;
                        }
                        jArr7[i7] = j2 + ((long) i8);
                        if (parsableByteArray5 == null) {
                            i10 = 1;
                        } else {
                            i10 = i;
                        }
                        iArr5[i7] = i10;
                        if (i7 == unsignedIntToInt3) {
                            iArr5[i7] = 1;
                            unsignedIntToInt2--;
                            if (unsignedIntToInt2 > 0) {
                                unsignedIntToInt3 = parsableByteArray5.readUnsignedIntToInt() - 1;
                            }
                        }
                        j2 += (long) unsignedIntToInt7;
                        unsignedIntToInt6--;
                        if (unsignedIntToInt6 != 0 && unsignedIntToInt5 > 0) {
                            unsignedIntToInt5--;
                            unsignedIntToInt6 = parsableByteArray4.readUnsignedIntToInt();
                            unsignedIntToInt7 = parsableByteArray4.readInt();
                        }
                        j3 += (long) iArr4[i7];
                        i9--;
                        i7++;
                        sampleCount = i11;
                    }
                    i3 = sampleCount;
                    long j5 = j2 + ((long) i8);
                    if (unsignedIntToInt4 == 0) {
                        z2 = 1;
                    } else {
                        z2 = i;
                    }
                    Assertions.checkArgument(z2);
                    while (unsignedIntToInt > 0) {
                        if (parsableByteArray.readUnsignedIntToInt() == 0) {
                            z3 = 1;
                        } else {
                            z3 = i;
                        }
                        Assertions.checkArgument(z3);
                        parsableByteArray.readInt();
                        unsignedIntToInt--;
                    }
                    if (unsignedIntToInt2 == 0 || unsignedIntToInt6 != 0 || i9 != 0 || unsignedIntToInt5 != 0) {
                        Log.w(TAG, "Inconsistent stbl box for track " + track.f37400id + ": remainingSynchronizationSamples " + unsignedIntToInt2 + ", remainingSamplesAtTimestampDelta " + unsignedIntToInt6 + ", remainingSamplesInChunk " + i9 + ", remainingTimestampDeltaChanges " + unsignedIntToInt5);
                    }
                    iArr2 = iArr5;
                    jArr2 = jArr7;
                    jArr3 = jArr6;
                    iArr3 = iArr4;
                    j = j5;
                } else {
                    i3 = sampleCount;
                    i4 = 1;
                    int i12 = chunkIterator.length;
                    jArr = new long[i12];
                    iArr = new int[i12];
                    while (chunkIterator.moveNext()) {
                        int i13 = chunkIterator.index;
                        jArr[i13] = chunkIterator.offset;
                        iArr[i13] = chunkIterator.numSamples;
                    }
                    Format format = track.format;
                    FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format.pcmEncoding, format.channelCount), jArr, iArr, unsignedIntToInt7);
                    long[] jArr8 = resultsRechunk.offsets;
                    int[] iArr6 = resultsRechunk.sizes;
                    i5 = resultsRechunk.maximumSize;
                    long[] jArr9 = resultsRechunk.timestamps;
                    int[] iArr7 = resultsRechunk.flags;
                    long j6 = resultsRechunk.duration;
                    jArr2 = jArr9;
                    iArr2 = iArr7;
                    jArr3 = jArr8;
                    iArr3 = iArr6;
                    j = j6;
                }
                i6 = i5;
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track.timescale);
                if (track.editListDurations != null || gaplessInfoHolder.hasGaplessInfo()) {
                    long[] jArr10 = jArr2;
                    Util.scaleLargeTimestampsInPlace(jArr10, 1000000L, track.timescale);
                    return new TrackSampleTable(track, jArr3, iArr3, i6, jArr10, iArr2, jScaleLargeTimestamp);
                }
                long[] jArr11 = track.editListDurations;
                int i14 = i4;
                if (jArr11.length == i14 && track.type == i14 && jArr2.length >= 2) {
                    long j7 = track.editListMediaTimes[i];
                    long jScaleLargeTimestamp2 = j7 + Util.scaleLargeTimestamp(jArr11[i], track.timescale, track.movieTimescale);
                    long j8 = j;
                    long[] jArr12 = jArr2;
                    boolean zCanApplyEditWithGaplessInfo = canApplyEditWithGaplessInfo(jArr12, j8, j7, jScaleLargeTimestamp2);
                    j = j8;
                    if (zCanApplyEditWithGaplessInfo) {
                        long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j7 - jArr12[i], track.format.sampleRate, track.timescale);
                        long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - jScaleLargeTimestamp2, track.format.sampleRate, track.timescale);
                        if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                            gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                            gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                            Util.scaleLargeTimestampsInPlace(jArr12, 1000000L, track.timescale);
                            return new TrackSampleTable(track, jArr3, iArr3, i6, jArr12, iArr2, jScaleLargeTimestamp);
                        }
                    }
                    jArr4 = jArr12;
                    track2 = track;
                } else {
                    track2 = track;
                    jArr4 = jArr2;
                }
                long[] jArr13 = track2.editListDurations;
                if (jArr13.length == 1 && jArr13[i] == 0) {
                    long j9 = track2.editListMediaTimes[i];
                    for (int i15 = i; i15 < jArr4.length; i15++) {
                        jArr4[i15] = Util.scaleLargeTimestamp(jArr4[i15] - j9, 1000000L, track2.timescale);
                    }
                    return new TrackSampleTable(track2, jArr3, iArr3, i6, jArr4, iArr2, Util.scaleLargeTimestamp(j - j9, 1000000L, track2.timescale));
                }
                boolean z4 = track2.type == 1 ? 1 : i;
                int i16 = i;
                int i17 = i16;
                int i18 = i17;
                int i19 = i18;
                while (true) {
                    long[] jArr14 = track2.editListDurations;
                    if (i16 >= jArr14.length) {
                        break;
                    }
                    long j10 = track2.editListMediaTimes[i16];
                    if (j10 != -1) {
                        int i20 = i19;
                        long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(jArr14[i16], track2.timescale, track2.movieTimescale);
                        int iBinarySearchCeil = Util.binarySearchCeil(jArr4, j10, true, true);
                        int iBinarySearchCeil2 = Util.binarySearchCeil(jArr4, j10 + jScaleLargeTimestamp5, z4, (boolean) i);
                        i17 += iBinarySearchCeil2 - iBinarySearchCeil;
                        int i21 = i18 != iBinarySearchCeil ? 1 : 0;
                        i18 = iBinarySearchCeil2;
                        i19 = i21 | i20;
                    }
                    i16++;
                    i6 = i6;
                    i = 0;
                }
                int i22 = i6;
                int i23 = (i17 != i3 ? 1 : 0) | i19;
                long[] jArr15 = i23 != 0 ? new long[i17] : jArr3;
                int[] iArr8 = i23 != 0 ? new int[i17] : iArr3;
                if (i23 != 0) {
                    i22 = 0;
                }
                int[] iArr9 = i23 != 0 ? new int[i17] : iArr2;
                long[] jArr16 = new long[i17];
                int i24 = i22;
                int i25 = 0;
                int i26 = 0;
                long j11 = 0;
                while (true) {
                    long[] jArr17 = track2.editListDurations;
                    int i27 = i23;
                    if (i25 >= jArr17.length) {
                        return new TrackSampleTable(track2, jArr15, iArr8, i24, jArr16, iArr9, Util.scaleLargeTimestamp(j11, 1000000L, track2.timescale));
                    }
                    int i28 = i24;
                    long j12 = track2.editListMediaTimes[i25];
                    long j13 = jArr17[i25];
                    if (j12 != -1) {
                        String str2 = str;
                        long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j13, track2.timescale, track2.movieTimescale) + j12;
                        jArr5 = jArr16;
                        int iBinarySearchCeil3 = Util.binarySearchCeil(jArr4, j12, true, true);
                        int iBinarySearchCeil4 = Util.binarySearchCeil(jArr4, jScaleLargeTimestamp6, z4, false);
                        if (i27 != 0) {
                            int i29 = iBinarySearchCeil4 - iBinarySearchCeil3;
                            System.arraycopy(jArr3, iBinarySearchCeil3, jArr15, i26, i29);
                            System.arraycopy(iArr3, iBinarySearchCeil3, iArr8, i26, i29);
                            System.arraycopy(iArr2, iBinarySearchCeil3, iArr9, i26, i29);
                        }
                        if (iBinarySearchCeil3 < iBinarySearchCeil4 && (iArr9[i26] & 1) == 0) {
                            Log.w(str2, "Ignoring edit list: edit does not start with a sync sample.");
                            throw new UnhandledEditListException();
                        }
                        str = str2;
                        int i30 = i28;
                        while (iBinarySearchCeil3 < iBinarySearchCeil4) {
                            long[] jArr18 = jArr3;
                            int[] iArr10 = iArr3;
                            jArr5[i26] = Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(jArr4[iBinarySearchCeil3] - j12, 1000000L, track2.timescale);
                            if (i27 != 0 && iArr8[i26] > i30) {
                                i30 = iArr10[iBinarySearchCeil3];
                            }
                            i26++;
                            iBinarySearchCeil3++;
                            jArr3 = jArr18;
                            iArr3 = iArr10;
                        }
                        i24 = i30;
                    } else {
                        jArr5 = jArr16;
                        i24 = i28;
                    }
                    j11 += j13;
                    i25++;
                    i23 = i27;
                    jArr16 = jArr5;
                    jArr3 = jArr3;
                    iArr3 = iArr3;
                }
            } else {
                i = 0;
            }
            i2 = i;
            String str3 = TAG;
            if (i2 == 0) {
                jArr6 = new long[sampleCount];
                i4 = 1;
                iArr4 = new int[sampleCount];
                parsableByteArray = parsableByteArray7;
                jArr7 = new long[sampleCount];
                iArr5 = new int[sampleCount];
                unsignedIntToInt3 = unsignedIntToInt8;
                sampleSizeBox = stz2SampleSizeBox;
                i7 = i;
                i8 = i7;
                i9 = i8;
                i5 = i9;
                unsignedIntToInt4 = i5;
                j2 = 0;
                j3 = 0;
                while (i7 < sampleCount) {
                    while (i9 == 0) {
                        Assertions.checkState(chunkIterator.moveNext());
                        long j14 = chunkIterator.offset;
                        i9 = chunkIterator.numSamples;
                        j3 = j14;
                        sampleCount = sampleCount;
                    }
                    int i110 = sampleCount;
                    if (parsableByteArray != null) {
                        while (unsignedIntToInt4 == 0) {
                            unsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                            i8 = parsableByteArray.readInt();
                            unsignedIntToInt--;
                        }
                        unsignedIntToInt4--;
                    }
                    jArr6[i7] = j3;
                    nextSampleSize = sampleSizeBox.readNextSampleSize();
                    iArr4[i7] = nextSampleSize;
                    if (nextSampleSize > i5) {
                        i5 = nextSampleSize;
                    }
                    jArr7[i7] = j2 + ((long) i8);
                    if (parsableByteArray5 == null) {
                        i10 = 1;
                    } else {
                        i10 = i;
                    }
                    iArr5[i7] = i10;
                    if (i7 == unsignedIntToInt3) {
                        iArr5[i7] = 1;
                        unsignedIntToInt2--;
                        if (unsignedIntToInt2 > 0) {
                            unsignedIntToInt3 = parsableByteArray5.readUnsignedIntToInt() - 1;
                        }
                    }
                    j2 += (long) unsignedIntToInt7;
                    unsignedIntToInt6--;
                    if (unsignedIntToInt6 != 0) {
                    }
                    j3 += (long) iArr4[i7];
                    i9--;
                    i7++;
                    sampleCount = i110;
                }
                i3 = sampleCount;
                long j15 = j2 + ((long) i8);
                if (unsignedIntToInt4 == 0) {
                    z2 = 1;
                } else {
                    z2 = i;
                }
                Assertions.checkArgument(z2);
                while (unsignedIntToInt > 0) {
                    if (parsableByteArray.readUnsignedIntToInt() == 0) {
                        z3 = 1;
                    } else {
                        z3 = i;
                    }
                    Assertions.checkArgument(z3);
                    parsableByteArray.readInt();
                    unsignedIntToInt--;
                }
                if (unsignedIntToInt2 == 0) {
                    Log.w(TAG, "Inconsistent stbl box for track " + track.f37400id + ": remainingSynchronizationSamples " + unsignedIntToInt2 + ", remainingSamplesAtTimestampDelta " + unsignedIntToInt6 + ", remainingSamplesInChunk " + i9 + ", remainingTimestampDeltaChanges " + unsignedIntToInt5);
                } else {
                    Log.w(TAG, "Inconsistent stbl box for track " + track.f37400id + ": remainingSynchronizationSamples " + unsignedIntToInt2 + ", remainingSamplesAtTimestampDelta " + unsignedIntToInt6 + ", remainingSamplesInChunk " + i9 + ", remainingTimestampDeltaChanges " + unsignedIntToInt5);
                }
                iArr2 = iArr5;
                jArr2 = jArr7;
                jArr3 = jArr6;
                iArr3 = iArr4;
                j = j15;
            } else {
                i3 = sampleCount;
                i4 = 1;
                int i111 = chunkIterator.length;
                jArr = new long[i111];
                iArr = new int[i111];
                while (chunkIterator.moveNext()) {
                    int i112 = chunkIterator.index;
                    jArr[i112] = chunkIterator.offset;
                    iArr[i112] = chunkIterator.numSamples;
                }
                Format format2 = track.format;
                FixedSampleSizeRechunker.Results resultsRechunk2 = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format2.pcmEncoding, format2.channelCount), jArr, iArr, unsignedIntToInt7);
                long[] jArr19 = resultsRechunk2.offsets;
                int[] iArr11 = resultsRechunk2.sizes;
                i5 = resultsRechunk2.maximumSize;
                long[] jArr20 = resultsRechunk2.timestamps;
                int[] iArr12 = resultsRechunk2.flags;
                long j16 = resultsRechunk2.duration;
                jArr2 = jArr20;
                iArr2 = iArr12;
                jArr3 = jArr19;
                iArr3 = iArr11;
                j = j16;
            }
            i6 = i5;
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track.timescale);
            if (track.editListDurations != null) {
            }
            long[] jArr110 = jArr2;
            Util.scaleLargeTimestampsInPlace(jArr110, 1000000L, track.timescale);
            return new TrackSampleTable(track, jArr3, iArr3, i6, jArr110, iArr2, jScaleLargeTimestamp);
        }
        unsignedIntToInt2 = 0;
        parsableByteArray5 = parsableByteArray6;
        if (stz2SampleSizeBox.isFixedSampleSize()) {
            i = 0;
            if (!"audio/raw".equals(track.format.sampleMimeType)) {
            }
            String str4 = TAG;
            if (i2 == 0) {
                jArr6 = new long[sampleCount];
                i4 = 1;
                iArr4 = new int[sampleCount];
                parsableByteArray = parsableByteArray7;
                jArr7 = new long[sampleCount];
                iArr5 = new int[sampleCount];
                unsignedIntToInt3 = unsignedIntToInt8;
                sampleSizeBox = stz2SampleSizeBox;
                i7 = i;
                i8 = i7;
                i9 = i8;
                i5 = i9;
                unsignedIntToInt4 = i5;
                j2 = 0;
                j3 = 0;
                while (i7 < sampleCount) {
                    while (i9 == 0) {
                        Assertions.checkState(chunkIterator.moveNext());
                        long j17 = chunkIterator.offset;
                        i9 = chunkIterator.numSamples;
                        j3 = j17;
                        sampleCount = sampleCount;
                    }
                    int i113 = sampleCount;
                    if (parsableByteArray != null) {
                        while (unsignedIntToInt4 == 0) {
                            unsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                            i8 = parsableByteArray.readInt();
                            unsignedIntToInt--;
                        }
                        unsignedIntToInt4--;
                    }
                    jArr6[i7] = j3;
                    nextSampleSize = sampleSizeBox.readNextSampleSize();
                    iArr4[i7] = nextSampleSize;
                    if (nextSampleSize > i5) {
                        i5 = nextSampleSize;
                    }
                    jArr7[i7] = j2 + ((long) i8);
                    if (parsableByteArray5 == null) {
                        i10 = 1;
                    } else {
                        i10 = i;
                    }
                    iArr5[i7] = i10;
                    if (i7 == unsignedIntToInt3) {
                        iArr5[i7] = 1;
                        unsignedIntToInt2--;
                        if (unsignedIntToInt2 > 0) {
                            unsignedIntToInt3 = parsableByteArray5.readUnsignedIntToInt() - 1;
                        }
                    }
                    j2 += (long) unsignedIntToInt7;
                    unsignedIntToInt6--;
                    if (unsignedIntToInt6 != 0) {
                    }
                    j3 += (long) iArr4[i7];
                    i9--;
                    i7++;
                    sampleCount = i113;
                }
                i3 = sampleCount;
                long j18 = j2 + ((long) i8);
                if (unsignedIntToInt4 == 0) {
                    z2 = 1;
                } else {
                    z2 = i;
                }
                Assertions.checkArgument(z2);
                while (unsignedIntToInt > 0) {
                    if (parsableByteArray.readUnsignedIntToInt() == 0) {
                        z3 = 1;
                    } else {
                        z3 = i;
                    }
                    Assertions.checkArgument(z3);
                    parsableByteArray.readInt();
                    unsignedIntToInt--;
                }
                if (unsignedIntToInt2 == 0) {
                    Log.w(TAG, "Inconsistent stbl box for track " + track.f37400id + ": remainingSynchronizationSamples " + unsignedIntToInt2 + ", remainingSamplesAtTimestampDelta " + unsignedIntToInt6 + ", remainingSamplesInChunk " + i9 + ", remainingTimestampDeltaChanges " + unsignedIntToInt5);
                } else {
                    Log.w(TAG, "Inconsistent stbl box for track " + track.f37400id + ": remainingSynchronizationSamples " + unsignedIntToInt2 + ", remainingSamplesAtTimestampDelta " + unsignedIntToInt6 + ", remainingSamplesInChunk " + i9 + ", remainingTimestampDeltaChanges " + unsignedIntToInt5);
                }
                iArr2 = iArr5;
                jArr2 = jArr7;
                jArr3 = jArr6;
                iArr3 = iArr4;
                j = j18;
            } else {
                i3 = sampleCount;
                i4 = 1;
                int i114 = chunkIterator.length;
                jArr = new long[i114];
                iArr = new int[i114];
                while (chunkIterator.moveNext()) {
                    int i115 = chunkIterator.index;
                    jArr[i115] = chunkIterator.offset;
                    iArr[i115] = chunkIterator.numSamples;
                }
                Format format3 = track.format;
                FixedSampleSizeRechunker.Results resultsRechunk3 = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format3.pcmEncoding, format3.channelCount), jArr, iArr, unsignedIntToInt7);
                long[] jArr111 = resultsRechunk3.offsets;
                int[] iArr13 = resultsRechunk3.sizes;
                i5 = resultsRechunk3.maximumSize;
                long[] jArr21 = resultsRechunk3.timestamps;
                int[] iArr14 = resultsRechunk3.flags;
                long j19 = resultsRechunk3.duration;
                jArr2 = jArr21;
                iArr2 = iArr14;
                jArr3 = jArr111;
                iArr3 = iArr13;
                j = j19;
            }
            i6 = i5;
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track.timescale);
            if (track.editListDurations != null) {
            }
            long[] jArr112 = jArr2;
            Util.scaleLargeTimestampsInPlace(jArr112, 1000000L, track.timescale);
            return new TrackSampleTable(track, jArr3, iArr3, i6, jArr112, iArr2, jScaleLargeTimestamp);
        }
        i = 0;
        i2 = i;
        String str5 = TAG;
        if (i2 == 0) {
            jArr6 = new long[sampleCount];
            i4 = 1;
            iArr4 = new int[sampleCount];
            parsableByteArray = parsableByteArray7;
            jArr7 = new long[sampleCount];
            iArr5 = new int[sampleCount];
            unsignedIntToInt3 = unsignedIntToInt8;
            sampleSizeBox = stz2SampleSizeBox;
            i7 = i;
            i8 = i7;
            i9 = i8;
            i5 = i9;
            unsignedIntToInt4 = i5;
            j2 = 0;
            j3 = 0;
            while (i7 < sampleCount) {
                while (i9 == 0) {
                    Assertions.checkState(chunkIterator.moveNext());
                    long j110 = chunkIterator.offset;
                    i9 = chunkIterator.numSamples;
                    j3 = j110;
                    sampleCount = sampleCount;
                }
                int i116 = sampleCount;
                if (parsableByteArray != null) {
                    while (unsignedIntToInt4 == 0) {
                        unsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                        i8 = parsableByteArray.readInt();
                        unsignedIntToInt--;
                    }
                    unsignedIntToInt4--;
                }
                jArr6[i7] = j3;
                nextSampleSize = sampleSizeBox.readNextSampleSize();
                iArr4[i7] = nextSampleSize;
                if (nextSampleSize > i5) {
                    i5 = nextSampleSize;
                }
                jArr7[i7] = j2 + ((long) i8);
                if (parsableByteArray5 == null) {
                    i10 = 1;
                } else {
                    i10 = i;
                }
                iArr5[i7] = i10;
                if (i7 == unsignedIntToInt3) {
                    iArr5[i7] = 1;
                    unsignedIntToInt2--;
                    if (unsignedIntToInt2 > 0) {
                        unsignedIntToInt3 = parsableByteArray5.readUnsignedIntToInt() - 1;
                    }
                }
                j2 += (long) unsignedIntToInt7;
                unsignedIntToInt6--;
                if (unsignedIntToInt6 != 0) {
                }
                j3 += (long) iArr4[i7];
                i9--;
                i7++;
                sampleCount = i116;
            }
            i3 = sampleCount;
            long j111 = j2 + ((long) i8);
            if (unsignedIntToInt4 == 0) {
                z2 = 1;
            } else {
                z2 = i;
            }
            Assertions.checkArgument(z2);
            while (unsignedIntToInt > 0) {
                if (parsableByteArray.readUnsignedIntToInt() == 0) {
                    z3 = 1;
                } else {
                    z3 = i;
                }
                Assertions.checkArgument(z3);
                parsableByteArray.readInt();
                unsignedIntToInt--;
            }
            if (unsignedIntToInt2 == 0) {
                Log.w(TAG, "Inconsistent stbl box for track " + track.f37400id + ": remainingSynchronizationSamples " + unsignedIntToInt2 + ", remainingSamplesAtTimestampDelta " + unsignedIntToInt6 + ", remainingSamplesInChunk " + i9 + ", remainingTimestampDeltaChanges " + unsignedIntToInt5);
            } else {
                Log.w(TAG, "Inconsistent stbl box for track " + track.f37400id + ": remainingSynchronizationSamples " + unsignedIntToInt2 + ", remainingSamplesAtTimestampDelta " + unsignedIntToInt6 + ", remainingSamplesInChunk " + i9 + ", remainingTimestampDeltaChanges " + unsignedIntToInt5);
            }
            iArr2 = iArr5;
            jArr2 = jArr7;
            jArr3 = jArr6;
            iArr3 = iArr4;
            j = j111;
        } else {
            i3 = sampleCount;
            i4 = 1;
            int i117 = chunkIterator.length;
            jArr = new long[i117];
            iArr = new int[i117];
            while (chunkIterator.moveNext()) {
                int i118 = chunkIterator.index;
                jArr[i118] = chunkIterator.offset;
                iArr[i118] = chunkIterator.numSamples;
            }
            Format format4 = track.format;
            FixedSampleSizeRechunker.Results resultsRechunk4 = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format4.pcmEncoding, format4.channelCount), jArr, iArr, unsignedIntToInt7);
            long[] jArr113 = resultsRechunk4.offsets;
            int[] iArr15 = resultsRechunk4.sizes;
            i5 = resultsRechunk4.maximumSize;
            long[] jArr22 = resultsRechunk4.timestamps;
            int[] iArr16 = resultsRechunk4.flags;
            long j112 = resultsRechunk4.duration;
            jArr2 = jArr22;
            iArr2 = iArr16;
            jArr3 = jArr113;
            iArr3 = iArr15;
            j = j112;
        }
        i6 = i5;
        jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track.timescale);
        if (track.editListDurations != null) {
        }
        long[] jArr114 = jArr2;
        Util.scaleLargeTimestampsInPlace(jArr114, 1000000L, track.timescale);
        return new TrackSampleTable(track, jArr3, iArr3, i6, jArr114, iArr2, jScaleLargeTimestamp);
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int i3 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i3);
        int i4 = 0;
        while (i4 < i3) {
            int position = parsableByteArray.getPosition();
            int i5 = parsableByteArray.readInt();
            Assertions.checkArgument(i5 > 0, "childAtomSize should be positive");
            int i6 = parsableByteArray.readInt();
            if (i6 == Atom.TYPE_avc1 || i6 == Atom.TYPE_avc3 || i6 == Atom.TYPE_encv || i6 == Atom.TYPE_mp4v || i6 == Atom.TYPE_hvc1 || i6 == Atom.TYPE_hev1 || i6 == Atom.TYPE_s263 || i6 == Atom.TYPE_vp08 || i6 == Atom.TYPE_vp09) {
                StsdData stsdData2 = stsdData;
                int i7 = i4;
                parseVideoSampleEntry(parsableByteArray, i6, position, i5, i, i2, drmInitData, stsdData2, i7);
                stsdData = stsdData2;
                i4 = i7;
            } else if (i6 == Atom.TYPE_mp4a || i6 == Atom.TYPE_enca || i6 == Atom.TYPE_ac_3 || i6 == Atom.TYPE_ec_3 || i6 == Atom.TYPE_dtsc || i6 == Atom.TYPE_dtse || i6 == Atom.TYPE_dtsh || i6 == Atom.TYPE_dtsl || i6 == Atom.TYPE_samr || i6 == Atom.TYPE_sawb || i6 == Atom.TYPE_lpcm || i6 == Atom.TYPE_sowt || i6 == Atom.TYPE__mp3 || i6 == Atom.TYPE_alac) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, i6, position, i5, i, str, z, drmInitData, stsdData3, i4);
                stsdData = stsdData3;
            } else if (i6 == Atom.TYPE_TTML || i6 == Atom.TYPE_tx3g || i6 == Atom.TYPE_wvtt || i6 == Atom.TYPE_stpp || i6 == Atom.TYPE_c608) {
                parseTextSampleEntry(parsableByteArray, i6, position, i5, i, str, stsdData);
            } else if (i6 == Atom.TYPE_camm) {
                stsdData.format = Format.createSampleFormat(Integer.toString(i), "application/x-camera-motion", null, -1, null);
            }
            parsableByteArray.setPosition(position + i5);
            i4++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) throws ParserException {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i != Atom.TYPE_TTML) {
            if (i == Atom.TYPE_tx3g) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                listSingletonList = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == Atom.TYPE_wvtt) {
                str2 = "application/x-mp4-vtt";
            } else if (i == Atom.TYPE_stpp) {
                j = 0;
            } else {
                if (i != Atom.TYPE_c608) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        stsdData.format = Format.createTextSampleFormat(Integer.toString(i4), str2, null, -1, 0, str, -1, null, j, listSingletonList);
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i2 = fullAtomVersion == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i4 >= i2) {
                parsableByteArray.skipBytes(i2);
                break;
            }
            if (parsableByteArray.data[position + i4] != -1) {
                long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt == 0) {
                    break;
                }
                j = unsignedInt;
                break;
            }
            i4++;
        }
        parsableByteArray.skipBytes(16);
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i7 = parsableByteArray.readInt();
        int i8 = parsableByteArray.readInt();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new TkhdData(i, j, i3);
    }

    public static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mdia);
        int hdlr = parseHdlr(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_hdlr).data);
        if (hdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
        long j2 = j == -9223372036854775807L ? tkhd.duration : j;
        long mvhd = parseMvhd(leafAtom.data);
        long jScaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, mvhd) : -9223372036854775807L;
        Atom.ContainerAtom containerAtomOfType2 = containerAtomOfType.getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
        Pair<Long, String> mdhd = parseMdhd(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_mdhd).data);
        StsdData stsd = parseStsd(containerAtomOfType2.getLeafAtomOfType(Atom.TYPE_stsd).data, tkhd.f37399id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> edts = parseEdts(containerAtom.getContainerAtomOfType(Atom.TYPE_edts));
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.f37399id, hdlr, ((Long) mdhd.first).longValue(), mvhd, jScaleLargeTimestamp, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom, boolean z) {
        if (z) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_meta) {
                parsableByteArray.setPosition(position);
                return parseMetaAtom(parsableByteArray, position + i);
            }
            parsableByteArray.skipBytes(i - 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0142 A[PHI: r13
  0x0142: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:74:0x0137, B:76:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        String str;
        List<byte[]> list;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i2 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        String str2 = null;
        int iIntValue = i;
        if (iIntValue == Atom.TYPE_encv) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i2, i3);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i6] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData2 = drmInitDataCopyWithSchemeType;
        float paspFromParent = 1.0f;
        List<byte[]> listSingletonList = null;
        byte[] projFromParent = null;
        int i7 = -1;
        boolean z = false;
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i8 = parsableByteArray.readInt();
            if (i8 == 0 && parsableByteArray.getPosition() - i2 == i3) {
                break;
            }
            int i9 = 1;
            Assertions.checkArgument(i8 > 0, "childAtomSize should be positive");
            int i10 = parsableByteArray.readInt();
            if (i10 == Atom.TYPE_avcC) {
                Assertions.checkState(str2 == null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                list = avcConfig.initializationData;
                stsdData.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthAspectRatio;
                }
                str = "video/avc";
            } else {
                if (i10 == Atom.TYPE_hvcC) {
                    Assertions.checkState(str2 == null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    list = hevcConfig.initializationData;
                    stsdData.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str = "video/hevc";
                } else {
                    if (i10 == Atom.TYPE_vpcC) {
                        Assertions.checkState(str2 == null);
                        str = iIntValue == Atom.TYPE_vp08 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (i10 == Atom.TYPE_d263) {
                        Assertions.checkState(str2 == null);
                        str = "video/3gpp";
                    } else if (i10 == Atom.TYPE_esds) {
                        Assertions.checkState(str2 == null);
                        Pair<String, byte[]> esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                        str2 = (String) esdsFromParent.first;
                        listSingletonList = Collections.singletonList((byte[]) esdsFromParent.second);
                    } else if (i10 == Atom.TYPE_pasp) {
                        paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                        z = true;
                    } else if (i10 == Atom.TYPE_sv3d) {
                        projFromParent = parseProjFromParent(parsableByteArray, position2, i8);
                    } else if (i10 == Atom.TYPE_st3d) {
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(3);
                        if (unsignedByte == 0) {
                            int unsignedByte2 = parsableByteArray.readUnsignedByte();
                            if (unsignedByte2 == 0) {
                                i7 = 0;
                            } else if (unsignedByte2 != 1) {
                                i9 = 2;
                                if (unsignedByte2 == 2) {
                                    i7 = i9;
                                } else if (unsignedByte2 == 3) {
                                    i7 = 3;
                                }
                            } else {
                                i7 = i9;
                            }
                        }
                    }
                    str2 = str;
                }
                position += i8;
            }
            listSingletonList = list;
            str2 = str;
            position += i8;
        }
        if (str2 == null) {
            return;
        }
        stsdData.format = Format.createVideoSampleFormat(Integer.toString(i4), str2, null, -1, -1, unsignedShort, unsignedShort2, -1.0f, listSingletonList, i5, paspFromParent, projFromParent, i7, null, drmInitData2);
    }
}
