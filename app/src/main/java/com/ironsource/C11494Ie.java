package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.C12330a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Ie */
/* JADX INFO: loaded from: classes6.dex */
public class C11494Ie {

    /* JADX INFO: renamed from: A */
    protected static final boolean f24508A = false;

    /* JADX INFO: renamed from: A0 */
    protected static final String f24509A0 = "waitUntilAllProvidersFinishInit";

    /* JADX INFO: renamed from: A1 */
    protected static final String f24510A1 = "providerNetworkKey";

    /* JADX INFO: renamed from: B */
    protected static final int f24511B = 60;

    /* JADX INFO: renamed from: B0 */
    protected static final String f24512B0 = "sharedManagersThread";

    /* JADX INFO: renamed from: B1 */
    protected static final String f24513B1 = "spId";

    /* JADX INFO: renamed from: C */
    protected static final int f24514C = 10000;

    /* JADX INFO: renamed from: C0 */
    protected static final String f24515C0 = "parallelLoad";

    /* JADX INFO: renamed from: C1 */
    protected static final String f24516C1 = "mpis";

    /* JADX INFO: renamed from: D */
    protected static final int f24517D = 10000;

    /* JADX INFO: renamed from: D0 */
    protected static final String f24518D0 = "bidderExclusive";

    /* JADX INFO: renamed from: D1 */
    protected static final String f24519D1 = "auction";

    /* JADX INFO: renamed from: E */
    protected static final int f24520E = -1;

    /* JADX INFO: renamed from: E0 */
    protected static final String f24521E0 = "adapterTimeOutInSeconds";

    /* JADX INFO: renamed from: E1 */
    protected static final String f24522E1 = "auctionData";

    /* JADX INFO: renamed from: F */
    protected static final int f24523F = 5000;

    /* JADX INFO: renamed from: F0 */
    protected static final String f24524F0 = "atim";

    /* JADX INFO: renamed from: F1 */
    protected static final String f24525F1 = "auctioneerURL";

    /* JADX INFO: renamed from: G */
    protected static final int f24526G = 3;

    /* JADX INFO: renamed from: G0 */
    protected static final String f24527G0 = "bannerInterval";

    /* JADX INFO: renamed from: G1 */
    protected static final String f24528G1 = "extAuctioneerURL";

    /* JADX INFO: renamed from: H */
    protected static final int f24529H = 3;

    /* JADX INFO: renamed from: H0 */
    protected static final String f24530H0 = "isOneFlow";

    /* JADX INFO: renamed from: H1 */
    protected static final String f24531H1 = "objectPerWaterfall";

    /* JADX INFO: renamed from: I */
    protected static final int f24532I = 3;

    /* JADX INFO: renamed from: I0 */
    protected static final String f24533I0 = "expiredDurationInMinutes";

    /* JADX INFO: renamed from: I1 */
    protected static final String f24534I1 = "minTimeBeforeFirstAuction";

    /* JADX INFO: renamed from: J */
    protected static final int f24535J = 0;

    /* JADX INFO: renamed from: J0 */
    protected static final String f24536J0 = "server";

    /* JADX INFO: renamed from: J1 */
    protected static final String f24537J1 = "timeToWaitBeforeAuction";

    /* JADX INFO: renamed from: K */
    protected static final int f24538K = 2;

    /* JADX INFO: renamed from: K0 */
    protected static final String f24539K0 = "publisher";

    /* JADX INFO: renamed from: K1 */
    protected static final String f24540K1 = "timeToWaitBeforeLoad";

    /* JADX INFO: renamed from: L */
    protected static final int f24541L = 15;

    /* JADX INFO: renamed from: L0 */
    protected static final String f24542L0 = "console";

    /* JADX INFO: renamed from: L1 */
    protected static final String f24543L1 = "auctionRetryInterval";

    /* JADX INFO: renamed from: M */
    protected static final long f24544M = 10000;

    /* JADX INFO: renamed from: M0 */
    protected static final String f24545M0 = "sendUltraEvents";

    /* JADX INFO: renamed from: M1 */
    protected static final String f24546M1 = "isLoadWhileShow";

    /* JADX INFO: renamed from: N */
    protected static final long f24547N = 3000;

    /* JADX INFO: renamed from: N0 */
    protected static final String f24548N0 = "sendEventsToggle";

    /* JADX INFO: renamed from: N1 */
    protected static final String f24549N1 = "auctionTrials";

    /* JADX INFO: renamed from: O */
    protected static final boolean f24550O = false;

    /* JADX INFO: renamed from: O0 */
    protected static final String f24551O0 = "eventsCompression";

    /* JADX INFO: renamed from: O1 */
    protected static final String f24552O1 = "auctionTimeout";

    /* JADX INFO: renamed from: P */
    protected static final boolean f24553P = false;

    /* JADX INFO: renamed from: P0 */
    protected static final String f24554P0 = "eventsCompressionLevel";

    /* JADX INFO: renamed from: P1 */
    protected static final String f24555P1 = "auctionSavedHistory";

    /* JADX INFO: renamed from: Q */
    protected static final int f24556Q = 30000;

    /* JADX INFO: renamed from: Q0 */
    protected static final String f24557Q0 = "serverEventsURL";

    /* JADX INFO: renamed from: Q1 */
    protected static final String f24558Q1 = "disableLoadWhileShowSupportFor";

    /* JADX INFO: renamed from: R */
    protected static final int f24559R = -1;

    /* JADX INFO: renamed from: R0 */
    protected static final String f24560R0 = "serverEventsType";

    /* JADX INFO: renamed from: R1 */
    protected static final String f24561R1 = "tokenPerAdapter";

    /* JADX INFO: renamed from: S */
    protected static final int f24562S = 5000;

    /* JADX INFO: renamed from: S0 */
    protected static final String f24563S0 = "backupThreshold";

    /* JADX INFO: renamed from: S1 */
    protected static final String f24564S1 = "enableAuctionFallback";

    /* JADX INFO: renamed from: T */
    protected static final int f24565T = 1;

    /* JADX INFO: renamed from: T0 */
    protected static final String f24566T0 = "maxNumberOfEvents";

    /* JADX INFO: renamed from: T1 */
    protected static final String f24567T1 = "timeToDeleteOldWaterfallAfterAuction";

    /* JADX INFO: renamed from: U */
    protected static final boolean f24568U = false;

    /* JADX INFO: renamed from: U0 */
    protected static final String f24569U0 = "maxEventsPerBatch";

    /* JADX INFO: renamed from: U1 */
    protected static final String f24570U1 = "compressAuctionRequest";

    /* JADX INFO: renamed from: V */
    protected static final int f24571V = 15000;

    /* JADX INFO: renamed from: V0 */
    protected static final String f24572V0 = "optOut";

    /* JADX INFO: renamed from: V1 */
    protected static final String f24573V1 = "compressAuctionResponse";

    /* JADX INFO: renamed from: W */
    protected static final int f24574W = 15000;

    /* JADX INFO: renamed from: W0 */
    protected static final String f24575W0 = "optIn";

    /* JADX INFO: renamed from: W1 */
    protected static final String f24576W1 = "encryptionVersion";

    /* JADX INFO: renamed from: X */
    protected static final String f24577X = "providerOrder";

    /* JADX INFO: renamed from: X0 */
    protected static final String f24578X0 = "triggerEvents";

    /* JADX INFO: renamed from: X1 */
    protected static final String f24579X1 = "shouldSendBannerBURLFromImpression";

    /* JADX INFO: renamed from: Y */
    protected static final String f24580Y = "providerSettings";

    /* JADX INFO: renamed from: Y0 */
    protected static final String f24581Y0 = "nonConnectivityEvents";

    /* JADX INFO: renamed from: Y1 */
    protected static final String f24582Y1 = "impressionTimeout";

    /* JADX INFO: renamed from: Z */
    protected static final String f24583Z = "configurations";

    /* JADX INFO: renamed from: Z0 */
    protected static final String f24584Z0 = "shouldSendPublisherLogsOnUIThread";

