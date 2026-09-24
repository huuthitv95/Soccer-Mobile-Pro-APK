package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11341A5;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3974p3 extends C3792h3 {

    /* JADX INFO: renamed from: u */
    public final JSONObject f15772u;

    /* JADX INFO: renamed from: v */
    public final JSONObject f15773v;

    /* JADX INFO: renamed from: w */
    public final JSONObject f15774w;

    /* JADX INFO: renamed from: x */
    public final JSONObject f15775x;

    /* JADX INFO: renamed from: y */
    public final JSONObject f15776y;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.p3$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15777a;

        static {
            int[] iArr = new int[EnumC3922mi.values().length];
            try {
                iArr[EnumC3922mi.TRACKING_LIMITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3922mi.TRACKING_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15777a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3974p3(AbstractC3654b3.c method, String host, String path, C3690cg requestBodyFields, EnumC4095ue priority, String str, C3792h3.a aVar, InterfaceC3888l7 eventTracker, C4031rg session) {
        super(method, host, path, requestBodyFields, priority, str, aVar, eventTracker, session);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBodyFields, "requestBodyFields");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.f15772u = new JSONObject();
        this.f15773v = new JSONObject();
        this.f15774w = new JSONObject();
        this.f15775x = new JSONObject();
        this.f15776y = new JSONObject();
    }

    /* JADX INFO: renamed from: a */
    public final void m19012a(C4139we c4139we) {
        String strM19798h = c4139we.m19798h();
        if (strM19798h != null) {
            AbstractC4171y2.m20015a(this.f15774w, C11744X3.j.f26435b0, strM19798h);
        }
        AbstractC4171y2.m20015a(this.f15774w, "pidatauseconsent", c4139we.m19796f());
        JSONObject jSONObjectM19797g = c4139we.m19797g();
        if (jSONObjectM19797g != null) {
            try {
                jSONObjectM19797g.put("gpp", c4139we.m19792b());
                jSONObjectM19797g.put("gpp_sid", c4139we.m19791a());
            } catch (JSONException e) {
                C4048sb.m19410b("Failed to add GPP and/or GPP SID to request body", e);
            }
            AbstractC4171y2.m20015a(this.f15774w, ShareConstants.WEB_DIALOG_PARAM_PRIVACY, jSONObjectM19797g);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19013b(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        AbstractC4171y2.m20015a(this.f15775x, key, obj);
        m17833a("ad", this.f15775x);
    }

    /* JADX INFO: renamed from: c */
    public final void m19014c(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        AbstractC4171y2.m20015a(this.f15772u, key, obj);
        m17833a("sdk", this.f15772u);
    }

    @Override // com.chartboost.sdk.impl.C3792h3
    /* JADX INFO: renamed from: f */
    public void mo17807f() {
        m19016m();
        m19017n();
        m19018o();
        m19020q();
        m19015l();
    }

    /* JADX INFO: renamed from: l */
    public final void m19015l() {
        JSONObject jSONObject = this.f15775x;
        C3690cg c3690cgM17842j = m17842j();
        AbstractC4171y2.m20015a(jSONObject, "session", c3690cgM17842j != null ? Integer.valueOf(c3690cgM17842j.m17193i()) : null);
        if (this.f15775x.isNull("cache")) {
            AbstractC4171y2.m20015a(this.f15775x, "cache", Boolean.FALSE);
        }
        if (this.f15775x.isNull("amount")) {
            AbstractC4171y2.m20015a(this.f15775x, "amount", 0);
        }
        if (this.f15775x.isNull("retry_count")) {
            AbstractC4171y2.m20015a(this.f15775x, "retry_count", 0);
        }
        if (this.f15775x.isNull(FirebaseAnalytics.Param.LOCATION)) {
            AbstractC4171y2.m20015a(this.f15775x, FirebaseAnalytics.Param.LOCATION, "");
        }
        m17833a("ad", this.f15775x);
    }

    /* JADX INFO: renamed from: m */
    public final void m19016m() {
        JSONObject jSONObject = this.f15773v;
        C3690cg c3690cgM17842j = m17842j();
        AbstractC4171y2.m20015a(jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP, c3690cgM17842j != null ? c3690cgM17842j.f13727h : null);
        JSONObject jSONObject2 = this.f15773v;
        C3690cg c3690cgM17842j2 = m17842j();
        AbstractC4171y2.m20015a(jSONObject2, "bundle", c3690cgM17842j2 != null ? c3690cgM17842j2.f13724e : null);
        JSONObject jSONObject3 = this.f15773v;
        C3690cg c3690cgM17842j3 = m17842j();
        AbstractC4171y2.m20015a(jSONObject3, "bundle_id", c3690cgM17842j3 != null ? c3690cgM17842j3.f13725f : null);
        AbstractC4171y2.m20015a(this.f15773v, SDKAnalyticsEvents.PARAMETER_SESSION_ID, "");
        AbstractC4171y2.m20015a(this.f15773v, "ui", -1);
        AbstractC4171y2.m20015a(this.f15773v, "test_mode", Boolean.FALSE);
        m17833a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.f15773v);
    }

    /* JADX INFO: renamed from: n */
    public final void m19017n() {
        AbstractC4171y2.m20015a(this.f15776y, MBridgeConstans.DYNAMIC_VIEW_WX_APP, AbstractC4171y2.m20014a(AbstractC4171y2.m20012a("ver", C3773g7.f14286a.m17775b())));
        m17833a("bidrequest", this.f15776y);
    }

    /* JADX INFO: renamed from: o */
    public final void m19018o() {
        C3795h6 c3795h6M17185b;
        C3795h6 c3795h6M17185b2;
        C3795h6 c3795h6M17185b3;
        C3795h6 c3795h6M17185b4;
        C3795h6 c3795h6M17185b5;
        C3850jf c3850jfM17191g;
        EnumC4050sd enumC4050sdM18279d;
        C3795h6 c3795h6M17185b6;
        C3795h6 c3795h6M17185b7;
        C3850jf c3850jfM17191g2;
        C3944nh c3944nhM17194j;
        C3690cg c3690cgM17842j = m17842j();
        JSONObject jSONObject = c3690cgM17842j != null ? c3690cgM17842j.f13732m : null;
        AbstractC4171y2.a[] aVarArr = new AbstractC4171y2.a[5];
        aVarArr[0] = AbstractC4171y2.m20012a("carrier_name", jSONObject != null ? jSONObject.optString("carrier-name") : null);
        aVarArr[1] = AbstractC4171y2.m20012a("mobile_country_code", jSONObject != null ? jSONObject.optString("mobile-country-code") : null);
        aVarArr[2] = AbstractC4171y2.m20012a("mobile_network_code", jSONObject != null ? jSONObject.optString("mobile-network-code") : null);
        aVarArr[3] = AbstractC4171y2.m20012a("iso_country_code", jSONObject != null ? jSONObject.optString("iso-country-code") : null);
        aVarArr[4] = AbstractC4171y2.m20012a("phone_type", jSONObject != null ? Integer.valueOf(jSONObject.optInt("phone-type")) : null);
        AbstractC4171y2.m20015a(this.f15774w, C11540L6.f24937Q0, AbstractC4171y2.m20014a(aVarArr));
        JSONObject jSONObject2 = this.f15774w;
        C3690cg c3690cgM17842j2 = m17842j();
        AbstractC4171y2.m20015a(jSONObject2, C11540L6.f24899B, c3690cgM17842j2 != null ? c3690cgM17842j2.f13720a : null);
        JSONObject jSONObject3 = this.f15774w;
        C3690cg c3690cgM17842j3 = m17842j();
        AbstractC4171y2.m20015a(jSONObject3, C11540L6.f25013t, c3690cgM17842j3 != null ? c3690cgM17842j3.f13730k : null);
        JSONObject jSONObject4 = this.f15774w;
        C3690cg c3690cgM17842j4 = m17842j();
        AbstractC4171y2.m20015a(jSONObject4, "device_type", c3690cgM17842j4 != null ? c3690cgM17842j4.f13729j : null);
        JSONObject jSONObject5 = this.f15774w;
        C3690cg c3690cgM17842j5 = m17842j();
        AbstractC4171y2.m20015a(jSONObject5, "actual_device_type", c3690cgM17842j5 != null ? c3690cgM17842j5.f13731l : null);
        JSONObject jSONObject6 = this.f15774w;
        C3690cg c3690cgM17842j6 = m17842j();
        AbstractC4171y2.m20015a(jSONObject6, C11540L6.f24911F, c3690cgM17842j6 != null ? c3690cgM17842j6.f13721b : null);
        JSONObject jSONObject7 = this.f15774w;
        C3690cg c3690cgM17842j7 = m17842j();
        AbstractC4171y2.m20015a(jSONObject7, "country", c3690cgM17842j7 != null ? c3690cgM17842j7.f13722c : null);
        JSONObject jSONObject8 = this.f15774w;
        C3690cg c3690cgM17842j8 = m17842j();
        AbstractC4171y2.m20015a(jSONObject8, "language", c3690cgM17842j8 != null ? c3690cgM17842j8.f13723d : null);
        C3690cg c3690cgM17842j9 = m17842j();
        AbstractC4171y2.m20015a(this.f15774w, "timestamp", (c3690cgM17842j9 == null || (c3944nhM17194j = c3690cgM17842j9.m17194j()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(c3944nhM17194j.m18803a())));
        JSONObject jSONObject9 = this.f15774w;
        C3690cg c3690cgM17842j10 = m17842j();
        AbstractC4171y2.m20015a(jSONObject9, "reachability", (c3690cgM17842j10 == null || (c3850jfM17191g2 = c3690cgM17842j10.m17191g()) == null) ? null : c3850jfM17191g2.m18277b());
        JSONObject jSONObject10 = this.f15774w;
        C3690cg c3690cgM17842j11 = m17842j();
        AbstractC4171y2.m20015a(jSONObject10, "is_portrait", (c3690cgM17842j11 == null || (c3795h6M17185b7 = c3690cgM17842j11.m17185b()) == null) ? null : Boolean.valueOf(c3795h6M17185b7.m17867k()));
        JSONObject jSONObject11 = this.f15774w;
        C3690cg c3690cgM17842j12 = m17842j();
        AbstractC4171y2.m20015a(jSONObject11, "scale", (c3690cgM17842j12 == null || (c3795h6M17185b6 = c3690cgM17842j12.m17185b()) == null) ? null : Float.valueOf(c3795h6M17185b6.m17864h()));
        JSONObject jSONObject12 = this.f15774w;
        C3690cg c3690cgM17842j13 = m17842j();
        AbstractC4171y2.m20015a(jSONObject12, "timezone", c3690cgM17842j13 != null ? c3690cgM17842j13.f13734o : null);
        JSONObject jSONObject13 = this.f15774w;
        C3690cg c3690cgM17842j14 = m17842j();
        AbstractC4171y2.m20015a(jSONObject13, C11341A5.f23814e, (c3690cgM17842j14 == null || (c3850jfM17191g = c3690cgM17842j14.m17191g()) == null || (enumC4050sdM18279d = c3850jfM17191g.m18279d()) == null) ? null : Integer.valueOf(enumC4050sdM18279d.m19428c()));
        JSONObject jSONObject14 = this.f15774w;
        C3690cg c3690cgM17842j15 = m17842j();
        AbstractC4171y2.m20015a(jSONObject14, "dw", (c3690cgM17842j15 == null || (c3795h6M17185b5 = c3690cgM17842j15.m17185b()) == null) ? null : Integer.valueOf(c3795h6M17185b5.m17859c()));
        JSONObject jSONObject15 = this.f15774w;
        C3690cg c3690cgM17842j16 = m17842j();
        AbstractC4171y2.m20015a(jSONObject15, "dh", (c3690cgM17842j16 == null || (c3795h6M17185b4 = c3690cgM17842j16.m17185b()) == null) ? null : Integer.valueOf(c3795h6M17185b4.m17857a()));
        JSONObject jSONObject16 = this.f15774w;
        C3690cg c3690cgM17842j17 = m17842j();
        AbstractC4171y2.m20015a(jSONObject16, "dpi", (c3690cgM17842j17 == null || (c3795h6M17185b3 = c3690cgM17842j17.m17185b()) == null) ? null : c3795h6M17185b3.m17860d());
        JSONObject jSONObject17 = this.f15774w;
        C3690cg c3690cgM17842j18 = m17842j();
        AbstractC4171y2.m20015a(jSONObject17, "w", (c3690cgM17842j18 == null || (c3795h6M17185b2 = c3690cgM17842j18.m17185b()) == null) ? null : Integer.valueOf(c3795h6M17185b2.m17866j()));
        JSONObject jSONObject18 = this.f15774w;
        C3690cg c3690cgM17842j19 = m17842j();
        AbstractC4171y2.m20015a(jSONObject18, CmcdData.Factory.STREAMING_FORMAT_HLS, (c3690cgM17842j19 == null || (c3795h6M17185b = c3690cgM17842j19.m17185b()) == null) ? null : Integer.valueOf(c3795h6M17185b.m17861e()));
        AbstractC4171y2.m20015a(this.f15774w, "user_agent", C4187yi.f17062b.m20065a());
        AbstractC4171y2.m20015a(this.f15774w, "device_family", "");
        AbstractC4171y2.m20015a(this.f15774w, "retina", Boolean.FALSE);
        m19019p();
        C3690cg c3690cgM17842j20 = m17842j();
        C4139we c4139we = c3690cgM17842j20 != null ? c3690cgM17842j20.f13737r : null;
        if (c4139we != null) {
            m19012a(c4139we);
        }
        m17833a(C11744X3.i.f26328G, this.f15774w);
    }

    /* JADX INFO: renamed from: p */
    public final void m19019p() {
        C3690cg c3690cgM17842j = m17842j();
        C3958o9 c3958o9M17187c = c3690cgM17842j != null ? c3690cgM17842j.m17187c() : null;
        if (c3958o9M17187c == null) {
            C4048sb.m19410b("Missing identity in the CB SDK. This will affect ads performance.", null);
            return;
        }
        AbstractC4171y2.m20015a(this.f15774w, "identity", c3958o9M17187c.m18895b());
        int i = a.f15777a[c3958o9M17187c.m18899f().ordinal()];
        if (i == 1) {
            AbstractC4171y2.m20015a(this.f15774w, "limit_ad_tracking", Boolean.TRUE);
        } else if (i == 2) {
            AbstractC4171y2.m20015a(this.f15774w, "limit_ad_tracking", Boolean.FALSE);
        }
        Integer numM18898e = c3958o9M17187c.m18898e();
        if (numM18898e != null) {
            AbstractC4171y2.m20015a(this.f15774w, "appsetidscope", Integer.valueOf(numM18898e.intValue()));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m19020q() {
        C3725e5 c3725e5M17182a;
        C3755fc c3755fcM17188d;
        JSONObject jSONObject = this.f15772u;
        C3690cg c3690cgM17842j = m17842j();
        String strM17480a = null;
        AbstractC4171y2.m20015a(jSONObject, "sdk", c3690cgM17842j != null ? c3690cgM17842j.f13726g : null);
        C3690cg c3690cgM17842j2 = m17842j();
        if (c3690cgM17842j2 != null && (c3755fcM17188d = c3690cgM17842j2.m17188d()) != null) {
            AbstractC4171y2.m20015a(this.f15772u, "mediation", c3755fcM17188d.m17691c());
            AbstractC4171y2.m20015a(this.f15772u, "mediation_version", c3755fcM17188d.m17690b());
            AbstractC4171y2.m20015a(this.f15772u, "adapter_version", c3755fcM17188d.m17689a());
        }
        AbstractC4171y2.m20015a(this.f15772u, "commit_hash", "5e8bb392961ca14a32f21186a9030c507592feee");
        C3690cg c3690cgM17842j3 = m17842j();
        if (c3690cgM17842j3 != null && (c3725e5M17182a = c3690cgM17842j3.m17182a()) != null) {
            strM17480a = c3725e5M17182a.m17480a();
        }
        if (!C3836j1.m18133b().m18136a(strM17480a)) {
            AbstractC4171y2.m20015a(this.f15772u, "config_variant", strM17480a);
        }
        m17833a("sdk", this.f15772u);
    }
}
