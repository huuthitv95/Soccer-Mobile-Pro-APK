package com.mbridge.msdk.config.component.sen;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.constraintlayout.motion.widget.Key;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.sen.b */
/* JADX INFO: compiled from: NativeSensorEventPublisher.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12837b {

    /* JADX INFO: renamed from: b */
    private final ArrayList<InterfaceC12836a> f34388b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private final SensorEventListener f34389c = new a();

    /* JADX INFO: renamed from: a */
    private final SensorManager f34387a = (SensorManager) C13008c.m36588n().m36542d().getSystemService("sensor");

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.sen.b$a */
    /* JADX INFO: compiled from: NativeSensorEventPublisher.java */
    class a implements SensorEventListener {
        a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            String lowerCase = sensorEvent.sensor.getName().toLowerCase();
            float[] fArr = sensorEvent.values;
            HashMap map = new HashMap();
            map.put(C12770c.m35209b("type"), "accelerometer");
            map.put(C12770c.m35209b("x"), String.valueOf(fArr[0]));
            map.put(C12770c.m35209b("y"), String.valueOf(fArr[1]));
            map.put(C12770c.m35209b("z"), String.valueOf(fArr[2]));
            float[] fArr2 = new float[3];
            float[] fArr3 = new float[3];
            float[] fArr4 = new float[3];
            float[] fArr5 = new float[9];
            float[] fArr6 = new float[9];
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr7 = sensorEvent.values;
                System.arraycopy(fArr7, 0, fArr2, 0, fArr7.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr8 = sensorEvent.values;
                System.arraycopy(fArr8, 0, fArr3, 0, fArr8.length);
            }
            if (lowerCase.contains("accelerometer")) {
                if (SensorManager.getRotationMatrix(fArr5, fArr6, fArr2, fArr3)) {
                    SensorManager.getOrientation(fArr5, fArr4);
                    Math.toDegrees(fArr4[0]);
                    float degrees = (float) Math.toDegrees(fArr4[1]);
                    float degrees2 = (float) Math.toDegrees(fArr4[2]);
                    float f = fArr[0];
                    float f2 = fArr[1];
                    float f3 = fArr[2];
                    double dSqrt = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
                    map.put(C12770c.m35209b("tileX"), String.valueOf(degrees));
                    map.put(C12770c.m35209b("tileY"), String.valueOf(degrees2));
                    map.put(C12770c.m35209b("magnitude"), String.valueOf(dSqrt));
                }
                map.put(C12770c.m35209b("type"), "accelerometer");
                C12837b.this.m35706a((HashMap<String, Object>) map);
                return;
            }
            if (lowerCase.contains("magnetic")) {
                map.put(C12770c.m35209b("type"), "magnetic");
                C12837b.this.m35706a((HashMap<String, Object>) map);
            } else if (lowerCase.contains("gyroscope")) {
                map.put(C12770c.m35209b("type"), "gyroscope");
                C12837b.this.m35706a((HashMap<String, Object>) map);
            } else if (lowerCase.contains(Key.ROTATION)) {
                float f4 = fArr[3];
                map.put(C12770c.m35209b("type"), Key.ROTATION);
                map.put(C12770c.m35209b("cos"), String.valueOf(f4));
                C12837b.this.m35706a((HashMap<String, Object>) map);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35710b(InterfaceC12836a interfaceC12836a) {
        if (interfaceC12836a != null) {
            this.f34388b.remove(interfaceC12836a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35709a(InterfaceC12836a interfaceC12836a) {
        if (this.f34388b.contains(interfaceC12836a)) {
            return;
        }
        this.f34388b.add(interfaceC12836a);
    }

    /* JADX INFO: renamed from: a */
    public void m35707a() {
        SensorManager sensorManager = this.f34387a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f34389c);
        }
        this.f34388b.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35706a(HashMap<String, Object> map) {
        C12710b c12710b = new C12710b();
        c12710b.m34843b("917002");
        c12710b.m34841a(map);
        Iterator<InterfaceC12836a> it = this.f34388b.iterator();
        while (it.hasNext()) {
            it.next().mo35702a(c12710b);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35705a(String str, String str2) {
        C12710b c12710b = new C12710b();
        c12710b.m34843b("917002");
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("type"), str);
        map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), m35703a(str));
        map.put(C12770c.m35209b("reason"), str2);
        c12710b.m34841a(map);
        Iterator<InterfaceC12836a> it = this.f34388b.iterator();
        while (it.hasNext()) {
            it.next().mo35702a(c12710b);
        }
    }

    /* JADX INFO: renamed from: a */
    private String m35703a(String str) {
        if (str.contains("accelerometer")) {
            return "200001";
        }
        if (str.contains("magnetic")) {
            return "200002";
        }
        if (str.contains("gyroscope")) {
            return "200003";
        }
        if (str.contains(Key.ROTATION)) {
            return "200004";
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public void m35708a(int i, String str, int i2) {
        try {
            Sensor defaultSensor = this.f34387a.getDefaultSensor(i);
            if (defaultSensor != null) {
                this.f34387a.registerListener(this.f34389c, defaultSensor, i2);
                return;
            }
            m35705a(str, str + " is not available");
        } catch (Exception e) {
            m35705a(str, e.getMessage());
        }
    }
}
