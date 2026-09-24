package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.AdError;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.webview.C13168a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.mbsignalcommon.mraid.C13380a;
import com.mbridge.msdk.mbsignalcommon.mraid.C13383d;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {

    /* JADX INFO: renamed from: A */
    private int f40270A;

    /* JADX INFO: renamed from: B */
    private long f40271B;

    /* JADX INFO: renamed from: C */
    private boolean f40272C;

    /* JADX INFO: renamed from: D */
    private boolean f40273D;

    /* JADX INFO: renamed from: E */
    private boolean f40274E;

    /* JADX INFO: renamed from: F */
    private boolean f40275F;

    /* JADX INFO: renamed from: G */
    private boolean f40276G;

    /* JADX INFO: renamed from: H */
    private boolean f40277H;

    /* JADX INFO: renamed from: I */
    private boolean f40278I;

    /* JADX INFO: renamed from: J */
    private boolean f40279J;

    /* JADX INFO: renamed from: K */
    private String f40280K;

    /* JADX INFO: renamed from: L */
    Handler f40281L;

    /* JADX INFO: renamed from: M */
    private boolean f40282M;

    /* JADX INFO: renamed from: N */
    private boolean f40283N;

    /* JADX INFO: renamed from: O */
    boolean f40284O;

    /* JADX INFO: renamed from: m */
    protected View f40285m;

    /* JADX INFO: renamed from: n */
    protected RelativeLayout f40286n;

    /* JADX INFO: renamed from: o */
    protected ImageView f40287o;

    /* JADX INFO: renamed from: p */
    protected WindVaneWebView f40288p;

    /* JADX INFO: renamed from: q */
    private boolean f40289q;

    /* JADX INFO: renamed from: r */
    protected Handler f40290r;

    /* JADX INFO: renamed from: s */
    protected String f40291s;

    /* JADX INFO: renamed from: t */
    protected boolean f40292t;

    /* JADX INFO: renamed from: u */
    protected boolean f40293u;

    /* JADX INFO: renamed from: v */
    private boolean f40294v;

    /* JADX INFO: renamed from: w */
    private int f40295w;

    /* JADX INFO: renamed from: x */
    private int f40296x;

    /* JADX INFO: renamed from: y */
    private boolean f40297y;

    /* JADX INFO: renamed from: z */
    private boolean f40298z;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$a */
    class HandlerC14000a extends Handler {
        HandlerC14000a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (MBridgeH5EndCardView.this.f40272C) {
                MBridgeH5EndCardView.this.notifyListener.mo41600a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "");
            }
            MBridgeH5EndCardView.this.notifyListener.mo41600a(103, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$b */
    class ViewOnClickListenerC14001b implements View.OnClickListener {
        ViewOnClickListenerC14001b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeH5EndCardView.this.onCloseViewClick();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$c */
    class C14002c extends C13377b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f40301a;

        C14002c(boolean z) {
            this.f40301a = z;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
            super.mo34467a(webView, i);
            C13219q0.m37818c("WindVaneWebView", "h5EncardView readyStatus:" + i + "- isError" + MBridgeH5EndCardView.this.f40293u);
            MBridgeH5EndCardView.this.f40270A = i;
            if (!MBridgeH5EndCardView.this.f40293u) {
                MBridgeH5EndCardView.this.m41979a(System.currentTimeMillis() - MBridgeH5EndCardView.this.f40271B, false);
            }
            if (this.f40301a) {
                try {
                    C13157e c13157e = new C13157e();
                    c13157e.m37501a("type", 3);
                    c13157e.m37501a("result", Integer.valueOf(i));
                    C13156d.m37475b().m37483a("2000155", MBridgeH5EndCardView.this.f40202b, c13157e);
                } catch (Throwable th) {
                    C13219q0.m37816b("WindVaneWebView", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: b */
        public void mo38121b(WebView webView, int i) {
            super.mo38121b(webView, i);
            MBridgeH5EndCardView.this.f40270A = i;
            if (MBridgeH5EndCardView.this.f40298z) {
                return;
            }
            MBridgeH5EndCardView.this.f40298z = true;
            if (i == 1) {
                MBridgeH5EndCardView.this.reportRenderResult("success", 4);
            } else {
                MBridgeH5EndCardView.this.notifyListener.mo41600a(127, "");
                MBridgeH5EndCardView.this.reportRenderResult(C11744X3.i.f26392t, 6);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f40293u) {
                return;
            }
            mBridgeH5EndCardView.f40292t = true;
            mBridgeH5EndCardView.notifyListener.mo41600a(100, "");
            if (MBridgeH5EndCardView.this.f40202b != null) {
                C13080n c13080n = new C13080n();
                c13080n.m36990n(MBridgeH5EndCardView.this.f40202b.getRequestId());
                c13080n.m36992o(MBridgeH5EndCardView.this.f40202b.getRequestIdNotice());
                c13080n.m36962b(MBridgeH5EndCardView.this.f40202b.getId());
                c13080n.m36968d(1);
                c13080n.m36972e(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.f40271B));
                c13080n.m36988m("onPageFinished");
                String str2 = "2";
                if (MBridgeH5EndCardView.this.f40202b.getAdType() == 287) {
                    c13080n.m36959a(ExifInterface.GPS_MEASUREMENT_3D);
                } else if (MBridgeH5EndCardView.this.f40202b.getAdType() == 94) {
                    c13080n.m36959a("1");
                } else if (MBridgeH5EndCardView.this.f40202b.getAdType() == 42) {
                    c13080n.m36959a("2");
                }
                if (MBridgeH5EndCardView.this.f40202b.isMraid()) {
                    c13080n.m36961b(C13080n.f35733N);
                } else {
                    c13080n.m36976g(MBridgeH5EndCardView.this.f40202b.getendcard_url());
                    if (C13182a1.m37597b(MBridgeH5EndCardView.this.f40202b.getendcard_url()) && MBridgeH5EndCardView.this.f40202b.getendcard_url().contains(".zip")) {
                        str2 = "1";
                    }
                    c13080n.m36974f(str2);
                    c13080n.m36961b(C13080n.f35734O);
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                C13145g.m37362b(c13080n, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f40202b);
            }
            MBridgeH5EndCardView.this.notifyListener.mo41600a(120, "");
            if (this.f40301a) {
                return;
            }
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 3);
                c13157e.m37501a("result", 1);
                C13156d.m37475b().m37483a("2000155", MBridgeH5EndCardView.this.f40202b, c13157e);
            } catch (Throwable th) {
                C13219q0.m37816b("WindVaneWebView", th.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f40293u) {
                return;
            }
            mBridgeH5EndCardView.notifyListener.mo41600a(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "onReceivedError " + i + str);
            MBridgeH5EndCardView.this.reportRenderResult(str, 3);
            MBridgeH5EndCardView.this.notifyListener.mo41600a(127, "");
            MBridgeH5EndCardView.this.notifyListener.mo41600a(129, "");
            MBridgeH5EndCardView.this.f40293u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onRenderProcessGone(WebView webView) {
            super.onRenderProcessGone(webView);
            MBridgeH5EndCardView.this.setCloseVisible(0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$d */
    class RunnableC14003d implements Runnable {
        RunnableC14003d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                C13219q0.m37813a(MBridgeBaseView.TAG, "webviewshow");
                try {
                    int[] iArr = new int[2];
                    MBridgeH5EndCardView.this.f40288p.getLocationOnScreen(iArr);
                    C13219q0.m37816b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context contextM36542d = C13008c.m36588n().m36542d();
                    if (contextM36542d != null) {
                        jSONObject.put("startX", C13229v0.m37902b(contextM36542d, iArr[0]));
                        jSONObject.put("startY", C13229v0.m37902b(contextM36542d, iArr[1]));
                        jSONObject.put(C13088a.f35870l, C13229v0.m37918d(contextM36542d));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
                    string = "";
                }
                C13392f.m38726a().m38728a((WebView) MBridgeH5EndCardView.this.f40288p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                MBridgeH5EndCardView.this.notifyListener.mo41600a(109, "");
                MBridgeH5EndCardView.this.m42000i();
                MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                C13392f c13392fM38726a = C13392f.m38726a();
                MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                c13392fM38726a.m38728a((WebView) mBridgeH5EndCardView.f40288p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.f40280K.getBytes(), 0));
                MBridgeH5EndCardView.this.m41991e();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$e */
    class C14004e implements InterfaceC13083a {
        C14004e() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBridgeH5EndCardView.this.f40288p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBridgeH5EndCardView.this.f40288p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) MBridgeH5EndCardView.this.f40288p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$f */
    private class RunnableC14005f implements Runnable {

        /* JADX INFO: renamed from: a */
        private MBridgeH5EndCardView f40305a;

        public RunnableC14005f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f40305a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                C13219q0.m37816b("CloseRunnable", e.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f40305a;
            if (mBridgeH5EndCardView == null || (handler = mBridgeH5EndCardView.f40281L) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$g */
    private class RunnableC14006g implements Runnable {

        /* JADX INFO: renamed from: a */
        private MBridgeH5EndCardView f40307a;

        public RunnableC14006g(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f40307a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f40307a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f40298z) {
                return;
            }
            this.f40307a.f40298z = true;
            this.f40307a.f40292t = false;
            MBridgeH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f40307a.notifyListener.mo41600a(127, "");
            C13219q0.m37813a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$h */
    private static class RunnableC14007h implements Runnable {

        /* JADX INFO: renamed from: a */
        private MBridgeH5EndCardView f40309a;

        /* JADX INFO: renamed from: b */
        private int f40310b;

        public RunnableC14007h(MBridgeH5EndCardView mBridgeH5EndCardView, int i) {
            this.f40309a = mBridgeH5EndCardView;
            this.f40310b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f40309a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f40202b == null) {
                return;
            }
            try {
                if (mBridgeH5EndCardView.f40297y) {
                    C13219q0.m37818c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                    return;
                }
                this.f40309a.f40297y = true;
                C13080n c13080n = new C13080n("m_download_end", 12, (this.f40310b * 1000) + "", this.f40309a.f40202b.getendcard_url(), this.f40309a.f40202b.getId(), this.f40309a.unitId, "ready timeout", (C13182a1.m37597b(this.f40309a.f40202b.getendcard_url()) && this.f40309a.f40202b.getendcard_url().contains(".zip")) ? "1" : "2");
                try {
                    if (this.f40309a.f40202b.getAdType() == 287) {
                        c13080n.m36959a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (this.f40309a.f40202b.getAdType() == 94) {
                        c13080n.m36959a("1");
                    } else if (this.f40309a.f40202b.getAdType() == 42) {
                        c13080n.m36959a("2");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                c13080n.m36990n(this.f40309a.f40202b.getRequestId());
                c13080n.m36984k(this.f40309a.f40202b.getCurrentLocalRid());
                c13080n.m36992o(this.f40309a.f40202b.getRequestIdNotice());
                c13080n.m36958a(this.f40309a.f40202b.getAdSpaceT());
                this.f40309a.isLoadSuccess();
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$i */
    private class RunnableC14008i implements Runnable {

        /* JADX INFO: renamed from: a */
        private MBridgeH5EndCardView f40311a;

        public RunnableC14008i(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f40311a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f40311a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f40276G = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$j */
    private class RunnableC14009j implements Runnable {

        /* JADX INFO: renamed from: a */
        private MBridgeH5EndCardView f40313a;

        public RunnableC14009j(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f40313a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f40313a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f40277H = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeH5EndCardView$k */
    private class RunnableC14010k implements Runnable {

        /* JADX INFO: renamed from: a */
        private MBridgeH5EndCardView f40315a;

        public RunnableC14010k(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f40315a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f40315a;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.f40278I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f40315a.f40273D = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f40289q = false;
        this.f40290r = new Handler();
        this.f40292t = false;
        this.f40293u = false;
        this.f40294v = false;
        this.f40295w = 1;
        this.f40296x = 1;
        this.f40297y = false;
        this.f40298z = false;
        this.f40270A = 1;
        this.f40271B = 0L;
        this.f40272C = false;
        this.f40273D = false;
        this.f40274E = false;
        this.f40275F = false;
        this.f40276G = false;
        this.f40277H = false;
        this.f40278I = false;
        this.f40279J = false;
        this.f40280K = "";
        this.f40281L = new HandlerC14000a(Looper.getMainLooper());
        this.f40282M = false;
        this.f40283N = false;
        this.f40284O = false;
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40289q = false;
        this.f40290r = new Handler();
        this.f40292t = false;
        this.f40293u = false;
        this.f40294v = false;
        this.f40295w = 1;
        this.f40296x = 1;
        this.f40297y = false;
        this.f40298z = false;
        this.f40270A = 1;
        this.f40271B = 0L;
        this.f40272C = false;
        this.f40273D = false;
        this.f40274E = false;
        this.f40275F = false;
        this.f40276G = false;
        this.f40277H = false;
        this.f40278I = false;
        this.f40279J = false;
        this.f40280K = "";
        this.f40281L = new HandlerC14000a(Looper.getMainLooper());
        this.f40282M = false;
        this.f40283N = false;
        this.f40284O = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0078 A[Catch: NullPointerException -> 0x009a, all -> 0x010c, TryCatch #0 {NullPointerException -> 0x009a, blocks: (B:21:0x006e, B:23:0x0078, B:24:0x007e, B:26:0x0088, B:27:0x008c, B:29:0x0096), top: B:46:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007e A[Catch: NullPointerException -> 0x009a, all -> 0x010c, TryCatch #0 {NullPointerException -> 0x009a, blocks: (B:21:0x006e, B:23:0x0078, B:24:0x007e, B:26:0x0088, B:27:0x008c, B:29:0x0096), top: B:46:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0088 A[Catch: NullPointerException -> 0x009a, all -> 0x010c, TryCatch #0 {NullPointerException -> 0x009a, blocks: (B:21:0x006e, B:23:0x0078, B:24:0x007e, B:26:0x0088, B:27:0x008c, B:29:0x0096), top: B:46:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x008c A[Catch: NullPointerException -> 0x009a, all -> 0x010c, TryCatch #0 {NullPointerException -> 0x009a, blocks: (B:21:0x006e, B:23:0x0078, B:24:0x007e, B:26:0x0088, B:27:0x008c, B:29:0x0096), top: B:46:0x006e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[Catch: NullPointerException -> 0x009a, all -> 0x010c, TRY_LEAVE, TryCatch #0 {NullPointerException -> 0x009a, blocks: (B:21:0x006e, B:23:0x0078, B:24:0x007e, B:26:0x0088, B:27:0x008c, B:29:0x0096), top: B:46:0x006e, outer: #1 }] */
    /* JADX INFO: renamed from: a */
    public void m41979a(long j, boolean z) {
        int i;
        int i2;
        C13080n c13080n;
        try {
            if (this.f40297y) {
                return;
            }
            this.f40297y = true;
            String str = (C13182a1.m37597b(this.f40202b.getendcard_url()) && this.f40202b.getendcard_url().contains(".zip")) ? "1" : "2";
            String str2 = "ready yes";
            int i3 = 2;
            try {
                if (!z) {
                    if (this.f40270A == 2) {
                        str2 = "ready no";
                        i3 = 3;
                        i = 11;
                    } else {
                        i = 10;
                        i2 = 1;
                    }
                    String str3 = str2;
                    c13080n = new C13080n("m_download_end", i, j + "", this.f40202b.getendcard_url(), this.f40202b.getId(), this.unitId, str3, str);
                    if (this.f40202b.getAdType() == 287) {
                        c13080n.m36959a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (this.f40202b.getAdType() == 94) {
                        c13080n.m36959a("1");
                    } else if (this.f40202b.getAdType() == 42) {
                        c13080n.m36959a("2");
                    }
                    c13080n.m36990n(this.f40202b.getRequestId());
                    c13080n.m36984k(this.f40202b.getCurrentLocalRid());
                    c13080n.m36992o(this.f40202b.getRequestIdNotice());
                    c13080n.m36958a(this.f40202b.getAdSpaceT());
                    m41980a(c13080n, this.f40202b);
                    if (isLoadSuccess() && i2 == 1) {
                        c13080n.m36968d(i2);
                        c13080n.m36972e(String.valueOf(j));
                        c13080n.m36962b(this.f40202b.getId());
                        c13080n.m36988m(str3);
                        if (this.f40202b.isMraid()) {
                            c13080n.m36961b(C13080n.f35733N);
                        } else {
                            c13080n.m36976g(this.f40202b.getendcard_url());
                            c13080n.m36974f(str);
                            c13080n.m36961b(C13080n.f35734O);
                        }
                        C13145g.m37362b(c13080n, this.unitId, this.f40202b);
                        return;
                    }
                }
                str2 = "ready timeout";
                i = 12;
                if (this.f40202b.getAdType() == 287) {
                    c13080n.m36959a(ExifInterface.GPS_MEASUREMENT_3D);
                } else if (this.f40202b.getAdType() == 94) {
                    c13080n.m36959a("1");
                } else if (this.f40202b.getAdType() == 42) {
                    c13080n.m36959a("2");
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            i2 = i3;
            String str4 = str2;
            c13080n = new C13080n("m_download_end", i, j + "", this.f40202b.getendcard_url(), this.f40202b.getId(), this.unitId, str4, str);
            c13080n.m36990n(this.f40202b.getRequestId());
            c13080n.m36984k(this.f40202b.getCurrentLocalRid());
            c13080n.m36992o(this.f40202b.getRequestIdNotice());
            c13080n.m36958a(this.f40202b.getAdSpaceT());
            m41980a(c13080n, this.f40202b);
            if (isLoadSuccess()) {
            }
        } catch (Throwable th) {
            C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m41980a(C13080n c13080n, CampaignEx campaignEx) {
        try {
            C14223c c14223cM42671c = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), campaignEx.getCampaignUnitId());
            if (c14223cM42671c != null) {
                c13080n.m37000s(c14223cM42671c.m42760x());
            }
            C14221a c14221aM42670c = C14222b.m42658b().m42670c();
            if (c14221aM42670c != null) {
                c13080n.m36998r(c14221aM42670c.m42649f());
            }
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m41982a(View view) {
        this.f40287o = (ImageView) view.findViewById(findID("mbridge_windwv_close"));
        this.f40286n = (RelativeLayout) view.findViewById(findID("mbridge_windwv_content_rl"));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
        this.f40288p = windVaneWebView;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
        }
        this.f40288p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f40286n.addView(this.f40288p);
        return isNotNULL(this.f40287o, this.f40288p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m41991e() {
        try {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(this.unitId);
                C13084b.m37036b().m37054d(this.unitId + "_1");
                C13084b.m37036b().m37046a(this.unitId + "_2", this.f40202b);
            }
            CampaignEx campaignEx2 = this.f40202b;
            if (campaignEx2 == null || !campaignEx2.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(C13008c.m36588n().m36542d());
            imageView.setBackgroundResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_notice", "drawable"));
            ImageView imageView2 = this.f40287o;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f), C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f);
                layoutParams2.topMargin = C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f);
            }
            addView(imageView, layoutParams2);
            C13229v0.m37892a(4, imageView, this.f40202b, C13008c.m36588n().m36542d(), false, new C14004e());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    private void m41994f() {
        if (this.f40282M || this.f40274E) {
            return;
        }
        this.f40282M = true;
        int i = this.f40295w;
        if (i == 0) {
            this.f40276G = true;
            return;
        }
        this.f40276G = false;
        if (i > -1) {
            this.f40290r.postDelayed(new RunnableC14008i(this), this.f40295w * 1000);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m41997g() {
        if (this.f40283N || this.f40274E) {
            return;
        }
        this.f40283N = true;
        int i = this.f40296x;
        if (i == 0) {
            this.f40277H = true;
            return;
        }
        this.f40277H = false;
        if (i > -1) {
            this.f40290r.postDelayed(new RunnableC14009j(this), this.f40296x * 1000);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a A[EDGE_INSN: B:34:0x008a->B:35:0x008b BREAK  A[LOOP:0: B:19:0x004f->B:29:0x007a]] */
    /* JADX INFO: renamed from: h */
    private void m41998h() {
        int iM42756v;
        try {
            this.f40271B = System.currentTimeMillis();
            String str = this.f40202b.getendcard_url();
            C14223c c14223cM42671c = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), this.unitId);
            if (this.f40294v && C13182a1.m37597b(str)) {
                if (str.contains("wfr=1") || (c14223cM42671c != null && c14223cM42671c.m42756v() > 0)) {
                    if (str.contains("wfr=1")) {
                        String[] strArrSplit = str.split(C11744X3.j.f26436c);
                        if (strArrSplit != null && strArrSplit.length > 0) {
                            int length = strArrSplit.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    iM42756v = 20;
                                    break;
                                }
                                String str2 = strArrSplit[i];
                                if (C13182a1.m37597b(str2) && str2.contains("to") && str2.split(C11744X3.j.f26434b) != null && str2.split(C11744X3.j.f26434b).length > 0) {
                                    iM42756v = C13229v0.m37877a((Object) str2.split(C11744X3.j.f26434b)[1]);
                                    break;
                                }
                                i++;
                            }
                        } else {
                            iM42756v = 20;
                            break;
                        }
                    } else {
                        if (c14223cM42671c == null || c14223cM42671c.m42756v() <= 0) {
                            iM42756v = 20;
                            break;
                        }
                        iM42756v = c14223cM42671c.m42756v();
                    }
                    if (iM42756v >= 0) {
                        excuteEndCardShowTask(iM42756v);
                    } else {
                        excuteEndCardShowTask(20);
                    }
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m42000i() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i != 0) {
            if (i == 1) {
                str = C11744X3.i.f26322D;
            } else if (i == 2) {
                str = C11744X3.i.f26320C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", BuildConfig.FLAVOR);
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float fM37760n = C13211m0.m37760n(getContext());
            float fM37757m = C13211m0.m37757m(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.widthPixels;
            float f2 = displayMetrics.heightPixels;
            C13380a.m38682a().m38690b(this.f40288p, fM37760n, fM37757m);
            C13380a.m38682a().m38686a(this.f40288p, f, f2);
        }
        C13380a c13380aM38682a = C13380a.m38682a();
        WindVaneWebView windVaneWebView = this.f40288p;
        c13380aM38682a.m38691b(windVaneWebView, windVaneWebView.getLeft(), this.f40288p.getTop(), this.f40288p.getWidth(), this.f40288p.getHeight());
        C13380a c13380aM38682a2 = C13380a.m38682a();
        WindVaneWebView windVaneWebView2 = this.f40288p;
        c13380aM38682a2.m38687a(windVaneWebView2, windVaneWebView2.getLeft(), this.f40288p.getTop(), this.f40288p.getWidth(), this.f40288p.getHeight());
        C13380a.m38682a().m38689a(this.f40288p, map);
        C13380a.m38682a().m38685a(this.f40288p, C13383d.f37123f);
        C13380a.m38682a().m38684a(this.f40288p);
    }

    public boolean canBackPress() {
        ImageView imageView = this.f40287o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    /* JADX INFO: renamed from: d */
    protected void mo41941d() {
        super.mo41941d();
        if (this.f40205e) {
            this.f40287o.setOnClickListener(new ViewOnClickListenerC14001b());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i) {
        this.f40290r.postDelayed(new RunnableC14007h(this, i), i * 1000);
    }

    public void excuteTask() {
        if (this.f40294v || this.f40295w <= -1) {
            return;
        }
        this.f40290r.postDelayed(new RunnableC14010k(this), this.f40295w * 1000);
    }

    public void executeEndCardShow(int i) {
        this.f40290r.postDelayed(new RunnableC14006g(this), i * 1000);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void expand(String str, boolean z) {
    }

    protected RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public CampaignEx getMraidCampaign() {
        return this.f40202b;
    }

    protected String getURL() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null) {
            this.f40272C = false;
            return null;
        }
        this.f40272C = true;
        if (campaignEx.isMraid()) {
            this.f40294v = false;
            String mraid = this.f40202b.getMraid();
            if (TextUtils.isEmpty(mraid)) {
                return this.f40202b.getEndScreenUrl();
            }
            File file = new File(mraid);
            try {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    return this.f40202b.getEndScreenUrl();
                }
                return "file:////" + mraid;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
                return mraid;
            }
        }
        String str = this.f40202b.getendcard_url();
        if (C13182a1.m37596a(str)) {
            this.f40294v = false;
            return this.f40202b.getEndScreenUrl();
        }
        this.f40294v = true;
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
        if (!TextUtils.isEmpty(h5ResAddress)) {
            return h5ResAddress + "&native_adtype=" + this.f40202b.getAdType();
        }
        try {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                String endScreenUrl = this.f40202b.getEndScreenUrl();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    return null;
                }
                this.f40294v = false;
                excuteTask();
                return endScreenUrl;
            }
        } catch (Throwable th2) {
            C13219q0.m37816b(MBridgeBaseView.TAG, th2.getMessage());
        }
        return str + "&native_adtype=" + this.f40202b.getAdType();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void handlerPlayableException(String str) {
        if (this.f40293u) {
            return;
        }
        this.f40293u = true;
        this.f40292t = false;
        if (this.f40202b != null) {
            C13080n c13080n = new C13080n();
            c13080n.m36990n(this.f40202b.getRequestId());
            c13080n.m36992o(this.f40202b.getRequestIdNotice());
            c13080n.m36962b(this.f40202b.getId());
            c13080n.m36988m(str);
            C13145g.m37358a(c13080n, this.f40201a.getApplicationContext(), this.unitId);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_h5");
        if (C13203i0.m37709a(iFindLayout)) {
            View viewInflate = this.f40203c.inflate(iFindLayout, (ViewGroup) null);
            this.f40285m = viewInflate;
            try {
                this.f40205e = m41982a(viewInflate);
            } catch (Exception unused) {
                this.f40205e = false;
            }
            addView(this.f40285m, getContentLayoutParams());
            mo41941d();
            mo41952j();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f40292t;
    }

    public boolean isPlayable() {
        return this.f40294v;
    }

    /* JADX INFO: renamed from: j */
    protected void mo41952j() {
        if (this.f40205e) {
            setMatchParent();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.InterfaceC14179h
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f40274E = true;
        } else {
            if (i != 1) {
                return;
            }
            this.f40275F = true;
        }
    }

    public void onBackPress() {
        boolean z;
        if (this.f40273D || (((z = this.f40274E) && this.f40275F) || (!(z || !this.f40276G || this.f40284O) || (!z && this.f40277H && this.f40284O)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f40288p != null) {
                C13392f.m38726a().m38728a((WebView) this.f40288p, "onSystemDestory", "");
                new Thread(new RunnableC14005f(this)).start();
            } else {
                this.notifyListener.mo41600a(103, "");
                this.notifyListener.mo41600a(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "webview is null when closing webview");
            }
        } catch (Exception e) {
            this.notifyListener.mo41600a(103, "");
            this.notifyListener.mo41600a(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "close webview exception" + e.getMessage());
            C13219q0.m37813a(MBridgeBaseView.TAG, e.getMessage());
        }
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("type", 2);
            C13156d.m37475b().m37486a("2000152", c13157e);
            C13156d.m37475b().m37482a("2000134", this.f40202b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        C13227u0.m37860a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        C13227u0.m37860a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        C13227u0.m37863b(campaign, this);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0 || this.f40279J) {
            return;
        }
        this.f40279J = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        if (z) {
            C13380a.m38682a().m38694c(this.f40288p, "true");
        } else {
            C13380a.m38682a().m38694c(this.f40288p, "false");
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", C11744X3.i.f26320C);
            } else {
                jSONObject.put("orientation", C11744X3.i.f26322D);
            }
            C13392f.m38726a().m38728a((WebView) this.f40288p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(C14177b c14177b) {
        String url = getURL();
        if (!this.f40205e || this.f40202b == null || TextUtils.isEmpty(url) || this.f40288p == null) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.mo41600a(127, "");
            this.notifyListener.mo41600a(129, "");
        } else {
            this.f40271B = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            C13168a c13168a = new C13168a(this.f40202b);
            c13168a.m37548a(this.f40202b.getAppName());
            this.f40288p.setDownloadListener(c13168a);
            this.f40288p.setCampaignId(this.f40202b.getId());
            this.f40288p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null) {
                this.f40288p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f40288p.setApiManagerJSFactory(c14177b);
            if (this.f40202b.isMraid()) {
                this.f40288p.setMraidObject(this);
            }
            boolean z = url.contains("wfr=1") || url.contains("wfl=1");
            C13185b1.m37632a(this.f40288p, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
            this.f40288p.setWebViewListener(new C14002c(z));
            if (TextUtils.isEmpty(this.f40202b.getMraid())) {
                m41998h();
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(url));
            if (TextUtils.isEmpty(this.f40291s)) {
                this.f40288p.loadUrl(url);
            } else {
                this.f40288p.loadDataWithBaseURL(url, this.f40291s, "text/html", "UTF-8", null);
            }
        }
        this.f40284O = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void readyStatus(int i) {
    }

    public void release() {
        Handler handler = this.f40290r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f40290r = null;
        }
        Handler handler2 = this.f40281L;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f40281L = null;
        }
        this.f40286n.removeAllViews();
        this.f40288p.release();
        this.f40288p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new C13146h(getContext()).m37371a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f40202b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i) {
        if (this.f40202b == null || this.f40293u) {
            return;
        }
        C13080n c13080n = new C13080n();
        c13080n.m36990n(this.f40202b.getRequestId());
        c13080n.m36992o(this.f40202b.getRequestIdNotice());
        c13080n.m36962b(this.f40202b.getId());
        c13080n.m36968d(i);
        c13080n.m36972e(String.valueOf(System.currentTimeMillis() - this.f40271B));
        c13080n.m36988m(str);
        String str2 = "2";
        if (this.f40202b.getAdType() == 287) {
            c13080n.m36959a(ExifInterface.GPS_MEASUREMENT_3D);
        } else if (this.f40202b.getAdType() == 94) {
            c13080n.m36959a("1");
        } else if (this.f40202b.getAdType() == 42) {
            c13080n.m36959a("2");
        }
        if (this.f40202b.isMraid()) {
            c13080n.m36961b(C13080n.f35733N);
        } else {
            c13080n.m36976g(this.f40202b.getendcard_url());
            if (C13182a1.m37597b(this.f40202b.getendcard_url()) && this.f40202b.getendcard_url().contains(".zip")) {
                str2 = "1";
            }
            c13080n.m36974f(str2);
            c13080n.m36961b(C13080n.f35734O);
        }
        C13145g.m37362b(c13080n, this.unitId, this.f40202b);
    }

    public void setCloseDelayShowTime(int i) {
        this.f40295w = i;
    }

    public void setCloseVisible(int i) {
        if (this.f40205e) {
            this.f40287o.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f40205e) {
            this.f40278I = true;
            if (i == 4) {
                this.f40287o.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f40287o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f40287o.setVisibility(0);
        }
    }

    public void setError(boolean z) {
        this.f40293u = z;
    }

    public void setHtmlSource(String str) {
        this.f40291s = str;
    }

    public void setLoadPlayable(boolean z) {
        this.f40284O = z;
    }

    public void setNotchValue(String str, int i, int i2, int i3, int i4) {
        if (!TextUtils.isEmpty(str)) {
            this.f40280K = str;
        }
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        C13219q0.m37816b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40287o.getLayoutParams();
        int iM37876a = C13229v0.m37876a(getContext(), 20.0f);
        layoutParams.setMargins(i + iM37876a, i3 + iM37876a, i2 + iM37876a, i4 + iM37876a);
        this.f40287o.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i) {
        this.f40296x = i;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f40202b.getendcard_url();
            if (C13182a1.m37597b(str) && str.contains("wfl=1")) {
                String[] strArrSplit = str.split(C11744X3.j.f26436c);
                int iM37877a = 15;
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        if (C13182a1.m37597b(str2) && str2.contains("timeout") && str2.split(C11744X3.j.f26434b) != null && str2.split(C11744X3.j.f26434b).length > 0) {
                            iM37877a = C13229v0.m37877a((Object) str2.split(C11744X3.j.f26434b)[1]);
                        }
                    }
                }
                executeEndCardShow(iM37877a);
            }
        } catch (Throwable th) {
            C13219q0.m37813a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.InterfaceC14179h
    public void toggleCloseBtn(int i) {
        int visibility = this.f40287o.getVisibility();
        if (i == 1) {
            this.f40273D = true;
            visibility = 0;
        } else if (i == 2) {
            this.f40273D = false;
            if (this.f40284O) {
                m41997g();
            } else {
                m41994f();
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.InterfaceC13381b
    public void useCustomClose(boolean z) {
        try {
            setCloseVisibleForMraid(z ? 4 : 0);
        } catch (Exception e) {
            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void volumeChange(double d) {
        C13380a.m38682a().m38685a(this.f40288p, d);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f40288p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new RunnableC14003d());
        }
    }
}
