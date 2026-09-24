package com.mbridge.msdk.advanced.manager;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.common.C12654c;
import com.mbridge.msdk.advanced.report.C12663a;
import com.mbridge.msdk.advanced.signal.C12675a;
import com.mbridge.msdk.advanced.signal.C12676b;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.videocommon.download.C14203b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.d */
/* JADX INFO: compiled from: ResManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12658d {

    /* JADX INFO: renamed from: a */
    private static String f33499a = "ResManager";

    /* JADX INFO: renamed from: b */
    private static int f33500b = 1;

    /* JADX INFO: renamed from: c */
    public static C13015e f33501c = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.d$a */
    /* JADX INFO: compiled from: ResManager.java */
    class a extends C13377b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f33502a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f33503b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CampaignEx f33504c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ MBNativeAdvancedView f33505d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f33506e;

        a(String str, String str2, CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, long j) {
            this.f33502a = str;
            this.f33503b = str2;
            this.f33504c = campaignEx;
            this.f33505d = mBNativeAdvancedView;
            this.f33506e = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
            super.mo34467a(webView, i);
            if (i != 1) {
                this.f33505d.setH5Ready(false);
                C13219q0.m37813a("WindVaneWebView", "======渲染失败");
                C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33504c, this.f33503b, "readyState 2", this.f33506e, 3);
                return;
            }
            C12654c.m34379a(this.f33502a + this.f33503b + this.f33504c.getRequestId(), true);
            this.f33505d.setH5Ready(true);
            C13219q0.m37813a("WindVaneWebView", "======渲染成功：ready");
            C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33504c, this.f33503b, "", this.f33506e, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f33504c.isHasMBTplMark()) {
                C12654c.m34379a(this.f33502a + this.f33503b + this.f33504c.getRequestId(), true);
                this.f33505d.setH5Ready(true);
                C13219q0.m37813a("WindVaneWebView", "======渲染成功：finish");
                C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33504c, this.f33503b, "", this.f33506e, 1);
            }
            C12675a.m34573a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f33505d.setH5Ready(false);
            C13219q0.m37813a("WindVaneWebView", "======渲染失败");
            C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33504c, this.f33503b, "error code:" + i + str, this.f33506e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.f33505d.setH5Ready(false);
            C13219q0.m37813a("WindVaneWebView", "======渲染失败");
            C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33504c, this.f33503b, "error url:" + sslError.getUrl(), this.f33506e, 3);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.d$b */
    /* JADX INFO: compiled from: ResManager.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MBNativeAdvancedWebview f33507a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f33508b;

        b(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f33507a = mBNativeAdvancedWebview;
            this.f33508b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33507a.loadUrl(this.f33508b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static CampaignEx m34473a(MBNativeAdvancedView mBNativeAdvancedView, String str, String str2, String str3, int i, boolean z, boolean z2) {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        long jM39477b0 = c13635gM39718d.m39477b0() * 1000;
        long jM39486c0 = c13635gM39718d.m39486c0() * 1000;
        m34477a(jM39486c0, str2);
        List<CampaignEx> listM34476a = m34476a(str2, str3);
        if (listM34476a != null && listM34476a.size() > 0) {
            CampaignEx campaignEx = listM34476a.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - jM39477b0;
            if (z) {
                if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j)) {
                    if (m34481a(mBNativeAdvancedView, campaignEx, str, str2, i, z2) && campaignEx.isSpareOffer(jM39477b0, jM39486c0)) {
                        return m34474a(campaignEx);
                    }
                    if (!campaignEx.isSpareOffer(jM39477b0, jM39486c0) && mBNativeAdvancedView != null) {
                        mBNativeAdvancedView.setVisibility(8);
                    }
                } else if (m34481a(mBNativeAdvancedView, campaignEx, str, str2, i, z2)) {
                    C13219q0.m37816b(f33499a, "cache campain is picked:" + campaignEx.getAppName());
                    return m34474a(campaignEx);
                }
            } else if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j)) {
                C13219q0.m37813a(f33499a, "========已经超了缓存时间");
                if (!campaignEx.isSpareOffer(jM39477b0, jM39486c0) && mBNativeAdvancedView != null) {
                    mBNativeAdvancedView.setVisibility(8);
                    return null;
                }
            } else if (m34481a(mBNativeAdvancedView, campaignEx, str, str2, i, z2)) {
                C13219q0.m37816b(f33499a, "cache campain is picked:" + campaignEx.getAppName());
                return m34474a(campaignEx);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static CampaignEx m34474a(CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) || (!TextUtils.isEmpty(campaignEx.getAdHtml()) && campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(false);
        campaignEx.setIsMraid(true);
        return campaignEx;
    }

    /* JADX INFO: renamed from: a */
    private static String m34475a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e) {
                e.getMessage();
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<CampaignEx> m34476a(String str, String str2) {
        if (f33501c == null) {
            f33501c = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        return f33501c.m36670b(str, 0, 0, f33500b);
    }

    /* JADX INFO: renamed from: a */
    public static void m34477a(long j, String str) {
        if (f33501c == null) {
            f33501c = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        f33501c.m36652a(j, str);
    }

    /* JADX INFO: renamed from: a */
    private static void m34478a(MBNativeAdvancedView mBNativeAdvancedView, String str, CampaignEx campaignEx, String str2, String str3, int i) {
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        C12663a.m34541b(str3, campaignEx);
        C12676b c12676b = new C12676b(mBNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        c12676b.m34583a(arrayList);
        c12676b.m34580a(i);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(c12676b);
        MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
        long jCurrentTimeMillis = System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new a(str2, str3, campaignEx, mBNativeAdvancedView, jCurrentTimeMillis));
        if (advancedNativeWebview.isDestoryed()) {
            mBNativeAdvancedView.setH5Ready(false);
            C12663a.m34535a(C13008c.m36588n().m36542d(), campaignEx, str3, "webview had destory", jCurrentTimeMillis, 3);
            return;
        }
        C13219q0.m37813a(f33499a, "======开始渲染：" + str);
        new Handler(Looper.getMainLooper()).post(new b(advancedNativeWebview, str));
    }

    /* JADX INFO: renamed from: a */
    public static void m34479a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f33501c == null) {
            f33501c = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        f33501c.m36667a(arrayList, str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m34480a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2) {
        boolean zM34380a;
        boolean z = false;
        if (mBNativeAdvancedView == null) {
            C13219q0.m37816b(f33499a, "mbAdvancedNativeView  is null");
            return false;
        }
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            zM34380a = true;
        } else {
            zM34380a = mBNativeAdvancedView.isVideoReady();
            C13219q0.m37816b(f33499a, "======isReady isVideoReady:" + zM34380a);
        }
        if (zM34380a && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            zM34380a = C12654c.m34380a(str + str2 + campaignEx.getRequestId());
            String str3 = f33499a;
            StringBuilder sb = new StringBuilder("======isReady getAdZip:");
            sb.append(zM34380a);
            C13219q0.m37816b(str3, sb.toString());
        }
        if (zM34380a && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            zM34380a = C12654c.m34380a(str + str2 + campaignEx.getRequestId());
            String str4 = f33499a;
            StringBuilder sb2 = new StringBuilder("======isReady getAdHtml:");
            sb2.append(zM34380a);
            C13219q0.m37816b(str4, sb2.toString());
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            C13219q0.m37816b(f33499a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z = zM34380a;
        }
        if (!z || TextUtils.isEmpty(campaignEx.getendcard_url())) {
            return z;
        }
        boolean zIsEndCardReady = mBNativeAdvancedView.isEndCardReady();
        C13219q0.m37816b(f33499a, "======isReady isEndCardReady:" + zIsEndCardReady);
        return zIsEndCardReady;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX INFO: renamed from: a */
    public static boolean m34481a(MBNativeAdvancedView mBNativeAdvancedView, CampaignEx campaignEx, String str, String str2, int i, boolean z) {
        boolean z2;
        if (campaignEx == null) {
            return false;
        }
        mBNativeAdvancedView.clearResState();
        if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            mBNativeAdvancedView.setVideoReady(true);
            z2 = true;
        } else {
            boolean zM42526b = C14203b.getInstance().m42526b(298, str2, campaignEx.isBidCampaign());
            if (zM42526b) {
                mBNativeAdvancedView.setVideoReady(true);
            }
            z2 = zM42526b;
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url()) && !mBNativeAdvancedView.isEndCardReady() && !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getendcard_url()))) {
            mBNativeAdvancedView.setEndCardReady(true);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) && !mBNativeAdvancedView.isH5Ready()) {
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip());
            if (TextUtils.isEmpty(h5ResAddress)) {
                z2 = false;
            } else {
                if (C12654c.m34380a(str + str2 + campaignEx.getRequestId())) {
                    mBNativeAdvancedView.setH5Ready(true);
                } else {
                    m34478a(mBNativeAdvancedView, h5ResAddress, campaignEx, str, str2, i);
                    if (!z) {
                        z2 = false;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml()) && !mBNativeAdvancedView.isH5Ready()) {
            String strM34475a = m34475a(campaignEx.getAdHtml());
            if (!TextUtils.isEmpty(strM34475a)) {
                if (C12654c.m34380a(str + str2 + campaignEx.getRequestId())) {
                    mBNativeAdvancedView.setH5Ready(true);
                    if (campaignEx.isMraid()) {
                        mBNativeAdvancedView.setVideoReady(true);
                    }
                    return true;
                }
                m34478a(mBNativeAdvancedView, strM34475a, campaignEx, str, str2, i);
                if (!z) {
                }
            }
            return false;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public static void m34482b(String str) {
        if (f33501c == null) {
            f33501c = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        f33501c.m36654a(str, 0, f33500b);
    }
}
