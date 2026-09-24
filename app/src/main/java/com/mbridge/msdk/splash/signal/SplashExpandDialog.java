package com.mbridge.msdk.splash.signal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdError;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.utils.C12704a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.mbsignalcommon.mraid.C13380a;
import com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.C13645a;
import com.mbridge.msdk.splash.middle.InterfaceC13661a;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class SplashExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a */
    private final String f38372a;

    /* JADX INFO: renamed from: b */
    private String f38373b;

    /* JADX INFO: renamed from: c */
    private boolean f38374c;

    /* JADX INFO: renamed from: d */
    private FrameLayout f38375d;

    /* JADX INFO: renamed from: e */
    private WindVaneWebView f38376e;

    /* JADX INFO: renamed from: f */
    private TextView f38377f;

    /* JADX INFO: renamed from: g */
    private String f38378g;

    /* JADX INFO: renamed from: h */
    private List<CampaignEx> f38379h;

    /* JADX INFO: renamed from: i */
    private InterfaceC13661a f38380i;

    /* JADX INFO: renamed from: j */
    private InterfaceC13381b f38381j;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.SplashExpandDialog$a */
    class ViewOnClickListenerC13672a implements View.OnClickListener {
        ViewOnClickListenerC13672a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.SplashExpandDialog$b */
    class C13673b extends C13377b {

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.SplashExpandDialog$b$a */
        class a implements ValueCallback<String> {
            a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        C13673b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + C13645a.m39758a().m39764b(), new a());
            SplashExpandDialog.this.m40056c();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.SplashExpandDialog$c */
    class C13674c implements InterfaceC13083a {
        C13674c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            SplashExpandDialog.this.m40051a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            SplashExpandDialog.this.m40051a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.SplashExpandDialog$d */
    class DialogInterfaceOnDismissListenerC13675d implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC13675d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.f38380i != null) {
                SplashExpandDialog.this.f38380i.mo39872a(false);
                SplashExpandDialog.this.f38380i.close();
            }
            SplashExpandDialog.this.f38376e.loadDataWithBaseURL(null, "", "text/html", C11341A5.f23802O, null);
            SplashExpandDialog.this.f38375d.removeView(SplashExpandDialog.this.f38376e);
            SplashExpandDialog.this.f38376e.release();
            SplashExpandDialog.this.f38376e = null;
            SplashExpandDialog.this.f38380i = null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.signal.SplashExpandDialog$e */
    class C13676e implements InterfaceC13381b {
        C13676e() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public void close() {
            SplashExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public void expand(String str, boolean z) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public CampaignEx getMraidCampaign() {
            return null;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public void open(String str) {
            try {
                if (SplashExpandDialog.this.f38376e == null || System.currentTimeMillis() - SplashExpandDialog.this.f38376e.lastTouchTime <= C12704a.f33795d || !C12704a.m34808a((CampaignEx) SplashExpandDialog.this.f38379h.get(0), SplashExpandDialog.this.f38376e.getUrl(), C12704a.f33792a)) {
                    C13219q0.m37816b("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.f38379h.size() > 1) {
                        C13008c.m36588n().m36542d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f38380i != null) {
                        SplashExpandDialog.this.f38380i.mo39873a(true, str);
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37817b("SplashExpandDialog", "open", th);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public void useCustomClose(boolean z) {
            try {
                SplashExpandDialog.this.f38377f.setVisibility(z ? 4 : 0);
            } catch (Throwable th) {
                C13219q0.m37817b("SplashExpandDialog", "useCustomClose", th);
            }
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, InterfaceC13661a interfaceC13661a) {
        super(context);
        this.f38372a = "SplashExpandDialog";
        this.f38381j = new C13676e();
        if (bundle != null) {
            this.f38373b = bundle.getString("url");
            this.f38374c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f38380i = interfaceC13661a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m40051a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m40053b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f38375d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f38376e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f38375d.addView(this.f38376e);
        TextView textView = new TextView(getContext());
        this.f38377f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f38377f.setLayoutParams(layoutParams);
        this.f38377f.setVisibility(this.f38374c ? 4 : 0);
        this.f38377f.setOnClickListener(new ViewOnClickListenerC13672a());
        this.f38375d.addView(this.f38377f);
        setContentView(this.f38375d);
        m40051a();
        this.f38376e.setWebViewListener(new C13673b());
        this.f38376e.setObject(this.f38381j);
        this.f38376e.loadUrl(this.f38373b);
        List<CampaignEx> list = this.f38379h;
        if (list != null && !list.isEmpty()) {
            CampaignEx campaignEx = this.f38379h.get(0);
            if (campaignEx != null) {
                C13185b1.m37632a(this.f38376e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(C13008c.m36588n().m36542d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f), C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new C13674c());
                this.f38375d.addView(mBAdChoice, layoutParams2);
            }
        }
        BitmapDrawable bitmapDrawableM36524a = C13008c.m36588n().m36524a(this.f38378g, 297);
        if (bitmapDrawableM36524a != null) {
            ImageView imageView = new ImageView(C13008c.m36588n().m36542d());
            C13229v0.m37880a(imageView, bitmapDrawableM36524a, this.f38375d.getResources().getDisplayMetrics());
            this.f38375d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        setOnDismissListener(new DialogInterfaceOnDismissListenerC13675d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m40056c() {
        String str;
        try {
            int i = C13008c.m36588n().m36542d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i == 2) {
                str = C11744X3.i.f26320C;
            } else {
                str = i == 1 ? C11744X3.i.f26322D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float fM37760n = C13211m0.m37760n(C13008c.m36588n().m36542d());
            float fM37757m = C13211m0.m37757m(C13008c.m36588n().m36542d());
            HashMap mapM37776v = C13211m0.m37776v(C13008c.m36588n().m36542d());
            int iIntValue = ((Integer) mapM37776v.get("width")).intValue();
            int iIntValue2 = ((Integer) mapM37776v.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "expanded");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            int[] iArr = new int[2];
            this.f38376e.getLocationInWindow(iArr);
            C13380a c13380aM38682a = C13380a.m38682a();
            WindVaneWebView windVaneWebView = this.f38376e;
            c13380aM38682a.m38691b(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), this.f38376e.getHeight());
            C13380a c13380aM38682a2 = C13380a.m38682a();
            WindVaneWebView windVaneWebView2 = this.f38376e;
            c13380aM38682a2.m38687a(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), this.f38376e.getHeight());
            C13380a.m38682a().m38690b(this.f38376e, fM37760n, fM37757m);
            C13380a.m38682a().m38686a(this.f38376e, iIntValue, iIntValue2);
            C13380a.m38682a().m38689a(this.f38376e, map);
            C13380a.m38682a().m38684a(this.f38376e);
        } catch (Throwable th) {
            C13219q0.m37817b("SplashExpandDialog", "notifyMraid", th);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        m40053b();
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f38378g = str;
        this.f38379h = list;
    }
}
