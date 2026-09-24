package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.metrics.b */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8283b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8288g f18464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f18465b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C8284c f18466c;

    public RunnableC8283b(C8284c c8284c, InterfaceC8288g interfaceC8288g, Map map) {
        this.f18466c = c8284c;
        this.f18464a = interfaceC8288g;
        this.f18465b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnitDisplayType unitDisplayType;
        int iM22022a;
        int iM22022a2;
        String str;
        IAlog.m21945a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
        C8284c c8284c = this.f18466c;
        UnitDisplayType unitDisplayType2 = c8284c.f18472c;
        if (unitDisplayType2 == null || !(unitDisplayType2 == (unitDisplayType = UnitDisplayType.BANNER) || unitDisplayType2 == UnitDisplayType.MRECT || unitDisplayType2.isFullscreenUnit())) {
            UnitDisplayType unitDisplayType3 = c8284c.f18472c;
            IAlog.m21945a("Unit display type %s is not supported for metric event", unitDisplayType3 != null ? unitDisplayType3.value() : "");
            return;
        }
        IAlog.m21945a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f18464a.toString());
        C8021o c8021o = IAConfigManager.f17654M.f17688t.f17862b;
        UnitDisplayType unitDisplayType4 = this.f18466c.f18472c;
        if (unitDisplayType4 == unitDisplayType || unitDisplayType4 == UnitDisplayType.MRECT) {
            String strM20445a = c8021o.m20445a("ad_metrics_interval_banner", C8284c.f18467g);
            String strM20445a2 = c8021o.m20445a("ad_metrics_limit_banner", C8284c.f18468h);
            iM22022a = AbstractC9195v.m22022a(strM20445a, 24);
            iM22022a2 = AbstractC9195v.m22022a(strM20445a2, 3);
            str = "LastSentMetricsBanner";
        } else {
            String strM20445a3 = c8021o.m20445a("ad_metrics_interval_interstitial", C8284c.f18469i);
            String strM20445a4 = c8021o.m20445a("ad_metrics_limit_interstitial", C8284c.f18470j);
            iM22022a = AbstractC9195v.m22022a(strM20445a3, 24);
            iM22022a2 = AbstractC9195v.m22022a(strM20445a4, 3);
            str = "LastSentMetricsInterstitial";
        }
        Application application = AbstractC9174o.f21470a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString(str, "[]"));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (c8021o.m20446a(false, this.f18466c.f18463a) && !AbstractC8282a.m20683a(iM22022a, iM22022a2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                C8284c c8284c2 = this.f18466c;
                InneractiveAdRequest inneractiveAdRequest = c8284c2.f18474e;
                AbstractC9087e abstractC9087e = c8284c2.f18473d;
                Map map = this.f18465b;
                try {
                    EnumC8424u enumC8424u = EnumC8424u.METRIC_MEASUREMENTS_EVENT;
                    JSONArray jSONArray2 = c8284c2.f18475f;
                    C8428w c8428w = new C8428w(abstractC9087e);
                    c8428w.f18755c = enumC8424u;
                    c8428w.f18753a = inneractiveAdRequest;
                    c8428w.f18756d = jSONArray2;
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : map.keySet()) {
                        Object obj = map.get(str2);
                        try {
                            jSONObject.put(str2, obj);
                        } catch (Exception unused2) {
                            IAlog.m21950f("Got exception adding param to json object: %s, %s", str2, obj);
                        }
                    }
                    c8428w.f18758f.put(jSONObject);
                    c8428w.m20808a((String) null);
                } catch (Exception unused3) {
                }
            }
            sharedPreferences.edit().putString(str, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
