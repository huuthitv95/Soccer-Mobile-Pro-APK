package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: renamed from: com.mbridge.msdk.shake.b */
/* JADX INFO: compiled from: ShakeSensorEventListener.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13648b implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public long f38139a = 0;

    /* JADX INFO: renamed from: b */
    public float f38140b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f38141c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f38142d = 0.0f;

    /* JADX INFO: renamed from: e */
    private int f38143e;

    /* JADX INFO: renamed from: f */
    private int f38144f;

    public AbstractC13648b(int i, int i2) {
        this.f38143e = i;
        this.f38144f = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo36324a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis;
        float[] fArr = sensorEvent.values;
        float f = -fArr[0];
        float f2 = -fArr[1];
        float f3 = -fArr[2];
        float f4 = this.f38140b;
        if (f4 == 0.0f || Math.abs(f - f4) <= this.f38143e) {
            float f5 = this.f38141c;
            if (f5 == 0.0f || Math.abs(f2 - f5) <= this.f38143e) {
                float f6 = this.f38142d;
                if (f6 != 0.0f && Math.abs(f3 - f6) > this.f38143e) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.f38139a > this.f38144f) {
                        this.f38139a = jCurrentTimeMillis;
                        mo36324a();
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f38139a > this.f38144f) {
                    this.f38139a = jCurrentTimeMillis;
                    mo36324a();
                }
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f38139a > this.f38144f) {
                this.f38139a = jCurrentTimeMillis;
                mo36324a();
            }
        }
        this.f38140b = f;
        this.f38141c = f2;
        this.f38142d = f3;
    }
}
