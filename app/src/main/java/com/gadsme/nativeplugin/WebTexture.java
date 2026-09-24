package com.gadsme.nativeplugin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tiktok.util.UrlConst;
import com.unity3d.player.UnityPlayer;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import p000a.p001a.p002a.C0003c;
import p000a.p001a.p002a.RunnableC0001a;
import p000a.p001a.p002a.RunnableC0002b;
import p000a.p001a.p002a.RunnableC0004d;
import p000a.p001a.p002a.RunnableC0005e;
import p000a.p001a.p002a.RunnableC0006f;

/* JADX INFO: loaded from: classes4.dex */
public class WebTexture {

    /* JADX INFO: renamed from: F */
    public static HashMap<Integer, WebTexture> f21764F = new HashMap<>();

    /* JADX INFO: renamed from: G */
    public static int f21765G = 1;

    /* JADX INFO: renamed from: H */
    public static String f21766H = null;

    /* JADX INFO: renamed from: I */
    public static String f21767I = null;

    /* JADX INFO: renamed from: J */
    public static boolean f21768J = false;

    /* JADX INFO: renamed from: K */
    public static HashMap<String, Object> f21769K = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public C9317o f21775a;

    /* JADX INFO: renamed from: b */
    public Bitmap f21776b;

    /* JADX INFO: renamed from: c */
    public Canvas f21777c;

    /* JADX INFO: renamed from: m */
    public int f21787m;

    /* JADX INFO: renamed from: q */
    public C9318p f21791q;

    /* JADX INFO: renamed from: r */
    public int f21792r;

    /* JADX INFO: renamed from: s */
    public int f21793s;

    /* JADX INFO: renamed from: v */
    public int f21796v;

    /* JADX INFO: renamed from: w */
    public boolean f21797w;

    /* JADX INFO: renamed from: x */
    public int f21798x;

    /* JADX INFO: renamed from: d */
    public boolean f21778d = false;

    /* JADX INFO: renamed from: e */
    public boolean f21779e = false;

    /* JADX INFO: renamed from: f */
    public boolean f21780f = false;

    /* JADX INFO: renamed from: g */
    public boolean f21781g = false;

    /* JADX INFO: renamed from: h */
    public String f21782h = null;

    /* JADX INFO: renamed from: i */
    public boolean f21783i = false;

    /* JADX INFO: renamed from: j */
    public boolean f21784j = false;

    /* JADX INFO: renamed from: k */
    public boolean f21785k = false;

    /* JADX INFO: renamed from: l */
    public boolean f21786l = false;

    /* JADX INFO: renamed from: n */
    public boolean f21788n = false;

    /* JADX INFO: renamed from: o */
    public Handler f21789o = null;

    /* JADX INFO: renamed from: p */
    public Runnable f21790p = null;

    /* JADX INFO: renamed from: t */
    public int f21794t = 0;

    /* JADX INFO: renamed from: u */
    public int f21795u = 1;

    /* JADX INFO: renamed from: y */
    public boolean f21799y = false;

    /* JADX INFO: renamed from: z */
    public boolean f21800z = false;

    /* JADX INFO: renamed from: A */
    public boolean f21770A = false;

    /* JADX INFO: renamed from: B */
    public float f21771B = 0.0f;

    /* JADX INFO: renamed from: C */
    public float f21772C = 0.0f;

    /* JADX INFO: renamed from: D */
    public int f21773D = 0;

