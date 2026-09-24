package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13190d0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13949b;
import com.mbridge.msdk.video.dynview.moffer.C13965a;
import com.mbridge.msdk.video.dynview.util.C13976a;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.module.listener.impl.C14065g;
import com.mbridge.msdk.video.module.listener.impl.C14067i;
import com.mbridge.msdk.video.module.listener.impl.C14069k;
import com.mbridge.msdk.video.module.listener.impl.C14070l;
import com.mbridge.msdk.video.module.report.C14075b;
import com.mbridge.msdk.video.signal.InterfaceC14175f;
import com.mbridge.msdk.video.signal.InterfaceC14179h;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeContainerView extends MBridgeBaseView implements InterfaceC14175f, InterfaceC14179h {

    /* JADX INFO: renamed from: A */
    private int f40230A;

    /* JADX INFO: renamed from: B */
    private boolean f40231B;

    /* JADX INFO: renamed from: C */
    private boolean f40232C;

    /* JADX INFO: renamed from: D */
    private boolean f40233D;

    /* JADX INFO: renamed from: E */
    private boolean f40234E;

    /* JADX INFO: renamed from: F */
    private boolean f40235F;

    /* JADX INFO: renamed from: G */
    private boolean f40236G;

    /* JADX INFO: renamed from: H */
    private int f40237H;

    /* JADX INFO: renamed from: I */
    private boolean f40238I;

    /* JADX INFO: renamed from: J */
    private boolean f40239J;

    /* JADX INFO: renamed from: K */
    private int f40240K;

    /* JADX INFO: renamed from: L */
    private int f40241L;

    /* JADX INFO: renamed from: M */
    private int f40242M;

    /* JADX INFO: renamed from: N */
    private int f40243N;

    /* JADX INFO: renamed from: O */
    private int f40244O;

    /* JADX INFO: renamed from: P */
    private String f40245P;

    /* JADX INFO: renamed from: Q */
    private C14177b f40246Q;

    /* JADX INFO: renamed from: R */
    private boolean f40247R;

    /* JADX INFO: renamed from: S */
    private boolean f40248S;

    /* JADX INFO: renamed from: T */
    private List<CampaignEx> f40249T;

    /* JADX INFO: renamed from: m */
    private MBridgePlayableView f40250m;

    /* JADX INFO: renamed from: n */
    private MBridgeClickCTAView f40251n;

    /* JADX INFO: renamed from: o */
    private MBridgeClickMiniCardView f40252o;

    /* JADX INFO: renamed from: p */
    private MBridgeNativeEndCardView f40253p;

    /* JADX INFO: renamed from: q */
    private MBridgeH5EndCardView f40254q;

    /* JADX INFO: renamed from: r */
    private MBridgeVastEndCardView f40255r;

    /* JADX INFO: renamed from: s */
    private MBridgeLandingPageView f40256s;

    /* JADX INFO: renamed from: t */
    private MBridgeVideoEndCoverView f40257t;

    /* JADX INFO: renamed from: u */
    private MBridgeAlertWebview f40258u;

    /* JADX INFO: renamed from: v */
    private MBridgeOrderCampView f40259v;

    /* JADX INFO: renamed from: w */
    private String f40260w;

    /* JADX INFO: renamed from: x */
    private int f40261x;

    /* JADX INFO: renamed from: y */
    private int f40262y;

    /* JADX INFO: renamed from: z */
    private int f40263z;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeContainerView$a */
    class RunnableC13996a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C14177b f40264a;

        RunnableC13996a(C14177b c14177b) {
            this.f40264a = c14177b;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.m41959a(this.f40264a, Integer.valueOf(mBridgeContainerView.f40202b.getVideo_end_type()));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeContainerView$b */
    class RunnableC13997b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C14177b f40266a;

        RunnableC13997b(C14177b c14177b) {
            this.f40266a = c14177b;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.m41959a(this.f40266a, Integer.valueOf(mBridgeContainerView.f40202b.getVideo_end_type()));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeContainerView$c */
    class C13998c implements InterfaceC13949b {
        C13998c() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13949b
        /* JADX INFO: renamed from: a */
        public void mo41776a() {
            InterfaceC14058a interfaceC14058a = MBridgeContainerView.this.notifyListener;
            if (interfaceC14058a != null) {
                interfaceC14058a.mo41600a(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "");
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13949b
        /* JADX INFO: renamed from: b */
        public void mo41777b() {
            if (MBridgeContainerView.this.f40202b.getAdSpaceT() == 2) {
                MBridgeContainerView.this.showVideoEndCover();
            } else {
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.showEndcard(mBridgeContainerView.f40202b.getVideo_end_type());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeContainerView$d */
    class C13999d extends C14067i {
        C13999d(InterfaceC14058a interfaceC14058a) {
            super(interfaceC14058a);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.C14067i, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
        /* JADX INFO: renamed from: a */
        public void mo41600a(int i, Object obj) {
            super.mo41600a(i, obj);
            if (i == 100) {
                MBridgeContainerView.this.webviewshow();
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                C13080n c13080n = new C13080n();
                c13080n.m36990n(MBridgeContainerView.this.f40202b.getRequestId());
                c13080n.m36992o(MBridgeContainerView.this.f40202b.getRequestIdNotice());
                c13080n.m36962b(MBridgeContainerView.this.f40202b.getId());
                c13080n.m36961b(MBridgeContainerView.this.f40202b.isMraid() ? C13080n.f35733N : C13080n.f35734O);
                MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                C13145g.m37364d(c13080n, mBridgeContainerView2.f40201a, mBridgeContainerView2.f40260w);
            }
        }
    }

    public MBridgeContainerView(Context context) {
        super(context);
        this.f40262y = 1;
        this.f40263z = 1;
        this.f40230A = 1;
        this.f40231B = false;
        this.f40232C = false;
        this.f40233D = false;
        this.f40234E = true;
        this.f40235F = false;
        this.f40236G = false;
        this.f40238I = false;
        this.f40239J = false;
        this.f40247R = false;
        this.f40248S = false;
        this.f40249T = new ArrayList();
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40262y = 1;
        this.f40263z = 1;
        this.f40230A = 1;
        this.f40231B = false;
        this.f40232C = false;
        this.f40233D = false;
        this.f40234E = true;
        this.f40235F = false;
        this.f40236G = false;
        this.f40238I = false;
        this.f40239J = false;
        this.f40247R = false;
        this.f40248S = false;
        this.f40249T = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private void m41954a(Configuration configuration, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41955a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41957a(InterfaceC14058a interfaceC14058a, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new C14065g(this.f40252o, interfaceC14058a));
                } else {
                    mBridgeBaseView.setNotifyListener(new C14067i(interfaceC14058a));
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41958a(C14177b c14177b) {
        if (this.f40250m == null) {
            this.f40250m = new MBridgePlayableView(this.f40201a);
        }
        this.f40250m.setCloseDelayShowTime(this.f40263z);
        this.f40250m.setPlayCloseBtnTm(this.f40230A);
        this.f40250m.setCampaign(this.f40202b);
        this.f40250m.setNotifyListener(new C13999d(this.notifyListener));
        this.f40250m.preLoadData(c14177b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41959a(C14177b c14177b, Integer num) {
        CampaignEx campaignEx;
        InterfaceC14058a interfaceC14058a;
        CampaignEx campaignEx2;
        this.f40246Q = c14177b;
        CampaignEx campaignEx3 = this.f40202b;
        if (campaignEx3 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx3.getVideo_end_type());
            }
            if (!isLast()) {
                m41974o();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.f40255r == null) {
                        this.f40255r = new MBridgeVastEndCardView(this.f40201a);
                    }
                    this.f40255r.setCampaign(this.f40202b);
                    this.f40255r.setNotifyListener(new C14070l(this.notifyListener));
                    this.f40255r.preLoadData(c14177b);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.f40256s == null) {
                        this.f40256s = new MBridgeLandingPageView(this.f40201a);
                    }
                    this.f40256s.setCampaign(this.f40202b);
                    this.f40256s.setNotifyListener(new C14067i(this.notifyListener));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.f40262y == 2) {
                        boolean zIsDynamicView = this.f40202b.isDynamicView();
                        boolean zM37945l = C13229v0.m37945l(this.f40202b.getendcard_url());
                        if ((zIsDynamicView && !zM37945l && (campaignEx2 = this.f40202b) != null && !campaignEx2.isMraid()) || (campaignEx = this.f40202b) == null || campaignEx.getAdSpaceT() == 2) {
                            return;
                        }
                        if (this.f40254q == null) {
                            this.f40254q = new MBridgeH5EndCardView(this.f40201a);
                            try {
                                C13157e c13157e = new C13157e();
                                c13157e.m37501a("type", 3);
                                C13156d.m37475b().m37483a("2000154", this.f40202b, c13157e);
                            } catch (Throwable th) {
                                C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
                            }
                        }
                        if (this.f40202b.getDynamicTempCode() == 5 && (interfaceC14058a = this.notifyListener) != null && (interfaceC14058a instanceof C14069k)) {
                            ((C14069k) interfaceC14058a).m42171a(this.f40202b);
                        }
                        this.f40254q.setCampaign(this.f40202b);
                        this.f40254q.setCloseDelayShowTime(this.f40263z);
                        this.f40254q.setNotifyListener(new C14067i(this.notifyListener));
                        this.f40254q.setUnitId(this.f40260w);
                        this.f40254q.setNotchValue(this.f40245P, this.f40240K, this.f40241L, this.f40242M, this.f40243N);
                        this.f40254q.preLoadData(c14177b);
                        if (this.f40233D) {
                            return;
                        }
                        addView(this.f40254q);
                        return;
                    }
                    CampaignEx campaignEx4 = this.f40202b;
                    int iM36778g = (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null) ? 0 : this.f40202b.getRewardTemplateMode().m36778g();
                    if (this.f40253p == null) {
                        CampaignEx campaignEx5 = this.f40202b;
                        if (campaignEx5 == null || !campaignEx5.isDynamicView()) {
                            Context context = this.f40201a;
                            CampaignEx campaignEx6 = this.f40202b;
                            boolean z = campaignEx6 != null && campaignEx6.getAdSpaceT() == 2;
                            CampaignEx campaignEx7 = this.f40202b;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(context, null, false, -1, z, iM36778g, campaignEx7 != null ? campaignEx7.getMof_tplid() : 0);
                            this.f40253p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f40202b);
                        } else {
                            m41975p();
                        }
                    }
                    this.f40253p.setLayout();
                    if (this.f40202b.isDynamicView()) {
                        if (C13965a.m41789a().m41800b(this.f40202b.getRequestId() + "_" + this.f40202b.getId())) {
                            try {
                                C13965a.m41789a().m41796a(this.f40253p, this.f40202b.getRequestId() + "_" + this.f40202b.getId(), new C14067i(this.notifyListener));
                            } catch (Exception e) {
                                C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
                            }
                        } else {
                            try {
                                String strM37645a = C13188c1.m37645a(this.f40202b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(strM37645a) && Integer.parseInt(strM37645a) == 1) {
                                    C13965a.m41789a().m41798a(this.f40202b, this.f40253p, new C14067i(this.notifyListener), 2);
                                }
                            } catch (Exception e2) {
                                C13219q0.m37816b(MBridgeBaseView.TAG, e2.getMessage());
                            }
                        }
                    }
                    this.f40253p.setUnitId(this.f40260w);
                    this.f40253p.setCloseBtnDelay(this.f40263z);
                    this.f40253p.setNotifyListener(new C14067i(this.notifyListener));
                    this.f40253p.preLoadData(c14177b);
                    this.f40253p.setNotchPadding(this.f40240K, this.f40241L, this.f40242M, this.f40243N);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41960a(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    private void addCTAView() {
        if (this.f40251n == null) {
            m41961b(-1);
        }
        if (this.f40251n != null) {
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f40251n, 0, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41961b(int i) {
        if (i != -3) {
            if (i != -2) {
                if (this.f40251n == null) {
                    this.f40251n = new MBridgeClickCTAView(this.f40201a);
                }
                this.f40251n.setCampaign(this.f40202b);
                this.f40251n.setUnitId(this.f40260w);
                this.f40251n.setNotifyListener(new C14067i(this.notifyListener));
                this.f40251n.preLoadData(this.f40246Q);
                return;
            }
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f40252o == null) {
                this.f40252o = new MBridgeClickMiniCardView(this.f40201a);
            }
            this.f40252o.setCampaign(this.f40202b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40252o;
            mBridgeClickMiniCardView.setNotifyListener(new C14065g(mBridgeClickMiniCardView, this.notifyListener));
            this.f40252o.preLoadData(this.f40246Q);
            setMatchParent();
            m41968i();
            m41974o();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41962b(C14177b c14177b) {
        this.f40246Q = c14177b;
        if (this.f40257t == null) {
            MBridgeVideoEndCoverView mBridgeVideoEndCoverView = new MBridgeVideoEndCoverView(this.f40201a);
            this.f40257t = mBridgeVideoEndCoverView;
            mBridgeVideoEndCoverView.setCampaign(this.f40202b);
            this.f40257t.setNotifyListener(new C14067i(this.notifyListener));
            this.f40257t.preLoadData(c14177b);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41963b(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m41964e() {
        if (this.f40258u == null) {
            m41976q();
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f40258u;
        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
            removeView(this.f40258u);
        }
        addView(this.f40258u);
    }

    /* JADX INFO: renamed from: f */
    private void m41965f() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            boolean zIsDynamicView = campaignEx.isDynamicView();
            boolean zM37945l = C13229v0.m37945l(this.f40202b.getendcard_url());
            if (zIsDynamicView && !zM37945l && !this.f40202b.isMraid()) {
                m41969j();
                return;
            }
        }
        if (this.f40262y != 2 || this.f40238I) {
            m41969j();
        } else {
            m41966g();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m41966g() {
        if (this.f40254q == null) {
            m41959a(this.f40246Q, (Integer) 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            m41969j();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f40254q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f40254q.setError(true);
            }
        } else {
            this.f40238I = true;
            addView(this.f40254q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f40254q.excuteTask();
            this.f40254q.setNotchValue(this.f40245P, this.f40240K, this.f40241L, this.f40242M, this.f40243N);
            C13080n c13080n = new C13080n();
            c13080n.m36990n(this.f40202b.getRequestId());
            c13080n.m36992o(this.f40202b.getRequestIdNotice());
            c13080n.m36962b(this.f40202b.getId());
            c13080n.m36961b(this.f40202b.isMraid() ? C13080n.f35733N : C13080n.f35734O);
            C13145g.m37364d(c13080n, this.f40201a, this.f40260w);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f40254q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f40260w);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m41967h() {
        if (this.f40256s == null) {
            m41959a(this.f40246Q, (Integer) 4);
        }
        this.f40256s.setUnitId(this.f40260w);
        this.f40256s.preLoadData(this.f40246Q);
        addView(this.f40256s);
    }

    /* JADX INFO: renamed from: i */
    private void m41968i() {
        if (this.f40252o == null) {
            m41961b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f40233D && this.f40234E) {
            this.f40234E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f40252o, layoutParams);
    }

    /* JADX INFO: renamed from: j */
    private void m41969j() {
        this.f40262y = 1;
        if (this.f40253p == null) {
            m41959a(this.f40246Q, (Integer) 2);
        }
        addView(this.f40253p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f40253p.notifyShowListener();
        this.f40248S = true;
        bringToFront();
    }

    /* JADX INFO: renamed from: k */
    private void m41970k() {
        if (this.f40250m == null) {
            preLoadData(this.f40246Q);
        }
        addView(this.f40250m);
        MBridgePlayableView mBridgePlayableView = this.f40250m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.setUnitId(this.f40260w);
            CampaignEx campaignEx = this.f40202b;
            if (campaignEx != null && campaignEx.isMraid() && this.f40202b.getPlayable_ads_without_video() == 2) {
                this.f40250m.setCloseVisible(0);
            }
            this.f40250m.setNotchValue(this.f40245P, this.f40240K, this.f40241L, this.f40242M, this.f40243N);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m41971l() {
        if (this.f40255r == null) {
            m41959a(this.f40246Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f40255r, layoutParams);
        this.f40255r.notifyShowListener();
    }

    /* JADX INFO: renamed from: m */
    private void m41972m() {
        if (this.f40257t == null) {
            m41962b(this.f40246Q);
        }
        addView(this.f40257t);
        onConfigurationChanged(getResources().getConfiguration());
        this.f40248S = true;
        bringToFront();
    }

    /* JADX INFO: renamed from: n */
    private boolean m41973n() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    /* JADX INFO: renamed from: o */
    private void m41974o() {
        this.f40232C = false;
        this.f40248S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof MBridgeContainerView) {
                    i++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m41975p() {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        int i = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(C13188c1.m37645a(str, "ecid"));
            } catch (Throwable th) {
                C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        this.f40253p = new MBridgeNativeEndCardView(this.f40201a, null, true, i, this.f40202b.getAdSpaceT() == 2, this.f40211k, this.f40202b.getMof_tplid());
        if (this.f40202b.getDynamicTempCode() != 5) {
            this.f40253p.setCampaign(this.f40202b);
            return;
        }
        InterfaceC14058a interfaceC14058a = this.notifyListener;
        if (interfaceC14058a != null && (interfaceC14058a instanceof C14069k)) {
            ((C14069k) interfaceC14058a).m42171a(this.f40202b);
        }
        this.f40253p.setCampaign(this.f40202b);
    }

    /* JADX INFO: renamed from: q */
    private void m41976q() {
        if (this.f40258u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f40201a);
            this.f40258u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f40260w);
            this.f40258u.setCampaign(this.f40202b);
        }
        this.f40258u.preLoadData(this.f40246Q);
    }

    /* JADX INFO: renamed from: r */
    private void m41977r() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.f40249T = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view == null) {
            C13219q0.m37816b(MBridgeBaseView.TAG, "view is null");
        } else {
            m41955a(view);
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            C13219q0.m37816b(MBridgeBaseView.TAG, "view is null");
        } else {
            m41955a(view);
            super.addView(view, layoutParams);
        }
    }

    public boolean canBackPress() {
        if (this.f40253p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f40256s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f40250m;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void configurationChanged(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40252o;
        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f40252o.resizeMiniCard(i, i2);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean endCardShowing() {
        return this.f40231B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        return mBridgeH5EndCardView == null ? this.f40250m : mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f40202b.isDynamicView() || !TextUtils.isEmpty(this.f40202b.getendcard_url())) {
            return null;
        }
        int size = this.f40249T.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f40249T.get(i2) != null && this.f40249T.get(i2).getId() == this.f40202b.getId()) {
                i = i2 - 1;
                break;
            }
        }
        if (i < 0 || i >= size || this.f40249T.get(i) == null) {
            return null;
        }
        return this.f40249T.get(i);
    }

    public boolean getShowingTransparent() {
        return this.f40233D;
    }

    public String getUnitID() {
        return this.f40260w;
    }

    public int getVideoInteractiveType() {
        return this.f40261x;
    }

    public int getVideoSkipTime() {
        return this.f40237H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView == null) {
            m41965f();
            return;
        }
        mBridgeH5EndCardView.handlerPlayableException(str);
        if (this.f40238I) {
            m41965f();
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.f40247R && !this.f40248S) {
            m41974o();
            this.f40247R = false;
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f40258u;
        if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.f40258u);
        MBridgeClickCTAView mBridgeClickCTAView = this.f40251n;
        if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
            return;
        }
        m41977r();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.notifyListener.mo41600a(105, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void ivRewardAdsWithoutVideo(String str) {
        this.notifyListener.mo41600a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40252o;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean miniCardShowing() {
        return this.f40232C;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14179h
    public void notifyCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f40250m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m41954a(configuration, this.f40250m, this.f40251n, this.f40252o, this.f40253p, this.f40254q, this.f40255r, this.f40256s, this.f40257t);
    }

    public void onEndcardBackPress() {
        if (this.f40253p != null || this.f40255r != null) {
            this.notifyListener.mo41600a(104, "");
            try {
                C13965a.m41789a().m41799b();
                return;
            } catch (Exception e) {
                C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
                return;
            }
        }
        if (this.f40256s != null) {
            this.notifyListener.mo41600a(103, "");
            return;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f40232C) {
            this.notifyListener.mo41600a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f40250m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        m41960a(this.f40250m, this.f40252o, this.f40254q, this.f40258u);
    }

    public void preLoadData(C14177b c14177b) {
        this.f40246Q = c14177b;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                m41958a(c14177b);
            } else {
                m41961b(this.f40261x);
                if (this.f40202b.isDynamicView()) {
                    try {
                        m41959a(c14177b, Integer.valueOf(this.f40202b.getVideo_end_type()));
                    } catch (Throwable th) {
                        C13219q0.m37816b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC13996a(c14177b));
                    }
                    if (!C13229v0.m37945l(this.f40202b.getendcard_url())) {
                        try {
                            String strM37645a = C13188c1.m37645a(this.f40202b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(strM37645a) && Integer.parseInt(strM37645a) == 1) {
                                C13965a.m41789a().m41797a(this.f40202b, 2);
                            }
                        } catch (Exception e) {
                            C13219q0.m37816b(MBridgeBaseView.TAG, e.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC13997b(c14177b), getVideoSkipTime());
                }
            }
            m41976q();
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void readyStatus(int i) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f40254q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f40250m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f40256s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f40253p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f40253p.release();
        }
        if (this.notifyListener != null) {
            this.notifyListener = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void resizeMiniCard(int i, int i2, int i3) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40252o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i, i2);
            this.f40252o.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.f40248S = true;
            bringToFront();
            m41968i();
        }
    }

    public void setCloseDelayTime(int i) {
        this.f40263z = i;
    }

    public void setEndscreenType(int i) {
        this.f40262y = i;
    }

    public void setJSFactory(C14177b c14177b) {
        this.f40246Q = c14177b;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40252o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f40252o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        C13219q0.m37816b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)));
        this.f40244O = i;
        this.f40240K = i2;
        this.f40241L = i3;
        this.f40242M = i4;
        this.f40243N = i5;
        this.f40245P = C13190d0.m37652a(i, i2, i3, i4, i5);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f40253p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f40288p != null) {
            mBridgeH5EndCardView.setNotchValue(this.f40245P, i2, i3, i4, i5);
            C13392f.m38726a().m38728a((WebView) this.f40254q.f40288p, "oncutoutfetched", Base64.encodeToString(this.f40245P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f40250m;
        if (mBridgePlayableView != null && mBridgePlayableView.f40288p != null) {
            mBridgePlayableView.setNotchValue(this.f40245P, i2, i3, i4, i5);
            C13392f.m38726a().m38728a((WebView) this.f40250m.f40288p, "oncutoutfetched", Base64.encodeToString(this.f40245P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f40259v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i2, i3, i4, i5);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(InterfaceC14058a interfaceC14058a) {
        super.setNotifyListener(interfaceC14058a);
        m41957a(interfaceC14058a, this.f40250m, this.f40251n, this.f40252o, this.f40253p, this.f40254q, this.f40255r, this.f40256s, this.f40257t);
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f40253p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f40253p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i) {
        this.f40230A = i;
    }

    public void setRewardStatus(boolean z) {
        this.f40239J = z;
    }

    public void setShowingTransparent(boolean z) {
        this.f40233D = z;
    }

    public void setUnitID(String str) {
        this.f40260w = str;
    }

    public void setVideoInteractiveType(int i) {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            this.f40261x = i;
            return;
        }
        int iM41863b = C13976a.m41863b(this.f40202b);
        if (iM41863b == 100) {
            this.f40261x = i;
        } else {
            this.f40261x = iM41863b;
        }
    }

    public void setVideoSkipTime(int i) {
        this.f40237H = i;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f40258u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        if (!m41973n() && !this.f40248S) {
            removeAllViews();
            bringToFront();
            this.f40247R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40252o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        m41964e();
        setBackgroundColor(0);
        this.f40258u.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showEndcard(int i) {
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            if (i == 1) {
                this.notifyListener.mo41600a(104, "");
            } else if (i == 100) {
                if (campaignEx.getPlayable_ads_without_video() == 2) {
                    this.f40236G = true;
                }
                m41955a(this.f40250m);
                setMatchParent();
                m41969j();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                m41971l();
                this.f40248S = true;
                bringToFront();
            } else if (i == 4) {
                this.notifyListener.mo41600a(113, "");
                removeAllViews();
                setMatchParent();
                m41967h();
                this.f40248S = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.f40248S = true;
                bringToFront();
                m41965f();
                this.notifyListener.mo41600a(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "");
            } else {
                this.notifyListener.mo41600a(106, "");
            }
        }
        this.f40231B = true;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40252o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.f40252o.setRadius(i5);
            this.f40252o.setCloseVisible(8);
            this.f40252o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f40248S = true;
            bringToFront();
            m41968i();
            if (this.f40235F) {
                return;
            }
            this.f40235F = true;
            this.notifyListener.mo41600a(109, "");
            this.notifyListener.mo41600a(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "");
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f40201a);
        this.f40259v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f40249T);
        InterfaceC14058a interfaceC14058a = this.notifyListener;
        if (interfaceC14058a != null && (interfaceC14058a instanceof C14069k)) {
            ((C14069k) interfaceC14058a).m42173a(this.f40249T);
        }
        this.f40259v.setNotifyListener(new C14067i(this.notifyListener));
        this.f40259v.setRewarded(this.f40239J);
        this.f40259v.setNotchPadding(this.f40240K, this.f40241L, this.f40242M, this.f40243N);
        this.f40259v.setCampOrderViewBuildCallback(new C13998c());
        this.f40259v.createView(this);
    }

    public void showPlayableView() {
        if (this.f40202b == null || this.f40236G) {
            return;
        }
        removeAllViews();
        setMatchParent();
        m41970k();
        this.f40248S = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showVideoClickView(int i) {
        if (this.f40202b != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                m41974o();
                return;
            }
            if (i == 1) {
                if (this.f40231B) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
                if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                    removeView(this.f40254q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40252o;
                if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
                    removeView(this.f40252o);
                }
                MBridgeClickCTAView mBridgeClickCTAView = this.f40251n;
                if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
                    try {
                        CampaignEx campaignEx = this.f40202b;
                        if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 1) {
                            this.f40248S = true;
                            addCTAView();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            MBridgeClickCTAView mBridgeClickCTAView2 = this.f40251n;
            if (mBridgeClickCTAView2 != null && mBridgeClickCTAView2.getParent() != null) {
                removeView(this.f40251n);
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f40258u;
            if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f40252o;
                if (mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx2 = this.f40202b;
                        if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                            setMatchParent();
                            m41968i();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    m41974o();
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f40254q;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f40254q);
                }
                this.notifyListener.mo41600a(112, "");
                CampaignEx campaignEx3 = this.f40202b;
                if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                    this.f40202b.setHasReportAdTrackPause(true);
                    C14075b.m42203c(this.f40201a, this.f40202b);
                }
                if (this.f40233D) {
                    this.notifyListener.mo41600a(115, "");
                } else {
                    this.f40248S = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.f40232C = true;
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        m41972m();
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14179h
    public void toggleCloseBtn(int i) {
        MBridgePlayableView mBridgePlayableView = this.f40250m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f40254q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
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
        if (this.f40202b != null) {
            this.notifyListener.mo41600a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "");
            this.notifyListener.mo41600a(104, "");
        }
    }

    public void webviewshow() {
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("type", 3);
            C13156d.m37475b().m37483a("2000133", this.f40202b, c13157e);
        } catch (Exception unused) {
        }
        m41963b(this.f40250m, this.f40252o, this.f40254q, this.f40258u);
    }
}
