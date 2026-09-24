package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.LGPD;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.mg */
/* JADX INFO: loaded from: classes3.dex */
public class C3920mg {

    /* JADX INFO: renamed from: A */
    public final boolean f15357A;

    /* JADX INFO: renamed from: B */
    public final a f15358B;

    /* JADX INFO: renamed from: C */
    public b f15359C;

    /* JADX INFO: renamed from: D */
    public final String f15360D;

    /* JADX INFO: renamed from: E */
    public final long f15361E;

    /* JADX INFO: renamed from: F */
    public final long f15362F;

    /* JADX INFO: renamed from: G */
    public final C3692ci f15363G;

    /* JADX INFO: renamed from: H */
    public final C3717dk f15364H;

    /* JADX INFO: renamed from: I */
    public final C4138wd f15365I;

    /* JADX INFO: renamed from: J */
    public final List f15366J;

    /* JADX INFO: renamed from: K */
    public final boolean f15367K;

    /* JADX INFO: renamed from: L */
    public final C4197z6 f15368L;

    /* JADX INFO: renamed from: a */
    public final String f15369a;

    /* JADX INFO: renamed from: b */
    public final boolean f15370b;

    /* JADX INFO: renamed from: c */
    public final boolean f15371c;

    /* JADX INFO: renamed from: d */
    public final List f15372d;

    /* JADX INFO: renamed from: e */
    public final boolean f15373e;

    /* JADX INFO: renamed from: f */
    public final boolean f15374f;

    /* JADX INFO: renamed from: g */
    public final boolean f15375g;

    /* JADX INFO: renamed from: h */
    public final boolean f15376h;

    /* JADX INFO: renamed from: i */
    public final boolean f15377i;

    /* JADX INFO: renamed from: j */
    public final boolean f15378j;

    /* JADX INFO: renamed from: k */
    public final boolean f15379k;

    /* JADX INFO: renamed from: l */
    public final boolean f15380l;

    /* JADX INFO: renamed from: m */
    public final boolean f15381m;

    /* JADX INFO: renamed from: n */
    public final int f15382n;

    /* JADX INFO: renamed from: o */
    public final int f15383o;

    /* JADX INFO: renamed from: p */
    public final int f15384p;

    /* JADX INFO: renamed from: q */
    public final List f15385q;

    /* JADX INFO: renamed from: r */
    public final boolean f15386r;

    /* JADX INFO: renamed from: s */
    public final boolean f15387s;

    /* JADX INFO: renamed from: t */
    public final boolean f15388t;

    /* JADX INFO: renamed from: u */
    public final int f15389u;

    /* JADX INFO: renamed from: v */
    public final boolean f15390v;

    /* JADX INFO: renamed from: w */
    public final int f15391w;

    /* JADX INFO: renamed from: x */
    public final boolean f15392x;

    /* JADX INFO: renamed from: y */
    public final String f15393y;

    /* JADX INFO: renamed from: z */
    public final String f15394z;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.mg$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f15395a;

        /* JADX INFO: renamed from: a */
        public static a m18675a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f15395a = jSONObject.optBoolean("bannerEnable", true);
            return aVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m18676a() {
            return this.f15395a;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.mg$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public HashSet f15396a;

        /* JADX INFO: renamed from: a */
        public static b m18677a(JSONObject jSONObject) {
            b bVar = new b();
            HashSet hashSet = new HashSet();
            hashSet.add(CCPA.CCPA_STANDARD);
            hashSet.add(COPPA.COPPA_STANDARD);
            hashSet.add(LGPD.LGPD_STANDARD);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                m18679a(jSONArrayOptJSONArray, hashSet, length);
                m18678a(hashSet, length);
            }
            bVar.f15396a = hashSet;
            return bVar;
        }

        /* JADX INFO: renamed from: a */
        public static void m18678a(HashSet hashSet, int i) {
            if (i == 0) {
                hashSet.clear();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m18679a(JSONArray jSONArray, HashSet hashSet, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                hashSet.add(jSONArray.getString(i2));
            }
        }

        /* JADX INFO: renamed from: a */
        public HashSet m18680a() {
            return this.f15396a;
        }
    }

