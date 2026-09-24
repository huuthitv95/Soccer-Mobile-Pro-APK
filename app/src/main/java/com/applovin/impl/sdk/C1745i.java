package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.i */
/* JADX INFO: loaded from: classes3.dex */
public class C1745i implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a */
    private final C1748l f2978a;

    /* JADX INFO: renamed from: b */
    private final AtomicReference f2979b;

    /* JADX INFO: renamed from: c */
    private final Handler f2980c;

    /* JADX INFO: renamed from: d */
    private final Handler f2981d;

    /* JADX INFO: renamed from: e */
    private final AtomicLong f2982e = new AtomicLong(0);

    /* JADX INFO: renamed from: f */
    private long f2983f;

    /* JADX INFO: renamed from: g */
    private long f2984g;

    /* JADX INFO: renamed from: h */
    private long f2985h;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.i$b */
    private enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.i$c */
    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (C1745i.this.f2979b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - C1745i.this.f2982e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= C1745i.this.f2983f) {
                C1745i.this.f2981d.postDelayed(this, C1745i.this.f2985h);
                return;
            }
            C1745i.this.f2979b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(C1745i.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - C1748l.m4755o());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", C1745i.this.f2978a.m4760B0() ? "non_first_session" : "first_session");
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "seconds_since_app_launch", String.valueOf(seconds));
            List listM4590a = C1745i.this.f2978a.m4832h().m4590a();
            if (!CollectionUtils.isEmpty(listM4590a)) {
                JsonUtils.putJsonArray(jSONObject, "ad_info", new JSONArray((Collection) listM4590a));
            }
            map.put("details", jSONObject.toString());
            C1745i.this.f2978a.m4764E().m2682d(C1548f2.f1489M0, map);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.i$d */
    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1745i.this.f2979b.get() != b.MONITORING) {
                return;
            }
            C1745i.this.f2982e.set(System.currentTimeMillis());
            C1745i.this.f2980c.postDelayed(this, C1745i.this.f2984g);
        }
    }

    public C1745i(C1748l c1748l) {
        this.f2978a = c1748l;
        this.f2979b = new AtomicReference(!AbstractC1701q7.m4092c(c1748l) ? b.IDLE : b.INELIGIBLE);
        this.f2980c = new Handler(C1748l.m4756p().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f2981d = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: b */
    private void m4677b() {
        if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.f2979b, b.MONITORING, b.IDLE)) {
            this.f2980c.removeCallbacksAndMessages(null);
            this.f2981d.removeCallbacksAndMessages(null);
        }
        this.f2978a.m4832h().m4595b(this);
    }

    /* JADX INFO: renamed from: c */
    private void m4679c() {
        if (((Boolean) this.f2978a.m4801a(C1831z4.f3964j6)).booleanValue() && this.f2978a.m4846o0().getCurrentApplicationState() == SessionTracker.EnumC1733e.PAUSED) {
            return;
        }
        if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m280m(this.f2979b, b.IDLE, b.MONITORING)) {
            this.f2980c.post(new d());
            this.f2981d.postDelayed(new c(), this.f2985h / 2);
        }
        this.f2978a.m4832h().m4593a(this);
    }

    /* JADX INFO: renamed from: d */
    private void m4681d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f2983f = ((Long) this.f2978a.m4801a(C1831z4.f3937g6)).longValue();
        this.f2984g = ((Long) this.f2978a.m4801a(C1831z4.f3946h6)).longValue();
        this.f2985h = ((Long) this.f2978a.m4801a(C1831z4.f3955i6)).longValue();
        if (((Boolean) this.f2978a.m4801a(C1831z4.f3964j6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4686a() {
        if (this.f2979b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f2978a.m4801a(C1831z4.f3928f6)).booleanValue()) {
            m4677b();
        } else {
            m4681d();
            m4679c();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            m4677b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m4679c();
        }
    }
}