    /* JADX INFO: renamed from: E */
    public int f21774E = 0;

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$a */
    public class RunnableC9303a implements Runnable {
        public RunnableC9303a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (WebTexture.this) {
                WebTexture.this.f21788n = true;
                WebTexture.m22096a().removeView(WebTexture.this.f21775a);
                WebTexture.this.f21775a.destroy();
                WebTexture.this.f21775a = null;
                WebTexture.this.f21777c = null;
                if (WebTexture.this.f21776b != null) {
                    WebTexture.this.f21776b.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$b */
    public static class RunnableC9304b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21802a;

        public RunnableC9304b(String str) {
            this.f21802a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebTexture.f21766H = this.f21802a;
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$c */
    public static class RunnableC9305c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21803a;

        public RunnableC9305c(String str) {
            this.f21803a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebTexture.f21767I = this.f21803a;
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$d */
    public class RunnableC9306d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f21804a;

        public RunnableC9306d(boolean z) {
            this.f21804a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9317o c9317o;
            WebTexture webTexture = WebTexture.this;
            boolean z = webTexture.f21800z;
            boolean z2 = this.f21804a;
            if (z != z2) {
                webTexture.f21800z = z2;
                WebTexture webTexture2 = WebTexture.this;
                if (!webTexture2.f21799y || (c9317o = webTexture2.f21775a) == null) {
                    return;
                }
                c9317o.evaluateJavascript(this.f21804a ? "window.gadsmebridge.setIsViewable(true);" : "window.gadsmebridge.setIsViewable(false);", null);
            }
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$e */
    public static class RunnableC9307e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21806a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f21807b;

        public RunnableC9307e(String str, String str2) {
            this.f21806a = str;
            this.f21807b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Plugin.SendMessage("RemoteDebug", 1, this.f21806a.length() + CertificateUtil.DELIMITER + this.f21806a + this.f21807b);
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$f */
    public static class RunnableC9308f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21808a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f21809b;

        public RunnableC9308f(String str, String str2) {
            this.f21808a = str;
            this.f21809b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Plugin.SendMessage("RemoteDebug", 2, this.f21808a.length() + CertificateUtil.DELIMITER + this.f21808a + this.f21809b);
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$g */
    public class RunnableC9309g implements Runnable {
        public RunnableC9309g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9317o c9317o = WebTexture.this.f21775a;
            if (c9317o != null) {
                c9317o.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$h */
    public class RunnableC9310h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f21811a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f21812b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f21813c;

        /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$h$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebTexture webTexture = WebTexture.this;
                boolean z = webTexture.f21778d;
                synchronized (webTexture) {
                    if (WebTexture.this.f21788n) {
                        return;
                    }
                    boolean z2 = z && !WebTexture.this.f21786l;
                    if (z2) {
                        C9317o c9317o = WebTexture.this.f21775a;
                        c9317o.getClass();
                        try {
                            c9317o.onDraw(WebTexture.this.f21777c);
                        } catch (Throwable unused) {
                        }
                    }
                    RunnableC9310h runnableC9310h = RunnableC9310h.this;
                    WebTexture webTexture2 = WebTexture.this;
                    webTexture2.f21789o.postDelayed(webTexture2.f21790p, runnableC9310h.f21813c);
                }
            }
        }

        public RunnableC9310h(int i, int i2, int i3) {
            this.f21811a = i;
            this.f21812b = i2;
            this.f21813c = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebTexture.this.f21775a = WebTexture.this.new C9317o(UnityPlayer.currentActivity);
            WebTexture.this.f21775a.setInitialScale(100);
            WebTexture.this.f21775a.setHorizontalScrollBarEnabled(false);
            WebTexture.this.f21775a.setVerticalScrollBarEnabled(false);
            WebTexture webTexture = WebTexture.this;
            webTexture.f21775a.setWebViewClient(new C0003c(webTexture));
            WebTexture.this.f21775a.setFilterTouchesWhenObscured(true);
            WebTexture webTexture2 = WebTexture.this;
            webTexture2.f21775a.addJavascriptInterface(webTexture2.new C9319q(), "GadsmeNativeBridgeAndroid");
            WebSettings settings = WebTexture.this.f21775a.getSettings();
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(false);
            settings.setJavaScriptEnabled(true);
            WebTexture.this.f21799y = false;
            WebTexture.this.f21800z = false;
            WebTexture webTexture3 = WebTexture.this;
            webTexture3.m22112b();
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0004d(webTexture3), 100L);
            CookieManager.getInstance().setAcceptCookie(true);
            settings.setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(WebTexture.this.f21775a, true);
            Rect rect = new Rect(0, 0, this.f21811a, this.f21812b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.setMargins(rect.left, rect.top, 0, 0);
            WebTexture.this.f21775a.setLayoutParams(layoutParams);
            WebTexture.this.f21775a.measure(View.MeasureSpec.makeMeasureSpec(this.f21811a, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f21812b, 1073741824));
            if (this.f21813c <= 0) {
                WebTexture.m22096a().addView(WebTexture.this.f21775a);
                return;
            }
            WebTexture.m22096a().addView(WebTexture.this.f21775a);
            WebTexture.this.f21789o = new Handler(Looper.getMainLooper());
            WebTexture.this.f21790p = new a();
            WebTexture webTexture4 = WebTexture.this;
            webTexture4.f21789o.postDelayed(webTexture4.f21790p, this.f21813c);
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$i */
    public static class RunnableC9311i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21816a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f21817b;

        public RunnableC9311i(String str, String str2) {
            this.f21816a = str;
            this.f21817b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Plugin.SendMessage("RemoteDebug", 3, this.f21816a.length() + CertificateUtil.DELIMITER + this.f21816a + this.f21817b);
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$j */
    public class RunnableC9312j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21818a;

        public RunnableC9312j(String str) {
            this.f21818a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9317o c9317o = WebTexture.this.f21775a;
            if (c9317o != null) {
                c9317o.getSettings().setUserAgentString(this.f21818a);
            }
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$k */
    public class RunnableC9313k implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21820a;

        public RunnableC9313k(String str) {
            this.f21820a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebTexture webTexture = WebTexture.this;
            if (webTexture.f21775a != null) {
                synchronized (webTexture) {
                    WebTexture.this.f21778d = false;
                    WebTexture.this.f21780f = false;
                    WebTexture.this.f21779e = false;
                }
                WebTexture.this.f21775a.setVisibility(0);
                WebTexture.this.f21775a.loadUrl(this.f21820a);
                WebTexture.m22097a(WebTexture.this);
                WebTexture webTexture2 = WebTexture.this;
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0005e(webTexture2, webTexture2.f21798x), 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$l */
    public class RunnableC9314l implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21822a;

        public RunnableC9314l(String str) {
            this.f21822a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iIndexOf;
            WebTexture webTexture = WebTexture.this;
            if (webTexture.f21775a != null) {
                synchronized (webTexture) {
                    WebTexture.this.f21778d = false;
                    WebTexture.this.f21780f = false;
                    WebTexture.this.f21779e = false;
                }
                String string = this.f21822a;
                WebTexture webTexture2 = WebTexture.this;
                if (!webTexture2.f21770A && WebTexture.f21766H != null) {
                    webTexture2.f21770A = true;
                    WebTexture.this.getClass();
                    if (WebTexture.f21766H != null) {
                        int length = string.length();
                        int i = 0;
                        boolean z = false;
                        while (true) {
                            if (i >= length) {
                                i = -1;
                                break;
                            }
                            char cCharAt = string.charAt(i);
                            if (z) {
                                if (cCharAt == '-' && string.substring(i, Math.min(i + 3, length)).equals("-->")) {
                                    i += 2;
                                    z = false;
                                }
                            } else if (cCharAt != '<') {
                                continue;
                            } else if (string.substring(i, Math.min(i + 4, length)).equals("<!--")) {
                                i += 3;
                                z = true;
                            } else if (string.substring(i, Math.min(i + 5, length)).toLowerCase().equals("<head")) {
                                break;
                            }
                            i++;
                        }
                        if (i != -1 && (iIndexOf = string.indexOf(62, i)) != -1) {
                            StringBuilder sb = new StringBuilder();
                            int i2 = iIndexOf + 1;
                            sb.append(string.substring(0, i2));
                            sb.append("<script type=\"text/javascript\">");
                            sb.append(WebTexture.f21766H);
                            sb.append("</script>");
                            sb.append(string.substring(i2));
                            string = sb.toString();
                        }
                    }
                }
                WebTexture.this.f21775a.setVisibility(0);
                WebTexture.this.f21775a.loadDataWithBaseURL(null, string, "text/html; charset=utf-8", "UTF-8", null);
                WebTexture.m22097a(WebTexture.this);
                WebTexture webTexture3 = WebTexture.this;
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0005e(webTexture3, webTexture3.f21798x), 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$m */
    public class RunnableC9315m implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f21824a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f21825b;

        public RunnableC9315m(int i, int i2) {
            this.f21824a = i;
            this.f21825b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebTexture webTexture = WebTexture.this;
            if (webTexture.f21775a != null) {
                webTexture.f21784j = true;
                WebTexture.this.f21785k = false;
                WebTexture webTexture2 = WebTexture.this;
                webTexture2.f21783i = true;
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0001a(webTexture2), 300L);
                long jUptimeMillis = SystemClock.uptimeMillis();
                long jUptimeMillis2 = SystemClock.uptimeMillis() + 100;
                WebTexture.this.f21775a.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis2, 0, this.f21824a, this.f21825b, 0));
                WebTexture.this.f21775a.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis2, 1, this.f21824a, this.f21825b, 0));
            }
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$n */
    public class RunnableC9316n implements Runnable {
        public RunnableC9316n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            C9317o c9317o = WebTexture.this.f21775a;
            if (c9317o != null) {
                c9317o.setVisibility(0);
                synchronized (WebTexture.this) {
                    z = WebTexture.this.f21779e;
                }
                if (z) {
                    C9318p c9318p = WebTexture.this.f21791q;
                    c9318p.f21829a.removeCallbacks(c9318p.f21830b);
                    c9318p.f21829a.postDelayed(c9318p.f21830b, c9318p.f21831c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$o */
    public class C9317o extends WebView {
        public C9317o(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onDraw(Canvas canvas) {
            synchronized (WebTexture.this) {
                WebTexture.this.f21794t = 1;
            }
            synchronized (WebTexture.this.f21776b) {
                super.onDraw(WebTexture.this.f21777c);
            }
            synchronized (WebTexture.this) {
                WebTexture.this.f21786l = true;
                if (WebTexture.this.f21794t == 1) {
                    WebTexture.this.f21794t = 0;
                }
            }
        }

        @Override // android.view.View
        public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
            return WebTexture.this.f21783i;
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.View
        public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
            return null;
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (WebTexture.this.f21783i) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$p */
    public class C9318p {

        /* JADX INFO: renamed from: a */
        public Handler f21829a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b */
        public Runnable f21830b;

        /* JADX INFO: renamed from: c */
        public int f21831c;

        public C9318p(WebTexture webTexture, Runnable runnable, int i) {
            this.f21830b = runnable;
            this.f21831c = i;
        }
    }

    /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$q */
    public class C9319q {

        /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$q$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                StringBuilder sb;
                String str2;
                WebTexture webTexture = WebTexture.this;
                if (webTexture.f21799y) {
                    return;
                }
                webTexture.f21799y = true;
                WebTexture.this.m22112b();
                if (WebTexture.f21767I != null) {
                    str = "window.gadsmebridge.setHostSDKVersion('" + WebTexture.f21767I + "'); ";
                } else {
                    str = "";
                }
                String str3 = str + "window.gadsmebridge.setState('default'); window.gadsmebridge.notifyReadyEvent(); ";
                if (WebTexture.this.f21800z) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    str2 = "window.gadsmebridge.setIsViewable(true);";
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    str2 = "window.gadsmebridge.setIsViewable(false);";
                }
                sb.append(str2);
                String string = sb.toString();
                C9317o c9317o = WebTexture.this.f21775a;
                if (c9317o != null) {
                    c9317o.evaluateJavascript(string, null);
                }
            }
        }

        /* JADX INFO: renamed from: com.gadsme.nativeplugin.WebTexture$q$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f21834a;

            public b(C9319q c9319q, String str) {
                this.f21834a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Plugin.SendMessage("Impression", 0, this.f21834a);
            }
        }

        public C9319q() {
        }

        @JavascriptInterface
        public void boot() {
            UnityPlayer.currentActivity.runOnUiThread(new a());
        }

        @JavascriptInterface
        public void consoleLog(String str) {
            Log.d("GADSME", "console.log: " + str);
        }

        @JavascriptInterface
        public void impression(String str) {
            UnityPlayer.currentActivity.runOnUiThread(new b(this, str));
        }

        @JavascriptInterface
        public void runCommand(String str, String str2) {
            String string;
            try {
                JSONArray jSONArray = new JSONArray(str2);
                if (WebTexture.this.f21784j && "open".equals(str) && jSONArray.length() >= 2 && "url".equals(jSONArray.getString(0)) && (string = jSONArray.getString(1)) != null) {
                    WebTexture.m22098a(WebTexture.this, string);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public WebTexture(int i, int i2, int i3) {
        this.f21787m = -1;
        int i4 = f21765G;
        f21765G = i4 + 1;
        this.f21796v = i4;
        this.f21792r = i;
        this.f21793s = i2;
        this.f21797w = false;
        this.f21798x = 0;
        synchronized (f21764F) {
            f21764F.put(Integer.valueOf(this.f21796v), this);
        }
        this.f21787m = i3;
        this.f21776b = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f21776b);
        this.f21777c = canvas;
        canvas.scale(1.0f, -1.0f, i * 0.5f, i2 * 0.5f);
        this.f21791q = new C9318p(this, new RunnableC9309g(), 1000);
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9310h(i, i2, i3));
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup m22096a() {
        return (ViewGroup) UnityPlayer.currentActivity.getWindow().getDecorView().getRootView();
    }

    /* JADX INFO: renamed from: a */
    public static void m22097a(WebTexture webTexture) {
        synchronized (webTexture) {
            webTexture.f21779e = false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0002b(webTexture), 3000L);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22098a(WebTexture webTexture, String str) {
        if (webTexture.f21775a == null || !webTexture.f21784j || !webTexture.f21778d) {
            return false;
        }
        if (!str.startsWith("http://") && !str.startsWith(UrlConst.HTTPS) && !str.startsWith("market://")) {
            return false;
        }
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC0006f(webTexture, str));
        return true;
    }

    public static Bitmap getBitmap(int i) {
        WebTexture webTexture;
        synchronized (f21764F) {
            webTexture = f21764F.get(Integer.valueOf(i));
        }
        if (webTexture != null) {
            return webTexture.f21776b;
        }
        return null;
    }

    public static boolean isRemoteDebugEnabled() {
        return f21768J;
    }

    public static boolean remoteDebugBoolConfig(String str) {
        synchronized (f21769K) {
            Object obj = f21769K.get(str);
            if (obj == null || !(obj instanceof Boolean)) {
                return false;
            }
            return ((Boolean) obj).booleanValue();
        }
    }

    public static double remoteDebugDoubleConfig(String str) {
        synchronized (f21769K) {
            Object obj = f21769K.get(str);
            if (obj == null || !(obj instanceof Double)) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            return ((Double) obj).doubleValue();
        }
    }

    public static float remoteDebugFloatConfig(String str) {
        synchronized (f21769K) {
            Object obj = f21769K.get(str);
            if (obj == null || !(obj instanceof Double)) {
                return 0.0f;
            }
            return (float) ((Double) obj).doubleValue();
        }
    }

    public static int remoteDebugIntConfig(String str) {
        synchronized (f21769K) {
            Object obj = f21769K.get(str);
            if (obj == null || !(obj instanceof Double)) {
                return 0;
            }
            return (int) ((Double) obj).doubleValue();
        }
    }

    public static void remoteDebugLog(String str, String str2) {
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9307e(str, str2));
    }

    public static void remoteDebugLogError(String str, String str2) {
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9311i(str, str2));
    }

    public static void remoteDebugLogWarning(String str, String str2) {
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9308f(str, str2));
    }

    public static String remoteDebugStringConfig(String str) {
        synchronized (f21769K) {
            Object obj = f21769K.get(str);
            if (obj == null || !(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        }
    }

    public static int setBitmapLock(int i, int i2) {
        WebTexture webTexture;
        synchronized (f21764F) {
            webTexture = f21764F.get(Integer.valueOf(i));
        }
        if (webTexture != null) {
            synchronized (webTexture) {
                if (!webTexture.f21788n) {
                    if (i2 == 0) {
                        webTexture.f21794t = 0;
                        return 0;
                    }
                    if (webTexture.f21794t != 0) {
                        if (i2 == 2) {
                            int i3 = webTexture.f21795u;
                            if (i3 < 1) {
                                webTexture.f21795u = i3 + 1;
                            } else {
                                webTexture.f21794t = i2;
                                webTexture.f21795u = 0;
                            }
                        }
                        return -1;
                    }
                    webTexture.f21794t = i2;
                    if (i2 == 2) {
                        webTexture.f21795u = 0;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void setGadsmeBridgeJavascript(String str) {
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9304b(str));
    }

    public static void setGadsmeSDKVersion(String str) {
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9305c(str));
    }

    public static void setRemoteDebugBoolConfig(String str, boolean z) {
        synchronized (f21769K) {
            f21769K.put(str, Boolean.valueOf(z));
        }
    }

    public static void setRemoteDebugDoubleConfig(String str, double d) {
        synchronized (f21769K) {
            f21769K.put(str, Double.valueOf(d));
        }
    }

    public static void setRemoteDebugEnabled(boolean z) {
        f21768J = z;
    }

    public static void setRemoteDebugStringConfig(String str, String str2) {
        synchronized (f21769K) {
            f21769K.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22112b() {
        int i;
        if (!this.f21799y || this.f21775a == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        UnityPlayer.currentActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        int i3 = displayMetrics.widthPixels;
        if (i2 > 0 && i3 > 0) {
            float f = i2;
            float f2 = i3;
            float fMax = Math.max(this.f21792r / f, this.f21793s / f2);
            int iCeil = (int) Math.ceil(f * fMax);
            int iCeil2 = (int) Math.ceil(f2 * fMax);
            if (this.f21773D != iCeil || this.f21774E != iCeil2) {
                this.f21773D = iCeil;
                this.f21774E = iCeil2;
                this.f21775a.evaluateJavascript("window.gadsmebridge.setScreenSize(" + iCeil + "," + iCeil2 + "); window.gadsmebridge.setMaxSize(" + iCeil + "," + iCeil2 + ");", null);
            }
        }
        int i4 = this.f21792r;
        if (i4 <= 0 || (i = this.f21793s) <= 0) {
            return;
        }
        if (i4 == this.f21771B && i == this.f21772C) {
            return;
        }
        this.f21771B = i4;
        this.f21772C = i;
        this.f21775a.evaluateJavascript("window.gadsmebridge.setDefaultPosition(0,0," + this.f21792r + "," + this.f21793s + "); window.gadsmebridge.setCurrentPosition(0,0," + this.f21792r + "," + this.f21793s + ");", null);
    }

    public void click(int i, int i2) {
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9315m(i, i2));
    }

    public void destroy() {
        C9318p c9318p = this.f21791q;
        c9318p.f21829a.removeCallbacks(c9318p.f21830b);
        synchronized (f21764F) {
            f21764F.remove(Integer.valueOf(this.f21796v));
        }
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9303a());
    }

    public int getInstanceId() {
        return this.f21796v;
    }

    public void loadHtml(String str) {
        synchronized (this) {
            this.f21782h = null;
            this.f21780f = false;
            this.f21781g = false;
            this.f21784j = false;
            this.f21785k = false;
            this.f21773D = 0;
            this.f21774E = 0;
            this.f21771B = 0.0f;
            this.f21772C = 0.0f;
            this.f21797w = false;
            this.f21798x++;
            this.f21799y = false;
            this.f21800z = false;
            this.f21770A = false;
        }
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9314l(str));
    }

    public void loadUrl(String str) {
        synchronized (this) {
            this.f21782h = str;
            this.f21780f = false;
            this.f21781g = false;
            this.f21784j = false;
            this.f21785k = false;
            this.f21773D = 0;
            this.f21774E = 0;
            this.f21771B = 0.0f;
            this.f21772C = 0.0f;
            this.f21797w = false;
            this.f21798x++;
            this.f21799y = false;
            this.f21800z = false;
            this.f21770A = false;
        }
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9313k(str));
    }

    public void render() {
        boolean z;
        synchronized (this) {
            z = this.f21786l;
        }
        if (z) {
            Plugin.SendMessage("WebTexture", this.f21796v, "pageRendered");
            synchronized (this) {
                this.f21786l = false;
            }
        }
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9316n());
    }

    public void setUserAgent(String str) {
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9312j(str));
    }

    public void setViewable(boolean z) {
        UnityPlayer.currentActivity.runOnUiThread(new RunnableC9306d(z));
    }
}
