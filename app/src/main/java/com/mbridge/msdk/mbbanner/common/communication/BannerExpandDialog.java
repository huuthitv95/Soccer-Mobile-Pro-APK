package com.mbridge.msdk.mbbanner.common.communication;

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
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.mbsignalcommon.mraid.C13380a;
import com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.setting.util.C13645a;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BannerExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a */
    private final String f36593a;

    /* JADX INFO: renamed from: b */
    private String f36594b;

    /* JADX INFO: renamed from: c */
    private boolean f36595c;

    /* JADX INFO: renamed from: d */
    private FrameLayout f36596d;

    /* JADX INFO: renamed from: e */
    private WindVaneWebView f36597e;

    /* JADX INFO: renamed from: f */
    private TextView f36598f;

    /* JADX INFO: renamed from: g */
    private String f36599g;

    /* JADX INFO: renamed from: h */
    private List<CampaignEx> f36600h;

    /* JADX INFO: renamed from: i */
    private InterfaceC13282a f36601i;

    /* JADX INFO: renamed from: j */
    private InterfaceC13381b f36602j;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog$a */
    class ViewOnClickListenerC13271a implements View.OnClickListener {
        ViewOnClickListenerC13271a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BannerExpandDialog.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog$b */
    class C13272b extends C13377b {

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog$b$a */
        class a implements ValueCallback<String> {
            a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        C13272b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + C13645a.m39758a().m39764b(), new a());
            BannerExpandDialog.this.m38138c();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog$c */
    class C13273c implements InterfaceC13083a {
        C13273c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            BannerExpandDialog.this.m38133a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            BannerExpandDialog.this.m38133a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog$d */
    class DialogInterfaceOnDismissListenerC13274d implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC13274d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (BannerExpandDialog.this.f36601i != null) {
                BannerExpandDialog.this.f36601i.mo38173a(false);
            }
            BannerExpandDialog.this.f36597e.loadDataWithBaseURL(null, "", "text/html", C11341A5.f23802O, null);
            BannerExpandDialog.this.f36596d.removeView(BannerExpandDialog.this.f36597e);
            BannerExpandDialog.this.f36597e.release();
            BannerExpandDialog.this.f36597e = null;
            BannerExpandDialog.this.f36601i = null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.communication.BannerExpandDialog$e */
    class C13275e implements InterfaceC13381b {
        C13275e() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public void close() {
            BannerExpandDialog.this.dismiss();
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
                if (BannerExpandDialog.this.f36597e == null || System.currentTimeMillis() - BannerExpandDialog.this.f36597e.lastTouchTime <= C12704a.f33795d || !C12704a.m34808a((CampaignEx) BannerExpandDialog.this.f36600h.get(0), BannerExpandDialog.this.f36597e.getUrl(), C12704a.f33792a)) {
                    C13219q0.m37816b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f36600h.size() > 1) {
                        C13008c.m36588n().m36542d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f36601i != null) {
                        BannerExpandDialog.this.f36601i.mo38174a(true, str);
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37817b("BannerExpandDialog", "open", th);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
        public void useCustomClose(boolean z) {
            try {
                BannerExpandDialog.this.f36598f.setVisibility(z ? 4 : 0);
            } catch (Throwable th) {
                C13219q0.m37817b("BannerExpandDialog", "useCustomClose", th);
            }
        }
    }

    public BannerExpandDialog(Context context, Bundle bundle, InterfaceC13282a interfaceC13282a) {
        super(context);
        this.f36593a = "BannerExpandDialog";
        this.f36602j = new C13275e();
        if (bundle != null) {
            this.f36594b = bundle.getString("url");
            this.f36595c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f36601i = interfaceC13282a;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        m38135b();
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f36599g = str;
        this.f36600h = list;
    }

    /* JADX INFO: renamed from: b */
    private void m38135b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f36596d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f36597e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f36596d.addView(this.f36597e);
        TextView textView = new TextView(getContext());
        this.f36598f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f36598f.setLayoutParams(layoutParams);
        this.f36598f.setVisibility(this.f36595c ? 4 : 0);
        this.f36598f.setOnClickListener(new ViewOnClickListenerC13271a());
        BitmapDrawable bitmapDrawableM36524a = C13008c.m36588n().m36524a(this.f36599g, 296);
        if (bitmapDrawableM36524a != null) {
            ImageView imageView = new ImageView(C13008c.m36588n().m36542d());
            C13229v0.m37880a(imageView, bitmapDrawableM36524a, this.f36596d.getResources().getDisplayMetrics());
            this.f36596d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f36596d.addView(this.f36598f);
        setContentView(this.f36596d);
        m38133a();
        this.f36597e.setWebViewListener(new C13272b());
        this.f36597e.setObject(this.f36602j);
        this.f36597e.loadUrl(this.f36594b);
        List<CampaignEx> list = this.f36600h;
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = this.f36600h.get(0);
            if (campaignEx != null) {
                C13185b1.m37632a(this.f36597e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(C13008c.m36588n().m36542d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f), C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new C13273c());
                this.f36596d.addView(mBAdChoice, layoutParams2);
            }
        }
        setOnDismissListener(new DialogInterfaceOnDismissListenerC13274d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38138c() {
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
            this.f36597e.getLocationInWindow(iArr);
            C13380a c13380aM38682a = C13380a.m38682a();
            WindVaneWebView windVaneWebView = this.f36597e;
            c13380aM38682a.m38691b(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), this.f36597e.getHeight());
            C13380a c13380aM38682a2 = C13380a.m38682a();
            WindVaneWebView windVaneWebView2 = this.f36597e;
            c13380aM38682a2.m38687a(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), this.f36597e.getHeight());
            C13380a.m38682a().m38690b(this.f36597e, fM37760n, fM37757m);
            C13380a.m38682a().m38686a(this.f36597e, iIntValue, iIntValue2);
            C13380a.m38682a().m38689a(this.f36597e, map);
            C13380a.m38682a().m38684a(this.f36597e);
        } catch (Throwable th) {
            C13219q0.m37817b("BannerExpandDialog", "notifyMraid", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38133a() {
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
}
