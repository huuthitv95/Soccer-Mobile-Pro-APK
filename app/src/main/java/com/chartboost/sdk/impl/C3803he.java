package com.chartboost.sdk.impl;

import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.ironsource.C11341A5;
import com.ironsource.C11401Db;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.he */
/* JADX INFO: loaded from: classes3.dex */
public class C3803he {

    /* JADX INFO: renamed from: j */
    public static Integer f14398j;

    /* JADX INFO: renamed from: k */
    public static final String f14399k = Build.VERSION.RELEASE;

    /* JADX INFO: renamed from: a */
    public final JSONObject f14400a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f14401b;

    /* JADX INFO: renamed from: c */
    public final JSONArray f14402c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f14403d;

    /* JADX INFO: renamed from: e */
    public final JSONObject f14404e;

    /* JADX INFO: renamed from: f */
    public final JSONObject f14405f;

    /* JADX INFO: renamed from: g */
    public final C3690cg f14406g;

    /* JADX INFO: renamed from: h */
    public final C4190z f14407h;

    /* JADX INFO: renamed from: i */
    public final C3665be f14408i;

    public C3803he(C3690cg c3690cg, C4190z c4190z, C3665be c3665be) {
        f14398j = c3690cg.m17189e();
        this.f14406g = c3690cg;
        this.f14407h = c4190z;
        this.f14408i = c3665be;
        this.f14401b = new JSONObject();
        this.f14402c = new JSONArray();
        this.f14403d = new JSONObject();
        this.f14404e = new JSONObject();
        this.f14405f = new JSONObject();
        this.f14400a = new JSONObject();
        m17891q();
        m17888n();
        m17889o();
        m17887m();
        m17890p();
        m17892r();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m17874a() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        AbstractC4171y2.m20015a(jSONObject, C11540L6.f25010s, obj);
        AbstractC4171y2.m20015a(jSONObject, "lon", obj);
        AbstractC4171y2.m20015a(jSONObject, "country", this.f14406g.f13722c);
        AbstractC4171y2.m20015a(jSONObject, "type", 2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m17875a(C3958o9 c3958o9, C3665be c3665be, C3755fc c3755fc) {
        JSONObject jSONObject = new JSONObject();
        if (c3958o9.m18897d() != null) {
            AbstractC4171y2.m20015a(jSONObject, "appsetid", c3958o9.m18897d());
        }
        if (c3958o9.m18898e() != null) {
            AbstractC4171y2.m20015a(jSONObject, "appsetidscope", c3958o9.m18898e());
        }
        Partner partnerM16929c = c3665be.m16929c();
        if (c3665be.m16933g() && partnerM16929c != null) {
            AbstractC4171y2.m20015a(jSONObject, "omidpn", partnerM16929c.getName());
            AbstractC4171y2.m20015a(jSONObject, "omidpv", partnerM16929c.getVersion());
        }
        if (c3755fc != null) {
            AbstractC4171y2.m20015a(jSONObject, "medtype", c3755fc.m17692d());
            AbstractC4171y2.m20015a(jSONObject, "medversion", c3755fc.m17690b());
            AbstractC4171y2.m20015a(jSONObject, "medadpt", c3755fc.m17689a());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m17876b() {
        C3690cg c3690cg = this.f14406g;
        if (c3690cg != null) {
            return c3690cg.m17190f().m19794d();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m17877c() {
        C3690cg c3690cg = this.f14406g;
        if (c3690cg == null || c3690cg.m17190f().m19793c() == null) {
            return 0;
        }
        return this.f14406g.m17190f().m19793c().intValue();
    }

    /* JADX INFO: renamed from: d */
    public final Collection m17878d() {
        C3690cg c3690cg = this.f14406g;
        return c3690cg != null ? c3690cg.m17190f().m19799i() : new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public final int m17879e() {
        C3690cg c3690cg = this.f14406g;
        if (c3690cg == null || c3690cg.m17190f().m19795e() == null) {
            return 0;
        }
        return this.f14406g.m17190f().m19795e().intValue();
    }

    /* JADX INFO: renamed from: f */
    public final String m17880f() {
        C3690cg c3690cg = this.f14406g;
        if (c3690cg != null) {
            return c3690cg.m17190f().m19791a();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final String m17881g() {
        C3690cg c3690cg = this.f14406g;
        if (c3690cg != null) {
            return c3690cg.m17190f().m19792b();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public JSONObject m17882h() {
        return this.f14400a;
    }

    /* JADX INFO: renamed from: i */
    public final int m17883i() {
        return this.f14406g.m17191g().m18279d().m19428c();
    }

    /* JADX INFO: renamed from: j */
    public final String m17884j() {
        if (this.f14407h.m20084a() == AbstractC3628a0.b.f13429g) {
            C4048sb.m19410b("INTERSTITIAL NOT COMPATIBLE WITH OPENRTB", null);
        } else if (this.f14407h.m20084a() == AbstractC3628a0.c.f13430g) {
            C4048sb.m19410b("REWARDED_VIDEO NOT COMPATIBLE WITH OPENRTB", null);
        }
        return this.f14407h.m20084a().m16771b().toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: k */
    public final String m17885k() {
        C3690cg c3690cg = this.f14406g;
        if (c3690cg != null) {
            return c3690cg.m17190f().m19798h();
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final Integer m17886l() {
        return Integer.valueOf(this.f14407h.m20084a().m16774e() ? 1 : 0);
    }

    /* JADX INFO: renamed from: m */
    public final void m17887m() {
        AbstractC4171y2.m20015a(this.f14403d, "id", this.f14406g.f13727h);
        JSONObject jSONObject = this.f14403d;
        Object obj = JSONObject.NULL;
        AbstractC4171y2.m20015a(jSONObject, "name", obj);
        AbstractC4171y2.m20015a(this.f14403d, "bundle", this.f14406g.f13725f);
        AbstractC4171y2.m20015a(this.f14403d, "storeurl", obj);
        JSONObject jSONObject2 = new JSONObject();
        AbstractC4171y2.m20015a(jSONObject2, "id", obj);
        AbstractC4171y2.m20015a(jSONObject2, "name", obj);
        AbstractC4171y2.m20015a(this.f14403d, C11401Db.f24217b, jSONObject2);
        AbstractC4171y2.m20015a(this.f14403d, "cat", obj);
        AbstractC4171y2.m20015a(this.f14400a, MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f14403d);
    }

    /* JADX INFO: renamed from: n */
    public final void m17888n() {
        C3958o9 c3958o9M17187c = this.f14406g.m17187c();
        AbstractC4171y2.m20015a(this.f14401b, "devicetype", f14398j);
        AbstractC4171y2.m20015a(this.f14401b, "w", Integer.valueOf(this.f14406g.m17185b().m17859c()));
        AbstractC4171y2.m20015a(this.f14401b, CmcdData.Factory.STREAMING_FORMAT_HLS, Integer.valueOf(this.f14406g.m17185b().m17857a()));
        AbstractC4171y2.m20015a(this.f14401b, "ifa", c3958o9M17187c.m18894a());
        AbstractC4171y2.m20015a(this.f14401b, C11540L6.f24914G, f14399k);
        AbstractC4171y2.m20015a(this.f14401b, "lmt", Integer.valueOf(c3958o9M17187c.m18899f().m18685b()));
        AbstractC4171y2.m20015a(this.f14401b, C11341A5.f23814e, Integer.valueOf(m17883i()));
        AbstractC4171y2.m20015a(this.f14401b, C11540L6.f24911F, C11744X3.f26142d);
        AbstractC4171y2.m20015a(this.f14401b, "geo", m17874a());
        AbstractC4171y2.m20015a(this.f14401b, "ip", JSONObject.NULL);
        AbstractC4171y2.m20015a(this.f14401b, "language", this.f14406g.f13723d);
        AbstractC4171y2.m20015a(this.f14401b, C11540L6.f24966d0, C4187yi.f17062b.m20065a());
        AbstractC4171y2.m20015a(this.f14401b, C11540L6.f25013t, this.f14406g.f13730k);
        AbstractC4171y2.m20015a(this.f14401b, C11540L6.f24899B, this.f14406g.f13720a);
        AbstractC4171y2.m20015a(this.f14401b, C11540L6.f24937Q0, this.f14406g.f13733n);
        AbstractC4171y2.m20015a(this.f14401b, "ext", m17875a(c3958o9M17187c, this.f14408i, this.f14406g.m17188d()));
        AbstractC4171y2.m20015a(this.f14400a, C11744X3.i.f26328G, this.f14401b);
    }

    /* JADX INFO: renamed from: o */
    public final void m17889o() {
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        AbstractC4171y2.m20015a(jSONObject, "id", obj);
        JSONObject jSONObject2 = new JSONObject();
        AbstractC4171y2.m20015a(jSONObject2, "w", this.f14407h.m20088e());
        AbstractC4171y2.m20015a(jSONObject2, CmcdData.Factory.STREAMING_FORMAT_HLS, this.f14407h.m20085b());
        AbstractC4171y2.m20015a(jSONObject2, "btype", obj);
        AbstractC4171y2.m20015a(jSONObject2, "battr", obj);
        AbstractC4171y2.m20015a(jSONObject2, "pos", obj);
        AbstractC4171y2.m20015a(jSONObject2, "topframe", obj);
        AbstractC4171y2.m20015a(jSONObject2, "api", obj);
        JSONObject jSONObject3 = new JSONObject();
        AbstractC4171y2.m20015a(jSONObject3, "placementtype", m17884j());
        AbstractC4171y2.m20015a(jSONObject3, "playableonly", obj);
        AbstractC4171y2.m20015a(jSONObject3, "allowscustomclosebutton", obj);
        AbstractC4171y2.m20015a(jSONObject2, "ext", jSONObject3);
        AbstractC4171y2.m20015a(jSONObject, "banner", jSONObject2);
        AbstractC4171y2.m20015a(jSONObject, "instl", m17886l());
        AbstractC4171y2.m20015a(jSONObject, "tagid", this.f14407h.m20087d());
        AbstractC4171y2.m20015a(jSONObject, "displaymanager", "Chartboost-Android-SDK");
        AbstractC4171y2.m20015a(jSONObject, "displaymanagerver", this.f14406g.f13726g);
        AbstractC4171y2.m20015a(jSONObject, "bidfloor", obj);
        AbstractC4171y2.m20015a(jSONObject, "bidfloorcur", "USD");
        AbstractC4171y2.m20015a(jSONObject, "secure", 1);
        this.f14402c.put(jSONObject);
        AbstractC4171y2.m20015a(this.f14400a, "imp", this.f14402c);
    }

    /* JADX INFO: renamed from: p */
    public final void m17890p() {
        Integer numM17876b = m17876b();
        if (numM17876b != null) {
            AbstractC4171y2.m20015a(this.f14404e, COPPA.COPPA_STANDARD, numM17876b);
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC4171y2.m20015a(jSONObject, GDPR.GDPR_STANDARD, Integer.valueOf(m17879e()));
        AbstractC4171y2.m20015a(jSONObject, "gpp", m17881g());
        AbstractC4171y2.m20015a(jSONObject, "gpp_sid", m17880f());
        for (DataUseConsent dataUseConsent : m17878d()) {
            if (!dataUseConsent.getPrivacyStandardName().equals(COPPA.COPPA_STANDARD)) {
                AbstractC4171y2.m20015a(jSONObject, dataUseConsent.getPrivacyStandardName(), dataUseConsent.getConsent());
            }
        }
        AbstractC4171y2.m20015a(this.f14404e, "ext", jSONObject);
        AbstractC4171y2.m20015a(this.f14400a, "regs", this.f14404e);
    }

    /* JADX INFO: renamed from: q */
    public final void m17891q() {
        JSONObject jSONObject = this.f14400a;
        Object obj = JSONObject.NULL;
        AbstractC4171y2.m20015a(jSONObject, "id", obj);
        AbstractC4171y2.m20015a(this.f14400a, "test", obj);
        AbstractC4171y2.m20015a(this.f14400a, BidResponsed.KEY_CUR, new JSONArray().put("USD"));
        AbstractC4171y2.m20015a(this.f14400a, "at", 2);
    }

    /* JADX INFO: renamed from: r */
    public final void m17892r() {
        AbstractC4171y2.m20015a(this.f14405f, "id", JSONObject.NULL);
        AbstractC4171y2.m20015a(this.f14405f, "geo", m17874a());
        String strM17885k = m17885k();
        if (strM17885k != null) {
            AbstractC4171y2.m20015a(this.f14405f, C11744X3.j.f26435b0, strM17885k);
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC4171y2.m20015a(jSONObject, C11744X3.j.f26435b0, Integer.valueOf(m17877c()));
        AbstractC4171y2.m20015a(jSONObject, "impdepth", Integer.valueOf(this.f14407h.m20086c()));
        AbstractC4171y2.m20015a(this.f14405f, "ext", jSONObject);
        AbstractC4171y2.m20015a(this.f14400a, "user", this.f14405f);
    }
}
