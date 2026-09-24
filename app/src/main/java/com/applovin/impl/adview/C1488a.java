package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.browser.customtabs.CustomTabsSession;
import bolts.MeasurementEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractC1555g;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1570h4;
import com.applovin.impl.AbstractC1685p8;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1713s;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractC1795v4;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1538e2;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1590j4;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1811x2;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1659n2;
import com.applovin.impl.InterfaceC1668o1;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1746j;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.adview.a */
/* JADX INFO: loaded from: classes3.dex */
public class C1488a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: A */
    private volatile AppLovinAdLoadListener f1027A;

    /* JADX INFO: renamed from: B */
    private volatile AppLovinAdDisplayListener f1028B;

    /* JADX INFO: renamed from: C */
    private volatile AppLovinAdViewEventListener f1029C;

    /* JADX INFO: renamed from: D */
    private volatile AppLovinAdClickListener f1030D;

    /* JADX INFO: renamed from: a */
    private Context f1031a;

    /* JADX INFO: renamed from: b */
    private ViewGroup f1032b;

    /* JADX INFO: renamed from: c */
    private C1748l f1033c;

    /* JADX INFO: renamed from: d */
    private AppLovinAdServiceImpl f1034d;

    /* JADX INFO: renamed from: e */
    private C1768p f1035e;

    /* JADX INFO: renamed from: f */
    private AppLovinCommunicator f1036f;

    /* JADX INFO: renamed from: g */
    private b f1037g;

    /* JADX INFO: renamed from: i */
    private AppLovinAdSize f1039i;

    /* JADX INFO: renamed from: j */
    private String f1040j;

    /* JADX INFO: renamed from: k */
    private CustomTabsSession f1041k;

    /* JADX INFO: renamed from: l */
    private C1494c f1042l;

    /* JADX INFO: renamed from: m */
    private e f1043m;

    /* JADX INFO: renamed from: n */
    private C1493b f1044n;

    /* JADX INFO: renamed from: o */
    private WebView f1045o;

    /* JADX INFO: renamed from: p */
    private C1502k f1046p;

    /* JADX INFO: renamed from: q */
    private Runnable f1047q;

    /* JADX INFO: renamed from: r */
    private Runnable f1048r;

    /* JADX INFO: renamed from: h */
    private final Map f1038h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: s */
    private volatile AbstractC1736b f1049s = null;

    /* JADX INFO: renamed from: t */
    private volatile AppLovinAd f1050t = null;

    /* JADX INFO: renamed from: u */
    private DialogC1497f f1051u = null;

    /* JADX INFO: renamed from: v */
    private DialogC1497f f1052v = null;

    /* JADX INFO: renamed from: w */
    private final AtomicReference f1053w = new AtomicReference();

    /* JADX INFO: renamed from: x */
    private final AtomicBoolean f1054x = new AtomicBoolean();

    /* JADX INFO: renamed from: y */
    private volatile boolean f1055y = false;

    /* JADX INFO: renamed from: z */
    private volatile boolean f1056z = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$a */
    class a extends AbstractC1795v4 {
        a() {
        }

        @Override // com.applovin.impl.AbstractC1795v4
        /* JADX INFO: renamed from: a */
        protected Map mo1977a() {
            return CollectionUtils.hashMap("name", "AdViewController:GAWebView");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1978a(C1488a c1488a);
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$c */
    private class c implements Runnable {
        private c() {
        }

        /* synthetic */ c(C1488a c1488a, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1488a.this.f1044n != null) {
                C1488a.this.f1044n.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$d */
    private class d implements Runnable {

        /* JADX INFO: renamed from: com.applovin.impl.adview.a$d$a */
        class a implements C1502k.a {
            a() {
            }

            @Override // com.applovin.impl.adview.C1502k.a
            /* JADX INFO: renamed from: a */
            public void mo1979a() {
                C1488a.this.f1044n.addView(C1488a.this.f1046p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.C1502k.a
            /* JADX INFO: renamed from: b */
            public void mo1980b() {
                C1768p unused = C1488a.this.f1035e;
                if (C1768p.m5160a()) {
                    C1488a.this.f1035e.m5174b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        /* synthetic */ d(C1488a c1488a, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1488a.this.f1049s != null) {
                if (C1488a.this.f1044n == null) {
                    C1768p.m5167h("AppLovinAdView", "Unable to render advertisement for ad #" + C1488a.this.f1049s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    AbstractC1793v2.m5366a(C1488a.this.f1029C, C1488a.this.f1049s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    C1488a.this.f1033c.m4830g().m2526a(C1548f2.f1474F, C1488a.this.f1049s, mapHashMap);
                    return;
                }
                C1488a.this.m1936v();
                C1768p unused = C1488a.this.f1035e;
                if (C1768p.m5160a()) {
                    C1488a.this.f1035e.m5171a("AppLovinAdView", "Rendering advertisement ad for #" + C1488a.this.f1049s.getAdIdNumber() + "...");
                }
                C1488a.m1912b(C1488a.this.f1044n, C1488a.this.f1049s.getSize());
                if (C1488a.this.f1046p != null) {
                    AbstractC1564g8.m2763c(C1488a.this.f1046p);
                    C1488a.this.f1046p = null;
                }
                C1538e2 c1538e2 = new C1538e2(C1488a.this.f1038h, C1488a.this.f1033c);
                if (c1538e2.m2464c()) {
                    C1488a.this.f1046p = new C1502k(c1538e2, C1488a.this.f1031a);
                    C1488a.this.f1046p.m2035a(new a());
                }
                C1488a.this.f1044n.setAdHtmlLoaded(false);
                C1488a.this.f1044n.m1999a(C1488a.this.f1049s);
                if (C1488a.this.f1049s.getSize() == AppLovinAdSize.INTERSTITIAL || C1488a.this.f1056z) {
                    return;
                }
                C1488a.this.f1049s.setHasShown(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.a$e */
    static class e implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a */
        private final C1488a f1061a;

        e(C1488a c1488a, C1748l c1748l) {
            if (c1488a == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (c1748l == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f1061a = c1488a;
        }

        /* JADX INFO: renamed from: a */
        private C1488a m1981a() {
            return this.f1061a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            C1488a c1488aM1981a = m1981a();
            if (c1488aM1981a != null) {
                c1488aM1981a.m1961b(appLovinAd);
            } else {
                C1768p.m5167h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            C1488a c1488aM1981a = m1981a();
            if (c1488aM1981a != null) {
                c1488aM1981a.m1910b(i);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private void m1895E() {
        if (this.f1035e != null && C1768p.m5160a() && C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", "Destroying...");
        }
        AbstractC1685p8.m3908b(this.f1044n);
        this.f1044n = null;
        AbstractC1685p8.m3908b(this.f1045o);
        this.f1045o = null;
        this.f1041k = null;
        this.f1027A = null;
        this.f1028B = null;
        this.f1030D = null;
        this.f1029C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f1056z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m1898a(int i) {
        try {
            if (this.f1027A != null) {
                this.f1027A.failedToReceiveAd(i);
            }
        } catch (Throwable th) {
            C1768p.m5164c("AppLovinAdView", "Exception while running app load callback", th);
            C1748l c1748l = this.f1033c;
            if (c1748l != null) {
                c1748l.m4764E().m4329a("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m1899a(DialogInterface dialogInterface) {
        m1944a();
    }

    /* JADX INFO: renamed from: a */
    private void m1902a(AppLovinAdView appLovinAdView, C1748l c1748l, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.f1033c = c1748l;
        this.f1034d = c1748l.m4840l();
        this.f1035e = c1748l.m4782Q();
        this.f1036f = AppLovinCommunicator.getInstance(context);
        this.f1039i = appLovinAdSize;
        this.f1040j = str;
        if (!(context instanceof AppLovinFullscreenActivity)) {
            context = context.getApplicationContext();
        }
        this.f1031a = context;
        this.f1032b = appLovinAdView;
        this.f1042l = new C1494c(this, c1748l);
        a aVar = null;
        this.f1048r = new c(this, aVar);
        this.f1047q = new d(this, aVar);
        this.f1043m = new e(this, c1748l);
        m1956a(appLovinAdSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m1904a(AppLovinAd appLovinAd) {
        if (this.f1054x.compareAndSet(true, false)) {
            m1956a(this.f1039i);
        }
        try {
            if (this.f1027A != null) {
                this.f1027A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            C1768p.m5167h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            C1748l c1748l = this.f1033c;
            if (c1748l != null) {
                c1748l.m4764E().m4329a("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1905a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* JADX INFO: renamed from: a */
    private void m1906a(String str) {
        if (this.f1049s == null || this.f1044n == null || !AbstractC1701q7.m4065a(this.f1049s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f1044n.m2000a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m1907a(String str, String str2) {
        String str3;
        if (StringUtils.isValidString(str)) {
            str3 = "gtag('event', '" + str2 + "', " + str + ");";
        } else {
            str3 = "gtag('event', '" + str2 + "')";
        }
        if (((Boolean) this.f1033c.m4801a(C1831z4.f3817S2)).booleanValue()) {
            AbstractC1685p8.m3899a(this.f1045o, str3, this.f1033c);
        } else {
            AbstractC1685p8.m3904a(this.f1045o, str3);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1908a(String str, Map map) {
        m1906a(AbstractC1685p8.m3901a(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m1910b(final int i) {
        if (!this.f1056z) {
            m1905a(this.f1048r);
        }
        m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1898a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m1911b(MotionEvent motionEvent) {
        C1488a c1488a;
        if (this.f1051u == null && (this.f1049s instanceof C1735a) && this.f1044n != null) {
            C1735a c1735a = (C1735a) this.f1049s;
            Context context = this.f1031a;
            Activity activityM2759b = context instanceof Activity ? (Activity) context : AbstractC1564g8.m2759b(this.f1044n, this.f1033c);
            if (activityM2759b == null || activityM2759b.isFinishing()) {
                C1768p.m5167h("AppLovinAdView", "Unable to expand ad. No Activity found.");
                Uri uriM4436Y0 = c1735a.m4436Y0();
                if (uriM4436Y0 != null) {
                    c1488a = this;
                    this.f1034d.trackAndLaunchClick(c1735a, m1970i(), c1488a, uriM4436Y0, motionEvent);
                } else {
                    c1488a = this;
                }
                c1488a.f1044n.m2000a("javascript:al_onFailedExpand();");
                return;
            }
            ViewGroup viewGroup = this.f1032b;
            if (viewGroup != null) {
                viewGroup.removeView(this.f1044n);
            }
            DialogC1497f dialogC1497f = new DialogC1497f(c1735a, this.f1044n, activityM2759b, this.f1033c);
            this.f1051u = dialogC1497f;
            dialogC1497f.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda9
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.m1899a(dialogInterface);
                }
            });
            this.f1051u.show();
            AbstractC1793v2.m5433c(this.f1029C, this.f1049s, (AppLovinAdView) this.f1032b);
            if (this.f1049s.isOpenMeasurementEnabled()) {
                this.f1049s.getAdEventTracker().m2803a((View) this.f1051u.m2031c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m1912b(View view, AppLovinAdSize appLovinAdSize) {
        int iApplyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension2 = -1;
        if (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) {
            iApplyDimension = -1;
        } else {
            iApplyDimension = appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension2 = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m1913b(WebView webView) {
        this.f1049s.getAdEventTracker().m2808c(webView);
        C1502k c1502k = this.f1046p;
        if (c1502k == null || !c1502k.m2036a()) {
            this.f1049s.getAdEventTracker().m2803a((View) webView);
        } else {
            AbstractC1570h4 adEventTracker = this.f1049s.getAdEventTracker();
            C1502k c1502k2 = this.f1046p;
            adEventTracker.m2805b(webView, Collections.singletonList(new C1590j4(c1502k2, FriendlyObstructionPurpose.NOT_VISIBLE, c1502k2.getIdentifier())));
        }
        this.f1049s.getAdEventTracker().mo2812h();
        this.f1049s.getAdEventTracker().m2811g();
    }

    /* JADX INFO: renamed from: b */
    private void m1914b(String str) {
        if (((Boolean) this.f1033c.m4801a(C1831z4.f3720G1)).booleanValue()) {
            m1906a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1915b(String str, Map map) {
        m1906a(AbstractC1685p8.m3907b(str, map));
    }

    /* JADX INFO: renamed from: c */
    private void m1916c() {
        m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1933r();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private void m1917c(String str, Map map) {
        m1906a(AbstractC1685p8.m3910c(str, map));
    }

    /* JADX INFO: renamed from: d */
    private void m1920d() {
        m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1934s();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private void m1921d(String str, Map map) {
        m1906a(AbstractC1685p8.m3912d(str, map));
    }

    /* JADX INFO: renamed from: m */
    private void m1928m() {
        if (C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", "handleApplicationPaused()");
        }
        m1914b("javascript:al_onAppPaused();");
    }

    /* JADX INFO: renamed from: n */
    private void m1929n() {
        if (C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", "handleApplicationResumed()");
        }
        m1914b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m1930o() {
        this.f1044n.loadDataWithBaseURL(RemoteSettings.FORWARD_SLASH_STRING, "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m1931p() {
        C1493b c1493b;
        m1920d();
        if (this.f1032b == null || (c1493b = this.f1044n) == null || c1493b.getParent() != null) {
            return;
        }
        this.f1032b.addView(this.f1044n);
        m1912b(this.f1044n, this.f1049s.getSize());
        if (this.f1049s.isOpenMeasurementEnabled()) {
            this.f1049s.getAdEventTracker().m2803a((View) this.f1044n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m1932q() {
        if (this.f1044n != null && this.f1051u != null) {
            m1944a();
        }
        m1895E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m1933r() {
        if (this.f1051u != null) {
            if (C1768p.m5160a()) {
                this.f1035e.m5171a("AppLovinAdView", "Detaching expanded ad: " + this.f1051u.m2030b());
            }
            this.f1052v = this.f1051u;
            this.f1051u = null;
            m1956a(this.f1039i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m1934s() {
        C1735a c1735aM2030b;
        DialogC1497f dialogC1497f = this.f1052v;
        if (dialogC1497f == null && this.f1051u == null) {
            return;
        }
        if (dialogC1497f != null) {
            c1735aM2030b = dialogC1497f.m2030b();
            this.f1052v.dismiss();
            this.f1052v = null;
        } else {
            c1735aM2030b = this.f1051u.m2030b();
            this.f1051u.dismiss();
            this.f1051u = null;
        }
        AbstractC1793v2.m5365a(this.f1029C, c1735aM2030b, (AppLovinAdView) this.f1032b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m1935t() {
        m1967f().loadUrl("chrome://crash");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m1936v() {
        AbstractC1736b abstractC1736b = this.f1049s;
        C1811x2 c1811x2 = new C1811x2();
        c1811x2.m5564a().m5568a(abstractC1736b).m5566a(m1970i());
        if (!AbstractC1701q7.m4065a(abstractC1736b.getSize())) {
            c1811x2.m5564a().m5570a("Fullscreen Ad Properties").m5573b(abstractC1736b);
        }
        c1811x2.m5569a(this.f1033c);
        c1811x2.m5564a();
        if (C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", c1811x2.toString());
        }
    }

    /* JADX INFO: renamed from: x */
    private void m1937x() {
        if (this.f1049s.m4488J0()) {
            int iM4697c = this.f1033c.m4848q().m4697c();
            if (C1746j.m4690a(iM4697c)) {
                this.f1044n.m2000a("javascript:al_muteSwitchOn();");
            } else if (iM4697c == 2) {
                this.f1044n.m2000a("javascript:al_muteSwitchOff();");
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private void m1938y() {
        if (AbstractC1701q7.m4065a(this.f1039i)) {
            if (((Boolean) this.f1033c.m4801a(C1831z4.f3720G1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f1033c.m4801a(C1831z4.f3728H1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f1033c.m4801a(C1831z4.f3736I1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f1033c.m4801a(C1831z4.f3744J1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m1939A() {
        if (C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f1037g;
        if (bVar != null) {
            bVar.mo1978a(this);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m1940B() {
        m1938y();
        if (this.f1049s != null) {
            AbstractC1555g.m2634a(this.f1044n, this.f1033c);
        }
        m1914b("javascript:al_onAttachedToWindow();");
    }

    /* JADX INFO: renamed from: C */
    public void m1941C() {
        if (this.f1055y) {
            if (this.f1049s == null || !this.f1049s.m4508T0()) {
                AbstractC1793v2.m5419b(this.f1028B, this.f1049s);
            }
            if (this.f1049s != null && this.f1049s.isOpenMeasurementEnabled() && AbstractC1701q7.m4065a(this.f1049s.getSize())) {
                this.f1049s.getAdEventTracker().m2810f();
            }
            if (this.f1044n != null && this.f1051u != null) {
                if (C1768p.m5160a()) {
                    this.f1035e.m5171a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                m1916c();
            } else if (C1768p.m5160a()) {
                this.f1035e.m5171a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            m1914b("javascript:al_onDetachedFromWindow();");
        }
    }

    /* JADX INFO: renamed from: D */
    public void m1942D() {
        if (!this.f1055y || this.f1056z) {
            return;
        }
        this.f1056z = true;
    }

    /* JADX INFO: renamed from: F */
    public void m1943F() {
        if (this.f1055y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f1053w.getAndSet(null);
            if (appLovinAd != null) {
                m1965c(appLovinAd);
            }
            this.f1056z = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1944a() {
        m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1931p();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m1945a(Uri uri) {
        Context context = this.f1031a;
        Activity activityM2759b = context instanceof Activity ? (Activity) context : AbstractC1564g8.m2759b(this.f1044n, this.f1033c);
        if (activityM2759b instanceof AppLovinFullscreenActivity) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) activityM2759b;
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("hide_status_bar", appLovinFullscreenActivity.isHidingStatusBar());
            boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("hide_navigation_bar", appLovinFullscreenActivity.isHidingNavigationBar());
            appLovinFullscreenActivity.configureSystemUiBars(booleanQueryParameter, booleanQueryParameter2, uri.getBooleanQueryParameter("hide_no_bar", (booleanQueryParameter || booleanQueryParameter2) ? false : true), uri.getBooleanQueryParameter("allow_ad_rendering_within_display_cutout", appLovinFullscreenActivity.isAllowingAdRenderingWithinDisplayCutout()));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1946a(final MotionEvent motionEvent) {
        m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1911b(motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m1947a(final WebView webView, String str) {
        if (this.f1049s == null) {
            return;
        }
        m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                webView.setVisibility(0);
            }
        });
        if (!((Boolean) this.f1033c.m4801a(C1831z4.f3677A6)).booleanValue() || (str != null && str.startsWith(this.f1049s.m4543k()))) {
            try {
                if (this.f1049s != this.f1050t) {
                    this.f1050t = this.f1049s;
                    m1937x();
                    this.f1044n.setAdHtmlLoaded(true);
                    if (this.f1028B != null) {
                        this.f1033c.m4866z().m2560d(this.f1049s);
                        if (this.f1049s.m4552o0()) {
                            this.f1033c.m4830g().m2526a(C1548f2.f1472E, this.f1049s, CollectionUtils.hashMap("details", AbstractC1568h2.m2791b(this.f1049s)));
                        } else {
                            this.f1033c.m4830g().m2526a(C1548f2.f1470D, this.f1049s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f1049s.m4570z())));
                            AbstractC1793v2.m5388a(this.f1028B, this.f1049s);
                        }
                        if (this.f1049s.m4490K0()) {
                            String str2 = (String) this.f1033c.m4851r0().m2209a(C1511b5.f1162T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f1044n.m2000a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f1044n.m2000a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f1049s.m4552o0()) {
                            this.f1044n.m2000a("javascript:al_onAdRestored( '" + this.f1049s.m4515X() + "' );");
                        }
                    }
                    if ((this.f1049s instanceof C1735a) && this.f1049s.isOpenMeasurementEnabled()) {
                        this.f1033c.m4853s0().m2605a(new C1788u6(this.f1033c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m1913b(webView);
                            }
                        }), C1552f6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                C1768p.m5164c("AppLovinAdView", "Exception while notifying ad display listener", th);
                C1748l c1748l = this.f1033c;
                if (c1748l != null) {
                    c1748l.m4764E().m4329a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1948a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            C1768p.m5167h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = AbstractC1713s.m4302a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            m1902a(appLovinAdView, appLovinSdk.m5807a(), appLovinAdSize2, str, context);
            if (AbstractC1713s.m4307b(attributeSet)) {
                m1974u();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1949a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f1029C = appLovinAdViewEventListener;
    }

    /* JADX INFO: renamed from: a */
    public void m1950a(b bVar) {
        this.f1037g = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m1951a(AbstractC1736b abstractC1736b, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        C1488a c1488a;
        AbstractC1736b abstractC1736b2;
        if (appLovinAdView != null) {
            c1488a = this;
            abstractC1736b2 = abstractC1736b;
            this.f1034d.trackAndLaunchClick(abstractC1736b2, appLovinAdView, c1488a, uri, motionEvent);
        } else {
            c1488a = this;
            abstractC1736b2 = abstractC1736b;
            if (C1768p.m5160a()) {
                c1488a.f1035e.m5174b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        AbstractC1793v2.m5387a(c1488a.f1030D, abstractC1736b2);
    }

    /* JADX INFO: renamed from: a */
    public void m1952a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        AbstractC1701q7.m4080b(appLovinAd, this.f1033c);
        if (!this.f1055y) {
            C1768p.m5168i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "renderAd", mapM2787a);
            this.f1033c.m4830g().m2682d(C1548f2.f1468C, mapM2787a);
        }
        AbstractC1736b abstractC1736b = (AbstractC1736b) AbstractC1701q7.m4026a(appLovinAd, this.f1033c);
        if (abstractC1736b == null) {
            C1768p.m5167h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
            AbstractC1793v2.m5389a(this.f1028B, "Unable to retrieve the loaded ad");
            Map mapM2787a2 = AbstractC1568h2.m2787a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "noAdToRender", mapM2787a2);
            CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapM2787a2);
            this.f1033c.m4830g().m2682d(C1548f2.f1474F, mapM2787a2);
            return;
        }
        if (abstractC1736b == this.f1049s) {
            C1768p.m5167h("AppLovinAdView", "Attempting to show ad again: " + abstractC1736b);
            if (((Boolean) this.f1033c.m4801a(C1831z4.f3752K1)).booleanValue()) {
                if (this.f1028B instanceof InterfaceC1659n2) {
                    AbstractC1793v2.m5389a(this.f1028B, "Attempting to show ad again");
                } else {
                    if (AbstractC1701q7.m4092c(this.f1033c)) {
                        throw new IllegalStateException("Attempting to show ad again");
                    }
                    this.f1033c.m4830g().m2526a(C1548f2.f1515Z0, abstractC1736b, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                }
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
            CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
            this.f1033c.m4830g().m2526a(C1548f2.f1474F, abstractC1736b, mapHashMap);
            return;
        }
        if (C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", "Rendering ad #" + abstractC1736b.getAdIdNumber() + " (" + abstractC1736b.getSize() + ")");
        }
        AbstractC1793v2.m5419b(this.f1028B, this.f1049s);
        if (this.f1049s != null && this.f1049s.isOpenMeasurementEnabled()) {
            this.f1049s.getAdEventTracker().m2810f();
        }
        this.f1053w.set(null);
        this.f1050t = null;
        this.f1049s = abstractC1736b;
        if (this.f1049s.isCustomTabsEnabled()) {
            this.f1041k = this.f1033c.m4757A().m2657a(this);
            this.f1033c.m4757A().m2662b(this.f1049s.getCustomTabsWarmupUrls(), this.f1041k);
        }
        if (!this.f1056z && AbstractC1701q7.m4065a(this.f1039i)) {
            this.f1033c.m4840l().trackImpression(abstractC1736b);
        }
        if (this.f1051u != null) {
            m1916c();
        }
        m1905a(this.f1047q);
    }

    /* JADX INFO: renamed from: a */
    public void m1953a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1030D = appLovinAdClickListener;
    }

    /* JADX INFO: renamed from: a */
    public void m1954a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1028B = appLovinAdDisplayListener;
    }

    /* JADX INFO: renamed from: a */
    public void m1955a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1027A = appLovinAdLoadListener;
    }

    /* JADX INFO: renamed from: a */
    protected void m1956a(AppLovinAdSize appLovinAdSize) {
        try {
            C1493b c1493b = new C1493b(this.f1042l, this.f1033c, this.f1031a);
            this.f1044n = c1493b;
            c1493b.setBackgroundColor(0);
            this.f1044n.setWillNotCacheDrawing(false);
            this.f1032b.setBackgroundColor(0);
            this.f1032b.addView(this.f1044n);
            m1912b(this.f1044n, appLovinAdSize);
            if (!this.f1055y) {
                m1905a(this.f1048r);
            }
            m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1930o();
                }
            });
            this.f1055y = true;
        } catch (Throwable th) {
            C1768p.m5164c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f1033c.m4764E().m4329a("AppLovinAdView", "initAdWebView", th);
            this.f1054x.set(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1957a(String str, Object obj) {
        this.f1038h.put(str, obj);
    }

    /* JADX INFO: renamed from: a */
    public void m1958a(boolean z) {
        if (C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", "onWindowFocusChanged( " + z + " )");
        }
        m1914b("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    /* JADX INFO: renamed from: b */
    public void m1959b() {
        m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1932q();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m1960b(Uri uri) {
        if (this.f1049s == null || !this.f1049s.m4560s0()) {
            return;
        }
        if (this.f1045o == null) {
            this.f1033c.m4782Q();
            if (C1768p.m5160a()) {
                this.f1033c.m4782Q().m5171a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        final String queryParameter = uri.getQueryParameter(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY);
        final String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (!TextUtils.isEmpty(queryParameter)) {
            m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1907a(queryParameter2, queryParameter);
                }
            });
            return;
        }
        this.f1033c.m4782Q();
        if (C1768p.m5160a()) {
            this.f1033c.m4782Q().m5171a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
        }
    }

    /* JADX INFO: renamed from: b */
    void m1961b(final AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            if (C1768p.m5160a()) {
                this.f1035e.m5174b("AppLovinAdView", "No provided when to the view controller");
            }
            m1910b(-1);
        } else {
            if (this.f1056z) {
                this.f1053w.set(appLovinAd);
                if (C1768p.m5160a()) {
                    this.f1035e.m5171a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            } else {
                m1965c(appLovinAd);
            }
            m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1904a(appLovinAd);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1962c(int i) {
        String strM2751a = AbstractC1564g8.m2751a(i);
        if (C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", "onWindowVisibilityChanged( " + strM2751a + " )");
        }
        m1914b("javascript:al_onWindowVisibilityChanged( " + strM2751a + " );");
    }

    /* JADX INFO: renamed from: c */
    public void m1963c(Uri uri) {
        if (this.f1049s != null && this.f1049s.m4560s0() && this.f1045o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f1033c.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1033c.m4782Q().m5174b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f1031a);
            this.f1045o = webView;
            webView.setWebViewClient(new a());
            this.f1045o.getSettings().setJavaScriptEnabled(true);
            this.f1045o.loadDataWithBaseURL((String) this.f1033c.m4801a(C1831z4.f3974k7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1964c(WebView webView) {
        m1947a(webView, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public void m1965c(AppLovinAd appLovinAd) {
        m1952a(appLovinAd, (String) null);
    }

    /* JADX INFO: renamed from: e */
    public AppLovinAdViewEventListener m1966e() {
        return this.f1029C;
    }

    /* JADX INFO: renamed from: f */
    public C1493b m1967f() {
        return this.f1044n;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC1736b m1968g() {
        return this.f1049s;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    /* JADX INFO: renamed from: h */
    public CustomTabsSession m1969h() {
        return this.f1041k;
    }

    /* JADX INFO: renamed from: i */
    public AppLovinAdView m1970i() {
        return (AppLovinAdView) this.f1032b;
    }

    /* JADX INFO: renamed from: j */
    public C1748l m1971j() {
        return this.f1033c;
    }

    /* JADX INFO: renamed from: k */
    public AppLovinAdSize m1972k() {
        return this.f1039i;
    }

    /* JADX INFO: renamed from: l */
    public String m1973l() {
        return this.f1040j;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            m1905a(new Runnable() { // from class: com.applovin.impl.adview.a$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1935t();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        action.hashCode();
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                m1908a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                m1917c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                m1915b(action, map);
                break;
            case "com.applovin.application_paused":
                m1928m();
                break;
            case "com.applovin.application_resumed":
                m1929n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                m1921d(action, map);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1974u() {
        if (this.f1033c == null || this.f1043m == null || this.f1031a == null || !this.f1055y) {
            C1768p.m5168i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f1034d.loadNextAd(this.f1040j, this.f1039i, this.f1043m);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m1975w() {
        if ((this.f1031a instanceof InterfaceC1668o1) && this.f1049s != null && this.f1049s.m4489K() == AbstractC1736b.b.DISMISS) {
            ((InterfaceC1668o1) this.f1031a).dismiss("postitial_click");
        }
    }

    /* JADX INFO: renamed from: z */
    public void m1976z() {
        if (this.f1051u != null || this.f1052v != null) {
            m1944a();
            return;
        }
        if (C1768p.m5160a()) {
            this.f1035e.m5171a("AppLovinAdView", "Ad: " + this.f1049s + " closed.");
        }
        m1905a(this.f1048r);
        AbstractC1793v2.m5419b(this.f1028B, this.f1049s);
        this.f1049s = null;
    }
}
