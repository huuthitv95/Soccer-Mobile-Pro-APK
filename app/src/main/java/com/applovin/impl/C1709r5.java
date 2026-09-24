package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.r5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1709r5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: j */
    private static JSONObject f2728j;

    /* JADX INFO: renamed from: k */
    private static final Object f2729k = new Object();

    /* JADX INFO: renamed from: l */
    private static final Map f2730l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g */
    private final C1519c3 f2731g;

    /* JADX INFO: renamed from: h */
    private final Context f2732h;

    /* JADX INFO: renamed from: i */
    private final b f2733i;

    /* JADX INFO: renamed from: com.applovin.impl.r5$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo3441a(JSONArray jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.r5$c */
    static class c implements C1541e5.a, Runnable {

        /* JADX INFO: renamed from: a */
        private final b f2734a;

        /* JADX INFO: renamed from: b */
        private final Object f2735b;

        /* JADX INFO: renamed from: c */
        private int f2736c;

        /* JADX INFO: renamed from: d */
        private final AtomicBoolean f2737d;

        /* JADX INFO: renamed from: e */
        private final Collection f2738e;

        /* JADX INFO: renamed from: f */
        private final C1748l f2739f;

        /* JADX INFO: renamed from: g */
        private final C1768p f2740g;

        private c(int i, b bVar, C1748l c1748l) {
            this.f2736c = i;
            this.f2734a = bVar;
            this.f2739f = c1748l;
            this.f2740g = c1748l.m4782Q();
            this.f2735b = new Object();
            this.f2738e = new ArrayList(i);
            this.f2737d = new AtomicBoolean();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m4208a() {
            ArrayList<C1541e5> arrayList;
            synchronized (this.f2735b) {
                arrayList = new ArrayList(this.f2738e);
            }
            JSONArray jSONArray = new JSONArray();
            for (C1541e5 c1541e5 : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    C1551f5 c1551f5M2501f = c1541e5.m2501f();
                    jSONObject.put("name", c1551f5M2501f.m3200c());
                    jSONObject.put("class", c1551f5M2501f.m3196b());
                    jSONObject.put("adapter_version", c1541e5.m2496a());
                    jSONObject.put("sdk_version", c1541e5.m2499d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorM2498c = c1541e5.m2498c();
                    if (maxErrorM2498c != null) {
                        jSONObject2.put("error_message", maxErrorM2498c.getMessage());
                    } else {
                        jSONObject2.put("signal", c1541e5.m2500e());
                    }
                    jSONObject2.put("signal_collection_time_ms", c1541e5.m2497b());
                    jSONObject2.put("is_cached", c1541e5.m2502g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (C1768p.m5160a()) {
                        this.f2740g.m5171a("TaskCollectSignals", "Collected signal from " + c1551f5M2501f);
                    }
                } catch (JSONException e) {
                    if (C1768p.m5160a()) {
                        this.f2740g.m5172a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.f2739f.m4764E().m4329a("TaskCollectSignals", "createSignalsData", e);
                }
            }
            m4209a(jSONArray);
        }

        /* JADX INFO: renamed from: a */
        private void m4209a(JSONArray jSONArray) {
            b bVar = this.f2734a;
            if (bVar != null) {
                bVar.mo3441a(jSONArray);
            }
        }

        @Override // com.applovin.impl.C1541e5.a
        /* JADX INFO: renamed from: a */
        public void mo2503a(C1541e5 c1541e5) {
            boolean z;
            synchronized (this.f2735b) {
                this.f2738e.add(c1541e5);
                int i = this.f2736c - 1;
                this.f2736c = i;
                z = i < 1;
            }
            if (z && this.f2737d.compareAndSet(false, true)) {
                if (AbstractC1701q7.m4113i() && ((Boolean) this.f2739f.m4801a(C1831z4.f3790P)).booleanValue()) {
                    this.f2739f.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f2739f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.r5$c$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m4208a();
                        }
                    }), C1552f6.b.MEDIATION);
                } else {
                    m4208a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2737d.compareAndSet(false, true)) {
                m4208a();
            }
        }
    }

    public C1709r5(C1519c3 c1519c3, Context context, C1748l c1748l, b bVar) {
        super("TaskCollectSignals", c1748l);
        this.f2731g = c1519c3;
        this.f2732h = context;
        this.f2733i = bVar;
    }

    /* JADX INFO: renamed from: a */
    private void m4201a(final C1551f5 c1551f5, final C1541e5.a aVar) {
        if (c1551f5.m3222r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.r5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4206b(c1551f5, aVar);
                }
            });
        } else {
            this.f1969a.m4797Z().collectSignal(c1551f5, this.f2732h, aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4202a(String str, Throwable th) {
        if (C1768p.m5160a()) {
            this.f1971c.m5172a(this.f1970b, "No signals collected: " + str, th);
        }
        b bVar = this.f2733i;
        if (bVar != null) {
            bVar.mo3441a(new JSONArray());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4203a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f2733i, this.f1969a);
        this.f1969a.m4853s0().m2605a(new C1788u6(this.f1969a, "timeoutCollectSignal", cVar), C1552f6.b.TIMEOUT, ((Long) this.f1969a.m4801a(AbstractC1776t3.f3379y7)).longValue());
        for (int i = 0; i < jSONArray.length(); i++) {
            m4201a(new C1551f5(this.f2731g, jSONArray.getJSONObject(i), jSONObject, this.f1969a), cVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4204a(JSONObject jSONObject) {
        synchronized (f2729k) {
            f2728j = jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4205a(JSONObject jSONObject, C1748l c1748l) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f2730l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            C1768p.m5164c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            c1748l.m4764E().m4329a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m4206b(C1551f5 c1551f5, C1541e5.a aVar) {
        this.f1969a.m4797Z().collectSignal(c1551f5, this.f2732h, aVar);
    }

    /* JADX INFO: renamed from: b */
    private void m4207b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f2730l.get(this.f2731g.m2193b());
        if (set == null || set.isEmpty()) {
            m4202a("No signal providers found for ad unit: " + this.f2731g.m2193b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        m4203a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f2729k) {
                jSONArray = JsonUtils.getJSONArray(f2728j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f2730l.size() > 0) {
                    m4207b(jSONArray, f2728j);
                    return;
                } else {
                    m4203a(jSONArray, f2728j);
                    return;
                }
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5178k(this.f1970b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f1969a.m4800a(C1511b5.f1148F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f2730l.size() > 0) {
                    m4207b(jSONArray2, jSONObject);
                    return;
                } else {
                    m4203a(jSONArray2, jSONObject);
                    return;
                }
            }
            m4202a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e) {
            m4202a("Failed to wait for signals", e);
            this.f1969a.m4764E().m4329a("TaskCollectSignals", "waitForSignals", e);
        } catch (JSONException e2) {
            m4202a("Failed to parse signals JSON", e2);
            this.f1969a.m4764E().m4329a("TaskCollectSignals", "parseSignalsJSON", e2);
        } catch (Throwable th) {
            m4202a("Failed to collect signals", th);
            this.f1969a.m4764E().m4329a("TaskCollectSignals", "collectSignals", th);
        }
    }
}
