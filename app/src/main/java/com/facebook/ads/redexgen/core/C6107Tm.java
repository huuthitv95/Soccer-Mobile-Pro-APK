package com.facebook.ads.redexgen.core;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6107Tm implements SensorEventListener {
    public C6107Tm() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C6108Tn.A0B = sensorEvent.values;
        C6108Tn.A05();
    }
}
