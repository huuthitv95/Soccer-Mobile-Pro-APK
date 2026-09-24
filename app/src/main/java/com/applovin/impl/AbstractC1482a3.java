package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.arch.core.util.Function;
import com.applovin.impl.mediation.C1655h;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.a3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1482a3 extends C1619m3 implements MaxAd {

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f991k;

    /* JADX INFO: renamed from: l */
    private final AtomicBoolean f992l;

    /* JADX INFO: renamed from: m */
    private final AtomicBoolean f993m;

    /* JADX INFO: renamed from: n */
    private final C1519c3 f994n;

    /* JADX INFO: renamed from: o */
    protected C1655h f995o;

    /* JADX INFO: renamed from: p */
    private final String f996p;

    /* JADX INFO: renamed from: q */
    private MaxAdWaterfallInfo f997q;

    /* JADX INFO: renamed from: r */
    private long f998r;

    /* JADX INFO: renamed from: s */
    private long f999s;

    /* JADX INFO: renamed from: t */
    private long f1000t;

    /* JADX INFO: renamed from: u */
    private long f1001u;

    /* JADX INFO: renamed from: v */
    private long f1002v;

    /* JADX INFO: renamed from: w */
    private long f1003w;

    /* JADX INFO: renamed from: x */
    private long f1004x;

    /* JADX INFO: renamed from: y */
    private String f1005y;

    /* JADX INFO: renamed from: z */
    private String f1006z;

    protected AbstractC1482a3(C1519c3 c1519c3, JSONObject jSONObject, JSONObject jSONObject2, C1655h c1655h, C1748l c1748l) {
        super(c1519c3.m2196e(), jSONObject, jSONObject2, c1748l);
        this.f991k = new AtomicBoolean();
        this.f992l = new AtomicBoolean();
        this.f993m = new AtomicBoolean();
        this.f994n = c1519c3;
        this.f995o = c1655h;
        this.f996p = c1655h != null ? c1655h.m3567b() : null;
    }

    /* JADX INFO: renamed from: M */
    private long m1807M() {
        return m3184a("load_started_time_ms", 0L);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1482a3 m1808a(C1519c3 c1519c3, JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        String string = JsonUtils.getString(jSONObject2, FirebaseAnalytics.Param.AD_FORMAT, null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new C1529d3(c1519c3, jSONObject, jSONObject2, c1748l);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new C1549f3(c1519c3, jSONObject, jSONObject2, c1748l);
        }
        if (fromString.isFullscreenAd()) {
            return new C1539e3(c1519c3, jSONObject, jSONObject2, c1748l);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ JSONObject m1809b(C1591j5 c1591j5) {
        return JsonUtils.deepCopy(c1591j5.m3000a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ Bundle m1810c(C1591j5 c1591j5) {
        JSONObject jSONObjectM3000a;
        if (c1591j5.m3004a("credentials")) {
            jSONObjectM3000a = c1591j5.m3000a("credentials", new JSONObject());
        } else {
            jSONObjectM3000a = c1591j5.m3000a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectM3000a, "placement_id", m1834U());
        }
        return JsonUtils.toBundle(jSONObjectM3000a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ JSONObject m1811d(C1591j5 c1591j5) {
        return JsonUtils.deepCopy(c1591j5.m3000a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Double m1812e(C1591j5 c1591j5) {
        return Double.valueOf(JsonUtils.getDouble(c1591j5.m3000a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ JSONObject m1813f(C1591j5 c1591j5) {
        return JsonUtils.deepCopy(c1591j5.m3000a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m1814g(C1591j5 c1591j5) {
        return JsonUtils.getString(c1591j5.m3000a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    /* JADX INFO: renamed from: A */
    public String m1815A() {
        return this.f996p;
    }

    /* JADX INFO: renamed from: B */
    public C1655h m1816B() {
        return this.f995o;
    }

    /* JADX INFO: renamed from: C */
    public String m1817C() {
        return m3187a("bcode", "");
    }

    /* JADX INFO: renamed from: D */
    public long m1818D() {
        return m3184a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, m3216l()));
    }

    /* JADX INFO: renamed from: E */
    public String m1819E() {
        return m3187a("bid_response", (String) null);
    }

    /* JADX INFO: renamed from: F */
    public Bundle m1820F() {
        JSONObject jSONObjectM3190a;
        C1591j5 c1591j5 = this.f2062h;
        if (c1591j5 != null) {
            return (Bundle) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m1810c((C1591j5) obj);
                }
            });
        }
        if (m3204c("credentials")) {
            jSONObjectM3190a = m3190a("credentials", new JSONObject());
        } else {
            jSONObjectM3190a = m3190a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectM3190a, "placement_id", m1834U());
        }
        return JsonUtils.toBundle(jSONObjectM3190a);
    }

    /* JADX INFO: renamed from: G */
    public long m1821G() {
        return this.f1004x;
    }

    /* JADX INFO: renamed from: H */
    public double m1822H() {
        return m3182a("ecpm", -1.0f);
    }

    /* JADX INFO: renamed from: I */
    public long m1823I() {
        if (m1807M() > 0) {
            return m1826L() - m1807M();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: J */
    public double m1824J() {
        return m3181a("floor", -1.0d);
    }

    /* JADX INFO: renamed from: K */
    public long m1825K() {
        return this.f1002v;
    }

    /* JADX INFO: renamed from: L */
    public long m1826L() {
        return m3184a("load_completed_time_ms", 0L);
    }

    /* JADX INFO: renamed from: N */
    public String m1827N() {
        return this.f1005y;
    }

    /* JADX INFO: renamed from: O */
    public int m1828O() {
        return m3183a("mspc", ((Integer) this.f2055a.m4801a(AbstractC1776t3.f3353i8)).intValue());
    }

    /* JADX INFO: renamed from: P */
    public JSONObject m1829P() {
        C1591j5 c1591j5 = this.f2062h;
        return c1591j5 != null ? (JSONObject) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda3
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return AbstractC1482a3.m1811d((C1591j5) obj);
            }
        }) : m3190a("publisher_extra_info", new JSONObject());
    }

    /* JADX INFO: renamed from: Q */
    public C1519c3 m1830Q() {
        return this.f994n;
    }

    /* JADX INFO: renamed from: R */
    public String m1831R() {
        return JsonUtils.getString(m1832S(), "revenue_event", "");
    }

    /* JADX INFO: renamed from: S */
    public JSONObject m1832S() {
        C1591j5 c1591j5 = this.f2062h;
        return c1591j5 != null ? (JSONObject) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return AbstractC1482a3.m1813f((C1591j5) obj);
            }
        }) : m3190a("revenue_parameters", new JSONObject());
    }

    /* JADX INFO: renamed from: T */
    public String m1833T() {
        return m3197b("event_id", "");
    }

    /* JADX INFO: renamed from: U */
    public String m1834U() {
        return m3187a("third_party_ad_placement_id", (String) null);
    }

    /* JADX INFO: renamed from: V */
    public long m1835V() {
        return this.f1003w;
    }

    /* JADX INFO: renamed from: W */
    public List m1836W() {
        return m3198b("mwf_info_urls");
    }

    /* JADX INFO: renamed from: X */
    public String m1837X() {
        return m3197b("waterfall_name", "");
    }

    /* JADX INFO: renamed from: Y */
    public String m1838Y() {
        return m3197b("waterfall_test_name", "");
    }

    /* JADX INFO: renamed from: Z */
    public boolean m1839Z() {
        return StringUtils.isValidString(m1819E());
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC1482a3 mo1840a(C1655h c1655h);

    /* JADX INFO: renamed from: a */
    public void m1841a(long j) {
        this.f998r = j;
    }

    /* JADX INFO: renamed from: a */
    public void mo1842a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && !m3204c(CampaignEx.JSON_KEY_CREATIVE_ID)) {
            m3203c(CampaignEx.JSON_KEY_CREATIVE_ID, BundleUtils.getString(CampaignEx.JSON_KEY_CREATIVE_ID, bundle));
        }
        if (bundle.containsKey("ad_width") && !m3204c("ad_width") && bundle.containsKey("ad_height") && !m3204c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            m3201c("ad_width", i);
            m3201c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            m1844a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1843a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f997q = maxAdWaterfallInfo;
    }

    /* JADX INFO: renamed from: a */
    public void m1844a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectM1829P = m1829P();
        JsonUtils.putAll(jSONObjectM1829P, jSONObject);
        m3191a("publisher_extra_info", (Object) jSONObjectM1829P);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m1845a0() {
        C1655h c1655h = this.f995o;
        return c1655h != null && c1655h.m3577k() && this.f995o.m3576j();
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m1846b0() {
        return m3185a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m1847c0() {
        return m3185a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    public void m1848d0() {
        this.f1004x = SystemClock.elapsedRealtime() - this.f1000t;
    }

    /* JADX INFO: renamed from: e0 */
    public void m1849e0() {
        this.f999s = SystemClock.elapsedRealtime();
        this.f1001u = this.f2055a.m4846o0().getTotalBackgroundDurationMillis();
    }

    /* JADX INFO: renamed from: f0 */
    public void m1850f0() {
        long totalBackgroundDurationMillis = this.f2055a.m4846o0().getTotalBackgroundDurationMillis() - this.f1001u;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f999s;
        this.f1003w = jElapsedRealtime;
        this.f1002v = jElapsedRealtime - totalBackgroundDurationMillis;
    }

    /* JADX INFO: renamed from: g0 */
    public void m1851g0() {
        this.f1000t = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f1006z;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectM1864y = m1864y();
        if (jSONObjectM1864y.has(str)) {
            return JsonUtils.getString(jSONObjectM1864y, str, str2);
        }
        Bundle bundleM3216l = m3216l();
        if (bundleM3216l.containsKey(str)) {
            return bundleM3216l.getString(str);
        }
        JSONObject jSONObjectM1829P = m1829P();
        return jSONObjectM1829P.has(str) ? JsonUtils.getString(jSONObjectM1829P, str, str2) : m3187a(str, str2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return m3187a(CampaignEx.JSON_KEY_CREATIVE_ID, (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return m3187a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return m3187a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(m3187a(FirebaseAnalytics.Param.AD_FORMAT, m3197b(FirebaseAnalytics.Param.AD_FORMAT, (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        C1655h c1655h = this.f995o;
        if (c1655h != null) {
            return c1655h.m3571e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return m3187a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(m1834U());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f998r;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f2055a.m4801a(AbstractC1776t3.f3358n8)).booleanValue() || !getFormat().isFullscreenAd() || m1860u().get()) {
            C1591j5 c1591j5 = this.f2062h;
            return c1591j5 != null ? ((Double) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AbstractC1482a3.m1812e((C1591j5) obj);
                }
            })).doubleValue() : JsonUtils.getDouble(m3190a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f2055a.m4782Q();
        if (!C1768p.m5160a()) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        this.f2055a.m4782Q().m5174b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        C1591j5 c1591j5 = this.f2062h;
        return c1591j5 != null ? (String) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return AbstractC1482a3.m1814g((C1591j5) obj);
            }
        }) : JsonUtils.getString(m3190a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iM3183a = m3183a("ad_width", -3);
        int iM3183a2 = m3183a("ad_height", -3);
        return (iM3183a == -3 || iM3183a2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iM3183a, iM3183a2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f997q;
    }

    /* JADX INFO: renamed from: h */
    public void m1852h(String str) {
        this.f1006z = str;
    }

    /* JADX INFO: renamed from: h0 */
    public void m1853h0() {
        m3202c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    /* JADX INFO: renamed from: i */
    public void m1854i(String str) {
        this.f1005y = str;
    }

    /* JADX INFO: renamed from: i0 */
    public void m1855i0() {
        m3202c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    /* JADX INFO: renamed from: j0 */
    public Boolean m1856j0() {
        return m3185a("destroy_on_ui_thread", (Boolean) null);
    }

    /* JADX INFO: renamed from: k0 */
    public Boolean m1857k0() {
        return m3185a("load_on_ui_thread", (Boolean) null);
    }

    /* JADX INFO: renamed from: l0 */
    public Boolean m1858l0() {
        return m3185a("show_on_ui_thread", (Boolean) null);
    }

    /* JADX INFO: renamed from: t */
    public void m1859t() {
        this.f995o = null;
        this.f997q = null;
    }

    @Override // com.applovin.impl.C1619m3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + m1834U() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    /* JADX INFO: renamed from: u */
    public AtomicBoolean m1860u() {
        return this.f991k;
    }

    /* JADX INFO: renamed from: v */
    public String m1861v() {
        return m3187a("adomain", (String) null);
    }

    /* JADX INFO: renamed from: w */
    public AtomicBoolean m1862w() {
        return this.f993m;
    }

    /* JADX INFO: renamed from: x */
    public AtomicBoolean m1863x() {
        return this.f992l;
    }

    /* JADX INFO: renamed from: y */
    public JSONObject m1864y() {
        C1591j5 c1591j5 = this.f2062h;
        return c1591j5 != null ? (JSONObject) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.a3$$ExternalSyntheticLambda5
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return AbstractC1482a3.m1809b((C1591j5) obj);
            }
        }) : m3190a("ad_values", new JSONObject());
    }

    /* JADX INFO: renamed from: z */
    public View m1865z() {
        C1655h c1655h;
        if (!m1845a0() || (c1655h = this.f995o) == null) {
            return null;
        }
        return c1655h.m3570d();
    }
}
