package com.bytedance.sdk.openadsdk.p266uq;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3547qt {

    /* JADX INFO: renamed from: ri */
    public static WeakReference<AbstractC3548ri> f13029ri;

    /* JADX INFO: renamed from: lr */
    protected static final float[] f13028lr = new float[3];

    /* JADX INFO: renamed from: ik */
    protected static final float[] f13026ik = new float[3];

    /* JADX INFO: renamed from: ka */
    protected static final float[] f13027ka = new float[9];

    /* JADX INFO: renamed from: fi */
    protected static final float[] f13025fi = new float[3];

    /* JADX INFO: renamed from: ik */
    public static void m16232ik(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<AbstractC3548ri> weakReference = f13029ri;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xha.m16308ri("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    /* JADX INFO: renamed from: ka */
    public static void m16233ka(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<AbstractC3548ri> weakReference = f13029ri;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xha.m16308ri("SensorHub", "startListenRotationVector err", th);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m16234lr(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<AbstractC3548ri> weakReference = f13029ri;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xha.m16308ri("SensorHub", "startListenGyroscope error", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16235ri(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16236ri(Context context, SensorEventListener sensorEventListener) {
    }

    /* JADX INFO: renamed from: ri */
    public static void m16237ri(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<AbstractC3548ri> weakReference = f13029ri;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            xha.m16308ri("SensorHub", "startListenAccelerometer error", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16238ri(AbstractC3548ri abstractC3548ri) {
        f13029ri = new WeakReference<>(abstractC3548ri);
    }
}
