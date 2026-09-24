package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.AbstractC10094an;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bk */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9986bk extends AbstractC10094an {

    /* JADX INFO: renamed from: a */
    private final File f22074a;

    /* JADX INFO: renamed from: b */
    private final File f22075b;

    /* JADX INFO: renamed from: c */
    private final NavigableMap f22076c = new TreeMap();

    C9986bk(File file, File file2) throws IOException {
        this.f22074a = file;
        this.f22075b = file2;
        List<File> listM22694a = C10071eo.m22694a(file, file2);
        if (listM22694a.isEmpty()) {
            throw new C10013ck(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : listM22694a) {
            this.f22076c.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    /* JADX INFO: renamed from: d */
    private final InputStream m22583d(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f22076c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C10013ck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC10094an
    /* JADX INFO: renamed from: a */
    public final long mo22584a() {
        Map.Entry entryLastEntry = this.f22076c.lastEntry();
        return ((Long) entryLastEntry.getKey()).longValue() + ((File) entryLastEntry.getValue()).length();
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC10094an
    /* JADX INFO: renamed from: b */
    protected final InputStream mo22585b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C10013ck(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 > mo22584a()) {
            throw new C10013ck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo22584a()), Long.valueOf(j3)));
        }
        Long l = (Long) this.f22076c.floorKey(Long.valueOf(j));
        Long l2 = (Long) this.f22076c.floorKey(Long.valueOf(j3));
        if (l.equals(l2)) {
            return new C9985bj(m22583d(j, l), j2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m22583d(j, l));
        Collection collectionValues = this.f22076c.subMap(l, false, l2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new C10047dr(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new C9985bj(new FileInputStream((File) this.f22076c.get(l2)), j2 - (l2.longValue() - j)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
