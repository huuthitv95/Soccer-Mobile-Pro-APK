package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.C11341A5;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.tracker.C13818e;
import com.mbridge.msdk.tracker.C13826m;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.f */
/* JADX INFO: compiled from: MetricsReportUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13144f {

    /* JADX INFO: renamed from: b */
    private static volatile C13144f f36117b;

    /* JADX INFO: renamed from: a */
    private volatile C13826m f36118a;

    /* JADX INFO: renamed from: a */
    public static C13144f m37354a() {
        if (f36117b == null) {
            synchronized (C13144f.class) {
                if (f36117b == null) {
                    f36117b = new C13144f();
                }
            }
        }
        return f36117b;
    }

    /* JADX INFO: renamed from: b */
    public C13826m m37356b() {
        if (this.f36118a == null) {
            this.f36118a = C13156d.m37475b().m37496d();
        }
        return this.f36118a;
    }

    /* JADX INFO: renamed from: c */
    public void m37357c() {
        m37356b().m41073a();
    }

    /* JADX INFO: renamed from: a */
    public void m37355a(Context context, String str, String str2, String str3, String str4, int i) {
        C13826m c13826mM37356b = m37354a().m37356b();
        if (c13826mM37356b == null) {
            return;
        }
        if (!c13826mM37356b.m41077a("2000105")) {
            C13219q0.m37813a("MetricsReportUtil", "reportClickImpException can not track");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("url", "");
            } else {
                jSONObject.put("url", URLEncoder.encode(str2, C11341A5.f23802O));
            }
            jSONObject.put("type", i);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("rid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("rid_n", str4);
            }
            try {
                long[] jArrM41082e = c13826mM37356b.m41082e();
                jSONObject.put("track_time", jArrM41082e[0]);
                jSONObject.put("track_count", jArrM41082e[1]);
                jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, c13826mM37356b.m41080d());
            } catch (Exception unused) {
            }
            jSONObject.put("reason", URLEncoder.encode(str, C11341A5.f23802O));
            C13818e c13818e = new C13818e("2000105");
            c13818e.m41006a(jSONObject);
            c13818e.m41002a(0);
            c13818e.m41008b(0);
            c13818e.m41004a(C13134c.m37283d());
            c13826mM37356b.m41081d(c13818e);
        } catch (Exception e) {
            C13219q0.m37816b("MetricsReportUtil", e.getMessage());
        }
    }
}
