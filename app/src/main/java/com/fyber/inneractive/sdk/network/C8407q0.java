package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.p077ri.xha$$ExternalSyntheticBackportWithForwarding0;
import com.chartboost.sdk.privacy.model.CCPA;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.AbstractC8044u;
import com.fyber.inneractive.sdk.config.C7965g;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8046v;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.AbstractC7995g;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7983k;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.ignite.C8252l;
import com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a;
import com.fyber.inneractive.sdk.network.timeouts.request.C8421b;
import com.fyber.inneractive.sdk.network.timeouts.request.C8423d;
import com.fyber.inneractive.sdk.response.InterfaceC9092j;
import com.fyber.inneractive.sdk.serverapi.AbstractC9113b;
import com.fyber.inneractive.sdk.serverapi.C9114c;
import com.fyber.inneractive.sdk.serverapi.InterfaceC9115d;
import com.fyber.inneractive.sdk.util.AbstractC9149f1;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9173n1;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C12288ke;
import com.tiktok.util.UrlConst;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8407q0 extends AbstractC8416t0 implements InterfaceC8400o {

    /* JADX INFO: renamed from: p */
    public final InneractiveAdRequest f18696p;

    /* JADX INFO: renamed from: q */
    public HashMap f18697q;

    /* JADX INFO: renamed from: r */
    public StringBuffer f18698r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC9115d f18699s;

    /* JADX INFO: renamed from: t */
    public boolean f18700t;

    /* JADX INFO: renamed from: u */
    public final AbstractC8420a f18701u;

    public C8407q0(C8406q c8406q, InneractiveAdRequest inneractiveAdRequest, C8006r c8006r) {
        C9114c c9114c = new C9114c(c8006r);
        super(c8406q, C8377g0.f18655c.m20755a(), c8006r);
        this.f18700t = false;
        this.f18725o = true;
        this.f18696p = inneractiveAdRequest;
        this.f18699s = c9114c;
        if (inneractiveAdRequest != null) {
            String strM21986a = AbstractC9173n1.m21986a(inneractiveAdRequest.getSpotId());
            String mediationName = inneractiveAdRequest.getMediationName();
            C7983k c7983k = (C7983k) c8006r.m20432a(C7983k.class);
            this.f18701u = TextUtils.isEmpty(mediationName) ? new C8421b(c7983k, strM21986a) : new C8423d(strM21986a, c7983k, mediationName);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8391l mo20744a(String str) {
        IAlog.m21945a("%s: NetworkRequestAd Ad request execution started, timeouts(connection: %d read: %d)", IAlog.m21943a(this), Integer.valueOf(mo20752p().f18679a), Integer.valueOf(mo20752p().f18680b));
        return super.mo20744a(str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws C8398n0 {
        StringBuffer stringBufferM22033b;
        String str;
        List list;
        if (map != null) {
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                if (str2 != null && (list = (List) map.get(str2)) != null && list.size() > 0) {
                    map2.put(str2.toLowerCase(Locale.US), (String) list.get(0));
                }
            }
            this.f18697q = map2;
        }
        InputStream inputStream = c8391l == null ? null : c8391l.f18668c;
        super.mo20749d(System.currentTimeMillis());
        IAlog.m21945a("%s : NetworkRequestAd : set start read timestamp", IAlog.m21943a(this));
        if (inputStream != null) {
            try {
                stringBufferM22033b = AbstractC9195v.m22033b(inputStream);
            } catch (Exception e) {
                IAlog.m21945a("failed create response builder in network request ad for url: %s msg: %s", mo20732r(), e.getMessage());
                stringBufferM22033b = null;
            }
            this.f18698r = stringBufferM22033b;
        }
        mo20746b(System.currentTimeMillis());
        C8401o0 c8401o0 = new C8401o0();
        try {
            HashMap map3 = this.f18697q;
            if (map3 != null) {
                str = (String) map3.get(EnumC8397n.RETURNED_AD_TYPE.key.toLowerCase(Locale.US));
                if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
                    str = null;
                }
            } else {
                str = null;
            }
            c8401o0.f18690a = m20787a(str != null ? Integer.parseInt(str) : 6, this, (InterfaceC9092j) null);
            return c8401o0;
        } catch (Exception e2) {
            mo20746b(System.currentTimeMillis());
            IAlog.m21945a("failed parse ad network request url: %s msg: %s", mo20732r(), e2.getMessage());
            throw new C8398n0(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8400o
    /* JADX INFO: renamed from: a */
    public final StringBuffer mo20775a() {
        return this.f18698r;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final void mo20745a(long j) {
        super.mo20745a(j);
        IAlog.m21945a("%s : NetworkRequestAd : set end connection timestamp, total execution time: %d", IAlog.m21943a(this), Integer.valueOf(mo20753q()));
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8400o
    /* JADX INFO: renamed from: b */
    public final Map mo20776b() {
        return this.f18697q;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: b */
    public final void mo20746b(long j) {
        super.mo20746b(j);
        IAlog.m21945a("%s : NetworkRequestAd : set end read timestamp, total execution time: %d", IAlog.m21943a(this), Integer.valueOf(mo20753q()));
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: c */
    public final void mo20747c(long j) {
        super.mo20747c(j);
        IAlog.m21945a("%s : NetworkRequestAd : set start connection timestamp", IAlog.m21943a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: d */
    public final void mo20748d() {
        super.mo20748d();
        IAlog.m21945a("%s : NetworkRequestAd cancel by timeout - resolve request with no fill", IAlog.m21943a(this));
        this.f18711a = true;
        m20789a((Object) null, (Exception) new C8390k1("no fill", 204), false);
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: f */
    public final byte[] mo20727f() {
        JSONArray jSONArrayM20428a;
        byte[] bytes = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            C8006r c8006r = ((C9114c) this.f18699s).f21367a;
            if (c8006r != null) {
                jSONArrayM20428a = AbstractC7995g.m20428a(c8006r.f17776b, true);
                IAlog.m21945a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayM20428a);
            } else {
                jSONArrayM20428a = null;
            }
            if (jSONArrayM20428a != null && jSONArrayM20428a.length() > 0) {
                jSONObject2.put(C12288ke.f30747d, jSONArrayM20428a);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            JSONArray jSONArrayM20457a = IAConfigManager.f17654M.f17691w.m20457a(AbstractC9113b.m21905a(this.f18696p.getSpotId()));
            if (jSONArrayM20457a != null && jSONArrayM20457a.length() > 0) {
                jSONObject.put("user_sessions", jSONArrayM20457a);
            }
            try {
                Object objM20376b = IAConfigManager.m20376b();
                if (objM20376b != null) {
                    jSONObject.put("pub_extra_data", objM20376b);
                }
            } catch (JSONException e) {
                IAlog.m21944a("Failed to add extra data to ad request body!", e, new Object[0]);
            }
            String string = jSONObject.toString();
            bytes = string.getBytes(StandardCharsets.UTF_8);
            IAlog.m21945a("request json body - %s", string);
            IAlog.m21948d("request json body - %s", string);
            return bytes;
        } catch (Exception unused) {
            IAlog.m21945a("Failed building body for ad request!", new Object[0]);
            return bytes;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: j */
    public final int mo20750j() {
        return mo20753q();
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: l */
    public final Map mo20782l() {
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("mockadnetworkresponseid", property);
        IAlog.m21945a("NetworkRequestAd: Adding mock response header - %s", property);
        return map;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: m */
    public final EnumC8395m0 mo20729m() {
        return EnumC8395m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: o */
    public final EnumC8378g1 mo20731o() {
        return EnumC8378g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: p */
    public final C8393l1 mo20752p() {
        AbstractC8420a abstractC8420a = this.f18701u;
        return new C8393l1(abstractC8420a.f18735i, abstractC8420a.f18734h);
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: r */
    public final String mo20732r() {
        String str;
        String str2;
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String strM20383a = TextUtils.isEmpty(property) ? UrlConst.HTTPS + IAConfigManager.f17654M.f17677i.f17793e : AbstractC7945a.m20383a(property, "clientRequestEnhancedXmlAd");
        if (this.f18696p.getFloorPrice() != null) {
            String property2 = System.getProperty("ia.testEnvironmentConfiguration.name");
            strM20383a = TextUtils.isEmpty(property2) ? UrlConst.HTTPS + IAConfigManager.f17654M.f17677i.f17795g : AbstractC7945a.m20383a(property2, "clientRequestEnhancedXmlAd");
        }
        InneractiveAdRequest inneractiveAdRequest = this.f18696p;
        InterfaceC9115d interfaceC9115d = this.f18699s;
        C8410r0 c8410r0 = new C8410r0(inneractiveAdRequest, interfaceC9115d);
        c8410r0.f18704b = new HashMap();
        c8410r0.m20783a("fromSDK", Boolean.toString(true));
        c8410r0.m20783a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        c8410r0.m20783a("secure", !AbstractC9186s.m22012a() || IAConfigManager.f17654M.f17685q ? "1" : "0");
        c8410r0.m20783a("spotid", inneractiveAdRequest.getSpotId());
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property3 == null) {
            property3 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((C8028r0) inneractiveAdRequest.getSelectedUnitConfig()).f17811a;
        }
        c8410r0.m20783a("uid", property3);
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        if (TextUtils.isEmpty(iAConfigManager.f17682n)) {
            c8410r0.m20783a("med", iAConfigManager.f17680l);
        } else {
            c8410r0.m20783a("med", iAConfigManager.f17680l + "_" + iAConfigManager.f17682n);
        }
        interfaceC9115d.getClass();
        c8410r0.m20783a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        C9114c c9114c = (C9114c) interfaceC9115d;
        List list = C9114c.f21366d;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf((Integer) it.next()));
            }
            c8410r0.m20783a("protocols", AbstractC9174o.m21991a(arrayList));
        }
        List list2 = C9114c.f21365c;
        if (!list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf((Integer) it2.next()));
            }
            c8410r0.m20783a("api", AbstractC9174o.m21991a(arrayList2));
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            c8410r0.m20783a("zip", iAConfigManager.f17678j.getZipCode());
        }
        c8410r0.m20783a("a", Integer.toString(iAConfigManager.f17678j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f17678j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            c8410r0.m20783a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            c8410r0.m20783a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        c8410r0.m20783a("t", Long.toString(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder("2.2.0-Android-8.4.3");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        c8410r0.m20783a("v", sb.toString());
        Boolean boolM20405d = iAConfigManager.f17659C.m20405d();
        if (boolM20405d != null) {
            c8410r0.m20783a("gdpr_privacy_consent", boolM20405d.booleanValue() ? "1" : "0");
        }
        C7965g c7965g = iAConfigManager.f17659C;
        if (c7965g != null) {
            Boolean bool = AbstractC9174o.f21470a == null ? null : c7965g.f17737i;
            if (bool != null) {
                c8410r0.m20783a("lgpd_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = iAConfigManager.f17659C.f17738j;
            if (bool2 != null && bool2.booleanValue()) {
                c8410r0.m20783a("coppaApplies", "1");
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String property4 = System.getProperty("ia.testEnvironmentConfiguration.device");
            C8046v c8046v = AbstractC8044u.f17878a.f17886b;
            String str3 = c8046v != null ? c8046v.f17884c : false ? "amazonId" : "aaid";
            if (TextUtils.isEmpty(property4)) {
                C8046v c8046v2 = AbstractC8044u.f17878a.f17886b;
                property4 = c8046v2 != null ? c8046v2.f17882a : null;
            }
            c8410r0.m20783a(str3, property4);
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            C8046v c8046v3 = AbstractC8044u.f17878a.f17886b;
            c8410r0.m20783a("dnt", Boolean.toString(c8046v3 != null ? c8046v3.f17883b : false));
        }
        c8410r0.m20783a("dml", AbstractC9162k.m21974j());
        int iM22001c = AbstractC9174o.m22001c(AbstractC9174o.m22004e());
        int iM22001c2 = AbstractC9174o.m22001c(AbstractC9174o.m22002d());
        if (iM22001c > 0 && iM22001c2 > 0) {
            c8410r0.m20783a("w", Integer.toString(iM22001c));
            c8410r0.m20783a(CmcdData.Factory.STREAMING_FORMAT_HLS, Integer.toString(iM22001c2));
        }
        int iM22000c = AbstractC9174o.m22000c();
        c8410r0.m20783a("o", iM22000c == 1 ? "p" : iM22000c == 2 ? CmcdData.Factory.STREAM_TYPE_LIVE : "u");
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            c8410r0.m20783a("ciso", AbstractC9162k.m21973i());
            String str4 = c9114c.f21368b;
            c8410r0.m20783a("mcc", str4 == null ? "" : str4.substring(0, Math.min(3, str4.length())));
            String str5 = c9114c.f21368b;
            c8410r0.m20783a("mnc", str5 == null ? "" : str5.substring(Math.min(3, str5.length())));
            EnumC9134a1 enumC9134a1M21954a = EnumC9134a1.m21954a();
            IAlog.m21945a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", enumC9134a1M21954a, enumC9134a1M21954a.m21955b());
            c8410r0.m20783a("nt", enumC9134a1M21954a.m21955b());
            c8410r0.m20783a("crn", c9114c.m21922a());
        }
        c8410r0.m20783a(C11540L6.f24911F, C11744X3.f26142d);
        c8410r0.m20783a("lng", iAConfigManager.f17683o);
        ArrayList arrayList3 = iAConfigManager.f17684p;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            c8410r0.m20783a("in_lng", AbstractC9174o.m21991a(arrayList3));
        }
        c8410r0.m20783a("bid", AbstractC9174o.f21470a.getPackageName());
        c8410r0.m20783a("appv", AbstractC9162k.m21976l());
        C7965g c7965g2 = iAConfigManager.f17659C;
        if (c7965g2.f17732d == null) {
            c7965g2.f17733e = c7965g2.m20410i();
        }
        if (AbstractC9174o.f21470a == null) {
            str = null;
        } else {
            str = c7965g2.f17732d;
            if (str == null) {
                str = c7965g2.f17733e;
            }
        }
        c8410r0.m20783a("gdpr_consent_data", str);
        C7965g c7965g3 = iAConfigManager.f17659C;
        if (AbstractC9174o.f21470a == null) {
            c7965g3.getClass();
            str2 = null;
        } else {
            str2 = c7965g3.f17736h;
        }
        c8410r0.m20783a(CCPA.CCPA_STANDARD, str2);
        c8410r0.m20783a("mute_video", Boolean.toString(iAConfigManager.f17679k));
        c8410r0.m20783a(C11540L6.f24914G, Build.VERSION.RELEASE);
        C8252l c8252l = iAConfigManager.f17660D.f18422p;
        c8410r0.m20783a("ignitep", c8252l != null ? c8252l.f17294a.mo20286d() : null);
        C8252l c8252l2 = iAConfigManager.f17660D.f18422p;
        c8410r0.m20783a("ignitev", c8252l2 != null ? c8252l2.f17294a.mo20291i() : null);
        HashMap map = new HashMap();
        c9114c.m21923a(inneractiveAdRequest.getSpotId(), map);
        for (Map.Entry entry : map.entrySet()) {
            c8410r0.m20783a((String) entry.getKey(), (String) entry.getValue());
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            c8410r0.m20783a("childMode", "1");
        }
        C8252l c8252l3 = IAConfigManager.f17654M.f17660D.f18422p;
        c8410r0.m20783a("odt", c8252l3 != null ? c8252l3.getOdt() : "");
        Double floorPrice = c8410r0.f18703a.getFloorPrice();
        c8410r0.m20783a("floorprice", floorPrice != null ? xha$$ExternalSyntheticBackportWithForwarding0.m7319m(new BigDecimal(Double.toString(floorPrice.doubleValue())).setScale(5, RoundingMode.CEILING)).toPlainString() : null);
        String strM21960a = AbstractC9149f1.m21960a(strM20383a, c8410r0.f18704b);
        if (!this.f18700t) {
            IAlog.m21948d("%s %s", "AD_REQUEST", strM21960a);
            this.f18700t = true;
        }
        return strM21960a;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: s */
    public final int mo20754s() {
        return this.f18701u.f18731f;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return false;
    }
}
