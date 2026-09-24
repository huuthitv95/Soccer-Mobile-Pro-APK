package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.webview.C13168a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.videocommon.download.C14205d;
import com.mbridge.msdk.videocommon.download.C14207f;
import com.mbridge.msdk.videocommon.setting.C14222b;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {

    /* JADX INFO: renamed from: P */
    private String f40199P;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeAlertWebview$a */
    class C13988a extends C13377b {
        C13988a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
            String str;
            super.mo34467a(webView, i);
            C13219q0.m37816b("MBridgeAlertWebview", "readyState  :  " + i);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            if (mBridgeAlertWebview.f40293u) {
                return;
            }
            boolean z = i == 1;
            mBridgeAlertWebview.f40292t = z;
            if (z) {
                str = "readyState state is " + i;
            } else {
                str = "";
            }
            String str2 = str;
            MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
            C13148j.m37383a(mBridgeAlertWebview2.f40201a, mBridgeAlertWebview2.f40202b, mBridgeAlertWebview2.f40199P, MBridgeAlertWebview.this.unitId, i, str2, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C13219q0.m37816b("MBridgeAlertWebview", "finish+" + str);
            C13392f.m38726a().m38727a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C13219q0.m37816b("MBridgeAlertWebview", "onReceivedError");
            if (MBridgeAlertWebview.this.f40293u) {
                return;
            }
            C13219q0.m37813a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            C13148j.m37383a(mBridgeAlertWebview.f40201a, mBridgeAlertWebview.f40202b, mBridgeAlertWebview.f40199P, MBridgeAlertWebview.this.unitId, 2, str, 1);
            MBridgeAlertWebview.this.f40293u = true;
        }
    }

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected String getURL() {
        if (TextUtils.isEmpty(this.unitId)) {
            return "";
        }
        String strM42710c = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.unitId, false).m42710c();
        this.f40199P = strM42710c;
        return !TextUtils.isEmpty(strM42710c) ? C14205d.m42529a().m42531a(this.f40199P) : "";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(C14177b c14177b) {
        String url = getURL();
        if (!this.f40205e || this.f40202b == null || TextUtils.isEmpty(url)) {
            this.notifyListener.mo41600a(101, "");
            return;
        }
        C13168a c13168a = new C13168a(this.f40202b);
        c13168a.m37548a(this.f40202b.getAppName());
        this.f40288p.setDownloadListener(c13168a);
        this.f40288p.setCampaignId(this.f40202b.getId());
        setCloseVisible(8);
        this.f40288p.setApiManagerJSFactory(c14177b);
        this.f40288p.setWebViewListener(new C13988a());
        setHtmlSource(C14207f.m42533a().m42534a(url));
        this.f40292t = false;
        if (TextUtils.isEmpty(this.f40291s)) {
            C13219q0.m37813a(MBridgeBaseView.TAG, "load url:" + url);
            this.f40288p.loadUrl(url);
        } else {
            C13219q0.m37813a(MBridgeBaseView.TAG, "load html...");
            this.f40288p.loadDataWithBaseURL(url, this.f40291s, "text/html", "UTF-8", null);
        }
        this.f40288p.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f40286n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        C13148j.m37381a(this.f40201a, this.f40202b, this.f40199P, this.unitId, 2, 1);
    }
}
