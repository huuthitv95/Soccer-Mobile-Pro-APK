package com.bytedance.sdk.openadsdk.p266uq;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3540di {

    /* JADX INFO: renamed from: lr */
    private WeakReference<C3546mj> f12854lr;

    /* JADX INFO: renamed from: ri */
    private Context f12855ri;

    /* JADX INFO: renamed from: ik */
    private Map<String, ri> f12852ik = new HashMap();

    /* JADX INFO: renamed from: ka */
    private SensorEventListener f12853ka = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.uq.di.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            C3546mj c3546mjM16104ka;
            if (sensorEvent.sensor.getType() != 1 || (c3546mjM16104ka = C3540di.this.m16104ka()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                c3546mjM16104ka.m16220ri("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* JADX INFO: renamed from: fi */
    private SensorEventListener f12851fi = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.uq.di.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            C3546mj c3546mjM16104ka;
            if (sensorEvent.sensor.getType() != 4 || (c3546mjM16104ka = C3540di.this.m16104ka()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                c3546mjM16104ka.m16220ri("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* JADX INFO: renamed from: di */
    private SensorEventListener f12850di = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.uq.di.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            C3546mj c3546mjM16104ka;
            if (sensorEvent.sensor.getType() != 10 || (c3546mjM16104ka = C3540di.this.m16104ka()) == null) {
                return;
            }
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                c3546mjM16104ka.m16220ri("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener xha = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.uq.di.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                System.arraycopy(sensorEvent.values, 0, C3547qt.f13028lr, 0, C3547qt.f13028lr.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                System.arraycopy(sensorEvent.values, 0, C3547qt.f13026ik, 0, C3547qt.f13026ik.length);
            }
            SensorManager.getRotationMatrix(C3547qt.f13027ka, null, C3547qt.f13028lr, C3547qt.f13026ik);
            SensorManager.getOrientation(C3547qt.f13027ka, C3547qt.f13025fi);
            C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
            if (c3546mjM16104ka == null) {
                return;
            }
            float f = C3547qt.f13025fi[0];
            float f2 = C3547qt.f13025fi[1];
            float f3 = C3547qt.f13025fi[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                c3546mjM16104ka.m16220ri("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.di$ri */
    /* JADX INFO: loaded from: classes9.dex */
    interface ri {
        /* JADX INFO: renamed from: ri */
        JSONObject mo16110ri(JSONObject jSONObject) throws Throwable;
    }

    public C3540di(C3546mj c3546mj) {
        this.f12855ri = c3546mj.m16210ri();
        this.f12854lr = new WeakReference<>(c3546mj);
        m16102ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public AbstractC3548ri m16100fi() {
        C3546mj c3546mjM16104ka = m16104ka();
        if (c3546mjM16104ka == null) {
            return null;
        }
        return c3546mjM16104ka.m16169bu();
    }

    /* JADX INFO: renamed from: ik */
    private void m16102ik() {
        this.f12852ik.put("adInfo", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.45
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                if (c3546mjM16104ka == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectTan = c3546mjM16104ka.tan();
                if (jSONObjectTan != null) {
                    jSONObjectTan.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObjectTan;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                return jSONObject3;
            }
        });
        this.f12852ik.put("appInfo", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.56
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = C3540di.this.m16108ri().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                if (c3546mjM16104ka != null) {
                    jSONObject2.put("deviceId", c3546mjM16104ka.xha());
                    jSONObject2.put("netType", c3546mjM16104ka.slm());
                    jSONObject2.put("innerAppName", c3546mjM16104ka.m16189ka());
                    jSONObject2.put("appName", c3546mjM16104ka.m16178fi());
                    jSONObject2.put("appVersion", c3546mjM16104ka.m16172di());
                    Map<String, String> mapM16196lr = c3546mjM16104ka.m16196lr();
                    for (String str : mapM16196lr.keySet()) {
                        jSONObject2.put(str, mapM16196lr.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.f12852ik.put("playableSDKInfo", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.62
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(C11540L6.f24911F, "android");
                return jSONObject2;
            }
        });
        this.f12852ik.put("subscribe_app_ad", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.63
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                AbstractC3548ri abstractC3548riM16100fi = C3540di.this.m16100fi();
                JSONObject jSONObject2 = new JSONObject();
                if (abstractC3548riM16100fi == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("download_app_ad", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.64
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                AbstractC3548ri abstractC3548riM16100fi = C3540di.this.m16100fi();
                JSONObject jSONObject2 = new JSONObject();
                if (abstractC3548riM16100fi == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put(C11744X3.i.f26382o, new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.2
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                if (c3546mjM16104ka == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject3.put("viewStatus", c3546mjM16104ka.jbs());
                return jSONObject3;
            }
        });
        this.f12852ik.put("getVolume", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.3
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                if (c3546mjM16104ka == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject3.put("endcard_mute", c3546mjM16104ka.m16203mj());
                return jSONObject3;
            }
        });
        this.f12852ik.put("getScreenSize", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.4
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                if (c3546mjM16104ka == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectM16204nr = c3546mjM16104ka.m16204nr();
                jSONObjectM16204nr.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectM16204nr;
            }
        });
        this.f12852ik.put("start_accelerometer_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.5
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xha.m16308ri("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C3547qt.m16237ri(C3540di.this.f12855ri, C3540di.this.f12853ka, iOptInt);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("close_accelerometer_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.6
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3547qt.m16236ri(C3540di.this.f12855ri, C3540di.this.f12853ka);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.m16308ri("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f12852ik.put("start_gyro_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.7
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xha.m16308ri("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C3547qt.m16234lr(C3540di.this.f12855ri, C3540di.this.f12851fi, iOptInt);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("close_gyro_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.8
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3547qt.m16236ri(C3540di.this.f12855ri, C3540di.this.f12851fi);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.m16308ri("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f12852ik.put("start_accelerometer_grativityless_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.9
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xha.m16308ri("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C3547qt.m16232ik(C3540di.this.f12855ri, C3540di.this.f12850di, iOptInt);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("close_accelerometer_grativityless_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.10
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3547qt.m16236ri(C3540di.this.f12855ri, C3540di.this.f12850di);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.m16308ri("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f12852ik.put("start_rotation_vector_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.11
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xha.m16308ri("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C3547qt.m16233ka(C3540di.this.f12855ri, C3540di.this.xha, iOptInt);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("close_rotation_vector_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.13
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3547qt.m16236ri(C3540di.this.f12855ri, C3540di.this.xha);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.m16308ri("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f12852ik.put("device_shake", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.14
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3547qt.m16235ri(C3540di.this.f12855ri, 300L);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.m16308ri("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f12852ik.put("device_shake_short", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.15
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3547qt.m16235ri(C3540di.this.f12855ri, 150L);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.m16308ri("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f12852ik.put("playable_style", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.16
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectM16185ik = c3546mjM16104ka.m16185ik();
                jSONObjectM16185ik.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectM16185ik;
            }
        });
        this.f12852ik.put("sendReward", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.17
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.ihz();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playableInteractionTriggered", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.18
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16226uq();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("webview_time_track", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.19
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.f12852ik.put("playable_event", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.20
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null || jSONObject == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16199lr(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("reportAd", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.21
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("close", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.22
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("openAdLandPageLinks", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.24
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("get_viewport", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.25
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectM16166ac = c3546mjM16104ka.m16166ac();
                jSONObjectM16166ac.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectM16166ac;
            }
        });
        this.f12852ik.put("jssdk_load_finish", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.26
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.hcw();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_material_render_result", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.27
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.jbs(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("detect_change_playable_click", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.28
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectM16208qt = c3546mjM16104ka.m16208qt();
                jSONObjectM16208qt.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectM16208qt;
            }
        });
        this.f12852ik.put("check_camera_permission", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.29
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectM16167aw = c3546mjM16104ka.m16167aw();
                jSONObjectM16167aw.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectM16167aw;
            }
        });
        this.f12852ik.put("check_external_storage", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.30
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectBgr = c3546mjM16104ka.bgr();
                if (jSONObjectBgr.isNull("result")) {
                    jSONObjectBgr.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObjectBgr;
                }
                jSONObjectBgr.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectBgr;
            }
        });
        this.f12852ik.put("playable_open_camera", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.31
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_pick_photo", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.32
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_download_media_in_photos", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.33
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16221ri(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_preventTouchEvent", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.35
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16200lr(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_settings_info", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.36
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectM16227vr = c3546mjM16104ka.m16227vr();
                jSONObjectM16227vr.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectM16227vr;
            }
        });
        this.f12852ik.put("playable_load_main_scene", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.37
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.wjv();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_enter_section", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.38
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16191ka(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_end", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.39
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16168ay();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_finish_play_playable", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.40
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16180fr();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_transfrom_module_show", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.41
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16225su();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_transfrom_module_change_color", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.42
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.igq();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_set_scroll_rect", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.43
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_click_area", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.44
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16179fi(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_real_play_start", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.46
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_material_first_frame_show", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.47
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16229zf();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_stuck_check_pong", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.48
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16175dw();
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_material_adnormal_mask", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.49
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                c3546mjM16104ka.m16173di(jSONObject);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_long_press_panel", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.50
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_alpha_player_play", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.51
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_transfrom_module_highlight", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.52
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_send_click_event", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.53
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_query_media_permission_declare", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.54
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectXha = c3546mjM16104ka.xha(jSONObject);
                jSONObjectXha.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectXha;
            }
        });
        this.f12852ik.put("playable_query_media_permission_enable", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.55
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                C3546mj c3546mjM16104ka = C3540di.this.m16104ka();
                JSONObject jSONObject2 = new JSONObject();
                if (c3546mjM16104ka == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectM16201mj = c3546mjM16104ka.m16201mj(jSONObject);
                jSONObjectM16201mj.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObjectM16201mj;
            }
        });
        this.f12852ik.put("playable_apply_media_permission", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.57
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                AbstractC3548ri abstractC3548riM16100fi = C3540di.this.m16100fi();
                JSONObject jSONObject2 = new JSONObject();
                if (abstractC3548riM16100fi == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_start_kws", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.58
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                AbstractC3548ri abstractC3548riM16100fi = C3540di.this.m16100fi();
                JSONObject jSONObject2 = new JSONObject();
                if (abstractC3548riM16100fi == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_close_kws", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.59
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                AbstractC3548ri abstractC3548riM16100fi = C3540di.this.m16100fi();
                JSONObject jSONObject2 = new JSONObject();
                if (abstractC3548riM16100fi == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_video_preload_task_add", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.60
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                AbstractC3548ri abstractC3548riM16100fi = C3540di.this.m16100fi();
                JSONObject jSONObject2 = new JSONObject();
                if (abstractC3548riM16100fi == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
        this.f12852ik.put("playable_video_preload_task_cancel", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.61
            @Override // com.bytedance.sdk.openadsdk.p266uq.C3540di.ri
            /* JADX INFO: renamed from: ri */
            public JSONObject mo16110ri(JSONObject jSONObject) throws Throwable {
                AbstractC3548ri abstractC3548riM16100fi = C3540di.this.m16100fi();
                JSONObject jSONObject2 = new JSONObject();
                if (abstractC3548riM16100fi == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public C3546mj m16104ka() {
        WeakReference<C3546mj> weakReference = this.f12854lr;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: lr */
    public void m16107lr() {
        C3547qt.m16236ri(this.f12855ri, this.f12853ka);
        C3547qt.m16236ri(this.f12855ri, this.f12851fi);
        C3547qt.m16236ri(this.f12855ri, this.f12850di);
        C3547qt.m16236ri(this.f12855ri, this.xha);
    }

    /* JADX INFO: renamed from: ri */
    public Set<String> m16108ri() {
        return this.f12852ik.keySet();
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m16109ri(String str, JSONObject jSONObject) {
        try {
            ri riVar = this.f12852ik.get(str);
            if (riVar != null) {
                return riVar.mo16110ri(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
            return jSONObject2;
        } catch (Throwable th) {
            xha.m16308ri("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
