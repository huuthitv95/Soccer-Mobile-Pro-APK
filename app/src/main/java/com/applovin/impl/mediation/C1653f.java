package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1617m1;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1612l6;
import com.applovin.impl.C1619m3;
import com.applovin.impl.C1621m5;
import com.applovin.impl.C1786u4;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.mediation.f */
/* JADX INFO: loaded from: classes3.dex */
public class C1653f {

    /* JADX INFO: renamed from: a */
    private final C1748l f2320a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2321b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f2322c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    private final Set f2323d = new HashSet();

    /* JADX INFO: renamed from: e */
    private final Object f2324e = new Object();

    /* JADX INFO: renamed from: f */
    private final JSONArray f2325f = new JSONArray();

    /* JADX INFO: renamed from: g */
    private final LinkedHashMap f2326g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    private final Object f2327h = new Object();

    /* JADX INFO: renamed from: i */
    private final Map f2328i = new HashMap();

    /* JADX INFO: renamed from: j */
    private final Map f2329j = new HashMap();

    /* JADX INFO: renamed from: k */
    private final Object f2330k = new Object();

    /* JADX INFO: renamed from: l */
    private List f2331l;

    public C1653f(C1748l c1748l) {
        this.f2320a = c1748l;
        this.f2321b = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    private C1619m3 m3501a(C1619m3 c1619m3) {
        List<C1619m3> list;
        if (((Boolean) this.f2320a.m4801a(AbstractC1776t3.f3380y8)).booleanValue()) {
            C1619m3 c1619m4 = (C1619m3) this.f2328i.get(c1619m3.m3196b());
            return c1619m4 != null ? c1619m4 : c1619m3;
        }
        if (!this.f2320a.m4857u0().m2928c() || (list = this.f2331l) == null) {
            return c1619m3;
        }
        for (C1619m3 c1619m5 : list) {
            if (c1619m5.m3196b().equals(c1619m3.m3196b())) {
                return c1619m5;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private List m3502a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C1619m3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f2320a));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3503a(C1786u4 c1786u4, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            AbstractC1617m1.m3169a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
            c1786u4.m5298a("Adapter reported INITIALIZING");
        } else if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
            c1786u4.m5298a(str);
        } else {
            c1786u4.m5303b(initializationStatus);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3504c(C1619m3 c1619m3) {
        String strM3196b = c1619m3.m3196b();
        synchronized (this.f2324e) {
            if (this.f2323d.contains(strM3196b)) {
                return;
            }
            this.f2323d.add(strM3196b);
            this.f2320a.m4784R().m2682d(C1548f2.f1521c0, AbstractC1568h2.m2786a(c1619m3));
        }
    }

    /* JADX INFO: renamed from: a */
    public C1786u4 m3505a(C1619m3 c1619m3, Activity activity) {
        C1619m3 c1619m3M3501a = m3501a(c1619m3);
        if (c1619m3M3501a == null) {
            return C1786u4.m5290a("AdapterInitialization:" + c1619m3.m3200c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strM3196b = c1619m3.m3196b();
        synchronized (this.f2330k) {
            C1786u4 c1786u4 = (C1786u4) this.f2329j.get(strM3196b);
            if (c1786u4 != null) {
                boolean z = true;
                boolean z2 = c1619m3M3501a.m3221q() && c1786u4.m5308e();
                if (!((Boolean) this.f2320a.m4801a(C1831z4.f3845V6)).booleanValue() || !c1786u4.m5302a()) {
                    z = false;
                }
                if (!z2 && !z) {
                    return c1786u4;
                }
            }
            final C1786u4 c1786u5 = new C1786u4("AdapterInitialization:" + c1619m3.m3200c());
            this.f2329j.put(strM3196b, c1786u5);
            C1655h c1655hM3516a = this.f2320a.m4790V().m3516a(c1619m3M3501a);
            if (c1655hM3516a == null) {
                c1786u5.m5298a("Adapter implementation not found");
                return c1786u5;
            }
            if (C1768p.m5160a()) {
                this.f2321b.m5175d("MediationAdapterInitializationManager", "Initializing adapter " + c1619m3M3501a);
            }
            m3504c(c1619m3M3501a);
            c1655hM3516a.m3562a(MaxAdapterParametersImpl.m3249a(c1619m3M3501a), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.f$$ExternalSyntheticLambda0
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                    C1653f.m3503a(c1786u5, initializationStatus, str);
                }
            });
            C1612l6.m3141a(c1619m3M3501a.m3217m(), c1786u5, "The adapter (" + c1619m3.m3200c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f2320a);
            return c1786u5;
        }
    }

    /* JADX INFO: renamed from: a */
    public Integer m3506a(String str) {
        Integer num;
        synchronized (this.f2327h) {
            num = (Integer) this.f2326g.get(str);
        }
        return num;
    }

    /* JADX INFO: renamed from: a */
    public Set m3507a() {
        HashSet hashSet;
        synchronized (this.f2327h) {
            hashSet = new HashSet(this.f2326g.keySet());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public void m3508a(Activity activity) {
        if (this.f2322c.compareAndSet(false, true)) {
            String str = (String) this.f2320a.m4799a(C1511b5.f1149G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<C1619m3> listM3502a = m3502a(JsonUtils.getJSONArray(jSONObject, this.f2320a.m4857u0().m2928c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f2331l = listM3502a;
                    for (C1619m3 c1619m3 : listM3502a) {
                        this.f2328i.put(c1619m3.m3196b(), c1619m3);
                    }
                    long j = StringUtils.parseLong(this.f2320a.m4847p0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    C1621m5 c1621m5 = new C1621m5(listM3502a, activity, this.f2320a);
                    if (j > 0) {
                        this.f2320a.m4853s0().m2605a(c1621m5, C1552f6.b.MEDIATION, j);
                    } else {
                        this.f2320a.m4853s0().m2603a(c1621m5);
                    }
                } catch (JSONException e) {
                    if (C1768p.m5160a()) {
                        this.f2321b.m5172a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                    AbstractC1617m1.m3170a((Throwable) e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m3509a(C1619m3 c1619m3, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zM3512b;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f2327h) {
            zM3512b = m3512b(c1619m3);
            if (!zM3512b) {
                this.f2326g.put(c1619m3.m3196b(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", c1619m3.m3196b());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putLong(jSONObject, "init_time_ms", j);
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f2325f.put(jSONObject);
            }
        }
        if (zM3512b) {
            return;
        }
        this.f2320a.m4806a(c1619m3);
        this.f2320a.m4797Z().processAdapterInitializationPostback(c1619m3, j, initializationStatus, str);
        this.f2320a.m4856u().m4704a(initializationStatus, c1619m3.m3196b());
    }

    /* JADX INFO: renamed from: a */
    public void m3510a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f2327h) {
            this.f2326g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f2320a.m4856u().m4704a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }

    /* JADX INFO: renamed from: b */
    public JSONArray m3511b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f2327h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f2325f);
        }
        return jSONArrayShallowCopy;
    }

    /* JADX INFO: renamed from: b */
    boolean m3512b(C1619m3 c1619m3) {
        boolean zContainsKey;
        synchronized (this.f2327h) {
            zContainsKey = this.f2326g.containsKey(c1619m3.m3196b());
        }
        return zContainsKey;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3513c() {
        return this.f2322c.get();
    }
}