    /* JADX INFO: renamed from: Z1 */
    protected static final String f24585Z1 = "optInKeys";

    /* JADX INFO: renamed from: a0 */
    protected static final String f24586a0 = "genericParams";

    /* JADX INFO: renamed from: a1 */
    protected static final String f24587a1 = "pixel";

    /* JADX INFO: renamed from: a2 */
    protected static final String f24588a2 = "tokenGenericParams";

    /* JADX INFO: renamed from: b0 */
    protected static final String f24589b0 = "adUnits";

    /* JADX INFO: renamed from: b1 */
    protected static final String f24590b1 = "pixelEventsUrl";

    /* JADX INFO: renamed from: b2 */
    protected static final String f24591b2 = "compressToken";

    /* JADX INFO: renamed from: c0 */
    protected static final String f24592c0 = "providerLoadName";

    /* JADX INFO: renamed from: c1 */
    protected static final String f24593c1 = "pixelEventsEnabled";

    /* JADX INFO: renamed from: c2 */
    protected static final String f24594c2 = "compressExternalToken";

    /* JADX INFO: renamed from: d0 */
    protected static final String f24595d0 = "application";

    /* JADX INFO: renamed from: d1 */
    protected static final String f24596d1 = "placements";

    /* JADX INFO: renamed from: d2 */
    protected static final String f24597d2 = "instanceType";

    /* JADX INFO: renamed from: e0 */
    protected static final String f24598e0 = "rewardedVideo";

    /* JADX INFO: renamed from: e1 */
    protected static final String f24599e1 = "placementId";

    /* JADX INFO: renamed from: e2 */
    protected static final String f24600e2 = "maxAdsPerSession";

    /* JADX INFO: renamed from: f0 */
    protected static final String f24601f0 = "interstitial";

    /* JADX INFO: renamed from: f1 */
    protected static final String f24602f1 = "placementName";

    /* JADX INFO: renamed from: f2 */
    protected static final String f24603f2 = "reward";

    /* JADX INFO: renamed from: g0 */
    protected static final String f24604g0 = "banner";

    /* JADX INFO: renamed from: g1 */
    protected static final String f24605g1 = "delivery";

    /* JADX INFO: renamed from: g2 */
    protected static final String f24606g2 = "name";

    /* JADX INFO: renamed from: h0 */
    protected static final String f24607h0 = "nativeAd";

    /* JADX INFO: renamed from: h1 */
    protected static final String f24608h1 = "isDefault";

    /* JADX INFO: renamed from: h2 */
    protected static final String f24609h2 = "amount";

    /* JADX INFO: renamed from: i0 */
    protected static final String f24610i0 = "integration";

    /* JADX INFO: renamed from: i1 */
    protected static final String f24611i1 = "capping";

    /* JADX INFO: renamed from: i2 */
    protected static final String f24612i2 = "bannerRefreshRate";

    /* JADX INFO: renamed from: j0 */
    protected static final String f24613j0 = "loggers";

    /* JADX INFO: renamed from: j1 */
    protected static final String f24614j1 = "pacing";

    /* JADX INFO: renamed from: j2 */
    protected static final String f24615j2 = "protocolVersion";

    /* JADX INFO: renamed from: k0 */
    protected static final String f24616k0 = "segment";

    /* JADX INFO: renamed from: k1 */
    protected static final String f24617k1 = "enabled";

    /* JADX INFO: renamed from: k2 */
    protected static final String f24618k2 = "adFormats";

    /* JADX INFO: renamed from: l */
    public static final String f24619l = "appKey";

    /* JADX INFO: renamed from: l0 */
    protected static final String f24620l0 = "events";

    /* JADX INFO: renamed from: l1 */
    protected static final String f24621l1 = "maxImpressions";

    /* JADX INFO: renamed from: l2 */
    protected static final String f24622l2 = "adUnits";

    /* JADX INFO: renamed from: m */
    public static final String f24623m = "userId";

    /* JADX INFO: renamed from: m0 */
    protected static final String f24624m0 = "crashReporter";

    /* JADX INFO: renamed from: m1 */
    protected static final String f24625m1 = "numOfSeconds";

    /* JADX INFO: renamed from: m2 */
    protected static final String f24626m2 = "rewarded";

    /* JADX INFO: renamed from: n */
    public static final String f24627n = "response";

    /* JADX INFO: renamed from: n0 */
    protected static final String f24628n0 = "token";

    /* JADX INFO: renamed from: n1 */
    protected static final String f24629n1 = "unit";

    /* JADX INFO: renamed from: o */
    protected static final String f24630o = "error";

    /* JADX INFO: renamed from: o0 */
    protected static final String f24631o0 = "external";

    /* JADX INFO: renamed from: o1 */
    protected static final String f24632o1 = "virtualItemName";

    /* JADX INFO: renamed from: p */
    protected static final int f24633p = 3;

    /* JADX INFO: renamed from: p0 */
    protected static final String f24634p0 = "mediationTypes";

    /* JADX INFO: renamed from: p1 */
    protected static final String f24635p1 = "virtualItemCount";

    /* JADX INFO: renamed from: q */
    protected static final boolean f24636q = false;

    /* JADX INFO: renamed from: q0 */
    protected static final String f24637q0 = "providerDefaultInstance";

    /* JADX INFO: renamed from: q1 */
    protected static final String f24638q1 = "uuidEnabled";

    /* JADX INFO: renamed from: r */
    protected static final boolean f24639r = true;

    /* JADX INFO: renamed from: r0 */
    protected static final String f24640r0 = "testSuite";

    /* JADX INFO: renamed from: r1 */
    protected static final String f24641r1 = "abt";

    /* JADX INFO: renamed from: s */
    protected static final boolean f24642s = true;

    /* JADX INFO: renamed from: s0 */
    protected static final String f24643s0 = "controllerUrl";

    /* JADX INFO: renamed from: s1 */
    protected static final String f24644s1 = "delayLoadFailure";

    /* JADX INFO: renamed from: t */
    protected static final int f24645t = 2;

    /* JADX INFO: renamed from: t0 */
    protected static final String f24646t0 = "AdQuality";

    /* JADX INFO: renamed from: t1 */
    protected static final String f24647t1 = "keysToInclude";

    /* JADX INFO: renamed from: u */
    protected static final int f24648u = 2;

    /* JADX INFO: renamed from: u0 */
    protected static final String f24649u0 = "initMode";

    /* JADX INFO: renamed from: u1 */
    protected static final String f24650u1 = "reporterURL";

    /* JADX INFO: renamed from: v */
    protected static final int f24651v = 1;

    /* JADX INFO: renamed from: v0 */
    protected static final String f24652v0 = "adq_init_blob";

    /* JADX INFO: renamed from: v1 */
    protected static final String f24653v1 = "reporterKeyword";

    /* JADX INFO: renamed from: w */
    protected static final int f24654w = 1;

    /* JADX INFO: renamed from: w0 */
    protected static final String f24655w0 = "settings";

    /* JADX INFO: renamed from: w1 */
    protected static final String f24656w1 = "includeANR";

    /* JADX INFO: renamed from: x */
    protected static final boolean f24657x = true;

    /* JADX INFO: renamed from: x0 */
    protected static final String f24658x0 = "collectBiddingDataTimeout";

    /* JADX INFO: renamed from: x1 */
    protected static final String f24659x1 = "timeout";

    /* JADX INFO: renamed from: y */
    protected static final boolean f24660y = false;

    /* JADX INFO: renamed from: y0 */
    protected static final String f24661y0 = "providers";

    /* JADX INFO: renamed from: y1 */
    protected static final String f24662y1 = "setIgnoreDebugger";

    /* JADX INFO: renamed from: z */
    protected static final boolean f24663z = false;

    /* JADX INFO: renamed from: z0 */
    protected static final String f24664z0 = "parallelInit";

