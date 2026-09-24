package com.facebook.ads.redexgen.core;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6106Tl implements SensorEventListener {
    public C6106Tl() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C6108Tn.A0A = sensorEvent.values;
        C6108Tn.A06();
    }
}
