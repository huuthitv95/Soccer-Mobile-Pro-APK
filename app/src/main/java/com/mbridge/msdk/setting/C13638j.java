package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d;
import com.mbridge.msdk.foundation.same.net.wrapper.C13124c;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13199g0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.setting.net.C13643c;
import com.mbridge.msdk.setting.util.C13645a;
import com.mbridge.msdk.setting.util.C13646b;
import com.vungle.ads.internal.signals.SignalManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.j */
/* JADX INFO: compiled from: SettingRequestController.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13638j {

    /* JADX INFO: renamed from: a */
    private static final String f38103a = "j";

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.j$a */
    /* JADX INFO: compiled from: SettingRequestController.java */
    class a extends AbstractC13125d {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37241a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37242a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(AbstractC13068b.JSON_KEY_C_I)) {
                return;
            }
            try {
                C13199g0.m37691a().m37692a(jSONObject.getString(AbstractC13068b.JSON_KEY_C_I));
            } catch (Exception e) {
                C13219q0.m37816b(C13638j.f38103a, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.j$b */
    /* JADX INFO: compiled from: SettingRequestController.java */
    class b extends AbstractC13125d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f38105b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Context f38106c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f38107d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, Context context, String str4) {
            super(str, str2);
            this.f38105b = str3;
            this.f38106c = context;
            this.f38107d = str4;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37241a(String str) {
            try {
                C13638j.this.m39735a(2, 0, str);
            } catch (Throwable th) {
                C13219q0.m37816b(C13638j.f38103a, th.getMessage());
            }
            if (C13121d.m37226h().f36042s) {
                C13121d.m37226h().f36046w++;
            } else {
                C13121d.m37226h().f36045v++;
            }
            C13638j.this.m39737a(this.f38106c, this.f38105b, this.f38107d);
            C13638j.this.m39743c();
            C13219q0.m37816b(C13638j.f38103a, "get app setting error" + str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37242a(JSONObject jSONObject) {
            try {
                C13638j.this.m39735a(1, 0, "");
            } catch (Throwable th) {
                C13219q0.m37816b(C13638j.f38103a, th.getMessage());
            }
            try {
                if (C13229v0.m37899a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strM39721e = C13636h.m39706b().m39721e(this.f38105b);
                        if (!TextUtils.isEmpty(strM39721e)) {
                            try {
                                jSONObject = C13636h.m39706b().m39710a(new JSONObject(strM39721e), jSONObject);
                            } catch (Exception e) {
                                C13219q0.m37816b(C13638j.f38103a, e.getMessage());
                            }
                        }
                    }
                    C13639k.m39750a(jSONObject);
                    jSONObject.put("current_time", System.currentTimeMillis());
                    if (C13121d.m37226h().f36042s) {
                        if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                            jSONObject.put("hst_st_t", C13121d.m37226h().f36036m);
                        }
                    } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                        jSONObject.put("hst_st", C13121d.m37226h().f36032i);
                    }
                    C13636h.m39706b().m39727h(this.f38105b, jSONObject.toString());
                    C13121d.m37226h().m37237j();
                    C13639k.m39749a();
                    try {
                        if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                            C13645a.m39758a().m39763a(this.f38106c, jSONObject.optString("mraid_js"));
                        }
                    } catch (Exception e2) {
                        C13219q0.m37816b(C13638j.f38103a, e2.getMessage());
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                        C13646b.m39770c().m39772a(this.f38106c, jSONObject.optString("web_env_url"));
                    }
                    C13638j.this.m39736a(this.f38106c, this.f38105b);
                } else {
                    C13636h.m39706b().m39728i(this.f38105b);
                }
                C13638j.this.m39743c();
            } catch (Exception e3) {
                C13219q0.m37816b(C13638j.f38103a, e3.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.j$c */
    /* JADX INFO: compiled from: SettingRequestController.java */
    class c extends AbstractC13115a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f38109b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f38110c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f38111d;

        c(Context context, String str, String str2) {
            this.f38109b = context;
            this.f38110c = str;
            this.f38111d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a
        /* JADX INFO: renamed from: a */
        public void mo37204a(String str) {
            C13121d.m37226h().f36041r = false;
            C13219q0.m37813a(C13638j.f38103a, "fetch CNDSettingHost failed, errorCode = " + str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a
        /* JADX INFO: renamed from: b */
        public void mo37205b(String str) {
            C13219q0.m37813a(C13638j.f38103a, "fetch CNDSettingHost success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C12998a.m36460b().m36463a("mkey_spare_host_ts", System.currentTimeMillis());
            C12998a.m36460b().m36464a("mkey_spare_host", str);
            for (String str2 : str.split("\n")) {
                if (!TextUtils.isEmpty(str2.trim()) && !C13121d.m37226h().f36044u.contains(str2.trim())) {
                    C13121d.m37226h().f36044u.add(str2.trim());
                    C13121d.m37226h().f36047x.add(str2.trim());
                }
            }
            C13638j.this.m39737a(this.f38109b, this.f38110c, this.f38111d);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.j$d */
    /* JADX INFO: compiled from: SettingRequestController.java */
    class d extends AbstractC13125d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f38113b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f38114c;

        d(String str, String str2) {
            this.f38113b = str;
            this.f38114c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37241a(String str) {
            C13638j.this.m39735a(2, 1, "");
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37242a(JSONObject jSONObject) {
            try {
                if (C13229v0.m37899a(jSONObject)) {
                    String strOptString = jSONObject.optString("vtag", "");
                    String strOptString2 = jSONObject.optString("rid", "");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strM39723f = C13636h.m39706b().m39723f(this.f38113b, this.f38114c);
                            if (!TextUtils.isEmpty(strM39723f)) {
                                try {
                                    jSONObjectOptJSONObject = C13636h.m39706b().m39710a(new JSONObject(strM39723f), jSONObjectOptJSONObject);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        jSONObjectOptJSONObject.put("current_time", System.currentTimeMillis());
                        jSONObjectOptJSONObject.put("vtag", strOptString);
                        jSONObjectOptJSONObject.put("rid", strOptString2);
                        C13636h.m39706b().m39712a(this.f38113b, this.f38114c, jSONObjectOptJSONObject.toString());
                    }
                } else {
                    C13636h.m39706b().m39730j(this.f38113b, this.f38114c);
                }
                C13638j.this.m39735a(1, 1, "");
            } catch (Exception e2) {
                C13219q0.m37816b(C13638j.f38103a, e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39735a(int i, int i2, String str) {
        String strM39742b;
        try {
            C13154c c13154c = new C13154c();
            C13157e c13157e = new C13157e();
            c13157e.m37501a("key", "2000112");
            c13157e.m37501a("st_net", Integer.valueOf(C13121d.m37226h().f36043t));
            c13157e.m37501a("result", Integer.valueOf(i));
            c13157e.m37501a("type", Integer.valueOf(i2));
            if (i2 == 0) {
                strM39742b = m39742b();
            } else {
                strM39742b = C13121d.m37226h().f36042s ? C13121d.m37226h().f36009R : C13121d.m37226h().f36008Q;
            }
            c13157e.m37501a("url", strM39742b);
            c13157e.m37501a("reason", str);
            c13154c.m37423a("2000112", c13157e);
            C13156d.m37475b().m37484a("2000112", c13154c);
        } catch (Throwable th) {
            C13219q0.m37816b(f38103a, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39736a(Context context, String str) {
        C13635g c13635gM39718d;
        C13636h c13636hM39706b = C13636h.m39706b();
        if (c13636hM39706b != null && (c13635gM39718d = c13636hM39706b.m39718d(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = c13635gM39718d.m39446V();
            MBridgeConstans.OMID_JS_H5_URL = c13635gM39718d.m39444U();
        }
        C13439b.m38952b(context);
        C13439b.m38954c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39737a(Context context, String str, String str2) {
        if (C13121d.m37226h().m37235g()) {
            m39746b(context, str, str2);
        } else {
            m39748d(context, str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    private String m39742b() {
        String str = C13121d.m37226h().f36042s ? C13121d.m37226h().f36009R : C13121d.m37226h().f36008Q;
        try {
            if (C13121d.m37226h().f36042s && C13121d.m37226h().f36041r && C13121d.m37226h().f36046w < C13121d.m37226h().f36047x.size()) {
                String str2 = C13121d.m37226h().f36047x.get(C13121d.m37226h().f36046w);
                if (!TextUtils.isEmpty(str2) && (str2.startsWith(ProxyConfig.MATCH_HTTP) || str2.startsWith("https"))) {
                    return str2 + "/setting";
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b(f38103a, th.getMessage());
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m39743c() {
        try {
            new C13146h(C13008c.m36588n().m36542d()).m37365a();
        } catch (Throwable th) {
            C13219q0.m37816b(f38103a, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39744a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = C13008c.m36588n().m36533b();
            str2 = C13008c.m36588n().m36538c();
        }
        if (C13636h.m39706b().m39725g(str3, str) && C13636h.m39706b().m39713a(str, 2, str3)) {
            C13126e c13126e = new C13126e();
            String str4 = C11744X3.j.f26438d + str3 + C11744X3.j.f26440e;
            c13126e.m37245a("unit_ids", str4);
            c13126e.m37245a("app_id", str);
            c13126e.m37245a("sign", SameMD5.getMD5(str + str2));
            try {
                String strM39613J = C13636h.m39706b().m39719d(str, str4).m39613J();
                if (TextUtils.isEmpty(strM39613J)) {
                    strM39613J = "";
                }
                c13126e.m37245a("vtag", strM39613J);
            } catch (Throwable th) {
                C13219q0.m37816b(f38103a, th.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new C13643c(context).get(1, C13121d.m37226h().f36008Q, c13126e, dVar, "setting", 60000L);
            m39735a(3, 1, "");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39745a(Context context, String str, String str2, String str3, AbstractC13125d abstractC13125d) {
        if (context == null) {
            return;
        }
        C13126e c13126e = new C13126e();
        c13126e.m37245a("app_id", str);
        c13126e.m37245a("sign", SameMD5.getMD5(str + str2));
        try {
            C13635g c13635gM39714b = C13636h.m39706b().m39714b(str);
            String strM39590z0 = c13635gM39714b.m39590z0();
            if (TextUtils.isEmpty(strM39590z0)) {
                strM39590z0 = "";
            }
            c13126e.m37245a("vtag", strM39590z0);
            c13126e.m37245a("current_pipeline_id", String.valueOf(c13635gM39714b.m39468a0()));
            c13126e.m37245a("p_p_c_id", String.valueOf(c13635gM39714b.m39499e0()));
            c13126e.m37245a("c_m_l_id", String.valueOf(c13635gM39714b.m39543o()));
        } catch (Throwable th) {
            C13219q0.m37816b(f38103a, th.getMessage());
        }
        if (C13121d.m37226h().f36041r) {
            c13126e.m37245a("st_net", C13121d.m37226h().f36043t + "");
        }
        c13126e.m37245a("only_p_info", str3);
        C13643c c13643c = new C13643c(context);
        String str4 = C13121d.m37226h().f36008Q;
        try {
            if (C13121d.m37226h().f36042s && C13121d.m37226h().f36041r && C13121d.m37226h().f36046w < C13121d.m37226h().f36047x.size()) {
                String str5 = C13121d.m37226h().f36047x.get(C13121d.m37226h().f36046w);
                if (!TextUtils.isEmpty(str5) && (str5.startsWith(ProxyConfig.MATCH_HTTP) || str5.startsWith("https"))) {
                    str4 = str5 + "/setting";
                }
            }
        } catch (Throwable th2) {
            C13219q0.m37816b(f38103a, th2.getMessage());
        }
        c13643c.get(1, str4, c13126e, abstractC13125d, "setting", 60000L);
    }

    /* JADX INFO: renamed from: b */
    public void m39746b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        m39745a(context, str, str2, "0", new b(SameMD5.getMD5(C13229v0.m37920d()), C13636h.m39706b().m39722f(str), str, context, str2));
        m39735a(3, 0, "");
    }

    /* JADX INFO: renamed from: c */
    public void m39747c(Context context, String str, String str2) {
        m39745a(context, str, str2, "1", new a());
    }

    /* JADX INFO: renamed from: d */
    public void m39748d(Context context, String str, String str2) {
        try {
            if (C13121d.m37226h().f36041r) {
                return;
            }
            C13121d.m37226h().f36041r = true;
            if (System.currentTimeMillis() >= C12998a.m36460b().m36465b("mkey_spare_host_ts").longValue() + SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
                String strM36462a = C12998a.m36460b().m36462a("mkey_spare_host");
                if (!TextUtils.isEmpty(strM36462a)) {
                    for (String str3 : strM36462a.split("\n")) {
                        if (!TextUtils.isEmpty(str3.trim()) && !C13121d.m37226h().f36044u.contains(str3.trim())) {
                            C13121d.m37226h().f36044u.add(str3.trim());
                            C13121d.m37226h().f36047x.add(str3.trim());
                        }
                    }
                    m39737a(context, str, str2);
                    return;
                }
            }
            new C13124c(context.getApplicationContext()).get(0, C13121d.m37226h().f36022c, new C13126e(), new c(context, str, str2), "setting", 60000L);
        } catch (Throwable th) {
            C13121d.m37226h().f36041r = false;
            C13219q0.m37816b(f38103a, th.getMessage());
        }
    }
}
