package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1664n7;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1714s0;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractC1819y1;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1485a6;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1522c6;
import com.applovin.impl.C1535e;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1562g6;
import com.applovin.impl.C1595k;
import com.applovin.impl.C1781u;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1669o2;
import com.applovin.impl.InterfaceC1783u1;
import com.applovin.impl.adview.C1488a;
import com.applovin.impl.d$$ExternalSyntheticApiModelOutline0;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.network.C1765d;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1737c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, C1734a.a {

    /* JADX INFO: renamed from: a */
    private final C1748l f2808a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2809b;

    /* JADX INFO: renamed from: c */
    private final Map f2810c;

    /* JADX INFO: renamed from: d */
    private final Object f2811d = new Object();

    /* JADX INFO: renamed from: e */
    private final Map f2812e = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: f */
    private final AtomicReference f2813f = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$b */
    class C1723b implements InterfaceC1669o2 {

        /* JADX INFO: renamed from: a */
        private final C1724c f2814a;

        private C1723b(C1724c c1724c) {
            this.f2814a = c1724c;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof C1737c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f2808a.m4836j().m4642a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f2808a.m4828f().m4431a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new C1737c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f2808a);
            }
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f2814a.f2816a) {
                if (!this.f2814a.f2818c) {
                    hashSet = new HashSet(this.f2814a.f2819d);
                    this.f2814a.f2819d.clear();
                }
                C1724c c1724c = this.f2814a;
                c1724c.f2817b = false;
                c1724c.f2818c = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.m4378a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            failedToReceiveAdV2(new AppLovinError(i, ""));
        }

        @Override // com.applovin.impl.InterfaceC1669o2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f2814a.f2816a) {
                if (!this.f2814a.f2818c) {
                    hashSet = new HashSet(this.f2814a.f2819d);
                    this.f2814a.f2819d.clear();
                }
                C1724c c1724c = this.f2814a;
                c1724c.f2817b = false;
                c1724c.f2818c = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.m4384b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.AppLovinAdServiceImpl$c */
    private static class C1724c {

        /* JADX INFO: renamed from: a */
        final Object f2816a;

        /* JADX INFO: renamed from: b */
        boolean f2817b;

        /* JADX INFO: renamed from: c */
        boolean f2818c;

        /* JADX INFO: renamed from: d */
        final Collection f2819d;

        private C1724c() {
            this.f2816a = new Object();
            this.f2819d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f2817b + ", isReloadingExpiredAd=" + this.f2818c + ", pendingAdListeners=" + this.f2819d + AbstractJsonLexerKt.END_OBJ;
        }
    }

    AppLovinAdServiceImpl(C1748l c1748l) {
        this.f2808a = c1748l;
        this.f2809b = c1748l.m4782Q();
        HashMap map = new HashMap(6);
        this.f2810c = map;
        map.put(C1781u.m5257c(), new C1724c());
        map.put(C1781u.m5260k(), new C1724c());
        map.put(C1781u.m5259j(), new C1724c());
        map.put(C1781u.m5262m(), new C1724c());
        map.put(C1781u.m5255b(), new C1724c());
        map.put(C1781u.m5258h(), new C1724c());
    }

    /* JADX INFO: renamed from: a */
    private C1724c m4359a(C1781u c1781u) {
        C1724c c1724c;
        synchronized (this.f2811d) {
            c1724c = (C1724c) this.f2810c.get(c1781u);
            if (c1724c == null) {
                c1724c = new C1724c();
                this.f2810c.put(c1781u, c1724c);
            }
        }
        return c1724c;
    }

    /* JADX INFO: renamed from: a */
    private String m4361a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f2809b.m5172a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f2808a.m4764E().m4329a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m4362a(String str, long j, long j2, List list, String str2, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i != C1746j.f2992h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(C1746j.m4690a(i)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    /* JADX INFO: renamed from: a */
    private List m4363a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f2808a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f2808a.m4782Q().m5178k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f2808a.m4764E().m4329a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m4364a() {
        Map<String, String> mapTryToStringMap;
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f2808a.m4815b(C1511b5.f1159Q);
        if (TextUtils.isEmpty(str)) {
            if (C1768p.m5160a()) {
                this.f2809b.m5171a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f2808a.m4764E().m2682d(C1548f2.f1493O0, mapTryToStringMap);
        String str2 = (String) this.f2808a.m4815b(C1511b5.f1158P);
        if (str2 == null) {
            if (C1768p.m5160a()) {
                this.f2809b.m5178k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
                return;
            }
            return;
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
        String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
        String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
        Long l = (Long) this.f2808a.m4815b(C1511b5.f1157O);
        if (l != null) {
            string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l));
            string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l));
        }
        m4368a(new C1535e(string, string2));
    }

    /* JADX INFO: renamed from: a */
    private void m4365a(Uri uri, AbstractC1736b abstractC1736b, AppLovinAdView appLovinAdView, C1488a c1488a, Context context) {
        if (AbstractC1664n7.m3689b(uri, abstractC1736b, context, this.f2808a)) {
            AbstractC1793v2.m5410b(c1488a.m1966e(), abstractC1736b, appLovinAdView);
        }
        c1488a.m1975w();
    }

    /* JADX INFO: renamed from: a */
    private void m4366a(Uri uri, AbstractC1736b abstractC1736b, AppLovinAdView appLovinAdView, C1488a c1488a, Context context, C1748l c1748l) {
        if (uri == null || !StringUtils.isValidString(uri.getQuery())) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
                return;
            }
            return;
        }
        Uri uriM4383b = m4383b(uri, "primaryUrl");
        List listM4363a = m4363a(uri, "primaryTrackingUrl");
        Uri uriM4383b2 = m4383b(uri, "fallbackUrl");
        List listM4363a2 = m4363a(uri, "fallbackTrackingUrl");
        if (uriM4383b == null && uriM4383b2 == null) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                return;
            }
            return;
        }
        if (!m4382a(uriM4383b, "primary", listM4363a, abstractC1736b, appLovinAdView, c1488a, context, c1748l)) {
            m4382a(uriM4383b2, "backup", listM4363a2, abstractC1736b, appLovinAdView, c1488a, context, c1748l);
        }
        if (c1488a != null) {
            c1488a.m1975w();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4367a(C1488a c1488a, Uri uri, Context context) {
        AbstractC1736b abstractC1736bM1968g = c1488a.m1968g();
        if (AbstractC1664n7.m3684a(uri)) {
            m4366a(uri, abstractC1736bM1968g, c1488a.m1970i(), c1488a, context, this.f2808a);
        } else if (abstractC1736bM1968g == null || !abstractC1736bM1968g.isCustomTabsEnabled()) {
            AbstractC1664n7.m3689b(uri, abstractC1736bM1968g, context, this.f2808a);
        } else {
            this.f2808a.m4757A().m2660a(uri, c1488a, this.f2808a.m4861w0());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4368a(C1535e c1535e) {
        if (StringUtils.isValidString(c1535e.m2450c())) {
            this.f2808a.m4833h0().m5073e(C1765d.m5076b().m5116d(c1535e.m2450c()).m5106a(StringUtils.isValidString(c1535e.m2448a()) ? c1535e.m2448a() : null).m5107a(c1535e.m2449b()).m5108a(false).m5112b(c1535e.m2451d()).m5109a());
        } else if (C1768p.m5160a()) {
            this.f2809b.m5178k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4369a(AbstractRunnableC1601k5 abstractRunnableC1601k5) {
        if (!this.f2808a.m4763D0()) {
            C1768p.m5169j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f2808a.m4822c();
        this.f2808a.m4853s0().m2604a(abstractRunnableC1601k5, C1552f6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4371a(final C1723b c1723b, C1781u c1781u, final AbstractC1736b abstractC1736b) {
        if (abstractC1736b != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    c1723b.adReceived(abstractC1736b);
                }
            });
        } else {
            m4369a(new C1485a6(c1781u, c1723b, this.f2808a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4374a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            m4386c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            C1768p.m5164c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            this.f2808a.m4764E().m4329a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof InterfaceC1669o2 ? "V2" : ""), th);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4375a(AbstractC1736b abstractC1736b, AppLovinAdView appLovinAdView, C1488a c1488a, Uri uri) {
        Context context;
        if (!((Boolean) this.f2808a.m4801a(C1831z4.f4066w)).booleanValue() || (context = AbstractC1564g8.m2759b(appLovinAdView, this.f2808a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (AbstractC1664n7.m3684a(uri)) {
            m4366a(uri, abstractC1736b, appLovinAdView, c1488a, context2, this.f2808a);
        } else if (abstractC1736b == null || !abstractC1736b.isCustomTabsEnabled()) {
            m4365a(uri, abstractC1736b, appLovinAdView, c1488a, context2);
        } else {
            this.f2808a.m4757A().m2660a(uri, c1488a, this.f2808a.m4861w0());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4376a(final C1781u c1781u, final C1723b c1723b) {
        AppLovinAdImpl appLovinAdImplM4644e = this.f2808a.m4836j().m4644e(c1781u);
        if (appLovinAdImplM4644e == null || appLovinAdImplM4644e.isExpired()) {
            MaxAdFormat maxAdFormatM5263d = c1781u.m5263d();
            if (((Boolean) this.f2808a.m4801a(C1831z4.f3871Z0)).booleanValue() && maxAdFormatM5263d != null && maxAdFormatM5263d.isFullscreenAd()) {
                this.f2808a.m4834i().m4634a(c1781u, new C1741e.a() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda4
                    @Override // com.applovin.impl.sdk.C1741e.a
                    /* JADX INFO: renamed from: a */
                    public final void mo4387a(AbstractC1736b abstractC1736b) {
                        this.f$0.m4371a(c1723b, c1781u, abstractC1736b);
                    }
                });
                return;
            } else {
                m4369a(new C1485a6(c1781u, c1723b, this.f2808a));
                return;
            }
        }
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplM4644e + " for " + c1781u);
        }
        c1723b.adReceived(appLovinAdImplM4644e);
    }

    /* JADX INFO: renamed from: a */
    private void m4377a(C1781u c1781u, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (c1781u == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        this.f2808a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2808a.m4782Q().m5171a("AppLovinAdService", "Loading next ad of zone {" + c1781u + "}...");
        }
        C1724c c1724cM4359a = m4359a(c1781u);
        synchronized (c1724cM4359a.f2816a) {
            c1724cM4359a.f2819d.add(appLovinAdLoadListener);
            if (!c1724cM4359a.f2817b) {
                c1724cM4359a.f2817b = true;
                m4376a(c1781u, new C1723b(c1724cM4359a));
            } else if (C1768p.m5160a()) {
                this.f2809b.m5171a("AppLovinAdService", "Already waiting on an ad load...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4378a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4380a(appLovinAdLoadListener, appLovinAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4380a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            C1768p.m5164c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f2808a.m4764E().m4329a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4381a(final AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, C1781u c1781u, final AbstractC1736b abstractC1736b) {
        if (abstractC1736b != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    appLovinAdLoadListener.adReceived(abstractC1736b);
                }
            });
        } else {
            m4369a(new C1562g6(jSONObject, c1781u, appLovinAdLoadListener, this.f2808a));
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m4382a(Uri uri, String str, List list, AbstractC1736b abstractC1736b, AppLovinAdView appLovinAdView, C1488a c1488a, Context context, C1748l c1748l) {
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zM3689b = AbstractC1664n7.m3689b(uri, abstractC1736b, context, c1748l);
        if (zM3689b) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c1748l.m4835i0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (c1488a != null) {
                AbstractC1793v2.m5410b(c1488a.m1966e(), abstractC1736b, appLovinAdView);
                return zM3689b;
            }
        } else {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("AppLovinAdService", "URL failed to open");
            }
        }
        return zM3689b;
    }

    /* JADX INFO: renamed from: b */
    private Uri m4383b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f2808a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2808a.m4782Q().m5178k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f2808a.m4764E().m4329a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m4384b(final AppLovinError appLovinError, final AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4374a(appLovinError, appLovinAdLoadListener);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private boolean m4385b() {
        if (!AbstractC1677p0.m3804b()) {
            return true;
        }
        Context contextM4756p = C1748l.m4756p();
        ApplicationExitInfo applicationExitInfoM2264m = d$$ExternalSyntheticApiModelOutline0.m2264m(((ActivityManager) contextM4756p.getSystemService("activity")).getHistoricalProcessExitReasons(contextM4756p.getPackageName(), 0, 1).get(0));
        return applicationExitInfoM2264m.getReason() == 10 || applicationExitInfoM2264m.getReason() == 11;
    }

    /* JADX INFO: renamed from: c */
    private void m4386c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof InterfaceC1669o2) {
            ((InterfaceC1669o2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f2812e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f2808a.m4759B().m4942a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(C1781u c1781u) {
        AppLovinAdImpl appLovinAdImplM4641a = this.f2808a.m4836j().m4641a(c1781u);
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplM4641a + " for zone: " + c1781u + "...");
        }
        return appLovinAdImplM4641a;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f2813f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f2812e) {
            map = CollectionUtils.map(this.f2812e);
            this.f2812e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strM4935I = this.f2808a.m4759B().m4935I();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strM4935I) && C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strM4935I;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        m4377a(C1781u.m5249a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        m4377a(C1781u.m5250a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, final AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            C1768p.m5167h("AppLovinAdService", "Empty ad token");
            m4386c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        C1595k c1595k = new C1595k(strTrim, this.f2808a);
        if (c1595k.m3037c() == C1595k.a.REGULAR) {
            if (C1768p.m5160a()) {
                this.f2809b.m5171a("AppLovinAdService", "Loading next ad for token: " + c1595k);
            }
            m4369a(new C1522c6(c1595k, appLovinAdLoadListener, this.f2808a));
            return;
        }
        if (c1595k.m3037c() != C1595k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            C1768p.m5167h("AppLovinAdService", "Invalid token type");
            m4386c(appLovinError, appLovinAdLoadListener);
            return;
        }
        final JSONObject jSONObjectM3035a = c1595k.m3035a();
        if (jSONObjectM3035a == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c1595k.m3036b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            C1768p.m5167h("AppLovinAdService", str2);
            m4386c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        AbstractC1714s0.m4323c(jSONObjectM3035a, this.f2808a);
        AbstractC1714s0.m4321b(jSONObjectM3035a, this.f2808a);
        AbstractC1714s0.m4312a(jSONObjectM3035a, this.f2808a);
        this.f2808a.m4844n().m4686a();
        if (JsonUtils.getJSONArray(jSONObjectM3035a, AbstractC13068b.JSON_KEY_ADS, new JSONArray()).length() <= 0) {
            if (C1768p.m5160a()) {
                this.f2809b.m5174b("AppLovinAdService", "No ad returned from the server for token: " + c1595k);
            }
            m4386c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Rendering ad for token: " + c1595k);
        }
        final C1781u c1781uM4025a = AbstractC1701q7.m4025a(jSONObjectM3035a, this.f2808a);
        MaxAdFormat maxAdFormatM5263d = c1781uM4025a.m5263d();
        if (((Boolean) this.f2808a.m4801a(C1831z4.f3871Z0)).booleanValue() && maxAdFormatM5263d != null && maxAdFormatM5263d.isFullscreenAd()) {
            this.f2808a.m4834i().m4634a(c1781uM4025a, new C1741e.a() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.sdk.C1741e.a
                /* JADX INFO: renamed from: a */
                public final void mo4387a(AbstractC1736b abstractC1736b) {
                    this.f$0.m4381a(appLovinAdLoadListener, jSONObjectM3035a, c1781uM4025a, abstractC1736b);
                }
            });
        } else {
            m4369a(new C1562g6(jSONObjectM3035a, c1781uM4025a, appLovinAdLoadListener, this.f2808a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        m4377a(C1781u.m5252a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        m4377a(C1781u.m5256b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l;
        if (((Boolean) this.f2808a.m4801a(C1831z4.f4093z2)).booleanValue() && (l = (Long) this.f2808a.m4815b(C1511b5.f1156N)) != null && System.currentTimeMillis() - l.longValue() <= ((Long) this.f2808a.m4801a(C1831z4.f3697D2)).longValue()) {
            if (((Boolean) this.f2808a.m4801a(C1831z4.f3689C2)).booleanValue() || m4385b()) {
                m4364a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<C1535e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<C1535e> it = list.iterator();
        while (it.hasNext()) {
            m4368a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.C1734a.a
    public void onAdExpired(InterfaceC1783u1 interfaceC1783u1) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) interfaceC1783u1;
        C1781u adZone = appLovinAdImpl.getAdZone();
        if (C1768p.m5160a()) {
            this.f2809b.m5178k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f2808a.m4836j().m4643b(appLovinAdImpl);
        if (this.f2808a.m4772I0() || !((Boolean) this.f2808a.m4801a(C1831z4.f3923f1)).booleanValue()) {
            return;
        }
        C1724c c1724cM4359a = m4359a(adZone);
        synchronized (c1724cM4359a.f2816a) {
            if (!c1724cM4359a.f2817b) {
                this.f2808a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f2808a.m4782Q().m5171a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                }
                c1724cM4359a.f2817b = true;
                c1724cM4359a.f2818c = true;
                m4376a(adZone, new C1723b(c1724cM4359a));
            } else if (C1768p.m5160a()) {
                this.f2809b.m5171a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f2813f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f2810c + AbstractJsonLexerKt.END_OBJ;
    }

    public void trackAndLaunchClick(AbstractC1736b abstractC1736b, AppLovinAdView appLovinAdView, C1488a c1488a, Uri uri, MotionEvent motionEvent) {
        if (abstractC1736b == null) {
            if (C1768p.m5160a()) {
                this.f2809b.m5174b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1736b.m4519a(motionEvent));
        if (appLovinAdView != null && uri != null) {
            m4375a(abstractC1736b, appLovinAdView, c1488a, uri);
        } else if (C1768p.m5160a()) {
            this.f2809b.m5174b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(AbstractC1736b abstractC1736b, Uri uri, MotionEvent motionEvent, AbstractC1819y1 abstractC1819y1, Context context) {
        if (abstractC1736b == null) {
            if (C1768p.m5160a()) {
                this.f2809b.m5174b("AppLovinAdService", "Unable to track video click. No ad specified");
            }
        } else {
            if (C1768p.m5160a()) {
                this.f2809b.m5171a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(abstractC1736b.m4525b(motionEvent));
            m4367a(abstractC1819y1.m5654b().getController(), uri, context);
        }
    }

    public void trackCustomTabsNavigationAborted(AbstractC1736b abstractC1736b) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1736b.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackCustomTabsNavigationFailed(AbstractC1736b abstractC1736b) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1736b.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackCustomTabsNavigationFinished(AbstractC1736b abstractC1736b) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1736b.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackCustomTabsNavigationStarted(AbstractC1736b abstractC1736b) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1736b.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackCustomTabsTabHidden(AbstractC1736b abstractC1736b) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1736b.getCustomTabsTabHiddenPostbacks());
    }

    public void trackCustomTabsTabShown(AbstractC1736b abstractC1736b) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(abstractC1736b.getCustomTabsTabShownPostbacks());
    }

    public void trackFullScreenAdClosed(AbstractC1736b abstractC1736b, long j, List<Long> list, long j2, boolean z, int i) {
        if (abstractC1736b == null) {
            if (C1768p.m5160a()) {
                this.f2809b.m5174b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking ad closed...");
        }
        List<C1535e> listM4533e = abstractC1736b.m4533e();
        if (listM4533e == null || listM4533e.isEmpty()) {
            if (C1768p.m5160a()) {
                this.f2809b.m5178k("AppLovinAdService", "Unable to track ad closed for AD #" + abstractC1736b.getAdIdNumber() + ". Missing ad close tracking URL." + abstractC1736b.getAdIdNumber());
                return;
            }
            return;
        }
        for (C1535e c1535e : listM4533e) {
            String strM4362a = m4362a(c1535e.m2450c(), j, j2, list, abstractC1736b.m4564v(), z, i);
            String strM4362a2 = m4362a(c1535e.m2448a(), j, j2, list, abstractC1736b.m4564v(), z, i);
            if (StringUtils.isValidString(strM4362a)) {
                m4368a(new C1535e(strM4362a, strM4362a2));
            } else if (C1768p.m5160a()) {
                this.f2809b.m5174b("AppLovinAdService", "Failed to parse url: " + c1535e.m2450c());
            }
        }
    }

    public void trackImpression(AbstractC1736b abstractC1736b) {
        if (abstractC1736b == null) {
            if (C1768p.m5160a()) {
                this.f2809b.m5174b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (C1768p.m5160a()) {
                this.f2809b.m5171a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(abstractC1736b.mo4220A());
        }
    }

    public void trackNativeAdCustomTabsNavigationAborted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFailed(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs navigation failed on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFinished(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs navigation finished on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationStarted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs navigation started on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackNativeAdCustomTabsTabHidden(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs tab hidden on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabHiddenPostbacks());
    }

    public void trackNativeAdCustomTabsTabShown(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking Custom Tabs tab shown on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabShownPostbacks());
    }

    public void trackVideoEnd(AbstractC1736b abstractC1736b, long j, int i, boolean z) {
        if (abstractC1736b == null) {
            if (C1768p.m5160a()) {
                this.f2809b.m5174b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (C1768p.m5160a()) {
            this.f2809b.m5171a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<C1535e> listM4532d0 = abstractC1736b.m4532d0();
        if (listM4532d0 == null || listM4532d0.isEmpty()) {
            if (C1768p.m5160a()) {
                this.f2809b.m5178k("AppLovinAdService", "Unable to submit persistent postback for AD #" + abstractC1736b.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (C1535e c1535e : listM4532d0) {
            if (StringUtils.isValidString(c1535e.m2450c())) {
                String strM4361a = m4361a(c1535e.m2450c(), j, i, string, z);
                String strM4361a2 = m4361a(c1535e.m2448a(), j, i, string, z);
                if (strM4361a != null) {
                    m4368a(new C1535e(strM4361a, strM4361a2));
                } else if (C1768p.m5160a()) {
                    this.f2809b.m5174b("AppLovinAdService", "Failed to parse url: " + c1535e.m2450c());
                }
            } else if (C1768p.m5160a()) {
                this.f2809b.m5178k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }
}
