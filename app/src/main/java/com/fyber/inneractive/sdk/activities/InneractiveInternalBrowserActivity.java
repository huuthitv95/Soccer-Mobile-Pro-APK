package com.fyber.inneractive.sdk.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.click.C7928b;
import com.fyber.inneractive.sdk.click.C7936j;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.RunnableC9175o0;
import com.ironsource.C11341A5;
import java.net.URLDecoder;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveInternalBrowserActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* JADX INFO: renamed from: j */
    public static String f17469j;

    /* JADX INFO: renamed from: k */
    public static InternalBrowserListener f17470k;

    /* JADX INFO: renamed from: b */
    public AbstractC8236x f17471b;

    /* JADX INFO: renamed from: c */
    public String f17472c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f17473d;

    /* JADX INFO: renamed from: e */
    public WebView f17474e;

    /* JADX INFO: renamed from: f */
    public ImageButton f17475f;

    /* JADX INFO: renamed from: g */
    public ImageButton f17476g;

    /* JADX INFO: renamed from: h */
    public ImageButton f17477h;

    /* JADX INFO: renamed from: i */
    public ImageButton f17478i;

    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    /* JADX INFO: renamed from: a */
    public static void m20324a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity, C7928b c7928b) {
        C8006r c8006r;
        AbstractC8236x abstractC8236x = inneractiveInternalBrowserActivity.f17471b;
        InneractiveAdRequest inneractiveAdRequest = abstractC8236x != null ? abstractC8236x.f18373a : null;
        AbstractC9087e abstractC9087e = abstractC8236x != null ? abstractC8236x.f18374b : null;
        JSONArray jSONArrayM20435b = (abstractC8236x == null || (c8006r = abstractC8236x.f18375c) == null) ? null : c8006r.m20435b();
        EnumC8424u enumC8424u = EnumC8424u.FYBER_SUCCESS_CLICK;
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        JSONObject jSONObject = new JSONObject();
        long j = c7928b.f17611e;
        if (j != 0) {
            Object objValueOf = Long.valueOf(j);
            try {
                jSONObject.put("time_passed", objValueOf);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "time_passed", objValueOf);
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (C7936j c7936j : c7928b.f17612f) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("url", c7936j.f17629a);
                jSONObject2.put("success", c7936j.f17630b);
                jSONObject2.put("opened_by", c7936j.f17631c);
                jSONObject2.put("reason", c7936j.f17632d);
            } catch (Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (Exception unused3) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "urls", jSONArray);
        }
        Object obj = EnumC9150g.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (Exception unused4) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "origin", obj);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new RunnableC9175o0(webView).run();
    }

    public static void setHtmlExtra(String str) {
        f17469j = str;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f17470k = internalBrowserListener;
    }

    /* JADX INFO: renamed from: a */
    public final ImageButton m20325a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC9174o.m21998b(getResources().getInteger(C7809R.integer.ia_ib_button_size_dp)), AbstractC9174o.m21998b(getResources().getInteger(C7809R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }

    /* JADX INFO: renamed from: a */
    public final LinearLayout m20326a() {
        this.f17473d = new LinearLayout(this);
        this.f17473d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f17473d.setOrientation(1);
        this.f17473d.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f17473d.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC9174o.m21998b(getResources().getInteger(C7809R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        AbstractC9174o.m21995a(linearLayout, AbstractC9174o.m22003d(C7809R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f17475f = m20325a(AbstractC9174o.m22003d(C7809R.drawable.ia_ib_left_arrow));
        this.f17476g = m20325a(AbstractC9174o.m22003d(C7809R.drawable.ia_ib_right_arrow));
        this.f17477h = m20325a(AbstractC9174o.m22003d(C7809R.drawable.ia_ib_refresh));
        this.f17478i = m20325a(AbstractC9174o.m22003d(C7809R.drawable.ia_ib_close));
        linearLayout.addView(this.f17475f);
        linearLayout.addView(this.f17476g);
        linearLayout.addView(this.f17477h);
        linearLayout.addView(this.f17478i);
        WebView webView = new WebView(IAConfigManager.f17654M.f17689u.m20436a());
        this.f17474e = webView;
        webView.setWebViewClient(new C7817g(this));
        this.f17474e.setId(C7809R.id.ia_inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f17474e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f17474e);
        return this.f17473d;
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = f17470k;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(m20326a());
            String stringExtra = getIntent().getStringExtra("spotId");
            this.f17472c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.f17472c)) != null) {
                this.f17471b = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.f17474e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.f17474e);
            this.f17474e.setWebChromeClient(new C7816f(this));
            String stringExtra2 = intent.getStringExtra("extra_url");
            if (!TextUtils.isEmpty(f17469j)) {
                String str = f17469j + "<title>DigitalTurbine Internal Browser</title>";
                f17469j = str;
                this.f17474e.loadDataWithBaseURL(stringExtra2, str, "text/html", "UTF-8", null);
            } else if (TextUtils.isEmpty(stringExtra2)) {
                IAlog.m21950f("Empty url", new Object[0]);
                finish();
            } else if (!AbstractC9154h0.m21968d(stringExtra2)) {
                this.f17474e.loadUrl(stringExtra2);
            } else if (AbstractC9154h0.m21967c(stringExtra2)) {
                try {
                    stringExtra2 = URLDecoder.decode(stringExtra2, C11341A5.f23802O);
                    this.f17474e.loadUrl(stringExtra2);
                } catch (Exception unused) {
                    IAlog.m21950f("Failed to open Url: %s", stringExtra2);
                    finish();
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                intent2.addFlags(268435456);
                try {
                    startActivity(intent2);
                    InternalBrowserListener internalBrowserListener = f17470k;
                    if (internalBrowserListener != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                } catch (ActivityNotFoundException unused2) {
                    IAlog.m21950f("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                }
                finish();
            }
            this.f17475f.setBackgroundColor(0);
            this.f17475f.setOnClickListener(new ViewOnClickListenerC7820j(this));
            this.f17475f.setContentDescription("IABackButton");
            this.f17476g.setBackgroundColor(0);
            this.f17476g.setOnClickListener(new ViewOnClickListenerC7821k(this));
            this.f17476g.setContentDescription("IAForwardButton");
            this.f17477h.setBackgroundColor(0);
            this.f17477h.setOnClickListener(new ViewOnClickListenerC7822l(this));
            this.f17477h.setContentDescription("IARefreshButton");
            this.f17478i.setBackgroundColor(0);
            this.f17478i.setOnClickListener(new ViewOnClickListenerC7823m(this));
            this.f17478i.setContentDescription("IACloseButton");
            AbstractC9174o.m21992a();
            AbstractC9174o.m22005f();
        } catch (Exception unused3) {
            finish();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        LinearLayout linearLayout = this.f17473d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f17474e;
        if (webView != null) {
            webView.removeAllViews();
            AbstractC9195v.m22027a(this.f17474e);
            this.f17474e.destroy();
            this.f17474e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        AbstractC9174o.m22006g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        AbstractC9174o.m22005f();
    }
}
