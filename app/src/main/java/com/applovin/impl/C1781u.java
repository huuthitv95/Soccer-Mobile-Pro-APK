package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C1781u {

    /* JADX INFO: renamed from: e */
    private static final Map f3392e = new HashMap();

    /* JADX INFO: renamed from: f */
    private static final Object f3393f = new Object();

    /* JADX INFO: renamed from: a */
    private JSONObject f3394a;

    /* JADX INFO: renamed from: b */
    private final String f3395b;

    /* JADX INFO: renamed from: c */
    private AppLovinAdSize f3396c;

    /* JADX INFO: renamed from: d */
    private AppLovinAdType f3397d;

    private C1781u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f3396c = appLovinAdSize;
        this.f3397d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        if (z) {
            lowerCase = lowerCase + "_bidding";
        }
        if (z2) {
            lowerCase = lowerCase + "_direct_sold";
        }
        this.f3395b = lowerCase;
    }

    /* JADX INFO: renamed from: a */
    public static C1781u m5249a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return m5250a(appLovinAdSize, appLovinAdType, null);
    }

    /* JADX INFO: renamed from: a */
    public static C1781u m5250a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return m5251a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    /* JADX INFO: renamed from: a */
    public static C1781u m5251a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z, boolean z2) {
        C1781u c1781u = new C1781u(appLovinAdSize, appLovinAdType, str, z, z2);
        synchronized (f3393f) {
            String str2 = c1781u.f3395b;
            Map map = f3392e;
            if (map.containsKey(str2)) {
                c1781u = (C1781u) map.get(str2);
            } else {
                map.put(str2, c1781u);
            }
        }
        return c1781u;
    }

    /* JADX INFO: renamed from: a */
    public static C1781u m5252a(String str) {
        return m5250a(null, null, str);
    }

    /* JADX INFO: renamed from: a */
    public static Collection m5253a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, m5257c(), m5260k(), m5259j(), m5262m(), m5255b(), m5258h(), m5261l());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: renamed from: a */
    public static void m5254a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f3393f) {
                C1781u c1781u = (C1781u) f3392e.get(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                if (c1781u != null) {
                    c1781u.f3396c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    c1781u.f3397d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1781u m5255b() {
        return m5249a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    /* JADX INFO: renamed from: b */
    public static C1781u m5256b(String str) {
        return m5250a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    /* JADX INFO: renamed from: c */
    public static C1781u m5257c() {
        return m5249a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    /* JADX INFO: renamed from: h */
    public static C1781u m5258h() {
        return m5249a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    /* JADX INFO: renamed from: j */
    public static C1781u m5259j() {
        return m5249a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    /* JADX INFO: renamed from: k */
    public static C1781u m5260k() {
        return m5249a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    /* JADX INFO: renamed from: l */
    public static C1781u m5261l() {
        return m5249a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    /* JADX INFO: renamed from: m */
    public static C1781u m5262m() {
        return m5249a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    /* JADX INFO: renamed from: d */
    public MaxAdFormat m5263d() {
        AppLovinAdSize appLovinAdSizeM5265f = m5265f();
        if (appLovinAdSizeM5265f == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeM5265f == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeM5265f == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeM5265f != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeM5265f == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (m5266g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (m5266g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (m5266g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m5264e() {
        return this.f3395b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1781u.class != obj.getClass()) {
            return false;
        }
        return this.f3395b.equalsIgnoreCase(((C1781u) obj).f3395b);
    }

    /* JADX INFO: renamed from: f */
    public AppLovinAdSize m5265f() {
        if (this.f3396c == null && JsonUtils.valueExists(this.f3394a, "ad_size")) {
            this.f3396c = AppLovinAdSize.fromString(JsonUtils.getString(this.f3394a, "ad_size", null));
        }
        return this.f3396c;
    }

    /* JADX INFO: renamed from: g */
    public AppLovinAdType m5266g() {
        if (this.f3397d == null && JsonUtils.valueExists(this.f3394a, "ad_type")) {
            this.f3397d = AppLovinAdType.fromString(JsonUtils.getString(this.f3394a, "ad_type", null));
        }
        return this.f3397d;
    }

    public int hashCode() {
        return this.f3395b.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m5267i() {
        return m5253a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f3395b + ", zoneObject=" + this.f3394a + AbstractJsonLexerKt.END_OBJ;
    }
}
