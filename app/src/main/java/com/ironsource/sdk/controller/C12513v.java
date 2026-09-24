package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.AbstractC11642R3;
import com.ironsource.C11341A5;
import com.ironsource.C11386Ce;
import com.ironsource.C11409E1;
import com.ironsource.C11455Gb;
import com.ironsource.C11491Ib;
import com.ironsource.C11540L6;
import com.ironsource.C11550Lg;
import com.ironsource.C11564Mc;
import com.ironsource.C11569N;
import com.ironsource.C11582Nc;
import com.ironsource.C11604Og;
import com.ironsource.C11613P7;
import com.ironsource.C11660S4;
import com.ironsource.C11676T3;
import com.ironsource.C11677T4;
import com.ironsource.C11693U3;
import com.ironsource.C11703Ud;
import com.ironsource.C11720Vd;
import com.ironsource.C11728W4;
import com.ironsource.C11744X3;
import com.ironsource.C11753Xc;
import com.ironsource.C11770Yc;
import com.ironsource.C11778Z3;
import com.ironsource.C11794a2;
import com.ironsource.C11796a4;
import com.ironsource.C11802aa;
import com.ironsource.C12105b1;
import com.ironsource.C12120bg;
import com.ironsource.C12123c1;
import com.ironsource.C12145d5;
import com.ironsource.C12150da;
import com.ironsource.C12162e4;
import com.ironsource.C12166e8;
import com.ironsource.C12206g4;
import com.ironsource.C12229h9;
import com.ironsource.C12260j4;
import com.ironsource.C12282k8;
import com.ironsource.C12292l0;
import com.ironsource.C12317m4;
import com.ironsource.C12386n8;
import com.ironsource.C12404o8;
import com.ironsource.C12422p8;
import com.ironsource.C12476s8;
import com.ironsource.C12540u1;
import com.ironsource.C12547u8;
import com.ironsource.C12579w4;
import com.ironsource.C12601x8;
import com.ironsource.EnumC12265j9;
import com.ironsource.InterfaceC11434F8;
import com.ironsource.InterfaceC11510Jc;
import com.ironsource.InterfaceC11546Lc;
import com.ironsource.InterfaceC11586Ng;
import com.ironsource.InterfaceC11730W6;
import com.ironsource.InterfaceC11781Z6;
import com.ironsource.InterfaceC11799a7;
import com.ironsource.InterfaceC12188f4;
import com.ironsource.InterfaceC12284ka;
import com.ironsource.InterfaceC12290kg;
import com.ironsource.InterfaceC12400o4;
import com.ironsource.InterfaceC12406oa;
import com.ironsource.InterfaceC12436q4;
import com.ironsource.InterfaceC12454r4;
import com.ironsource.InterfaceC12472s4;
import com.ironsource.InterfaceC12525t4;
import com.ironsource.InterfaceC12576w1;
import com.ironsource.InterfaceC12582w7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.internal.services.C14638b;
import com.unity3d.ironsourceads.internal.services.InterfaceC14637a;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.v */
/* JADX INFO: loaded from: classes6.dex */
public class C12513v implements InterfaceC12503l, InterfaceC11510Jc, DownloadListener {

    /* JADX INFO: renamed from: d0 */
    private static final String f32227d0 = "about:blank";

    /* JADX INFO: renamed from: e0 */
    public static int f32228e0 = 0;

    /* JADX INFO: renamed from: f0 */
    public static String f32229f0 = "is_store";

    /* JADX INFO: renamed from: g0 */
    public static String f32230g0 = "external_url";

    /* JADX INFO: renamed from: h0 */
    public static String f32231h0 = "secondary_web_view";

    /* JADX INFO: renamed from: i0 */
    private static String f32232i0 = "success";

    /* JADX INFO: renamed from: j0 */
    private static String f32233j0 = "fail";

    /* JADX INFO: renamed from: A */
    private InterfaceC12454r4 f32234A;

    /* JADX INFO: renamed from: B */
    private String f32235B;

    /* JADX INFO: renamed from: C */
    private C12495d f32236C;

    /* JADX INFO: renamed from: D */
    private InterfaceC12290kg f32237D;

    /* JADX INFO: renamed from: E */
    private C12123c1 f32238E;

    /* JADX INFO: renamed from: H */
    private C11677T4 f32241H;

    /* JADX INFO: renamed from: I */
    private C12506o f32242I;

    /* JADX INFO: renamed from: J */
    private C12508q f32243J;

    /* JADX INFO: renamed from: K */
    private C12512u f32244K;

    /* JADX INFO: renamed from: L */
    private C12500i f32245L;

    /* JADX INFO: renamed from: M */
    private C12492a f32246M;

    /* JADX INFO: renamed from: N */
    private C12501j f32247N;

    /* JADX INFO: renamed from: O */
    private C12540u1 f32248O;

    /* JADX INFO: renamed from: P */
    private C12579w4 f32249P;

    /* JADX INFO: renamed from: Q */
    private InterfaceC11586Ng f32250Q;

    /* JADX INFO: renamed from: R */
    private InterfaceC12494c f32251R;

    /* JADX INFO: renamed from: S */
    private AbstractC11642R3 f32252S;

    /* JADX INFO: renamed from: T */
    private JSONObject f32253T;

    /* JADX INFO: renamed from: U */
    private InterfaceC12503l.a f32254U;

    /* JADX INFO: renamed from: V */
    private InterfaceC12503l.b f32255V;

    /* JADX INFO: renamed from: W */
    private C12260j4 f32256W;

    /* JADX INFO: renamed from: X */
    private boolean f32257X;

    /* JADX INFO: renamed from: Y */
    private final boolean f32258Y;

    /* JADX INFO: renamed from: Z */
    private final InterfaceC12582w7 f32259Z;

    /* JADX INFO: renamed from: a */
    private final C11613P7 f32260a;

    /* JADX INFO: renamed from: a0 */
    C11796a4 f32261a0;

    /* JADX INFO: renamed from: b */
    private InterfaceC12188f4 f32262b;

    /* JADX INFO: renamed from: b0 */
    private volatile C12150da f32263b0;

    /* JADX INFO: renamed from: c0 */
    private InterfaceC11546Lc f32265c0;

    /* JADX INFO: renamed from: f */
    private String f32268f;

    /* JADX INFO: renamed from: g */
    private String f32269g;

    /* JADX INFO: renamed from: h */
    private final C12145d5 f32270h;

    /* JADX INFO: renamed from: i */
    private boolean f32271i;

    /* JADX INFO: renamed from: j */
    private q f32272j;

    /* JADX INFO: renamed from: k */
    private boolean f32273k;

    /* JADX INFO: renamed from: l */
    private CountDownTimer f32274l;

    /* JADX INFO: renamed from: m */
    public CountDownTimer f32275m;

    /* JADX INFO: renamed from: r */
    private final p f32280r;

    /* JADX INFO: renamed from: s */
    private View f32281s;

    /* JADX INFO: renamed from: t */
    private FrameLayout f32282t;

    /* JADX INFO: renamed from: u */
    private WebChromeClient.CustomViewCallback f32283u;

    /* JADX INFO: renamed from: v */
    private FrameLayout f32284v;

    /* JADX INFO: renamed from: w */
    private v f32285w;

    /* JADX INFO: renamed from: x */
    private String f32286x;

    /* JADX INFO: renamed from: y */
    private InterfaceC12525t4 f32287y;

    /* JADX INFO: renamed from: z */
    private InterfaceC12472s4 f32288z;

    /* JADX INFO: renamed from: c */
    private String f32264c = "v";

    /* JADX INFO: renamed from: d */
    private String f32266d = "IronSource";

    /* JADX INFO: renamed from: e */
    private final String f32267e = "We're sorry, some error occurred. we will investigate it";

    /* JADX INFO: renamed from: n */
    private final C11550Lg f32276n = new C11550Lg();

    /* JADX INFO: renamed from: o */
    private int f32277o = 50;

    /* JADX INFO: renamed from: p */
    private int f32278p = 50;

    /* JADX INFO: renamed from: q */
    private String f32279q = C11744X3.e.f26237b;

    /* JADX INFO: renamed from: F */
    private Object f32239F = new Object();

    /* JADX INFO: renamed from: G */
    private boolean f32240G = false;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12513v.this.m33551a(1);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12513v.this.m33551a(1);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12404o8 f32291a;

