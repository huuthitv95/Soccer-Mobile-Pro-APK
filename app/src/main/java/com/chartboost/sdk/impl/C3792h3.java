package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.chartboost.sdk.ChartboostDSP;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11341A5;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h3 */
/* JADX INFO: loaded from: classes3.dex */
public class C3792h3 extends AbstractC3654b3 {

    /* JADX INFO: renamed from: t */
    public static final b f14353t = new b(null);

    /* JADX INFO: renamed from: k */
    public final String f14354k;

    /* JADX INFO: renamed from: l */
    public final C3690cg f14355l;

    /* JADX INFO: renamed from: m */
    public final String f14356m;

    /* JADX INFO: renamed from: n */
    public final a f14357n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC3888l7 f14358o;

    /* JADX INFO: renamed from: p */
    public final C4031rg f14359p;

    /* JADX INFO: renamed from: q */
    public JSONObject f14360q;

    /* JADX INFO: renamed from: r */
    public JSONArray f14361r;

    /* JADX INFO: renamed from: s */
    public boolean f14362s;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.h3$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo17844a(C3792h3 c3792h3, CBError cBError);

        /* JADX INFO: renamed from: a */
        void mo17845a(C3792h3 c3792h3, JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.h3$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3792h3(AbstractC3654b3.c method, String endpoint, String path, C3690cg c3690cg, EnumC4095ue priority, String str, a aVar, InterfaceC3888l7 eventTracker, C4031rg c4031rg) {
        super(method, NetworkHelper.f17175a.m20165a(endpoint, path), priority, null);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f14354k = path;
        this.f14355l = c3690cg;
        this.f14356m = str;
        this.f14357n = aVar;
        this.f14358o = eventTracker;
        this.f14359p = c4031rg;
        this.f14360q = new JSONObject();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3792h3(String endpoint, String path, C3690cg c3690cg, EnumC4095ue priority, a aVar, InterfaceC3888l7 eventTracker, C4031rg c4031rg) {
        this(AbstractC3654b3.c.POST, endpoint, path, c3690cg, priority, (String) null, aVar, eventTracker, c4031rg);
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
    }

    public /* synthetic */ C3792h3(String str, String str2, C3690cg c3690cg, EnumC4095ue enumC4095ue, a aVar, InterfaceC3888l7 interfaceC3888l7, C4031rg c4031rg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, c3690cg, enumC4095ue, aVar, interfaceC3888l7, (i & 64) != 0 ? null : c4031rg);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3792h3(String endpoint, String path, C3690cg c3690cg, EnumC4095ue priority, String eventType, a aVar, InterfaceC3888l7 eventTracker, C4031rg c4031rg) {
        this(AbstractC3654b3.c.POST, endpoint, path, c3690cg, priority, eventType, aVar, eventTracker, c4031rg);
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public C3677c3 mo16887a() {
        String strM17839g;
        C3958o9 c3958o9M17187c;
        String strM18897d;
        String strM19354d;
        mo17807f();
        String string = this.f14360q.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        C3690cg c3690cg = this.f14355l;
        String str = c3690cg != null ? c3690cg.f13727h : null;
        if (str == null) {
            str = "";
        }
        String str2 = c3690cg != null ? c3690cg.f13728i : null;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.US, "%s %s\n%s\n%s", Arrays.copyOf(new Object[]{m16893c(), m17843k(), str2, string}, 4));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String strM19290a = C4017r2.m19290a(str3);
        HashMap map = new HashMap();
        map.put(HttpHeaders.ACCEPT, C11341A5.f23800M);
        map.put("X-Chartboost-Client", C3907m3.m18629b());
        map.put("X-Chartboost-API", "9.11.1");
        map.put("X-Chartboost-App", str);
        map.put("X-Chartboost-Signature", strM19290a);
        C4031rg c4031rg = this.f14359p;
        if (c4031rg != null && (strM19354d = c4031rg.m19354d()) != null) {
            map.put("x-monetization-session-id", strM19354d);
        }
        C3690cg c3690cg2 = this.f14355l;
        if (c3690cg2 != null && (c3958o9M17187c = c3690cg2.m17187c()) != null && (strM18897d = c3958o9M17187c.m18897d()) != null) {
            map.put("x-monetization-idfv", strM18897d);
        }
        map.put("x-monetization-sdk-version", "9.11.1");
        if (C3851jg.f14967a.m18286d()) {
            String strM18282b = C3851jg.m18282b();
            String str4 = strM18282b.length() > 0 ? strM18282b : null;
            if (str4 != null) {
                map.put("X-Chartboost-Test", str4);
            }
            String strM18280a = C3851jg.m18280a();
            if (strM18280a != null) {
                map.put("X-Chartboost-Test", strM18280a);
            }
        }
        if (ChartboostDSP.INSTANCE.isDSP() && (strM17839g = m17839g()) != null && strM17839g.length() != 0) {
            map.put("X-Chartboost-DspDemoApp", strM17839g);
        }
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new C3677c3(map, bytes, C11341A5.f23800M);
    }

    /* JADX INFO: renamed from: a */
    public final C3700d3 m17829a(int i, String str) {
        JSONObject jSONObjectM17837b = m17837b(i, str);
        C3700d3.a aVar = C3700d3.f13797c;
        CBError.Internal internal = CBError.Internal.HTTP_NOT_OK;
        String string = jSONObjectM17837b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return aVar.m17257a(new CBError(internal, string));
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public C3700d3 mo16888a(C3723e3 c3723e3) {
        byte[] bArrM17473a;
        try {
            if (c3723e3 == null || (bArrM17473a = c3723e3.m17473a()) == null) {
                bArrM17473a = new byte[0];
            }
            JSONObject jSONObject = new JSONObject(new String(bArrM17473a, Charsets.UTF_8));
            String strM17841i = m17841i();
            Integer numValueOf = c3723e3 != null ? Integer.valueOf(c3723e3.m17474b()) : null;
            C4048sb.m19414d("Request " + strM17841i + " succeeded. Response code: " + numValueOf + ", body: " + jSONObject.toString(4), null);
            if (this.f14362s) {
                int iOptInt = jSONObject.optInt("status");
                String strOptString = jSONObject.optString("message");
                if (iOptInt == 404) {
                    Intrinsics.checkNotNull(strOptString);
                    return m17831a(strOptString);
                }
                if (iOptInt < 200 || iOptInt > 299) {
                    C4048sb.m19410b("Request failed due to status code " + iOptInt + " in message", null);
                    Intrinsics.checkNotNull(strOptString);
                    return m17829a(iOptInt, strOptString);
                }
            }
            return C3700d3.f13797c.m17258a(jSONObject);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            m17838b(message);
            C4048sb.m19410b("parseServerResponse", e);
            return m17830a(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C3700d3 m17830a(Exception exc) {
        C3700d3.a aVar = C3700d3.f13797c;
        CBError.Internal internal = CBError.Internal.MISCELLANEOUS;
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        return aVar.m17257a(new CBError(internal, localizedMessage));
    }

    /* JADX INFO: renamed from: a */
    public final C3700d3 m17831a(String str) {
        JSONObject jSONObjectM17837b = m17837b(404, str);
        C3700d3.a aVar = C3700d3.f13797c;
        CBError.Internal internal = CBError.Internal.HTTP_NOT_FOUND;
        String string = jSONObjectM17837b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return aVar.m17257a(new CBError(internal, string));
    }

    /* JADX INFO: renamed from: a */
    public final void m17832a(C3723e3 c3723e3, CBError cBError) {
        String string;
        String errorDesc;
        CBError.Type type;
        AbstractC4171y2.a[] aVarArr = new AbstractC4171y2.a[5];
        aVarArr[0] = AbstractC4171y2.m20012a(C11341A5.f23827r, m17841i());
        String str = "None";
        aVarArr[1] = AbstractC4171y2.m20012a("statuscode", c3723e3 == null ? "None" : Integer.valueOf(c3723e3.m17474b()));
        if (cBError == null || (type = cBError.getType()) == null || (string = type.toString()) == null) {
            string = "None";
        }
        aVarArr[2] = AbstractC4171y2.m20012a("error", string);
        if (cBError != null && (errorDesc = cBError.getErrorDesc()) != null) {
            str = errorDesc;
        }
        aVarArr[3] = AbstractC4171y2.m20012a("errorDescription", str);
        aVarArr[4] = AbstractC4171y2.m20012a("retryCount", (Object) 0);
        JSONObject jSONObjectM20014a = AbstractC4171y2.m20014a(aVarArr);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM20014a, "jsonObject(...)");
        C4048sb.m19407a("sendToSessionLogs: " + jSONObjectM20014a, null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public void mo16889a(CBError cBError, C3723e3 c3723e3) {
        if (cBError == null) {
            return;
        }
        C4048sb.m19414d("Request failure: " + m16895e() + " status: " + cBError.getErrorDesc(), null);
        a aVar = this.f14357n;
        if (aVar != null) {
            aVar.mo17844a(this, cBError);
        }
        m17832a(c3723e3, cBError);
    }

    /* JADX INFO: renamed from: a */
    public final void m17833a(String str, Object obj) {
        AbstractC4171y2.m20015a(this.f14360q, str, obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m17834a(JSONArray jSONArray) {
        this.f14361r = jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public final void m17835a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.f14360q = jSONObject;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo16890a(JSONObject jSONObject, C3723e3 c3723e3) {
        int iM17474b = c3723e3 != null ? c3723e3.m17474b() : -1;
        C4048sb.m19414d("Request success: " + m16895e() + " status: " + iM17474b, null);
        a aVar = this.f14357n;
        if (aVar != null) {
            aVar.mo17845a(this, jSONObject);
        }
        m17832a(c3723e3, (CBError) null);
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m17837b(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put("message", str);
            return jSONObject;
        } catch (JSONException e) {
            C4048sb.m19410b("Error creating JSON", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17838b(String str) {
        this.f14358o.mo43989track(C3954o5.f15633m.m18876a(InterfaceC3807hi.h.RESPONSE_JSON_SERIALIZATION_ERROR, str));
    }

    /* JADX INFO: renamed from: f */
    public void mo17807f() {
        C3725e5 c3725e5M17182a;
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
        C3690cg c3690cg = this.f14355l;
        m17833a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, c3690cg != null ? c3690cg.f13727h : null);
        C3690cg c3690cg2 = this.f14355l;
        m17833a(C11540L6.f24899B, c3690cg2 != null ? c3690cg2.f13720a : null);
        C3690cg c3690cg3 = this.f14355l;
        m17833a(C11540L6.f25013t, c3690cg3 != null ? c3690cg3.f13730k : null);
        C3690cg c3690cg4 = this.f14355l;
        m17833a("device_type", c3690cg4 != null ? c3690cg4.f13729j : null);
        C3690cg c3690cg5 = this.f14355l;
        m17833a("actual_device_type", c3690cg5 != null ? c3690cg5.f13731l : null);
        C3690cg c3690cg6 = this.f14355l;
        m17833a(C11540L6.f24911F, c3690cg6 != null ? c3690cg6.f13721b : null);
        C3690cg c3690cg7 = this.f14355l;
        m17833a("country", c3690cg7 != null ? c3690cg7.f13722c : null);
        C3690cg c3690cg8 = this.f14355l;
        m17833a("language", c3690cg8 != null ? c3690cg8.f13723d : null);
        C3690cg c3690cg9 = this.f14355l;
        m17833a("sdk", c3690cg9 != null ? c3690cg9.f13726g : null);
        m17833a("user_agent", C4187yi.f17062b.m20065a());
        C3690cg c3690cg10 = this.f14355l;
        m17833a("timestamp", (c3690cg10 == null || (c3944nhM17194j = c3690cg10.m17194j()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(c3944nhM17194j.m18803a())));
        C3690cg c3690cg11 = this.f14355l;
        m17833a("session", c3690cg11 != null ? Integer.valueOf(c3690cg11.m17193i()) : null);
        C3690cg c3690cg12 = this.f14355l;
        m17833a("reachability", (c3690cg12 == null || (c3850jfM17191g2 = c3690cg12.m17191g()) == null) ? null : c3850jfM17191g2.m18277b());
        C3690cg c3690cg13 = this.f14355l;
        m17833a("is_portrait", (c3690cg13 == null || (c3795h6M17185b7 = c3690cg13.m17185b()) == null) ? null : Boolean.valueOf(c3795h6M17185b7.m17867k()));
        C3690cg c3690cg14 = this.f14355l;
        m17833a("scale", (c3690cg14 == null || (c3795h6M17185b6 = c3690cg14.m17185b()) == null) ? null : Float.valueOf(c3795h6M17185b6.m17864h()));
        C3690cg c3690cg15 = this.f14355l;
        m17833a("bundle", c3690cg15 != null ? c3690cg15.f13724e : null);
        C3690cg c3690cg16 = this.f14355l;
        m17833a("bundle_id", c3690cg16 != null ? c3690cg16.f13725f : null);
        C3690cg c3690cg17 = this.f14355l;
        m17833a(C11540L6.f24937Q0, c3690cg17 != null ? c3690cg17.f13732m : null);
        C3690cg c3690cg18 = this.f14355l;
        C3755fc c3755fcM17188d = c3690cg18 != null ? c3690cg18.m17188d() : null;
        if (c3755fcM17188d != null) {
            m17833a("mediation", c3755fcM17188d.m17691c());
            m17833a("mediation_version", c3755fcM17188d.m17690b());
            m17833a("adapter_version", c3755fcM17188d.m17689a());
            m17833a("sdk.mediation", c3755fcM17188d.m17692d());
            m17833a("sdk.mediation_version", c3755fcM17188d.m17690b());
            m17833a("sdk.adapter_version", c3755fcM17188d.m17689a());
        }
        C3690cg c3690cg19 = this.f14355l;
        m17833a("timezone", c3690cg19 != null ? c3690cg19.f13734o : null);
        C3690cg c3690cg20 = this.f14355l;
        m17833a(C11341A5.f23814e, (c3690cg20 == null || (c3850jfM17191g = c3690cg20.m17191g()) == null || (enumC4050sdM18279d = c3850jfM17191g.m18279d()) == null) ? null : Integer.valueOf(enumC4050sdM18279d.m19428c()));
        C3690cg c3690cg21 = this.f14355l;
        m17833a("dw", (c3690cg21 == null || (c3795h6M17185b5 = c3690cg21.m17185b()) == null) ? null : Integer.valueOf(c3795h6M17185b5.m17859c()));
        C3690cg c3690cg22 = this.f14355l;
        m17833a("dh", (c3690cg22 == null || (c3795h6M17185b4 = c3690cg22.m17185b()) == null) ? null : Integer.valueOf(c3795h6M17185b4.m17857a()));
        C3690cg c3690cg23 = this.f14355l;
        m17833a("dpi", (c3690cg23 == null || (c3795h6M17185b3 = c3690cg23.m17185b()) == null) ? null : c3795h6M17185b3.m17860d());
        C3690cg c3690cg24 = this.f14355l;
        m17833a("w", (c3690cg24 == null || (c3795h6M17185b2 = c3690cg24.m17185b()) == null) ? null : Integer.valueOf(c3795h6M17185b2.m17866j()));
        C3690cg c3690cg25 = this.f14355l;
        m17833a(CmcdData.Factory.STREAMING_FORMAT_HLS, (c3690cg25 == null || (c3795h6M17185b = c3690cg25.m17185b()) == null) ? null : Integer.valueOf(c3795h6M17185b.m17861e()));
        m17833a("commit_hash", "5e8bb392961ca14a32f21186a9030c507592feee");
        C3690cg c3690cg26 = this.f14355l;
        C3958o9 c3958o9M17187c = c3690cg26 != null ? c3690cg26.m17187c() : null;
        m17833a("identity", c3958o9M17187c != null ? c3958o9M17187c.m18895b() : null);
        m17833a("instance_id", c3958o9M17187c != null ? c3958o9M17187c.m18896c() : null);
        EnumC3922mi enumC3922miM18899f = c3958o9M17187c != null ? c3958o9M17187c.m18899f() : null;
        if (enumC3922miM18899f != EnumC3922mi.TRACKING_UNKNOWN) {
            m17833a("limit_ad_tracking", Boolean.valueOf(enumC3922miM18899f == EnumC3922mi.TRACKING_LIMITED));
        }
        m17833a("appsetidscope", c3958o9M17187c != null ? c3958o9M17187c.m18898e() : null);
        C3690cg c3690cg27 = this.f14355l;
        C4139we c4139weM17190f = c3690cg27 != null ? c3690cg27.m17190f() : null;
        Object objM19798h = c4139weM17190f != null ? c4139weM17190f.m19798h() : null;
        if (objM19798h != null) {
            m17833a(C11744X3.j.f26435b0, objM19798h);
        }
        m17833a("pidatauseconsent", c4139weM17190f != null ? c4139weM17190f.m19796f() : null);
        C3690cg c3690cg28 = this.f14355l;
        String strM17480a = (c3690cg28 == null || (c3725e5M17182a = c3690cg28.m17182a()) == null) ? null : c3725e5M17182a.m17480a();
        if (!C3836j1.m18133b().m18136a(strM17480a)) {
            m17833a("config_variant", strM17480a);
        }
        JSONObject jSONObjectM19797g = c4139weM17190f != null ? c4139weM17190f.m19797g() : null;
        String strM19792b = c4139weM17190f != null ? c4139weM17190f.m19792b() : null;
        String strM19791a = c4139weM17190f != null ? c4139weM17190f.m19791a() : null;
        if (jSONObjectM19797g != null) {
            try {
                jSONObjectM19797g.put("gpp", strM19792b);
                jSONObjectM19797g.put("gpp_sid", strM19791a);
            } catch (JSONException e) {
                C4048sb.m19410b("Failed to add GPP and/or GPP SID to request body", e);
            }
        }
        m17833a(ShareConstants.WEB_DIALOG_PARAM_PRIVACY, jSONObjectM19797g);
    }

    /* JADX INFO: renamed from: g */
    public final String m17839g() {
        C3655b4 c3655b4 = C3655b4.f13535a;
        String strM16899a = c3655b4.m16899a();
        int[] iArrM16900b = c3655b4.m16900b();
        JSONObject jSONObject = new JSONObject();
        if (strM16899a.length() > 0 && iArrM16900b != null) {
            if (!(iArrM16900b.length == 0)) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArrM16900b) {
                        jSONArray.put(i);
                    }
                    jSONObject.put("exchangeMode", 2);
                    jSONObject.put("bidFloor", 0.01d);
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, strM16899a);
                    jSONObject.put("forceCreativeTypes", jSONArray);
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: h */
    public final JSONArray m17840h() {
        return this.f14361r;
    }

    /* JADX INFO: renamed from: i */
    public final String m17841i() {
        if (StringsKt.startsWith$default(this.f14354k, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
            return this.f14354k;
        }
        return RemoteSettings.FORWARD_SLASH_STRING + this.f14354k;
    }

    /* JADX INFO: renamed from: j */
    public final C3690cg m17842j() {
        return this.f14355l;
    }

    /* JADX INFO: renamed from: k */
    public final String m17843k() {
        return m17841i();
    }
}
