package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.eo */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10071eo {

    /* JADX INFO: renamed from: a */
    private static final Pattern f22375a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* JADX INFO: renamed from: a */
    static List m22694a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.en
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                return C10071eo.f22375a.matcher(str).matches();
            }
        });
        if (fileArrListFiles != null) {
            File[] fileArr2 = new File[fileArrListFiles.length];
            int i = 0;
            while (true) {
                int length = fileArrListFiles.length;
                if (i >= length) {
                    fileArr = fileArr2;
                    break;
                }
                File file3 = fileArrListFiles[i];
                int i2 = Integer.parseInt(file3.getName().split("-")[0]);
                if (i2 > length || fileArr2[i2] != null) {
                    throw new C10013ck("Metadata folder ordering corrupt.");
                }
                fileArr2[i2] = file3;
                i++;
            }
        } else {
            fileArr = new File[0];
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    AbstractC10075es abstractC10075esM22606b = new C9998bw(fileInputStream).m22606b();
                    if (abstractC10075esM22606b.mo22593c() == null) {
                        throw new C10013ck("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, abstractC10075esM22606b.mo22593c());
                    if (!file5.exists()) {
                        throw new C10013ck(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
