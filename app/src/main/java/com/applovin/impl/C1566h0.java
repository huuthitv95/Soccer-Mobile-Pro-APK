package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;

/* JADX INFO: renamed from: com.applovin.impl.h0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1566h0 {

    /* JADX INFO: renamed from: a */
    private final SensorManager f1744a = (SensorManager) C1748l.m4756p().getSystemService("sensor");

    /* JADX INFO: renamed from: b */
    private Handler f1745b;

    public C1566h0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f1745b = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2770a(SensorEventListener sensorEventListener) {
        this.f1744a.unregisterListener(sensorEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2771a(SensorEventListener sensorEventListener, Sensor sensor, int i, C1768p c1768p) {
        try {
            this.f1744a.registerListener(sensorEventListener, sensor, i, this.f1745b);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                c1768p.m5172a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public Sensor m2772a(int i) {
        return this.f1744a.getDefaultSensor(i);
    }

    /* JADX INFO: renamed from: b */
    public void m2773b(final SensorEventListener sensorEventListener) {
        this.f1745b.post(new Runnable() { // from class: com.applovin.impl.h0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2770a(sensorEventListener);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m2774b(final SensorEventListener sensorEventListener, final Sensor sensor, final int i, final C1768p c1768p) {
        this.f1745b.post(new Runnable() { // from class: com.applovin.impl.h0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2771a(sensorEventListener, sensor, i, c1768p);
            }
        });
    }
}
