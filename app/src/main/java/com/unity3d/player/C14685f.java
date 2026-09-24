package com.unity3d.player;

import android.util.Log;

/* JADX INFO: renamed from: com.unity3d.player.f */
/* JADX INFO: loaded from: classes7.dex */
final class C14685f {

    /* JADX INFO: renamed from: a */
    protected static boolean f41715a;

    protected static void Log(int i, String str) {
        if (f41715a) {
            return;
        }
        if (i == 6) {
            Log.e("Unity", str);
        }
        if (i == 5) {
            Log.w("Unity", str);
        }
    }
}
