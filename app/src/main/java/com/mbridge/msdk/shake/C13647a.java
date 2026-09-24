package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.shake.a */
/* JADX INFO: compiled from: NativeShakeManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13647a {

    /* JADX INFO: renamed from: a */
    private SensorManager f38137a;

    /* JADX INFO: renamed from: com.mbridge.msdk.shake.a$b */
    /* JADX INFO: compiled from: NativeShakeManager.java */
    private static class b {

        /* JADX INFO: renamed from: a */
        static C13647a f38138a = new C13647a();
    }

    private C13647a() {
    }

    /* JADX INFO: renamed from: a */
    public static C13647a m39776a() {
        return b.f38138a;
    }

    /* JADX INFO: renamed from: a */
    private static void m39777a(Context context, String str) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000106");
                if (!TextUtils.isEmpty(C13088a.f35856V)) {
                    jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
                }
                if (!TextUtils.isEmpty(C13088a.f35865g)) {
                    jSONObject.put("c", C13088a.f35865g);
                }
                jSONObject.put("reason", str);
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("NativeShakeManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39778a(SensorEventListener sensorEventListener) {
        m39779a(sensorEventListener, null, 2);
    }

    /* JADX INFO: renamed from: a */
    public void m39779a(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d != null) {
            try {
                if (this.f38137a == null) {
                    this.f38137a = (SensorManager) contextM36542d.getSystemService("sensor");
                }
                if (sensor == null) {
                    sensor = this.f38137a.getDefaultSensor(1);
                }
                this.f38137a.registerListener(sensorEventListener, sensor, i);
            } catch (Exception e) {
                e.printStackTrace();
                m39777a(contextM36542d, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m39780b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f38137a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
