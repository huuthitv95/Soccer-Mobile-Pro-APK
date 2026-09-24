package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.C13134c;
import com.mbridge.msdk.foundation.same.report.C13142d;
import com.mbridge.msdk.foundation.same.report.C13151m;
import com.mbridge.msdk.foundation.same.report.C13159n;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.setting.C13629a;
import com.mbridge.msdk.setting.C13632d;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.tracker.C13873p;
import com.mbridge.msdk.tracker.C13878u;
import com.mbridge.msdk.tracker.C13881x;
import com.mbridge.msdk.tracker.network.toolbox.C13858h;
import com.mbridge.msdk.tracker.network.toolbox.C13859i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.d */
/* JADX INFO: compiled from: RequestUrlUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13121d {

    /* JADX INFO: renamed from: A */
    public String f35992A;

    /* JADX INFO: renamed from: B */
    private String f35993B;

    /* JADX INFO: renamed from: C */
    public String f35994C;

    /* JADX INFO: renamed from: D */
    public String f35995D;

    /* JADX INFO: renamed from: E */
    private String f35996E;

    /* JADX INFO: renamed from: F */
    public String f35997F;

    /* JADX INFO: renamed from: G */
    private String f35998G;

    /* JADX INFO: renamed from: H */
    public String f35999H;

    /* JADX INFO: renamed from: I */
    private String f36000I;

    /* JADX INFO: renamed from: J */
    public String f36001J;

    /* JADX INFO: renamed from: K */
    public String f36002K;

    /* JADX INFO: renamed from: L */
    private String f36003L;

    /* JADX INFO: renamed from: M */
    public String f36004M;

    /* JADX INFO: renamed from: N */
    private String f36005N;

    /* JADX INFO: renamed from: O */
    public String f36006O;

    /* JADX INFO: renamed from: P */
    private String f36007P;

    /* JADX INFO: renamed from: Q */
    public String f36008Q;

    /* JADX INFO: renamed from: R */
    public String f36009R;

    /* JADX INFO: renamed from: S */
    private String f36010S;

    /* JADX INFO: renamed from: T */
    public String f36011T;

    /* JADX INFO: renamed from: U */
    public String f36012U;

    /* JADX INFO: renamed from: V */
    private String f36013V;

    /* JADX INFO: renamed from: W */
    public String f36014W;

    /* JADX INFO: renamed from: X */
    public String f36015X;

    /* JADX INFO: renamed from: Y */
    private String f36016Y;

    /* JADX INFO: renamed from: Z */
    public String f36017Z;

    /* JADX INFO: renamed from: a */
    private final String f36018a;

    /* JADX INFO: renamed from: a0 */
    private String f36019a0;

    /* JADX INFO: renamed from: b */
    public String f36020b;

    /* JADX INFO: renamed from: b0 */
    public String f36021b0;

    /* JADX INFO: renamed from: c */
    public String f36022c;

    /* JADX INFO: renamed from: c0 */
    private String f36023c0;

    /* JADX INFO: renamed from: d */
    public String f36024d;

    /* JADX INFO: renamed from: d0 */
    public String f36025d0;

    /* JADX INFO: renamed from: e */
    public String f36026e;

    /* JADX INFO: renamed from: e0 */
    private boolean f36027e0;

    /* JADX INFO: renamed from: f */
    public String f36028f;

    /* JADX INFO: renamed from: f0 */
    private int f36029f0;

    /* JADX INFO: renamed from: g */
    public String f36030g;

    /* JADX INFO: renamed from: h */
    public String f36031h;

    /* JADX INFO: renamed from: i */
    public String f36032i;

    /* JADX INFO: renamed from: j */
    public String f36033j;

    /* JADX INFO: renamed from: k */
    public String f36034k;

    /* JADX INFO: renamed from: l */
    public String f36035l;

    /* JADX INFO: renamed from: m */
    public String f36036m;

    /* JADX INFO: renamed from: n */
    public int f36037n;

    /* JADX INFO: renamed from: o */
    public int f36038o;

    /* JADX INFO: renamed from: p */
    public int f36039p;

    /* JADX INFO: renamed from: q */
    public int f36040q;

    /* JADX INFO: renamed from: r */
    public boolean f36041r;

    /* JADX INFO: renamed from: s */
    public boolean f36042s;

    /* JADX INFO: renamed from: t */
    public int f36043t;

    /* JADX INFO: renamed from: u */
    public ArrayList<String> f36044u;

    /* JADX INFO: renamed from: v */
    public int f36045v;

    /* JADX INFO: renamed from: w */
    public int f36046w;

    /* JADX INFO: renamed from: x */
    public ArrayList<String> f36047x;

    /* JADX INFO: renamed from: y */
    public String f36048y;

    /* JADX INFO: renamed from: z */
    private String f36049z;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.d$b */
    /* JADX INFO: compiled from: RequestUrlUtil.java */
    private static class b {

        /* JADX INFO: renamed from: a */
        private static final C13121d f36050a = new C13121d();
    }

    /* JADX INFO: renamed from: a */
    private boolean m37221a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    /* JADX INFO: renamed from: b */
    private void m37223b() {
        this.f36004M = this.f36028f + this.f36003L;
    }

    /* JADX INFO: renamed from: c */
    private void m37224c() {
        this.f35992A = this.f36048y + this.f36049z;
        this.f35999H = this.f36048y + this.f35998G;
        C13859i.m41292b().m41303f(this.f36048y);
    }

    /* JADX INFO: renamed from: h */
    public static C13121d m37226h() {
        return b.f36050a;
    }

    /* JADX INFO: renamed from: d */
    public void m37232d(int i) {
        this.f36029f0 = i;
    }

    /* JADX INFO: renamed from: e */
    public void m37233e() {
        this.f36008Q = this.f36032i + this.f36007P;
        this.f35994C = this.f36032i + this.f35993B;
        this.f36011T = this.f36032i + this.f36010S;
        this.f36001J = this.f36032i + this.f36000I;
        this.f36014W = this.f36032i + this.f36013V;
    }

    /* JADX INFO: renamed from: f */
    public void m37234f() {
        this.f36009R = this.f36036m + this.f36007P;
        this.f35995D = this.f36036m + this.f35993B;
        this.f36012U = this.f36036m + this.f36010S;
        this.f36002K = this.f36036m + this.f36000I;
        this.f36015X = this.f36036m + this.f36013V;
    }

    /* JADX INFO: renamed from: g */
    public boolean m37235g() {
        try {
            if (this.f36042s) {
                ArrayList<String> arrayList = this.f36047x;
                if (arrayList != null && this.f36046w <= arrayList.size() - 1) {
                    if (!m37221a(this.f36047x.get(this.f36046w))) {
                        this.f36036m = this.f36047x.get(this.f36046w);
                        m37234f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f36044u;
                if (arrayList2 != null && this.f36045v <= arrayList2.size() - 1) {
                    this.f36032i = this.f36044u.get(this.f36045v);
                    m37233e();
                    return true;
                }
            }
            if (this.f36041r) {
                this.f36045v = 0;
                this.f36046w = 0;
            }
            return false;
        } catch (Throwable th) {
            C13219q0.m37813a("RequestUrlUtil", th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public int m37236i() {
        return this.f36029f0;
    }

    /* JADX INFO: renamed from: j */
    public void m37237j() {
        HashMap<String, String> mapM39398D;
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d != null) {
            C13629a c13629aM39523j = c13635gM39718d.m39523j();
            if (c13629aM39523j != null) {
                this.f36035l = c13629aM39523j.m39378f();
                this.f36039p = c13629aM39523j.m39380g();
                this.f36031h = c13629aM39523j.m39376e();
                m37219a();
            }
            C13632d c13632dM39587z = c13635gM39718d.m39587z();
            if (c13632dM39587z != null) {
                this.f36034k = c13632dM39587z.m39691d();
                this.f36038o = c13632dM39587z.m39693e();
                this.f36028f = c13632dM39587z.m39688c();
                m37223b();
                m37220a(c13635gM39718d);
            }
            this.f36042s = c13635gM39718d.m39558r0() == 2;
            this.f36043t = c13635gM39718d.m39558r0();
            m37229a(!c13635gM39718d.m39476b(2));
            if (c13635gM39718d.m39398D() != null && c13635gM39718d.m39398D().size() > 0 && (mapM39398D = c13635gM39718d.m39398D()) != null && mapM39398D.size() > 0) {
                if (mapM39398D.containsKey("v") && !TextUtils.isEmpty(mapM39398D.get("v")) && m37221a(mapM39398D.get("v"))) {
                    this.f36026e = mapM39398D.get("v");
                    m37225d();
                }
                if (mapM39398D.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapM39398D.get(CampaignEx.JSON_KEY_HB)) && m37221a(mapM39398D.get(CampaignEx.JSON_KEY_HB))) {
                    this.f36048y = mapM39398D.get(CampaignEx.JSON_KEY_HB);
                    m37224c();
                }
                if (mapM39398D.containsKey("lg") && !TextUtils.isEmpty(mapM39398D.get("lg"))) {
                    String str = mapM39398D.get("lg");
                    if (m37221a(str)) {
                        this.f36024d = str;
                    } else {
                        this.f36033j = str;
                    }
                }
                if (mapM39398D.containsKey("lgt") && !TextUtils.isEmpty(mapM39398D.get("lgt"))) {
                    String str2 = mapM39398D.get("lgt");
                    if (m37221a(str2)) {
                        String strM37222b = m37222b(str2);
                        if (!TextUtils.isEmpty(strM37222b)) {
                            this.f36033j = strM37222b;
                        }
                    } else {
                        this.f36033j = str2;
                    }
                }
            }
            String strM39571v = c13635gM39718d.m39571v();
            if (!TextUtils.isEmpty(strM39571v)) {
                this.f36032i = strM39571v;
                m37233e();
                this.f36044u.add(0, strM39571v);
            }
            String strM39575w = c13635gM39718d.m39575w();
            if (TextUtils.isEmpty(strM39575w)) {
                return;
            }
            this.f36036m = strM39575w;
            m37234f();
            this.f36047x.add(0, strM39575w);
        }
    }

    private C13121d() {
        this.f36018a = "RequestUrlUtil";
        this.f36020b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f36022c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f36024d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f36026e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f36028f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f36030g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f36031h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f36032i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f36033j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f36034k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f36035l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f36036m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f36037n = 9377;
        this.f36038o = 9377;
        this.f36039p = 9988;
        this.f36040q = 9377;
        this.f36041r = false;
        this.f36042s = false;
        this.f36043t = 1;
        this.f36044u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f36045v = 0;
        this.f36046w = 0;
        this.f36047x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f36048y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f36049z = "/bid";
        this.f35992A = this.f36048y + this.f36049z;
        this.f35993B = "/sdk/customid";
        this.f35994C = this.f36032i + this.f35993B;
        this.f35995D = this.f36036m + this.f35993B;
        this.f35996E = "/image";
        this.f35997F = this.f36026e + this.f35996E;
        this.f35998G = "/load";
        this.f35999H = this.f36048y + this.f35998G;
        this.f36000I = "/mapping";
        this.f36001J = this.f36032i + this.f36000I;
        this.f36002K = this.f36036m + this.f36000I;
        this.f36003L = "";
        this.f36004M = this.f36031h + this.f36003L;
        this.f36005N = "/batchPaidEvent";
        this.f36006O = this.f36031h + this.f36005N;
        this.f36007P = "/setting";
        this.f36008Q = this.f36032i + this.f36007P;
        this.f36009R = this.f36036m + this.f36007P;
        this.f36010S = "/rewardsetting";
        this.f36011T = this.f36032i + this.f36010S;
        this.f36012U = this.f36036m + this.f36010S;
        this.f36013V = "/appwall/setting";
        this.f36014W = this.f36032i + this.f36013V;
        this.f36015X = this.f36036m + this.f36013V;
        this.f36016Y = "/openapi/ad/v3";
        this.f36017Z = this.f36026e + this.f36016Y;
        this.f36019a0 = "/openapi/ad/v4";
        this.f36021b0 = this.f36026e + this.f36019a0;
        this.f36023c0 = "/openapi/ad/v5";
        this.f36025d0 = this.f36026e + this.f36023c0;
        this.f36027e0 = true;
        this.f36029f0 = 0;
    }

    /* JADX INFO: renamed from: b */
    private String m37222b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th) {
            C13219q0.m37816b("RequestUrlUtil", th.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    private void m37225d() {
        this.f36017Z = this.f36026e + this.f36016Y;
        this.f36021b0 = this.f36026e + this.f36019a0;
        this.f36025d0 = this.f36026e + this.f36023c0;
        this.f35997F = this.f36026e + this.f35996E;
    }

    /* JADX INFO: renamed from: c */
    public void m37231c(int i) {
        this.f36040q = i;
    }

    /* JADX INFO: renamed from: a */
    public String m37227a(String str, int i) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return m37228a(true, strArrSplit[1]);
                }
                return m37228a(true, "");
            }
        } catch (Exception e) {
            C13219q0.m37816b("RequestUrlUtil", e.getMessage());
        }
        return i % 2 == 0 ? this.f36025d0 : this.f36017Z;
    }

    /* JADX INFO: renamed from: b */
    public void m37230b(int i) {
        this.f36037n = i;
    }

    /* JADX INFO: renamed from: a */
    public String m37228a(boolean z, String str) {
        if (z) {
            if (this.f35999H.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.f35999H.replace(JsonUtils.EMPTY_JSON, str + "-");
            }
            return this.f35999H.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.f35992A.replace(JsonUtils.EMPTY_JSON, "");
    }

    /* JADX INFO: renamed from: a */
    public void m37229a(boolean z) {
        this.f36027e0 = z;
    }

    /* JADX INFO: renamed from: a */
    private void m37219a() {
        this.f36006O = this.f36031h + this.f36005N;
    }

    /* JADX INFO: renamed from: a */
    private void m37220a(C13635g c13635g) {
        C13632d c13632dM39587z;
        if (c13635g == null || (c13632dM39587z = c13635g.m39587z()) == null || c13632dM39587z.m39683a() == 1) {
            return;
        }
        int iM37844b = C13223s0.m37831a().m37844b("monitor", "type", C13223s0.m37831a().m37843b("t_r_t", 1));
        if (iM37844b != 0 && iM37844b != 1) {
            iM37844b = 0;
        }
        C13878u.m41380a().m41383a(C13008c.m36588n().m36542d(), new C13881x.b().m41403a(new C13142d()).m41405a(new C13159n()).m41402a(iM37844b, m37218a(iM37844b)).m41401a(C13223s0.m37831a().m37843b("t_m_e_t", 604800000)).m41407b(C13223s0.m37831a().m37843b("t_m_e_s", 50)).m41409d(C13223s0.m37831a().m37843b("t_m_r_c", 50)).m41408c(C13223s0.m37831a().m37843b("t_m_t", 15000)).m41410e(C13223s0.m37831a().m37843b("t_m_r_t_s", 1)).m41406a(), c13632dM39587z.m39685b() * 1000, C13134c.m37281b());
    }

    /* JADX INFO: renamed from: a */
    private C13873p m37218a(int i) {
        if (i == 1) {
            return new C13873p(new C13151m((byte) 2), m37226h().f36034k, m37226h().f36038o);
        }
        return new C13873p(new C13858h(), m37226h().f36004M, 0);
    }
}
