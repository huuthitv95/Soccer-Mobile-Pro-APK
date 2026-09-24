package com.ironsource.sdk.controller;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C11386Ce;
import com.ironsource.C11501J3;
import com.ironsource.C11561M9;
import com.ironsource.C11744X3;
import com.ironsource.C11802aa;
import com.ironsource.C12120bg;
import com.ironsource.C12317m4;
import com.ironsource.InterfaceC12219h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* JADX INFO: loaded from: classes6.dex */
public class OpenUrlActivity extends Activity {

    /* JADX INFO: renamed from: j */
    private static final String f31946j = "OpenUrlActivity";

    /* JADX INFO: renamed from: k */
    private static final int f31947k = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: l */
    private static final int f31948l = SDKUtils.generateViewId();

    /* JADX INFO: renamed from: b */
    private C12513v f31950b;

    /* JADX INFO: renamed from: c */
    private ProgressBar f31951c;

    /* JADX INFO: renamed from: d */
    boolean f31952d;

    /* JADX INFO: renamed from: e */
    private RelativeLayout f31953e;

    /* JADX INFO: renamed from: f */
    private String f31954f;

    /* JADX INFO: renamed from: a */
    private WebView f31949a = null;

    /* JADX INFO: renamed from: g */
    private final Handler f31955g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h */
    private boolean f31956h = false;

