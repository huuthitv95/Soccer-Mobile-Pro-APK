package com.mbridge.msdk.dycreator.utils;

import android.util.Log;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.utils.g */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12984g {

    /* JADX INFO: renamed from: a */
    public static boolean f35380a = false;

    /* JADX INFO: renamed from: a */
    public static void m36420a(String str) {
        if (f35380a) {
            new SecurityManager();
            Log.e(new Throwable().getStackTrace()[1].getFileName(), str);
        }
    }
}
