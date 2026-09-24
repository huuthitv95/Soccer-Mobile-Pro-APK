package com.bytedance.sdk.openadsdk.p266uq;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3541fi {

    /* JADX INFO: renamed from: co */
    public static int f12920co = 32;

    /* JADX INFO: renamed from: di */
    public static int f12921di = 0;

    /* JADX INFO: renamed from: fi */
    protected static long f12922fi = 15360;

    /* JADX INFO: renamed from: ik */
    protected static int f12923ik = 1;
    public static int jbs = 4;

    /* JADX INFO: renamed from: ka */
    protected static int f12924ka = 30;

    /* JADX INFO: renamed from: lr */
    protected static String f12925lr = null;

    /* JADX INFO: renamed from: mj */
    public static int f12926mj = 2;

    /* JADX INFO: renamed from: qt */
    public static int f12927qt = 8;

    /* JADX INFO: renamed from: ri */
    protected static String f12928ri = "images";

    /* JADX INFO: renamed from: sf */
    public static int f12929sf = 16;
    public static int xha = 1;

    /* JADX INFO: renamed from: lr */
    public static float m16111lr(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16112lr(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: ri */
    protected static Bitmap m16113ri(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16114ri(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT < 33) {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
            }
            return !z2 && z;
        }
        z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        z2 = true;
        if (z2) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16115ri(Context context, int i) {
        boolean zM16116ri;
        boolean zM16116ri2;
        if (f12921di == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zM16116ri = m16116ri(context, "android.permission.READ_MEDIA_IMAGES");
                zM16116ri2 = true;
            } else {
                zM16116ri = m16116ri(context, "android.permission.READ_EXTERNAL_STORAGE");
                zM16116ri2 = m16116ri(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zM16116ri3 = m16116ri(context, "android.permission.CAMERA");
            boolean zM16116ri4 = m16116ri(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zM16116ri && zM16116ri2) {
                f12921di |= xha;
            }
            if (zM16116ri3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                f12921di |= f12926mj;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                f12921di |= jbs;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                f12921di |= f12927qt;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                f12921di |= f12929sf;
            }
            if (zM16116ri4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                f12921di |= f12920co;
            }
        }
        return (f12921di & i) != 0;
    }

    /* JADX INFO: renamed from: ri */
    protected static boolean m16116ri(Context context, String str) {
        return false;
    }
}
