package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: com.pgl.ssdk.x */
/* JADX INFO: loaded from: classes7.dex */
public class C14294x {

    /* JADX INFO: renamed from: a */
    public static int f41355a = -1;

    /* JADX INFO: renamed from: com.pgl.ssdk.x$a */
    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C14294x.f41355a = C14294x.m43138b(C14296z.m43153a());
            SharedPreferences sharedPreferencesM43024a = C14266ax.m43024a(C14296z.m43153a());
            if (sharedPreferencesM43024a != null) {
                sharedPreferencesM43024a.edit().putInt("camera_count", C14294x.f41355a).apply();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m43136a() {
        int i;
        int i2 = f41355a;
        if (i2 != -1) {
            return i2;
        }
        SharedPreferences sharedPreferencesM43024a = C14266ax.m43024a(C14296z.m43153a());
        if (sharedPreferencesM43024a == null || (i = sharedPreferencesM43024a.getInt("camera_count", -1)) == -1) {
            C14260ar.m42995b(new a());
            return -1;
        }
        f41355a = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m43138b(Context context) {
        int i = f41355a;
        if (i != -1) {
            return i;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f41355a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f41355a = -1;
            }
        } else {
            f41355a = -2;
        }
        return f41355a;
    }
}
