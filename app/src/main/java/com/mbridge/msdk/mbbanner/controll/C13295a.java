package com.mbridge.msdk.mbbanner.controll;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13194e1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbbanner.common.data.C13278a;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13283b;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c;
import com.mbridge.msdk.mbbanner.common.manager.C13287a;
import com.mbridge.msdk.mbbanner.common.manager.C13289c;
import com.mbridge.msdk.mbbanner.common.report.C13291a;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C13384a;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13638j;
import com.mbridge.msdk.setting.C13640l;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.controll.a */
/* JADX INFO: compiled from: BannerController.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13295a {

    /* JADX INFO: renamed from: x */
    private static String f36755x = "BannerController";

    /* JADX INFO: renamed from: a */
    private String f36756a;

    /* JADX INFO: renamed from: b */
    private String f36757b;

    /* JADX INFO: renamed from: c */
    private String f36758c;

    /* JADX INFO: renamed from: d */
    private MBridgeIds f36759d;

    /* JADX INFO: renamed from: e */
    private boolean f36760e;

    /* JADX INFO: renamed from: f */
    private int f36761f;

    /* JADX INFO: renamed from: g */
    private MBBannerView f36762g;

    /* JADX INFO: renamed from: h */
    private int f36763h;

    /* JADX INFO: renamed from: i */
    private int f36764i;

    /* JADX INFO: renamed from: j */
    private int f36765j;

    /* JADX INFO: renamed from: l */
    private BannerAdListener f36767l;

    /* JADX INFO: renamed from: m */
    private CampaignUnit f36768m;

    /* JADX INFO: renamed from: n */
    private C13289c f36769n;

    /* JADX INFO: renamed from: o */
    private C13640l f36770o;

    /* JADX INFO: renamed from: p */
    private C13638j f36771p;

    /* JADX INFO: renamed from: q */
    private boolean f36772q;

    /* JADX INFO: renamed from: r */
    private boolean f36773r;

    /* JADX INFO: renamed from: s */
    private boolean f36774s;

    /* JADX INFO: renamed from: t */
    private boolean f36775t;

    /* JADX INFO: renamed from: u */
    private boolean f36776u;

    /* JADX INFO: renamed from: k */
    private int f36766k = -1;

    /* JADX INFO: renamed from: v */
    private InterfaceC13284c f36777v = new a();

    /* JADX INFO: renamed from: w */
    private InterfaceC13283b f36778w = new b();

    public C13295a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f36762g = mBBannerView;
        if (bannerSize != null) {
            this.f36763h = bannerSize.getHeight();
            this.f36764i = bannerSize.getWidth();
        }
        this.f36756a = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f36757b = str;
        this.f36759d = new MBridgeIds(str, this.f36756a);
        m38321f();
    }

    /* JADX INFO: renamed from: a */
    private int m38302a(int i) {
        if (i > 0) {
            if (i < 10) {
                return 10;
            }
            if (i > 180) {
                return 180;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private boolean m38312a(View view) {
        return true;
    }

    /* JADX INFO: renamed from: l */
    private void m38329l() {
        C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.f36756a);
        this.f36770o = c13640lM39720e;
        if (c13640lM39720e == null) {
            this.f36770o = C13640l.m39753i(this.f36756a);
        }
        if (this.f36766k == -1) {
            this.f36765j = m38302a(this.f36770o.m39607D());
        }
        if (this.f36761f == 0) {
            boolean z = this.f36770o.m39641g() == 1;
            this.f36760e = z;
            C13289c c13289c = this.f36769n;
            if (c13289c != null) {
                c13289c.m38279c(z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m38321f() {
        m38315b(C13008c.m36588n().m36533b(), C13008c.m36588n().m36538c());
        m38329l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m38326j() {
        if (this.f36774s || !this.f36775t) {
            return;
        }
        if (!m38312a(this.f36762g)) {
            m38307a(new C13082b(880044));
        } else if (this.f36768m != null) {
            if (this.f36769n == null) {
                this.f36769n = new C13289c(this.f36762g, this.f36777v, this.f36757b, this.f36756a, this.f36760e, this.f36770o);
            }
            this.f36769n.m38274a(this.f36758c);
            this.f36769n.m38277b(this.f36772q);
            this.f36769n.m38280d(this.f36773r);
            this.f36769n.m38275a(this.f36760e, this.f36761f);
            this.f36769n.m38276b(this.f36768m);
        } else {
            m38307a(new C13082b(880043));
        }
        this.f36775t = false;
    }

    /* JADX INFO: renamed from: k */
    private void m38328k() {
        MBBannerView mBBannerView = this.f36762g;
        if (mBBannerView != null) {
            if (!this.f36772q || !this.f36773r || this.f36776u || C13194e1.m37670a(mBBannerView, 1)) {
                C13287a.m38190b().m38193a(2, this.f36757b, this.f36756a, null, null);
            } else {
                C13287a.m38190b().m38193a(3, this.f36757b, this.f36756a, new C13278a(this.f36764i + "x" + this.f36763h, this.f36765j * 1000), this.f36778w);
            }
            if (this.f36772q) {
                return;
            }
            C13287a.m38190b().m38193a(4, this.f36757b, this.f36756a, null, null);
            C13287a.m38190b().m38195b(this.f36756a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m38338c() {
        if (this.f36774s) {
            return;
        }
        m38328k();
        m38329l();
        C13278a c13278a = new C13278a(this.f36764i + "x" + this.f36763h, this.f36765j * 1000);
        c13278a.m38159c(this.f36757b);
        c13278a.m38155a(true);
        c13278a.m38157b(C13291a.m38292b(""));
        C13287a.m38190b().m38194a(this.f36757b, this.f36756a, c13278a, this.f36778w);
    }

    /* JADX INFO: renamed from: d */
    public String m38340d() {
        CampaignUnit campaignUnit = this.f36768m;
        return campaignUnit != null ? C13092c.m37122b(campaignUnit.getAds()) : "";
    }

    /* JADX INFO: renamed from: e */
    public String m38341e() {
        CampaignUnit campaignUnit = this.f36768m;
        return (campaignUnit == null || campaignUnit.getRequestId() == null) ? "" : this.f36768m.getRequestId();
    }

    /* JADX INFO: renamed from: g */
    public void m38342g() {
        C13287a.m38190b().m38193a(4, this.f36757b, this.f36756a, new C13278a(this.f36764i + "x" + this.f36763h, this.f36765j * 1000), this.f36778w);
    }

    /* JADX INFO: renamed from: h */
    public void m38343h() {
        C13287a.m38190b().m38193a(3, this.f36757b, this.f36756a, new C13278a(this.f36764i + "x" + this.f36763h, this.f36765j * 1000), this.f36778w);
    }

    /* JADX INFO: renamed from: i */
    public void m38344i() {
        this.f36774s = true;
        if (this.f36767l != null) {
            this.f36767l = null;
        }
        if (this.f36778w != null) {
            this.f36778w = null;
        }
        if (this.f36777v != null) {
            this.f36777v = null;
        }
        if (this.f36762g != null) {
            this.f36762g = null;
        }
        C13287a.m38190b().m38193a(4, this.f36757b, this.f36756a, null, null);
        C13287a.m38190b().m38195b(this.f36756a);
        C13287a.m38190b().m38197c();
        C13289c c13289c = this.f36769n;
        if (c13289c != null) {
            c13289c.m38281h();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.controll.a$b */
    /* JADX INFO: compiled from: BannerController.java */
    class b implements InterfaceC13283b {
        b() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13283b
        /* JADX INFO: renamed from: a */
        public void mo38177a(String str, CampaignUnit campaignUnit, boolean z) {
            C13295a.this.f36768m = campaignUnit;
            C13295a.this.m38306a(1, (C13082b) null);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13283b
        /* JADX INFO: renamed from: b */
        public void mo38178b(C13082b c13082b) {
            C13295a.this.m38311a(c13082b.m37031k(), c13082b);
            C13295a.this.m38338c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13283b
        /* JADX INFO: renamed from: a */
        public void mo38175a(C13082b c13082b) {
            C13295a.this.m38306a(2, c13082b);
            C13295a.this.m38311a(c13082b.m37031k(), c13082b);
            C13295a.this.m38338c();
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13283b
        /* JADX INFO: renamed from: a */
        public void mo38176a(String str, int i, boolean z) {
            if (C13295a.this.f36762g != null) {
                C13295a.this.f36775t = true;
                C13295a.this.m38326j();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38336b(int i) {
        int iM38302a = m38302a(i);
        this.f36766k = iM38302a;
        this.f36765j = iM38302a;
    }

    /* JADX INFO: renamed from: b */
    private void m38315b(String str, String str2) {
        if (this.f36771p == null) {
            this.f36771p = new C13638j();
        }
        this.f36771p.m39744a(C13008c.m36588n().m36542d(), str, str2, this.f36756a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38311a(String str, C13082b c13082b) {
        CampaignUnit campaignUnit;
        String strM37032l = "";
        if (c13082b != null) {
            try {
                strM37032l = c13082b.m37032l();
                if (TextUtils.isEmpty(str)) {
                    str = c13082b.m37031k();
                }
            } catch (Throwable th) {
                C13219q0.m37816b(f36755x, th.getMessage());
            }
        }
        if (TextUtils.isEmpty(str) && (campaignUnit = this.f36768m) != null) {
            str = campaignUnit.getLocalRequestId();
        }
        C13154c c13154cM38282a = C13291a.m38282a(this.f36756a, str);
        CampaignUnit campaignUnit2 = this.f36768m;
        c13154cM38282a.m37429b(campaignUnit2 != null ? campaignUnit2.getAds() : null);
        c13154cM38282a.m37422a(c13082b);
        CampaignUnit campaignUnit3 = this.f36768m;
        if (campaignUnit3 != null && !campaignUnit3.getAds().isEmpty()) {
            c13154cM38282a.m37434d(TextUtils.isEmpty(this.f36768m.getAds().get(0).getBannerUrl()) ? 1 : 2);
        }
        c13154cM38282a.m37430b(true);
        C13291a.m38291a("2000047", c13154cM38282a, (C13157e) null);
        BannerAdListener bannerAdListener = this.f36767l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f36759d, strM37032l);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38337b(boolean z) {
        this.f36772q = z;
        m38335b();
        m38326j();
    }

    /* JADX INFO: renamed from: b */
    public void m38335b() {
        m38328k();
        C13289c c13289c = this.f36769n;
        if (c13289c != null) {
            c13289c.m38277b(this.f36772q);
            this.f36769n.m38280d(this.f36773r);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.controll.a$a */
    /* JADX INFO: compiled from: BannerController.java */
    class a implements InterfaceC13284c {
        a() {
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
        /* JADX INFO: renamed from: a */
        public void mo38182a(List<CampaignEx> list) {
            C13219q0.m37816b(C13295a.f36755x, "onShowSuccessed:");
            if (C13295a.this.f36767l != null) {
                C13295a.this.f36767l.onLoadSuccessed(C13295a.this.f36759d);
            }
            try {
                C13154c c13154cM38282a = C13291a.m38282a(C13295a.this.f36756a, list.get(0).getLocalRequestId());
                c13154cM38282a.m37429b(list);
                c13154cM38282a.m37442g(1);
                c13154cM38282a.m37434d(TextUtils.isEmpty(list.get(0).getBannerUrl()) ? 2 : 1);
                C13291a.m38291a("2000048", c13154cM38282a, (C13157e) null);
            } catch (Exception e) {
                C13219q0.m37816b(C13295a.f36755x, e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
        /* JADX INFO: renamed from: b */
        public void mo38183b() {
            if (C13295a.this.f36767l != null) {
                C13295a.this.f36767l.onCloseBanner(C13295a.this.f36759d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
        /* JADX INFO: renamed from: c */
        public void mo38184c() {
            if (C13295a.this.f36767l != null) {
                C13295a.this.f36767l.onClick(C13295a.this.f36759d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
        /* JADX INFO: renamed from: d */
        public void mo38185d() {
            if (C13295a.this.f36767l != null) {
                C13295a.this.f36767l.closeFullScreen(C13295a.this.f36759d);
                C13295a.this.f36776u = false;
                C13287a.m38190b().m38193a(3, C13295a.this.f36757b, C13295a.this.f36756a, new C13278a(C13295a.this.f36764i + "x" + C13295a.this.f36763h, C13295a.this.f36765j * 1000), C13295a.this.f36778w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
        public void onLeaveApp() {
            if (C13295a.this.f36767l != null) {
                C13295a.this.f36767l.onLeaveApp(C13295a.this.f36759d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
        /* JADX INFO: renamed from: a */
        public void mo38180a(CampaignEx campaignEx) {
            C13295a.this.m38338c();
            if (C13295a.this.f36767l != null) {
                C13295a.this.f36767l.onLogImpression(C13295a.this.f36759d);
            }
            try {
                C13154c c13154cM38282a = C13291a.m38282a(C13295a.this.f36756a, campaignEx.getLocalRequestId());
                c13154cM38282a.m37421a(campaignEx);
                c13154cM38282a.m37444h(campaignEx.isBidCampaign() ? "1" : "0");
                int i = 1;
                c13154cM38282a.m37442g(C13295a.this.f36769n != null ? C13295a.this.f36769n.m38278c() : 1);
                if (C13295a.this.f36765j != 0) {
                    i = 2;
                }
                c13154cM38282a.m37427b(i);
                c13154cM38282a.m37432c(C13295a.this.f36765j);
                C13291a.m38291a("2000128", c13154cM38282a, (C13157e) null);
                C13291a.m38291a("2000130", c13154cM38282a, (C13157e) null);
            } catch (Exception e) {
                C13219q0.m37816b(C13295a.f36755x, e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
        /* JADX INFO: renamed from: a */
        public void mo38181a(C13082b c13082b) {
            C13295a.this.m38307a(c13082b);
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13284c
        /* JADX INFO: renamed from: a */
        public void mo38179a() {
            if (C13295a.this.f36767l != null) {
                C13295a.this.f36767l.showFullScreen(C13295a.this.f36759d);
                C13295a.this.f36776u = true;
                C13287a.m38190b().m38193a(2, C13295a.this.f36757b, C13295a.this.f36756a, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m38339c(boolean z) {
        this.f36773r = z;
        m38335b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38306a(int i, C13082b c13082b) {
        try {
            C13154c c13154cM38282a = C13291a.m38282a(this.f36756a, c13082b == null ? this.f36768m.getLocalRequestId() : c13082b.m37031k());
            C13157e c13157e = new C13157e();
            c13157e.m37501a("result", Integer.valueOf(i));
            CampaignUnit campaignUnit = this.f36768m;
            if (campaignUnit != null && !campaignUnit.getAds().isEmpty()) {
                CampaignEx campaignEx = this.f36768m.getAds().get(0);
                if (campaignEx != null) {
                    c13154cM38282a.m37434d(TextUtils.isEmpty(campaignEx.getBannerUrl()) ? 2 : 1);
                }
                c13154cM38282a.m37429b(this.f36768m.getAds());
            }
            if (c13082b != null) {
                c13154cM38282a.m37422a(c13082b);
            }
            C13291a.m38291a("2000126", c13154cM38282a, c13157e);
        } catch (Exception e) {
            C13219q0.m37816b(f36755x, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38332a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f36763h = bannerSize.getHeight();
            this.f36764i = bannerSize.getWidth();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38334a(boolean z) {
        this.f36760e = z;
        this.f36761f = z ? 1 : 2;
    }

    /* JADX INFO: renamed from: a */
    public void m38333a(String str, String str2) {
        boolean zM38711b;
        if (this.f36763h >= 1 && this.f36764i >= 1) {
            try {
                zM38711b = C13384a.m38711b(C13008c.m36588n().m36542d());
            } catch (Exception e) {
                C13219q0.m37816b(f36755x, e.getMessage());
                zM38711b = false;
            }
            if (!zM38711b) {
                m38311a(str2, new C13082b(880029));
                return;
            }
            this.f36758c = str2;
            C13278a c13278a = new C13278a(this.f36764i + "x" + this.f36763h, this.f36765j * 1000);
            c13278a.m38154a(str);
            c13278a.m38159c(this.f36757b);
            c13278a.m38157b(str2);
            C13287a.m38190b().m38196b(this.f36757b, this.f36756a, c13278a, this.f36778w);
            C13287a.m38190b().m38193a(1, this.f36757b, this.f36756a, c13278a, this.f36778w);
            return;
        }
        m38311a(str2, new C13082b(880037));
    }

    /* JADX INFO: renamed from: a */
    public void m38331a(BannerAdListener bannerAdListener) {
        this.f36767l = bannerAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38307a(C13082b c13082b) {
        m38311a(this.f36758c, c13082b);
        if (c13082b.m37027g() != 880044) {
            m38338c();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38330a(int i, int i2, int i3, int i4) {
        C13289c c13289c = this.f36769n;
        if (c13289c != null) {
            c13289c.m38273a(i, i2, i3, i4);
        }
    }
}
