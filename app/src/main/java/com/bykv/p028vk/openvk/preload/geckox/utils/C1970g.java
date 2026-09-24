package com.bykv.p028vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.utils.g */
/* JADX INFO: compiled from: ResVersionUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1970g {
    /* JADX INFO: renamed from: a */
    public static Long m6084a(File file) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        Long l = null;
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    Long lValueOf = Long.valueOf(file2.getName());
                    long jLongValue = lValueOf.longValue();
                    if (l == null || jLongValue > l.longValue()) {
                        l = lValueOf;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l;
    }

    /* JADX INFO: renamed from: b */
    public static List<Long> m6085b(File file) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.2
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            try {
                Long lValueOf = Long.valueOf(file2.getName());
                lValueOf.longValue();
                arrayList.add(lValueOf);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
