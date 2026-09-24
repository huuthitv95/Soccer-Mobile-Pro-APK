package com.mbridge.msdk.config.component.load.downloader.utils;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.utils.b */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class C12819b {
    /* JADX INFO: renamed from: a */
    public static int m35510a(long j, long j2) {
        if (j == 0 || j2 == 0) {
            return 0;
        }
        if (j == j2) {
            return 100;
        }
        return (int) (((j2 * 1.0d) / (j * 1.0d)) * 100.0d);
    }
}
