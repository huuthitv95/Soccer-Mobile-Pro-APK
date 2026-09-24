package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.y4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1822y4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a */
    private final int f3642a;

    /* JADX INFO: renamed from: b */
    private final float f3643b;

    /* JADX INFO: renamed from: c */
    private final C1566h0 f3644c;

    /* JADX INFO: renamed from: d */
    private final Sensor f3645d;

    /* JADX INFO: renamed from: e */
    private final Sensor f3646e;

    /* JADX INFO: renamed from: f */
    private final C1748l f3647f;

    /* JADX INFO: renamed from: g */
    private float[] f3648g;

    /* JADX INFO: renamed from: h */
    private float f3649h;

    public C1822y4(C1748l c1748l) {
        this.f3647f = c1748l;
        C1566h0 c1566h0 = new C1566h0();
        this.f3644c = c1566h0;
        this.f3645d = c1566h0.m2772a(9);
        this.f3646e = c1566h0.m2772a(4);
        this.f3642a = ((Integer) c1748l.m4801a(C1831z4.f3980l4)).intValue();
        this.f3643b = ((Float) c1748l.m4801a(C1831z4.f3971k4)).floatValue();
    }

    /* JADX INFO: renamed from: a */
    public float m5711a() {
        float[] fArr = this.f3648g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    /* JADX INFO: renamed from: b */
    public float m5712b() {
        return this.f3649h;
    }

    /* JADX INFO: renamed from: c */
    public void m5713c() {
        if (Boolean.parseBoolean(this.f3647f.m4847p0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f3644c.m2773b(this);
        if (((Boolean) this.f3647f.m4849q0().m1874a(C1831z4.f3953i4)).booleanValue()) {
            this.f3644c.m2774b(this, this.f3645d, (int) TimeUnit.MILLISECONDS.toMicros(this.f3642a), this.f3647f.m4782Q());
        }
        if (((Boolean) this.f3647f.m4849q0().m1874a(C1831z4.f3962j4)).booleanValue()) {
            this.f3644c.m2774b(this, this.f3646e, (int) TimeUnit.MILLISECONDS.toMicros(this.f3642a), this.f3647f.m4782Q());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f3644c.m2773b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m5713c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f3648g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.f3649h * this.f3643b;
            this.f3649h = f;
            this.f3649h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
