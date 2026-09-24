package com.bytedance.adsdk.ugeno.xha;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.xha.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2347mj {

    /* JADX INFO: renamed from: ik */
    private static TypedValue f6099ik;

    /* JADX INFO: renamed from: lr */
    private static final Object f6100lr = new Object();

    /* JADX INFO: renamed from: ri */
    public static Handler f6101ri = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: lr */
    public static int m8042lr(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* JADX INFO: renamed from: ri */
    public static float m8043ri(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* JADX INFO: renamed from: ri */
    public static float m8044ri(Context context, String str) {
        float f;
        float f2 = context.getResources().getDisplayMetrics().density;
        try {
            f = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f = 0.0f;
        }
        return (f * f2) + 0.5f;
    }

    /* JADX INFO: renamed from: ri */
    public static Bitmap m8045ri(Context context, Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                return null;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Drawable m8046ri(Context context, int i) {
        return context.getDrawable(i);
    }

    /* JADX INFO: renamed from: ri */
    public static void m8047ri(Runnable runnable) {
        if (m8048ri()) {
            runnable.run();
        } else {
            f6101ri.post(runnable);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m8048ri() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
