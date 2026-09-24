package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.DownloadError;
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
import com.mbridge.msdk.foundation.tools.C13236z;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.setting.util.C13645a;
import com.mbridge.msdk.splash.common.C13651c;
import com.mbridge.msdk.splash.inter.InterfaceC13653a;
import com.mbridge.msdk.splash.middle.C13662b;
import com.mbridge.msdk.splash.report.C13665a;
import com.mbridge.msdk.splash.request.AbstractC13667b;
import com.mbridge.msdk.splash.request.C13668c;
import com.mbridge.msdk.splash.request.C13670e;
import com.mbridge.msdk.splash.request.C13671f;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.nativeview.InterfaceC13705a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e */
/* JADX INFO: compiled from: SplashLoadManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13658e {

    /* JADX INFO: renamed from: A */
    private static String f38247A = "SplashLoadManager";

    /* JADX INFO: renamed from: a */
    private String f38248a;

    /* JADX INFO: renamed from: b */
    private String f38249b;

    /* JADX INFO: renamed from: c */
    private long f38250c;

    /* JADX INFO: renamed from: d */
    private long f38251d;

    /* JADX INFO: renamed from: e */
    private C13662b f38252e;

    /* JADX INFO: renamed from: g */
    private MBSplashView f38254g;

    /* JADX INFO: renamed from: h */
    private C13640l f38255h;

    /* JADX INFO: renamed from: i */
    private boolean f38256i;

    /* JADX INFO: renamed from: j */
    private int f38257j;

    /* JADX INFO: renamed from: k */
    private int f38258k;

    /* JADX INFO: renamed from: l */
    private int f38259l;

    /* JADX INFO: renamed from: m */
    private String f38260m;

    /* JADX INFO: renamed from: n */
    private int f38261n;

    /* JADX INFO: renamed from: o */
    private boolean f38262o;

    /* JADX INFO: renamed from: p */
    private volatile boolean f38263p;

    /* JADX INFO: renamed from: q */
    private InterfaceC14217a f38264q;

    /* JADX INFO: renamed from: r */
    private H5DownLoadManager.ZipDownloadListener f38265r;

    /* JADX INFO: renamed from: s */
    private String f38266s;

    /* JADX INFO: renamed from: t */
    private int f38267t;

    /* JADX INFO: renamed from: v */
    private int f38269v;

    /* JADX INFO: renamed from: w */
    private List<CampaignEx> f38270w;

    /* JADX INFO: renamed from: u */
    private String f38268u = "";

    /* JADX INFO: renamed from: x */
    private String f38271x = "";

    /* JADX INFO: renamed from: y */
    private Handler f38272y = new c(Looper.getMainLooper());

    /* JADX INFO: renamed from: z */
    private Runnable f38273z = new d();

    /* JADX INFO: renamed from: f */
    private Context f38253f = C13008c.m36588n().m36542d();

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$a */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    /* JADX INFO: loaded from: classes9.dex */
    class a implements C13660g.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38274a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f38275b;

        a(CampaignEx campaignEx, int i) {
            this.f38274a = campaignEx;
            this.f38275b = i;
        }

        @Override // com.mbridge.msdk.splash.manager.C13660g.c
        /* JADX INFO: renamed from: a */
        public void mo39940a() {
            if (this.f38274a.isHasMBTplMark()) {
                return;
            }
            C13658e.this.m39925g(this.f38274a, this.f38275b);
        }

        @Override // com.mbridge.msdk.splash.manager.C13660g.c
        /* JADX INFO: renamed from: a */
        public void mo39941a(int i) throws Throwable {
            if (i == 1) {
                C13658e.this.m39925g(this.f38274a, this.f38275b);
            } else {
                C13658e.this.m39908a("readyState 2", this.f38275b, this.f38274a);
            }
        }

        @Override // com.mbridge.msdk.splash.manager.C13660g.c
        public void onError(String str) throws Throwable {
            C13658e.this.m39908a(str, this.f38275b, this.f38274a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$b */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class b implements InterfaceC14217a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38277a;

        b(CampaignEx campaignEx) {
            this.f38277a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34468a(String str) {
            C13658e.this.f38254g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f38277a;
            messageObtain.what = 3;
            C13658e.this.f38272y.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34469a(String str, String str2) throws Throwable {
            C13658e.this.f38254g.setVideoReady(false);
            C13082b c13082b = new C13082b(880004);
            c13082b.m37024c(str);
            C13658e c13658e = C13658e.this;
            c13658e.m39901a(c13082b, c13658e.f38260m, C13658e.this.f38261n, this.f38277a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f38277a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            C13658e.this.f38272y.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$c */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                Object obj = message.obj;
                int i3 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    C13658e.this.m39909a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i3);
                    return;
                }
                return;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    C13658e c13658e = C13658e.this;
                    c13658e.m39927h((CampaignEx) obj2, c13658e.f38261n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i4 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    if (i4 == 1) {
                        i = 880004;
                    } else {
                        i = i4 == 2 ? 880006 : 880027;
                    }
                    C13082b c13082b = new C13082b(i);
                    c13082b.m37024c(string);
                    C13658e c13658e2 = C13658e.this;
                    c13658e2.m39901a(c13082b, c13658e2.f38260m, C13658e.this.f38261n, campaignEx2);
                }
            } catch (Exception e) {
                C13082b c13082b2 = new C13082b(880024);
                c13082b2.m37021a((Throwable) e);
                C13658e c13658e3 = C13658e.this;
                c13658e3.m39901a(c13082b2, c13658e3.f38260m, C13658e.this.f38261n, (CampaignEx) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$d */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    /* JADX INFO: loaded from: classes9.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            C13082b c13082b = new C13082b(880010);
            C13658e c13658e = C13658e.this;
            c13658e.m39901a(c13082b, c13658e.f38260m, C13658e.this.f38261n, (CampaignEx) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$e */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class e extends AbstractC13667b {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f38281e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f38282f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i, String str, int i2) {
            super(i);
            this.f38281e = str;
            this.f38282f = i2;
        }

        @Override // com.mbridge.msdk.splash.request.AbstractC13667b
        /* JADX INFO: renamed from: a */
        public void mo39942a(CampaignUnit campaignUnit, int i) throws Throwable {
            try {
                C13658e c13658e = C13658e.this;
                c13658e.m39898a(campaignUnit, i, c13658e.f38248a, this.f38281e);
                C13658e.this.f38268u = campaignUnit.getRequestId();
                C13658e.this.f38270w = campaignUnit.getAds();
            } catch (Exception e) {
                e.printStackTrace();
                C13082b c13082b = new C13082b(880003);
                c13082b.m37021a((Throwable) e);
                C13658e.this.m39901a(c13082b, this.f38281e, i, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                C13658e.this.m39922f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.AbstractC13667b
        /* JADX INFO: renamed from: b */
        public void mo39943b(int i, String str) throws Throwable {
            C13219q0.m37816b(C13658e.f38247A, str);
            C13082b c13082b = new C13082b(880002);
            c13082b.m37024c(str);
            C13658e.this.m39901a(c13082b, this.f38281e, this.f38282f, (CampaignEx) null);
            C13658e.this.m39922f();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$f */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class f extends C13092c.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38284a;

        f(CampaignEx campaignEx, InterfaceC13155a interfaceC13155a) {
            this.f38284a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.C13092c.a
        /* JADX INFO: renamed from: a */
        public void mo34472a(String str, C13154c c13154c) {
            C13665a.m40028a(str, c13154c, this.f38284a, C13658e.this.f38253f, (InterfaceC13155a) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$g */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38286a;

        g(CampaignEx campaignEx) {
            this.f38286a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13020j.m36706a(C13017g.m36693a(C13658e.this.f38253f)).m36710d();
            C13234y.m37954a(C13658e.this.f38253f, this.f38286a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$h */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class h implements InterfaceC13705a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38288a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f38289b;

        h(CampaignEx campaignEx, int i) {
            this.f38288a = campaignEx;
            this.f38289b = i;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.InterfaceC13705a
        /* JADX INFO: renamed from: a */
        public void mo39944a() {
            if (this.f38288a.isDynamicView() && C13658e.this.f38254g != null) {
                C13658e.this.f38254g.setImageReady(true);
                C13658e.this.m39923f(this.f38288a, this.f38289b);
            }
            C13658e.this.m39927h(this.f38288a, this.f38289b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.InterfaceC13705a
        /* JADX INFO: renamed from: b */
        public void mo39945b() throws Throwable {
            if (!this.f38288a.isDynamicView() || C13658e.this.f38254g == null) {
                return;
            }
            C13658e.this.f38254g.setImageReady(false);
            C13082b c13082b = new C13082b(880027);
            C13658e c13658e = C13658e.this;
            c13658e.m39901a(c13082b, c13658e.f38260m, this.f38289b, this.f38288a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$i */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class i implements C13236z.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38291a;

        i(CampaignEx campaignEx) {
            this.f38291a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.C13236z.c
        /* JADX INFO: renamed from: a */
        public void mo37965a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            C13658e.this.m39897a(this.f38291a, str, false, message);
        }

        @Override // com.mbridge.msdk.foundation.tools.C13236z.c
        /* JADX INFO: renamed from: a */
        public void mo37966a(String str, String str2, String str3, String str4, boolean z) {
            if (z) {
                return;
            }
            C13658e.this.m39897a(this.f38291a, str, true, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$j */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class j implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38293a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f38294b;

        j(CampaignEx campaignEx, int i) {
            this.f38293a = campaignEx;
            this.f38294b = i;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            C13082b c13082b = new C13082b(880006);
            C13658e c13658e = C13658e.this;
            c13658e.m39901a(c13082b, c13658e.f38260m, this.f38294b, this.f38293a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f38293a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            C13658e.this.f38272y.sendMessage(messageObtain);
            C13658e.this.m39897a(this.f38293a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f38293a;
            messageObtain.arg1 = this.f38294b;
            C13658e.this.f38272y.sendMessage(messageObtain);
            if (z) {
                return;
            }
            CampaignEx campaignEx = this.f38293a;
            C13658e.this.m39897a(this.f38293a, campaignEx != null ? campaignEx.getAdZip() : "", true, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$k */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    class k implements InterfaceC13653a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f38296a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f38297b;

        k(CampaignEx campaignEx, int i) {
            this.f38296a = campaignEx;
            this.f38297b = i;
        }

        @Override // com.mbridge.msdk.splash.inter.InterfaceC13653a
        /* JADX INFO: renamed from: a */
        public void mo39826a(View view) {
            if (C13658e.this.f38254g != null) {
                C13658e.this.f38254g.setDynamicView(true);
                C13658e.this.f38254g.setSplashNativeView(view);
                C13658e.this.m39927h(this.f38296a, this.f38297b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.InterfaceC13653a
        public void onError(String str) throws Throwable {
            C13082b c13082b = new C13082b(880034);
            c13082b.m37024c(str);
            C13658e c13658e = C13658e.this;
            c13658e.m39901a(c13082b, c13658e.f38260m, this.f38297b, this.f38296a);
        }
    }

    public C13658e(String str, String str2, long j2) {
        this.f38249b = str;
        this.f38248a = str2;
        this.f38251d = j2;
    }

    /* JADX INFO: renamed from: a */
    private List<CampaignEx> m39890a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f38248a);
        m39894a(campaignEx);
        this.f38266s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (C13229v0.m37916c(campaignEx)) {
                campaignEx.setRtinsType(C13229v0.m37915c(this.f38253f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (C13092c.m37123b(this.f38253f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                C13229v0.m37896a(this.f38248a, campaignEx, C13088a.f35882x);
                this.f38271x = "APP ALREADY INSTALLED";
            }
            m39896a(campaignEx, (C13154c) null, (InterfaceC13155a) null);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m39892a(long j2) {
        this.f38272y.postDelayed(this.f38273z, j2);
    }

    /* JADX INFO: renamed from: a */
    private void m39893a(Context context, String str, int i2) throws Throwable {
        Exception exc;
        String str2;
        try {
            if (context == null) {
                m39901a(new C13082b(880025), str, i2, (CampaignEx) null);
                return;
            }
            try {
                if (C13182a1.m37596a(this.f38248a)) {
                    m39901a(new C13082b(880032), str, i2, (CampaignEx) null);
                    return;
                }
                MBridgeIds mBridgeIds = new MBridgeIds(this.f38249b, this.f38248a);
                C13671f c13671f = new C13671f();
                c13671f.m40047d(i2);
                c13671f.m40045c(this.f38267t);
                c13671f.m40041a(this.f38266s);
                c13671f.m40043b(this.f38259l);
                c13671f.m40040a(this.f38258k);
                C13126e c13126eM40038b = C13670e.m40038b(context, mBridgeIds, c13671f);
                if (c13126eM40038b == null) {
                    m39901a(new C13082b(880001), str, i2, (CampaignEx) null);
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    c13126eM40038b.m37245a("token", str);
                }
                String strM37921d = C13229v0.m37921d(this.f38248a);
                if (!TextUtils.isEmpty(strM37921d)) {
                    c13126eM40038b.m37245a("j", strM37921d);
                }
                C13668c c13668c = new C13668c(context);
                e eVar = new e(i2, str, i2);
                eVar.m40037a(str);
                eVar.setUnitId(this.f38248a);
                eVar.setPlacementId(this.f38249b);
                eVar.setAdType(297);
                str2 = str;
                try {
                    c13668c.choiceV3OrV5BySetting(1, c13126eM40038b, eVar, str2, C13092c.m37115a(this.f38250c, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    return;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                str2 = str;
            }
            exc = e;
            C13219q0.m37816b(f38247A, exc.getMessage());
            C13082b c13082b = new C13082b(880020);
            c13082b.m37021a((Throwable) exc);
            m39901a(c13082b, str2, i2, (CampaignEx) null);
            m39922f();
        } catch (Exception e4) {
            exc = e4;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39894a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    /* JADX INFO: renamed from: a */
    private void m39895a(CampaignEx campaignEx, int i2) throws Throwable {
        this.f38254g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            m39920e(campaignEx, i2);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            m39918d(campaignEx, i2);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            m39912b(campaignEx, i2);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        m39915c(campaignEx, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m39896a(CampaignEx campaignEx, C13154c c13154c, InterfaceC13155a interfaceC13155a) {
        try {
            C13092c.m37119a(campaignEx, this.f38253f, c13154c, new f(campaignEx, interfaceC13155a));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39897a(CampaignEx campaignEx, String str, boolean z, String str2) {
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
                C13219q0.m37816b(f38247A, e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39898a(CampaignUnit campaignUnit, int i2, String str, String str2) throws Throwable {
        List<CampaignEx> listM39890a = m39890a(campaignUnit);
        if (listM39890a == null || listM39890a.size() <= 0) {
            m39901a(this.f38271x.contains("INSTALLED") ? new C13082b(880021, "APP ALREADY INSTALLED") : new C13082b(880003), str2, i2, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
            return;
        }
        m39924g();
        C13157e c13157e = new C13157e();
        c13157e.m37501a("adtp", 297);
        if (TextUtils.isEmpty(str2)) {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        }
        CampaignEx campaignEx = listM39890a.get(0);
        C13156d.m37475b().m37478a(true, str2, c13157e, campaignEx, str);
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) || (!TextUtils.isEmpty(campaignEx.getAdHtml()) && campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
        } else {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
        }
        m39928i(campaignEx, i2);
    }

    /* JADX INFO: renamed from: a */
    private void m39899a(C13082b c13082b, int i2, CampaignEx campaignEx) {
        if (this.f38263p) {
            return;
        }
        m39911b();
        this.f38263p = true;
        if (c13082b != null) {
            c13082b.m37017a(campaignEx);
        }
        C13662b c13662b = this.f38252e;
        if (c13662b != null) {
            c13662b.m39965a(c13082b, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39900a(C13082b c13082b, int i2, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExM39877a = C13657d.m39877a(this.f38254g, this.f38249b, this.f38248a, str, this.f38256i, this.f38257j, true, false);
        if (campaignExM39877a != null) {
            m39928i(campaignExM39877a, i2);
        } else {
            m39899a(c13082b, i2, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39901a(C13082b c13082b, String str, int i2, CampaignEx campaignEx) throws Throwable {
        if (!this.f38262o) {
            m39899a(c13082b, i2, campaignEx);
        } else {
            this.f38262o = false;
            m39900a(c13082b, i2, str, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39908a(String str, int i2, CampaignEx campaignEx) throws Throwable {
        C13082b c13082b = new C13082b(880009);
        c13082b.m37024c(str);
        m39901a(c13082b, this.f38260m, i2, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39909a(String str, CampaignEx campaignEx, int i2) {
        C13660g.d dVar = new C13660g.d();
        dVar.m39960c(this.f38248a);
        dVar.m39958b(this.f38249b);
        dVar.m39954a(campaignEx);
        dVar.m39955a(str);
        dVar.m39956a(this.f38256i);
        dVar.m39953a(this.f38257j);
        C13660g.m39946a().m39949a(this.f38254g, dVar, new a(campaignEx, i2));
    }

    /* JADX INFO: renamed from: b */
    private void m39911b() {
        this.f38272y.removeCallbacks(this.f38273z);
    }

    /* JADX INFO: renamed from: b */
    private void m39912b(CampaignEx campaignEx, int i2) {
        this.f38264q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        C14203b.getInstance().createUnitCache(this.f38253f, this.f38248a, copyOnWriteArrayList, 297, this.f38264q);
        if (!C14203b.getInstance().m42526b(297, this.f38248a, campaignEx.isBidCampaign())) {
            C14203b.getInstance().load(this.f38248a);
        } else {
            this.f38254g.setVideoReady(true);
            m39927h(campaignEx, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m39915c(CampaignEx campaignEx, int i2) {
        C13657d.m39881a(this.f38254g, campaignEx, new h(campaignEx, i2));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[Catch: Exception -> 0x010b, TRY_ENTER, TryCatch #4 {Exception -> 0x010b, blocks: (B:52:0x0107, B:53:0x010a, B:40:0x00c8, B:42:0x00cc, B:44:0x00d2, B:46:0x00d8, B:48:0x00de, B:49:0x00f9, B:27:0x00a7), top: B:63:0x000e }] */
    /* JADX INFO: renamed from: d */
    private void m39918d(CampaignEx campaignEx, int i2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        File file;
        File file2 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream3 = null;
        FileOutputStream fileOutputStream4 = null;
        try {
            try {
                try {
                    C13145g.m37360a("m_download_start", campaignEx, "", this.f38248a, "6");
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
                                    fileOutputStream2 = new FileOutputStream(file);
                                    try {
                                        String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, "<script>" + C13645a.m39758a().m39764b() + "</script>" + campaignEx.getAdHtml());
                                        if (campaignEx.isActiveOm()) {
                                            strInjectScriptContentIntoHtml = C13439b.m38948a(strInjectScriptContentIntoHtml);
                                        }
                                        fileOutputStream2.write(strInjectScriptContentIntoHtml.getBytes());
                                        fileOutputStream2.flush();
                                        fileOutputStream3 = fileOutputStream2;
                                    } catch (Exception e2) {
                                        e = e2;
                                        fileOutputStream4 = fileOutputStream2;
                                        file3 = file;
                                        e.printStackTrace();
                                        campaignEx.setMraid("");
                                        C13145g.m37360a("m_download_end", campaignEx, e.getMessage(), this.f38248a, "6");
                                        if (fileOutputStream4 != null) {
                                            fileOutputStream4.close();
                                        }
                                        file = file3;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileOutputStream2 != null) {
                                            fileOutputStream2.close();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                            }
                        }
                        try {
                            C13145g.m37360a("m_download_end", campaignEx, "", this.f38248a, "6");
                            if (fileOutputStream3 != null) {
                                fileOutputStream3.close();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            fileOutputStream = fileOutputStream3;
                            file2 = file;
                            file3 = file2;
                            fileOutputStream4 = fileOutputStream;
                            e.printStackTrace();
                            campaignEx.setMraid("");
                            C13145g.m37360a("m_download_end", campaignEx, e.getMessage(), this.f38248a, "6");
                            if (fileOutputStream4 != null) {
                                fileOutputStream4.close();
                            }
                            file = file3;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = null;
                }
            } catch (Exception e6) {
                e = e6;
                fileOutputStream = null;
            }
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                m39901a(new C13082b(880013), this.f38260m, i2, campaignEx);
                return;
            }
            campaignEx.setAdHtml(file.getAbsolutePath());
            m39909a("file:////" + file.getAbsolutePath(), campaignEx, i2);
        } catch (Exception unused) {
            m39901a(new C13082b(880013), this.f38260m, i2, campaignEx);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m39920e(CampaignEx campaignEx, int i2) {
        if (campaignEx.isDynamicView()) {
            C13236z.m37960a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.f38265r = new j(campaignEx, i2);
        C13154c c13154c = new C13154c();
        c13154c.m37420a(297);
        c13154c.m37437e(2);
        c13154c.m37421a(campaignEx);
        c13154c.m37439f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(c13154c, campaignEx.getAdZip(), this.f38265r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m39922f() {
        this.f38267t = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m39923f(CampaignEx campaignEx, int i2) {
        if (campaignEx.isDynamicView()) {
            C13651c.a aVar = new C13651c.a();
            aVar.m39816b(this.f38248a).m39812a(this.f38249b).m39813a(this.f38256i).m39811a(campaignEx).m39817c(this.f38257j).m39820f(this.f38269v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.m39815b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.m39819e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.m39810a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.m39821g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.m39822h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.m39823i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.m39818d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37816b(f38247A, th.getMessage());
            }
            C13656c.m39874a().m39830a(this.f38254g, aVar.m39814a(), new k(campaignEx, i2));
        }
    }

    /* JADX INFO: renamed from: g */
    private void m39924g() {
        try {
            int i2 = this.f38267t + 1;
            this.f38267t = i2;
            C13640l c13640l = this.f38255h;
            if (c13640l == null || i2 > c13640l.m39678y()) {
                this.f38267t = 0;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m39925g(CampaignEx campaignEx, int i2) {
        if (this.f38254g.isH5Ready()) {
            return;
        }
        this.f38254g.setH5Ready(true);
        m39927h(campaignEx, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m39927h(CampaignEx campaignEx, int i2) {
        if (!C13657d.m39884a(this.f38254g, campaignEx) || this.f38263p) {
            return;
        }
        m39911b();
        if (this.f38262o) {
            C13657d.m39880a(campaignEx, this.f38248a);
        }
        this.f38263p = true;
        C13662b c13662b = this.f38252e;
        if (c13662b != null) {
            c13662b.m39964a(campaignEx, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m39928i(CampaignEx campaignEx, int i2) throws Throwable {
        MBSplashView mBSplashView = this.f38254g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            m39915c(campaignEx, i2);
        } else {
            MBSplashView mBSplashView2 = this.f38254g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (C13657d.m39884a(this.f38254g, campaignEx)) {
            m39927h(campaignEx, i2);
        } else {
            m39895a(campaignEx, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39929a(int i2) {
        this.f38257j = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m39930a(int i2, int i3) {
        this.f38259l = i2;
        this.f38258k = i3;
    }

    /* JADX INFO: renamed from: a */
    public void m39931a(C13640l c13640l) {
        this.f38255h = c13640l;
    }

    /* JADX INFO: renamed from: a */
    public void m39932a(C13662b c13662b) {
        this.f38252e = c13662b;
    }

    /* JADX INFO: renamed from: a */
    public void m39933a(MBSplashView mBSplashView) {
        this.f38254g = mBSplashView;
    }

    /* JADX INFO: renamed from: a */
    public void m39934a(String str, int i2) {
        this.f38263p = false;
        this.f38260m = str;
        this.f38261n = i2;
        CampaignEx campaignExM39877a = C13657d.m39877a(this.f38254g, this.f38249b, this.f38248a, str, this.f38256i, this.f38257j, false, false);
        long timestamp = campaignExM39877a != null ? campaignExM39877a.getTimestamp() : 0L;
        if (this.f38255h.m39668t() == 1 && i2 != 1 && campaignExM39877a != null) {
            m39928i(campaignExM39877a, i2);
            return;
        }
        this.f38262o = true;
        if (i2 == 1) {
            List<Integer> listM39627c = this.f38255h.m39627c();
            if (listM39627c == null || listM39627c.size() <= 0) {
                this.f38250c = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
            } else {
                this.f38250c = listM39627c.get(0).intValue() * 1000;
            }
        } else {
            long j2 = this.f38251d;
            if (j2 <= 0) {
                this.f38250c = this.f38255h.m39608E();
            } else {
                this.f38250c = j2;
            }
        }
        if (this.f38255h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            m39892a(this.f38250c);
            m39893a(this.f38253f, str, i2);
            return;
        }
        if (System.currentTimeMillis() - timestamp <= this.f38255h.m39672v() * 1000) {
            m39928i(campaignExM39877a, i2);
        } else {
            m39892a(this.f38250c);
            m39893a(this.f38253f, str, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39935a(boolean z) {
        this.f38256i = z;
    }

    /* JADX INFO: renamed from: b */
    public void m39936b(int i2) {
        this.f38269v = i2;
    }

    /* JADX INFO: renamed from: c */
    public String m39937c() {
        return C13092c.m37122b(this.f38270w);
    }

    /* JADX INFO: renamed from: d */
    public String m39938d() {
        return this.f38268u;
    }

    /* JADX INFO: renamed from: e */
    public void m39939e() {
        if (this.f38252e != null) {
            this.f38252e = null;
        }
        if (this.f38264q != null) {
            this.f38264q = null;
        }
        if (this.f38265r != null) {
            this.f38265r = null;
        }
    }
}
