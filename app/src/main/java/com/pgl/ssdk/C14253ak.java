package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.pgl.ssdk.ak */
/* JADX INFO: loaded from: classes7.dex */
public class C14253ak implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    private static final float[] f41232a = {999999.0f, 999999.0f, 999999.0f};

    /* JADX INFO: renamed from: b */
    public static boolean f41233b = true;

    /* JADX INFO: renamed from: c */
    private static volatile C14253ak f41234c;

    /* JADX INFO: renamed from: i */
    private final Context f41240i;

    /* JADX INFO: renamed from: d */
    private Sensor f41235d = null;

    /* JADX INFO: renamed from: e */
    private Sensor f41236e = null;

    /* JADX INFO: renamed from: f */
    private Sensor f41237f = null;

    /* JADX INFO: renamed from: g */
    private volatile boolean f41238g = false;

    /* JADX INFO: renamed from: h */
    private volatile boolean f41239h = false;

    /* JADX INFO: renamed from: j */
    private AtomicReference<a> f41241j = new AtomicReference<>();

    /* JADX INFO: renamed from: k */
    private long f41242k = 999999;

    /* JADX INFO: renamed from: com.pgl.ssdk.ak$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        public long f41243a;

        /* JADX INFO: renamed from: b */
        public float[] f41244b = null;

        /* JADX INFO: renamed from: c */
        public float[] f41245c = null;

        /* JADX INFO: renamed from: d */
        public float[] f41246d = null;

        public a(long j) {
            this.f41243a = j;
        }
    }

    private C14253ak(Context context) {
        this.f41240i = context;
    }

    /* JADX INFO: renamed from: a */
    public static C14253ak m42952a(Context context) {
        if (f41234c == null) {
            synchronized (C14253ak.class) {
                if (f41234c == null) {
                    f41234c = new C14253ak(context);
                }
            }
        }
        if (f41233b) {
            f41234c.m42957c();
        }
        return f41234c;
    }

    /* JADX INFO: renamed from: a */
    private static void m42953a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f41232a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    /* JADX INFO: renamed from: a */
    private static void m42954a(Object[] objArr, a aVar) {
        float[] fArr = aVar.f41244b;
        if (fArr != null) {
            float[] fArr2 = aVar.f41245c;
            float[] fArrM42956a = fArr2 != null ? m42956a(objArr, fArr, fArr2) : m42955a(objArr, fArr);
            objArr[0] = Float.valueOf(fArrM42956a[0]);
            objArr[1] = Float.valueOf(fArrM42956a[1]);
            objArr[2] = Float.valueOf(fArrM42956a[2]);
            objArr[4] = aVar.f41244b;
        } else {
            objArr[0] = Float.valueOf(999999.0f);
            objArr[1] = Float.valueOf(999999.0f);
            objArr[2] = Float.valueOf(999999.0f);
            objArr[4] = f41232a;
        }
        objArr[3] = Long.valueOf(aVar.f41243a);
        float[] fArr3 = aVar.f41246d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f41232a;
        }
    }

    /* JADX INFO: renamed from: a */
    private static float[] m42955a(Object[] objArr, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt(((f * f) + (f2 * f2)) + (f3 * f3)));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f2 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f * fSqrt), f3 * fSqrt))) + 360.0f) % 360.0f};
    }

    /* JADX INFO: renamed from: a */
    private static float[] m42956a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        float[] fArr4 = new float[3];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, fArr4);
        return new float[]{(((float) Math.toDegrees(fArr4[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[2])) + 360.0f) % 360.0f};
    }

    /* JADX INFO: renamed from: c */
    private void m42957c() {
        if (this.f41239h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f41240i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f41235d = sensorManager.getDefaultSensor(1);
                this.f41236e = sensorManager.getDefaultSensor(2);
                this.f41237f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f41239h = true;
    }

    /* JADX INFO: renamed from: e */
    private void m42958e() {
        this.f41242k = -1L;
        this.f41238g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f41240i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42959a() {
        if (!f41233b || this.f41238g) {
            return;
        }
        m42961d();
    }

    /* JADX INFO: renamed from: b */
    public Object[] m42960b() {
        Object[] objArr = new Object[6];
        a aVar = this.f41241j.get();
        if (!f41233b || aVar == null) {
            m42953a(objArr);
            return objArr;
        }
        int i = 0;
        do {
            if ((this.f41235d == null || aVar.f41244b != null) && ((this.f41236e == null || aVar.f41245c != null) && (this.f41237f == null || aVar.f41246d != null))) {
                break;
            }
            C14268az.m43031a(50L);
            i++;
        } while (i <= 20);
        m42958e();
        this.f41238g = false;
        m42954a(objArr, aVar);
        this.f41241j.set(null);
        return objArr;
    }

    /* JADX INFO: renamed from: d */
    public boolean m42961d() {
        if (this.f41235d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f41240i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f41235d, 2);
                    Sensor sensor = this.f41236e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f41237f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f41242k = jCurrentTimeMillis;
                        this.f41241j.set(new a(jCurrentTimeMillis));
                        this.f41238g = true;
                    } else {
                        m42958e();
                    }
                }
            } catch (Throwable unused) {
                m42958e();
            }
        }
        return this.f41238g;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f41241j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f41244b == null) {
                aVar.f41244b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f41245c == null) {
                aVar.f41245c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f41246d == null) {
            aVar.f41246d = sensorEvent.values;
        }
    }
}
