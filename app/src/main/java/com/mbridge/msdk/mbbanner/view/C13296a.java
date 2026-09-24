package com.mbridge.msdk.mbbanner.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.utils.C12704a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.C13349b;
import com.mbridge.msdk.setting.util.C13645a;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.view.a */
/* JADX INFO: compiled from: BannerWebViewClient.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13296a extends C13349b {

    /* JADX INFO: renamed from: c */
    private final String f36781c = "BannerWebViewClient";

    /* JADX INFO: renamed from: d */
    String f36782d;

    /* JADX INFO: renamed from: e */
    List<CampaignEx> f36783e;

    /* JADX INFO: renamed from: f */
    InterfaceC13282a f36784f;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.view.a$a */
    /* JADX INFO: compiled from: BannerWebViewClient.java */
    class a implements ValueCallback<String> {
        a() {
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
        }
    }

    public C13296a(String str, List<CampaignEx> list, InterfaceC13282a interfaceC13282a) {
        this.f36782d = str;
        this.f36783e = list;
        this.f36784f = interfaceC13282a;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        CampaignEx campaignEx;
        super.onPageStarted(webView, str, bitmap);
        try {
            m38345a(webView, "javascript:" + C13645a.m39758a().m39764b());
            List<CampaignEx> list = this.f36783e;
            if (list == null || list.isEmpty() || (campaignEx = this.f36783e.get(0)) == null || !campaignEx.isActiveOm()) {
                return;
            }
            m38345a(webView, "javascript:" + MBridgeConstans.OMID_JS_SERVICE_CONTENT);
        } catch (Throwable th) {
            C13219q0.m37817b("BannerWebViewClient", "onPageStarted", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.C13349b, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            C13219q0.m37816b("BannerWebViewClient", "Use html to open url.");
            BaseWebView baseWebView = (BaseWebView) webView;
            if (System.currentTimeMillis() - baseWebView.lastTouchTime > C12704a.f33795d && C12704a.m34808a(this.f36783e.get(0), baseWebView.getUrl(), C12704a.f33793b)) {
                return false;
            }
            if (this.f36783e.size() > 1) {
                C13008c.m36588n().m36542d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            InterfaceC13282a interfaceC13282a = this.f36784f;
            if (interfaceC13282a != null) {
                interfaceC13282a.mo38174a(false, str);
            }
            return true;
        } catch (Throwable th) {
            C13219q0.m37817b("BannerWebViewClient", "shouldOverrideUrlLoading", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38345a(WebView webView, String str) {
        webView.evaluateJavascript(str, new a());
    }
}
