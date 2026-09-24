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

/* JADX INFO: renamed from: com.applovin.impl.n1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1658n1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a */
    private final C1748l f2394a;

    /* JADX INFO: renamed from: b */
    private final C1566h0 f2395b;

    /* JADX INFO: renamed from: c */
    private final Sensor f2396c;

    /* JADX INFO: renamed from: d */
    private final a f2397d;

    /* JADX INFO: renamed from: e */
    private float f2398e;

    /* JADX INFO: renamed from: com.applovin.impl.n1$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2556a();

        /* JADX INFO: renamed from: b */
        void mo2559b();
    }

    public C1658n1(C1748l c1748l, a aVar) {
        this.f2394a = c1748l;
        C1566h0 c1566h0 = new C1566h0();
        this.f2395b = c1566h0;
        this.f2396c = c1566h0.m2772a(1);
        this.f2397d = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m3617a() {
        if (Boolean.parseBoolean(this.f2394a.m4847p0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f2395b.m2773b(this);
        this.f2395b.m2774b(this, this.f2396c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.f2394a.m4782Q());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* JADX INFO: renamed from: b */
    public void m3618b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f2395b.m2773b(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f2395b.m2773b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m3617a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.f2398e;
            float f2 = (f * 0.5f) + (fMax * 0.5f);
            this.f2398e = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.f2397d.mo2556a();
            } else {
                if (f <= -0.8f || f2 >= -0.8f) {
                    return;
                }
                this.f2397d.mo2559b();
            }
        }
    }
}