    public C3920mg(JSONObject jSONObject) {
        List arrayList;
        this.f15369a = jSONObject.optString("configVariant");
        this.f15370b = jSONObject.optBoolean("prefetchDisable");
        this.f15371c = jSONObject.optBoolean("publisherDisable");
        this.f15358B = a.m18675a(jSONObject);
        try {
            this.f15359C = b.m18677a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f15360D = jSONObject.optString("publisherWarning", null);
        this.f15361E = jSONObject.optLong("maxBytes", 104857600L);
        this.f15362F = jSONObject.optLong("ttl", 604800000L);
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!strOptString.isEmpty()) {
                    arrayList2.add(strOptString);
                }
            }
        }
        this.f15372d = Collections.unmodifiableList(arrayList2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("trackingLevels");
        jSONObjectOptJSONObject = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f15373e = jSONObjectOptJSONObject.optBoolean("critical", true);
        this.f15380l = jSONObjectOptJSONObject.optBoolean("includeStackTrace", true);
        this.f15374f = jSONObjectOptJSONObject.optBoolean("error");
        this.f15375g = jSONObjectOptJSONObject.optBoolean("debug");
        this.f15376h = jSONObjectOptJSONObject.optBoolean("session");
        this.f15377i = jSONObjectOptJSONObject.optBoolean("system");
        this.f15378j = jSONObjectOptJSONObject.optBoolean("timing");
        this.f15379k = jSONObjectOptJSONObject.optBoolean("user");
        this.f15381m = jSONObjectOptJSONObject.optBoolean("loggerCallerInfoCache", true);
        this.f15363G = AbstractC3715di.m17307b(jSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoPreCaching");
        this.f15364H = C3717dk.m17340a(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("omSdk");
        this.f15365I = AbstractC4160xd.m19959b(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(C11744X3.i.f26336K);
        jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4;
        this.f15382n = jSONObjectOptJSONObject4.optInt("cacheMaxBytes", 104857600);
        int iOptInt = jSONObjectOptJSONObject4.optInt("cacheMaxUnits", 10);
        this.f15383o = iOptInt > 0 ? iOptInt : 10;
        this.f15384p = (int) TimeUnit.SECONDS.toDays(jSONObjectOptJSONObject4.optInt("cacheTTLs", InterfaceC3995q2.f15847a));
        ArrayList arrayList3 = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("directories");
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String strOptString2 = jSONArrayOptJSONArray2.optString(i2);
                if (!strOptString2.isEmpty()) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        this.f15385q = Collections.unmodifiableList(arrayList3);
        this.f15386r = jSONObjectOptJSONObject4.optBoolean("enabled", m18661l());
        this.f15387s = jSONObjectOptJSONObject4.optBoolean("inplayEnabled", true);
        this.f15388t = jSONObjectOptJSONObject4.optBoolean("interstitialEnabled", true);
        int iOptInt2 = jSONObjectOptJSONObject4.optInt("invalidatePendingImpression", 3);
        this.f15389u = iOptInt2 <= 0 ? 3 : iOptInt2;
        this.f15390v = jSONObjectOptJSONObject4.optBoolean("lockOrientation", true);
        this.f15391w = jSONObjectOptJSONObject4.optInt("prefetchSession", 3);
        this.f15392x = jSONObjectOptJSONObject4.optBoolean("rewardVideoEnabled", true);
        String strOptString3 = jSONObjectOptJSONObject4.optString("version", "v2");
        this.f15393y = strOptString3;
        this.f15394z = String.format("%s/%s%s", C11744X3.i.f26336K, strOptString3, "/prefetch");
        this.f15357A = jSONObjectOptJSONObject4.optBoolean("redirectOpenToNativeBrowser", false);
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("event_trackers");
        if (jSONObject.has("event_trackers") && jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else if (!jSONObject.has("event_trackers") || jSONArrayOptJSONArray3 == null) {
            arrayList = null;
        } else {
            try {
                List listM19028a = C3978p7.m19028a(jSONArrayOptJSONArray3);
                arrayList = (listM19028a == null || listM19028a.isEmpty()) ? Collections.EMPTY_LIST : new ArrayList(listM19028a);
            } catch (Exception unused) {
                arrayList = Collections.EMPTY_LIST;
            }
        }
        this.f15366J = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        this.f15367K = jSONObject.optBoolean("nrp_waterfall_enabled", false);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("nrp_waterfall_endpoints");
        if (jSONObjectOptJSONObject5 != null) {
            this.f15368L = new C4197z6(jSONObjectOptJSONObject5.has("banner") ? jSONObjectOptJSONObject5.optString("banner", "https://da.chartboost.com/unified/v1/sdk/banner") : "https://da.chartboost.com/unified/v1/sdk/banner", jSONObjectOptJSONObject5.has("interstitial") ? jSONObjectOptJSONObject5.optString("interstitial", "https://da.chartboost.com/unified/v1/sdk/interstitial") : "https://da.chartboost.com/unified/v1/sdk/interstitial", jSONObjectOptJSONObject5.has("rewarded") ? jSONObjectOptJSONObject5.optString("rewarded", "https://da.chartboost.com/unified/v1/sdk/rewarded") : "https://da.chartboost.com/unified/v1/sdk/rewarded");
        } else {
            this.f15368L = C4197z6.INSTANCE.m20112a();
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m18661l() {
        int[] iArr = {4, 4, 2};
        String strM18135a = C3836j1.m18133b().m18135a();
        if (strM18135a != null && strM18135a.length() > 0) {
            String[] strArrSplit = strM18135a.replaceAll("[^\\d.]", "").split("\\.");
            for (int i = 0; i < strArrSplit.length && i < 3; i++) {
                try {
                    if (Integer.parseInt(strArrSplit[i]) > iArr[i]) {
                        return true;
                    }
                    if (Integer.parseInt(strArrSplit[i]) < iArr[i]) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public a m18662a() {
        return this.f15358B;
    }

    /* JADX INFO: renamed from: b */
    public List m18663b() {
        return this.f15366J;
    }

    /* JADX INFO: renamed from: c */
    public C4197z6 m18664c() {
        return this.f15368L;
    }

    /* JADX INFO: renamed from: d */
    public C4138wd m18665d() {
        return this.f15365I;
    }

    /* JADX INFO: renamed from: e */
    public C3717dk m18666e() {
        return this.f15364H;
    }

    /* JADX INFO: renamed from: f */
    public boolean m18667f() {
        return this.f15370b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m18668g() {
        return this.f15371c;
    }

    /* JADX INFO: renamed from: h */
    public String m18669h() {
        return this.f15360D;
    }

    /* JADX INFO: renamed from: i */
    public C3692ci m18670i() {
        return this.f15363G;
    }

    /* JADX INFO: renamed from: j */
    public boolean m18671j() {
        return this.f15367K;
    }

    /* JADX INFO: renamed from: k */
    public boolean m18672k() {
        return this.f15386r;
    }

    /* JADX INFO: renamed from: m */
    public boolean m18673m() {
        return this.f15390v;
    }

    /* JADX INFO: renamed from: n */
    public C3725e5 m18674n() {
        return new C3725e5(this.f15369a, this.f15386r, this.f15393y, this.f15367K, this.f15368L);
    }
}
