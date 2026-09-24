package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.RunnableC7915d;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7917a;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.config.C8015l;
import com.fyber.inneractive.sdk.config.C8017m;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.C8051x0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.AbstractC7992t;
import com.fyber.inneractive.sdk.config.global.features.C7975c;
import com.fyber.inneractive.sdk.config.global.features.C7991s;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.external.C8060g;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.AbstractC8170p0;
import com.fyber.inneractive.sdk.flow.AbstractC8176s0;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.CountDownTimerC8134m0;
import com.fyber.inneractive.sdk.flow.InterfaceC8126i0;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.endcard.C8093k;
import com.fyber.inneractive.sdk.flow.endcard.C8109o;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.C8180b;
import com.fyber.inneractive.sdk.flow.storepromo.observer.C8214b;
import com.fyber.inneractive.sdk.flow.storepromo.observer.InterfaceC8213a;
import com.fyber.inneractive.sdk.flow.storepromo.p275ui.C8217c;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8264e;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.network.C8360b0;
import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.InterfaceC8436a;
import com.fyber.inneractive.sdk.player.controller.AbstractC8485z;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8455b;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.rtb.watermark.InterfaceC9110a;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9132a;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.HandlerC9191t1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.viewtime.C9200c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C9080x extends AbstractC8170p0 implements InterfaceC8466g0, InterfaceC8213a, InterfaceC9110a {

    /* JADX INFO: renamed from: A */
    public WeakReference f21264A;

    /* JADX INFO: renamed from: E */
    public C8060g f21268E;

    /* JADX INFO: renamed from: G */
    public AbstractC9062f0 f21270G;

    /* JADX INFO: renamed from: M */
    public C9200c f21276M;

    /* JADX INFO: renamed from: x */
    public InterfaceC8264e f21277x;

    /* JADX INFO: renamed from: y */
    public InterfaceC8889m f21278y;

    /* JADX INFO: renamed from: z */
    public InterfaceC8455b f21279z;

    /* JADX INFO: renamed from: B */
    public boolean f21265B = false;

    /* JADX INFO: renamed from: C */
    public boolean f21266C = false;

    /* JADX INFO: renamed from: D */
    public boolean f21267D = false;

    /* JADX INFO: renamed from: F */
    public UnitDisplayType f21269F = UnitDisplayType.INTERSTITIAL;

    /* JADX INFO: renamed from: H */
    public boolean f21271H = false;

    /* JADX INFO: renamed from: I */
    public final C9079w f21272I = new C9079w(this);

    /* JADX INFO: renamed from: J */
    public final RelativeLayout.LayoutParams f21273J = new RelativeLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: K */
    public boolean f21274K = false;

    /* JADX INFO: renamed from: L */
    public boolean f21275L = false;

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: B */
    public final boolean mo20472B() {
        InterfaceC8889m interfaceC8889m = this.f21278y;
        return interfaceC8889m != null && interfaceC8889m.mo21427b();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: G */
    public final void mo20477G() {
        View view = this.f17966j;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: I */
    public final boolean mo20585I() {
        return this.f21274K;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: K */
    public final int mo20587K() {
        Integer numMo20416a;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            C8219t0 c8219t0 = (C8219t0) abstractC8236x;
            if (c8219t0.f18375c != null && (numMo20416a = ((C7991s) c8219t0.f18375c.m20432a(C7991s.class)).mo20416a("close_clickable_area_dp")) != null) {
                return numMo20416a.intValue();
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: L */
    public final int mo20588L() {
        Integer numMo20416a;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            C8219t0 c8219t0 = (C8219t0) abstractC8236x;
            if (c8219t0.f18375c != null && (numMo20416a = ((C7991s) c8219t0.f18375c.m20432a(C7991s.class)).mo20416a("close_visible_size_dp")) != null) {
                return numMo20416a.intValue();
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: M */
    public final long mo20589M() {
        int iM20443a;
        long j;
        AbstractC9062f0 abstractC9062f0;
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (m20471A()) {
                Integer numMo20416a = ((C7975c) ((C8219t0) this.f17958b).f18375c.m20432a(C7975c.class)).mo20416a("end_card_skip_time_sec");
                int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 0;
                if (iIntValue < 0 || iIntValue > 5) {
                    iIntValue = 0;
                }
                if (iIntValue > 0) {
                    IAlog.m21945a("%s: overriding endcard dismiss time with child mode with %d", IAlog.m21943a(this), Integer.valueOf(iIntValue));
                    return iIntValue;
                }
            }
            IAlog.m21945a("%s: overriding endcard dismiss time with child mode with %d", IAlog.m21943a(this), 0);
            return 0L;
        }
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        C8015l c8015lM20444a = iAConfigManager.f17688t.f17862b.m20444a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        InterfaceC9124b interfaceC9124b = this.f21279z;
        if (interfaceC9124b == null && (abstractC9062f0 = this.f21270G) != null) {
            interfaceC9124b = abstractC9062f0.f21205a;
        }
        C8093k c8093kM20944j = interfaceC9124b != null ? ((AbstractC8485z) interfaceC9124b).m20944j() : null;
        if (c8093kM20944j != null) {
            AbstractC8084b abstractC8084bM20530a = c8093kM20944j.f18001b.m20530a();
            iM20443a = abstractC8084bM20530a != null ? abstractC8084bM20530a.f17987f : c8093kM20944j.f18005f;
        } else {
            iM20443a = iAConfigManager.f17688t.f17862b.m20443a("vast_endcard_x_delay", 5, 0);
        }
        long j2 = iM20443a;
        if (c8015lM20444a.f17796a.containsKey("endcard_cr") || c8015lM20444a.f17796a.containsKey("endcard_ci")) {
            String str = this.f21269F != UnitDisplayType.REWARDED ? "endcard_ci" : "endcard_cr";
            try {
                j = c8015lM20444a.f17796a.containsKey(str) ? Long.parseLong((String) c8015lM20444a.f17796a.get(str)) : j2;
            } catch (Exception unused) {
            }
            if (j >= 0 && j <= 5) {
                IAlog.m21945a("%s : overriding endcard dismiss time for type: %s with: %d sec.", IAlog.m21943a(this), this.f21269F, Long.valueOf(j));
                this.f18201t = true;
                j2 = j;
            }
        }
        return j2 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: N */
    public final boolean mo20590N() {
        InterfaceC8889m interfaceC8889m = this.f21278y;
        return interfaceC8889m != null && interfaceC8889m.mo21459c();
    }

    /* JADX INFO: renamed from: O */
    public final void m21881O() {
        if (this.f21266C || this.f17959c == null) {
            return;
        }
        this.f21266C = true;
        InterfaceC8264e interfaceC8264e = this.f21277x;
        if (interfaceC8264e != null && (interfaceC8264e.wasDismissedByUser() || IAConfigManager.f17654M.f17688t.f17862b.m20444a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).m20438a())) {
            EnumC8315x enumC8315x = EnumC8315x.EVENT_CLOSE;
            AbstractC8236x abstractC8236x = this.f17958b;
            if (abstractC8236x != null) {
                C8219t0 c8219t0 = (C8219t0) abstractC8236x;
                if (c8219t0.f18321i != null) {
                    String[] strArr = {enumC8315x.m20712a()};
                    C8876t c8876t = c8219t0.f18321i;
                    if (c8876t != null) {
                        c8876t.m21423a("EVENT_TRACKING", strArr);
                    }
                }
            }
            EnumC8315x enumC8315x2 = EnumC8315x.EVENT_CLOSE_LINEAR;
            AbstractC8236x abstractC8236x2 = this.f17958b;
            if (abstractC8236x2 != null) {
                C8219t0 c8219t1 = (C8219t0) abstractC8236x2;
                if (c8219t1.f18321i != null) {
                    String[] strArr2 = {enumC8315x2.m20712a()};
                    C8876t c8876t2 = c8219t1.f18321i;
                    if (c8876t2 != null) {
                        c8876t2.m21423a("EVENT_TRACKING", strArr2);
                    }
                }
            }
        }
        ((InneractiveFullscreenAdEventsListener) this.f17959c).onAdDismissed(this.f17957a);
    }

    /* JADX INFO: renamed from: P */
    public final void m21882P() {
        InterfaceC8041s0 interfaceC8041s0;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x == null || (interfaceC8041s0 = ((C8219t0) abstractC8236x).f18376d) == null) {
            return;
        }
        C8028r0 c8028r0 = (C8028r0) interfaceC8041s0;
        if (c8028r0.f17813c != null) {
            UnitDisplayType unitDisplayType = c8028r0.f17813c.f17798b;
            C8051x0 c8051x0 = IAConfigManager.f17654M.f17691w;
            EnumC7919c enumC7919c = unitDisplayType == UnitDisplayType.REWARDED ? EnumC7919c.REWARDED_VIDEO : EnumC7919c.INTERSTITIAL_VIDEO;
            EnumC7917a enumC7917a = EnumC7917a.CLICK;
            C7916e c7916e = c8051x0.f17888a;
            if (c7916e != null) {
                AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: a */
    public final long mo20591a(long j) {
        if (this.f18201t) {
            return j;
        }
        long j2 = 12;
        try {
            j2 = Long.parseLong(IAConfigManager.f17654M.f17688t.f17862b.m20445a("vast_endcard_x_fallback_delay", Long.toString(12L)));
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20884a(C9152g1 c9152g1, EnumC9150g enumC9150g) {
        AbstractC9087e abstractC9087e;
        C8293b c8293b;
        m21882P();
        Context context = this.f21278y.getContext() == null ? AbstractC9174o.f21470a : this.f21278y.getContext();
        AbstractC8236x abstractC8236x = this.f17958b;
        return m20479a(context, (abstractC8236x == null || (abstractC9087e = ((C8219t0) abstractC8236x).f18374b) == null || (c8293b = ((C9089g) abstractC9087e).f21329L) == null) ? null : c8293b.f18500b, c9152g1, enumC9150g, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20885a(String str, C9152g1 c9152g1, boolean z) {
        AbstractC9062f0 abstractC9062f0;
        if (this.f21269F == UnitDisplayType.INTERSTITIAL) {
            this.f21271H = true;
        }
        InterfaceC9124b interfaceC9124b = this.f21279z;
        if (interfaceC9124b == null && (abstractC9062f0 = this.f21270G) != null) {
            interfaceC9124b = abstractC9062f0.f21205a;
        }
        C8093k c8093kM20944j = interfaceC9124b != null ? ((AbstractC8485z) interfaceC9124b).m20944j() : null;
        AbstractC8084b abstractC8084bM20530a = c8093kM20944j != null ? c8093kM20944j.f18001b.m20530a() : null;
        if (abstractC8084bM20530a == null) {
            return new C9142d0(EnumC9151g0.FAILED, new Exception("No Companion clicked"));
        }
        m21882P();
        C9142d0 c9142d0M20479a = m20479a(abstractC8084bM20530a.f17984c.f18379a, str, c9152g1, abstractC8084bM20530a.mo20511g(), false, null);
        if (c9142d0M20479a.f21443a != EnumC9151g0.FAILED) {
            C8219t0 c8219t0 = abstractC8084bM20530a.f17984c.f18380b;
            String[] strArr = {EnumC8315x.EVENT_CLICK.toString()};
            C8876t c8876t = c8219t0.f18321i;
            if (c8876t != null) {
                c8876t.m21423a("EVENT_TRACKING", strArr);
            }
        }
        return c9142d0M20479a;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20666a() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20886a(int i, boolean z) {
        C9200c c9200c = this.f21276M;
        if (c9200c != null && i > -1) {
            c9200c.f21504a = i;
        }
        if (c9200c != null) {
            c9200c.m22036a(z);
            this.f21276M = null;
        }
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) AbstractC9195v.m22024a(this.f21264A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        C8051x0 c8051x0 = IAConfigManager.f17654M.f17691w;
        UnitDisplayType unitDisplayType = this.f21269F;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        EnumC7919c enumC7919c = unitDisplayType == unitDisplayType2 ? EnumC7919c.REWARDED_VIDEO : EnumC7919c.INTERSTITIAL_VIDEO;
        EnumC7917a enumC7917a = EnumC7917a.COMPLETION;
        C7916e c7916e = c8051x0.f17888a;
        if (c7916e != null) {
            AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
        }
        if (this.f21269F == unitDisplayType2) {
            C8060g c8060g = this.f21268E;
            if (c8060g != null) {
                InterfaceC8126i0 interfaceC8126i0 = (InterfaceC8126i0) AbstractC9195v.m22024a(((AbstractC8176s0) c8060g.f17945a).mAdSpot);
                InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = c8060g.f17945a.f17923b;
                if (inneractiveFullScreenAdRewardedListener != null && interfaceC8126i0 != null) {
                    inneractiveFullScreenAdRewardedListener.onAdRewarded(interfaceC8126i0);
                }
            }
            m20478H();
        }
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x == null || ((C8219t0) abstractC8236x).f18321i == null) {
            return;
        }
        m20586J();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20887a(View view) {
        m20483c(view);
        m20484c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20888a(View view, String str) {
        if (view != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(m20483c(view), str);
            m20483c(view);
            m20484c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.rtb.watermark.InterfaceC9110a
    /* JADX INFO: renamed from: a */
    public final void mo21880a(FrameLayout frameLayout) {
        InterfaceC8889m interfaceC8889m = this.f21278y;
        if (interfaceC8889m != null) {
            ((AbstractC8881e) interfaceC8889m).setWatermarkView(frameLayout);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20667a(C8060g c8060g) {
        this.f21268E = c8060g;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20592a(InterfaceC8213a interfaceC8213a) {
        InterfaceC8455b interfaceC8455b = this.f21279z;
        if (interfaceC8455b == null) {
            IAlog.m21950f("Unable to unregister store promo observer - ui controller unavailable", new Object[0]);
        } else {
            ((AbstractC8485z) interfaceC8455b).m20938b(interfaceC8213a);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.InterfaceC8213a
    /* JADX INFO: renamed from: a */
    public final void mo20621a(C8214b c8214b) {
        if (this.f21269F == UnitDisplayType.INTERSTITIAL) {
            IAlog.m21945a("InneractiveFullscreenVideoAdRenderer: update: StorePromo isClicked: %s", Boolean.valueOf(c8214b.f18308b));
            this.f21271H = c8214b.f18308b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20593a(InterfaceC8264e interfaceC8264e, Activity activity) throws InneractiveUnitController.AdDisplayError {
        C8870n c8870n;
        C8876t c8876t;
        C8043t0 c8043t0;
        super.mo20593a(interfaceC8264e, activity);
        this.f21277x = interfaceC8264e;
        boolean z = false;
        this.f21265B = false;
        this.f21266C = false;
        this.f21275L = false;
        InneractiveUnitController selectedUnitController = this.f17957a.getSelectedUnitController();
        if (selectedUnitController != null) {
            if (selectedUnitController instanceof InneractiveFullscreenUnitController) {
                InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
                if (selectedContentController != null) {
                    if (selectedContentController instanceof InneractiveFullscreenVideoContentController) {
                        this.f21264A = new WeakReference((InneractiveFullscreenVideoContentController) selectedContentController);
                    } else {
                        IAlog.m21950f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.m21943a(this), selectedContentController.getClass().getSimpleName());
                    }
                }
            } else {
                IAlog.m21950f("%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController", IAlog.m21943a(this));
            }
        }
        InterfaceC8041s0 interfaceC8041s0 = this.f17957a.getAdContent().f18376d;
        if (interfaceC8041s0 != null && (c8043t0 = ((C8028r0) interfaceC8041s0).f17816f) != null) {
            this.f21269F = c8043t0.f17876j;
        }
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            ((C8219t0) abstractC8236x).mo20637e();
        }
        AbstractC8236x abstractC8236x2 = this.f17958b;
        C9200c c9200c = null;
        C8876t c8876t2 = abstractC8236x2 != null ? ((C8219t0) abstractC8236x2).f18321i : null;
        Context context = this.f21277x.getLayout().getContext();
        if (c8876t2 != null) {
            InterfaceC8436a interfaceC8436a = c8876t2.f20853f;
            if (interfaceC8436a == null || ((C8870n) interfaceC8436a).f20772a == null) {
                IAlog.m21950f("%sFull screen video ad renderer is not valid.", IAlog.m21943a(this));
                throw new InneractiveUnitController.AdDisplayError("Full screen video could not be loaded");
            }
            C9061f c9061f = interfaceC8436a != null ? new C9061f(c8876t2) : null;
            this.f21270G = c9061f;
            this.f21278y = c9061f.mo21854a(context, ((C8219t0) this.f17958b).f18375c);
            InterfaceC8455b interfaceC8455bMo21853a = this.f21270G.mo21853a(this.f17957a, (C8219t0) this.f17958b);
            this.f21279z = interfaceC8455bMo21853a;
            this.f21270G.mo21856b();
            interfaceC8455bMo21853a.mo20852b(false);
            AbstractC8485z abstractC8485z = (AbstractC8485z) this.f21279z;
            abstractC8485z.getClass();
            abstractC8485z.f18903g = this;
            ((AbstractC8485z) this.f21279z).m20935a(this);
            ((AbstractC8881e) this.f21278y).m21430f();
            this.f21273J.addRule(13);
            this.f21277x.getLayout().addView((View) this.f21278y, this.f21273J);
            this.f17966j = ((View) this.f21278y).findViewById(C7809R.id.ia_click_overlay);
            this.f21270G.mo21855a(this.f21272I);
            this.f21265B = true;
            AbstractC8236x abstractC8236x3 = this.f17958b;
            if (abstractC8236x3 == null || (c8876t = ((C8219t0) abstractC8236x3).f18321i) == null) {
                c8870n = null;
            } else {
                InterfaceC8436a interfaceC8436a2 = c8876t.f20853f;
                if (interfaceC8436a2 instanceof C8870n) {
                    c8870n = (C8870n) interfaceC8436a2;
                } else {
                    c8870n = null;
                }
            }
            if (c8870n == null || this.f21279z == null) {
                IAlog.m21946b("%s%s is null, cannot create VideoViewTime", IAlog.m21943a(this), c8870n == null ? "mediaPlayerFlowManager" : "mUIController");
            } else {
                int iMo20843c = c8870n.f20772a.mo20843c();
                AbstractC8236x abstractC8236x4 = this.f17958b;
                C9132a c9132a = this.f18202u;
                int iM20945l = ((AbstractC8485z) this.f21279z).m20945l() * 1000;
                boolean zM21397a = AbstractC8846f.m21397a(iMo20843c, AbstractC8846f.m21396a(c8870n), ((C8219t0) this.f17958b).f18376d);
                if (InneractiveAdManager.isCurrentUserAChild() || this.f21269F != UnitDisplayType.REWARDED) {
                    z = zM21397a;
                } else if (iMo20843c > iM20945l) {
                    z = true;
                }
                c9200c = new C9200c(abstractC8236x4, c9132a, z);
            }
            this.f21276M = c9200c;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20889a(String str, String str2) {
        IAlog.m21945a(IAlog.m21943a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        InterfaceC8264e interfaceC8264e = this.f21277x;
        if (interfaceC8264e == null || interfaceC8264e.getLayout() == null || this.f21277x.getLayout().getContext() == null) {
            return;
        }
        if (this.f21275L) {
            IAlog.m21945a(IAlog.m21943a(this) + "redirect already reported for this ad", new Object[0]);
            return;
        }
        C8360b0.m20734a(this.f21277x.getLayout().getContext(), str, str2, this.f17958b);
        this.f21275L = true;
        IAlog.m21945a(IAlog.m21943a(this) + "reporting auto redirect", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20890a(boolean z) {
        C8876t c8876t;
        InterfaceC8264e interfaceC8264e;
        if (z) {
            EnumC8315x enumC8315x = EnumC8315x.EVENT_SKIP;
            AbstractC8236x abstractC8236x = this.f17958b;
            if (abstractC8236x != null) {
                C8219t0 c8219t0 = (C8219t0) abstractC8236x;
                if (c8219t0.f18321i != null) {
                    String[] strArr = {enumC8315x.m20712a()};
                    C8876t c8876t2 = c8219t0.f18321i;
                    if (c8876t2 != null) {
                        c8876t2.m21423a("EVENT_TRACKING", strArr);
                    }
                }
            }
        }
        AbstractC8236x abstractC8236x2 = this.f17958b;
        if (abstractC8236x2 == null || (c8876t = ((C8219t0) abstractC8236x2).f18321i) == null) {
            return;
        }
        c8876t.m21423a("TRACKING_COMPLETED", new String[0]);
        m20586J();
        String[] strArr2 = new String[0];
        C8876t c8876t3 = ((C8219t0) this.f17958b).f18321i;
        if (c8876t3 != null) {
            c8876t3.m21423a("TRACKING_COMPLETED", strArr2);
        }
        if (IAConfigManager.f17654M.f17688t.f17862b.m20444a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).m20438a() && z && (interfaceC8264e = this.f21277x) != null) {
            interfaceC8264e.destroy();
        }
        C9200c c9200c = this.f21276M;
        if (c9200c != null) {
            c9200c.m22036a(z);
            this.f21276M = null;
        }
        m21883f(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20891a(boolean z, Orientation orientation) {
        InterfaceC8264e interfaceC8264e = this.f21277x;
        if (interfaceC8264e != null) {
            interfaceC8264e.setActivityOrientation(z, orientation);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (((r2 == null || (r2 = r2.f21292B) == null || !android.text.TextUtils.equals(r2, "1")) ? false : true) != false) goto L52;
     */
    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo20594b(boolean r6) {
        /*
            r5 = this;
            r5.m21883f(r6)
            com.fyber.inneractive.sdk.player.controller.b r6 = r5.f21279z
            r0 = 0
            if (r6 == 0) goto Lf
            com.fyber.inneractive.sdk.player.controller.z r6 = (com.fyber.inneractive.sdk.player.controller.AbstractC8485z) r6
            com.fyber.inneractive.sdk.flow.endcard.k r6 = r6.m20944j()
            goto L10
        Lf:
            r6 = r0
        L10:
            com.fyber.inneractive.sdk.player.ui.m r1 = r5.f21278y
            if (r1 == 0) goto L22
            com.fyber.inneractive.sdk.player.ui.s r1 = (com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s) r1
            android.view.ViewGroup r1 = r1.f20962r
            if (r1 == 0) goto L22
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L22
            goto L9e
        L22:
            boolean r1 = r5.f21271H
            if (r1 != 0) goto L9e
            r1 = 0
            if (r6 == 0) goto L41
            com.fyber.inneractive.sdk.flow.x0 r2 = r6.f18000a
            com.fyber.inneractive.sdk.response.g r2 = r2.f18382d
            if (r2 == 0) goto L3d
            java.lang.String r2 = r2.f21292B
            if (r2 == 0) goto L3d
            java.lang.String r3 = "1"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L3d
            r2 = 1
            goto L3e
        L3d:
            r2 = r1
        L3e:
            if (r2 == 0) goto L41
            goto L9e
        L41:
            if (r6 == 0) goto L48
            com.fyber.inneractive.sdk.flow.endcard.b r6 = r6.m20525a()
            goto L49
        L48:
            r6 = r0
        L49:
            if (r6 == 0) goto L96
            com.fyber.inneractive.sdk.flow.x0 r2 = r6.f17984c
            com.fyber.inneractive.sdk.model.vast.b r2 = r2.f18383e
            com.fyber.inneractive.sdk.model.vast.o r2 = r2.f18504f
            if (r2 == 0) goto L96
            boolean r2 = r2.f18558d
            if (r2 == 0) goto L96
            r5.f21274K = r1
            r5.f18197p = r1
            com.fyber.inneractive.sdk.interfaces.e r2 = r5.f18192k
            if (r2 == 0) goto L62
            r2.disableCloseButton()
        L62:
            com.fyber.inneractive.sdk.util.a r2 = r5.f18203v
            r3 = 0
            r2.f21432d = r3
            r2.f21433e = r3
            r2.f21434f = r3
            r2.f21430b = r1
            java.lang.Runnable r1 = r5.f18193l
            if (r1 == 0) goto L79
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.AbstractC9183r.f21478b
            r2.removeCallbacks(r1)
            r5.f18193l = r0
        L79:
            java.lang.Runnable r1 = r5.f18195n
            if (r1 == 0) goto L84
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.AbstractC9183r.f21478b
            r2.removeCallbacks(r1)
            r5.f18195n = r0
        L84:
            r5.m20586J()
            com.fyber.inneractive.sdk.renderers.f0 r0 = r5.f21270G
            com.fyber.inneractive.sdk.player.controller.z r0 = r0.f21205a
            r0.mo20851a(r6)
            com.fyber.inneractive.sdk.interfaces.e r6 = r5.f21277x
            if (r6 == 0) goto La5
            r6.secondEndCardWasDisplayed()
            return
        L96:
            com.fyber.inneractive.sdk.interfaces.e r6 = r5.f21277x
            if (r6 == 0) goto La5
            r6.destroy()
            return
        L9e:
            com.fyber.inneractive.sdk.interfaces.e r6 = r5.f21277x
            if (r6 == 0) goto La5
            r6.destroy()
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C9080x.mo20594b(boolean):void");
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: b */
    public final boolean mo20595b(InterfaceC8213a interfaceC8213a) {
        InterfaceC8455b interfaceC8455b = this.f21279z;
        if (interfaceC8455b != null) {
            return ((AbstractC8485z) interfaceC8455b).m20935a(interfaceC8213a);
        }
        IAlog.m21950f("Unable to register store promo observer - ui controller unavailable", new Object[0]);
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: b */
    public final boolean mo20596b(AbstractC8236x abstractC8236x) {
        Boolean boolMo20420c;
        C8006r c8006r;
        AbstractC9062f0 abstractC9062f0;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        C8021o c8021o = iAConfigManager.f17688t.f17862b;
        c8021o.getClass();
        String str = iAConfigManager.f17672d;
        if (!(c8021o.f17805b.containsKey(str) ? (C8017m) c8021o.f17805b.get(str) : new C8017m()).f17801a.containsKey(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
            InterfaceC9124b interfaceC9124b = this.f21279z;
            if (interfaceC9124b == null && (abstractC9062f0 = this.f21270G) != null) {
                interfaceC9124b = abstractC9062f0.f21205a;
            }
            C7994v c7994v = null;
            C8093k c8093kM20944j = interfaceC9124b != null ? ((AbstractC8485z) interfaceC9124b).m20944j() : null;
            AbstractC8084b abstractC8084bM20530a = c8093kM20944j != null ? c8093kM20944j.f18001b.m20530a() : null;
            if (abstractC8084bM20530a != null && abstractC8084bM20530a.mo20513i() == EnumC8300i.Static) {
                AbstractC8236x abstractC8236x2 = this.f17958b;
                if (abstractC8236x2 != null && (c8006r = ((C8219t0) abstractC8236x2).f18375c) != null) {
                    c7994v = (C7994v) c8006r.m20432a(C7994v.class);
                }
                UnitDisplayType unitDisplayType = this.f21269F;
                c7994v.getClass();
                int i = AbstractC7992t.f17760a[unitDisplayType.ordinal()];
                if (i != 1) {
                    if (i == 2 && (boolMo20420c = c7994v.mo20420c("countdown_iv")) != null) {
                        return boolMo20420c.booleanValue();
                    }
                    return false;
                }
                Boolean boolMo20420c2 = c7994v.mo20420c("countdown_rv");
                if (boolMo20420c2 != null) {
                    return boolMo20420c2.booleanValue();
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: c */
    public final void mo20892c() {
        if (!this.f21267D) {
            this.f18202u.m21953a(true);
        }
        this.f21267D = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        InterfaceC8264e interfaceC8264e = this.f21277x;
        if (interfaceC8264e != null) {
            interfaceC8264e.destroy();
        }
        if (this.f21265B) {
            m21881O();
        }
        InterfaceC8455b interfaceC8455b = this.f21279z;
        if (interfaceC8455b != null) {
            ((AbstractC8485z) interfaceC8455b).m20938b(this);
            this.f21279z.destroy();
            this.f21279z = null;
        }
        InterfaceC8889m interfaceC8889m = this.f21278y;
        if (interfaceC8889m != null) {
            interfaceC8889m.destroy();
            this.f21278y = null;
        }
        this.f21277x = null;
        this.f21264A = null;
        this.f21276M = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: e */
    public final void mo20893e() {
        m21882P();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: f */
    public final void mo20894f() {
        this.f21274K = true;
        CountDownTimerC8134m0 countDownTimerC8134m0 = this.f18204w;
        if (countDownTimerC8134m0 != null) {
            countDownTimerC8134m0.cancel();
            this.f18204w = null;
        }
        if (!this.f18200s) {
            this.f18200s = true;
            InterfaceC8264e interfaceC8264e = this.f21277x;
            if (interfaceC8264e != null) {
                m20597d(interfaceC8264e.isCloseButtonDisplay());
            }
        }
        InterfaceC8264e interfaceC8264e2 = this.f21277x;
        if (interfaceC8264e2 == null || !interfaceC8264e2.isCloseButtonDisplay()) {
            return;
        }
        m20598e(true ^ this.f18201t);
    }

    /* JADX INFO: renamed from: f */
    public final void m21883f(boolean z) {
        if (mo20590N() && this.f21274K) {
            return;
        }
        if (z) {
            InterfaceC8455b interfaceC8455b = this.f21279z;
            C8093k c8093kM20944j = interfaceC8455b != null ? ((AbstractC8485z) interfaceC8455b).m20944j() : null;
            C8109o c8109o = c8093kM20944j != null ? (C8109o) c8093kM20944j.f18001b.m20531a(EnumC8300i.FMP_End_Card) : null;
            this.f18203v.m21952a(c8109o != null ? c8109o.mo20511g().toString() : null);
            return;
        }
        C9132a c9132a = this.f18203v;
        c9132a.f21432d = 0L;
        c9132a.f21433e = 0L;
        c9132a.f21434f = 0L;
        c9132a.f21430b = false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: g */
    public final void mo20895g() {
        C9200c c9200c = this.f21276M;
        if (c9200c != null) {
            InterfaceC8889m interfaceC8889m = this.f21278y;
            c9200c.f21511d = interfaceC8889m != null && interfaceC8889m.mo21439a();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: h */
    public final void mo20896h() {
        InterfaceC8264e interfaceC8264e = this.f21277x;
        if (interfaceC8264e != null) {
            interfaceC8264e.dismissAd(false);
        }
        m20480a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: i */
    public final void mo20897i() {
        InterfaceC8264e interfaceC8264e = this.f21277x;
        if (interfaceC8264e != null) {
            interfaceC8264e.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: j */
    public final void mo20898j() {
        C8051x0 c8051x0 = IAConfigManager.f17654M.f17691w;
        EnumC7919c enumC7919c = this.f21269F == UnitDisplayType.INTERSTITIAL ? EnumC7919c.INTERSTITIAL_VIDEO : EnumC7919c.REWARDED_VIDEO;
        EnumC7917a enumC7917a = EnumC7917a.IMPRESSION;
        C7916e c7916e = c8051x0.f17888a;
        if (c7916e != null) {
            AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
        }
        m20475E();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: k */
    public final void mo20668k() {
        m21881O();
        InneractiveAdSpot inneractiveAdSpot = this.f17957a;
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof InterfaceC8126i0)) {
            return;
        }
        ((InterfaceC8126i0) inneractiveAdSpot).mo20544a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: m */
    public final void mo20669m() {
        C9197v1 c9197v1 = this.f18194m;
        if (c9197v1 != null) {
            c9197v1.f21501d = false;
            c9197v1.m22035a(SystemClock.uptimeMillis());
        }
        C9197v1 c9197v2 = this.f18196o;
        if (c9197v2 != null) {
            c9197v2.f21501d = false;
            c9197v2.m22035a(SystemClock.uptimeMillis());
        }
        this.f18203v.m21951a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    public final void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) AbstractC9195v.m22024a(this.f21264A);
        InterfaceC8264e interfaceC8264e = this.f21277x;
        if (interfaceC8264e != null) {
            interfaceC8264e.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    public final void onProgress(int i, int i2) {
        C9200c c9200c = this.f21276M;
        if (c9200c != null && i2 > -1) {
            c9200c.f21504a = i2;
        }
        this.f18202u.m21951a();
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) AbstractC9195v.m22024a(this.f21264A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: r */
    public final void mo20670r() {
        C9197v1 c9197v1 = this.f18194m;
        if (c9197v1 != null) {
            c9197v1.f21501d = true;
            HandlerC9191t1 handlerC9191t1 = c9197v1.f21500c;
            if (handlerC9191t1 != null) {
                handlerC9191t1.removeMessages(1932593528);
            }
        }
        C9197v1 c9197v2 = this.f18196o;
        if (c9197v2 != null) {
            c9197v2.f21501d = true;
            HandlerC9191t1 handlerC9191t2 = c9197v2.f21500c;
            if (handlerC9191t2 != null) {
                handlerC9191t2.removeMessages(1932593528);
            }
        }
        C9132a c9132a = this.f18202u;
        if (c9132a.f21430b && c9132a.f21433e == 0) {
            c9132a.f21433e = System.currentTimeMillis();
        }
        C9132a c9132a2 = this.f18203v;
        if (c9132a2.f21430b && c9132a2.f21433e == 0) {
            c9132a2.f21433e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: u */
    public final boolean mo20671u() {
        C8876t c8876t;
        InterfaceC8455b interfaceC8455b;
        InterfaceC8264e interfaceC8264e;
        InterfaceC8889m interfaceC8889m;
        C8180b c8180b;
        C8217c c8217c;
        View view;
        C8217c c8217c2;
        View view2;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x == null || (c8876t = ((C8219t0) abstractC8236x).f18321i) == null || (interfaceC8455b = this.f21279z) == null || (interfaceC8264e = this.f21277x) == null || (interfaceC8889m = this.f21278y) == null) {
            return false;
        }
        C8870n c8870n = (C8870n) c8876t.f20853f;
        C8178b c8178b = c8870n.f20840v;
        if (c8178b == null || (c8180b = c8178b.f18214d) == null || (c8217c = c8180b.f18224d) == null || c8217c.f18312b == null || (view = c8217c.f18311a) == null || view.getParent() == null || c8217c.f18312b.getVisibility() != 0) {
            if (interfaceC8889m.mo21459c()) {
                if (this.f18197p) {
                    interfaceC8264e.dismissAd(true);
                    return true;
                }
            } else if (interfaceC8455b.mo20853b()) {
                AbstractC8485z abstractC8485z = (AbstractC8485z) interfaceC8455b;
                if (abstractC8485z.mo20856B()) {
                    abstractC8485z.mo20864g(true);
                    return true;
                }
                abstractC8485z.m20940d(true);
            }
            return true;
        }
        C8178b c8178b2 = c8870n.f20840v;
        C8180b c8180b2 = c8178b2.f18214d;
        if (c8180b2 == null || (c8217c2 = c8180b2.f18224d) == null || c8217c2.f18312b == null || (view2 = c8217c2.f18311a) == null || view2.getParent() == null || c8217c2.f18312b.getVisibility() != 0) {
            IAlog.m21950f("StorePromoManager: hidePromo: unable hide promo: controller null or not ready", new Object[0]);
            return true;
        }
        c8178b2.f18214d.m20605a();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: v */
    public final void mo20489v() {
        View view = this.f17966j;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