    /* JADX INFO: renamed from: i */
    private final Runnable f31957i = new RunnableC12488b();

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.OpenUrlActivity$a */
    class ViewOnSystemUiVisibilityChangeListenerC12487a implements View.OnSystemUiVisibilityChangeListener {
        ViewOnSystemUiVisibilityChangeListenerC12487a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.f31955g.removeCallbacks(openUrlActivity.f31957i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.f31955g.postDelayed(openUrlActivity2.f31957i, 500L);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.OpenUrlActivity$b */
    class RunnableC12488b implements Runnable {
        RunnableC12488b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f31956h));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.OpenUrlActivity$c */
    private class C12489c extends WebViewClient {
        private C12489c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f31951c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f31951c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C12513v c12513v;
            super.onReceivedError(webView, i, str, str2);
            try {
                C11501J3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.mo26172b()) {
                    if (featureFlagCatchUrlError.m26174e() && (c12513v = OpenUrlActivity.this.f31950b) != null) {
                        c12513v.m33576d(str, str2);
                    }
                    if (featureFlagCatchUrlError.m26173d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m33640e(OpenUrlActivity.f31946j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!new C11386Ce(str, C11802aa.m28151e().m28159d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().mo26172b()).m25583a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                C12120bg.m31196a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.f31950b.m33543A();
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                StringBuilder sb = new StringBuilder();
                if (e instanceof ActivityNotFoundException) {
                    sb.append(C11744X3.c.f26220x);
                } else {
                    sb.append(C11744X3.c.f26221y);
                }
                C12513v c12513v = OpenUrlActivity.this.f31950b;
                if (c12513v != null) {
                    c12513v.m33576d(sb.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.OpenUrlActivity$d */
    static class C12490d {

        /* JADX INFO: renamed from: a */
        static final String f31961a = "is_store";

        /* JADX INFO: renamed from: b */
        static final String f31962b = "external_url";

        /* JADX INFO: renamed from: c */
        static final String f31963c = "secondary_web_view";

        /* JADX INFO: renamed from: d */
        static final String f31964d = "immersive";

        /* JADX INFO: renamed from: e */
        static final String f31965e = "no activity to handle url";

        /* JADX INFO: renamed from: f */
        static final String f31966f = "activity failed to open with unspecified reason";

        private C12490d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.OpenUrlActivity$e */
    public static class C12491e {

        /* JADX INFO: renamed from: a */
        private final InterfaceC12219h f31967a;

        /* JADX INFO: renamed from: b */
        private int f31968b;

        /* JADX INFO: renamed from: c */
        private String f31969c;

        /* JADX INFO: renamed from: d */
        private boolean f31970d = false;

        /* JADX INFO: renamed from: e */
        private boolean f31971e = false;

        /* JADX INFO: renamed from: f */
        private boolean f31972f = false;

        public C12491e(InterfaceC12219h interfaceC12219h) {
            this.f31967a = interfaceC12219h;
        }

        /* JADX INFO: renamed from: a */
        C12491e m33349a(int i) {
            this.f31968b = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12491e m33352b(boolean z) {
            this.f31970d = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12491e m33353c(boolean z) {
            this.f31971e = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C12491e m33350a(String str) {
            this.f31969c = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        C12491e m33351a(boolean z) {
            this.f31972f = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public Intent m33348a(Context context) {
            Intent intentMo31566a = this.f31967a.mo31566a(context);
            intentMo31566a.putExtra("external_url", this.f31969c);
            intentMo31566a.putExtra("secondary_web_view", this.f31970d);
            intentMo31566a.putExtra("is_store", this.f31971e);
            intentMo31566a.putExtra(C11744X3.i.f26396v, this.f31972f);
            if (!(context instanceof Activity)) {
                intentMo31566a.setFlags(this.f31968b);
            }
            return intentMo31566a;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33341a() {
        if (this.f31951c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.f31951c = progressBar;
            progressBar.setId(f31948l);
        }
        if (findViewById(f31948l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f31951c.setLayoutParams(layoutParams);
            this.f31951c.setVisibility(4);
            this.f31953e.addView(this.f31951c);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m33342b() {
        if (this.f31949a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f31949a = webView;
            webView.setId(f31947k);
            this.f31949a.getSettings().setJavaScriptEnabled(true);
            this.f31949a.setWebViewClient(new C12489c());
            loadUrl(this.f31954f);
        }
        if (findViewById(f31947k) == null) {
            this.f31953e.addView(this.f31949a, new RelativeLayout.LayoutParams(-1, -1));
        }
        m33341a();
        C12513v c12513v = this.f31950b;
        if (c12513v != null) {
            c12513v.m33572b(true, C11744X3.i.f26353Y);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m33343c() {
        WebView webView = this.f31949a;
        if (webView != null) {
            webView.destroy();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m33344d() {
        getWindow().addFlags(16);
    }

    /* JADX INFO: renamed from: e */
    private void m33345e() {
        requestWindowFeature(1);
    }

    /* JADX INFO: renamed from: f */
    private void m33346f() {
        getWindow().setFlags(1024, 1024);
    }

    /* JADX INFO: renamed from: g */
    private void m33347g() {
        ViewGroup viewGroup;
        C12513v c12513v = this.f31950b;
        if (c12513v != null) {
            c12513v.m33572b(false, C11744X3.i.f26353Y);
            if (this.f31953e == null || (viewGroup = (ViewGroup) this.f31949a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f31947k) != null) {
                viewGroup.removeView(this.f31949a);
            }
            if (viewGroup.findViewById(f31948l) != null) {
                viewGroup.removeView(this.f31951c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        C12513v c12513v;
        if (this.f31952d && (c12513v = this.f31950b) != null) {
            c12513v.m33574c(C11744X3.i.f26372j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f31949a.stopLoading();
        this.f31949a.clearHistory();
        try {
            this.f31949a.loadUrl(str);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            Logger.m33640e(f31946j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f31949a.canGoBack()) {
            this.f31949a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m33642i(f31946j, "onCreate()");
        try {
            this.f31950b = (C12513v) C11561M9.m26506b((Context) this).mo26512a().m33428k();
            m33345e();
            m33346f();
            Bundle extras = getIntent().getExtras();
            this.f31954f = extras.getString("external_url");
            this.f31952d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(C11744X3.i.f26396v, false);
            this.f31956h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC12487a());
                runOnUiThread(this.f31957i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f31953e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m33343c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f31956h && (i == 25 || i == 24)) {
            this.f31955g.postDelayed(this.f31957i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        m33347g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        m33342b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f31956h && z) {
            runOnUiThread(this.f31957i);
        }
    }
}
