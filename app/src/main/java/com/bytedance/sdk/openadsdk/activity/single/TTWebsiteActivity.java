package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.C2735zf;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.bgr.C2900lr;
import com.bytedance.sdk.openadsdk.common.C2927ac;
import com.bytedance.sdk.openadsdk.common.C2928aw;
import com.bytedance.sdk.openadsdk.common.tan;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3190di;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.net.HttpHeaders;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class TTWebsiteActivity extends TTBaseActivity {

    /* JADX INFO: renamed from: aw */
    private ILoader f8238aw;
    private float bgr;

    /* JADX INFO: renamed from: bu */
    private ImageView f8239bu;

    /* JADX INFO: renamed from: co */
    private int f8240co;

    /* JADX INFO: renamed from: di */
    private HashMap<String, String> f8241di;

    /* JADX INFO: renamed from: ik */
    private tan f8243ik;

    /* JADX INFO: renamed from: ka */
    private C2634di f8244ka;

    /* JADX INFO: renamed from: mj */
    private String f8246mj;

    /* JADX INFO: renamed from: ri */
    public C2928aw f8247ri;

    /* JADX INFO: renamed from: sf */
    private int f8248sf;
    private ImageView slm;

    /* JADX INFO: renamed from: vr */
    private ImageView f8249vr;
    private C3347di.ri xha;

    /* JADX INFO: renamed from: lr */
    private String f8245lr = null;

    /* JADX INFO: renamed from: fi */
    private boolean f8242fi = false;

    /* JADX INFO: renamed from: lr */
    private void m10754lr(final wjv wjvVar, String str, String str2, String str3) {
        C2634di c2634di;
        if (wjvVar != null) {
            this.f8246mj = wjvVar.mvf();
        }
        if (!TextUtils.isEmpty(this.f8246mj)) {
            this.f8238aw = C3611lr.m16744ri().m16746lr();
            int iM16747ri = C3611lr.m16744ri().m16747ri(this.f8238aw, this.f8246mj);
            this.f8248sf = iM16747ri;
            this.f8240co = iM16747ri > 0 ? 2 : 0;
        }
        C3191fi c3191fi = new C3191fi(this);
        if (Build.VERSION.SDK_INT >= 35) {
            c3191fi.setFitsSystemWindows(true);
        }
        c3191fi.setBackgroundColor(-1);
        c3191fi.setId(520093726);
        c3191fi.setOrientation(1);
        c3191fi.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(c3191fi);
            C2928aw c2928aw = new C2928aw(this, wjvVar, ViewHierarchyConstants.TAG_KEY, true);
            this.f8247ri = c2928aw;
            View viewM11244ka = c2928aw.m11244ka();
            this.f8247ri.m11247ri();
            viewM11244ka.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            viewM11244ka.setVisibility(0);
            c3191fi.addView(viewM11244ka);
            final TextView textView = (TextView) viewM11244ka.findViewById(slm.f13297ri);
            viewM11244ka.findViewById(slm.f13284lr);
            final C3190di c3190di = (C3190di) findViewById(520093743);
            if (c3190di != null) {
                c3190di.setProgress(0);
                c3190di.setMax(100);
            }
            ImageView imageView = (ImageView) findViewById(slm.f13306ud);
            this.f8249vr = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.9
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TTWebsiteActivity.this.f8244ka != null) {
                            if (TTWebsiteActivity.this.xha != null) {
                                TTWebsiteActivity.this.xha.mo15059ri();
                            }
                            if (TTWebsiteActivity.this.f8244ka.jbs()) {
                                TTWebsiteActivity.this.f8244ka.m9780qt();
                            } else {
                                TTWebsiteActivity.this.finish();
                            }
                        }
                    }
                });
            }
            ImageView imageView2 = (ImageView) findViewById(slm.hpn);
            this.slm = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.m10759ri(view);
                    }
                });
            }
            ImageView imageView3 = (ImageView) viewM11244ka.findViewById(520093740);
            this.f8239bu = imageView3;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.m10760ri(c3190di, wjvVar, view);
                    }
                });
            }
            try {
                C2634di c2634diM11243ik = this.f8247ri.m11243ik();
                this.f8244ka = c2634diM11243ik;
                WebView webView = c2634diM11243ik.getWebView();
                if (webView != null) {
                    this.xha = new C3347di(webView, wjvVar, this, false).m15051ik();
                }
                this.f8247ri.m11250ri(true);
                if (this.f8244ka.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.f8244ka.getParent()).removeView(this.f8244ka);
                }
                c3191fi.addView(this.f8244ka, new ViewGroup.LayoutParams(-1, -1));
                this.f8245lr = str2;
                if (!TextUtils.isEmpty(str)) {
                    String strEncode = URLEncoder.encode(str);
                    if (this.f8245lr.contains("?")) {
                        this.f8245lr += "&gdid_encrypted=" + strEncode;
                    } else {
                        this.f8245lr += "?gdid_encrypted=" + strEncode;
                    }
                }
                if (this.f8245lr == null || (c2634di = this.f8244ka) == null) {
                    finish();
                    return;
                }
                WebView webView2 = c2634di.getWebView();
                if (webView2 != null) {
                    WebSettings settings = webView2.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                HashMap<String, String> map = new HashMap<>();
                map.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
                this.f8241di = map;
                try {
                    this.f8244ka.m9785ri(this.f8245lr, map);
                } catch (Throwable unused2) {
                    this.f8244ka.m9767a_(this.f8245lr);
                }
                this.f8244ka.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.11
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView3, int i) {
                        super.onProgressChanged(webView3, i);
                        if (c3190di == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i == 100) {
                            c3190di.setVisibility(8);
                            webView3.canGoBack();
                        } else {
                            c3190di.setVisibility(0);
                            c3190di.setProgress(i);
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView3, String str4) {
                        TextView textView2;
                        if (TextUtils.isEmpty(str4) || (textView2 = textView) == null) {
                            return;
                        }
                        textView2.setText(str4);
                        TTWebsiteActivity.this.f8247ri.m11246lr(webView3.getUrl());
                    }
                });
                this.f8244ka.setWebViewClient(new C2634di.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.2
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView3, String str4) {
                        super.onPageFinished(webView3, str4);
                        if (!TTWebsiteActivity.this.f8242fi || TTWebsiteActivity.this.f8247ri == null) {
                            return;
                        }
                        TTWebsiteActivity.this.f8247ri.m11248ri(webView3, TTWebsiteActivity.this.xha);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, int i, String str4, String str5) {
                        super.onReceivedError(webView3, i, str4, str5);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView3, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView3, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView3, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView3, String str4) {
                        try {
                            Uri uri = Uri.parse(str4);
                            if (!C2724nr.m10260ri(str4)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    C2722lr.m10241ri(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView3, str4);
                    }
                });
                if (this.f8244ka != null && webView2 != null) {
                    webView2.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.3

                        /* JADX INFO: renamed from: lr */
                        private final int f8259lr = C3299nr.m14640lr();

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    TTWebsiteActivity.this.bgr = motionEvent.getRawY();
                                    return false;
                                }
                                if (actionMasked != 2) {
                                    return false;
                                }
                                float rawY = motionEvent.getRawY();
                                if (!TTWebsiteActivity.this.f8242fi) {
                                    return false;
                                }
                                if (rawY - TTWebsiteActivity.this.bgr > this.f8259lr) {
                                    TTWebsiteActivity.this.f8247ri.m11247ri();
                                }
                                if (rawY - TTWebsiteActivity.this.bgr >= (-this.f8259lr)) {
                                    return false;
                                }
                                TTWebsiteActivity.this.f8247ri.m11245lr();
                                return false;
                            } catch (Throwable th) {
                                Log.e("TTAD.TTWebsiteActivity", "TouchRecordTool onTouch error", th);
                                return false;
                            }
                        }
                    });
                }
                C3349ik.m15076lr(webView2);
            } catch (Exception e) {
                C2707ac.m10206ri("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m10758ri(Context context, wjv wjvVar, String str) {
        if (context == null) {
            return;
        }
        C3414ik.m15531ri(System.currentTimeMillis(), wjvVar, str, "open_policy");
        if (TextUtils.isEmpty(wjvVar.ckl().m14194ik())) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTWebsiteActivity.class);
        if (wjvVar != null) {
            intent.putExtra("meta_index", C3197dw.m13337ri().m13348ri(wjvVar));
        }
        C2722lr.m10241ri(context, intent, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public /* synthetic */ void m10759ri(View view) {
        C2634di c2634di = this.f8244ka;
        if (c2634di == null || !c2634di.m9789sf()) {
            return;
        }
        this.f8244ka.m9771co();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public /* synthetic */ void m10760ri(final C3190di c3190di, final wjv wjvVar, View view) {
        final C2927ac c2927ac = new C2927ac(this, true);
        c2927ac.setOnMenuItemClickListener(new C2927ac.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.10
            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
            /* JADX INFO: renamed from: ik */
            public void mo10652ik() {
                if (TTWebsiteActivity.this.f8244ka != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = TTWebsiteActivity.this.f8244ka.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        C2722lr.m10241ri(TTWebsiteActivity.this, intent, null);
                    }
                    c2927ac.m11239ri();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
            /* JADX INFO: renamed from: ka */
            public void mo10653ka() {
                if (TTWebsiteActivity.this.f8243ik == null) {
                    TTWebsiteActivity.this.f8243ik = new tan(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.f8243ik.m11439ri(wjvVar);
                    TTWebsiteActivity.this.f8243ik.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.f8243ik.show();
                c2927ac.m11239ri();
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
            /* JADX INFO: renamed from: lr */
            public void mo10654lr() {
                ClipboardManager clipboardManager;
                if (TTWebsiteActivity.this.f8244ka != null) {
                    String url = TTWebsiteActivity.this.f8244ka.getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTWebsiteActivity.this.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                c2927ac.m11239ri();
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
            /* JADX INFO: renamed from: ri */
            public void mo10655ri() {
                C2634di c2634di = TTWebsiteActivity.this.f8244ka;
                if (c2634di == null || c2634di.getUrl() == null || TTWebsiteActivity.this.f8241di == null) {
                    return;
                }
                C3190di c3190di2 = c3190di;
                if (c3190di2 != null) {
                    c3190di2.setVisibility(0);
                    c3190di.setProgress(0);
                }
                c2634di.xha();
                String url = c2634di.getUrl();
                if (url != null) {
                    c2634di.m9767a_(url);
                }
                c2927ac.m11239ri();
            }
        });
        c2927ac.m11240ri(view);
    }

    /* JADX INFO: renamed from: ri */
    private void m10761ri(final wjv wjvVar, String str, String str2, String str3) {
        C2634di c2634di;
        C3191fi c3191fi = new C3191fi(this);
        if (Build.VERSION.SDK_INT >= 35) {
            c3191fi.setFitsSystemWindows(true);
        }
        c3191fi.setBackgroundColor(-1);
        c3191fi.setId(520093726);
        c3191fi.setOrientation(1);
        c3191fi.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(c3191fi);
            int iM16589lr = C3583qd.m16589lr(this, 5.0f);
            int iM16589lr2 = C3583qd.m16589lr(this, 8.0f);
            int iM16589lr3 = C3583qd.m16589lr(this, 10.0f);
            int iM16589lr4 = C3583qd.m16589lr(this, 12.0f);
            int iM16589lr5 = C3583qd.m16589lr(this, 14.0f);
            int iM16589lr6 = C3583qd.m16589lr(this, 20.0f);
            int iM16589lr7 = C3583qd.m16589lr(this, 24.0f);
            int iM16589lr8 = C3583qd.m16589lr(this, 40.0f);
            int iM16589lr9 = C3583qd.m16589lr(this, 44.0f);
            int iM16589lr10 = C3583qd.m16589lr(this, 191.0f);
            com.bytedance.sdk.openadsdk.core.p217di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p217di.xha(this);
            xhaVar.setGravity(15);
            xhaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iM16589lr9));
            C3193ka c3193ka = new C3193ka(this);
            c3193ka.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM16589lr8, iM16589lr9);
            layoutParams.setMarginStart(iM16589lr2);
            c3193ka.setLayoutParams(layoutParams);
            c3193ka.setClickable(true);
            c3193ka.setFocusable(true);
            c3193ka.setPadding(iM16589lr5, iM16589lr4, iM16589lr5, iM16589lr4);
            c3193ka.setImageDrawable(C2729uq.m10303ik(this, "tt_ad_arrow_backward"));
            final C3193ka c3193ka2 = new C3193ka(this);
            c3193ka2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iM16589lr8, iM16589lr9);
            layoutParams2.addRule(17, 520093720);
            c3193ka2.setLayoutParams(layoutParams2);
            c3193ka2.setClickable(true);
            c3193ka2.setFocusable(true);
            c3193ka2.setPadding(iM16589lr4, iM16589lr5, iM16589lr4, iM16589lr5);
            c3193ka2.setImageDrawable(C2729uq.m10303ik(this, "tt_ad_xmark"));
            C3195mj c3195mj = new C3195mj(this);
            c3195mj.setId(slm.f13288nh);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iM16589lr10, iM16589lr7);
            layoutParams3.setMarginStart(iM16589lr);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            c3195mj.setLayoutParams(layoutParams3);
            c3195mj.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            c3195mj.setGravity(17);
            c3195mj.setSingleLine(true);
            c3195mj.setTextColor(Color.parseColor("#222222"));
            c3195mj.setTextSize(17.0f);
            C3193ka c3193ka3 = new C3193ka(this);
            c3193ka3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iM16589lr8, iM16589lr9);
            layoutParams4.addRule(16, 520093742);
            c3193ka3.setLayoutParams(layoutParams4);
            c3193ka3.setPadding(iM16589lr3, iM16589lr4, iM16589lr3, iM16589lr4);
            c3193ka3.setImageDrawable(C2729uq.m10303ik(this, "tt_ad_link"));
            C3193ka c3193ka4 = new C3193ka(this);
            c3193ka4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iM16589lr8, iM16589lr9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(iM16589lr2);
            c3193ka4.setLayoutParams(layoutParams5);
            c3193ka4.setPadding(iM16589lr4, iM16589lr6, iM16589lr4, iM16589lr6);
            c3193ka4.setImageDrawable(C2729uq.m10303ik(this, "tt_ad_threedots"));
            final C3190di c3190di = new C3190di(this, null, R.style.Widget.ProgressBar.Horizontal);
            c3190di.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, C3583qd.m16589lr(this, 2.0f));
            layoutParams6.addRule(12);
            c3190di.setLayoutParams(layoutParams6);
            c3190di.setProgress(1);
            c3190di.setProgressDrawable(C3586sf.m16645ri(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, C3583qd.m16589lr(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            xhaVar.addView(c3193ka);
            xhaVar.addView(c3193ka2);
            xhaVar.addView(c3195mj);
            xhaVar.addView(c3193ka3);
            xhaVar.addView(c3193ka4);
            xhaVar.addView(c3190di);
            xhaVar.addView(view);
            c3191fi.addView(xhaVar);
            try {
                C2634di c2634di2 = new C2634di(this, C2634di.ik.PRIVACY);
                this.f8244ka = c2634di2;
                c2634di2.setBackgroundColor(-1);
                c3191fi.addView(this.f8244ka, new ViewGroup.LayoutParams(-1, -1));
                c3193ka.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.f8244ka.jbs()) {
                            TTWebsiteActivity.this.f8244ka.m9780qt();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                c3193ka2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                c3193ka2.setVisibility(4);
                c3193ka2.setClickable(false);
                if (!TextUtils.isEmpty(str3)) {
                    c3195mj.setText(str3);
                }
                c3193ka3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.f8244ka.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            return;
                        }
                        intent.setData(Uri.parse(url));
                        C2722lr.m10241ri(TTWebsiteActivity.this, intent, null);
                    }
                });
                c3193ka4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.f8243ik == null) {
                            TTWebsiteActivity.this.f8243ik = new tan(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.f8243ik.m11439ri(wjvVar);
                            TTWebsiteActivity.this.f8243ik.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.f8243ik.show();
                    }
                });
                this.f8245lr = str2;
                if (!TextUtils.isEmpty(str)) {
                    String strEncode = URLEncoder.encode(str);
                    if (this.f8245lr.contains("?")) {
                        this.f8245lr += "&gdid_encrypted=" + strEncode;
                    } else {
                        this.f8245lr += "?gdid_encrypted=" + strEncode;
                    }
                }
                if (this.f8245lr == null || (c2634di = this.f8244ka) == null) {
                    finish();
                    return;
                }
                WebView webView = c2634di.getWebView();
                if (webView != null) {
                    WebSettings settings = webView.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                }
                HashMap map = new HashMap();
                map.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
                try {
                    this.f8244ka.m9785ri(this.f8245lr, map);
                } catch (Throwable unused2) {
                    this.f8244ka.m9767a_(this.f8245lr);
                }
                this.f8244ka.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.7
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView2, int i) {
                        super.onProgressChanged(webView2, i);
                        if (c3190di == null || TTWebsiteActivity.this.isFinishing()) {
                            return;
                        }
                        if (i != 100) {
                            c3190di.setVisibility(0);
                            c3190di.setProgress(i);
                            return;
                        }
                        c3190di.setVisibility(8);
                        if (webView2.canGoBack()) {
                            c3193ka2.setVisibility(0);
                            c3193ka2.setClickable(true);
                        } else {
                            c3193ka2.setVisibility(4);
                            c3193ka2.setClickable(false);
                        }
                    }
                });
                this.f8244ka.setWebViewClient(new C2634di.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity.8
                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str4) {
                        super.onPageFinished(webView2, str4);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, int i, String str4, String str5) {
                        super.onReceivedError(webView2, i, str4, str5);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView2, webResourceRequest, webResourceError);
                        webResourceError.getErrorCode();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                        Objects.toString(webResourceResponse);
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView2, String str4) {
                        try {
                            Uri uri = Uri.parse(str4);
                            if (!C2724nr.m10260ri(str4)) {
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(uri);
                                    intent.addFlags(268435456);
                                    C2722lr.m10241ri(TTWebsiteActivity.this, intent, null);
                                    return true;
                                } catch (Throwable unused3) {
                                    return true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return super.shouldOverrideUrlLoading(webView2, str4);
                    }
                });
                C3349ik.m15076lr(this.f8244ka.getWebView());
            } catch (Exception e) {
                C2707ac.m10206ri("TTAD.TTWebsiteActivity", "onCreate: ", e);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3299nr.m14641lr(getApplicationContext());
        if (!C3332vr.m14975fi()) {
            finish();
            return;
        }
        C2900lr.m11162ri(this);
        wjv wjvVarM13350ri = C3197dw.m13337ri().m13350ri(C3197dw.m13336ri(getIntent()));
        if (wjvVarM13350ri == null) {
            finish();
            return;
        }
        String strM14568zf = wjvVarM13350ri.m14568zf();
        String strM14194ik = wjvVarM13350ri.ckl().m14194ik();
        String strM14195ka = wjvVarM13350ri.ckl().m14195ka();
        if (TextUtils.isEmpty(strM14194ik)) {
            finish();
            return;
        }
        boolean zOry = C3299nr.m14639ka().ory();
        this.f8242fi = zOry;
        if (wjvVarM13350ri == null || !zOry) {
            m10761ri(wjvVarM13350ri, strM14568zf, strM14194ik, strM14195ka);
        } else {
            m10754lr(wjvVarM13350ri, strM14568zf, strM14194ik, strM14195ka);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        C2634di c2634di = this.f8244ka;
        if (c2634di != null) {
            C2735zf.m10345ri(c2634di);
        }
        super.onDestroy();
    }
}
