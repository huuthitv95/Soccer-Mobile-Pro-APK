package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2713bu {
    /* JADX INFO: renamed from: ri */
    public static long m10212ri() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
