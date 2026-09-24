package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.impl.AbstractC1602k6;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1711r7;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1766e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.b */
/* JADX INFO: loaded from: classes3.dex */
public class C1761b extends AbstractRunnableC1601k5 implements C1760a.a, AppLovinAdLoadListener {

    /* JADX INFO: renamed from: A */
    private final List f3135A;

    /* JADX INFO: renamed from: B */
    private final List f3136B;

    /* JADX INFO: renamed from: g */
    private final JSONObject f3137g;

    /* JADX INFO: renamed from: h */
    private final JSONObject f3138h;

    /* JADX INFO: renamed from: i */
    private final AppLovinNativeAdLoadListener f3139i;

    /* JADX INFO: renamed from: j */
    private String f3140j;

    /* JADX INFO: renamed from: k */
    private String f3141k;

    /* JADX INFO: renamed from: l */
    private String f3142l;

    /* JADX INFO: renamed from: m */
    private Double f3143m;

    /* JADX INFO: renamed from: n */
    private String f3144n;

    /* JADX INFO: renamed from: o */
    private Uri f3145o;

    /* JADX INFO: renamed from: p */
    private Uri f3146p;

    /* JADX INFO: renamed from: q */
    private C1711r7 f3147q;

    /* JADX INFO: renamed from: r */
    private Uri f3148r;

    /* JADX INFO: renamed from: s */
    private Uri f3149s;

    /* JADX INFO: renamed from: t */
    private Uri f3150t;

    /* JADX INFO: renamed from: u */
    private Uri f3151u;

    /* JADX INFO: renamed from: v */
    private final List f3152v;

    /* JADX INFO: renamed from: w */
    private final List f3153w;

    /* JADX INFO: renamed from: x */
    private final List f3154x;

    /* JADX INFO: renamed from: y */
    private final List f3155y;

    /* JADX INFO: renamed from: z */
    private final List f3156z;

