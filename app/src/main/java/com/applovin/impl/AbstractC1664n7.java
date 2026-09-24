package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1488a;
import com.applovin.impl.adview.C1493b;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1749m;
import com.applovin.impl.sdk.C1750n;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1765d;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.ironsource.C11341A5;
import com.ironsource.C11391D1;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.n7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1664n7 {

    /* JADX INFO: renamed from: com.applovin.impl.n7$a */
    class a extends AbstractC1505b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f2426a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1488a f2427b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C1748l f2428c;

        a(String str, C1488a c1488a, C1748l c1748l) {
            this.f2426a = str;
            this.f2427b = c1488a;
            this.f2428c = c1748l;
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.f2426a, null);
                AbstractC1793v2.m5433c(this.f2427b.m1966e(), this.f2427b.m1968g(), this.f2427b.m1970i());
            }
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                AbstractC1793v2.m5365a(this.f2427b.m1966e(), this.f2427b.m1968g(), this.f2427b.m1970i());
                this.f2428c.m4826e().m2146b(this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Context m3672a(String str, AppLovinAdView appLovinAdView, C1748l c1748l) {
        if ("application".equalsIgnoreCase(str)) {
            return C1748l.m4756p();
        }
        if ("activity".equalsIgnoreCase(str)) {
            Activity activityM2759b = AbstractC1564g8.m2759b(appLovinAdView, c1748l);
            if (activityM2759b != null) {
                return activityM2759b;
            }
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5178k("UriUtils", "Could not retrieve the activity context. Falling back to view context.");
            }
        }
        return appLovinAdView.getContext();
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m3673a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            boolean z = true;
            packageManager.getPackageInfo("com.android.vending", 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting("com.android.vending");
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.TRUE;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m3674a(Intent intent) {
        if (intent == null) {
            return "Intent not available";
        }
        ComponentName component = intent.getComponent();
        StringBuilder sb = new StringBuilder("Identifier: ");
        sb.append(AbstractC1677p0.m3813g() ? intent.getIdentifier() : null);
        sb.append("\nAction: ");
        sb.append(intent.getAction());
        sb.append("\nData: ");
        sb.append(intent.getData());
        sb.append("\nType: ");
        sb.append(intent.getType());
        sb.append("\nFlags: ");
        sb.append(intent.getFlags());
        sb.append("\nExtras: ");
        sb.append(intent.getExtras());
        sb.append("\nCategories: ");
        sb.append(intent.getCategories());
        sb.append("\nClipData: ");
        sb.append(intent.getClipData());
        sb.append("\nSourceBounds: ");
        sb.append(intent.getSourceBounds());
        sb.append("\nComponent: ");
        sb.append(component != null ? component.flattenToString() : intent.getPackage());
        sb.append("\nSelector: ");
        sb.append(intent.getSelector());
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private static String m3675a(Intent intent, Uri uri, AbstractC1736b abstractC1736b, Context context) {
        if ("market".equals(intent.getScheme()) || "play.google.com".equals(uri.getHost())) {
            if (Boolean.FALSE.equals(m3673a(context))) {
                return "com.android.vending";
            }
            return null;
        }
        if ("https".equals(intent.getScheme()) && abstractC1736b != null) {
            if (abstractC1736b.m4514W0()) {
                String strM4875J = C1749m.m4875J();
                if (m3687a(strM4875J, context)) {
                    return strM4875J;
                }
            }
            for (String str : abstractC1736b.m4495N()) {
                if (m3687a(str, context)) {
                    return str;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Map m3676a(Intent intent, Uri uri, AbstractC1736b abstractC1736b) {
        Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapM2787a);
        CollectionUtils.putStringIfValid("details", m3674a(intent), mapM2787a);
        return mapM2787a;
    }

    /* JADX INFO: renamed from: a */
    public static void m3677a(Uri uri, C1488a c1488a, C1748l c1748l) {
        C1493b c1493bM1967f = c1488a.m1967f();
        String queryParameter = uri.getQueryParameter(C11341A5.f23826q);
        if (TextUtils.isEmpty(queryParameter)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("UriUtils", "Could not find url to load from query in original uri");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return;
        }
        C1521c5 c1521c5M4851r0 = c1748l.m4851r0();
        C1511b5 c1511b5 = C1511b5.f1162T;
        String queryParameter2 = (String) c1521c5M4851r0.m2209a(c1511b5, null);
        if (uri.getQueryParameterNames().contains("browser")) {
            queryParameter2 = uri.getQueryParameter("browser");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = null;
            }
            if (Boolean.parseBoolean(uri.getQueryParameter("retain_browser"))) {
                c1748l.m4851r0().m2215b(c1511b5, queryParameter2);
            }
        }
        String queryParameter3 = uri.getQueryParameter("load_type");
        if (C11391D1.f24195e.equalsIgnoreCase(queryParameter3)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("UriUtils", "Loading new page externally: " + queryParameter);
            }
            m3682a(queryParameter, queryParameter2, c1488a, c1748l);
            return;
        }
        if ("internal".equalsIgnoreCase(queryParameter3)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("UriUtils", "Loading new page in WebView: " + queryParameter);
            }
            c1493bM1967f.loadUrl(queryParameter);
            String queryParameter4 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter4)) {
                c1493bM1967f.setBackgroundColor(Color.parseColor(queryParameter4));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter3)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("UriUtils", "Loading new page in slide-up webview: " + queryParameter);
            }
            c1748l.m4826e().m2144a(new a(queryParameter, c1488a, c1748l));
            Intent intent = new Intent(C1748l.m4756p(), (Class<?>) AppLovinWebViewActivity.class);
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, c1748l.m4839k0());
            intent.setFlags(268435456);
            C1748l.m4756p().startActivity(intent);
            return;
        }
        if (!"in_app_v2".equalsIgnoreCase(queryParameter3)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("UriUtils", "Could not find load type in original uri");
                return;
            }
            return;
        }
        c1488a.m1951a(c1488a.m1968g(), c1488a.m1970i(), null, c1493bM1967f.getAndClearLastClickEvent());
        if (c1488a.m1969h() != null) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("UriUtils", "Loading new page in Custom Tabs: " + queryParameter);
            }
            c1748l.m4757A().m2660a(Uri.parse(queryParameter), c1488a, c1748l.m4861w0());
            return;
        }
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("UriUtils", "Custom Tabs not supported, loading new page externally: " + queryParameter);
        }
        m3682a(queryParameter, queryParameter2, c1488a, c1748l);
    }

    /* JADX INFO: renamed from: a */
    private static void m3678a(Uri uri, AbstractC1736b abstractC1736b, Context context, C1748l c1748l) {
        String queryParameter = uri.getQueryParameter(MessengerShareContentUtility.FALLBACK_URL);
        if (TextUtils.isEmpty(queryParameter)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("UriUtils", "Could not find fallback URL to open from query parameters");
                return;
            }
            return;
        }
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("UriUtils", "Opening fallback URL: " + queryParameter);
        }
        m3689b(Uri.parse(queryParameter), abstractC1736b, context, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static void m3679a(Uri uri, AbstractC1736b abstractC1736b, AppLovinAdView appLovinAdView, C1748l c1748l) {
        Uri uri2;
        AbstractC1736b abstractC1736b2;
        C1748l c1748l2;
        Throwable th;
        C1623m7 c1623m7 = new C1623m7();
        Context contextM3672a = m3672a(uri.getQueryParameter("context_source"), appLovinAdView, c1748l);
        Intent intent = null;
        try {
            c1623m7.m3238f(uri.getQueryParameter("identifier")).m3236d(uri.getQueryParameter("action")).m3231a(uri.getQueryParameter("data"), uri.getQueryParameter("type")).m3233b(uri.getQueryParameter("flags")).m3237e(uri.getQueryParameter("extras")).m3230a(uri.getQueryParameter("categories")).m3232a(uri.getQueryParameter("clip_data_uri"), uri.getQueryParameter("clip_data_mime_type"), uri.getQueryParameter("clip_data_label")).m3240h(uri.getQueryParameter("source_bounds")).m3234b(uri.getQueryParameter("component"), uri.getQueryParameter(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME), uri.getQueryParameter("package")).m3239g(uri.getQueryParameter("selector_action"));
            if (!(contextM3672a instanceof Activity)) {
                c1623m7.m3233b(String.valueOf(268435456));
            }
            Intent intentM3235c = Boolean.parseBoolean(uri.getQueryParameter("use_chooser")) ? c1623m7.m3235c(uri.getQueryParameter("chooser_title")) : c1623m7.m3229a();
            try {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5171a("UriUtils", "Attempting to launch intent with configuration:\n" + m3674a(intentM3235c));
                }
                if (intentM3235c.resolveActivity(contextM3672a.getPackageManager()) != null) {
                    contextM3672a.startActivity(intentM3235c);
                    c1748l.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l.m4782Q().m5171a("UriUtils", "Successfully launched intent");
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_success"), null);
                    c1748l.m4830g().m2682d(C1548f2.f1516a0, m3676a(intentM3235c, uri, abstractC1736b));
                    return;
                }
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5174b("UriUtils", "No activity found to handle the intent");
                }
                uri2 = uri;
                abstractC1736b2 = abstractC1736b;
                c1748l2 = c1748l;
                try {
                    m3683a("noActivityToHandleIntent", null, uri2, m3676a(intentM3235c, uri, abstractC1736b), abstractC1736b2, contextM3672a, c1748l2);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    intent = intentM3235c;
                    c1748l2.m4782Q();
                    if (C1768p.m5160a()) {
                        c1748l2.m4782Q().m5172a("UriUtils", "Exception while launching intent", th);
                    }
                    m3683a("intentLaunchException", th, uri2, m3676a(intent, uri2, abstractC1736b2), abstractC1736b2, contextM3672a, c1748l2);
                }
            } catch (Throwable th3) {
                th = th3;
                uri2 = uri;
                abstractC1736b2 = abstractC1736b;
                c1748l2 = c1748l;
            }
        } catch (Throwable th4) {
            uri2 = uri;
            abstractC1736b2 = abstractC1736b;
            c1748l2 = c1748l;
            th = th4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3680a(Uri uri, AbstractC1736b abstractC1736b, C1748l c1748l) {
        String queryParameter = uri.getQueryParameter(C11341A5.f23826q);
        if (URLUtil.isValidUrl(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("append_clcode");
            if (queryParameter2 == null || Boolean.parseBoolean(queryParameter2)) {
                queryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", abstractC1736b.getClCode());
            }
            c1748l.m4833h0().m5073e(C1765d.m5076b().m5116d(queryParameter).m5108a(false).m5112b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).m5109a());
            return;
        }
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5174b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3681a(C1748l c1748l, String str, AbstractC1736b abstractC1736b) {
        try {
            C1750n c1750nM4771I = c1748l.m4771I();
            Context contextM4756p = C1748l.m4756p();
            String strM4973a = c1750nM4771I.m4973a(C1748l.m4756p(), str, abstractC1736b.getCachePrefix(), abstractC1736b.m4505S(), true, c1750nM4771I.m4970a(str, abstractC1736b), null, AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b));
            if (strM4973a == null) {
                c1748l.m4782Q();
                if (C1768p.m5160a()) {
                    c1748l.m4782Q().m5178k("UriUtils", "Failed to cache resource: " + str);
                }
                Map map = CollectionUtils.map("error", "Failed to cache resource");
                map.put(DownloadModel.RESOURCE_URL, str);
                AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map);
                return;
            }
            String string = Uri.fromFile(c1750nM4771I.m4971a(strM4973a, contextM4756p)).toString();
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("UriUtils", "Successfully cached resource at: " + string);
            }
            Map map2 = CollectionUtils.map(DownloadModel.RESOURCE_URL, str);
            map2.put("cached_url", string);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_success"), map2);
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("UriUtils", "Exception while caching resource", th);
            }
            Map map3 = CollectionUtils.map("url", str);
            map3.putAll(AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b));
            map3.putAll(AbstractC1568h2.m2788a(abstractC1736b));
            c1748l.m4764E().m4332a("UriUtils", "handlePreload", th, map3);
            Map map4 = CollectionUtils.map("error", "Internal error while caching");
            map4.put(DownloadModel.RESOURCE_URL, str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map4);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3682a(String str, String str2, C1488a c1488a, C1748l c1748l) {
        m3686a(Uri.parse(str), str2, c1488a.m1968g(), c1488a.m1967f().getContext(), c1748l);
        AbstractC1793v2.m5410b(c1488a.m1966e(), c1488a.m1968g(), c1488a.m1970i());
    }

    /* JADX INFO: renamed from: a */
    private static void m3683a(String str, Throwable th, Uri uri, Map map, AbstractC1736b abstractC1736b, Context context, C1748l c1748l) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_failure"), null);
        HashMap map2 = new HashMap(map);
        if (th != null) {
            c1748l.m4764E().m4332a("UriUtils", "launchCustomIntent", th, map);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
        }
        CollectionUtils.putStringIfValid("source", str, map2);
        c1748l.m4830g().m2682d(C1548f2.f1518b0, map2);
        m3678a(uri, abstractC1736b, context, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3684a(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3685a(Uri uri, Context context, C1748l c1748l) {
        return m3689b(uri, null, context, c1748l);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3686a(Uri uri, String str, AbstractC1736b abstractC1736b, Context context, C1748l c1748l) {
        String strDefaultIfEmpty = null;
        boolean z = false;
        if (uri == null) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return false;
        }
        try {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5175d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            strDefaultIfEmpty = StringUtils.defaultIfEmpty(str, m3675a(intent, uri, abstractC1736b, context));
            intent.setPackage(strDefaultIfEmpty);
            c1748l.m4846o0().pauseForClick();
            context.startActivity(intent);
            z = true;
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", uri.toString());
            mapHashMap.put("name", strDefaultIfEmpty);
            if (abstractC1736b != null) {
                mapHashMap.putAll(AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b));
                mapHashMap.putAll(AbstractC1568h2.m2788a(abstractC1736b));
            }
            if ("play.google.com".equals(uri.getHost())) {
                CollectionUtils.putStringIfValid("details", (String) c1748l.m4759B().m4938N().get("ps_version"), mapHashMap);
            }
            c1748l.m4764E().m4332a("UriUtils", "openUri", th, mapHashMap);
        }
        if (!z) {
            c1748l.m4846o0().resumeForClick();
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent(z ? "com.applovin.external_redirect_success" : "com.applovin.external_redirect_failure"), CollectionUtils.map("url", uri));
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3687a(String str, Context context) {
        return (TextUtils.isEmpty(str) || context.getPackageManager().getLaunchIntentForPackage(str) == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m3688b(Uri uri, final AbstractC1736b abstractC1736b, final C1748l c1748l) {
        final String queryParameter = uri.getQueryParameter("url");
        if (!StringUtils.isValidString(queryParameter)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("UriUtils", "Could not find resource URL to preload from query parameters");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), CollectionUtils.map("error", "Invalid URL"));
            return;
        }
        if (abstractC1736b == null) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("UriUtils", "Cannot preload resource: ad is null");
            }
            Map map = CollectionUtils.map("error", "Invalid ad reference");
            map.put(DownloadModel.RESOURCE_URL, queryParameter);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map);
            return;
        }
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("UriUtils", "Attempting to preload resource: " + queryParameter);
        }
        c1748l.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(c1748l, false, "preloadResource", new Runnable() { // from class: com.applovin.impl.n7$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1664n7.m3681a(c1748l, queryParameter, abstractC1736b);
            }
        }), C1552f6.b.CACHING);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3689b(Uri uri, AbstractC1736b abstractC1736b, Context context, C1748l c1748l) {
        return m3686a(uri, null, abstractC1736b, context, c1748l);
    }

    /* JADX INFO: renamed from: c */
    public static void m3690c(Uri uri, AbstractC1736b abstractC1736b, C1748l c1748l) {
        String strEmptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter("error"));
        String strEmptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String strEmptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", strEmptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", strEmptyIfNull2, mapHashMap);
        CollectionUtils.putStringIfValid("details", strEmptyIfNull3, mapHashMap);
        if (abstractC1736b != null) {
            mapHashMap.putAll(AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736b));
            mapHashMap.putAll(AbstractC1568h2.m2788a(abstractC1736b));
        }
        c1748l.m4764E().m2682d(C1548f2.f1534g1, mapHashMap);
    }
}
