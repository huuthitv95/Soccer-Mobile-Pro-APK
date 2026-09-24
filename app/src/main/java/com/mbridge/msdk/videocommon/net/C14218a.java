package com.mbridge.msdk.videocommon.net;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.net.a */
/* JADX INFO: compiled from: RewardSettingController.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14218a {

    /* JADX INFO: renamed from: a */
    private static final String f41080a = "com.mbridge.msdk.videocommon.net.a";

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.net.a$a */
    /* JADX INFO: compiled from: RewardSettingController.java */
    class a extends AbstractC13125d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f41081b;

        a(String str) {
            this.f41081b = str;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37241a(String str) {
            C14222b.m42658b().m42669b(false);
            C13219q0.m37816b(C14218a.f41080a, str);
            C14218a.this.m42628a(2, 2, str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37242a(JSONObject jSONObject) {
            try {
                if (C13229v0.m37899a(jSONObject)) {
                    C14222b.m42658b().m42669b(false);
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strM42674d = C14222b.m42658b().m42674d(this.f41081b);
                        if (!TextUtils.isEmpty(strM42674d)) {
                            try {
                                jSONObject = C13636h.m39706b().m39710a(new JSONObject(strM42674d), jSONObject);
                            } catch (Exception e) {
                                C13219q0.m37816b(C14218a.f41080a, e.getMessage());
                            }
                        }
                    }
                    try {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        C14222b.m42658b().m42678f(this.f41081b, jSONObject.toString());
                    } catch (JSONException e2) {
                        C13219q0.m37816b(C14218a.f41080a, e2.getMessage());
                    }
                } else {
                    C14222b.m42658b().m42677f(this.f41081b);
                }
                C14218a.this.m42628a(1, 2, "");
            } catch (Throwable th) {
                C13219q0.m37816b(C14218a.f41080a, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.net.a$b */
    /* JADX INFO: compiled from: RewardSettingController.java */
    class b extends AbstractC13125d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f41083b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC14220c f41084c;

        /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.net.a$b$a */
        /* JADX INFO: compiled from: RewardSettingController.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ JSONObject f41086a;

            a(JSONObject jSONObject) {
                this.f41086a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                C14222b c14222bM42658b = C14222b.m42658b();
                b bVar = b.this;
                c14222bM42658b.m42664a(bVar.f41083b, bVar.unitId, this.f41086a.toString());
            }
        }

        b(String str, InterfaceC14220c interfaceC14220c) {
            this.f41083b = str;
            this.f41084c = interfaceC14220c;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37241a(String str) {
            try {
                C14222b.m42658b().m42675e(this.unitId);
            } catch (Exception e) {
                C13219q0.m37816b(C14218a.f41080a, e.getMessage());
            }
            if (TextUtils.isEmpty(str)) {
                InterfaceC14220c interfaceC14220c = this.f41084c;
                if (interfaceC14220c != null) {
                    interfaceC14220c.onFailed("request error");
                }
            } else {
                InterfaceC14220c interfaceC14220c2 = this.f41084c;
                if (interfaceC14220c2 != null) {
                    interfaceC14220c2.onFailed(str);
                }
            }
            C14218a.this.m42628a(2, 3, str);
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.AbstractC13125d
        /* JADX INFO: renamed from: a */
        public void mo37242a(JSONObject jSONObject) {
            try {
                try {
                    C14222b.m42658b().m42675e(this.unitId);
                } catch (Exception e) {
                    C13219q0.m37816b(C14218a.f41080a, e.getMessage());
                }
                if (C13229v0.m37899a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strM42667b = C14222b.m42658b().m42667b(this.f41083b, this.unitId);
                        if (!TextUtils.isEmpty(strM42667b)) {
                            try {
                                jSONObject = C13636h.m39706b().m39710a(new JSONObject(strM42667b), jSONObject);
                            } catch (Exception e2) {
                                C13219q0.m37816b(C14218a.f41080a, e2.getMessage());
                            }
                        }
                    }
                    if (C14222b.m42659c(jSONObject.toString())) {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        a aVar = new a(jSONObject);
                        if (C13009d.m36589a().m36605e()) {
                            C13167a.m37543b().execute(aVar);
                        } else {
                            aVar.run();
                        }
                        InterfaceC14220c interfaceC14220c = this.f41084c;
                        if (interfaceC14220c != null) {
                            interfaceC14220c.mo39266a("request success");
                        }
                    } else {
                        InterfaceC14220c interfaceC14220c2 = this.f41084c;
                        if (interfaceC14220c2 != null) {
                            interfaceC14220c2.onFailed("data error");
                        }
                    }
                } else {
                    C14222b.m42658b().m42679g(this.f41083b, this.unitId);
                }
                C14218a.this.m42628a(1, 3, "");
            } catch (Throwable th) {
                C13219q0.m37816b(C14218a.f41080a, th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m42628a(int i, int i2, String str) {
        try {
            C13154c c13154c = new C13154c();
            C13157e c13157e = new C13157e();
            c13157e.m37501a("key", "2000112");
            c13157e.m37501a("st_net", Integer.valueOf(C13121d.m37226h().f36043t));
            c13157e.m37501a("result", Integer.valueOf(i));
            c13157e.m37501a("type", Integer.valueOf(i2));
            c13157e.m37501a("url", C13121d.m37226h().f36042s ? C13121d.m37226h().f36012U : C13121d.m37226h().f36011T);
            c13157e.m37501a("reason", str);
            c13154c.m37423a("2000112", c13157e);
            C13156d.m37475b().m37484a("2000112", c13154c);
        } catch (Throwable th) {
            C13219q0.m37816b(f41080a, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42630a(Context context, String str, String str2) {
        C13126e c13126e = new C13126e();
        c13126e.m37245a("app_id", str);
        c13126e.m37245a("sign", SameMD5.getMD5(str + str2));
        try {
            C14221a c14221aM42672d = C14222b.m42658b().m42672d();
            if (c14221aM42672d == null) {
                c13126e.m37245a("vtag", "");
            } else {
                String strM42654j = c14221aM42672d.m42654j();
                if (TextUtils.isEmpty(strM42654j)) {
                    strM42654j = "";
                }
                c13126e.m37245a("vtag", strM42654j);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(f41080a, th.getMessage());
        }
        new C14219b(context).get(1, C13121d.m37226h().f36011T, c13126e, new a(str), "setting", 60000L);
        m42628a(3, 2, "");
    }

    /* JADX INFO: renamed from: a */
    public void m42631a(Context context, String str, String str2, String str3, InterfaceC14220c interfaceC14220c) {
        C13126e c13126e = new C13126e();
        c13126e.m37245a("app_id", str);
        c13126e.m37245a("sign", SameMD5.getMD5(str + str2));
        c13126e.m37245a("unit_ids", C11744X3.j.f26438d + str3 + C11744X3.j.f26440e);
        try {
            C14223c c14223cM42673d = C14222b.m42658b().m42673d(str, str3);
            if (c14223cM42673d == null) {
                c13126e.m37245a("vtag", "");
            } else {
                String strM42694G = c14223cM42673d.m42694G();
                if (TextUtils.isEmpty(strM42694G)) {
                    strM42694G = "";
                }
                c13126e.m37245a("vtag", strM42694G);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(f41080a, th.getMessage());
        }
        b bVar = new b(str, interfaceC14220c);
        bVar.setUnitId(str3);
        new C14219b(context).get(1, C13121d.m37226h().f36011T, c13126e, bVar, "setting", 60000L);
        m42628a(3, 3, "");
    }
}
