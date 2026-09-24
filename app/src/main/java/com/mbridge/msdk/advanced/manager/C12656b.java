package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.advanced.common.C12654c;
import com.mbridge.msdk.advanced.middle.C12660b;
import com.mbridge.msdk.advanced.report.C12663a;
import com.mbridge.msdk.advanced.request.AbstractC12665b;
import com.mbridge.msdk.advanced.request.C12666c;
import com.mbridge.msdk.advanced.request.C12668e;
import com.mbridge.msdk.advanced.request.C12669f;
import com.mbridge.msdk.advanced.signal.C12675a;
import com.mbridge.msdk.advanced.signal.C12676b;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13234y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.setting.util.C13645a;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b */
/* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12656b {

    /* JADX INFO: renamed from: z */
    private static String f33427z = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: a */
    private String f33428a;

    /* JADX INFO: renamed from: b */
    private String f33429b;

    /* JADX INFO: renamed from: c */
    private long f33430c;

    /* JADX INFO: renamed from: d */
    private C12660b f33431d;

    /* JADX INFO: renamed from: f */
    private MBNativeAdvancedView f33433f;

    /* JADX INFO: renamed from: g */
    private C13640l f33434g;

    /* JADX INFO: renamed from: h */
    private List<CampaignEx> f33435h;

    /* JADX INFO: renamed from: i */
    private CampaignEx f33436i;

    /* JADX INFO: renamed from: j */
    private int f33437j;

    /* JADX INFO: renamed from: k */
    private int f33438k;

    /* JADX INFO: renamed from: l */
    private int f33439l;

    /* JADX INFO: renamed from: m */
    private int f33440m;

    /* JADX INFO: renamed from: n */
    private String f33441n;

    /* JADX INFO: renamed from: o */
    private int f33442o;

    /* JADX INFO: renamed from: p */
    private boolean f33443p;

    /* JADX INFO: renamed from: q */
    private volatile boolean f33444q;

    /* JADX INFO: renamed from: r */
    private InterfaceC14217a f33445r;

    /* JADX INFO: renamed from: s */
    private H5DownLoadManager.ZipDownloadListener f33446s;

    /* JADX INFO: renamed from: t */
    private H5DownLoadManager.ZipDownloadListener f33447t;

    /* JADX INFO: renamed from: u */
    private String f33448u;

    /* JADX INFO: renamed from: v */
    private int f33449v;

    /* JADX INFO: renamed from: w */
    private String f33450w = "";

    /* JADX INFO: renamed from: x */
    private Handler f33451x = new e(Looper.getMainLooper());

    /* JADX INFO: renamed from: y */
    private Runnable f33452y = new f();

    /* JADX INFO: renamed from: e */
    private Context f33432e = C13008c.m36588n().m36542d();

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$a */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33453a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f33454b;

        a(CampaignEx campaignEx, int i) {
            this.f33453a = campaignEx;
            this.f33454b = i;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            C13219q0.m37813a(C12656b.f33427z, "zip 下载失败： " + str2 + " " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f33453a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            C12656b.this.f33451x.sendMessage(messageObtain);
            C12656b.this.m34431a(this.f33453a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            C13219q0.m37813a(C12656b.f33427z, "zip 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f33453a;
            messageObtain.arg1 = this.f33454b;
            C12656b.this.f33451x.sendMessage(messageObtain);
            if (z) {
                return;
            }
            C12656b.this.m34431a(this.f33453a, str, true, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$b */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class b extends C13377b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33456a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f33457b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f33458c;

        b(CampaignEx campaignEx, int i, long j) {
            this.f33456a = campaignEx;
            this.f33457b = i;
            this.f33458c = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) throws Throwable {
            super.mo34467a(webView, i);
            C13219q0.m37816b("NativeAdvancedLoadManager", "=========readyState: " + i);
            if (i != 1) {
                C12656b.this.m34430a(this.f33456a, "readyState 2", this.f33457b);
                C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33456a, C12656b.this.f33428a, "readyState 2", this.f33458c, 3);
                return;
            }
            C12656b.this.f33433f.setH5Ready(true);
            C12654c.m34379a(C12656b.this.f33429b + C12656b.this.f33428a + this.f33456a.getRequestId(), true);
            C12656b.this.m34454h(this.f33456a, this.f33457b);
            C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33456a, C12656b.this.f33428a, "", this.f33458c, 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C13219q0.m37816b("NativeAdvancedLoadManager", "onPageFinished");
            if (!this.f33456a.isHasMBTplMark()) {
                C12656b.this.f33433f.setH5Ready(true);
                C13219q0.m37816b("NativeAdvancedLoadManager", "=======onPageFinished OK");
                C12654c.m34379a(C12656b.this.f33429b + C12656b.this.f33428a + this.f33456a.getRequestId(), true);
                C12656b.this.m34454h(this.f33456a, this.f33457b);
                C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33456a, C12656b.this.f33428a, "", this.f33458c, 1);
            }
            C12675a.m34573a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) throws Throwable {
            super.onReceivedError(webView, i, str, str2);
            C13219q0.m37816b("NativeAdvancedLoadManager", "onReceivedError： " + i + "  " + str + "  " + str2);
            C12656b.this.m34430a(this.f33456a, str, this.f33457b);
            C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33456a, C12656b.this.f33428a, "error code:" + i + str, this.f33458c, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws Throwable {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            C13219q0.m37816b("NativeAdvancedLoadManager", "onReceivedSslError: " + sslError.getPrimaryError());
            C12656b.this.m34430a(this.f33456a, "onReceivedSslError:" + sslError.getUrl(), this.f33457b);
            C12663a.m34535a(C13008c.m36588n().m36542d(), this.f33456a, C12656b.this.f33428a, "error url:" + sslError.getUrl(), this.f33458c, 3);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$c */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MBNativeAdvancedWebview f33460a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f33461b;

        c(MBNativeAdvancedWebview mBNativeAdvancedWebview, String str) {
            this.f33460a = mBNativeAdvancedWebview;
            this.f33461b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33460a.loadUrl(this.f33461b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$d */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class d implements InterfaceC14217a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33463a;

        d(CampaignEx campaignEx) {
            this.f33463a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34468a(String str) {
            C13219q0.m37813a(C12656b.f33427z, "Video 下载成功： " + str);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f33463a;
            messageObtain.what = 5;
            C12656b.this.f33451x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34469a(String str, String str2) {
            C13219q0.m37813a(C12656b.f33427z, "Video 下载失败： " + str);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f33463a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            C12656b.this.f33451x.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$e */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i;
            Object obj;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                Object obj2 = message.obj;
                int i3 = message.arg1;
                if (obj2 == null || !(obj2 instanceof CampaignEx)) {
                    return;
                }
                CampaignEx campaignEx = (CampaignEx) obj2;
                C12656b.this.m34436a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i3);
                return;
            }
            if (i2 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i4 = ((Bundle) obj3).getInt("type");
                        if (i4 == 1) {
                            i = 880004;
                        } else if (i4 == 2) {
                            i = 880007;
                        } else {
                            i = i4 == 3 ? 880006 : 880024;
                        }
                        C13082b c13082b = new C13082b(i);
                        String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                        c13082b.m37024c(string);
                        c13082b.m37017a(campaignEx2);
                        C12656b c12656b = C12656b.this;
                        c12656b.m34435a(c13082b, c12656b.f33441n, C12656b.this.f33442o, campaignEx2);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    C13082b c13082b2 = new C13082b(880000);
                    c13082b2.m37021a((Throwable) e);
                    C12656b c12656b2 = C12656b.this;
                    c12656b2.m34435a(c13082b2, c12656b2.f33441n, C12656b.this.f33442o, (CampaignEx) null);
                    return;
                }
            }
            if (i2 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof CampaignEx)) {
                    return;
                }
                C12656b c12656b3 = C12656b.this;
                c12656b3.m34455i((CampaignEx) obj4, c12656b3.f33442o);
                return;
            }
            if (i2 != 4) {
                if (i2 == 5 && (obj = message.obj) != null && (obj instanceof CampaignEx)) {
                    if (C12656b.this.f33433f != null) {
                        C12656b.this.f33433f.setVideoReady(true);
                    }
                    C12656b c12656b4 = C12656b.this;
                    c12656b4.m34455i((CampaignEx) obj, c12656b4.f33442o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof CampaignEx)) {
                return;
            }
            if (C12656b.this.f33433f != null) {
                C12656b.this.f33433f.setEndCardReady(true);
            }
            C12656b c12656b5 = C12656b.this;
            c12656b5.m34455i((CampaignEx) obj5, c12656b5.f33442o);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$f */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            C13082b c13082b = new C13082b(880010);
            C12656b c12656b = C12656b.this;
            c12656b.m34435a(c13082b, c12656b.f33441n, C12656b.this.f33442o, (CampaignEx) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class g extends AbstractC12665b {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f33467e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f33468f;

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g$a */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Exception f33470a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f33471b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ CampaignUnit f33472c;

            a(Exception exc, int i, CampaignUnit campaignUnit) {
                this.f33470a = exc;
                this.f33471b = i;
                this.f33472c = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                C13082b c13082b = new C13082b(880003);
                c13082b.m37021a((Throwable) this.f33470a);
                g gVar = g.this;
                C12656b c12656b = C12656b.this;
                String str = gVar.f33467e;
                int i = this.f33471b;
                CampaignUnit campaignUnit = this.f33472c;
                c12656b.m34435a(c13082b, str, i, (campaignUnit == null || campaignUnit.getAds() == null || this.f33472c.getAds().size() == 0) ? null : this.f33472c.getAds().get(0));
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$g$b */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f33474a;

            b(String str) {
                this.f33474a = str;
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                C13082b c13082b = new C13082b(880002);
                c13082b.m37024c(this.f33474a);
                g gVar = g.this;
                C12656b.this.m34435a(c13082b, gVar.f33467e, gVar.f33468f, (CampaignEx) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i, String str, int i2) {
            super(i);
            this.f33467e = str;
            this.f33468f = i2;
        }

        @Override // com.mbridge.msdk.advanced.request.AbstractC12665b
        /* JADX INFO: renamed from: a */
        public void mo34470a(CampaignUnit campaignUnit, int i) throws Throwable {
            try {
                C12656b c12656b = C12656b.this;
                c12656b.m34432a(campaignUnit, i, c12656b.f33428a, this.f33467e);
                C12656b.this.f33450w = campaignUnit.getRequestId();
                C12656b.this.f33435h = campaignUnit.getAds();
            } catch (Exception e) {
                C13219q0.m37816b(C12656b.f33427z, e.getMessage());
                C13219q0.m37818c(C12656b.f33427z, "onLoadCompaginSuccess 数据刚请求失败");
                if (C12656b.this.f33451x != null) {
                    C12656b.this.f33451x.post(new a(e, i, campaignUnit));
                }
                C12656b.this.m34448f();
            }
        }

        @Override // com.mbridge.msdk.advanced.request.AbstractC12665b
        /* JADX INFO: renamed from: b */
        public void mo34471b(int i, String str) {
            C13219q0.m37816b(C12656b.f33427z, str);
            C13219q0.m37818c(C12656b.f33427z, "onLoadCompaginFailed load failed errorCode:" + i + " msg:" + str);
            if (C12656b.this.f33451x != null) {
                C12656b.this.f33451x.post(new b(str));
            }
            C12656b.this.m34448f();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$h */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class h extends C13092c.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33476a;

        h(CampaignEx campaignEx, InterfaceC13155a interfaceC13155a) {
            this.f33476a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.C13092c.a
        /* JADX INFO: renamed from: a */
        public void mo34472a(String str, C13154c c13154c) {
            C12663a.m34540a(str, c13154c, this.f33476a, C12656b.this.f33432e, null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$i */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33478a;

        i(CampaignEx campaignEx) {
            this.f33478a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13020j.m36706a(C13017g.m36693a(C12656b.this.f33432e)).m36710d();
            C13234y.m37954a(C12656b.this.f33432e, this.f33478a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class j implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33480a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f33481b;

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j$a */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                C12656b.this.m34455i(jVar.f33480a, jVar.f33481b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$j$b */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                C12656b.this.m34455i(jVar.f33480a, jVar.f33481b);
            }
        }

        j(CampaignEx campaignEx, int i) {
            this.f33480a = campaignEx;
            this.f33481b = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13219q0.m37813a(C12656b.f33427z, "gifurl 下载失败： " + str2);
            if (C12656b.this.f33451x != null) {
                C12656b.this.f33451x.post(new b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            C13219q0.m37813a(C12656b.f33427z, "giturl 下载成功： " + str);
            if (C12656b.this.f33451x != null) {
                C12656b.this.f33451x.post(new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$k */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class k implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33485a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f33486b;

        k(CampaignEx campaignEx, int i) {
            this.f33485a = campaignEx;
            this.f33486b = i;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            C13219q0.m37813a(C12656b.f33427z, "endcard 下载失败： " + str2);
            if (C12656b.this.f33433f != null) {
                C12656b.this.f33433f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f33485a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            C12656b.this.f33451x.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            C13219q0.m37813a(C12656b.f33427z, "endcard 下载成功： " + str);
            if (C12656b.this.f33451x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f33485a;
                messageObtain.arg1 = this.f33486b;
                C12656b.this.f33451x.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class l implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33488a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f33489b;

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l$a */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                C12656b.this.m34455i(lVar.f33488a, lVar.f33489b);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$l$b */
        /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                C12656b.this.m34455i(lVar.f33488a, lVar.f33489b);
            }
        }

        l(CampaignEx campaignEx, int i) {
            this.f33488a = campaignEx;
            this.f33489b = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13219q0.m37813a(C12656b.f33427z, "image 下载失败： " + str2);
            if (C12656b.this.f33451x != null) {
                C12656b.this.f33451x.post(new b());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            C13219q0.m37813a(C12656b.f33427z, "image 下载成功： " + str);
            if (C12656b.this.f33451x != null) {
                C12656b.this.f33451x.post(new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.b$m */
    /* JADX INFO: compiled from: NativeAdvancedLoadManager.java */
    class m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ File f33493a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f33494b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f33495c;

        m(File file, CampaignEx campaignEx, int i) {
            this.f33493a = file;
            this.f33494b = campaignEx;
            this.f33495c = i;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            C12656b.this.m34436a("file:////" + this.f33493a.getAbsolutePath(), this.f33494b, this.f33495c);
        }
    }

    public C12656b(String str, String str2, long j2) {
        this.f33429b = str;
        this.f33428a = str2;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC12665b m34413a(String str, int i2) {
        g gVar = new g(i2, str, i2);
        gVar.m34548a(str);
        gVar.setUnitId(this.f33428a);
        gVar.setPlacementId(this.f33429b);
        gVar.setAdType(298);
        return gVar;
    }

    /* JADX INFO: renamed from: a */
    private List<CampaignEx> m34418a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setLocalRequestId(campaignUnit.getLocalRequestId());
        campaignEx.setCampaignUnitId(this.f33428a);
        m34427a(campaignEx);
        this.f33448u = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (C13229v0.m37916c(campaignEx)) {
                campaignEx.setRtinsType(C13229v0.m37915c(this.f33432e, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (C13092c.m37123b(this.f33432e, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                C13229v0.m37896a(this.f33428a, campaignEx, C13088a.f35882x);
            }
            m34429a(campaignEx, (C13154c) null, (InterfaceC13155a) null);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m34419a(long j2) {
        this.f33451x.postDelayed(this.f33452y, j2);
    }

    /* JADX INFO: renamed from: a */
    private void m34420a(Context context, String str, int i2) throws Throwable {
        Exception exc;
        String str2;
        try {
            if (context == null) {
                m34435a(new C13082b(880025), str, i2, (CampaignEx) null);
                return;
            }
            try {
                if (C13182a1.m37596a(this.f33428a)) {
                    m34435a(new C13082b(880032), str, i2, (CampaignEx) null);
                    return;
                }
                try {
                    C12658d.m34482b(this.f33428a);
                } catch (Throwable th) {
                    C13219q0.m37816b(f33427z, th.getMessage());
                }
                C13219q0.m37818c(f33427z, "load 开始准备请求参数");
                MBridgeIds mBridgeIds = new MBridgeIds(this.f33429b, this.f33428a);
                C12669f c12669f = new C12669f();
                c12669f.m34558d(i2);
                c12669f.m34556c(this.f33449v);
                c12669f.m34552a(this.f33448u);
                c12669f.m34554b(this.f33440m);
                c12669f.m34551a(this.f33439l);
                C13126e c13126eM34549b = C12668e.m34549b(context, mBridgeIds, c12669f);
                if (c13126eM34549b == null) {
                    C13219q0.m37818c(f33427z, "load 请求参数为空 load失败");
                    m34435a(new C13082b(880001), str, i2, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    c13126eM34549b.m37245a("token", str);
                }
                String strM37921d = C13229v0.m37921d(this.f33428a);
                if (!TextUtils.isEmpty(strM37921d)) {
                    c13126eM34549b.m37245a("j", strM37921d);
                }
                str2 = str;
                try {
                    new C12666c(context).choiceV3OrV5BySetting(1, c13126eM34549b, m34413a(str, i2), str2, C13092c.m37115a(this.f33430c, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    return;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                str2 = str;
            }
            exc = e;
            C13219q0.m37816b(f33427z, exc.getMessage());
            C13082b c13082b = new C13082b(880020);
            c13082b.m37021a((Throwable) exc);
            m34435a(c13082b, str2, i2, (CampaignEx) null);
            m34448f();
        } catch (Exception e4) {
            exc = e4;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34427a(CampaignEx campaignEx) {
        new Thread(new i(campaignEx)).start();
    }

    /* JADX INFO: renamed from: a */
    private void m34428a(CampaignEx campaignEx, int i2) {
        String str;
        this.f33447t = new k(campaignEx, i2);
        int i3 = 0;
        if (campaignEx != null) {
            i3 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            str = campaignEx.getendcard_url();
        } else {
            str = "";
        }
        C13154c c13154c = new C13154c();
        c13154c.m37421a(campaignEx);
        c13154c.m37439f(i3);
        H5DownLoadManager.getInstance().downloadH5Res(c13154c, str, this.f33447t);
    }

    /* JADX INFO: renamed from: a */
    private void m34429a(CampaignEx campaignEx, C13154c c13154c, InterfaceC13155a interfaceC13155a) {
        try {
            C13092c.m37119a(campaignEx, this.f33432e, c13154c, new h(campaignEx, interfaceC13155a));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34430a(CampaignEx campaignEx, String str, int i2) throws Throwable {
        C13082b c13082b = new C13082b(880009);
        c13082b.m37024c(str);
        m34435a(c13082b, this.f33441n, i2, campaignEx);
        C12663a.m34532a(2, str, this.f33428a, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34431a(CampaignEx campaignEx, String str, boolean z, String str2) {
        try {
            C13080n c13080n = new C13080n();
            c13080n.m36971e(2);
            c13080n.m36982j("m_download_end");
            if (campaignEx != null) {
                c13080n.m36961b(campaignEx.isMraid() ? C13080n.f35733N : C13080n.f35734O);
                c13080n.m36992o(campaignEx.getRequestIdNotice());
            }
            c13080n.m36963b("url", str);
            c13080n.m36963b("scenes", "1");
            if (z) {
                c13080n.m36968d(1);
            } else {
                c13080n.m36968d(3);
                c13080n.m36988m(str2);
            }
            C13156d.m37475b().m37481a(c13080n, campaignEx);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b(f33427z, e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34432a(CampaignUnit campaignUnit, int i2, String str, String str2) throws Throwable {
        String str3;
        C13157e c13157e = new C13157e();
        c13157e.m37501a("adtp", 298);
        if (TextUtils.isEmpty(str2)) {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        }
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            str3 = str2;
        } else {
            str3 = str2;
            campaignUnit.setLocalRequestId(C13156d.m37475b().m37478a(i2 == 1, str3, c13157e, campaignUnit.getAds().get(0), str).m37463t());
        }
        List<CampaignEx> listM34418a = m34418a(campaignUnit);
        if (listM34418a == null || listM34418a.size() <= 0) {
            C13219q0.m37818c(f33427z, "onload load失败 返回的compaign没有可以用的");
            m34435a(new C13082b(880033), str3, i2, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
            return;
        }
        m34451g();
        C13219q0.m37818c(f33427z, "onload load成功 size:" + listM34418a.size());
        CampaignEx campaignEx = listM34418a.get(0);
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) || (!TextUtils.isEmpty(campaignEx.getAdHtml()) && campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
        } else {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
        }
        m34456j(campaignEx, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m34433a(C13082b c13082b, int i2, CampaignEx campaignEx) {
        if (this.f33444q) {
            return;
        }
        m34438b();
        if (c13082b != null) {
            C13219q0.m37816b(f33427z, "real failed: " + c13082b.m37032l());
        }
        this.f33444q = true;
        C12660b c12660b = this.f33431d;
        if (c12660b != null) {
            c12660b.m34484a(c13082b, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34434a(C13082b c13082b, int i2, String str) throws Throwable {
        CampaignEx campaignExM34473a = C12658d.m34473a(this.f33433f, this.f33429b, this.f33428a, str, this.f33437j, true, true);
        if (campaignExM34473a == null) {
            m34433a(c13082b, i2, campaignExM34473a);
        } else {
            C13219q0.m37816b(f33427z, "load failed cache ");
            m34456j(campaignExM34473a, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34435a(C13082b c13082b, String str, int i2, CampaignEx campaignEx) throws Throwable {
        if (this.f33443p) {
            this.f33443p = false;
            m34434a(c13082b, i2, str);
        } else {
            if (c13082b != null) {
                c13082b.m37017a(campaignEx);
            }
            m34433a(c13082b, i2, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34436a(String str, CampaignEx campaignEx, int i2) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f33433f;
        if (mBNativeAdvancedView == null || mBNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        C12663a.m34541b(this.f33428a, campaignEx);
        C12676b c12676b = new C12676b(this.f33433f.getContext(), this.f33429b, this.f33428a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        c12676b.m34583a(arrayList);
        c12676b.m34580a(this.f33437j);
        c12676b.m34584b(this.f33438k);
        this.f33433f.setAdvancedNativeSignalCommunicationImpl(c12676b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        MBNativeAdvancedWebview advancedNativeWebview = this.f33433f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            m34430a(campaignEx, "webview is null", i2);
            return;
        }
        if (advancedNativeWebview.isDestoryed()) {
            m34430a(campaignEx, "webview is destroyed", i2);
            return;
        }
        advancedNativeWebview.setWebViewListener(new b(campaignEx, i2, jCurrentTimeMillis));
        if (advancedNativeWebview.isDestoryed()) {
            m34435a(new C13082b(880031), this.f33441n, i2, campaignEx);
            C12663a.m34535a(C13008c.m36588n().m36542d(), campaignEx, this.f33428a, "webview had destory", jCurrentTimeMillis, 3);
            return;
        }
        C13219q0.m37816b(f33427z, "=======开始渲染: " + str);
        Handler handler = this.f33451x;
        if (handler != null) {
            handler.post(new c(advancedNativeWebview, str));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m34438b() {
        this.f33451x.removeCallbacks(this.f33452y);
    }

    /* JADX INFO: renamed from: b */
    private void m34440b(CampaignEx campaignEx, int i2) {
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(campaignEx.getGifUrl(), new j(campaignEx, i2));
    }

    /* JADX INFO: renamed from: c */
    private void m34442c(CampaignEx campaignEx, int i2) {
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(campaignEx.getImageUrl(), new l(campaignEx, i2));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c6 A[Catch: Exception -> 0x0120, all -> 0x013b, TRY_ENTER, TryCatch #6 {Exception -> 0x0120, blocks: (B:40:0x00c6, B:42:0x00ca, B:44:0x00d0, B:46:0x00d6, B:48:0x00dc, B:50:0x00ef, B:51:0x00f8, B:27:0x00a5), top: B:86:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    private void m34444d(CampaignEx campaignEx, int i2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file;
        FileOutputStream fileOutputStream3 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        File file2 = null;
        FileOutputStream fileOutputStream4 = null;
        FileOutputStream fileOutputStream5 = null;
        try {
            try {
                try {
                    try {
                        try {
                            C13145g.m37360a("m_download_start", campaignEx, "", this.f33428a, "8");
                            File file3 = new File(campaignEx.getAdHtml());
                            try {
                                if (file3.exists()) {
                                    file = file3;
                                } else {
                                    String strM37149b = C13098e.m37149b(EnumC13096c.MBRIDGE_700_HTML);
                                    String md5 = SameMD5.getMD5(C13188c1.m37646b(campaignEx.getAdHtml()));
                                    if (TextUtils.isEmpty(md5)) {
                                        md5 = String.valueOf(System.currentTimeMillis());
                                    }
                                    file = new File(strM37149b, md5.concat(".html"));
                                    try {
                                        if (!file.exists()) {
                                            fileOutputStream = new FileOutputStream(file);
                                            try {
                                                String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, "<script>" + C13645a.m39758a().m39764b() + "</script>" + campaignEx.getAdHtml());
                                                if (campaignEx.isActiveOm()) {
                                                    strInjectScriptContentIntoHtml = C13439b.m38948a(strInjectScriptContentIntoHtml);
                                                }
                                                fileOutputStream.write(strInjectScriptContentIntoHtml.getBytes());
                                                fileOutputStream.flush();
                                                fileOutputStream5 = fileOutputStream;
                                            } catch (Exception e2) {
                                                e = e2;
                                                fileOutputStream5 = fileOutputStream;
                                                file3 = file;
                                                e.printStackTrace();
                                                campaignEx.setMraid("");
                                                C13145g.m37360a("m_download_end", campaignEx, e.getMessage(), this.f33428a, "8");
                                                if (fileOutputStream5 != null) {
                                                    fileOutputStream5.close();
                                                }
                                                file = file3;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Exception unused) {
                                                        fileOutputStream3 = fileOutputStream;
                                                        m34435a(new C13082b(880013), this.f33441n, i2, campaignEx);
                                                        if (fileOutputStream3 != null) {
                                                            fileOutputStream3.close();
                                                        }
                                                        return;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        fileOutputStream4 = fileOutputStream;
                                                        if (fileOutputStream4 != null) {
                                                            try {
                                                                fileOutputStream4.close();
                                                            } catch (IOException e3) {
                                                                C13219q0.m37816b(f33427z, e3.getMessage());
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                }
                                try {
                                    C13145g.m37360a("m_download_end", campaignEx, "", this.f33428a, "8");
                                    if (fileOutputStream5 != null) {
                                        fileOutputStream5.close();
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    fileOutputStream2 = fileOutputStream5;
                                    file2 = file;
                                    file3 = file2;
                                    fileOutputStream5 = fileOutputStream2;
                                    e.printStackTrace();
                                    campaignEx.setMraid("");
                                    C13145g.m37360a("m_download_end", campaignEx, e.getMessage(), this.f33428a, "8");
                                    if (fileOutputStream5 != null) {
                                        fileOutputStream5.close();
                                    }
                                    file = file3;
                                }
                            } catch (Exception e6) {
                                e = e6;
                            }
                        } catch (IOException e7) {
                            C13219q0.m37816b(f33427z, e7.getMessage());
                            return;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        fileOutputStream2 = null;
                    }
                    if (file.exists() && file.isFile() && file.canRead()) {
                        campaignEx.setAdHtml(file.getAbsolutePath());
                        C13219q0.m37813a(f33427z, "开始渲染 HTML： ");
                        Handler handler = this.f33451x;
                        if (handler != null) {
                            handler.post(new m(file, campaignEx, i2));
                        }
                    } else {
                        C13219q0.m37813a(f33427z, "渲染 HTML 失败： html file write failed");
                        C13082b c13082b = new C13082b(880013);
                        m34435a(c13082b, this.f33441n, i2, campaignEx);
                        m34435a(c13082b, this.f33441n, i2, campaignEx);
                    }
                    if (fileOutputStream5 != null) {
                        fileOutputStream5.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream5;
                }
            } catch (Throwable th4) {
                th = th4;
                if (fileOutputStream4 != null) {
                    fileOutputStream4.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: e */
    private void m34446e(CampaignEx campaignEx, int i2) throws Throwable {
        MBNativeAdvancedView mBNativeAdvancedView = this.f33433f;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            C13219q0.m37813a(f33427z, "开始下载zip： " + campaignEx.getAdZip());
            m34452g(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            C13219q0.m37813a(f33427z, "开始下载HTML： " + campaignEx.getAdHtml());
            m34444d(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            C13219q0.m37813a(f33427z, "开始下载Video： " + campaignEx.getVideoUrlEncode());
            m34449f(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
            C13219q0.m37813a(f33427z, "开始下载image： " + campaignEx.getImageUrl());
            m34442c(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
            C13219q0.m37813a(f33427z, "开始下载EndCard： " + campaignEx.getendcard_url());
            m34428a(campaignEx, i2);
        }
        if (TextUtils.isEmpty(campaignEx.getGifUrl())) {
            return;
        }
        C13219q0.m37813a(f33427z, "开始下载gitUrl： " + campaignEx.getGifUrl());
        m34440b(campaignEx, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m34448f() {
        this.f33449v = 0;
    }

    /* JADX INFO: renamed from: f */
    private void m34449f(CampaignEx campaignEx, int i2) {
        this.f33445r = new d(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        C14203b.getInstance().createUnitCache(this.f33432e, this.f33428a, copyOnWriteArrayList, 298, this.f33445r);
        if (!C14203b.getInstance().m42526b(298, this.f33428a, campaignEx.isBidCampaign())) {
            C13219q0.m37813a(f33427z, " load Video");
            C14203b.getInstance().load(this.f33428a);
        } else {
            C13219q0.m37813a(f33427z, " load Video isReady true");
            this.f33433f.setVideoReady(true);
            m34455i(campaignEx, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m34451g() {
        try {
            int i2 = this.f33449v + 1;
            this.f33449v = i2;
            C13640l c13640l = this.f33434g;
            if (c13640l == null || i2 > c13640l.m39678y()) {
                C13219q0.m37818c(f33427z, "onload 重置offset为0");
                this.f33449v = 0;
            }
            C13219q0.m37818c(f33427z, "onload 算出 下次的offset是:" + this.f33449v);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m34452g(CampaignEx campaignEx, int i2) {
        String adZip;
        this.f33446s = new a(campaignEx, i2);
        C13154c c13154c = new C13154c();
        c13154c.m37421a(campaignEx);
        int i3 = 0;
        if (campaignEx != null) {
            i3 = campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0;
            adZip = campaignEx.getAdZip();
        } else {
            adZip = "";
        }
        c13154c.m37439f(i3);
        c13154c.m37437e(2);
        H5DownLoadManager.getInstance().downloadH5Res(c13154c, adZip, this.f33446s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m34454h(CampaignEx campaignEx, int i2) {
        if (this.f33433f.isH5Ready()) {
            m34455i(campaignEx, i2);
            C12663a.m34532a(1, "", this.f33428a, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m34455i(CampaignEx campaignEx, int i2) {
        if (!C12658d.m34480a(this.f33433f, campaignEx, this.f33429b, this.f33428a) || this.f33444q) {
            return;
        }
        m34438b();
        C12658d.m34479a(campaignEx, this.f33428a);
        this.f33444q = true;
        C12660b c12660b = this.f33431d;
        if (c12660b != null) {
            c12660b.m34483a(campaignEx, i2);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m34456j(CampaignEx campaignEx, int i2) throws Throwable {
        this.f33436i = campaignEx;
        if (C12658d.m34480a(this.f33433f, campaignEx, this.f33429b, this.f33428a)) {
            m34455i(campaignEx, i2);
        } else {
            m34446e(campaignEx, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m34457a(String str) {
        int iM42504o;
        if (this.f33436i == null) {
            return "";
        }
        try {
            C14202a c14202aM42516a = C14203b.getInstance().m42516a(this.f33428a, this.f33436i.getId() + this.f33436i.getVideoUrlEncode() + this.f33436i.getBidToken());
            if (c14202aM42516a != null && (iM42504o = c14202aM42516a.m42504o()) == 5) {
                String strM42505p = c14202aM42516a.m42505p();
                if (new File(strM42505p).exists()) {
                    C13219q0.m37816b(f33427z, "本地已下载完 拿本地播放地址：" + strM42505p + " state：" + iM42504o);
                    return strM42505p;
                }
            }
        } catch (Exception e2) {
            C13219q0.m37816b(f33427z, e2.getMessage());
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public void m34458a(int i2) {
        this.f33437j = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m34459a(int i2, int i3) {
        this.f33440m = i2;
        this.f33439l = i3;
    }

    /* JADX INFO: renamed from: a */
    public void m34460a(C12660b c12660b) {
        this.f33431d = c12660b;
    }

    /* JADX INFO: renamed from: a */
    public void m34461a(MBNativeAdvancedView mBNativeAdvancedView) {
        this.f33433f = mBNativeAdvancedView;
    }

    /* JADX INFO: renamed from: a */
    public void m34462a(C13640l c13640l) {
        this.f33434g = c13640l;
    }

    /* JADX INFO: renamed from: b */
    public void m34463b(String str, int i2) throws Throwable {
        String str2;
        CampaignEx campaignExM34473a;
        List<Integer> listM39627c;
        this.f33444q = false;
        this.f33441n = str;
        this.f33442o = i2;
        this.f33436i = null;
        if (this.f33433f == null) {
            m34435a(new C13082b(880030), str, i2, (CampaignEx) null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            campaignExM34473a = C12658d.m34473a(this.f33433f, this.f33429b, this.f33428a, str, this.f33437j, false, false);
            str2 = str;
        } else {
            str2 = str;
            campaignExM34473a = C12658d.m34473a(this.f33433f, this.f33429b, this.f33428a, str2, this.f33437j, false, true);
        }
        long timestamp = campaignExM34473a != null ? campaignExM34473a.getTimestamp() : 0L;
        C13640l c13640l = this.f33434g;
        if (c13640l != null && c13640l.m39668t() == 1 && this.f33433f != null && campaignExM34473a != null) {
            m34456j(campaignExM34473a, i2);
            return;
        }
        this.f33443p = false;
        C13640l c13640l2 = this.f33434g;
        if (c13640l2 == null || (listM39627c = c13640l2.m39627c()) == null || listM39627c.size() <= 0) {
            this.f33430c = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        } else {
            this.f33430c = listM39627c.get(0).intValue() * 1000;
        }
        C13219q0.m37813a(f33427z, "开始从V3请求新的 offer，超时 ：" + this.f33430c);
        if (this.f33434g == null || timestamp <= 0 || !TextUtils.isEmpty(str2)) {
            m34419a(this.f33430c);
            m34420a(this.f33432e, str2, i2);
        } else if (System.currentTimeMillis() - timestamp <= this.f33434g.m39672v() * 1000) {
            m34456j(campaignExM34473a, i2);
        } else {
            m34419a(this.f33430c);
            m34420a(this.f33432e, str2, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public String m34464c() {
        return C13092c.m37122b(this.f33435h);
    }

    /* JADX INFO: renamed from: d */
    public String m34465d() {
        return this.f33450w;
    }

    /* JADX INFO: renamed from: e */
    public void m34466e() {
        if (this.f33431d != null) {
            this.f33431d = null;
        }
        if (this.f33445r != null) {
            this.f33445r = null;
        }
        if (this.f33446s != null) {
            this.f33446s = null;
        }
    }
}