        c(C12404o8 c12404o8) {
            this.f32291a = c12404o8;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12513v.this.f32251R.mo33362c("controller html - failed to download - " + this.f32291a.m32957b());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f32293a;

        d(Context context) {
            this.f32293a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12513v.this.m33530e(this.f32293a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f32295a;

        e(Context context) {
            this.f32295a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12513v.this.m33532f(this.f32295a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12386n8.e f32297a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f32298b;

        f(C12386n8.e eVar, String str) {
            this.f32297a = eVar;
            this.f32298b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC12436q4 interfaceC12436q4M33498a;
            C12386n8.e eVar = this.f32297a;
            if ((eVar == C12386n8.e.RewardedVideo || eVar == C12386n8.e.Interstitial) && (interfaceC12436q4M33498a = C12513v.this.m33498a(eVar)) != null) {
                interfaceC12436q4M33498a.mo26534b(this.f32297a, this.f32298b);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$h */
    class h implements InterfaceC11586Ng {
        h() {
        }

        @Override // com.ironsource.InterfaceC11586Ng
        /* JADX INFO: renamed from: a */
        public void mo26685a(String str, JSONObject jSONObject) {
            C12513v.this.m33535i(C12513v.this.m33529e(str, jSONObject.toString()));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f32302a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WebView f32303b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f32304c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f32305d;

        i(JSONObject jSONObject, WebView webView, int i, String str) {
            this.f32302a = jSONObject;
            this.f32303b = webView;
            this.f32304c = i;
            this.f32305d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12513v.this.m33516a(this.f32302a, this.f32303b);
            if (C12513v.m33495B()) {
                C12513v.this.f32276n.m26444a(this.f32304c, this.f32305d);
                C12513v.this.m33537m("about:blank");
            } else {
                C12513v.this.m33537m("about:blank");
                C12513v.this.m33537m(this.f32305d);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$j */
    class j extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f32307a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f32308b;

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$j$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12513v.this.f32251R.mo33362c(C11744X3.c.f26206j);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$j$b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IronLog.INTERNAL.verbose("Stopping WebView load before retry attempt $nextAttempt");
                    C12513v.this.f32263b0.stopLoading();
                } catch (Exception unused) {
                    IronLog.INTERNAL.verbose("Failed to stop WebView loading: $error");
                }
                j jVar = j.this;
                C12513v.this.m33551a(jVar.f32307a + 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j, long j2, int i, int i2) {
            super(j, j2);
            this.f32307a = i;
            this.f32308b = i2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.m33642i(C12513v.this.f32264c, "Loading Controller Timer Finish");
            if (this.f32307a >= this.f32308b) {
                C12513v.this.m33570b(new a());
            } else if (C12513v.m33495B()) {
                C12513v.this.m33573c(new b());
            } else {
                C12513v.this.m33551a(this.f32307a + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$k */
    class k implements t {
        k() {
        }

        @Override // com.ironsource.sdk.controller.C12513v.t
        /* JADX INFO: renamed from: a */
        public void mo33595a(String str, C12386n8.e eVar, C11660S4 c11660s4) {
            C12513v.this.m33513a(str, eVar, c11660s4);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$l */
    class l implements t {
        l() {
        }

        @Override // com.ironsource.sdk.controller.C12513v.t
        /* JADX INFO: renamed from: a */
        public void mo33595a(String str, C12386n8.e eVar, C11660S4 c11660s4) {
            C12513v.this.m33513a(str, eVar, c11660s4);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$m */
    class m implements t {
        m() {
        }

        @Override // com.ironsource.sdk.controller.C12513v.t
        /* JADX INFO: renamed from: a */
        public void mo33595a(String str, C12386n8.e eVar, C11660S4 c11660s4) {
            C12513v.this.m33513a(str, eVar, c11660s4);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$n */
    class n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C12386n8.e f32315a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C11660S4 f32316b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f32317c;

        n(C12386n8.e eVar, C11660S4 c11660s4, String str) {
            this.f32315a = eVar;
            this.f32316b = c11660s4;
            this.f32317c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11660S4 c11660s4;
            C12386n8.e eVar = C12386n8.e.RewardedVideo;
            C12386n8.e eVar2 = this.f32315a;
            if ((eVar != eVar2 && C12386n8.e.Interstitial != eVar2 && C12386n8.e.Banner != eVar2) || (c11660s4 = this.f32316b) == null || TextUtils.isEmpty(c11660s4.m27447h())) {
                return;
            }
            InterfaceC12436q4 interfaceC12436q4M33498a = C12513v.this.m33498a(this.f32315a);
            Log.d(C12513v.this.f32264c, "onAdProductInitFailed (message:" + this.f32317c + ")(" + this.f32315a + ")");
            if (interfaceC12436q4M33498a != null) {
                interfaceC12436q4M33498a.mo26519a(this.f32315a, this.f32316b.m27447h(), this.f32317c);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$o */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C12513v.this.m33551a(1);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$p */
    private class p extends WebChromeClient {
        private p() {
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(C12513v.this.f32263b0.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.m33642i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new r());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m33642i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.m33642i("Test", "onHideCustomView");
            View view = C12513v.this.f32281s;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            C12513v c12513v = C12513v.this;
            c12513v.f32282t.removeView(c12513v.f32281s);
            C12513v c12513v2 = C12513v.this;
            c12513v2.f32281s = null;
            c12513v2.f32282t.setVisibility(8);
            C12513v.this.f32283u.onCustomViewHidden();
            C12513v.this.f32263b0.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.m33642i("Test", "onShowCustomView");
            C12513v.this.f32263b0.setVisibility(8);
            if (C12513v.this.f32281s != null) {
                Logger.m33642i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.m33642i("Test", "mCustomView == null");
            C12513v.this.f32282t.addView(view);
            C12513v c12513v = C12513v.this;
            c12513v.f32281s = view;
            c12513v.f32283u = customViewCallback;
            c12513v.f32282t.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$q */
    static class q {

        /* JADX INFO: renamed from: a */
        C12386n8.e f32321a;

        /* JADX INFO: renamed from: b */
        String f32322b;

        public q(C12386n8.e eVar, String str) {
            this.f32321a = eVar;
            this.f32322b = str;
        }

        /* JADX INFO: renamed from: a */
        String m33596a() {
            return this.f32322b;
        }

        /* JADX INFO: renamed from: b */
        C12386n8.e m33597b() {
            return this.f32321a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r */
    private class r extends WebViewClient {
        private r() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m33640e(C12513v.this.f32264c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context contextM33585q = C12513v.this.m33585q();
            contextM33585q.startActivity(new OpenUrlActivity.C12491e(new InterfaceC12502k.c()).m33350a(str).m33352b(false).m33348a(contextM33585q));
            return true;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$t */
    private interface t {
        /* JADX INFO: renamed from: a */
        void mo33595a(String str, C12386n8.e eVar, C11660S4 c11660s4);
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$u */
    static class u {

        /* JADX INFO: renamed from: a */
        String f32384a;

        /* JADX INFO: renamed from: b */
        String f32385b;

        u() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$v */
    public enum v {
        Display,
        Gone
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$w */
    private class w extends WebViewClient {
        private w() {
        }

        /* JADX INFO: renamed from: a */
        private void m33630a() {
            String strM26445b = C12513v.this.f32276n.m26445b();
            if (strM26445b != null) {
                C12513v.this.m33537m(strM26445b);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.m33642i("onPageFinished", str);
            if (C12513v.m33495B() && C12513v.this.f32276n.m26446c() && str.equals("about:blank")) {
                m33630a();
            }
            if (str.contains("adUnit") || str.contains("index.html")) {
                C12513v.this.m33544D();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.m33642i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            InterfaceC12494c interfaceC12494c;
            Logger.m33642i("onReceivedError", str2 + " " + str);
            if (str2.contains(C11744X3.f26144f) && (interfaceC12494c = C12513v.this.f32251R) != null) {
                interfaceC12494c.mo33362c("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.e(C12513v.this.f32264c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            InterfaceC12494c interfaceC12494c = C12513v.this.f32251R;
            if (interfaceC12494c != null) {
                interfaceC12494c.mo33360b(str);
            }
            C12513v.this.m33591w();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean zContains;
            Logger.m33642i("shouldInterceptRequest", str);
            try {
                zContains = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e) {
                C12317m4.m32153d().m32155a(e);
                zContains = false;
            }
            if (zContains) {
                String str2 = AdPayload.FILE_SCHEME + C12513v.this.f32235B + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException e2) {
                    C12317m4.m32153d().m32155a(e2);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.m33642i("shouldOverrideUrlLoading", str);
            try {
                if (C12513v.this.m33579h(str)) {
                    C12513v.this.m33543A();
                    return true;
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public C12513v(Context context, C11677T4 c11677t4, C11796a4 c11796a4, InterfaceC12494c interfaceC12494c, C11613P7 c11613p7, int i2, C12145d5 c12145d5, String str, InterfaceC12503l.a aVar, InterfaceC12503l.b bVar, String str2, String str3) throws Throwable {
        CountDownLatch countDownLatch;
        p pVar = new p();
        this.f32280r = pVar;
        boolean zMo32190q = C11455Gb.m25891U().mo25846h().mo32190q();
        this.f32258Y = C11455Gb.m25891U().mo25846h().mo32198y();
        if (zMo32190q) {
            countDownLatch = new CountDownLatch(1);
            m33506a(context, c11613p7, countDownLatch);
        } else {
            countDownLatch = null;
        }
        this.f32259Z = C11455Gb.m25891U().mo25842a();
        if (!zMo32190q) {
            this.f32263b0 = new C12150da(context, new InterfaceC12406oa.a());
        }
        Logger.m33642i(this.f32264c, "C'tor");
        this.f32261a0 = c11796a4;
        this.f32251R = interfaceC12494c;
        this.f32260a = c11613p7;
        this.f32241H = c11677t4;
        if (!zMo32190q) {
            m33505a(context, this.f32263b0);
        }
        this.f32235B = str;
        this.f32238E = new C12123c1();
        this.f32253T = new JSONObject();
        this.f32270h = c12145d5;
        this.f32254U = aVar;
        this.f32255V = bVar;
        boolean zOptBoolean = SDKUtils.getNetworkConfiguration().optBoolean(C11744X3.a.f26172i, false);
        this.f32257X = zOptBoolean;
        if (zOptBoolean) {
            this.f32256W = new C12260j4(new C12206g4(SDKUtils.getControllerUrl(), this.f32235B, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new C11770Yc(SDKUtils.getControllerUrl())), new Function1() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.f$0.m33524d((C12601x8) obj);
                }
            }, c12145d5, new InterfaceC12400o4.a());
        } else {
            c12145d5.mo31289a(this);
            this.f32236C = new C12495d(SDKUtils.getNetworkConfiguration(), this.f32235B, SDKUtils.getControllerUrl(), c12145d5);
        }
        if (!zMo32190q) {
            this.f32263b0.setWebViewClient(new w());
            this.f32263b0.setWebChromeClient(pVar);
            C11604Og.m26778a(this.f32263b0);
            m33509a(this.f32263b0);
            this.f32263b0.setDownloadListener(this);
        }
        this.f32252S = m33520c(context);
        mo33420b(context);
        m33569b(i2);
        this.f32268f = str2;
        this.f32269g = str3;
        if (zMo32190q) {
            try {
                countDownLatch.await();
                if (this.f32263b0 == null) {
                    IronLog.INTERNAL.error("WebView initialization failed");
                    this.f32251R.mo33362c("WebView initialization failed");
                    return;
                }
            } catch (InterruptedException e2) {
                IronLog.INTERNAL.error("WebView initialization was interrupted", e2);
                C12317m4.m32153d().m32155a(e2);
                Thread.currentThread().interrupt();
                this.f32251R.mo33362c("WebView initialization was interrupted");
                return;
            }
        }
        this.f32262b = InterfaceC12188f4.CC.m31426a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static boolean m33495B() {
        return C11455Gb.m25891U().mo25846h().mo32180g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m33496C() {
        ViewParent parent = this.f32263b0.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f32263b0);
        }
        this.f32263b0.destroy();
    }

    /* JADX INFO: renamed from: J */
    private void m33497J() {
    }

    /* JADX INFO: renamed from: a */
    private void m33506a(final Context context, C11613P7 c11613p7, final CountDownLatch countDownLatch) {
        c11613p7.m27224d(new Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m33507a(context, countDownLatch);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private AbstractC11642R3 m33520c(Context context) {
        return new g(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public Object[] m33533f(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> mapM27446g = null;
        if (TextUtils.isEmpty(str)) {
            z = true;
        } else {
            C11660S4 c11660s4M27513a = this.f32241H.m27513a(m33534g(str), str2);
            if (c11660s4M27513a != null) {
                mapM27446g = c11660s4M27513a.m27446g();
                mapM27446g.put("demandSourceName", c11660s4M27513a.m27445f());
                mapM27446g.put("demandSourceId", c11660s4M27513a.m27447h());
            }
            try {
                jSONObject.put(C11744X3.i.f26378m, str);
            } catch (JSONException e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                C12317m4.m32153d().m32155a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
            z = false;
        }
        if (!TextUtils.isEmpty(this.f32269g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26442f), SDKUtils.encodeString(this.f32269g));
            } catch (JSONException e4) {
                C12317m4.m32153d().m32155a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (TextUtils.isEmpty(this.f32268f)) {
            z = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26444g), SDKUtils.encodeString(this.f32268f));
            } catch (JSONException e5) {
                C12317m4.m32153d().m32155a(e5);
                IronLog.INTERNAL.error(e5.toString());
            }
        }
        if (mapM27446g != null && !mapM27446g.isEmpty()) {
            for (Map.Entry<String, String> entry : mapM27446g.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    m33540p(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    C12317m4.m32153d().m32155a(e6);
                    IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m33535i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m33573c(new Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m33536k(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m33536k(String str) {
        this.f32263b0.mo31307a(new InterfaceC12504m.b(str, m33586r()).mo33467a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m33537m(String str) {
        try {
            Logger.m33642i(this.f32264c, "load(): " + str);
            this.f32263b0.loadUrl(str);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            Logger.m33640e(this.f32264c, "WebViewController::load: " + th);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m33538n() {
        CountDownTimer countDownTimer;
        if (!C11455Gb.m25891U().mo25846h().mo32181h() || (countDownTimer = this.f32275m) == null) {
            return;
        }
        countDownTimer.cancel();
        this.f32275m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m33541q(String str) {
        C11720Vd c11720Vd = new C11720Vd(str);
        String strM27759d = c11720Vd.m27759d("color");
        String strM27759d2 = c11720Vd.m27759d("adViewId");
        int color = !C11744X3.i.f26348T.equalsIgnoreCase(strM27759d) ? Color.parseColor(strM27759d) : 0;
        if (strM27759d2 == null) {
            this.f32263b0.setBackgroundColor(color);
            return;
        }
        WebView presentingView = C12282k8.m31929a().mo31278a(strM27759d2).getPresentingView();
        if (presentingView != null) {
            presentingView.setBackgroundColor(color);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m33543A() {
        m33535i(m33531f(C11744X3.h.f26284Z));
    }

    /* JADX INFO: renamed from: D */
    public void m33544D() {
        m33535i(m33531f(C11744X3.h.f26259A));
    }

    /* JADX INFO: renamed from: E */
    public void m33545E() {
        try {
            this.f32263b0.onPause();
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            Logger.m33642i(this.f32264c, "WebViewController: onPause() - " + th);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m33546F() {
        this.f32237D = null;
    }

    /* JADX INFO: renamed from: G */
    public void m33547G() {
        this.f32263b0.m31305a();
        this.f32265c0 = null;
    }

    /* JADX INFO: renamed from: H */
    public void m33548H() {
        this.f32263b0.requestFocus();
    }

    /* JADX INFO: renamed from: I */
    public void m33549I() {
        try {
            this.f32263b0.onResume();
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            Logger.m33642i(this.f32264c, "WebViewController: onResume() - " + th);
        }
    }

    /* JADX INFO: renamed from: b */
    C12509r m33568b(C12510s c12510s) {
        return new C12509r(c12510s);
    }

    /* JADX INFO: renamed from: d */
    public void m33576d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = C11744X3.c.f26222z;
        }
        m33535i(m33529e(C11744X3.h.f26285a0, m33504a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: e */
    public void mo33424e() {
        m33535i(m33531f(C11744X3.h.f26306t));
    }

    /* JADX INFO: renamed from: g */
    public void m33578g(String str, String str2) {
        m33535i(m33529e(C11744X3.h.f26281W, m33504a(C11744X3.i.f26384p, str2, C11744X3.i.f26378m, str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: h */
    public C12386n8.c mo33427h() {
        return C12386n8.c.Web;
    }

    /* JADX INFO: renamed from: j */
    public void m33580j(String str) {
        m33535i(m33529e(C11744X3.f.f26252j, m33504a("errMsg", str, null, null, null, null, null, null, null, false)));
    }

    /* JADX INFO: renamed from: l */
    public void m33581l(String str) {
        m33535i(m33529e(C11744X3.h.f26309w, m33504a("action", str, null, null, null, null, null, null, null, false)));
    }

    /* JADX INFO: renamed from: o */
    public void m33583o(String str) {
        this.f32286x = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Logger.m33642i(this.f32264c, str + " " + str4);
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC11586Ng m33584p() {
        if (this.f32250Q == null) {
            this.f32250Q = new h();
        }
        return this.f32250Q;
    }

    /* JADX INFO: renamed from: r */
    public int m33586r() {
        return f32228e0;
    }

    /* JADX INFO: renamed from: s */
    public FrameLayout m33587s() {
        return this.f32284v;
    }

    /* JADX INFO: renamed from: t */
    public String m33588t() {
        return this.f32286x;
    }

    /* JADX INFO: renamed from: u */
    public C12123c1 m33589u() {
        return this.f32238E;
    }

    /* JADX INFO: renamed from: v */
    public v m33590v() {
        return this.f32285w;
    }

    /* JADX INFO: renamed from: w */
    public void m33591w() {
        if (this.f32272j == null) {
            return;
        }
        m33539o();
        C12386n8.e eVarM33597b = this.f32272j.m33597b();
        String strM33596a = this.f32272j.m33596a();
        if (m33542r(eVarM33597b.toString())) {
            m33556a(eVarM33597b, strM33596a);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m33592x() {
        this.f32280r.onHideCustomView();
    }

    /* JADX INFO: renamed from: y */
    public boolean m33593y() {
        return this.f32281s != null;
    }

    /* JADX INFO: renamed from: z */
    public void m33594z() {
        m33535i(m33531f(C11744X3.f.f26250h));
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$g */
    class g extends AbstractC11642R3 {
        g(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.AbstractC11642R3, com.ironsource.InterfaceC12457r7
        /* JADX INFO: renamed from: a */
        public void mo27321a(String str, JSONObject jSONObject) {
            C12513v c12513v = C12513v.this;
            if (c12513v.f32271i) {
                c12513v.m33582n(str);
            }
        }

        @Override // com.ironsource.AbstractC11642R3, com.ironsource.InterfaceC12457r7
        /* JADX INFO: renamed from: b */
        public void mo27324b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !C12513v.this.f32271i) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                C12513v.this.m33577e(jSONObject);
            } catch (JSONException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.AbstractC11642R3, com.ironsource.InterfaceC12457r7
        /* JADX INFO: renamed from: a */
        public void mo27320a() {
            C12513v c12513v = C12513v.this;
            if (c12513v.f32271i) {
                c12513v.m33582n("none");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m33507a(Context context, CountDownLatch countDownLatch) {
        try {
            try {
                this.f32263b0 = new C12150da(context, new InterfaceC12406oa.a());
                m33505a(context, this.f32263b0);
                this.f32263b0.setWebViewClient(new w());
                this.f32263b0.setWebChromeClient(this.f32280r);
                C11604Og.m26778a(this.f32263b0);
                m33509a(this.f32263b0);
                this.f32263b0.setDownloadListener(this);
            } catch (Exception e2) {
                this.f32251R.mo33362c("Failed to create WebView on UI thread");
                IronLog.INTERNAL.error("Failed to create WebView on UI thread", e2);
                C12317m4.m32153d().m32155a(e2);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m33539o() {
        InterfaceC11546Lc interfaceC11546Lc = this.f32265c0;
        if (interfaceC11546Lc != null) {
            interfaceC11546Lc.onCloseRequested();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public boolean m33542r(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.m33638d(this.f32264c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C12386n8.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(C12386n8.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C12386n8.e.Banner.toString()) || this.f32234A == null : this.f32287y == null) : this.f32288z != null) {
            z = true;
        }
        if (!z) {
            Logger.m33638d(this.f32264c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33419b() {
        if (this.f32257X) {
            this.f32256W.mo31847b();
            return;
        }
        this.f32236C.m33376a(new C12422p8());
        if (this.f32236C.m33381k()) {
            m33551a(1);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m33575c(String str, String str2) {
        String str3;
        try {
            str3 = str;
            try {
                m33535i(m33529e(C11744X3.h.f26302p, m33504a(C11744X3.i.f26356b, str3, "path", m33518b(str2), null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                C12317m4.m32153d().m32155a(exc);
                m33571b(str3, str2, exc.getMessage());
            }
        } catch (Exception e3) {
            e = e3;
            str3 = str;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m33579h(String str) {
        try {
            if (!new C11386Ce(str, C11802aa.m28151e().m28159d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().mo26172b()).m25583a()) {
                return false;
            }
            C12120bg.m31196a(m33585q(), str);
            return true;
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s */
    public class s {

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32325a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32326b;

            a(String str, String str2) {
                this.f32325a = str;
                this.f32326b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f32325a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(C12513v.this.f32264c, "onRVShowFail(message:" + this.f32325a + ")");
                C12513v.this.f32287y.mo26536b(this.f32326b, str);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32328a;

            b(String str) {
                this.f32328a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(C12513v.this.f32264c, "onInterstitialInitSuccess()");
                C12513v.this.f32288z.mo26518a(C12386n8.e.Interstitial, this.f32328a, (C12105b1) null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$c */
        class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32330a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32331b;

            c(String str, String str2) {
                this.f32330a = str;
                this.f32331b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f32330a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(C12513v.this.f32264c, "onInterstitialInitFail(message:" + str + ")");
                C12513v.this.f32288z.mo26519a(C12386n8.e.Interstitial, this.f32331b, str);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$d */
        class d implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC12436q4 f32333a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C12386n8.e f32334b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f32335c;

            d(InterfaceC12436q4 interfaceC12436q4, C12386n8.e eVar, String str) {
                this.f32333a = interfaceC12436q4;
                this.f32334b = eVar;
                this.f32335c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f32333a.mo26517a(this.f32334b, this.f32335c);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$e */
        class e implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32337a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ JSONObject f32338b;

            e(String str, JSONObject jSONObject) {
                this.f32337a = str;
                this.f32338b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12513v.this.f32288z.mo26527a(this.f32337a, this.f32338b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$f */
        class f implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32340a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32341b;

            f(String str, String str2) {
                this.f32340a = str;
                this.f32341b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f32340a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C12513v.this.f32288z.mo26523a(this.f32341b, str);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$g */
        class g implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32343a;

            g(String str) {
                this.f32343a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(C12513v.this.f32264c, "onBannerInitSuccess()");
                C12513v.this.f32234A.mo26518a(C12386n8.e.Banner, this.f32343a, (C12105b1) null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$h */
        class h implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32345a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32346b;

            h(String str, String str2) {
                this.f32345a = str;
                this.f32346b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f32345a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(C12513v.this.f32264c, "onBannerInitFail(message:" + str + ")");
                C12513v.this.f32234A.mo26519a(C12386n8.e.Banner, this.f32346b, str);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$i */
        class i implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32348a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C12166e8 f32349b;

            i(String str, C12166e8 c12166e8) {
                this.f32348a = str;
                this.f32349b = c12166e8;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(C12513v.this.f32264c, "onBannerLoadSuccess()");
                C12513v.this.f32234A.mo26522a(this.f32348a, this.f32349b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$j */
        class j implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32351a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32352b;

            j(String str, String str2) {
                this.f32351a = str;
                this.f32352b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(C12513v.this.f32264c, "onLoadBannerFail()");
                String str = this.f32351a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C12513v.this.f32234A.mo26541c(this.f32352b, str);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$k */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12513v.this.m33549I();
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$l */
        class l implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32355a;

            l(String str) {
                this.f32355a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f32355a).has(InterfaceC12497f.b.f32088b)) {
                        C12513v.this.f32254U.mo26765a(InterfaceC12497f.a.m33430a(this.f32355a));
                    } else {
                        C12513v.this.f32255V.mo26766a(C11491Ib.m26092a(this.f32355a));
                    }
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    Logger.m33640e(C12513v.this.f32264c, "failed to parse received message");
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$m */
        class m implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C12386n8.e f32357a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32358b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f32359c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ JSONObject f32360d;

            m(C12386n8.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f32357a = eVar;
                this.f32358b = str;
                this.f32359c = str2;
                this.f32360d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC12436q4 interfaceC12436q4M33498a;
                C12386n8.e eVar = this.f32357a;
                if ((eVar == C12386n8.e.Interstitial || eVar == C12386n8.e.RewardedVideo || eVar == C12386n8.e.Banner) && (interfaceC12436q4M33498a = C12513v.this.m33498a(eVar)) != null) {
                    interfaceC12436q4M33498a.mo26520a(this.f32357a, this.f32358b, this.f32359c, this.f32360d);
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$n */
        class n implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32362a;

            n(String str) {
                this.f32362a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.m33642i(C12513v.this.f32264c, "omidAPI(" + this.f32362a + ")");
                    C12513v.this.f32242I.m33470a(new C11720Vd(this.f32362a).toString(), s.this.new w());
                } catch (Exception e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.m33642i(C12513v.this.f32264c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$o */
        class o implements Runnable {
            o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12513v.this.m33545E();
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$p */
        class p implements Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12513v.this.f32263b0.removeJavascriptInterface(C11744X3.f26143e);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$q */
        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12513v.this.f32263b0.getSettings().setMixedContentMode(0);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$r */
        class r implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f32367a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32368b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C12105b1 f32369c;

            r(int i, String str, C12105b1 c12105b1) {
                this.f32367a = i;
                this.f32368b = str;
                this.f32369c = c12105b1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f32367a <= 0) {
                    C12513v.this.f32287y.mo26540c(this.f32368b);
                } else {
                    Log.d(C12513v.this.f32264c, "onRVInitSuccess()");
                    C12513v.this.f32287y.mo26518a(C12386n8.e.RewardedVideo, this.f32368b, this.f32369c);
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$s, reason: collision with other inner class name */
        class RunnableC15546s implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32371a;

            RunnableC15546s(String str) {
                this.f32371a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C12513v.this.f32247N.m33466a(new JSONObject(this.f32371a), s.this.new w());
                } catch (Exception e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(e.toString());
                    Logger.m33642i(C12513v.this.f32264c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$t */
        class t implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32373a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32374b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f32375c;

            t(String str, String str2, int i) {
                this.f32373a = str;
                this.f32374b = str2;
                this.f32375c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f32373a.equalsIgnoreCase(C12386n8.e.RewardedVideo.toString())) {
                    C12513v.this.f32287y.mo26521a(this.f32374b, this.f32375c);
                }
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$u */
        class u implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32377a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f32378b;

            u(String str, int i) {
                this.f32377a = str;
                this.f32378b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12513v.this.f32288z.onInterstitialAdRewarded(this.f32377a, this.f32378b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$v */
        class v implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f32380a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f32381b;

            v(String str, String str2) {
                this.f32380a = str;
                this.f32381b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f32380a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                Log.d(C12513v.this.f32264c, "onRVInitFail(message:" + str + ")");
                C12513v.this.f32287y.mo26519a(C12386n8.e.RewardedVideo, this.f32381b, str);
            }
        }

        public s() {
        }

        /* JADX INFO: renamed from: a */
        private void m33602a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", C12513v.this.f32236C.m33379f());
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                Logger.m33638d(C12513v.this.f32264c, "Unable to add controller source data into controllerConfig");
            }
        }

        /* JADX INFO: renamed from: b */
        private void m33606b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.m33340a().isEmpty()) {
                    return;
                }
                jSONObject.put(C11744X3.a.f26171h, new JSONArray((Collection) featuresManager.m33340a()));
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12547u8.m33895a(C11703Ud.f25977p, new C12422p8().m33061a(C11341A5.f23788A, e2.getMessage()).m33062a());
                Logger.m33638d(C12513v.this.f32264c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        /* JADX INFO: renamed from: c */
        private void m33608c(JSONObject jSONObject) {
            m33606b(jSONObject);
            m33603a(jSONObject, SDKUtils.getTesterParameters());
            if (C12513v.this.f32257X) {
                return;
            }
            m33602a(jSONObject);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m33618m(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "deleteFolder(" + str + ")");
                String strM27759d = new C11720Vd(str).m27759d("path");
                if (strM27759d == null) {
                    C12513v.this.m33515a(str, false, C11744X3.c.f26203g, "1");
                    return;
                }
                C12601x8 c12601x8 = new C12601x8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C12513v.this.f32235B, strM27759d));
                IronSourceStorageUtils.ensurePathSafety(c12601x8, C12513v.this.f32235B);
                if (!c12601x8.exists()) {
                    C12513v.this.m33515a(str, false, C11744X3.c.f26201e, "1");
                } else {
                    C12513v.this.m33515a(str, IronSourceStorageUtils.deleteFolder(c12601x8.getPath()), (String) null, (String) null);
                }
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12513v.this.m33515a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void m33619n(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "deviceDataAPI(" + str + ")");
                C12513v.this.f32245L.m33459a(new C11720Vd(str).toString(), new w());
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m33642i(C12513v.this.f32264c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void m33620o(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "dsSharedSignalsAPI(" + str + ")");
                C12513v.this.f32249P.m34039a(new C11720Vd(str).toString(), new w());
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m33642i(C12513v.this.f32264c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void m33621p(String str) {
            Logger.m33642i(C12513v.this.f32264c, "getCachedFilesMap(" + str + ")");
            String strM33528e = C12513v.this.m33528e(str);
            if (TextUtils.isEmpty(strM33528e)) {
                return;
            }
            C11720Vd c11720Vd = new C11720Vd(str);
            if (!c11720Vd.m27755a("path")) {
                C12513v.this.m33515a(str, false, C11744X3.c.f26215s, (String) null);
                return;
            }
            String str2 = (String) c11720Vd.m27756b("path");
            if (!IronSourceStorageUtils.isPathExist(C12513v.this.f32235B, str2)) {
                C12513v.this.m33515a(str, false, C11744X3.c.f26216t, (String) null);
                return;
            }
            C12513v.this.m33535i(C12513v.this.m33503a(strM33528e, IronSourceStorageUtils.getCachedFilesMap(C12513v.this.f32235B, str2), C11744X3.h.f26305s, C11744X3.h.f26304r));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0055  */
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void m33622q(String str) {
            Logger.m33642i(C12513v.this.f32264c, "getDeviceStatus(" + str + ")");
            String strM33528e = C12513v.this.m33528e(str);
            String strM33525d = C12513v.this.m33525d(str);
            C12513v c12513v = C12513v.this;
            Object[] objArrM33527d = c12513v.m33527d(c12513v.f32263b0.getContext());
            String str2 = (String) objArrM33527d[0];
            if (((Boolean) objArrM33527d[1]).booleanValue()) {
                if (TextUtils.isEmpty(strM33525d)) {
                    strM33528e = null;
                } else {
                    strM33528e = strM33525d;
                }
            } else if (TextUtils.isEmpty(strM33528e)) {
                strM33528e = null;
            }
            if (TextUtils.isEmpty(strM33528e)) {
                return;
            }
            C12513v.this.m33535i(C12513v.this.m33503a(strM33528e, str2, C11744X3.h.f26298l, C11744X3.h.f26299m));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void m33623r(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "iabTokenAPI(" + str + ")");
                C12513v.this.f32244K.m33493a(new C11720Vd(str).toString(), new w());
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m33642i(C12513v.this.f32264c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public /* synthetic */ void m33616k(String str) {
            try {
                InterfaceC12576w1 interfaceC12576w1M34000a = InterfaceC12576w1.CC.m34000a(str);
                C12513v c12513v = C12513v.this;
                C12540u1.a aVarM33853a = c12513v.f32248O.m33853a(c12513v.f32263b0.getContext(), interfaceC12576w1M34000a);
                C12513v.this.m33535i(C12513v.this.m33529e(aVarM33853a.m33861f(), aVarM33853a.m33864i().toString()));
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void m33624s(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "permissionsAPI(" + str + ")");
                C12513v.this.f32243J.m33478a(new C11720Vd(str).toString(), new w());
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m33642i(C12513v.this.f32264c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            Logger.m33642i(C12513v.this.f32264c, "adClicked(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d(C11744X3.i.f26378m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            C12386n8.e eVarM33534g = C12513v.this.m33534g(strM27759d);
            InterfaceC12436q4 interfaceC12436q4M33498a = C12513v.this.m33498a(eVarM33534g);
            if (eVarM33534g == null || interfaceC12436q4M33498a == null) {
                return;
            }
            C12513v.this.m33570b(new d(interfaceC12436q4M33498a, eVarM33534g, strFetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            Log.d(C12513v.this.f32266d, "adCredited(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d(C11744X3.i.f26374k);
            int i2 = strM27759d != null ? Integer.parseInt(strM27759d) : 0;
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            String strM27759d2 = c11720Vd.m27759d(C11744X3.i.f26378m);
            if (TextUtils.isEmpty(strM27759d2)) {
                Log.d(C12513v.this.f32266d, "adCredited | product type is missing");
            }
            if (C12386n8.e.Interstitial.toString().equalsIgnoreCase(strM27759d2)) {
                m33599a(strFetchDemandSourceId, i2);
            } else if (C12513v.this.m33542r(strM27759d2)) {
                C12513v.this.m33570b(new t(strM27759d2, strFetchDemandSourceId, i2));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            Logger.m33642i(C12513v.this.f32264c, "adUnitsReady(" + str + ")");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11720Vd(str));
            C12105b1 c12105b1 = new C12105b1(str);
            if (!c12105b1.m31122g()) {
                C12513v.this.m33515a(str, false, C11744X3.c.f26214r, (String) null);
                return;
            }
            C12513v.this.m33515a(str, true, (String) null, (String) null);
            String strM31118d = c12105b1.m31118d();
            if (C12386n8.e.RewardedVideo.toString().equalsIgnoreCase(strM31118d) && C12513v.this.m33542r(strM31118d)) {
                C12513v.this.m33570b(new r(Integer.parseInt(c12105b1.m31117c()), strFetchDemandSourceId, c12105b1));
            }
        }

        @JavascriptInterface
        public void adViewAPI(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33615j(str);
                }
            }, C11613P7.f25521l);
        }

        @JavascriptInterface
        public void androidSandboxApi(final String str) {
            C11613P7.f25510a.m27219b(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33616k(str);
                }
            });
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.m33642i(C12513v.this.f32264c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            C12386n8.e eVarM33534g;
            try {
                Logger.m33642i(C12513v.this.f32264c, "cleanAdInstance(" + str + ")");
                C11720Vd c11720Vd = new C11720Vd(str);
                String strM27759d = c11720Vd.m27759d(C11744X3.i.f26378m);
                String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
                if (TextUtils.isEmpty(strFetchDemandSourceId) || (eVarM33534g = C12513v.this.m33534g(strM27759d)) == null) {
                    return;
                }
                C12513v.this.f32241H.m27516b(eVarM33534g, strFetchDemandSourceId);
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12513v.this.m33515a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> arrayListM28153a = C11802aa.m28151e().m28153a();
                C11720Vd c11720Vd = new C11720Vd(str);
                if (!arrayListM28153a.isEmpty()) {
                    c11720Vd.m27757b(C11744X3.i.f26401x0, arrayListM28153a.toString());
                }
                C12513v.this.m33515a(c11720Vd.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12513v.this.m33515a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deleteFile(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33617l(str);
                }
            }, "deleteFile");
        }

        @JavascriptInterface
        public void deleteFolder(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33618m(str);
                }
            }, "deleteFolder");
        }

        @JavascriptInterface
        public void destroyInlineStore(String str) {
            Logger.m33642i(C12513v.this.f32264c, "destroyInlineStore() called");
            try {
                InterfaceC14637a.a aVarMo43174a = new C14638b().mo43174a(C12513v.this.m33585q(), EnumC12265j9.f30689b.m31871a(new C11720Vd(str).m27750a(C11744X3.f.f26247e, EnumC12265j9.APP_ACTIVITY.m31870b())));
                if (aVarMo43174a instanceof InterfaceC14637a.a.C15571a) {
                    C12513v.this.m33515a(str, false, ((InterfaceC14637a.a.C15571a) aVarMo43174a).m43179b(), (String) null);
                } else {
                    C12513v.this.m33515a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12513v.this.m33515a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33619n(str);
                }
            }, C11613P7.f25520k);
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            Logger.m33642i(C12513v.this.f32264c, "displayWebView(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
            C11720Vd c11720Vd = new C11720Vd(str);
            boolean zBooleanValue = ((Boolean) c11720Vd.m27756b("display")).booleanValue();
            String strM27759d = c11720Vd.m27759d(C11744X3.i.f26378m);
            boolean zM27758c = c11720Vd.m27758c(C11744X3.i.f26394u);
            String strM27759d2 = c11720Vd.m27759d("adViewId");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            boolean zM27758c2 = c11720Vd.m27758c(C11744X3.i.f26405z0);
            if (!zBooleanValue) {
                C12513v.this.m33563a(v.Gone);
                C12513v.this.m33539o();
                return;
            }
            C12513v.this.f32240G = c11720Vd.m27758c(C11744X3.i.f26396v);
            boolean zM27758c3 = c11720Vd.m27758c(C11744X3.i.f26402y);
            v vVarM33590v = C12513v.this.m33590v();
            v vVar = v.Display;
            if (vVarM33590v == vVar) {
                Logger.m33642i(C12513v.this.f32264c, "State: " + C12513v.this.f32285w);
                return;
            }
            C12513v.this.m33563a(vVar);
            Logger.m33642i(C12513v.this.f32264c, "State: " + C12513v.this.f32285w);
            Context contextM33585q = C12513v.this.m33585q();
            String strM33588t = C12513v.this.m33588t();
            int iMo27880L = C12513v.this.f32259Z.mo27880L(contextM33585q);
            if (zM27758c) {
                C12499h c12499h = new C12499h(contextM33585q);
                c12499h.addView(C12513v.this.f32284v);
                c12499h.m33456a(C12513v.this);
                return;
            }
            Intent intent = zM27758c3 ? new Intent(contextM33585q, (Class<?>) InterstitialActivity.class) : new Intent(contextM33585q, (Class<?>) ControllerActivity.class);
            C12386n8.e eVar = C12386n8.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strM27759d)) {
                if ("application".equals(strM33588t)) {
                    strM33588t = SDKUtils.translateRequestedOrientation(C12513v.this.f32259Z.mo27882N(contextM33585q));
                }
                intent.putExtra(C11744X3.i.f26378m, eVar.toString());
                C12513v.this.f32238E.m31212a(eVar.ordinal());
                C12513v.this.f32238E.m31228f(strFetchDemandSourceId);
                if (C12513v.this.m33542r(eVar.toString())) {
                    C12513v.this.f32287y.mo26539c(eVar, strFetchDemandSourceId);
                }
            } else {
                C12386n8.e eVar2 = C12386n8.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strM27759d)) {
                    if ("application".equals(strM33588t)) {
                        strM33588t = SDKUtils.translateRequestedOrientation(C12513v.this.f32259Z.mo27882N(contextM33585q));
                    }
                    intent.putExtra(C11744X3.i.f26378m, eVar2.toString());
                }
            }
            if (strM27759d2 != null) {
                intent.putExtra("adViewId", strM27759d2);
            }
            intent.putExtra(C11744X3.i.f26405z0, zM27758c2);
            intent.setFlags(536870912);
            intent.putExtra(C11744X3.i.f26396v, C12513v.this.f32240G);
            intent.putExtra(C11744X3.i.f26316A, strM33588t);
            intent.putExtra(C11744X3.i.f26318B, iMo27880L);
            C12513v c12513v = C12513v.this;
            c12513v.f32272j = new q(c12513v.m33534g(strM27759d), strFetchDemandSourceId);
            contextM33585q.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33620o(str);
                }
            }, C11613P7.f25515f);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            Logger.m33642i(C12513v.this.f32264c, "fileSystemAPI(" + str + ")");
            C12513v.this.m33566a(new RunnableC15546s(str));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x005c  */
        @JavascriptInterface
        public void getApplicationInfo(String str) {
            Logger.m33642i(C12513v.this.f32264c, "getApplicationInfo(" + str + ")");
            String strM33528e = C12513v.this.m33528e(str);
            String strM33525d = C12513v.this.m33525d(str);
            C11720Vd c11720Vd = new C11720Vd(str);
            Object[] objArrM33533f = C12513v.this.m33533f(c11720Vd.m27759d(C11744X3.i.f26378m), SDKUtils.fetchDemandSourceId(c11720Vd));
            String str2 = (String) objArrM33533f[0];
            if (((Boolean) objArrM33533f[1]).booleanValue()) {
                if (TextUtils.isEmpty(strM33525d)) {
                    strM33528e = null;
                } else {
                    strM33528e = strM33525d;
                }
            } else if (TextUtils.isEmpty(strM33528e)) {
                strM33528e = null;
            }
            if (TextUtils.isEmpty(strM33528e)) {
                return;
            }
            C12513v.this.m33535i(C12513v.this.m33503a(strM33528e, str2, C11744X3.h.f26300n, C11744X3.h.f26301o));
        }

        @JavascriptInterface
        public void getCachedFilesMap(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33621p(str);
                }
            }, C11613P7.f25518i);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String strM33529e;
            Logger.m33642i(C12513v.this.f32264c, "getConnectivityInfo(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d(C12513v.f32232i0);
            String strM27759d2 = c11720Vd.m27759d(C12513v.f32233j0);
            JSONObject jSONObject = new JSONObject();
            C12513v c12513v = C12513v.this;
            AbstractC11642R3 abstractC11642R3 = c12513v.f32252S;
            if (abstractC11642R3 != null) {
                jSONObject = abstractC11642R3.m27319a(c12513v.f32263b0.getContext());
            }
            if (jSONObject.length() > 0) {
                strM33529e = C12513v.this.m33529e(strM27759d, jSONObject.toString());
            } else {
                strM33529e = C12513v.this.m33529e(strM27759d2, C12513v.this.m33504a("errMsg", C11744X3.c.f26191A, null, null, null, null, null, null, null, false));
            }
            C12513v.this.m33535i(strM33529e);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            Logger.m33642i(C12513v.this.f32264c, "getControllerConfig(" + str + ")");
            String strM27759d = new C11720Vd(str).m27759d(C12513v.f32232i0);
            if (TextUtils.isEmpty(strM27759d)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            m33608c(controllerConfigAsJSONObject);
            C12513v.this.m33535i(C12513v.this.m33529e(strM27759d, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String strM33525d;
            Logger.m33642i(C12513v.this.f32264c, "getMediationState(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d("demandSourceName");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            String strM27759d2 = c11720Vd.m27759d(C11744X3.i.f26378m);
            if (strM27759d2 == null || strM27759d == null) {
                return;
            }
            try {
                C12386n8.e productType = SDKUtils.getProductType(strM27759d2);
                if (productType != null) {
                    C11660S4 c11660s4M27513a = C12513v.this.f32241H.m27513a(productType, strFetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C11744X3.i.f26378m, strM27759d2);
                    jSONObject.put("demandSourceName", strM27759d);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (c11660s4M27513a == null || c11660s4M27513a.m27438a(-1)) {
                        strM33525d = C12513v.this.m33525d(str);
                    } else {
                        strM33525d = C12513v.this.m33528e(str);
                        jSONObject.put("state", c11660s4M27513a.m27449j());
                    }
                    m33600a(strM33525d, jSONObject.toString());
                }
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12513v.this.m33515a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getDeviceStatus(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33622q(str);
                }
            }, C11613P7.f25513d);
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            Logger.m33642i(C12513v.this.f32264c, "getDeviceVolume(" + str + ")");
            try {
                Context context = C12513v.this.f32263b0.getContext();
                float fM27795a = C11728W4.m27793b(context).m27795a(context);
                C11720Vd c11720Vd = new C11720Vd(str);
                c11720Vd.m27757b(C11744X3.j.f26422P, String.valueOf(fM27795a));
                C12513v.this.m33515a(c11720Vd.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            Logger.m33642i(C12513v.this.f32264c, "getInitSummery(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            c11720Vd.m27754a(C11744X3.j.f26469s0, C12513v.this.f32253T);
            C12513v.this.m33515a(c11720Vd.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            C12547u8.m33895a(C11703Ud.f25987z, new C12422p8().m33061a(C11341A5.f23834y, str).m33062a());
            String strM33528e = C12513v.this.m33528e(str);
            String string = SDKUtils.getOrientation(C12513v.this.f32263b0.getContext()).toString();
            if (TextUtils.isEmpty(strM33528e)) {
                return;
            }
            C12513v.this.m33535i(C12513v.this.m33503a(strM33528e, string, C11744X3.h.f26282X, C11744X3.h.f26283Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            Logger.m33642i(C12513v.this.f32264c, "getUserData(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            if (!c11720Vd.m27755a("key")) {
                C12513v.this.m33515a(str, false, C11744X3.c.f26196F, (String) null);
                return;
            }
            String strM33528e = C12513v.this.m33528e(str);
            String strM27759d = c11720Vd.m27759d("key");
            C12513v.this.m33535i(C12513v.this.m33529e(strM33528e, C12513v.this.m33504a(strM27759d, C11802aa.m28151e().m28152a(strM27759d), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33623r(str);
                }
            }, C11613P7.f25514e);
        }

        @JavascriptInterface
        public void initController(String str) {
            Logger.m33642i(C12513v.this.f32264c, "initController(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            CountDownTimer countDownTimer = C12513v.this.f32275m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                C12513v.this.f32275m = null;
            }
            if (c11720Vd.m27755a(C11744X3.i.f26386q)) {
                String strM27759d = c11720Vd.m27759d(C11744X3.i.f26386q);
                if (C11744X3.i.f26390s.equalsIgnoreCase(strM27759d)) {
                    C12513v c12513v = C12513v.this;
                    c12513v.f32271i = true;
                    c12513v.f32251R.mo33363d();
                } else {
                    if (C11744X3.i.f26388r.equalsIgnoreCase(strM27759d)) {
                        C12513v.this.f32251R.mo33361c();
                        return;
                    }
                    if (!C11744X3.i.f26392t.equalsIgnoreCase(strM27759d)) {
                        Logger.m33642i(C12513v.this.f32264c, "No STAGE mentioned! should not get here!");
                        return;
                    }
                    String strM27759d2 = c11720Vd.m27759d("errMsg");
                    C12513v.this.f32251R.mo33362c("controller js failed to initialize : " + strM27759d2);
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            C12513v.this.m33573c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onAdWindowsClosed(" + str + ")");
            C12513v.this.f32238E.m31211a();
            C12513v.this.f32238E.m31228f(null);
            C12513v.this.f32272j = null;
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d(C11744X3.i.f26378m);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            C12386n8.e eVarM33534g = C12513v.this.m33534g(strM27759d);
            Log.d(C12513v.this.f32266d, "onAdClosed() with type " + eVarM33534g);
            if (C12513v.this.m33542r(strM27759d)) {
                C12513v.this.m33556a(eVarM33534g, strFetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onGetApplicationInfoFail(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onGetApplicationInfoSuccess(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onGetCachedFilesMapFail(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onGetCachedFilesMapSuccess(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onGetDeviceStatusFail(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onGetDeviceStatusSuccess(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onInitBannerFail(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m33642i(C12513v.this.f32264c, "onInitBannerFail failed with no demand source");
                return;
            }
            C11677T4 c11677t4 = C12513v.this.f32241H;
            C12386n8.e eVar = C12386n8.e.Banner;
            C11660S4 c11660s4M27513a = c11677t4.m27513a(eVar, strFetchDemandSourceId);
            if (c11660s4M27513a != null) {
                c11660s4M27513a.m27440b(3);
            }
            if (C12513v.this.m33542r(eVar.toString())) {
                C12513v.this.m33570b(new h(strM27759d, strFetchDemandSourceId));
            }
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onInitBannerSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11720Vd(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m33642i(C12513v.this.f32264c, "onInitBannerSuccess failed with no demand source");
            } else if (C12513v.this.m33542r(C12386n8.e.Banner.toString())) {
                C12513v.this.m33570b(new g(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onInitInterstitialFail(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m33642i(C12513v.this.f32264c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            C11677T4 c11677t4 = C12513v.this.f32241H;
            C12386n8.e eVar = C12386n8.e.Interstitial;
            C11660S4 c11660s4M27513a = c11677t4.m27513a(eVar, strFetchDemandSourceId);
            if (c11660s4M27513a != null) {
                c11660s4M27513a.m27440b(3);
            }
            if (C12513v.this.m33542r(eVar.toString())) {
                C12513v.this.m33570b(new c(strM27759d, strFetchDemandSourceId));
            }
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onInitInterstitialSuccess()");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11720Vd(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m33642i(C12513v.this.f32264c, "onInitInterstitialSuccess failed with no demand source");
            } else if (C12513v.this.m33542r(C12386n8.e.Interstitial.toString())) {
                C12513v.this.m33570b(new b(strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onInitRewardedVideoFail(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            C11677T4 c11677t4 = C12513v.this.f32241H;
            C12386n8.e eVar = C12386n8.e.RewardedVideo;
            C11660S4 c11660s4M27513a = c11677t4.m27513a(eVar, strFetchDemandSourceId);
            if (c11660s4M27513a != null) {
                c11660s4M27513a.m27440b(3);
            }
            if (C12513v.this.m33542r(eVar.toString())) {
                C12513v.this.m33570b(new v(strM27759d, strFetchDemandSourceId));
            }
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onLoadBannerFail()");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            C12513v.this.m33515a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(strFetchDemandSourceId) && C12513v.this.m33542r(C12386n8.e.Banner.toString())) {
                C12513v.this.m33570b(new j(strM27759d, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onLoadBannerSuccess()");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            String strM27759d = c11720Vd.m27759d("adViewId");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
            InterfaceC11434F8 interfaceC11434F8Mo31278a = C12282k8.m31929a().mo31278a(strM27759d);
            if (interfaceC11434F8Mo31278a == null) {
                C12513v.this.f32234A.mo26541c(strFetchDemandSourceId, "not found view for the current adViewId= " + strM27759d);
                return;
            }
            if (interfaceC11434F8Mo31278a instanceof C12166e8) {
                C12166e8 c12166e8 = (C12166e8) interfaceC11434F8Mo31278a;
                if (C12513v.this.m33542r(C12386n8.e.Banner.toString())) {
                    C12513v.this.m33570b(new i(strFetchDemandSourceId, c12166e8));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onLoadInterstitialFail(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            C12513v.this.m33515a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            m33601a(strFetchDemandSourceId, false);
            if (C12513v.this.m33542r(C12386n8.e.Interstitial.toString())) {
                C12513v.this.m33570b(new f(strM27759d, strFetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onLoadInterstitialSuccess(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            JSONObject jSONObjectM27753a = c11720Vd.m27753a();
            m33601a(strFetchDemandSourceId, true);
            C12513v.this.m33515a(str, true, (String) null, (String) null);
            if (C12513v.this.m33542r(C12386n8.e.Interstitial.toString())) {
                C12513v.this.m33570b(new e(strFetchDemandSourceId, jSONObjectM27753a));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onReceivedMessage(" + str + ")");
            C11613P7.f25510a.m27219b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onShowInterstitialFail(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            final String strM27759d = c11720Vd.m27759d("errMsg");
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            C12513v.this.m33515a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            final boolean zM33542r = C12513v.this.m33542r(C12386n8.e.Interstitial.toString());
            C12513v.this.m33570b(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33605a(zM33542r, strM27759d, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onShowInterstitialSuccess(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
            final String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C11720Vd(str));
            if (TextUtils.isEmpty(strFetchDemandSourceId)) {
                Logger.m33642i(C12513v.this.f32264c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C12123c1 c12123c1 = C12513v.this.f32238E;
            C12386n8.e eVar = C12386n8.e.Interstitial;
            c12123c1.m31212a(eVar.ordinal());
            C12513v.this.f32238E.m31228f(strFetchDemandSourceId);
            final boolean zM33542r = C12513v.this.m33542r(eVar.toString());
            C12513v.this.m33570b(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33604a(zM33542r, strFetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onShowRewardedVideoFail(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d("errMsg");
            String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
            if (C12513v.this.m33542r(C12386n8.e.RewardedVideo.toString())) {
                C12513v.this.m33570b(new a(strM27759d, strFetchDemandSourceId));
            }
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onShowRewardedVideoSuccess(" + str + ")");
            C12513v.this.m33515a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            Log.d(C12513v.this.f32264c, "onVideoStatusChanged(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d(C11744X3.i.f26378m);
            if (C12513v.this.f32237D == null || TextUtils.isEmpty(strM27759d)) {
                return;
            }
            String strM27759d2 = c11720Vd.m27759d("status");
            if (C11744X3.i.f26361d0.equalsIgnoreCase(strM27759d2)) {
                C12513v.this.f32237D.onVideoStarted();
                return;
            }
            if (C11744X3.i.f26363e0.equalsIgnoreCase(strM27759d2)) {
                C12513v.this.f32237D.onVideoPaused();
                return;
            }
            if (C11744X3.i.f26365f0.equalsIgnoreCase(strM27759d2)) {
                C12513v.this.f32237D.onVideoResumed();
                return;
            }
            if (C11744X3.i.f26367g0.equalsIgnoreCase(strM27759d2)) {
                C12513v.this.f32237D.onVideoEnded();
                return;
            }
            if (C11744X3.i.f26369h0.equalsIgnoreCase(strM27759d2)) {
                C12513v.this.f32237D.onVideoStopped();
                return;
            }
            Logger.m33642i(C12513v.this.f32264c, "onVideoStatusChanged: unknown status: " + strM27759d2);
        }

        @JavascriptInterface
        public void openInlineStore(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "openInlineStore(" + str + ")");
                C11720Vd c11720Vd = new C11720Vd(str);
                InterfaceC14637a.a aVarMo43173a = new C14638b().mo43173a(C12513v.this.m33585q(), new C12229h9(c11720Vd.m27759d("url"), c11720Vd.m27759d(C11744X3.f.f26245c), EnumC12265j9.f30689b.m31871a(c11720Vd.m27750a(C11744X3.f.f26247e, EnumC12265j9.APP_ACTIVITY.m31870b())), (!c11720Vd.m27755a(C11744X3.f.f26246d) || c11720Vd.m27760e(C11744X3.f.f26246d)) ? null : (JSONObject) c11720Vd.m27756b(C11744X3.f.f26246d)));
                if (aVarMo43173a instanceof InterfaceC14637a.a.C15571a) {
                    C12513v.this.m33515a(str, false, ((InterfaceC14637a.a.C15571a) aVarMo43173a).m43179b(), (String) null);
                } else {
                    C12513v.this.m33515a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12513v.this.m33515a(str, false, e2.getLocalizedMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "openUrl(" + str + ")");
                C11720Vd c11720Vd = new C11720Vd(str);
                InterfaceC12507p.c cVarMo33471a = new InterfaceC12507p.a(c11720Vd.m27759d("method"), new C11582Nc(C12513v.this.f32240G, 805306368)).mo33471a(c11720Vd.m27758c(C11744X3.i.f26339L0) ? C12513v.this.f32263b0.getContext() : C12513v.this.m33585q(), new C11564Mc(c11720Vd.m27759d("url"), c11720Vd.m27759d("package_name")));
                if (cVarMo33471a instanceof InterfaceC12507p.c.a) {
                    C12513v.this.m33515a(str, false, ((InterfaceC12507p.c.a) cVarMo33471a).m33476b(), (String) null);
                } else {
                    C12513v.this.m33515a(str, true, (String) null, (String) null);
                }
            } catch (Exception e2) {
                C12513v.this.m33515a(str, false, e2.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            C12513v.this.m33573c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(final String str) {
            C12513v.this.f32260a.m27217a(new Runnable() { // from class: com.ironsource.sdk.controller.v$s$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m33624s(str);
                }
            }, C11613P7.f25519j);
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            Exception exc;
            String str2;
            try {
                Logger.m33642i(C12513v.this.f32264c, "postAdEventNotification(" + str + ")");
                C11720Vd c11720Vd = new C11720Vd(str);
                String strM27759d = c11720Vd.m27759d(C11744X3.i.f26373j0);
                try {
                    if (TextUtils.isEmpty(strM27759d)) {
                        C12513v.this.m33515a(str, false, C11744X3.c.f26219w, (String) null);
                        return;
                    }
                    String strM27759d2 = c11720Vd.m27759d(C11744X3.i.f26375k0);
                    String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(c11720Vd);
                    String str3 = !TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strM27759d2;
                    JSONObject jSONObject = (JSONObject) c11720Vd.m27756b(C11744X3.i.f26377l0);
                    String strM27759d3 = c11720Vd.m27759d(C11744X3.i.f26378m);
                    C12386n8.e eVarM33534g = C12513v.this.m33534g(strM27759d3);
                    try {
                        if (!C12513v.this.m33542r(strM27759d3)) {
                            C12513v.this.m33515a(str, false, C11744X3.c.f26218v, (String) null);
                            return;
                        }
                        String strM33528e = C12513v.this.m33528e(str);
                        if (TextUtils.isEmpty(strM33528e)) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            C12513v.this.m33535i(C12513v.this.m33503a(strM33528e, C12513v.this.m33504a(C11744X3.i.f26378m, strM27759d3, C11744X3.i.f26373j0, strM27759d, "demandSourceName", strM27759d2, "demandSourceId", str2, null, false), C11744X3.h.f26287c0, C11744X3.h.f26289d0));
                        }
                        try {
                            C12513v.this.m33570b(new m(eVarM33534g, str2, strM27759d, jSONObject));
                            return;
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    exc = e4;
                }
            } catch (Exception e5) {
                e = e5;
            }
            exc = e;
            C12317m4.m32153d().m32155a(exc);
            IronLog.INTERNAL.error(exc.toString());
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            Logger.m33642i(C12513v.this.f32264c, "removeCloseEventHandler(" + str + ")");
            CountDownTimer countDownTimer = C12513v.this.f32274l;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            C12513v.this.f32273k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            C12513v.this.m33573c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.m33642i(C12513v.this.f32264c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            C12513v.this.m33573c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "saveFile(" + str + ")");
                C11720Vd c11720Vd = new C11720Vd(str);
                String strM27759d = c11720Vd.m27759d("path");
                String strM27759d2 = c11720Vd.m27759d(C11744X3.i.f26356b);
                if (TextUtils.isEmpty(strM27759d2)) {
                    C12513v.this.m33515a(str, false, C11744X3.c.f26203g, "1");
                    return;
                }
                C12601x8 c12601x8 = new C12601x8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C12513v.this.f32235B, strM27759d), SDKUtils.getFileName(strM27759d2));
                IronSourceStorageUtils.ensurePathSafety(c12601x8, C12513v.this.f32235B);
                C12513v c12513v = C12513v.this;
                if (c12513v.f32259Z.mo27884a(c12513v.f32235B) <= 0) {
                    C12513v.this.m33515a(str, false, C11778Z3.f26656A, (String) null);
                    return;
                }
                if (c12601x8.exists()) {
                    C12513v.this.m33515a(str, false, C11778Z3.f26689z, (String) null);
                    return;
                }
                if (!C11676T3.m27507h(C12513v.this.f32263b0.getContext())) {
                    C12513v.this.m33515a(str, false, C11778Z3.f26658C, (String) null);
                    return;
                }
                C12513v.this.m33515a(str, true, (String) null, (String) null);
                C12513v.this.f32270h.mo31291a(c12601x8, strM27759d2, c11720Vd.m27750a("connectionTimeout", 0), c11720Vd.m27750a("readTimeout", 0));
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12513v.this.m33515a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.m33642i(C12513v.this.f32264c, "setBackButtonState(" + str + ")");
            C11802aa.m28151e().m28158c(new C11720Vd(str).m27759d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            Logger.m33642i(C12513v.this.f32264c, "setForceClose(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            String strM27759d = c11720Vd.m27759d("width");
            String strM27759d2 = c11720Vd.m27759d("height");
            C12513v.this.f32277o = Integer.parseInt(strM27759d);
            C12513v.this.f32278p = Integer.parseInt(strM27759d2);
            C12513v.this.f32279q = c11720Vd.m27759d(C11744X3.i.f26338L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            Logger.m33642i(C12513v.this.f32264c, "setMixedContentAlwaysAllow(" + str + ")");
            C12513v.this.m33573c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "setOrientation(" + str + ")");
                String strM27759d = new C11720Vd(str).m27759d("orientation");
                C12513v.this.m33583o(strM27759d);
                C12513v c12513v = C12513v.this;
                if (c12513v.f32265c0 != null) {
                    C12513v.this.f32265c0.onOrientationChanged(strM27759d, c12513v.f32259Z.mo27880L(c12513v.f32263b0.getContext()));
                }
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.m33642i(C12513v.this.f32264c, "setStoreSearchKeys(" + str + ")");
            C11802aa.m28151e().m28161e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            Logger.m33642i(C12513v.this.f32264c, "setUserData(" + str + ")");
            C11720Vd c11720Vd = new C11720Vd(str);
            if (!c11720Vd.m27755a("key")) {
                C12513v.this.m33515a(str, false, C11744X3.c.f26196F, (String) null);
                return;
            }
            if (!c11720Vd.m27755a("value")) {
                C12513v.this.m33515a(str, false, C11744X3.c.f26197G, (String) null);
                return;
            }
            String strM27759d = c11720Vd.m27759d("key");
            String strM27759d2 = c11720Vd.m27759d("value");
            C11802aa.m28151e().m28154a(strM27759d, strM27759d2);
            C12513v.this.m33535i(C12513v.this.m33529e(C12513v.this.m33528e(str), C12513v.this.m33504a(strM27759d, strM27759d2, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            Logger.m33642i(C12513v.this.f32264c, "setWebviewBackgroundColor(" + str + ")");
            C12513v.this.m33541q(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            Logger.m33642i(C12513v.this.f32264c, "stillAlive(" + str + ")");
            C12513v.this.f32262b.mo31424a();
        }

        /* JADX INFO: renamed from: u */
        void m33627u(String str) {
            C12513v.this.m33535i(C12513v.this.m33503a(C11744X3.h.f26288d, str, (String) null, (String) null));
        }

        /* JADX INFO: renamed from: v */
        void m33628v(String str) {
            C12513v.this.m33535i(C12513v.this.m33503a(C11744X3.h.f26290e, str, (String) null, (String) null));
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$s$w */
        public class w implements InterfaceC12284ka {
            public w() {
            }

            @Override // com.ironsource.InterfaceC12284ka
            /* JADX INFO: renamed from: a */
            public void mo31939a(boolean z, String str, String str2) {
                C11720Vd c11720Vd = new C11720Vd();
                c11720Vd.m27757b(z ? C12513v.f32232i0 : C12513v.f32233j0, str);
                c11720Vd.m27757b("data", str2);
                C12513v.this.m33515a(c11720Vd.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC12284ka
            /* JADX INFO: renamed from: a */
            public void mo31938a(boolean z, String str, C11720Vd c11720Vd) {
                c11720Vd.m27757b(z ? C12513v.f32232i0 : C12513v.f32233j0, str);
                C12513v.this.m33515a(c11720Vd.toString(), z, (String) null, (String) null);
            }

            @Override // com.ironsource.InterfaceC12284ka
            /* JADX INFO: renamed from: a */
            public void mo31940a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                try {
                    if (z) {
                        str2 = C12513v.f32232i0;
                    } else {
                        str2 = C12513v.f32233j0;
                    }
                    jSONObject.put(str2, str);
                    C12513v.this.m33515a(jSONObject.toString(), z, (String) null, (String) null);
                } catch (JSONException e) {
                    C12317m4.m32153d().m32155a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m33603a(JSONObject jSONObject, String str) {
            if (m33626b(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e2) {
                    C12317m4.m32153d().m32155a(e2);
                    Logger.m33638d(C12513v.this.f32264c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m33617l(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "deleteFile(" + str + ")");
                C11720Vd c11720Vd = new C11720Vd(str);
                String strM27759d = c11720Vd.m27759d(C11744X3.i.f26356b);
                String strM27759d2 = c11720Vd.m27759d("path");
                if (strM27759d2 != null && !TextUtils.isEmpty(strM27759d)) {
                    C12601x8 c12601x8 = new C12601x8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C12513v.this.f32235B, strM27759d2), strM27759d);
                    IronSourceStorageUtils.ensurePathSafety(c12601x8, C12513v.this.f32235B);
                    if (!c12601x8.exists()) {
                        C12513v.this.m33515a(str, false, C11744X3.c.f26202f, "1");
                        return;
                    } else {
                        C12513v.this.m33515a(str, IronSourceStorageUtils.deleteFile(c12601x8), (String) null, (String) null);
                        return;
                    }
                }
                C12513v.this.m33515a(str, false, C11744X3.c.f26203g, "1");
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                C12513v.this.m33515a(str, false, e2.getMessage(), (String) null);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX INFO: renamed from: a */
        private void m33600a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C12513v.this.m33535i(C12513v.this.m33529e(str, str2));
        }

        /* JADX INFO: renamed from: a */
        private void m33599a(String str, int i2) {
            C11660S4 c11660s4M27513a;
            C12513v c12513v = C12513v.this;
            C12386n8.e eVar = C12386n8.e.Interstitial;
            if (c12513v.m33542r(eVar.toString()) && (c11660s4M27513a = C12513v.this.f32241H.m27513a(eVar, str)) != null && c11660s4M27513a.m27450k()) {
                C12513v.this.m33570b(new u(str, i2));
            }
        }

        /* JADX INFO: renamed from: b */
        boolean m33626b(String str) {
            if (TextUtils.isEmpty(str) || str.contains(C11794a2.f26725f)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return (jSONObject.getString("testerABGroup").isEmpty() || jSONObject.getString("testFriendlyName").isEmpty()) ? false : true;
            } catch (JSONException e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m33604a(boolean z, String str) {
            if (z) {
                C12513v.this.f32288z.mo26539c(C12386n8.e.Interstitial, str);
                C12513v.this.f32288z.mo26535b(str);
            }
            m33601a(str, false);
        }

        /* JADX INFO: renamed from: a */
        private void m33601a(String str, boolean z) {
            C11660S4 c11660s4M27513a = C12513v.this.f32241H.m27513a(C12386n8.e.Interstitial, str);
            if (c11660s4M27513a != null) {
                c11660s4M27513a.m27437a(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m33605a(boolean z, String str, String str2) {
            if (z) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                C12513v.this.f32288z.mo26544d(str2, str);
            }
            m33601a(str2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void m33615j(String str) {
            try {
                Logger.m33642i(C12513v.this.f32264c, "adViewAPI(" + str + ")");
                C12513v.this.f32246M.m33356a(new C11720Vd(str).toString(), new w());
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error(e2.toString());
                Logger.m33642i(C12513v.this.f32264c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public String m33528e(String str) {
        return new C11720Vd(str).m27759d(f32232i0);
    }

    /* JADX INFO: renamed from: e */
    public void m33577e(JSONObject jSONObject) {
        Logger.m33642i(this.f32264c, "device connection info changed: " + jSONObject.toString());
        m33535i(m33529e(C11744X3.h.f26311y, m33504a(C11744X3.j.f26447h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    /* JADX INFO: renamed from: n */
    public void m33582n(String str) {
        try {
            String strM27579d = C11693U3.m27579d(this.f32263b0.getContext());
            Logger.m33642i(this.f32264c, "device status changed, connection type " + str);
            C12476s8.m33296a(str);
            C12476s8.m33297b(strM27579d);
            try {
                m33535i(m33529e(C11744X3.h.f26310x, m33504a("connectionType", str, "rawConnectionType", strM27579d, null, null, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                C12317m4.m32153d().m32155a(exc);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(exc));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m33569b(int i2) {
        f32228e0 = i2;
    }

    /* JADX INFO: renamed from: p */
    private void m33540p(String str) {
        if (str.equalsIgnoreCase("0")) {
            this.f32263b0.getSettings().setCacheMode(2);
        } else {
            this.f32263b0.getSettings().setCacheMode(-1);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33422b(C11660S4 c11660s4, Map<String, String> map, InterfaceC12472s4 interfaceC12472s4) {
        m33510a(c11660s4, map);
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33421b(C11660S4 c11660s4) {
        Map<String, String> mapM27439b = c11660s4.m27439b();
        if (mapM27439b != null) {
            m33535i(m33529e(C11744X3.h.f26278T, SDKUtils.flatMapToJsonAsString(mapM27439b)));
        }
        this.f32241H.m27516b(C12386n8.e.Interstitial, c11660s4.m27447h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public C12386n8.e m33534g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C12386n8.e eVar = C12386n8.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        C12386n8.e eVar2 = C12386n8.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        C12386n8.e eVar3 = C12386n8.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public Context m33585q() {
        return this.f32261a0.m28105a();
    }

    /* JADX INFO: renamed from: d */
    private String m33526d(JSONObject jSONObject) {
        C11728W4 c11728w4M27793b = C11728W4.m27793b(this.f32263b0.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=");
            sb.append(sDKVersion);
            sb.append(C11744X3.j.f26436c);
        }
        String strM27800e = c11728w4M27793b.m27800e();
        if (!TextUtils.isEmpty(strM27800e)) {
            sb.append("deviceOs=");
            sb.append(strM27800e);
        }
        Uri uri = Uri.parse(SDKUtils.getControllerUrl());
        if (uri != null) {
            String str = uri.getScheme() + CertificateUtil.DELIMITER;
            String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + CertificateUtil.DELIMITER + port;
            }
            sb.append("&protocol=");
            sb.append(str);
            sb.append("&domain=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String string = new JSONObject(jSONObject, new String[]{C11744X3.j.f26432Z, C11744X3.j.f26444g}).toString();
                    if (!TextUtils.isEmpty(string)) {
                        sb.append(C11744X3.j.f26436c);
                        sb.append("controllerConfig");
                        sb.append(C11744X3.j.f26434b);
                        sb.append(string);
                    }
                } catch (JSONException e2) {
                    C12317m4.m32153d().m32155a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
            sb.append("&debug=");
            sb.append(m33586r());
            boolean featureFlagLoadControllerAndPlayerFromBundle = FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle();
            boolean zM31352b = C12162e4.m31352b(this.f32263b0.getContext());
            if (featureFlagLoadControllerAndPlayerFromBundle && zM31352b) {
                sb.append("&chfb=true");
                IronLog.INTERNAL.verbose("controller html was loaded from bundle, setting in html params");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private void m33522c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), C11753Xc.m27956e(this.f32263b0.getContext()));
        jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26463p0), SDKUtils.encodeString(C11753Xc.m27953b(this.f32263b0.getContext())));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33423b(JSONObject jSONObject) {
        m33535i(m33529e(C11744X3.h.f26291e0, jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: g */
    public void mo33426g() {
        m33535i(m33531f(C11744X3.h.f26307u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m33530e(Context context) {
        try {
            AbstractC11642R3 abstractC11642R3 = this.f32252S;
            if (abstractC11642R3 == null) {
                return;
            }
            abstractC11642R3.m27323b(context);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33509a(WebView webView) {
        C12510s c12510s = new C12510s(C12510s.m33481a());
        webView.addJavascriptInterface(m33550a(c12510s), C11744X3.f26142d);
        webView.addJavascriptInterface(m33568b(c12510s), C11744X3.f26143e);
    }

    /* JADX INFO: renamed from: b */
    private String m33518b(String str) {
        String str2 = this.f32235B + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: b */
    public void m33571b(String str, String str2, String str3) {
        try {
            try {
                m33535i(m33529e(C11744X3.h.f26303q, m33504a(C11744X3.i.f26356b, str, "path", m33518b(str2), "errMsg", str3, null, null, null, false)));
            } catch (Exception e2) {
                e = e2;
                C12317m4.m32153d().m32155a(e);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m33523c(C12601x8 c12601x8) {
        int iSaveFile;
        boolean zCopyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.f32263b0.getContext(), c12601x8);
        if (!zCopyFileFromBundleToStorage) {
            return false;
        }
        byte[] bArrM31350a = C12162e4.m31350a(this.f32263b0.getContext(), C11744X3.f26145g);
        String strM31347a = C12162e4.m31347a(this.f32263b0.getContext());
        if (strM31347a == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c12601x8.getParent());
        String str = File.separator;
        sb.append(str);
        sb.append("controller_");
        sb.append(strM31347a);
        sb.append(str);
        sb.append(C11744X3.f26145g);
        String string = sb.toString();
        if (bArrM31350a == null || bArrM31350a.length == 0) {
            return zCopyFileFromBundleToStorage;
        }
        try {
            iSaveFile = IronSourceStorageUtils.saveFile(bArrM31350a, string);
        } catch (Exception e2) {
            IronLog.INTERNAL.error("exception: " + e2.getMessage());
            zCopyFileFromBundleToStorage = false;
            iSaveFile = 0;
        }
        if (iSaveFile != 0) {
            return zCopyFileFromBundleToStorage;
        }
        IronLog.INTERNAL.verbose("failed to read bytes for " + c12601x8.getName());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public String m33529e(String str, String str2) {
        return new InterfaceC12504m.a(str, str2).mo33467a();
    }

    /* JADX INFO: renamed from: a */
    C12498g m33550a(C12510s c12510s) {
        return new C12498g(new C12493b(new s()), c12510s);
    }

    /* JADX INFO: renamed from: a */
    public void m33560a(C12506o c12506o) {
        this.f32242I = c12506o;
    }

    /* JADX INFO: renamed from: a */
    public void m33561a(C12508q c12508q) {
        this.f32243J = c12508q;
    }

    /* JADX INFO: renamed from: a */
    public void m33562a(C12512u c12512u) {
        this.f32244K = c12512u;
    }

    /* JADX INFO: renamed from: a */
    public void m33558a(C12500i c12500i) {
        this.f32245L = c12500i;
    }

    /* JADX INFO: renamed from: a */
    public void m33557a(C12492a c12492a) {
        this.f32246M = c12492a;
        c12492a.m33355a(m33584p());
    }

    /* JADX INFO: renamed from: a */
    public void m33559a(C12501j c12501j) {
        this.f32247N = c12501j;
    }

    /* JADX INFO: renamed from: b */
    public void m33572b(boolean z, String str) {
        m33535i(m33529e(C11744X3.h.f26280V, m33504a(C11744X3.i.f26336K, str, null, null, null, null, null, null, C11744X3.i.f26382o, z)));
    }

    /* JADX INFO: renamed from: a */
    public void m33564a(C12540u1 c12540u1) {
        this.f32248O = c12540u1;
    }

    /* JADX INFO: renamed from: a */
    private void m33505a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f32284v = new FrameLayout(context);
        this.f32282t = new FrameLayout(context);
        this.f32282t.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f32282t.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f32284v.addView(this.f32282t, layoutParams);
        this.f32284v.addView(frameLayout);
    }

    /* JADX INFO: renamed from: b */
    private String m33519b(String str, String str2) {
        return m33502a(str, str2, "errMsg");
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: b */
    public void mo33420b(Context context) {
        m33566a(new d(context));
    }

    /* JADX INFO: renamed from: b */
    void m33570b(Runnable runnable) {
        C11613P7 c11613p7 = this.f32260a;
        if (c11613p7 != null) {
            c11613p7.m27221c(runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m33574c(String str) {
        if (str.equals(C11744X3.i.f26370i)) {
            m33539o();
        }
        m33535i(m33529e(C11744X3.h.f26312z, m33504a("action", str, null, null, null, null, null, null, null, false)));
    }

    /* JADX INFO: renamed from: a */
    private void m33508a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    /* JADX INFO: renamed from: c */
    private String m33521c(String str, String str2, String str3) {
        return new InterfaceC12504m.a(str, null, str2, str3).mo33467a();
    }

    /* JADX INFO: renamed from: a */
    public void m33565a(C12579w4 c12579w4) {
        this.f32249P = c12579w4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public InterfaceC12436q4 m33498a(C12386n8.e eVar) {
        if (eVar == C12386n8.e.Interstitial) {
            return this.f32288z;
        }
        if (eVar == C12386n8.e.RewardedVideo) {
            return this.f32287y;
        }
        if (eVar == C12386n8.e.Banner) {
            return this.f32234A;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    void m33573c(Runnable runnable) {
        C11613P7 c11613p7 = this.f32260a;
        if (c11613p7 != null) {
            c11613p7.m27224d(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m33555a(InterfaceC12290kg interfaceC12290kg) {
        this.f32237D = interfaceC12290kg;
    }

    /* JADX INFO: renamed from: a */
    public void m33551a(int i2) {
        String string;
        if (!this.f32257X && !this.f32236C.m33382m()) {
            Logger.m33642i(this.f32264c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String strM33526d = m33526d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strM33526d = String.format("%s&sessionid=%s", strM33526d, initSDKParams.get("sessionid"));
        }
        if (this.f32257X) {
            string = this.f32256W.mo31848c().toURI().toString();
        } else {
            string = this.f32236C.m33380g().toURI().toString();
        }
        this.f32260a.m27224d(new i(controllerConfigAsJSONObject, this.f32263b0, i2, string + "?" + strM33526d));
        m33538n();
        this.f32275m = new j(1000 * C11455Gb.m25891U().mo25846h().mo32171B(), 1000L, i2, C11455Gb.m25891U().mo25846h().mo32176c()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m33532f(Context context) {
        try {
            AbstractC11642R3 abstractC11642R3 = this.f32252S;
            if (abstractC11642R3 == null) {
                return;
            }
            abstractC11642R3.m27325c(context);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public String m33525d(String str) {
        return new C11720Vd(str).m27759d(f32233j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public Object[] m33527d(Context context) {
        boolean z;
        C11728W4 c11728w4M27793b = C11728W4.m27793b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11744X3.j.f26477z, "none");
            jSONObject.put(C11744X3.j.f26407A, SDKUtils.translateDeviceOrientation(this.f32259Z.mo27869A(context)));
            String strM27799d = c11728w4M27793b.m27799d();
            if (strM27799d != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strM27799d));
            }
            String strM27798c = c11728w4M27793b.m27798c();
            if (strM27798c != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strM27798c));
                z = false;
            } else {
                z = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.m33642i(this.f32264c, "add AID");
                    jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
                }
                String limitAdTracking = SDKUtils.getLimitAdTracking();
                if (!TextUtils.isEmpty(limitAdTracking)) {
                    Logger.m33642i(this.f32264c, "add LAT");
                    jSONObject.put(C11744X3.j.f26419M, Boolean.parseBoolean(limitAdTracking));
                }
                String strM27800e = c11728w4M27793b.m27800e();
                if (strM27800e != null) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26456m), SDKUtils.encodeString(strM27800e));
                } else {
                    z = true;
                }
                String strM27801f = c11728w4M27793b.m27801f();
                if (strM27801f != null) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26458n), strM27801f.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                String strM27801f2 = c11728w4M27793b.m27801f();
                if (strM27801f2 != null) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26460o), SDKUtils.encodeString(strM27801f2));
                }
                String strValueOf = String.valueOf(c11728w4M27793b.m27796a());
                if (strValueOf != null) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26462p), strValueOf);
                } else {
                    z = true;
                }
                jSONObject.put(C11540L6.f24984j0, String.valueOf(C12292l0.m31957a()));
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26464q), SDKUtils.encodeString(sDKVersion));
                }
                if (c11728w4M27793b.m27797b() != null && c11728w4M27793b.m27797b().length() > 0) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26466r), SDKUtils.encodeString(c11728w4M27793b.m27797b()));
                }
                String strM27576b = C11693U3.m27576b(context);
                if (strM27576b.equals("none")) {
                    z = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strM27576b));
                }
                String strM27579d = C11693U3.m27579d(context);
                if (strM27579d != null) {
                    jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strM27579d));
                } else {
                    z = true;
                }
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26473v), C11693U3.m27580e(context));
                jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26475x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
                }
                jSONObject.put(C11744X3.j.f26476y, SDKUtils.encodeString(String.valueOf(this.f32259Z.mo27884a(this.f32235B))));
                String strValueOf2 = String.valueOf(this.f32259Z.mo27917o());
                if (TextUtils.isEmpty(strValueOf2)) {
                    z = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26413G) + C11744X3.j.f26438d + SDKUtils.encodeString("width") + C11744X3.j.f26440e, SDKUtils.encodeString(strValueOf2));
                }
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26413G) + C11744X3.j.f26438d + SDKUtils.encodeString("height") + C11744X3.j.f26440e, SDKUtils.encodeString(String.valueOf(this.f32259Z.mo27889b())));
                String strM25655g = C11409E1.m25655g(this.f32263b0.getContext());
                if (!TextUtils.isEmpty(strM25655g)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strM25655g));
                }
                String strValueOf3 = String.valueOf(this.f32259Z.mo27923r());
                if (!TextUtils.isEmpty(strValueOf3)) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26417K), SDKUtils.encodeString(strValueOf3));
                }
                String strValueOf4 = String.valueOf(this.f32259Z.mo27920p());
                if (!TextUtils.isEmpty(strValueOf4)) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26421O), SDKUtils.encodeString(strValueOf4));
                }
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26422P), C11728W4.m27793b(context).m27795a(context));
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26431Y), this.f32259Z.mo27911l(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), C11676T3.m27501b(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), C11676T3.m27502c(context));
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26425S), C11676T3.m27505f(context));
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26424R), SDKUtils.encodeString(C11676T3.m27506g(context)));
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26428V), C11409E1.m25654f(context));
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26430X), C11409E1.m25651d(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C11409E1.m25647b(context)));
                String strM25653e = C11409E1.m25653e(context);
                if (!TextUtils.isEmpty(strM25653e)) {
                    jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26437c0), SDKUtils.encodeString(strM25653e));
                }
                m33522c(jSONObject);
                jSONObject.put(SDKUtils.encodeString(C11744X3.j.f26465q0), this.f32259Z.mo27929u(context));
            } catch (JSONException e2) {
                e = e2;
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        } catch (JSONException e3) {
            e = e3;
            z = false;
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* JADX INFO: renamed from: f */
    private String m33531f(String str) {
        return new InterfaceC12504m.a(str).mo33467a();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: f */
    public void mo33425f() {
        m33554a(this.f32238E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m33516a(JSONObject jSONObject, WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33514a(String str, C12386n8.e eVar, C11660S4 c11660s4, t tVar) {
        if (TextUtils.isEmpty(str)) {
            tVar.mo33595a("Application key are missing", eVar, c11660s4);
        } else {
            m33535i(m33499a(eVar, c11660s4).f32385b);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33413a(String str, String str2, C11660S4 c11660s4, InterfaceC12525t4 interfaceC12525t4) {
        this.f32268f = str;
        this.f32269g = str2;
        this.f32287y = interfaceC12525t4;
        this.f32238E.m31233i(str);
        this.f32238E.m31234j(str2);
        m33514a(str, C12386n8.e.RewardedVideo, c11660s4, new k());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33412a(String str, String str2, C11660S4 c11660s4, InterfaceC12472s4 interfaceC12472s4) {
        this.f32268f = str;
        this.f32269g = str2;
        this.f32288z = interfaceC12472s4;
        this.f32238E.m31230g(str);
        this.f32238E.m31232h(this.f32269g);
        m33514a(this.f32268f, C12386n8.e.Interstitial, c11660s4, new l());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33409a(String str, InterfaceC12472s4 interfaceC12472s4) {
        HashMap map = new HashMap();
        map.put("demandSourceName", str);
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        this.f32238E.m31223d(str, true);
        m33535i(m33503a(C11744X3.h.f26263E, strFlatMapToJsonAsString, C11744X3.h.f26264F, C11744X3.h.f26265G));
    }

    /* JADX INFO: renamed from: a */
    private void m33510a(C11660S4 c11660s4, Map<String, String> map) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, c11660s4.m27439b()});
        if (map.containsKey("adm")) {
            this.f32262b.mo31425a(new InterfaceC12188f4.d() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda0
                @Override // com.ironsource.InterfaceC12188f4.d
                /* JADX INFO: renamed from: a */
                public final void mo31431a(InterfaceC11781Z6 interfaceC11781Z6) {
                    this.f$0.m33512a(interfaceC11781Z6);
                }
            });
        }
        this.f32238E.m31223d(c11660s4.m27447h(), true);
        m33535i(m33503a(C11744X3.h.f26263E, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C11744X3.h.f26264F, C11744X3.h.f26265G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m33512a(InterfaceC11781Z6 interfaceC11781Z6) {
        interfaceC11781Z6.mo28060a(new InterfaceC11799a7() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda3
            @Override // com.ironsource.InterfaceC11799a7
            /* JADX INFO: renamed from: a */
            public final void mo28114a(InterfaceC11730W6 interfaceC11730W6) {
                this.f$0.m33511a(interfaceC11730W6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m33511a(InterfaceC11730W6 interfaceC11730W6) {
        try {
            this.f32251R.mo28114a(interfaceC11730W6);
        } catch (Exception e2) {
            C12317m4.m32153d().m32155a(e2);
            Logger.m33640e(this.f32264c, "handleLoadAd: " + e2);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33416a(JSONObject jSONObject, InterfaceC12472s4 interfaceC12472s4) {
        m33535i(m33500a(C12386n8.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33406a(C11660S4 c11660s4, Map<String, String> map, InterfaceC12472s4 interfaceC12472s4) {
        m33535i(m33500a(C12386n8.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, c11660s4.m27439b()}))));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public boolean mo33418a(String str) {
        C11660S4 c11660s4M27513a = this.f32241H.m27513a(C12386n8.e.Interstitial, str);
        return c11660s4M27513a != null && c11660s4M27513a.m27443d();
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33411a(String str, String str2, C11660S4 c11660s4, InterfaceC12454r4 interfaceC12454r4) {
        this.f32268f = str;
        this.f32269g = str2;
        this.f32234A = interfaceC12454r4;
        m33514a(str, C12386n8.e.Banner, c11660s4, new m());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33405a(C11660S4 c11660s4, Map<String, String> map, InterfaceC12454r4 interfaceC12454r4) {
        Map<String, String> mapMergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, c11660s4.m27439b()});
        if (map != null) {
            m33535i(m33503a(C11744X3.h.f26272N, SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), C11744X3.h.f26273O, C11744X3.h.f26276R));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33404a(C11660S4 c11660s4) {
        Map<String, String> mapM27439b = c11660s4.m27439b();
        if (mapM27439b != null) {
            m33535i(m33503a(C11744X3.h.f26277S, SDKUtils.flatMapToJsonAsString(mapM27439b), C11744X3.h.f26274P, C11744X3.h.f26275Q));
        }
        this.f32241H.m27516b(C12386n8.e.Banner, c11660s4.m27447h());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33415a(JSONObject jSONObject, InterfaceC12454r4 interfaceC12454r4) {
        m33535i(m33503a(C11744X3.h.f26272N, jSONObject.toString(), C11744X3.h.f26273O, C11744X3.h.f26276R));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33407a(InterfaceC12497f.c cVar, InterfaceC12503l.a aVar) {
        m33535i(m33503a(cVar.m33444e(), cVar.m33447h(), C11744X3.h.f26279U, C11744X3.h.f26279U));
    }

    /* JADX INFO: renamed from: a */
    private u m33499a(C12386n8.e eVar, C11660S4 c11660s4) {
        u uVar = new u();
        if (eVar != C12386n8.e.RewardedVideo && eVar != C12386n8.e.Interstitial && eVar != C12386n8.e.Banner) {
            return uVar;
        }
        HashMap map = new HashMap();
        map.put(C11744X3.j.f26444g, this.f32268f);
        if (!TextUtils.isEmpty(this.f32269g)) {
            map.put(C11744X3.j.f26442f, this.f32269g);
        }
        if (c11660s4 != null) {
            if (c11660s4.m27446g() != null) {
                map.putAll(c11660s4.m27446g());
                map.put(C11744X3.i.f26403y0, String.valueOf(C11569N.f25195a.m26596c(c11660s4.m27447h())));
            }
            map.put("demandSourceName", c11660s4.m27445f());
            map.put("demandSourceId", c11660s4.m27447h());
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C11744X3.h hVarM27857a = C11744X3.h.m27857a(eVar);
        String strM33503a = m33503a(hVarM27857a.f26313a, strFlatMapToJsonAsString, hVarM27857a.f26314b, hVarM27857a.f26315c);
        uVar.f32384a = hVarM27857a.f26313a;
        uVar.f32385b = strM33503a;
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public Object m33524d(C12601x8 c12601x8) {
        this.f32270h.mo31289a(this);
        if (c12601x8 != null && c12601x8.exists()) {
            mo26216a(c12601x8);
            return null;
        }
        mo26217a(new C12601x8(C11744X3.f26144f), new C12404o8(1, "Unable to download Html file"));
        return null;
    }

    /* JADX INFO: renamed from: a */
    private String m33500a(C12386n8.e eVar, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String strOptString = jSONObject.optString("demandSourceName");
        String strFetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        C11660S4 c11660s4M27513a = this.f32241H.m27513a(eVar, strFetchDemandSourceId);
        if (c11660s4M27513a != null) {
            if (c11660s4M27513a.m27446g() != null) {
                map.putAll(c11660s4M27513a.m27446g());
            }
            if (!TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        String strFlatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(map);
        C11744X3.h hVarM27858b = C11744X3.h.m27858b(eVar);
        return m33503a(hVarM27858b.f26313a, strFlatMapToJsonAsString, hVarM27858b.f26314b, hVarM27858b.f26315c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m33513a(String str, C12386n8.e eVar, C11660S4 c11660s4) {
        if (m33542r(eVar.toString())) {
            m33570b(new n(eVar, c11660s4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33417a(JSONObject jSONObject, InterfaceC12525t4 interfaceC12525t4) {
        m33535i(m33500a(C12386n8.e.RewardedVideo, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33414a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f32253T = jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m33567a(boolean z, String str) {
        m33535i(m33529e(C11744X3.h.f26280V, m33504a(C11744X3.i.f26341M0, str, null, null, null, null, null, null, C11744X3.i.f26382o, z)));
    }

    /* JADX INFO: renamed from: a */
    public void m33552a(int i2, boolean z) {
        m33535i(m33529e(C11744X3.f.f26251i, m33504a(C11744X3.f.f26248f, String.valueOf(i2), null, null, null, null, null, null, C11744X3.f.f26249g, z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m33515a(String str, boolean z, String str2, String str3) {
        String strM27759d = new C11720Vd(str).m27759d(z ? f32232i0 : f32233j0);
        if (TextUtils.isEmpty(strM27759d)) {
            return;
        }
        m33535i(m33529e(strM27759d, m33501a(m33519b(str, str2), str3)));
    }

    /* JADX INFO: renamed from: a */
    private String m33501a(String str, String str2) {
        return m33502a(str, str2, C11744X3.i.f26366g);
    }

    /* JADX INFO: renamed from: a */
    private String m33502a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                return new JSONObject(str).put(str3, str2).toString();
            } catch (JSONException e2) {
                C12317m4.m32153d().m32155a(e2);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m33504a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e2) {
            C12317m4.m32153d().m32155a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    @Override // com.ironsource.InterfaceC11510Jc
    /* JADX INFO: renamed from: a */
    public void mo26216a(C12601x8 c12601x8) {
        if (this.f32257X && this.f32256W.mo31846a(c12601x8)) {
            m33551a(1);
        } else {
            if (c12601x8.getName().contains(C11744X3.f26144f)) {
                C12162e4.m31349a(this.f32263b0.getContext(), false);
                IronLog.INTERNAL.verbose("controller html was loaded from server");
                this.f32236C.m33377a(new o());
                return;
            }
            m33575c(c12601x8.getName(), c12601x8.getParent());
        }
    }

    @Override // com.ironsource.InterfaceC11510Jc
    /* JADX INFO: renamed from: a */
    public void mo26217a(C12601x8 c12601x8, C12404o8 c12404o8) {
        if (this.f32257X && this.f32256W.mo31846a(c12601x8)) {
            this.f32251R.mo33362c("controller html - failed to download - " + c12404o8.m32957b());
            return;
        }
        boolean zCopyFileFromBundleToStorage = false;
        if (c12601x8.getName().contains(C11744X3.f26144f)) {
            if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && c12601x8.getName().equals(C11744X3.f26144f)) {
                IronLog.INTERNAL.verbose("copying from bundle to storage " + c12601x8.getName() + " and sdk_controller.min.gz.js");
                zCopyFileFromBundleToStorage = m33523c(c12601x8);
            }
            if (zCopyFileFromBundleToStorage) {
                C12547u8.m33894a(C11703Ud.f25961C);
                C12162e4.m31349a(this.f32263b0.getContext(), true);
                this.f32236C.m33377a(new a());
                return;
            }
            this.f32236C.m33378a(new b(), new c(c12404o8));
            return;
        }
        if (FeaturesManager.getInstance().getFeatureFlagLoadControllerAndPlayerFromBundle() && m33517a((File) c12601x8)) {
            IronLog.INTERNAL.verbose("copying from bundle to storage " + c12601x8.getName());
            zCopyFileFromBundleToStorage = SDKUtils.copyFileFromBundleToStorage(this.f32263b0.getContext(), c12601x8);
        }
        if (zCopyFileFromBundleToStorage) {
            m33575c(c12601x8.getName(), c12601x8.getParent());
        } else {
            m33571b(c12601x8.getName(), c12601x8.getParent(), c12404o8.m32957b());
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m33517a(File file) {
        return C12162e4.m31348a().contains(file.getName());
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33403a(Context context) {
        m33566a(new e(context));
    }

    /* JADX INFO: renamed from: a */
    public void m33553a(InterfaceC11546Lc interfaceC11546Lc) {
        this.f32265c0 = interfaceC11546Lc;
        this.f32263b0.m31306a(interfaceC11546Lc);
    }

    /* JADX INFO: renamed from: a */
    public void m33563a(v vVar) {
        this.f32285w = vVar;
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33401a() {
        if (this.f32258Y) {
            if (this.f32263b0 != null) {
                this.f32260a.m27224d(new Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m33496C();
                    }
                });
            }
        } else if (this.f32263b0 != null) {
            this.f32263b0.destroy();
        }
        C12145d5 c12145d5 = this.f32270h;
        if (c12145d5 != null) {
            c12145d5.m31294d();
        }
        AbstractC11642R3 abstractC11642R3 = this.f32252S;
        if (abstractC11642R3 != null) {
            abstractC11642R3.m27322b();
        }
        CountDownTimer countDownTimer = this.f32275m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m33503a(String str, String str2, String str3, String str4) {
        return new InterfaceC12504m.a(str, str2, str3, str4).mo33467a();
    }

    /* JADX INFO: renamed from: a */
    void m33556a(C12386n8.e eVar, String str) {
        m33570b(new f(eVar, str));
    }

    /* JADX INFO: renamed from: a */
    public void m33554a(C12123c1 c12123c1) {
        synchronized (this.f32239F) {
            if (c12123c1.m31235j() && this.f32271i) {
                Log.d(this.f32264c, "restoreState(state:" + c12123c1 + ")");
                int iM31219c = c12123c1.m31219c();
                if (iM31219c != -1) {
                    C12386n8.e eVar = C12386n8.e.RewardedVideo;
                    if (iM31219c == eVar.ordinal()) {
                        Log.d(this.f32264c, "onRVAdClosed()");
                        String strM31216b = c12123c1.m31216b();
                        InterfaceC12436q4 interfaceC12436q4M33498a = m33498a(eVar);
                        if (interfaceC12436q4M33498a != null && !TextUtils.isEmpty(strM31216b)) {
                            interfaceC12436q4M33498a.mo26534b(eVar, strM31216b);
                        }
                    } else {
                        C12386n8.e eVar2 = C12386n8.e.Interstitial;
                        if (iM31219c == eVar2.ordinal()) {
                            Log.d(this.f32264c, "onInterstitialAdClosed()");
                            String strM31216b2 = c12123c1.m31216b();
                            InterfaceC12436q4 interfaceC12436q4M33498a2 = m33498a(eVar2);
                            if (interfaceC12436q4M33498a2 != null && !TextUtils.isEmpty(strM31216b2)) {
                                interfaceC12436q4M33498a2.mo26534b(eVar2, strM31216b2);
                            }
                        }
                    }
                    c12123c1.m31212a(-1);
                    c12123c1.m31228f(null);
                } else {
                    Log.d(this.f32264c, "No ad was opened");
                }
                String strM31222d = c12123c1.m31222d();
                String strM31227f = c12123c1.m31227f();
                for (C11660S4 c11660s4 : this.f32241H.m27515a(C12386n8.e.Interstitial)) {
                    if (c11660s4.m27444e() == 2) {
                        Log.d(this.f32264c, "initInterstitial(appKey:" + strM31222d + ", userId:" + strM31227f + ", demandSource:" + c11660s4.m27445f() + ")");
                        mo33412a(strM31222d, strM31227f, c11660s4, this.f32288z);
                    }
                }
                String strM31229g = c12123c1.m31229g();
                String strM31231h = c12123c1.m31231h();
                for (C11660S4 c11660s5 : this.f32241H.m27515a(C12386n8.e.RewardedVideo)) {
                    if (c11660s5.m27444e() == 2) {
                        String strM27445f = c11660s5.m27445f();
                        Log.d(this.f32264c, "onRVNoMoreOffers()");
                        this.f32287y.mo26540c(strM27445f);
                        Log.d(this.f32264c, "initRewardedVideo(appKey:" + strM31229g + ", userId:" + strM31231h + ", demandSource:" + strM27445f + ")");
                        mo33413a(strM31229g, strM31231h, c11660s5, this.f32287y);
                    }
                }
                c12123c1.m31215a(false);
            }
            this.f32238E = c12123c1;
        }
    }

    /* JADX INFO: renamed from: a */
    void m33566a(Runnable runnable) {
        C11613P7 c11613p7 = this.f32260a;
        if (c11613p7 != null) {
            c11613p7.m27219b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.InterfaceC12503l
    /* JADX INFO: renamed from: a */
    public void mo33402a(Activity activity) {
        this.f32261a0.m28106a(activity);
    }
}
