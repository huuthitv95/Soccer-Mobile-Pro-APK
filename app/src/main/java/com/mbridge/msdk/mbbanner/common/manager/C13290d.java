package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.error.C13081a;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13194e1;
import com.mbridge.msdk.foundation.tools.C13200h;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbbanner.common.communication.C13276a;
import com.mbridge.msdk.mbbanner.common.communication.C13277b;
import com.mbridge.msdk.mbbanner.common.listener.C13286e;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c;
import com.mbridge.msdk.mbbanner.common.report.C13291a;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.C13296a;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.communication.C13374d;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d */
/* JADX INFO: compiled from: BaseBannerShowManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13290d {

    /* JADX INFO: renamed from: A */
    private C13277b f36678A;

    /* JADX INFO: renamed from: B */
    private AdSession f36679B;

    /* JADX INFO: renamed from: C */
    private AdEvents f36680C;

    /* JADX INFO: renamed from: F */
    private float f36683F;

    /* JADX INFO: renamed from: G */
    private float f36684G;

    /* JADX INFO: renamed from: a */
    protected InterfaceC13284c f36688a;

    /* JADX INFO: renamed from: b */
    private boolean f36689b;

    /* JADX INFO: renamed from: c */
    protected CampaignEx f36690c;

    /* JADX INFO: renamed from: d */
    protected final MBBannerView f36691d;

    /* JADX INFO: renamed from: e */
    private ImageView f36692e;

    /* JADX INFO: renamed from: f */
    private MBBannerWebView f36693f;

    /* JADX INFO: renamed from: g */
    private ImageView f36694g;

    /* JADX INFO: renamed from: h */
    private ImageView f36695h;

    /* JADX INFO: renamed from: i */
    private boolean f36696i;

    /* JADX INFO: renamed from: j */
    private boolean f36697j;

    /* JADX INFO: renamed from: k */
    private boolean f36698k;

    /* JADX INFO: renamed from: l */
    private boolean f36699l;

    /* JADX INFO: renamed from: m */
    private boolean f36700m;

    /* JADX INFO: renamed from: n */
    private boolean f36701n;

    /* JADX INFO: renamed from: o */
    protected boolean f36702o;

    /* JADX INFO: renamed from: p */
    protected final String f36703p;

    /* JADX INFO: renamed from: q */
    private final String f36704q;

    /* JADX INFO: renamed from: r */
    private String f36705r;

    /* JADX INFO: renamed from: t */
    C12682a f36707t;

    /* JADX INFO: renamed from: u */
    private List<CampaignEx> f36708u;

    /* JADX INFO: renamed from: w */
    private View.OnTouchListener f36710w;

    /* JADX INFO: renamed from: y */
    private int f36712y;

    /* JADX INFO: renamed from: s */
    private int f36706s = -1;

    /* JADX INFO: renamed from: v */
    private int f36709v = 1;

    /* JADX INFO: renamed from: x */
    private int f36711x = 1;

    /* JADX INFO: renamed from: z */
    private final long f36713z = 15000;

    /* JADX INFO: renamed from: D */
    private final Handler f36681D = new e(Looper.getMainLooper());

    /* JADX INFO: renamed from: E */
    private final AbstractRunnableC13163a f36682E = new f();

    /* JADX INFO: renamed from: H */
    private final View.OnClickListener f36685H = new g();

    /* JADX INFO: renamed from: I */
    private InterfaceC13282a f36686I = new h();

    /* JADX INFO: renamed from: J */
    private C13377b f36687J = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$b */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36715a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36716b;

        b(Context context, CampaignEx campaignEx) {
            this.f36715a = context;
            this.f36716b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j.m36706a(C13017g.m36693a(this.f36715a)).m36709b(this.f36716b.getId());
            } catch (Exception e) {
                C13219q0.m37816b("BannerShowManager", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$c */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class c extends C13377b {
        c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            C13290d.this.f36698k = true;
            C13276a.m38144a(webView);
            C13290d.this.f36700m = true;
            CampaignEx campaignEx = C13290d.this.f36690c;
            if (campaignEx == null || campaignEx.isHasMBTplMark()) {
                return;
            }
            C13290d.this.m38271p();
            C13290d.this.m38235a("", 1);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C13082b c13082b = new C13082b(880000);
            c13082b.m37024c(i + " WebView receive error: " + i + "  message : " + str);
            c13082b.m37023b(C13290d.this.f36705r);
            C13290d.this.m38232a(c13082b);
            C13290d.this.m38235a(str, 2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onRenderProcessGone(WebView webView) {
            C13290d.this.m38255g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$e */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class e extends Handler {
        e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                if (C13290d.this.f36679B != null) {
                    C13290d c13290d = C13290d.this;
                    c13290d.f36680C = AdEvents.createAdEvents(c13290d.f36679B);
                    if (C13290d.this.f36680C != null) {
                        C13290d.this.f36680C.loaded();
                        C13290d.this.f36680C.impressionOccurred();
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37813a("BannerShowManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$f */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class f extends AbstractRunnableC13163a {
        f() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void pauseTask(boolean z) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void runTask() {
            C13082b c13082b = new C13082b(880045);
            c13082b.m37023b(C13290d.this.f36690c.getLocalRequestId());
            C13290d.this.m38232a(c13082b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$g */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C13290d c13290d = C13290d.this;
            if (c13290d.f36702o) {
                c13290d.f36706s = 1;
                C13290d.this.m38241b();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$h */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class h implements InterfaceC13282a {
        h() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a
        /* JADX INFO: renamed from: a */
        public void mo38172a(CampaignEx campaignEx) {
            C13290d.this.mo38224a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a
        public void close() {
            C13290d.this.f36706s = 2;
            C13290d.this.m38241b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a
        public void readyStatus(int i) {
            if (i != 1) {
                C13290d.this.m38255g();
            } else {
                C13290d.this.m38271p();
                C13290d.this.m38235a("", 1);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a
        public void toggleCloseBtn(int i) {
            if (i == 2) {
                C13290d.this.m38251e();
            } else {
                C13290d.this.m38267n();
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a
        public void triggerCloseBtn(String str) {
            C13290d.this.f36706s = 2;
            C13290d.this.m38241b();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a
        /* JADX INFO: renamed from: a */
        public void mo38173a(boolean z) {
            C13290d c13290d = C13290d.this;
            if (c13290d.f36688a != null) {
                c13290d.f36701n = z;
                if (z) {
                    C13290d.this.f36688a.mo38179a();
                } else {
                    C13290d.this.f36688a.mo38185d();
                }
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13282a
        /* JADX INFO: renamed from: a */
        public void mo38174a(boolean z, String str) {
            try {
                if (C13290d.this.f36688a != null) {
                    if (TextUtils.isEmpty(str)) {
                        C13290d.this.f36688a.mo38184c();
                        C13290d.this.f36688a.onLeaveApp();
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(C13290d.this.f36690c));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    C13290d.this.mo38224a(campaignWithBackData, z, str);
                }
            } catch (Exception e) {
                C13219q0.m37816b("BannerShowManager", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$i */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C13290d.this.f36693f != null) {
                    String str = C13290d.this.f36709v == 2 ? "false" : "true";
                    C13290d.this.f36693f.evaluateJavascript("(function() {\n    var videos = document.getElementsByTagName('video');\n    for (var i = 0; i < videos.length; i++) {\n    videos[i].muted = " + str + ";\n    }\n    var audios = document.getElementsByTagName('audio');\n    for (var i = 0; i < audios.length; i++) {\n    audios[i].muted = " + str + ";\n    }\n    })()", null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$j */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class j implements View.OnTouchListener {
        j() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C13290d.this.f36683F = motionEvent.getRawX();
            C13290d.this.f36684G = motionEvent.getRawY();
            C13219q0.m37816b("BannerShowManager", C13290d.this.f36683F + "  " + C13290d.this.f36684G);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$k */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C13290d.this.mo38224a(BannerUtils.managerCampaignEX(C13374d.m38663a(C13290d.this.f36683F, C13290d.this.f36684G), C13290d.this.f36690c), false, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$l */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class l implements InterfaceC13101c {
        l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13082b c13082b = new C13082b(880039);
            c13082b.m37023b(C13290d.this.f36705r);
            C13290d.this.m38232a(c13082b);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (C13290d.this.f36692e != null) {
                C13290d.this.f36692e.setImageBitmap(bitmap);
            }
            C13290d.this.f36698k = true;
            C13290d.this.m38269o();
            C13290d.this.m38267n();
            C13290d.this.m38265m();
            C13290d c13290d = C13290d.this;
            if (c13290d.f36702o) {
                return;
            }
            c13290d.m38271p();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$m */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13290d.this.m38271p();
        }
    }

    public C13290d(MBBannerView mBBannerView, InterfaceC13284c interfaceC13284c, String str, String str2, boolean z, C13640l c13640l) {
        this.f36689b = z;
        this.f36691d = mBBannerView;
        this.f36703p = str2;
        this.f36704q = str;
        this.f36688a = new C13286e(interfaceC13284c, c13640l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m38271p() {
        MBBannerView mBBannerView;
        if (this.f36698k && !this.f36699l && this.f36688a != null) {
            this.f36699l = true;
            this.f36681D.removeCallbacks(this.f36682E);
            CampaignEx campaignEx = this.f36690c;
            if (campaignEx != null && !campaignEx.isCallbacked()) {
                this.f36690c.setCallbacked(true);
                this.f36688a.mo38182a(this.f36708u);
                C12684c.m34654a(C13008c.m36588n().m36542d(), this.f36690c.getMaitve(), this.f36690c.getMaitve_src());
            }
        }
        if (this.f36698k && this.f36696i && this.f36697j && this.f36699l && this.f36690c != null && !m38249d()) {
            boolean zM38237a = m38237a();
            if (!zM38237a && (mBBannerView = this.f36691d) != null) {
                mBBannerView.postDelayed(new m(), 1000L);
            }
            if (this.f36700m && zM38237a) {
                C13219q0.m37816b("BannerShowManager", "onBannerWebViewShow && transInfoToMraid");
                int[] iArr = new int[2];
                this.f36691d.getLocationInWindow(iArr);
                C13276a.m38145a(this.f36693f, iArr[0], iArr[1]);
                C13276a.m38147a(this.f36693f, iArr[0], iArr[1], this.f36691d.getWidth(), this.f36691d.getHeight());
                this.f36700m = false;
                this.f36711x = 1;
                if (!TextUtils.isEmpty(this.f36690c.getImageUrl())) {
                    C13100b.m37152a(C13008c.m36588n().m36542d()).m37154a(this.f36690c.getImageUrl());
                }
                m38263l();
            }
            C13219q0.m37816b("BannerShowManager", "showSuccessed:" + this.f36690c.getId());
            CampaignEx campaignEx2 = this.f36690c;
            if (!zM38237a) {
                campaignEx2.setReport(false);
                return;
            }
            ImageView imageView = this.f36692e;
            if (imageView == null || imageView.getVisibility() != 0) {
                List<CampaignEx> list = this.f36708u;
                if (list != null && list.size() > 0) {
                    campaignEx2 = this.f36708u.get(0);
                    boolean z = false;
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.f36708u.size(); i3++) {
                        if (!this.f36708u.get(i3).isHasMBTplMark() && (i3 == 0 || !this.f36708u.get(i3).isReport())) {
                            m38231a(this.f36708u.get(i3), C13008c.m36588n().m36542d(), this.f36703p);
                            this.f36708u.get(i3).setReport(true);
                            C13091b.m37104a(this.f36703p, this.f36708u.get(i3), "banner");
                            i2 = i3;
                            z = true;
                        }
                    }
                    if (z) {
                        m38243b(this.f36708u.get(i2), C13008c.m36588n().m36542d(), this.f36703p);
                        m38246c(this.f36708u.get(i2), C13008c.m36588n().m36542d(), this.f36703p);
                    }
                }
            } else {
                CampaignEx campaignEx3 = this.f36690c;
                if (campaignEx3 != null) {
                    m38242b(campaignEx3);
                    this.f36690c.setReport(true);
                    this.f36711x = 2;
                    C13091b.m37104a(this.f36703p, this.f36690c, "banner");
                }
            }
            this.f36702o = true;
            if (campaignEx2 == null || this.f36688a == null || C13194e1.m37670a(this.f36691d, campaignEx2.getImpReportType())) {
                return;
            }
            this.f36688a.mo38180a(this.f36690c);
            try {
                CampaignEx campaignEx4 = this.f36690c;
                if (campaignEx4 != null && campaignEx4.isActiveOm()) {
                    Context contextM36542d = C13008c.m36588n().m36542d();
                    MBBannerWebView mBBannerWebView = this.f36693f;
                    AdSession adSessionM38945a = C13439b.m38945a(contextM36542d, mBBannerWebView, mBBannerWebView.getUrl(), this.f36690c);
                    this.f36679B = adSessionM38945a;
                    if (adSessionM38945a != null) {
                        try {
                            adSessionM38945a.registerAdView(this.f36693f);
                            ImageView imageView2 = this.f36694g;
                            if (imageView2 != null) {
                                this.f36679B.addFriendlyObstruction(imageView2, FriendlyObstructionPurpose.CLOSE_AD, null);
                            }
                            ImageView imageView3 = this.f36692e;
                            if (imageView3 != null) {
                                this.f36679B.addFriendlyObstruction(imageView3, FriendlyObstructionPurpose.OTHER, null);
                            }
                            this.f36679B.start();
                        } catch (Exception e2) {
                            C13219q0.m37813a("OMSDK", e2.getMessage());
                        }
                    } else {
                        CampaignEx campaignEx5 = this.f36690c;
                        if (campaignEx5 != null) {
                            new C13146h(C13008c.m36588n().m36542d()).m37370a(campaignEx5.getRequestId(), this.f36690c.getRequestIdNotice(), this.f36690c.getId(), this.f36703p, "fetch OM failed, context null");
                        }
                    }
                }
            } catch (Exception unused) {
                CampaignEx campaignEx6 = this.f36690c;
                if (campaignEx6 != null) {
                    new C13146h(C13008c.m36588n().m36542d()).m37370a(campaignEx6.getRequestId(), this.f36690c.getRequestIdNotice(), this.f36690c.getId(), this.f36703p, "fetch OM failed, context null");
                }
            }
            this.f36681D.sendEmptyMessageDelayed(1, 1000L);
            BitmapDrawable bitmapDrawableM36524a = C13008c.m36588n().m36524a(this.f36703p, this.f36690c.getAdType());
            if (bitmapDrawableM36524a != null) {
                if (this.f36695h == null) {
                    this.f36695h = new ImageView(C13008c.m36588n().m36542d());
                }
                if (this.f36695h.getVisibility() != 0) {
                    this.f36695h.setVisibility(0);
                }
                C13229v0.m37880a(this.f36695h, bitmapDrawableM36524a, this.f36691d.getResources().getDisplayMetrics());
                if (this.f36695h.getParent() == null) {
                    this.f36691d.addView(this.f36695h, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f36679B;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f36695h, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private boolean m38272q() {
        String strM38230a = m38230a(this.f36690c);
        if (TextUtils.isEmpty(strM38230a)) {
            return false;
        }
        if (this.f36691d != null) {
            if (this.f36693f == null) {
                try {
                    MBBannerWebView mBBannerWebView = new MBBannerWebView(C13008c.m36588n().m36542d());
                    this.f36693f = mBBannerWebView;
                    mBBannerWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f36693f.setWebViewClient(new C13296a(this.f36703p, this.f36708u, this.f36686I));
                } catch (Throwable unused) {
                    m38235a(C13081a.m37012a(880029), 1);
                    return false;
                }
            }
            ImageView imageView = this.f36692e;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.f36693f.getVisibility() != 0) {
                this.f36693f.setVisibility(0);
            }
            if (this.f36693f.getParent() == null) {
                this.f36691d.addView(this.f36693f);
                m38236a(this.f36690c.isMraid());
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a("adtp", 296);
            if (TextUtils.isEmpty(this.f36690c.getBidToken())) {
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
            }
            C13154c c13154cM38282a = C13291a.m38282a(this.f36703p, this.f36690c.getLocalRequestId());
            c13154cM38282a.m37423a(CampaignEx.KEY_LOCAL_CHECK_STATE, c13157e);
            C13185b1.m37632a(this.f36693f, c13154cM38282a.m37463t(), this.f36690c.getLocalAllowTrackClick());
            if (this.f36690c.isMraid()) {
                m38265m();
            }
            m38267n();
            C13277b c13277b = new C13277b(this.f36691d.getContext(), this.f36704q, this.f36703p);
            this.f36678A = c13277b;
            c13277b.m38152a(this.f36708u);
            this.f36678A.m38151a(this.f36686I);
            this.f36678A.m38150a(this.f36712y);
            this.f36693f.setWebViewListener(this.f36687J);
            this.f36693f.setObject(this.f36678A);
            this.f36693f.loadUrl(strM38230a);
            MBBannerWebView mBBannerWebView2 = this.f36693f;
            if (mBBannerWebView2 != null) {
                mBBannerWebView2.postDelayed(new i(), 1000L);
            }
        } else {
            m38235a(C13081a.m37012a(880046), 2);
            C13082b c13082b = new C13082b(880046);
            c13082b.m37023b(this.f36705r);
            m38232a(c13082b);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void mo38224a(CampaignEx campaignEx, boolean z, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$a */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class a implements InterfaceC13083a {
        a() {
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
                C13219q0.m37817b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13290d.this.f36693f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
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
                C13219q0.m37817b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13290d.this.f36693f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13290d.this.f36693f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized boolean m38249d() {
        boolean zIsReport;
        zIsReport = this.f36690c.isReport();
        if (!zIsReport) {
            this.f36690c.setReport(true);
        }
        return zIsReport;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m38251e() {
        ImageView imageView;
        if (this.f36689b && (imageView = this.f36694g) != null && imageView.getVisibility() == 0) {
            this.f36694g.setVisibility(8);
            this.f36694g.setOnClickListener(null);
            if (this.f36691d == null || this.f36694g.getParent() == null) {
                return;
            }
            this.f36691d.removeView(this.f36694g);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m38253f() {
        if (this.f36689b && this.f36694g == null) {
            ImageView imageView = new ImageView(C13008c.m36588n().m36542d());
            this.f36694g = imageView;
            imageView.setBackgroundResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_banner_close", "drawable"));
            this.f36694g.setVisibility(8);
            this.f36694g.setContentDescription("closeButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m38255g() {
        if (this.f36691d == null) {
            C13082b c13082b = new C13082b(880046);
            c13082b.m37023b(this.f36705r);
            m38232a(c13082b);
            return;
        }
        MBBannerWebView mBBannerWebView = this.f36693f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f36691d.removeView(this.f36693f);
        }
        if (this.f36692e == null) {
            this.f36692e = new ImageView(C13008c.m36588n().m36542d());
            this.f36710w = new j();
            this.f36692e.setOnClickListener(new k());
        }
        C13157e c13157e = new C13157e();
        c13157e.m37501a("adtp", 296);
        if (TextUtils.isEmpty(this.f36690c.getBidToken())) {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        }
        C13291a.m38282a(this.f36703p, this.f36690c.getLocalRequestId()).m37423a(CampaignEx.KEY_LOCAL_CHECK_STATE, c13157e);
        C13185b1.m37633a(this.f36692e, this.f36690c.getLocalRequestId(), this.f36690c.getLocalAllowTrackClick(), this.f36710w);
        String imageUrl = this.f36690c.getImageUrl();
        if (!TextUtils.isEmpty(imageUrl)) {
            C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(imageUrl, new l());
            return;
        }
        C13082b c13082b2 = new C13082b(880047);
        c13082b2.m37023b(this.f36705r);
        m38232a(c13082b2);
    }

    /* JADX INFO: renamed from: i */
    private void m38257i() {
        AdSession adSession = this.f36679B;
        if (adSession != null) {
            adSession.finish();
            this.f36679B = null;
            C13219q0.m37813a("omsdk", " adSession.finish() ");
        }
    }

    /* JADX INFO: renamed from: j */
    private void m38260j() {
        try {
            CampaignEx campaignEx = this.f36690c;
            if (campaignEx != null) {
                C13154c c13154cM38282a = C13291a.m38282a(this.f36703p, campaignEx.getLocalRequestId());
                c13154cM38282a.m37442g(this.f36711x);
                c13154cM38282a.m37430b(true);
                C13291a.m38291a("2000152", c13154cM38282a, (C13157e) null);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("BannerShowManager", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    private void m38261k() {
        try {
            CampaignEx campaignEx = this.f36690c;
            if (campaignEx != null) {
                C13154c c13154cM38282a = C13291a.m38282a(this.f36703p, campaignEx.getLocalRequestId());
                c13154cM38282a.m37442g(this.f36711x);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("close_click_type", Integer.valueOf(this.f36706s));
                c13157e.m37501a(CampaignEx.JSON_KEY_CREATIVE_ID, Long.valueOf(this.f36690c.getCreativeId()));
                C13291a.m38291a("2000069", c13154cM38282a, c13157e);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("BannerShowManager", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    private void m38263l() {
        try {
            CampaignEx campaignEx = this.f36690c;
            if (campaignEx != null) {
                C13154c c13154cM38282a = C13291a.m38282a(this.f36703p, campaignEx.getLocalRequestId());
                c13154cM38282a.m37442g(this.f36711x);
                C13291a.m38291a("2000133", c13154cM38282a, (C13157e) null);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("BannerShowManager", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m38265m() {
        if (this.f36691d == null) {
            return;
        }
        CampaignEx campaignEx = this.f36690c;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() == 1) {
            MBAdChoice mBAdChoice = new MBAdChoice(C13008c.m36588n().m36542d());
            mBAdChoice.setCampaign(this.f36690c);
            mBAdChoice.setFeedbackDialogEventListener(new a());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(C13008c.m36588n().m36542d(), 6.0f), C13229v0.m37876a(C13008c.m36588n().m36542d(), 6.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            this.f36691d.addView(mBAdChoice, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m38267n() {
        ImageView imageView;
        if (!this.f36689b || (imageView = this.f36694g) == null) {
            return;
        }
        if (imageView.getVisibility() != 0) {
            this.f36694g.setVisibility(0);
            this.f36694g.setOnClickListener(this.f36685H);
        }
        if (this.f36694g.getParent() != null || this.f36691d == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f), C13229v0.m37876a(C13008c.m36588n().m36542d(), 12.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this.f36691d.addView(this.f36694g, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m38269o() {
        if (this.f36692e != null) {
            MBBannerWebView mBBannerWebView = this.f36693f;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (this.f36692e.getVisibility() != 0) {
                this.f36692e.setVisibility(0);
            }
            this.f36711x = 2;
            if (this.f36691d != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                this.f36692e.setScaleType(ImageView.ScaleType.FIT_XY);
                if (this.f36692e.getParent() == null) {
                    this.f36691d.addView(this.f36692e, layoutParams);
                }
                m38236a(true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m38281h() {
        m38257i();
        C13291a.m38284a(this.f36690c, this.f36703p);
        if (this.f36688a != null) {
            this.f36688a = null;
        }
        MBBannerWebView mBBannerWebView = this.f36693f;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener(null);
        }
        if (this.f36687J != null) {
            this.f36687J = null;
        }
        ImageView imageView = this.f36694g;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.f36692e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        MBBannerView mBBannerView = this.f36691d;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f36693f;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        C13277b c13277b = this.f36678A;
        if (c13277b != null) {
            c13277b.m38149a();
        }
        if (this.f36686I != null) {
            this.f36686I = null;
        }
        C13084b.m37036b().m37054d(this.f36703p);
        C13291a.m38287a(this.f36703p);
    }

    /* JADX INFO: renamed from: c */
    public void m38279c(boolean z) {
        this.f36689b = z;
    }

    /* JADX INFO: renamed from: c */
    private void m38246c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    C12682a.m34605a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th) {
                C13219q0.m37816b("BannerShowManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38276b(CampaignUnit campaignUnit) {
        CampaignEx campaignExM38229a = m38229a(campaignUnit);
        this.f36690c = campaignExM38229a;
        if (campaignExM38229a == null) {
            C13082b c13082b = new C13082b(880043);
            c13082b.m37023b(this.f36705r);
            m38232a(c13082b);
            return;
        }
        if (!C13200h.m37700a(campaignExM38229a, (Context) null, this.f36691d, campaignExM38229a.getImpReportType())) {
            C13082b c13082b2 = new C13082b(880044);
            c13082b2.m37023b(this.f36705r);
            m38232a(c13082b2);
            return;
        }
        this.f36681D.removeCallbacks(this.f36682E);
        m38253f();
        this.f36698k = false;
        this.f36699l = false;
        this.f36702o = false;
        if (!TextUtils.isEmpty(this.f36690c.getBannerHtml()) || !TextUtils.isEmpty(this.f36690c.getBannerUrl())) {
            C13291a.m38288a(this.f36703p, this.f36690c);
        }
        this.f36681D.postDelayed(this.f36682E, 15000L);
        if (m38272q()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f36690c.getBannerHtml()) || !TextUtils.isEmpty(this.f36690c.getBannerUrl())) {
            m38235a(C13081a.m37012a(880048), 2);
        }
        m38255g();
    }

    /* JADX INFO: renamed from: d */
    public void m38280d(boolean z) {
        this.f36697j = z;
        m38271p();
    }

    /* JADX INFO: renamed from: a */
    public void m38275a(boolean z, int i2) {
        this.f36712y = i2;
        if (i2 != 0) {
            this.f36689b = z;
            return;
        }
        C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.f36703p);
        if (c13640lM39720e != null) {
            this.f36689b = c13640lM39720e.m39641g() == 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m38278c() {
        return this.f36711x;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.d$d */
    /* JADX INFO: compiled from: BaseBannerShowManager.java */
    class d implements InterfaceC13083a {
        d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            String string;
            C13290d.this.f36691d.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13290d.this.f36693f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            String string;
            C13290d.this.f36691d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13290d.this.f36693f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            C13290d.this.f36691d.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b("BannerShowManager", th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) C13290d.this.f36693f, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: a */
    private CampaignEx m38229a(CampaignUnit campaignUnit) {
        if (campaignUnit == null) {
            return null;
        }
        ArrayList<CampaignEx> ads = campaignUnit.getAds();
        this.f36708u = ads;
        if (ads == null || ads.size() <= 0) {
            return null;
        }
        return this.f36708u.get(0);
    }

    /* JADX INFO: renamed from: a */
    private String m38230a(CampaignEx campaignEx) {
        String bannerUrl = "";
        if (campaignEx != null) {
            try {
                bannerUrl = campaignEx.getBannerUrl();
                if (TextUtils.isEmpty(bannerUrl)) {
                    bannerUrl = campaignEx.getBannerHtml();
                    File file = new File(bannerUrl);
                    if (file.exists() && file.isFile() && file.canRead()) {
                        return "file:////" + bannerUrl;
                    }
                }
                return bannerUrl;
            } catch (Throwable th) {
                C13219q0.m37816b("BannerShowManager", th.getMessage());
            }
        }
        return bannerUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38232a(C13082b c13082b) {
        if (this.f36690c == null || m38249d()) {
            return;
        }
        this.f36681D.removeCallbacks(this.f36682E);
        InterfaceC13284c interfaceC13284c = this.f36688a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38181a(c13082b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38241b() {
        m38261k();
        MBBannerWebView mBBannerWebView = this.f36693f;
        if (mBBannerWebView != null && mBBannerWebView.getParent() != null) {
            this.f36691d.removeView(this.f36693f);
        }
        ImageView imageView = this.f36692e;
        if (imageView != null && imageView.getParent() != null) {
            this.f36692e.setVisibility(8);
            this.f36691d.removeView(this.f36692e);
        }
        ImageView imageView2 = this.f36694g;
        if (imageView2 != null && imageView2.getParent() != null) {
            this.f36691d.removeView(this.f36694g);
            this.f36694g.setVisibility(8);
        }
        C13084b.m37036b().m37054d(this.f36703p);
        ImageView imageView3 = this.f36695h;
        if (imageView3 != null && imageView3.getParent() != null) {
            this.f36691d.removeView(this.f36695h);
            this.f36695h.setVisibility(8);
        }
        BannerUtils.inserCloseId(this.f36703p, this.f36708u);
        m38260j();
        InterfaceC13284c interfaceC13284c = this.f36688a;
        if (interfaceC13284c != null) {
            interfaceC13284c.mo38183b();
        }
        m38257i();
    }

    /* JADX INFO: renamed from: a */
    private boolean m38237a() {
        if (this.f36691d == null) {
            return false;
        }
        CampaignEx campaignEx = this.f36690c;
        return (C13194e1.m37670a(this.f36691d, campaignEx != null ? campaignEx.getImpReportType() : 0) || this.f36701n) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private void m38231a(CampaignEx campaignEx, Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new b(context, campaignEx)).start();
            C12682a.m34606a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, C12701a.f33766m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36915p() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, str, campaignEx.getNativeVideoTracking().m36915p(), false, false);
    }

    /* JADX INFO: renamed from: b */
    public void m38277b(boolean z) {
        this.f36696i = z;
        m38271p();
    }

    /* JADX INFO: renamed from: b */
    private void m38242b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            m38231a(campaignEx, C13008c.m36588n().m36542d(), this.f36703p);
            m38243b(campaignEx, C13008c.m36588n().m36542d(), this.f36703p);
            m38246c(campaignEx, C13008c.m36588n().m36542d(), this.f36703p);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m38243b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                C12682a.m34606a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, C12701a.f33767n);
            } catch (Throwable th) {
                C13219q0.m37816b("BannerShowManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38273a(int i2, int i3, int i4, int i5) {
        if (i2 == i4 && i3 == i5) {
            return;
        }
        C13276a.m38146a((WebView) this.f36693f, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    private void m38236a(boolean z) {
        if (this.f36691d != null) {
            View viewM37039a = C13084b.m37036b().m37039a(this.f36703p);
            if (C13084b.m37036b().m37050a() && z && viewM37039a != null) {
                ViewGroup viewGroup = (ViewGroup) viewM37039a.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewM37039a);
                }
                viewM37039a.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewM37039a.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(C13084b.f35792e, C13084b.f35791d);
                }
                layoutParams.addRule(12);
                viewM37039a.setLayoutParams(layoutParams);
                this.f36691d.addView(viewM37039a);
            }
            C13084b.m37036b().m37047a(this.f36703p, new d());
            this.f36690c.setCampaignUnitId(this.f36703p);
            C13084b.m37036b().m37046a(this.f36703p, this.f36690c);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38274a(String str) {
        this.f36705r = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38235a(String str, int i2) {
        try {
            CampaignEx campaignEx = this.f36690c;
            if (campaignEx != null) {
                C13154c c13154cM38282a = C13291a.m38282a(this.f36703p, campaignEx.getLocalRequestId());
                c13154cM38282a.m37442g(this.f36711x);
                C13157e c13157e = new C13157e();
                c13157e.m37501a("result", Integer.valueOf(i2));
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                c13157e.m37501a("reason", str);
                c13154cM38282a.m37434d(TextUtils.isEmpty(this.f36690c.getBannerUrl()) ? 2 : 1);
                C13291a.m38291a("2000068", c13154cM38282a, c13157e);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("BannerShowManager", th.getMessage());
        }
    }
}
