package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;
import com.facebook.internal.AnalyticsEvents;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import com.ironsource.C11744X3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.l4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1610l4 {

    /* JADX INFO: renamed from: a */
    private final C1748l f2012a;

    /* JADX INFO: renamed from: b */
    private final Context f2013b = C1748l.m4756p();

    /* JADX INFO: renamed from: c */
    private String f2014c;

    public C1610l4(C1748l c1748l) {
        this.f2012a = c1748l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m3123f() {
        if (this.f2014c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f2013b.getResources().openRawResource(C1846R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f2014c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb.append(line);
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
            }
        } catch (Throwable th3) {
            this.f2012a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2012a.m4782Q().m5172a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m3124g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f2013b);
        this.f2012a.m4782Q();
        if (C1768p.m5160a()) {
            C1768p c1768pM4782Q = this.f2012a.m4782Q();
            StringBuilder sb = new StringBuilder("Init ");
            sb.append(m3130d() ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : C11744X3.i.f26392t);
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append("ms");
            c1768pM4782Q.m5171a("OpenMeasurementService", sb.toString());
        }
        m3125h();
    }

    /* JADX INFO: renamed from: h */
    private void m3125h() {
        this.f2012a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f2012a, "OpenMeasurementService", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3123f();
            }
        }), C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: a */
    public String m3126a() {
        return this.f2014c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public String m3127a(String str, Map map) {
        String strInjectScriptContentIntoHtml;
        try {
            if (m3131e()) {
                String strM3225a = AbstractC1620m4.m3225a(this.f2012a, map);
                if (StringUtils.isValidString(strM3225a)) {
                    strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(strM3225a, str);
                } else {
                    strInjectScriptContentIntoHtml = str;
                }
            } else {
                strInjectScriptContentIntoHtml = str;
            }
            return ScriptInjector.injectScriptContentIntoHtml(this.f2014c, strInjectScriptContentIntoHtml);
        } catch (Throwable th) {
            this.f2012a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2012a.m4782Q().m5172a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public Partner m3128b() {
        return Partner.createPartner((String) this.f2012a.m4801a(C1831z4.f3886b0), AppLovinSdk.VERSION);
    }

    /* JADX INFO: renamed from: c */
    public String m3129c() {
        return Omid.getVersion();
    }

    /* JADX INFO: renamed from: d */
    public boolean m3130d() {
        return Omid.isActive();
    }

    /* JADX INFO: renamed from: e */
    public boolean m3131e() {
        String str = this.f2012a.m4847p0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m3132i() {
        if (((Boolean) this.f2012a.m4801a(C1831z4.f3878a0)).booleanValue()) {
            this.f2012a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2012a.m4782Q().m5171a("OpenMeasurementService", "Initializing Open Measurement SDK v" + m3129c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3124g();
                }
            });
        }
    }
}