    /* JADX INFO: renamed from: z1 */
    protected static final String f24665z1 = "adSourceName";

    /* JADX INFO: renamed from: a */
    private C12570vd f24666a;

    /* JADX INFO: renamed from: b */
    private C12624yd f24667b;

    /* JADX INFO: renamed from: c */
    private C11573N3 f24668c;

    /* JADX INFO: renamed from: d */
    private String f24669d;

    /* JADX INFO: renamed from: e */
    private String f24670e;

    /* JADX INFO: renamed from: f */
    private JSONObject f24671f;

    /* JADX INFO: renamed from: g */
    private Context f24672g;

    /* JADX INFO: renamed from: h */
    private a f24673h;

    /* JADX INFO: renamed from: i */
    private InterfaceC11523K7.a f24674i;

    /* JADX INFO: renamed from: j */
    private boolean f24675j;

    /* JADX INFO: renamed from: k */
    private C11521K5 f24676k;

    /* JADX INFO: renamed from: com.ironsource.Ie$a */
    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* JADX INFO: renamed from: a */
        private final String f24681a;

        a(String str) {
            this.f24681a = str;
        }

        /* JADX INFO: renamed from: b */
        public String m26145b() {
            return this.f24681a;
        }
    }

    public C11494Ie(Context context, String str, String str2, String str3) {
        this.f24673h = a.NOT_SET;
        this.f24675j = false;
        this.f24672g = context;
        this.f24674i = C11455Gb.m25885O().mo25781x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f24671f = new JSONObject();
            } else {
                this.f24671f = new JSONObject(str3);
            }
            this.f24675j = m26128o();
            m26131t();
            m26129r();
            m26130s();
            this.f24669d = TextUtils.isEmpty(str) ? "" : str;
            this.f24670e = TextUtils.isEmpty(str2) ? "" : str2;
            m26115b(this.f24671f);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            m26109a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m26105a(C11494Ie c11494Ie) {
        return c11494Ie != null ? c11494Ie.m26138i() : a.NOT_SET;
    }

    /* JADX INFO: renamed from: b */
    private void m26115b(JSONObject jSONObject) {
        this.f24676k = new C11521K5(jSONObject.optJSONObject(C12288ke.f30747d));
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m26118c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private C12161e3 m26120d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f24608h1, false);
        C12153dd c12153ddM26107a = m26107a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C12161e3 c12161e3 = new C12161e3(iOptInt, strOptString, zOptBoolean, c12153ddM26107a);
        if (c12153ddM26107a != null) {
            this.f24674i.mo26264b(this.f24672g, c12161e3, IronSource.EnumC12328a.BANNER);
        }
        return c12161e3;
    }

    /* JADX INFO: renamed from: f */
    private C11735Wb m26123f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f24608h1, false);
        C12153dd c12153ddM26107a = m26107a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C11735Wb c11735Wb = new C11735Wb(iOptInt, strOptString, zOptBoolean, c12153ddM26107a);
        if (c12153ddM26107a != null) {
            this.f24674i.mo26264b(this.f24672g, c11735Wb, IronSource.EnumC12328a.NATIVE_AD);
        }
        return c11735Wb;
    }

    /* JADX INFO: renamed from: m */
    private String m26126m() {
        return this.f24675j ? "rewarded" : "rewardedVideo";
    }

    /* JADX INFO: renamed from: n */
    private boolean m26127n() {
        JSONObject jSONObjectM26118c;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectM26118c2 = m26118c(this.f24671f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectM26118c2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectM26118c3 = m26118c(m26118c(this.f24671f, "configurations"), m26113b());
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectM26118c2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectM26118c = m26118c(jSONObjectM26118c3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectM26118c.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private boolean m26128o() {
        int iOptInt;
        try {
            iOptInt = this.f24671f.optInt(f24615j2, 0);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00af  */
    /* JADX INFO: renamed from: r */
    private void m26129r() {
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject;
        C11652Rd c11652Rd;
        String str5;
        String str6;
        JSONObject jSONObject2;
        String str7;
        C11363B9 c11363b9;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        C11692U2 c11692u2;
        JSONObject jSONObject3;
        String str14;
        C11692U2 c11692u3;
        C11545Lb c11545Lb;
        boolean zOptBoolean;
        String str15;
        JSONObject jSONObjectM26118c;
        C12470s2 c12470s2;
        JSONObject jSONObjectM26118c2;
        C12470s2 c12470s3;
        JSONObject jSONObjectM26118c3;
        String str16;
        C12470s2 c12470s4;
        C12470s2 c12470s5;
        try {
            JSONObject jSONObjectM26118c4 = m26118c(this.f24671f, "configurations");
            JSONObject jSONObjectM26118c5 = m26118c(jSONObjectM26118c4, m26113b());
            JSONObject jSONObjectM26118c6 = m26118c(jSONObjectM26118c4, "application");
            JSONObject jSONObjectM26118c7 = m26118c(jSONObjectM26118c5, m26126m());
            JSONObject jSONObjectM26118c8 = m26118c(jSONObjectM26118c5, "interstitial");
            JSONObject jSONObjectM26118c9 = m26118c(jSONObjectM26118c5, "banner");
            JSONObject jSONObjectM26118c10 = m26118c(jSONObjectM26118c5, "nativeAd");
            JSONObject jSONObjectM26118c11 = m26118c(jSONObjectM26118c6, "events");
            JSONObject jSONObjectM26118c12 = m26118c(jSONObjectM26118c6, "loggers");
            JSONObject jSONObjectM26118c13 = m26118c(jSONObjectM26118c6, "token");
            JSONObject jSONObjectM26118c14 = m26118c(jSONObjectM26118c6, "segment");
            JSONObject jSONObjectM26118c15 = m26118c(jSONObjectM26118c6, "auction");
            JSONObject jSONObjectM26118c16 = m26118c(jSONObjectM26118c6, "crashReporter");
            JSONObject jSONObjectM26118c17 = m26118c(jSONObjectM26118c6, "settings");
            JSONObject jSONObjectM26118c18 = m26118c(jSONObjectM26118c6, "external");
            JSONObject jSONObjectM26118c19 = m26118c(jSONObjectM26118c11, f24587a1);
            if (jSONObjectM26118c6 != null) {
                IronSourceUtils.m32754b(this.f24672g, "uuidEnabled", jSONObjectM26118c6.optBoolean("uuidEnabled", true));
            }
            if (jSONObjectM26118c11 != null) {
                String strOptString = jSONObjectM26118c11.optString("abt");
                if (TextUtils.isEmpty(strOptString)) {
                    str = null;
                } else {
                    C11455Gb.m25891U().mo25850q().m32035a(strOptString);
                    C11399D9.m25613i().m32035a(strOptString);
                    C11686Td.m27533i().m32035a(strOptString);
                    str = strOptString;
                }
            } else {
                str = null;
            }
            C11499J1 c11499j1M26106a = m26106a(jSONObjectM26118c11, Boolean.valueOf(jSONObjectM26118c11.optBoolean("sendUltraEvents", false)));
            String str17 = f24525F1;
            String str18 = "auctionTrials";
            String str19 = f24555P1;
            String str20 = f24522E1;
            String str21 = f24552O1;
            String str22 = "";
            if (jSONObjectM26118c7 != null) {
                str4 = f24528G1;
                JSONArray jSONArrayOptJSONArray = jSONObjectM26118c7.optJSONArray("placements");
                str3 = "placements";
                JSONObject jSONObjectM26118c20 = m26118c(jSONObjectM26118c7, "events");
                str2 = "events";
                JSONObject jSONObjectM26121d = m26121d(jSONObjectM26118c7, f24661y0);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                long jOptLong = jSONObjectM26118c7.optLong(f24658x0, 3000L);
                boolean zOptBoolean2 = jSONObjectM26121d.optBoolean(f24664z0, false);
                boolean zOptBoolean3 = jSONObjectM26121d.optBoolean(f24509A0, false);
                boolean zOptBoolean4 = jSONObjectM26118c7.optBoolean(f24512B0, true);
                int iM26103a = m26103a(jSONObjectM26118c7, jSONObjectM26118c6, "parallelLoad", 2);
                boolean zM26110a = m26110a(jSONObjectM26118c7, jSONObjectM26118c6, "bidderExclusive", true);
                int iM26103a2 = m26103a(jSONObjectM26118c7, jSONObjectM26118c6, f24521E0, 60);
                int iM26103a3 = m26103a(jSONObjectM26118c7, jSONObjectM26118c6, "expiredDurationInMinutes", -1);
                int iM26103a4 = m26103a(jSONObjectM26118c7, jSONObjectM26118c6, f24644s1, 3);
                boolean zM26110a2 = m26110a(jSONObjectM26118c7, jSONObjectM26118c6, "isOneFlow", false);
                JSONObject jSONObjectM32750b = IronSourceUtils.m32750b(jSONObjectM26118c20, jSONObjectM26118c11);
                C11499J1 c11499j1M26106a2 = m26106a(jSONObjectM32750b, Boolean.valueOf(jSONObjectM32750b.optBoolean("sendUltraEvents", false)));
                if (jSONObjectM26118c15 != null) {
                    JSONObject jSONObjectM26118c21 = m26118c(jSONObjectM26118c15, m26126m());
                    jSONObject = jSONObjectM26118c15;
                    C12470s2 c12470s6 = new C12470s2(jSONObjectM26118c15.optString(f24522E1, ""), jSONObjectM26118c15.optString(str17, ""), jSONObjectM26118c15.optString(str4, ""), jSONObjectM26118c15.optInt(str18, 2), jSONObjectM26118c15.optInt(str19, 15), jSONObjectM26118c15.optLong(str21, 10000L), jSONObjectM26118c21.optInt(f24534I1, 2000), jSONObjectM26118c21.optInt(f24543L1, 30000), jSONObjectM26118c21.optInt(f24537J1, 5000), jSONObjectM26118c21.optInt(f24540K1, 50), jSONObjectM26118c21.optBoolean("isLoadWhileShow", true), jSONObjectM26118c21.optInt(f24567T1, 30000), jSONObjectM26118c15.optBoolean(f24570U1, false), jSONObjectM26118c15.optBoolean(f24573V1, false), jSONObjectM26118c21.optBoolean(f24531H1, false), jSONObjectM26118c15.optInt(f24576W1, 1), false, jSONObjectM26118c15.optBoolean(f24561R1, true), jSONObjectM26118c21.optBoolean(f24564S1, true));
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectM26118c21.optJSONArray(f24558Q1);
                    if (jSONArrayOptJSONArray2 != null) {
                        str4 = str4;
                        str18 = str18;
                        str17 = str17;
                        str21 = str21;
                        str19 = str19;
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            c12470s6.m33275a(jSONArrayOptJSONArray2.optString(i));
                        }
                    }
                    str4 = str4;
                    str18 = str18;
                    str17 = str17;
                    str21 = str21;
                    str19 = str19;
                    c12470s5 = c12470s6;
                } else {
                    jSONObject = jSONObjectM26118c15;
                    c12470s5 = new C12470s2();
                }
                c11652Rd = new C11652Rd(iM26103a, zM26110a, iM26103a2, iM26103a3, c11499j1M26106a2, c12470s5, iM26103a4, zM26110a2, jOptLong, zOptBoolean2, zOptBoolean3, zOptBoolean4);
                if (jSONArray != null) {
                    int i2 = 0;
                    while (i2 < jSONArray.length()) {
                        JSONArray jSONArray2 = jSONArray;
                        C12135cd c12135cdM26124g = m26124g(jSONArray2.optJSONObject(i2));
                        if (c12135cdM26124g != null) {
                            c11652Rd.m27380a(c12135cdM26124g);
                        }
                        i2++;
                        jSONArray = jSONArray2;
                    }
                }
            } else {
                str2 = "events";
                str22 = "";
                str3 = "placements";
                str20 = f24522E1;
                str4 = f24528G1;
                jSONObject = jSONObjectM26118c15;
                c11652Rd = null;
            }
            if (jSONObjectM26118c8 != null) {
                String str23 = str3;
                JSONArray jSONArrayOptJSONArray3 = jSONObjectM26118c8.optJSONArray(str23);
                str5 = str2;
                JSONObject jSONObjectM26118c22 = m26118c(jSONObjectM26118c8, str5);
                JSONObject jSONObjectM26121d2 = m26121d(jSONObjectM26118c8, f24661y0);
                str3 = str23;
                JSONArray jSONArray3 = jSONArrayOptJSONArray3;
                long jOptLong2 = jSONObjectM26118c8.optLong(f24658x0, 3000L);
                boolean zOptBoolean5 = jSONObjectM26121d2.optBoolean(f24664z0, false);
                boolean zOptBoolean6 = jSONObjectM26121d2.optBoolean(f24509A0, false);
                boolean zOptBoolean7 = jSONObjectM26118c8.optBoolean(f24512B0, true);
                int iM26103a5 = m26103a(jSONObjectM26118c8, jSONObjectM26118c6, "parallelLoad", 2);
                boolean zM26110a3 = m26110a(jSONObjectM26118c8, jSONObjectM26118c6, "bidderExclusive", false);
                int iM26103a6 = m26103a(jSONObjectM26118c8, jSONObjectM26118c6, f24521E0, 60);
                int iM26103a7 = m26103a(jSONObjectM26118c8, jSONObjectM26118c6, f24644s1, 3);
                boolean zM26110a4 = m26110a(jSONObjectM26118c8, jSONObjectM26118c6, "isOneFlow", false);
                C11499J1 c11499j1M26106a3 = m26106a(IronSourceUtils.m32750b(jSONObjectM26118c22, jSONObjectM26118c11), Boolean.FALSE);
                if (jSONObject != null) {
                    jSONObject2 = jSONObject;
                    JSONObject jSONObjectM26118c23 = m26118c(jSONObject2, "interstitial");
                    String str24 = str22;
                    str6 = str20;
                    String strOptString2 = jSONObject2.optString(str6, str24);
                    String str25 = str17;
                    String strOptString3 = jSONObject2.optString(str25, str24);
                    String str26 = str4;
                    String strOptString4 = jSONObject2.optString(str26, str24);
                    str4 = str26;
                    str22 = str24;
                    String str27 = str18;
                    int iOptInt = jSONObject2.optInt(str27, 2);
                    str18 = str27;
                    String str28 = str19;
                    str19 = str28;
                    str7 = str25;
                    str16 = str21;
                    c12470s4 = new C12470s2(strOptString2, strOptString3, strOptString4, iOptInt, jSONObject2.optInt(str28, 15), jSONObject2.optLong(str16, 10000L), jSONObjectM26118c23.optInt(f24534I1, 2000), 0L, 0L, 0L, true, 0, jSONObject2.optBoolean(f24570U1, false), jSONObject2.optBoolean(f24573V1, false), true, jSONObject2.optInt(f24576W1, 1), false, jSONObject2.optBoolean(f24561R1, true), jSONObjectM26118c23.optBoolean(f24564S1, true));
                } else {
                    str7 = str17;
                    str16 = str21;
                    str6 = str20;
                    jSONObject2 = jSONObject;
                    c12470s4 = new C12470s2();
                }
                C11363B9 c11363b10 = new C11363B9(iM26103a5, zM26110a3, iM26103a6, c11499j1M26106a3, c12470s4, iM26103a7, zM26110a4, jOptLong2, zOptBoolean5, zOptBoolean6, zOptBoolean7);
                if (jSONArray3 != null) {
                    int i3 = 0;
                    while (i3 < jSONArray3.length()) {
                        String str29 = str16;
                        JSONArray jSONArray4 = jSONArray3;
                        C11435F9 c11435f9M26122e = m26122e(jSONArray4.optJSONObject(i3));
                        if (c11435f9M26122e != null) {
                            c11363b10.m25464a(c11435f9M26122e);
                        }
                        i3++;
                        jSONArray3 = jSONArray4;
                        str16 = str29;
                    }
                }
                str21 = str16;
                c11363b9 = c11363b10;
            } else {
                str5 = str2;
                str6 = str20;
                jSONObject2 = jSONObject;
                str7 = str17;
                jSONObjectM26118c6 = jSONObjectM26118c6;
                c11363b9 = null;
            }
            if (jSONObjectM26118c9 != null) {
                String str30 = str3;
                JSONArray jSONArrayOptJSONArray4 = jSONObjectM26118c9.optJSONArray(str30);
                JSONObject jSONObjectM26118c24 = m26118c(jSONObjectM26118c9, str5);
                JSONObject jSONObjectM26121d3 = m26121d(jSONObjectM26118c9, f24661y0);
                String str31 = str18;
                JSONArray jSONArray5 = jSONArrayOptJSONArray4;
                jSONObjectM26118c6 = jSONObjectM26118c6;
                String str32 = str7;
                String str33 = str6;
                str12 = str30;
                String str34 = str22;
                str10 = f24664z0;
                long jM26104a = m26104a(jSONObjectM26118c9, jSONObjectM26118c6, f24524F0, 10000L);
                int iM26103a8 = m26103a(jSONObjectM26118c9, jSONObjectM26118c6, f24644s1, 3);
                int iOptInt2 = jSONObjectM26118c9.optInt(f24527G0, 60);
                long jOptLong3 = jSONObjectM26118c9.optLong(f24582Y1, 15000L);
                boolean zM26110a5 = m26110a(jSONObjectM26118c9, jSONObjectM26118c6, "isOneFlow", false);
                long jOptLong4 = jSONObjectM26118c9.optLong(f24658x0, 3000L);
                boolean zOptBoolean8 = jSONObjectM26121d3.optBoolean(str10, false);
                boolean zOptBoolean9 = jSONObjectM26121d3.optBoolean(f24509A0, false);
                boolean zOptBoolean10 = jSONObjectM26118c9.optBoolean(f24512B0, true);
                C11499J1 c11499j1M26106a4 = m26106a(IronSourceUtils.m32750b(jSONObjectM26118c24, jSONObjectM26118c11), Boolean.FALSE);
                if (jSONObject2 == null || (jSONObjectM26118c3 = m26118c(jSONObject2, "banner")) == null) {
                    str9 = str32;
                    str8 = str33;
                    str13 = str34;
                    str11 = str31;
                    c12470s3 = new C12470s2();
                } else {
                    str8 = str33;
                    str13 = str34;
                    String strOptString5 = jSONObject2.optString(str8, str13);
                    String strOptString6 = jSONObject2.optString(str32, str13);
                    String str35 = str4;
                    String strOptString7 = jSONObject2.optString(str35, str13);
                    int iOptInt3 = jSONObject2.optInt(str31, 2);
                    str4 = str35;
                    String str36 = str19;
                    int iOptInt4 = jSONObject2.optInt(str36, 15);
                    str9 = str32;
                    str19 = str36;
                    String str37 = str21;
                    str21 = str37;
                    str11 = str31;
                    c12470s3 = new C12470s2(strOptString5, strOptString6, strOptString7, iOptInt3, iOptInt4, jSONObject2.optLong(str37, 10000L), jSONObjectM26118c3.optInt(f24534I1, 2000), jSONObjectM26118c3.optInt(f24543L1, 15000), jSONObjectM26118c3.optInt(f24537J1, 50), 0L, jSONObjectM26118c3.optBoolean("isLoadWhileShow", false), 0, jSONObject2.optBoolean(f24570U1, false), jSONObject2.optBoolean(f24573V1, false), jSONObjectM26118c3.optBoolean(f24531H1, true), jSONObject2.optInt(f24576W1, 1), jSONObjectM26118c3.optBoolean(f24579X1, true), jSONObject2.optBoolean(f24561R1, true), jSONObjectM26118c3.optBoolean(f24564S1, true));
                }
                C11692U2 c11692u4 = new C11692U2(1, jM26104a, false, c11499j1M26106a4, iOptInt2, c12470s3, iM26103a8, zM26110a5, jOptLong4, zOptBoolean8, zOptBoolean9, zOptBoolean10, jOptLong3);
                if (jSONArray5 != null) {
                    int i4 = 0;
                    while (i4 < jSONArray5.length()) {
                        JSONArray jSONArray6 = jSONArray5;
                        C12161e3 c12161e3M26120d = m26120d(jSONArray6.optJSONObject(i4));
                        if (c12161e3M26120d != null) {
                            c11692u4.m27557a(c12161e3M26120d);
                        }
                        i4++;
                        jSONArray5 = jSONArray6;
                    }
                }
                c11692u2 = c11692u4;
            } else {
                str8 = str6;
                str9 = str7;
                str10 = f24664z0;
                str11 = str18;
                str12 = str3;
                str13 = str22;
                c11692u2 = null;
            }
            if (jSONObjectM26118c10 != null) {
                JSONArray jSONArrayOptJSONArray5 = jSONObjectM26118c10.optJSONArray(str12);
                String str38 = str5;
                JSONObject jSONObjectM26118c25 = m26118c(jSONObjectM26118c10, str38);
                JSONObject jSONObjectM26121d4 = m26121d(jSONObjectM26118c10, f24661y0);
                String str39 = str8;
                String str40 = str9;
                String str41 = str11;
                String str42 = str19;
                String str43 = str21;
                String str44 = str4;
                str14 = str38;
                c11692u3 = c11692u2;
                JSONArray jSONArray7 = jSONArrayOptJSONArray5;
                jSONObject3 = jSONObjectM26118c6;
                long jM26104a2 = m26104a(jSONObjectM26118c10, jSONObject3, f24524F0, 10000L);
                int iM26103a9 = m26103a(jSONObjectM26118c10, jSONObject3, f24644s1, 0);
                long jOptLong5 = jSONObjectM26118c10.optLong(f24658x0, 3000L);
                boolean zOptBoolean11 = jSONObjectM26121d4.optBoolean(str10, false);
                boolean zOptBoolean12 = jSONObjectM26121d4.optBoolean(f24509A0, false);
                boolean zOptBoolean13 = jSONObjectM26118c10.optBoolean(f24512B0, true);
                C11499J1 c11499j1M26106a5 = m26106a(IronSourceUtils.m32750b(jSONObjectM26118c25, jSONObjectM26118c11), Boolean.FALSE);
                if (jSONObject2 == null || (jSONObjectM26118c2 = m26118c(jSONObject2, "nativeAd")) == null) {
                    str8 = str39;
                    c12470s2 = new C12470s2();
                } else {
                    str8 = str39;
                    c12470s2 = new C12470s2(jSONObject2.optString(str8, str13), jSONObject2.optString(str40, str13), jSONObject2.optString(str44, str13), jSONObject2.optInt(str41, 2), jSONObject2.optInt(str42, 15), jSONObject2.optLong(str43, 10000L), jSONObjectM26118c2.optInt(f24534I1, 2000), 0L, 0L, 0L, true, 0, jSONObject2.optBoolean(f24570U1, false), jSONObject2.optBoolean(f24573V1, false), true, jSONObject2.optInt(f24576W1, 1), false, jSONObject2.optBoolean(f24561R1, true), jSONObjectM26118c2.optBoolean(f24564S1, true));
                }
                c11545Lb = new C11545Lb(1, jM26104a2, false, c11499j1M26106a5, c12470s2, iM26103a9, jOptLong5, zOptBoolean11, zOptBoolean12, zOptBoolean13);
                if (jSONArray7 != null) {
                    int i5 = 0;
                    while (i5 < jSONArray7.length()) {
                        JSONArray jSONArray8 = jSONArray7;
                        C11735Wb c11735WbM26123f = m26123f(jSONArray8.optJSONObject(i5));
                        if (c11735WbM26123f != null) {
                            c11545Lb.m26407a(c11735WbM26123f);
                        }
                        i5++;
                        jSONArray7 = jSONArray8;
                    }
                }
            } else {
                jSONObject3 = jSONObjectM26118c6;
                str14 = str5;
                c11692u3 = c11692u2;
                c11545Lb = null;
            }
            C11739Wf c11739Wf = new C11739Wf();
            if (jSONObjectM26118c13 != null) {
                JSONArray jSONArrayOptJSONArray6 = jSONObjectM26118c13.optJSONArray(f24585Z1);
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray6.length(); i6++) {
                        c11739Wf.m27841a(jSONArrayOptJSONArray6.optString(i6));
                    }
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectM26118c13.optJSONObject(f24588a2);
                if (jSONObjectOptJSONObject != null) {
                    c11739Wf.m27842a(jSONObjectOptJSONObject);
                }
                c11739Wf.m27843a(jSONObjectM26118c13.optBoolean(f24591b2, true));
            }
            C11805ad c11805ad = new C11805ad();
            if (jSONObjectM26118c19 != 0) {
                String strOptString8 = jSONObjectM26118c19.optString(f24590b1, C12117bd.f30133a);
                zOptBoolean = jSONObjectM26118c19.optBoolean(f24593c1, true);
                c11805ad.m28181a(strOptString8);
            } else {
                zOptBoolean = true;
            }
            c11805ad.m28186b(zOptBoolean);
            if (zOptBoolean) {
                c11805ad.m28187b(m26111a(jSONObjectM26118c11, "optOut"));
                c11805ad.m28183a(m26111a(jSONObjectM26118c11, "optIn"));
                c11805ad.m28182a(jSONObjectM26118c11.optBoolean("eventsCompression", false));
                c11805ad.m28180a(jSONObjectM26118c11.optInt("eventsCompressionLevel", -1));
            }
            C11624Q1 c11624q1 = new C11624Q1(jSONObjectM26118c12.optInt("server", 3), jSONObjectM26118c12.optInt("publisher", 3), jSONObjectM26118c12.optInt("console", 3), jSONObjectM26118c12.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            C11445G1 c11445g1 = new C11445G1();
            if (jSONObjectM26118c16 != null) {
                c11445g1.m25818a(jSONObjectM26118c16.optBoolean("enabled", false));
                c11445g1.m25823c(jSONObjectM26118c16.optString("reporterURL", str13));
                c11445g1.m25820b(jSONObjectM26118c16.optString("reporterKeyword", str13));
                c11445g1.m25824c(jSONObjectM26118c16.optBoolean("includeANR", false));
                c11445g1.m25816a(jSONObjectM26118c16.optInt("timeout", 5000));
                c11445g1.m25821b(jSONObjectM26118c16.optBoolean("setIgnoreDebugger", false));
                JSONArray jSONArrayOptJSONArray7 = jSONObjectM26118c16.optJSONArray("keysToInclude");
                if (jSONArrayOptJSONArray7 != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray7.length(); i7++) {
                        c11445g1.m25817a(jSONArrayOptJSONArray7.optString(i7));
                    }
                }
            }
            C11512Je c11512Je = jSONObjectM26118c14 != null ? new C11512Je(jSONObjectM26118c14.optString("name", str13), jSONObjectM26118c14.optString("id", C11794a2.f26725f), jSONObjectM26118c14.optJSONObject("custom")) : null;
            C11553M1 c11553m1 = new C11553M1(jSONObjectM26118c17 != null ? jSONObjectM26118c17 : new JSONObject());
            C11535L1 c11535l1 = new C11535L1();
            if (jSONObjectM26118c18 != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectM26118c18.optJSONObject(f24634p0);
                Map map = new HashMap();
                if (jSONObjectOptJSONObject2 != null) {
                    map = IronSourceUtils.m32749b(jSONObjectOptJSONObject2);
                }
                c11535l1 = new C11535L1(map);
            }
            C11535L1 c11535l2 = c11535l1;
            C11337A1 c11337a1 = new C11337A1();
            if (jSONObject2 != null) {
                c11337a1 = new C11337A1(jSONObject2.optString(str8));
            }
            C11373C1 c11373c1 = new C11373C1(c11624q1, c11512Je, c11739Wf, jSONObject3.optBoolean("integration", false), c11445g1, c11553m1, c11535l2, c11805ad, c11337a1, str, c11499j1M26106a);
            C11531Kf c11531KfM26125h = m26125h(jSONObjectM26118c4);
            C12330a c12330aM26117c = m26117c(jSONObjectM26118c4);
            C11573N3.a aVar = new C11573N3.a();
            aVar.m26612a(c11652Rd);
            aVar.m26609a(c11363b9);
            aVar.m26614a(c11692u3);
            aVar.m26611a(c11545Lb);
            aVar.m26610a(c11373c1);
            aVar.m26618b(c11531KfM26125h);
            aVar.m26615a(c12330aM26117c);
            C11573N3 c11573n3M26616a = aVar.m26616a();
            this.f24668c = c11573n3M26616a;
            IronLog.INTERNAL.verbose(c11573n3M26616a.toString());
            JSONObject jSONObjectM26118c26 = m26118c(jSONObjectM26118c11, "genericParams");
            if (jSONObjectM26118c26 != null && (jSONObjectM26118c = m26118c(jSONObjectM26118c26, (str15 = str14))) != null) {
                jSONObjectM26118c26.remove(str15);
                Map<String, String> mapM32749b = IronSourceUtils.m32749b(jSONObjectM26118c);
                C11455Gb.m25891U().mo25850q().m32039b(mapM32749b);
                C11686Td.m27533i().m32039b(mapM32749b);
                C11399D9.m25613i().m32039b(mapM32749b);
            }
            if (jSONObjectM26118c26 != null) {
                Map<String, String> mapM32749b2 = IronSourceUtils.m32749b(jSONObjectM26118c26);
                C11455Gb.m25891U().mo25850q().m32036a(mapM32749b2);
                C11686Td.m27533i().m32036a(mapM32749b2);
                C11399D9.m25613i().m32036a(mapM32749b2);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m26130s() {
        try {
            JSONObject jSONObjectM26118c = m26118c(this.f24671f, "providerOrder");
            JSONArray jSONArrayM26114b = m26114b(jSONObjectM26118c, m26126m());
            JSONArray jSONArrayM26114b2 = m26114b(jSONObjectM26118c, "interstitial");
            JSONArray jSONArrayM26114b3 = m26114b(jSONObjectM26118c, "banner");
            JSONArray jSONArrayM26114b4 = m26114b(jSONObjectM26118c, "nativeAd");
            this.f24666a = new C12570vd();
            if (jSONArrayM26114b != null && m26133c() != null && m26133c().m26606f() != null) {
                for (int i = 0; i < jSONArrayM26114b.length(); i++) {
                    String strOptString = jSONArrayM26114b.optString(i);
                    this.f24666a.m33966d(strOptString);
                    NetworkSettings networkSettingsM34240b = C12624yd.m34235c().m34240b(strOptString);
                    if (networkSettingsM34240b != null) {
                        networkSettingsM34240b.setRewardedVideoPriority(i);
                    }
                }
            }
            if (jSONArrayM26114b2 != null && m26133c() != null && m26133c().m26604d() != null) {
                for (int i2 = 0; i2 < jSONArrayM26114b2.length(); i2++) {
                    String strOptString2 = jSONArrayM26114b2.optString(i2);
                    this.f24666a.m33962b(strOptString2);
                    NetworkSettings networkSettingsM34240b2 = C12624yd.m34235c().m34240b(strOptString2);
                    if (networkSettingsM34240b2 != null) {
                        networkSettingsM34240b2.setInterstitialPriority(i2);
                    }
                }
            }
            if (jSONArrayM26114b3 != null) {
                for (int i3 = 0; i3 < jSONArrayM26114b3.length(); i3++) {
                    String strOptString3 = jSONArrayM26114b3.optString(i3);
                    this.f24666a.m33960a(strOptString3);
                    NetworkSettings networkSettingsM34240b3 = C12624yd.m34235c().m34240b(strOptString3);
                    if (networkSettingsM34240b3 != null) {
                        networkSettingsM34240b3.setBannerPriority(i3);
                    }
                }
            }
            if (jSONArrayM26114b4 != null) {
                for (int i4 = 0; i4 < jSONArrayM26114b4.length(); i4++) {
                    String strOptString4 = jSONArrayM26114b4.optString(i4);
                    this.f24666a.m33964c(strOptString4);
                    NetworkSettings networkSettingsM34240b4 = C12624yd.m34235c().m34240b(strOptString4);
                    if (networkSettingsM34240b4 != null) {
                        networkSettingsM34240b4.setNativeAdPriority(i4);
                    }
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: t */
    private void m26131t() {
        try {
            this.f24667b = C12624yd.m34235c();
            JSONObject jSONObjectM26118c = m26118c(this.f24671f, "providerSettings");
            Iterator<String> itKeys = jSONObjectM26118c.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObjectM26118c.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                    String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                    String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                    String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                    String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                    String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                    JSONObject jSONObjectM26118c2 = m26118c(jSONObjectOptJSONObject, m26113b());
                    JSONObject jSONObjectM26118c3 = m26118c(jSONObjectOptJSONObject, "application");
                    JSONObject jSONObjectM26118c4 = m26118c(jSONObjectM26118c2, m26126m());
                    JSONObject jSONObjectM26118c5 = m26118c(jSONObjectM26118c2, "interstitial");
                    JSONObject jSONObjectM26118c6 = m26118c(jSONObjectM26118c2, "banner");
                    JSONObject jSONObjectM26118c7 = m26118c(jSONObjectM26118c2, "nativeAd");
                    JSONObject jSONObjectM32750b = IronSourceUtils.m32750b(jSONObjectM26118c4, jSONObjectM26118c3);
                    JSONObject jSONObjectM32750b2 = IronSourceUtils.m32750b(jSONObjectM26118c5, jSONObjectM26118c3);
                    JSONObject jSONObjectM32750b3 = IronSourceUtils.m32750b(jSONObjectM26118c6, jSONObjectM26118c3);
                    JSONObject jSONObjectM32750b4 = IronSourceUtils.m32750b(jSONObjectM26118c7, jSONObjectM26118c3);
                    if (this.f24667b.m34239a(next)) {
                        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(EnumC12598x5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings networkSettingsM34240b = this.f24667b.m34240b(next);
                        JSONObject rewardedVideoSettings = networkSettingsM34240b.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsM34240b.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsM34240b.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsM34240b.getNativeAdSettings();
                        networkSettingsM34240b.setRewardedVideoSettings(IronSourceUtils.m32750b(rewardedVideoSettings, jSONObjectM32750b));
                        networkSettingsM34240b.setInterstitialSettings(IronSourceUtils.m32750b(interstitialSettings, jSONObjectM32750b2));
                        networkSettingsM34240b.setBannerSettings(IronSourceUtils.m32750b(bannerSettings, jSONObjectM32750b3));
                        networkSettingsM34240b.setNativeAdSettings(IronSourceUtils.m32750b(nativeAdSettings, jSONObjectM32750b4));
                        networkSettingsM34240b.setIsMultipleInstances(zOptBoolean);
                        networkSettingsM34240b.setSubProviderId(strOptString);
                        networkSettingsM34240b.setAdSourceNameForEvents(strOptString2);
                        networkSettingsM34240b.setProviderNetworkKey(strOptString3);
                    } else {
                        if (m26116b(strOptString4)) {
                            NetworkSettings networkSettingsM34240b2 = this.f24667b.m34240b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsM34240b2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsM34240b2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsM34240b2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsM34240b2.getNativeAdSettings();
                            NetworkSettings networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectM26118c3, IronSourceUtils.m32750b(new JSONObject(rewardedVideoSettings2.toString()), jSONObjectM32750b), IronSourceUtils.m32750b(new JSONObject(interstitialSettings2.toString()), jSONObjectM32750b2), IronSourceUtils.m32750b(new JSONObject(bannerSettings2.toString()), jSONObjectM32750b3), IronSourceUtils.m32750b(new JSONObject(nativeAdSettings2.toString()), jSONObjectM32750b4));
                            networkSettings.setIsMultipleInstances(zOptBoolean);
                            networkSettings.setSubProviderId(strOptString);
                            networkSettings.setAdSourceNameForEvents(strOptString2);
                            this.f24667b.m34238a(networkSettings);
                        } else {
                            NetworkSettings networkSettings2 = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectM26118c3, jSONObjectM32750b, jSONObjectM32750b2, jSONObjectM32750b3, jSONObjectM32750b4);
                            networkSettings2.setIsMultipleInstances(zOptBoolean);
                            networkSettings2.setSubProviderId(strOptString);
                            networkSettings2.setAdSourceNameForEvents(strOptString2);
                            this.f24667b.m34238a(networkSettings2);
                        }
                        jSONObjectM26118c = jSONObjectM26118c;
                        itKeys = itKeys;
                    }
                }
            }
            this.f24667b.m34241b();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public String m26134e() {
        JSONObject jSONObject = this.f24671f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f24671f.optString("error");
    }

    /* JADX INFO: renamed from: g */
    public C11732W8 m26136g() {
        return new C11732W8(this.f24669d, this.f24670e);
    }

    /* JADX INFO: renamed from: h */
    public List<IronSource.EnumC12328a> m26137h() {
        C12570vd c12570vd;
        C12570vd c12570vd2;
        C12570vd c12570vd3;
        C12570vd c12570vd4;
        if (this.f24671f == null || this.f24668c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f24668c.m26606f() != null && (c12570vd4 = this.f24666a) != null && !c12570vd4.m33965d().isEmpty()) {
            arrayList.add(IronSource.EnumC12328a.REWARDED_VIDEO);
        }
        if (this.f24668c.m26604d() != null && (c12570vd3 = this.f24666a) != null && !c12570vd3.m33961b().isEmpty()) {
            arrayList.add(IronSource.EnumC12328a.INTERSTITIAL);
        }
        if (this.f24668c.m26603c() != null && (c12570vd2 = this.f24666a) != null && !c12570vd2.m33959a().isEmpty()) {
            arrayList.add(IronSource.EnumC12328a.BANNER);
        }
        if (this.f24668c.m26605e() != null && (c12570vd = this.f24666a) != null && !c12570vd.m33963c().isEmpty()) {
            arrayList.add(IronSource.EnumC12328a.NATIVE_AD);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public a m26138i() {
        return this.f24673h;
    }

    /* JADX INFO: renamed from: j */
    public JSONObject m26139j() {
        return this.f24671f;
    }

    /* JADX INFO: renamed from: k */
    public C12570vd m26140k() {
        return this.f24666a;
    }

    /* JADX INFO: renamed from: l */
    public C12624yd m26141l() {
        return this.f24667b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m26142p() {
        return !TextUtils.isEmpty(m26133c().m26607g().m26307b());
    }

    /* JADX INFO: renamed from: q */
    public boolean m26143q() {
        JSONObject jSONObject = this.f24671f;
        return (jSONObject == null || jSONObject.has("error") || this.f24666a == null || this.f24667b == null || this.f24668c == null || !m26127n()) ? false : true;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f24669d);
            jSONObject.put("userId", this.f24670e);
            jSONObject.put(f24627n, this.f24671f);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: b */
    private String m26113b() {
        return this.f24675j ? "adFormats" : C11793a1.f26718c;
    }

    /* JADX INFO: renamed from: g */
    private C12135cd m26124g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f24608h1, false);
        String strOptString2 = jSONObject.optString("virtualItemName", "");
        int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
        C12153dd c12153ddM26107a = m26107a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || iOptInt2 <= 0) {
            return null;
        }
        C12135cd c12135cd = new C12135cd(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, c12153ddM26107a);
        if (c12153ddM26107a != null) {
            this.f24674i.mo26264b(this.f24672g, c12135cd, IronSource.EnumC12328a.REWARDED_VIDEO);
        }
        return c12135cd;
    }

    /* JADX INFO: renamed from: c */
    public C11573N3 m26133c() {
        return this.f24668c;
    }

    /* JADX INFO: renamed from: b */
    private JSONArray m26114b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.f24675j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectM26118c = m26118c(jSONObject, str);
        String strM26108a = m26108a(str);
        if (jSONObjectM26118c == null || strM26108a == null) {
            return null;
        }
        return jSONObjectM26118c.optJSONArray(strM26108a);
    }

    /* JADX INFO: renamed from: c */
    private C12330a m26117c(JSONObject jSONObject) {
        C12330a c12330a = new C12330a();
        JSONObject jSONObjectM26118c = m26118c(jSONObject, "AdQuality");
        if (jSONObjectM26118c != null) {
            c12330a.m32252a(jSONObjectM26118c.optInt("initMode", 0));
            new C11648R9().m27352b(jSONObjectM26118c.optString("adq_init_blob"));
        }
        return c12330a;
    }

    /* JADX INFO: renamed from: e */
    private C11435F9 m26122e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(f24608h1, false);
        C12153dd c12153ddM26107a = m26107a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C11435F9 c11435f9 = new C11435F9(iOptInt, strOptString, zOptBoolean, c12153ddM26107a);
        if (c12153ddM26107a != null) {
            this.f24674i.mo26264b(this.f24672g, c11435f9, IronSource.EnumC12328a.INTERSTITIAL);
        }
        return c11435f9;
    }

    /* JADX INFO: renamed from: a */
    public void m26132a(a aVar) {
        this.f24673h = aVar;
    }

    /* JADX INFO: renamed from: a */
    private void m26109a() {
        this.f24671f = new JSONObject();
        this.f24669d = "";
        this.f24670e = "";
        this.f24666a = new C12570vd();
        this.f24667b = C12624yd.m34235c();
        this.f24668c = new C11573N3.a().m26616a();
        this.f24674i = C11455Gb.m25885O().mo25781x();
        m26115b(this.f24671f);
    }

    /* JADX INFO: renamed from: d */
    private JSONObject m26121d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectM26118c = m26118c(jSONObject, str);
        return jSONObjectM26118c != null ? jSONObjectM26118c : new JSONObject();
    }

    /* JADX INFO: renamed from: b */
    private boolean m26116b(String str) {
        return this.f24667b.m34239a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    /* JADX INFO: renamed from: f */
    public C11521K5 m26135f() {
        return this.f24676k;
    }

    /* JADX INFO: renamed from: d */
    private Context m26119d() {
        return this.f24672g;
    }

    /* JADX INFO: renamed from: a */
    private String m26108a(String str) {
        try {
            JSONObject jSONObjectM26118c = m26118c(m26118c(m26118c(m26118c(this.f24671f, "configurations"), "adFormats"), str), C11793a1.f26718c);
            if (jSONObjectM26118c == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectM26118c.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectM26118c2 = m26118c(jSONObjectM26118c, next);
                if (jSONObjectM26118c2 != null && jSONObjectM26118c2.optBoolean(f24608h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C11739Wf m26112b(C11494Ie c11494Ie) {
        if (c11494Ie != null && c11494Ie.m26143q()) {
            return c11494Ie.m26133c().m26602b().m25553k();
        }
        return C11739Wf.m27839a();
    }

    /* JADX INFO: renamed from: h */
    private C11531Kf m26125h(JSONObject jSONObject) {
        C11531Kf c11531Kf = new C11531Kf();
        JSONObject jSONObjectM26118c = m26118c(jSONObject, "testSuite");
        if (jSONObjectM26118c != null) {
            c11531Kf.m26308b(jSONObjectM26118c.optString("controllerUrl"));
        }
        return c11531Kf;
    }

    public C11494Ie(C11494Ie c11494Ie) {
        this.f24673h = a.NOT_SET;
        this.f24675j = false;
        try {
            this.f24672g = c11494Ie.m26119d();
            this.f24671f = new JSONObject(c11494Ie.f24671f.toString());
            this.f24669d = c11494Ie.f24669d;
            this.f24670e = c11494Ie.f24670e;
            this.f24675j = c11494Ie.f24675j;
            this.f24666a = c11494Ie.m26140k();
            this.f24667b = c11494Ie.m26141l();
            this.f24668c = c11494Ie.m26133c();
            this.f24673h = c11494Ie.m26138i();
            this.f24674i = C11455Gb.m25885O().mo25781x();
            m26115b(this.f24671f);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            m26109a();
        }
    }

    /* JADX INFO: renamed from: a */
    private C11499J1 m26106a(JSONObject jSONObject, Boolean bool) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
        int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString = jSONObject.optString("serverEventsURL", "");
        String strOptString2 = jSONObject.optString("serverEventsType", "");
        int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
        int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
        int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
        int[] iArr4 = null;
        if (jSONArrayOptJSONArray != null) {
            int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                iArr5[i] = jSONArrayOptJSONArray.optInt(i);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                iArr6[i2] = jSONArrayOptJSONArray2.optInt(i2);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                iArr7[i3] = jSONArrayOptJSONArray3.optInt(i3);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            iArr4 = new int[jSONArrayOptJSONArray4.length()];
            for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                iArr4[i4] = jSONArrayOptJSONArray4.optInt(i4);
            }
        }
        return new C11499J1(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    /* JADX INFO: renamed from: a */
    private int[] m26111a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            iArr[i] = jSONArrayOptJSONArray.optInt(i);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    private boolean m26110a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z) {
        if (jSONObject.has(str)) {
            return jSONObject.optBoolean(str, z);
        }
        return jSONObject2.has(str) ? jSONObject2.optBoolean(str, z) : z;
    }

    /* JADX INFO: renamed from: a */
    private int m26103a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i : iOptInt;
    }

    /* JADX INFO: renamed from: a */
    private long m26104a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long jOptLong;
        if (jSONObject.has(str)) {
            jOptLong = jSONObject.optLong(str, 0L);
        } else {
            jOptLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return jOptLong == 0 ? j : jOptLong;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[PHI: r7
  0x0036: PHI (r7v3 com.ironsource.hd) = (r7v1 com.ironsource.hd), (r7v2 com.ironsource.hd) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    private C12153dd m26107a(JSONObject jSONObject) {
        EnumC12233hd enumC12233hd = null;
        if (jSONObject == null) {
            return null;
        }
        C12153dd.a aVar = new C12153dd.a();
        aVar.m31323a(jSONObject.optBoolean("delivery", true));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("capping");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString(f24629n1);
            if (!TextUtils.isEmpty(strOptString)) {
                EnumC12233hd enumC12233hd2 = EnumC12233hd.PER_DAY;
                if (enumC12233hd2.toString().equals(strOptString)) {
                    enumC12233hd = enumC12233hd2;
                } else {
                    enumC12233hd2 = EnumC12233hd.PER_HOUR;
                    if (enumC12233hd2.toString().equals(strOptString)) {
                        enumC12233hd = enumC12233hd2;
                    }
                }
            }
            int iOptInt = jSONObjectOptJSONObject.optInt(f24621l1, 0);
            aVar.m31325a(jSONObjectOptJSONObject.optBoolean("enabled", false) && iOptInt > 0, enumC12233hd, iOptInt);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("pacing");
        if (jSONObjectOptJSONObject2 != null) {
            int iOptInt2 = jSONObjectOptJSONObject2.optInt(f24625m1, 0);
            aVar.m31324a(jSONObjectOptJSONObject2.optBoolean("enabled", false) && iOptInt2 > 0, iOptInt2);
        }
        return aVar.m31326a();
    }
}
