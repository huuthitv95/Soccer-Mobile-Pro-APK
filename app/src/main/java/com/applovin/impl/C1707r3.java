package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C11540L6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.r3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1707r3 implements C1704r0.e {

    /* JADX INFO: renamed from: l */
    private static WeakReference f2711l;

    /* JADX INFO: renamed from: m */
    private static final AtomicBoolean f2712m = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    private final C1748l f2713a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2714b;

    /* JADX INFO: renamed from: c */
    private final Context f2715c;

    /* JADX INFO: renamed from: d */
    private final C1697q3 f2716d;

    /* JADX INFO: renamed from: g */
    private boolean f2719g;

    /* JADX INFO: renamed from: i */
    private boolean f2721i;

    /* JADX INFO: renamed from: j */
    private Map f2722j;

    /* JADX INFO: renamed from: k */
    private final C1506b0 f2723k;

    /* JADX INFO: renamed from: e */
    private final Map f2717e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final AtomicBoolean f2718f = new AtomicBoolean();

    /* JADX INFO: renamed from: h */
    private int f2720h = 2;

    /* JADX INFO: renamed from: com.applovin.impl.r3$a */
    class a extends AbstractC1505b {
        a() {
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                C1768p.m5166g("AppLovinSdk", "Started mediation debugger");
                if (!C1707r3.this.m4187c() || C1707r3.f2711l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = C1707r3.f2711l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(C1707r3.this.f2716d, C1707r3.this.f2713a.m4826e());
                }
                C1707r3.f2712m.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                C1768p.m5166g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = C1707r3.f2711l = null;
            }
        }
    }

    public C1707r3(C1748l c1748l) {
        this.f2713a = c1748l;
        this.f2714b = c1748l.m4782Q();
        Context contextM4756p = C1748l.m4756p();
        this.f2715c = contextM4756p;
        C1697q3 c1697q3 = new C1697q3(contextM4756p);
        this.f2716d = c1697q3;
        this.f2723k = new C1506b0(c1748l, c1697q3);
    }

    /* JADX INFO: renamed from: a */
    private List m4177a(List list, C1748l c1748l) {
        List<String> adUnitIds = c1748l.m4776L() != null ? c1748l.m4776L().getAdUnitIds() : null;
        if (adUnitIds == null || adUnitIds.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(adUnitIds.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1656n c1656n = (C1656n) it.next();
            if (adUnitIds.contains(c1656n.m3609c())) {
                arrayList.add(c1656n);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private List m4178a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            C1479a0 c1479a0 = new C1479a0(str);
            if (c1479a0.m1770h()) {
                arrayList.add(c1479a0);
            } else if (C1768p.m5160a()) {
                this.f2714b.m5174b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private List m4179a(JSONObject jSONObject, C1748l c1748l) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, C11540L6.f24910E1, new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C1559g3 c1559g3 = new C1559g3(jSONObject2, c1748l);
                arrayList.add(c1559g3);
                this.f2717e.put(c1559g3.m2699b(), c1559g3);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private List m4180a(JSONObject jSONObject, List list, C1748l c1748l) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1656n(jSONObject2, this.f2717e, c1748l));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4181a(DialogInterface dialogInterface, int i) {
        m4197h();
    }

    /* JADX INFO: renamed from: a */
    private void m4182a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1559g3 c1559g3 = (C1559g3) it.next();
            if (c1559g3.m2723z() && c1559g3.m2714q() == C1559g3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.r3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m4188d();
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m4187c() {
        WeakReference weakReference = f2711l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m4188d() {
        Activity activityM4861w0 = this.f2713a.m4861w0();
        if (activityM4861w0 == null || activityM4861w0.isFinishing()) {
            C1768p.m5167h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityM4861w0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.r3$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f$0.m4181a(dialogInterface, i);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m4189f() {
        this.f2713a.m4826e().m2144a(new a());
    }

    /* JADX INFO: renamed from: a */
    public List m4190a(String str) {
        Map map = this.f2722j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f2722j.get(str);
    }

    @Override // com.applovin.impl.C1704r0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
        if (C1768p.m5160a()) {
            this.f2714b.m5174b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        }
        C1768p.m5167h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f2713a.m4764E().m4330a("fetchMediationDebuggerInfo", str, i, str2);
        this.f2716d.m3990a(null, null, null, null, null, null, null, false, this.f2713a);
        this.f2718f.set(false);
    }

    @Override // com.applovin.impl.C1704r0.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo3139a(String str, JSONObject jSONObject, int i) {
        List listM4179a = m4179a(jSONObject, this.f2713a);
        List listM4180a = m4180a(jSONObject, listM4179a, this.f2713a);
        List listM4177a = m4177a(listM4180a, this.f2713a);
        List listM4178a = m4178a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f2716d.m3990a(listM4179a, listM4180a, listM4177a, listM4178a, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f2713a);
        if (!listM4178a.isEmpty()) {
            this.f2723k.m2056a();
        }
        if (m4196g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.r3$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m4197h();
                }
            }, TimeUnit.SECONDS.toMillis(this.f2720h));
        } else {
            m4182a(listM4179a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4193a(Map map) {
        this.f2722j = map;
        m4195e();
        if (m4187c() || !f2712m.compareAndSet(false, true)) {
            C1768p.m5167h("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f2721i) {
            m4189f();
            this.f2721i = true;
        }
        Intent intent = new Intent(this.f2715c, (Class<?>) MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        C1768p.m5166g("AppLovinSdk", "Starting mediation debugger...");
        this.f2715c.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public void m4194a(boolean z, int i) {
        this.f2719g = z;
        this.f2720h = i;
    }

    /* JADX INFO: renamed from: e */
    public void m4195e() {
        if (this.f2718f.compareAndSet(false, true)) {
            this.f2713a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1823y5(this, this.f2713a), C1552f6.b.OTHER);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m4196g() {
        return this.f2719g;
    }

    /* JADX INFO: renamed from: h */
    public void m4197h() {
        m4193a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f2716d + "}";
    }
}