    public C1761b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1748l c1748l) {
        super("TaskRenderNativeAd", c1748l);
        this.f3140j = "";
        this.f3141k = "";
        this.f3142l = "";
        this.f3143m = null;
        this.f3144n = "";
        this.f3145o = null;
        this.f3146p = null;
        this.f3148r = null;
        this.f3149s = null;
        this.f3150t = null;
        this.f3151u = null;
        this.f3152v = new ArrayList();
        this.f3153w = new ArrayList();
        this.f3154x = new ArrayList();
        this.f3155y = new ArrayList();
        this.f3156z = new ArrayList();
        this.f3135A = new ArrayList();
        this.f3136B = new ArrayList();
        this.f3137g = jSONObject;
        this.f3138h = jSONObject2;
        this.f3139i = appLovinNativeAdLoadListener;
    }

    /* JADX INFO: renamed from: a */
    private void m5006a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f3150t = Uri.parse(string);
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Processed click destination URL: " + this.f3150t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f3151u = Uri.parse(string2);
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Processed click destination backup URL: " + this.f3151u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f3137g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f1969a.m4801a(C1831z4.f3801Q2)).booleanValue()) {
                try {
                    this.f3152v.addAll(JsonUtils.toList(jSONArray));
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Processed click tracking URLs: " + this.f3152v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (C1768p.m5160a()) {
                        this.f1971c.m5172a(this.f1970b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f3154x.add(new C1766e.a(this.f1969a).mo5045b(str).mo5047b(false).mo5042a(false).m5138h(m5011f()).mo5043a());
                    }
                }
            }
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Processed click tracking requests: " + this.f3154x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m5007b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().mo2812h();
            this.f3139i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Failed to prepare native ad view components", th);
            }
            m5008b(th.getMessage());
            this.f1969a.m4764E().m4329a(this.f1970b, "prepareNativeComponents", th);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5008b(String str) {
        this.f3139i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    /* JADX INFO: renamed from: c */
    private void m5009c(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5007b(appLovinNativeAdImpl);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private void m5010e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f3137g), JsonUtils.shallowCopy(this.f3138h), this.f1969a).setTitle(this.f3140j).setAdvertiser(this.f3141k).setBody(this.f3142l).setCallToAction(this.f3144n).setStarRating(this.f3143m).setIconUri(this.f3145o).setMainImageUri(this.f3146p).setPrivacyIconUri(this.f3148r).setVastAd(this.f3147q).setPrivacyDestinationUri(this.f3149s).setClickDestinationUri(this.f3150t).setClickDestinationBackupUri(this.f3151u).setClickTrackingUrls(this.f3152v).setJsTrackers(this.f3153w).setClickTrackingRequests(this.f3154x).setImpressionRequests(this.f3155y).setViewableMRC50Requests(this.f3156z).setViewableMRC100Requests(this.f3135A).setViewableVideo50Requests(this.f3136B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().m2809e();
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f1969a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1760a(appLovinNativeAdImplBuild, this.f1969a, this), C1552f6.b.CORE);
    }

    /* JADX INFO: renamed from: f */
    private boolean m5011f() {
        return JsonUtils.getBoolean(this.f3137g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f1969a.m4801a(C1831z4.f3793P2)).booleanValue();
    }

    @Override // com.applovin.impl.sdk.nativeAd.C1760a.a
    /* JADX INFO: renamed from: a */
    public void mo5005a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Successfully cached and loaded ad");
        }
        m5009c(appLovinNativeAdImpl);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "VAST ad rendered successfully");
        }
        this.f3147q = (C1711r7) appLovinAd;
        m5010e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "VAST ad failed to render");
        }
        m5010e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r3 = 0;
        String string = JsonUtils.getString(this.f3137g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f3148r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f3137g, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f3149s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f3137g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "No oRtb response provided: " + this.f3137g);
            }
            m5008b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        m5006a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to retrieve assets - failing ad load: " + this.f3137g);
            }
            m5008b("Unable to retrieve assets");
            return;
        }
        String str = "";
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) r3);
            if (jSONObject4.has("title")) {
                this.f3140j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r3), "text", r3);
                if (C1768p.m5160a()) {
                    this.f1971c.m5171a(this.f1970b, "Processed title: " + this.f3140j);
                }
            } else if (jSONObject4.has("link")) {
                m5006a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r3));
            } else if (jSONObject4.has("img")) {
                int i2 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r3);
                int i3 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r3);
                if (i3 == 1 || 3 == i2) {
                    this.f3145o = Uri.parse(string4);
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Processed icon URL: " + this.f3145o);
                    }
                } else if (i3 == 3 || 2 == i2) {
                    this.f3146p = Uri.parse(string4);
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Processed main image URL: " + this.f3146p);
                    }
                } else {
                    if (C1768p.m5160a()) {
                        this.f1971c.m5178k(this.f1970b, "Unrecognized image: " + jSONObject4);
                    }
                    int i4 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i5 = JsonUtils.getInt(jSONObject5, CmcdData.Factory.STREAMING_FORMAT_HLS, -1);
                    if (i4 <= 0 || i5 <= 0) {
                        if (C1768p.m5160a()) {
                            this.f1971c.m5178k(this.f1970b, "Skipping...");
                        }
                    } else if (i4 / i5 > 1.0d) {
                        if (C1768p.m5160a()) {
                            this.f1971c.m5171a(this.f1970b, "Inferring main image from " + i4 + "x" + i5 + "...");
                        }
                        this.f3146p = Uri.parse(string4);
                    } else {
                        if (C1768p.m5160a()) {
                            this.f1971c.m5171a(this.f1970b, "Inferring icon image from " + i4 + "x" + i5 + "...");
                        }
                        this.f3145o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Processed VAST video");
                    }
                } else if (C1768p.m5160a()) {
                    this.f1971c.m5178k(this.f1970b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i6 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i7 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i7 == 1 || i6 == 8) {
                    this.f3141k = string6;
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Processed advertiser: " + this.f3141k);
                    }
                } else if (i7 == 2 || i6 == 4) {
                    this.f3142l = string6;
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Processed body: " + this.f3142l);
                    }
                } else if (i7 == 12 || i6 == 5) {
                    this.f3144n = string6;
                    if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Processed cta: " + this.f3144n);
                    }
                } else if (i7 == 3 || i6 == 6) {
                    double dM4015a = AbstractC1701q7.m4015a(string6, -1.0d);
                    if (dM4015a != -1.0d) {
                        this.f3143m = Double.valueOf(dM4015a);
                        if (C1768p.m5160a()) {
                            this.f1971c.m5171a(this.f1970b, "Processed star rating: " + this.f3143m);
                        }
                    } else if (C1768p.m5160a()) {
                        this.f1971c.m5171a(this.f1970b, "Received invalid star rating: " + string6);
                    }
                } else if (C1768p.m5160a()) {
                    this.f1971c.m5178k(this.f1970b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unsupported asset object: " + jSONObject4);
            }
            i++;
            r3 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f3153w.add(string7);
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i8 = 0;
            while (i8 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i8, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f3155y.add(new C1766e.a(this.f1969a).mo5045b(str2).mo5047b(false).mo5042a(false).m5138h(m5011f()).mo5043a());
                        if (C1768p.m5160a()) {
                            this.f1971c.m5171a(this.f1970b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i8++;
                obj = null;
            }
        }
        ?? r6 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i9 = 0;
            while (i9 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i9, (JSONObject) r6);
                int i10 = JsonUtils.getInt(jSONObject7, NotificationCompat.CATEGORY_EVENT, -1);
                int i11 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r6);
                if (!TextUtils.isEmpty(string8)) {
                    if (i11 == 1 || i11 == 2) {
                        if (i11 == 2 && string8.startsWith("<script")) {
                            this.f3153w.add(string8);
                        } else {
                            C1766e c1766eMo5043a = new C1766e.a(this.f1969a).mo5045b(string8).mo5047b(false).mo5042a(false).m5138h(m5011f() || i11 == 2).mo5043a();
                            if (i10 == 1) {
                                this.f3155y.add(c1766eMo5043a);
                                if (C1768p.m5160a()) {
                                    this.f1971c.m5171a(this.f1970b, "Processed impression URL: " + string8);
                                }
                            } else if (i10 == 2) {
                                this.f3156z.add(c1766eMo5043a);
                                if (C1768p.m5160a()) {
                                    this.f1971c.m5171a(this.f1970b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i10 == 3) {
                                this.f3135A.add(c1766eMo5043a);
                                if (C1768p.m5160a()) {
                                    this.f1971c.m5171a(this.f1970b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i10 == 4) {
                                this.f3136B.add(c1766eMo5043a);
                                if (C1768p.m5160a()) {
                                    this.f1971c.m5171a(this.f1970b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i10 == 555) {
                                if (C1768p.m5160a()) {
                                    this.f1971c.m5171a(this.f1970b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (C1768p.m5160a()) {
                                this.f1971c.m5174b(this.f1970b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (C1768p.m5160a()) {
                        this.f1971c.m5174b(this.f1970b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i9++;
                r6 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            m5010e();
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Processing VAST video...");
        }
        this.f1969a.m4853s0().m2603a(AbstractC1602k6.m3089a(str, JsonUtils.shallowCopy(this.f3137g), JsonUtils.shallowCopy(this.f3138h), this, this.f1969a));
    }
}
