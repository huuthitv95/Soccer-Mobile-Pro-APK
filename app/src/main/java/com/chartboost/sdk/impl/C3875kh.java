package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.kh */
/* JADX INFO: loaded from: classes3.dex */
public final class C3875kh {
    /* JADX INFO: renamed from: a */
    public final File m18429a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str + ".tmp");
    }

    /* JADX INFO: renamed from: a */
    public final RandomAccessFile m18430a(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18431b(File file, String str) {
        if (file != null && str != null) {
            try {
                File fileM18429a = m18429a(file, str);
                if (fileM18429a != null) {
                    return fileM18429a.exists();
                }
                return false;
            } catch (Exception e) {
                C4048sb.m19408a(e.toString(), (Throwable) null, 2, (Object) null);
            }
        }
        return false;
    }
}
