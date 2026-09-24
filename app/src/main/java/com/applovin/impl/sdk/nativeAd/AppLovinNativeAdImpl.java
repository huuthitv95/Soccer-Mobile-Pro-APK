package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.arch.core.util.Function;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1620m4;
import com.applovin.impl.AbstractC1664n7;
import com.applovin.impl.AbstractC1675o8;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.C1535e;
import com.applovin.impl.C1567h1;
import com.applovin.impl.C1584i8;
import com.applovin.impl.C1591j5;
import com.applovin.impl.C1600k4;
import com.applovin.impl.C1711r7;
import com.applovin.impl.C1831z4;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1766e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd, View.OnClickListener, AppLovinTouchToClickListener.OnClickListener {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final String TAG = "AppLovinNativeAd";
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final C1600k4 adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final List<C1766e> clickTrackingRequests;
    private final List<String> clickTrackingUrls;
    private CustomTabsSession customTabsSession;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<C1766e> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final List<String> jsTrackers;
    private float mainImageAspectRatio;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final ViewOnAttachStateChangeListenerC1752b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final Double starRating;
    private final String tag;
    private final String title;
    private final C1711r7 vastAd;
    private View videoView;
    private final C1753c viewableMRC100Callback;
    private C1584i8 viewableMRC100Tracker;
    private final C1753c viewableMRC50Callback;
    private C1584i8 viewableMRC50Tracker;
    private C1753c viewableVideoMRC50Callback;
    private C1584i8 viewableVideoMRC50Tracker;

    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<C1766e> clickTrackingRequests;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<C1766e> impressionRequests;
        private List<String> jsTrackers;
        private float mainImageAspectRatio;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final C1748l sdk;
        private Double starRating;
        private String title;
        private C1711r7 vastAd;
        private List<C1766e> viewableMRC100Requests;
        private List<C1766e> viewableMRC50Requests;
        private List<C1766e> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = c1748l;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingRequests(List<C1766e> list) {
            this.clickTrackingRequests = list;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<C1766e> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTrackers(List<String> list) {
            this.jsTrackers = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.starRating = d;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(C1711r7 c1711r7) {
            this.vastAd = c1711r7;
            return this;
        }

        public Builder setViewableMRC100Requests(List<C1766e> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<C1766e> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<C1766e> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$b */
    private static class ViewOnAttachStateChangeListenerC1752b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        private final AppLovinNativeAdImpl f3123a;

        public ViewOnAttachStateChangeListenerC1752b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f3123a = appLovinNativeAdImpl;
        }

        /* JADX INFO: renamed from: a */
        public AppLovinNativeAdImpl m4997a() {
            return this.f3123a;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m4998a(Object obj) {
            return obj instanceof ViewOnAttachStateChangeListenerC1752b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ViewOnAttachStateChangeListenerC1752b)) {
                return false;
            }
            ViewOnAttachStateChangeListenerC1752b viewOnAttachStateChangeListenerC1752b = (ViewOnAttachStateChangeListenerC1752b) obj;
            if (!viewOnAttachStateChangeListenerC1752b.m4998a(this)) {
                return false;
            }
            AppLovinNativeAdImpl appLovinNativeAdImplM4997a = m4997a();
            AppLovinNativeAdImpl appLovinNativeAdImplM4997a2 = viewOnAttachStateChangeListenerC1752b.m4997a();
            return appLovinNativeAdImplM4997a != null ? appLovinNativeAdImplM4997a.equals(appLovinNativeAdImplM4997a2) : appLovinNativeAdImplM4997a2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl appLovinNativeAdImplM4997a = m4997a();
            return (appLovinNativeAdImplM4997a == null ? 43 : appLovinNativeAdImplM4997a.hashCode()) + 59;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3123a.maybeHandleOnAttachedToWindow(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + m4997a() + ")";
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$c */
    private class C1753c implements C1584i8.a {

        /* JADX INFO: renamed from: a */
        private final List f3124a;

        public C1753c(List list) {
            this.f3124a = list;
        }

        /* JADX INFO: renamed from: a */
        public List m4999a() {
            return this.f3124a;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m5000a(Object obj) {
            return obj instanceof C1753c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1753c)) {
                return false;
            }
            C1753c c1753c = (C1753c) obj;
            if (!c1753c.m5000a(this)) {
                return false;
            }
            List listM4999a = m4999a();
            List listM4999a2 = c1753c.m4999a();
            return listM4999a != null ? listM4999a.equals(listM4999a2) : listM4999a2 == null;
        }

        public int hashCode() {
            List listM4999a = m4999a();
            return (listM4999a == null ? 43 : listM4999a.hashCode()) + 59;
        }

        @Override // com.applovin.impl.C1584i8.a
        public void onLogVisibilityImpression() {
            Iterator it = this.f3124a.iterator();
            while (it.hasNext()) {
                ((AppLovinAdBase) AppLovinNativeAdImpl.this).sdk.m4835i0().dispatchPostbackRequest((C1766e) it.next(), null);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.VisibilityCallback(requests=" + m4999a() + ")";
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.onAttachStateChangeHandler = new ViewOnAttachStateChangeListenerC1752b(this);
        this.adEventTracker = new C1600k4(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.mainImageAspectRatio = builder.mainImageAspectRatio;
        this.privacyIconUri = builder.privacyIconUri;
        C1711r7 c1711r7 = builder.vastAd;
        this.vastAd = c1711r7;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTrackers = builder.jsTrackers;
        this.clickTrackingRequests = builder.clickTrackingRequests;
        this.impressionRequests = builder.impressionRequests;
        Double d = builder.starRating;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
        if (builder.privacyDestinationUri != null) {
            this.privacyDestinationUri = builder.privacyDestinationUri;
        } else if (!isDspAd() || getSdk().m4857u0().m2928c()) {
            this.privacyDestinationUri = Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL);
        }
        this.viewableMRC50Callback = new C1753c(builder.viewableMRC50Requests);
        this.viewableMRC100Callback = new C1753c(builder.viewableMRC100Requests);
        if (isCustomTabsEnabled()) {
            this.customTabsSession = this.sdk.m4757A().m2658a(this);
            this.sdk.m4757A().m2662b(getCustomTabsWarmupUrls(), this.customTabsSession);
        }
        if (c1711r7 != null && c1711r7.hasVideoUrl()) {
            this.viewableVideoMRC50Callback = new C1753c(builder.viewableVideo50Requests);
        }
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    private List<C1535e> getDirectClickTrackingPostbacks() {
        List<C1535e> listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4994xc24c558e((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return listM4038a;
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    static /* synthetic */ C1567h1 lambda$getCustomTabsSettings$1(C1591j5 c1591j5) {
        JSONObject jSONObjectM3000a = c1591j5.m3000a("custom_tabs_settings", (JSONObject) null);
        if (jSONObjectM3000a != null) {
            return new C1567h1(jSONObjectM3000a);
        }
        return null;
    }

    static /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$11(Function function, C1591j5 c1591j5) {
        return (List) function.apply(c1591j5.m2998a("omid_verification_script_resources", (JSONArray) null));
    }

    private void launchUri(Uri uri, Uri uri2, Context context) {
        if (isCustomTabsEnabled() && this.sdk.m4757A().m2661a(uri, this, this.sdk.m4861w0())) {
            this.sdk.m4782Q();
            if (C1768p.m5160a()) {
                this.sdk.m4782Q().m5171a(this.tag, "Opening URL in Custom Tab: " + uri);
                return;
            }
            return;
        }
        if (isCustomTabsEnabled() && uri2 != null && this.sdk.m4757A().m2661a(uri2, this, this.sdk.m4861w0())) {
            this.sdk.m4782Q();
            if (C1768p.m5160a()) {
                this.sdk.m4782Q().m5171a(this.tag, "Opening backup URL in Custom Tab: " + uri2);
                return;
            }
            return;
        }
        if (AbstractC1664n7.m3685a(uri, context, this.sdk)) {
            this.sdk.m4782Q();
            if (C1768p.m5160a()) {
                this.sdk.m4782Q().m5171a(this.tag, "Opening URL: " + uri);
                return;
            }
            return;
        }
        if (uri2 == null || !AbstractC1664n7.m3685a(uri2, context, this.sdk)) {
            return;
        }
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5171a(this.tag, "Opening backup URL: " + uri2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            C1584i8 c1584i8 = new C1584i8(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = c1584i8;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c1584i8.m2937a(0, 50.0f, 50.0f, timeUnit.toMillis(1L), this.nativeAdView);
            C1584i8 c1584i9 = new C1584i8(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = c1584i9;
            c1584i9.m2937a(0, 100.0f, 100.0f, timeUnit.toMillis(1L), this.nativeAdView);
            C1711r7 c1711r7 = this.vastAd;
            if (c1711r7 != null && c1711r7.hasVideoUrl()) {
                C1584i8 c1584i10 = new C1584i8(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = c1584i10;
                c1584i10.m2937a(0, 50.0f, 50.0f, timeUnit.toMillis(2L), this.videoView);
            }
            List<String> list = this.jsTrackers;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    this.sdk.m4867z0().m3707b(it.next());
                }
            }
            Iterator<C1766e> it2 = this.impressionRequests.iterator();
            while (it2.hasNext()) {
                this.sdk.m4835i0().dispatchPostbackRequest(it2.next(), null);
            }
            this.adEventTracker.m2803a(view);
            this.adEventTracker.m2811g();
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.m2810f();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public C1600k4 getAdEventTracker() {
        return this.adEventTracker;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    public Bundle getCustomTabsHeaders() {
        Map map;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            map = (Map) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda7
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4987x5006e8b6((C1591j5) obj);
                }
            });
        } else {
            try {
                map = JsonUtils.toStringMap(getJsonObjectFromAdObject("custom_tabs_http_headers", new JSONObject()));
            } catch (JSONException e) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5172a(TAG, "Failed to retrieve http headers for Custom Tabs", e);
                }
                map = new HashMap();
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (getBooleanFromAdObject("custom_tabs_should_use_webview_ua", Boolean.FALSE)) {
            bundle.putString("User-Agent", AbstractC1675o8.m3769a());
        }
        return bundle;
    }

    public List<C1535e> getCustomTabsNavigationAbortedPostbacks() {
        List<C1535e> listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4988x9aa0bf5((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List<C1535e> getCustomTabsNavigationFailedPostbacks() {
        List<C1535e> listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda6
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4989x9d7e354e((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List<C1535e> getCustomTabsNavigationFinishedPostbacks() {
        List<C1535e> listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda4
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4990xff2d83f8((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List<C1535e> getCustomTabsNavigationStartedPostbacks() {
        List<C1535e> listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda10
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4991xcb790c80((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public CustomTabsSession getCustomTabsSession() {
        return this.customTabsSession;
    }

    public C1567h1 getCustomTabsSettings() {
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (C1567h1) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda11
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.lambda$getCustomTabsSettings$1((C1591j5) obj);
                }
            });
        }
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("custom_tabs_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new C1567h1(jsonObjectFromAdObject);
        }
        return null;
    }

    public List<C1535e> getCustomTabsTabHiddenPostbacks() {
        List<C1535e> listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda9
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4992xe255a3f3((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List<C1535e> getCustomTabsTabShownPostbacks() {
        List<C1535e> listM4038a;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda8
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f$0.m4993xae013be5((C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listM4038a = AbstractC1701q7.m4038a(getJsonObjectFromAdObject("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
        }
        return listM4038a;
    }

    public List<String> getCustomTabsWarmupUrls() {
        return getStringListFromAdObject("custom_tabs_warmup_urls", Collections.EMPTY_LIST);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public float getMainImageAspectRatio() {
        return this.mainImageAspectRatio;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        List<VerificationScriptResource> list;
        if (this.sdk.m4831g0().m3131e()) {
            return Collections.singletonList(VerificationScriptResource.createVerificationScriptResourceWithParameters(AbstractC1620m4.m3227c(), AbstractC1620m4.m3226b(), AbstractC1620m4.m3224a()));
        }
        final Function function = new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f$0.m4995x4e578947((JSONArray) obj);
            }
        };
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return (List) c1591j5.m2995a(new Function() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$11(function, (C1591j5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            list = (List) function.apply(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return list;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Double getStarRating() {
        return this.starRating;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public C1711r7 getVastAd() {
        return this.vastAd;
    }

    protected void handleNativeAdClick(Uri uri, Uri uri2, Context context) {
        if (this.clickTrackingRequests.size() > 0) {
            Iterator<C1766e> it = this.clickTrackingRequests.iterator();
            while (it.hasNext()) {
                this.sdk.m4835i0().dispatchPostbackRequest(it.next(), null);
            }
        } else {
            Iterator<String> it2 = this.clickTrackingUrls.iterator();
            while (it2.hasNext()) {
                this.sdk.m4835i0().dispatchPostbackAsync(it2.next(), null);
            }
        }
        AbstractC1793v2.m5412b(this.eventListener, this);
        launchUri(uri, uri2, context);
    }

    public boolean isCustomTabsClientWarmupEnabled() {
        return getBooleanFromAdObject("custom_tabs_client_warmup_enabled", Boolean.FALSE);
    }

    public boolean isCustomTabsEnabled() {
        return getBooleanFromAdObject("custom_tabs_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC1560g4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.m4831g0().m3131e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: lambda$getCustomTabsHeaders$2$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ Map m4987x5006e8b6(C1591j5 c1591j5) {
        try {
            return JsonUtils.toStringMap(c1591j5.m3000a("custom_tabs_http_headers", new JSONObject()));
        } catch (JSONException e) {
            this.sdk.m4782Q();
            if (C1768p.m5160a()) {
                this.sdk.m4782Q().m5172a(TAG, "Failed to retrieve http headers for Custom Tabs", e);
            }
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: lambda$getCustomTabsNavigationAbortedPostbacks$6$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ List m4988x9aa0bf5(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_navigation_aborted_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: renamed from: lambda$getCustomTabsNavigationFailedPostbacks$5$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ List m4989x9d7e354e(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_navigation_failed_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: renamed from: lambda$getCustomTabsNavigationFinishedPostbacks$4$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ List m4990xff2d83f8(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_navigation_finished_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: renamed from: lambda$getCustomTabsNavigationStartedPostbacks$3$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ List m4991xcb790c80(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_navigation_started_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: renamed from: lambda$getCustomTabsTabHiddenPostbacks$8$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ List m4992xe255a3f3(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_tab_hidden_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: renamed from: lambda$getCustomTabsTabShownPostbacks$7$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ List m4993xae013be5(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("custom_tabs_tab_shown_urls", new JSONObject()), getClCode(), (String) null, this.sdk);
    }

    /* JADX INFO: renamed from: lambda$getDirectClickTrackingPostbacks$9$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ List m4994xc24c558e(C1591j5 c1591j5) {
        return AbstractC1701q7.m4038a(c1591j5.m3000a("click_tracking_urls", new JSONObject()), getClCode(), c1591j5.m2996a("click_tracking_url", (String) null), this.sdk);
    }

    /* JADX INFO: renamed from: lambda$getOpenMeasurementVerificationScriptResources$10$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ List m4995x4e578947(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5172a(this.tag, "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lambda$unregisterViewsForInteraction$0$com-applovin-impl-sdk-nativeAd-AppLovinNativeAdImpl */
    /* synthetic */ void m4996xfd413d54() {
        for (View view : this.registeredViews) {
            view.setOnTouchListener(null);
            view.setOnClickListener(null);
        }
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5171a(this.tag, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        C1584i8 c1584i8 = this.viewableMRC50Tracker;
        if (c1584i8 != null) {
            c1584i8.m2939b();
        }
        C1584i8 c1584i9 = this.viewableMRC100Tracker;
        if (c1584i9 != null) {
            c1584i9.m2939b();
        }
        C1584i8 c1584i10 = this.viewableVideoMRC50Tracker;
        if (c1584i10 != null) {
            c1584i10.m2939b();
        }
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context;
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5171a(this.tag, "Handle view clicked");
        }
        this.sdk.m4840l().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (!((Boolean) this.sdk.m4801a(C1831z4.f4066w)).booleanValue() || (context = AbstractC1564g8.m2759b(this.nativeAdView, this.sdk)) == null) {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }

    @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
    public void onClick(View view, MotionEvent motionEvent) {
        Context context;
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5171a(this.tag, "Handle view clicked");
        }
        this.sdk.m4840l().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (!((Boolean) this.sdk.m4801a(C1831z4.f4066w)).booleanValue() || (context = AbstractC1564g8.m2759b(this.nativeAdView, this.sdk)) == null) {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        }
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5171a(this.tag, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.m4782Q();
            if (C1768p.m5160a()) {
                this.sdk.m4782Q().m5171a(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners()) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5178k(this.tag, "View has an onClickListener already - " + view);
                }
            }
            if (!view.isClickable()) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5178k(this.tag, "View is not clickable - " + view);
                }
            }
            if (!view.isEnabled()) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5174b(this.tag, "View is not enabled - " + view);
                }
            }
            if (view instanceof Button) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5171a(this.tag, "Registering click for button: " + view);
                }
            } else {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5171a(this.tag, "Registering click for view: " + view);
                }
            }
            if (((Boolean) this.sdk.m4801a(C1831z4.f3729H2)).booleanValue()) {
                view.setOnTouchListener(new AppLovinTouchToClickListener(this.sdk, C1831z4.f3931g0, viewGroup.getContext(), this));
            } else {
                view.setOnClickListener(this);
            }
            this.registeredViews.add(view);
        }
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5171a(this.tag, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageAspectRatio(float f) {
        this.mainImageAspectRatio = f;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        C1711r7 c1711r7 = this.vastAd;
        if (c1711r7 == null || !c1711r7.hasVideoUrl()) {
            this.mediaView = new AppLovinMediaView(this, this.sdk, C1748l.m4756p());
        } else {
            try {
                this.mediaView = new AppLovinVastMediaView(this, this.sdk, C1748l.m4756p());
            } catch (Throwable th) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5176d(this.tag, "Failed to create MediaPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.sdk.m4764E().m4329a(TAG, "createMediaPlayerVASTMediaView", th);
                this.mediaView = new AppLovinMediaView(this, this.sdk, C1748l.m4756p());
            }
        }
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, C1748l.m4756p());
            return;
        }
        this.sdk.m4782Q();
        if (C1768p.m5160a()) {
            this.sdk.m4782Q().m5171a(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(View view) {
        this.videoView = view;
    }

    public boolean shouldCustomTabsTrackEvents() {
        return getBooleanFromAdObject("custom_tabs_should_track_events", Boolean.FALSE);
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4996xfd413d54();
            }
        });
    }
}
