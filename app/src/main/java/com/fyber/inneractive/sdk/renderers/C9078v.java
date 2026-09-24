package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.RunnableC7915d;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7917a;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.config.C8015l;
import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7975c;
import com.fyber.inneractive.sdk.config.global.features.C7977e;
import com.fyber.inneractive.sdk.external.C8060g;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.AbstractC8170p0;
import com.fyber.inneractive.sdk.flow.AbstractC8176s0;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8121g;
import com.fyber.inneractive.sdk.flow.C8172q0;
import com.fyber.inneractive.sdk.flow.InterfaceC8126i0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8264e;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.measurement.tracker.EnumC8279d;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.p278ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9088f;
import com.fyber.inneractive.sdk.rtb.watermark.InterfaceC9110a;
import com.fyber.inneractive.sdk.util.AbstractC9139c0;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9132a;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.HandlerC9191t1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.viewtime.C9199b;
import com.fyber.inneractive.sdk.web.C9248m;
import com.iab.omid.library.fyber.adsession.AdSession;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C9078v extends AbstractC8170p0 implements InterfaceC9110a {

    /* JADX INFO: renamed from: F */
    public C9197v1 f21254F;

    /* JADX INFO: renamed from: J */
    public C8060g f21258J;

    /* JADX INFO: renamed from: K */
    public C9199b f21259K;

    /* JADX INFO: renamed from: x */
    public C9077u f21260x;

    /* JADX INFO: renamed from: z */
    public IAmraidWebViewController f21262z;

    /* JADX INFO: renamed from: y */
    public boolean f21261y = false;

    /* JADX INFO: renamed from: A */
    public boolean f21249A = false;

    /* JADX INFO: renamed from: B */
    public boolean f21250B = false;

    /* JADX INFO: renamed from: C */
    public boolean f21251C = false;

    /* JADX INFO: renamed from: D */
    public boolean f21252D = false;

    /* JADX INFO: renamed from: E */
    public boolean f21253E = false;

    /* JADX INFO: renamed from: G */
    public UnitDisplayType f21255G = UnitDisplayType.INTERSTITIAL;

    /* JADX INFO: renamed from: H */
    public boolean f21256H = false;

    /* JADX INFO: renamed from: I */
    public boolean f21257I = false;

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: I */
    public final boolean mo20585I() {
        return !this.f21251C && this.f21262z.f21595X;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: K */
    public final int mo20587K() {
        Integer numMo20416a;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            C8172q0 c8172q0 = (C8172q0) abstractC8236x;
            if (c8172q0.f18375c != null && c8172q0.f18375c.m20432a(C7977e.class) != null && (numMo20416a = ((C7977e) ((C8172q0) this.f17958b).f18375c.m20432a(C7977e.class)).mo20416a("close_clickable_area_dp")) != null) {
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
            C8172q0 c8172q0 = (C8172q0) abstractC8236x;
            if (c8172q0.f18375c != null && c8172q0.f18375c.m20432a(C7977e.class) != null && (numMo20416a = ((C7977e) ((C8172q0) this.f17958b).f18375c.m20432a(C7977e.class)).mo20416a("close_visible_size_dp")) != null) {
                return numMo20416a.intValue();
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: M */
    public final long mo20589M() {
        int iM20447b;
        AbstractC9087e abstractC9087e;
        int iMin = 5;
        if (this.f21255G == UnitDisplayType.REWARDED) {
            iM20447b = IAConfigManager.f17654M.f17688t.f17862b.m20443a("rewarded_mraid_delay", 31, 30);
            IAlog.m21945a("%sGetting rewarded total delay of %d seconds", IAlog.m21943a(this), Integer.valueOf(iM20447b));
        } else {
            C8040s c8040s = IAConfigManager.f17654M.f17688t;
            if (c8040s == null) {
                iM20447b = 5;
            } else {
                C8021o c8021o = c8040s.f17862b;
                int iM20447b2 = c8021o.m20447b("mraid_x_delay_v2", 5, 0);
                C8015l c8015lM20444a = c8021o.m20444a("int_configuration");
                if (c8015lM20444a != null && c8015lM20444a.f17796a.containsKey("close_d")) {
                    try {
                        iM20447b = c8015lM20444a.f17796a.containsKey("close_d") ? Integer.parseInt((String) c8015lM20444a.f17796a.get("close_d")) : 5;
                    } catch (Throwable unused) {
                    }
                    if (iM20447b < 0 || iM20447b > 30) {
                        iM20447b = 5;
                    }
                    this.f18201t = true;
                } else if (this.f21255G == UnitDisplayType.INTERSTITIAL) {
                    CreativeType creativeType = CreativeType.PLAYABLE;
                    AbstractC8236x abstractC8236x = this.f17958b;
                    if (creativeType.equals((abstractC8236x == null || (abstractC9087e = ((C8172q0) abstractC8236x).f18374b) == null) ? null : ((C9088f) abstractC9087e).f21300J)) {
                        iM20447b = c8021o.m20447b("d_ad_int_pl", iM20447b2, 5);
                    } else {
                        iM20447b = iM20447b2;
                    }
                } else {
                    iM20447b = iM20447b2;
                }
            }
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (m20471A()) {
                Integer numMo20416a = ((C7975c) ((C8172q0) this.f17958b).f18375c.m20432a(C7975c.class)).mo20416a("skip_time_sec");
                int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 5;
                if (iIntValue >= 0 && iIntValue <= 8) {
                    iMin = iIntValue;
                }
            } else {
                iMin = Math.min(iM20447b, 5);
            }
            iM20447b = Math.min(iMin, iM20447b);
        }
        return iM20447b * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: N */
    public final boolean mo20590N() {
        return false;
    }

    /* JADX INFO: renamed from: O */
    public final void m21878O() {
        IAlog.m21945a("%sprovide reward called", IAlog.m21943a(this));
        if (this.f21257I) {
            IAlog.m21945a("%sreward was already provided", IAlog.m21943a(this));
            return;
        }
        IAlog.m21945a("%sreward sent", IAlog.m21943a(this));
        if (this.f21258J != null) {
            EnumC7917a enumC7917a = EnumC7917a.COMPLETION;
            EnumC7919c enumC7919c = EnumC7919c.REWARDED_DISPLAY;
            C7916e c7916e = IAConfigManager.f17654M.f17691w.f17888a;
            if (c7916e != null) {
                AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
            }
            C8060g c8060g = this.f21258J;
            InterfaceC8126i0 interfaceC8126i0 = (InterfaceC8126i0) AbstractC9195v.m22024a(((AbstractC8176s0) c8060g.f17945a).mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = c8060g.f17945a.f17923b;
            if (inneractiveFullScreenAdRewardedListener != null && interfaceC8126i0 != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(interfaceC8126i0);
            }
        }
        IAmraidWebViewController iAmraidWebViewController = this.f21262z;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.f21617D) {
            m20478H();
        }
        this.f21257I = true;
    }

    /* JADX INFO: renamed from: P */
    public final void m21879P() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.f17958b == null || (iAmraidWebViewController = this.f21262z) == null) {
            IAlog.m21945a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        C9248m c9248m = iAmraidWebViewController.f21565b;
        if (c9248m != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            c9248m.setLayoutParams(layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: a */
    public final long mo20591a(long j) {
        if (this.f21255G == UnitDisplayType.REWARDED) {
            return 0L;
        }
        if (this.f18201t) {
            return j;
        }
        long j2 = 13;
        try {
            j2 = Long.parseLong(IAConfigManager.f17654M.f17688t.f17862b.m20445a("mraid_x_fallback_delay", Long.toString(13L)));
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20666a() {
        m21879P();
    }

    @Override // com.fyber.inneractive.sdk.rtb.watermark.InterfaceC9110a
    /* JADX INFO: renamed from: a */
    public final void mo21880a(FrameLayout frameLayout) {
        IAmraidWebViewController iAmraidWebViewController = this.f21262z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.m22069a(frameLayout, EnumC8279d.Watermark);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20667a(C8060g c8060g) {
        this.f21258J = c8060g;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20593a(InterfaceC8264e interfaceC8264e, Activity activity) throws InneractiveUnitController.AdDisplayError {
        InterfaceC8041s0 interfaceC8041s0;
        super.mo20593a(interfaceC8264e, activity);
        AbstractC8236x abstractC8236x = this.f17958b;
        C8016l0 c8016l0 = (abstractC8236x == null || (interfaceC8041s0 = ((C8172q0) abstractC8236x).f18376d) == null) ? null : ((C8028r0) interfaceC8041s0).f17813c;
        if (c8016l0 == null) {
            IAlog.m21950f("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.m21943a(this));
            throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        IAmraidWebViewController iAmraidWebViewController = abstractC8236x != null ? ((C8172q0) abstractC8236x).f18206i : null;
        this.f21262z = iAmraidWebViewController;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f21565b == null) {
            IAlog.m21950f("%sWeb view controller content is not valid. Web view might have crashed", IAlog.m21943a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        ((C8172q0) abstractC8236x).mo20637e();
        this.f21255G = c8016l0.f17798b;
        this.f21249A = false;
        this.f21250B = false;
        this.f21259K = new C9199b(this.f17957a);
        this.f18192k = interfaceC8264e;
        if (this.f21262z == null) {
            IAlog.m21950f("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f17958b);
            return;
        }
        View closeButton = interfaceC8264e.getCloseButton();
        if (closeButton != null) {
            this.f21262z.m22069a(closeButton, EnumC8279d.CloseButton);
        }
        C9088f c9088f = (C9088f) ((C8172q0) this.f17958b).f18374b;
        int i = c9088f.f21305e;
        int i2 = c9088f.f21306f;
        boolean z = (i == 300 && i2 == 250) || (i == 600 && i2 == 500);
        this.f21251C = z;
        if (z) {
            this.f21262z.setAdDefaultSize(AbstractC9174o.m21987a(i), AbstractC9174o.m21987a(i2));
        }
        if (this.f21260x == null) {
            this.f21260x = new C9077u(this);
        }
        this.f21262z.setListener(this.f21260x);
        InneractiveAdSpot inneractiveAdSpot = this.f17957a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
            AbstractC8236x adContent = this.f17957a.getAdContent();
            C8121g c8121g = new C8121g(activity, false, adContent.f18373a, adContent.f18374b, adContent.f18375c);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(C7809R.id.ia_identifier_overlay);
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = c8121g.f18072d;
            iFyberAdIdentifier.f21412k = corner;
            iFyberAdIdentifier.mo21932a(viewGroup);
            viewGroup.setVisibility(0);
            this.f21262z.m22069a(viewGroup, EnumC8279d.IdentifierView);
        }
        m21879P();
        IAmraidWebViewController iAmraidWebViewController2 = this.f21262z;
        ViewGroup layout = this.f18192k.getLayout();
        InneractiveAdRequest inneractiveAdRequest = ((C8172q0) this.f17958b).f18373a;
        C9248m c9248m = iAmraidWebViewController2.f21565b;
        if (c9248m != null) {
            layout.addView(c9248m);
            AbstractC9166l0.f21461a.m21982a(layout.getContext(), iAmraidWebViewController2.f21565b, iAmraidWebViewController2);
            C9248m c9248m2 = iAmraidWebViewController2.f21565b;
            if (c9248m2 != null) {
                c9248m2.setTapListener(iAmraidWebViewController2);
            }
        }
        this.f21249A = true;
        if (this.f21255G == UnitDisplayType.REWARDED) {
            C9197v1 c9197v1 = new C9197v1(TimeUnit.SECONDS, IAConfigManager.f17654M.f17688t.f17862b.m20443a("rewarded_mraid_delay", 31, 30));
            this.f21254F = c9197v1;
            c9197v1.f21502e = new C9076t(this);
            c9197v1.f21501d = false;
            c9197v1.f21500c.sendEmptyMessage(1932593528);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: b */
    public final void mo20594b(boolean z) {
        if (!mo20585I()) {
            if (z) {
                this.f18203v.m21952a((String) null);
            } else {
                C9132a c9132a = this.f18203v;
                c9132a.f21432d = 0L;
                c9132a.f21433e = 0L;
                c9132a.f21434f = 0L;
                c9132a.f21430b = false;
            }
        }
        InterfaceC8264e interfaceC8264e = this.f18192k;
        if (interfaceC8264e != null) {
            interfaceC8264e.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20596b(AbstractC8236x abstractC8236x) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: d */
    public final void mo20485d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f21262z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.m22069a(view, EnumC8279d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        InneractiveUnitController.EventsListener eventsListener;
        if (this.f21249A && !this.f21250B && (eventsListener = this.f17959c) != null) {
            this.f21250B = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f17957a);
        }
        this.f21260x = null;
        C9197v1 c9197v1 = this.f21254F;
        if (c9197v1 != null) {
            c9197v1.f21502e = null;
            this.f21254F = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: e */
    public final void mo20486e(View view) {
        AbstractC8280e abstractC8280e;
        IAmraidWebViewController iAmraidWebViewController = this.f21262z;
        if (iAmraidWebViewController == null || (abstractC8280e = iAmraidWebViewController.f21622I) == null) {
            return;
        }
        try {
            AdSession adSession = abstractC8280e.f18458a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: k */
    public final void mo20668k() {
        C8006r c8006r;
        InneractiveUnitController.EventsListener eventsListener;
        if (this.f21255G == UnitDisplayType.REWARDED && this.f21256H) {
            m21878O();
        }
        if (!this.f21250B && (eventsListener = this.f17959c) != null) {
            this.f21250B = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f17957a);
        }
        C9199b c9199b = this.f21259K;
        if (c9199b != null && c9199b.f21506c != 0) {
            String strM21958a = AbstractC9139c0.m21958a(System.currentTimeMillis(), c9199b.f21506c, c9199b.f21508e);
            InneractiveAdSpot inneractiveAdSpot = c9199b.f21505b;
            AbstractC8236x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            EnumC8424u enumC8424u = EnumC8424u.INTERSTITIAL_VIEW_TIME;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f18373a : null;
            AbstractC9087e abstractC9087e = adContent != null ? adContent.f18374b : null;
            JSONArray jSONArrayM20435b = (adContent == null || (c8006r = adContent.f18375c) == null) ? null : c8006r.m20435b();
            C8428w c8428w = new C8428w(abstractC9087e);
            c8428w.f18755c = enumC8424u;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArrayM20435b;
            c8428w.m20807a("time", strM21958a);
            c8428w.m20808a((String) null);
            c9199b.f21506c = 0L;
            c9199b.f21507d = 0L;
            c9199b.f21508e = 0L;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f17957a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof InterfaceC8126i0)) {
            return;
        }
        ((InterfaceC8126i0) inneractiveAdSpot2).mo20544a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: m */
    public final void mo20669m() {
        C9197v1 c9197v1;
        C9197v1 c9197v2 = this.f18194m;
        if (c9197v2 != null) {
            c9197v2.f21501d = false;
            c9197v2.m22035a(SystemClock.uptimeMillis());
        }
        C9197v1 c9197v3 = this.f18196o;
        if (c9197v3 != null) {
            c9197v3.f21501d = false;
            c9197v3.m22035a(SystemClock.uptimeMillis());
        }
        if (this.f21255G == UnitDisplayType.REWARDED && (c9197v1 = this.f21254F) != null) {
            c9197v1.f21501d = false;
            c9197v1.m22035a(SystemClock.uptimeMillis());
        }
        C9199b c9199b = this.f21259K;
        if (c9199b != null) {
            if (c9199b.f21506c == 0) {
                c9199b.f21506c = System.currentTimeMillis();
            }
            if (c9199b.f21507d > 0) {
                c9199b.f21508e += System.currentTimeMillis() - c9199b.f21507d;
                c9199b.f21507d = 0L;
            }
        }
        this.f18203v.m21951a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: r */
    public final void mo20670r() {
        C9197v1 c9197v1;
        C9197v1 c9197v2 = this.f18194m;
        if (c9197v2 != null) {
            c9197v2.f21501d = true;
            HandlerC9191t1 handlerC9191t1 = c9197v2.f21500c;
            if (handlerC9191t1 != null) {
                handlerC9191t1.removeMessages(1932593528);
            }
        }
        C9197v1 c9197v3 = this.f18196o;
        if (c9197v3 != null) {
            c9197v3.f21501d = true;
            HandlerC9191t1 handlerC9191t2 = c9197v3.f21500c;
            if (handlerC9191t2 != null) {
                handlerC9191t2.removeMessages(1932593528);
            }
        }
        if (this.f21255G == UnitDisplayType.REWARDED && (c9197v1 = this.f21254F) != null) {
            c9197v1.f21501d = true;
            HandlerC9191t1 handlerC9191t3 = c9197v1.f21500c;
            if (handlerC9191t3 != null) {
                handlerC9191t3.removeMessages(1932593528);
            }
        }
        C9199b c9199b = this.f21259K;
        if (c9199b != null) {
            c9199b.f21507d = System.currentTimeMillis();
        }
        C9132a c9132a = this.f18203v;
        if (c9132a.f21430b && c9132a.f21433e == 0) {
            c9132a.f21433e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: u */
    public final boolean mo20671u() {
        boolean z;
        if (this.f18192k == null) {
            z = true;
        } else if (this.f21255G == UnitDisplayType.REWARDED) {
            if (this.f21256H) {
                m21878O();
            }
            z = this.f21256H;
        } else {
            z = this.f18197p;
        }
        if (!z) {
            return true;
        }
        InterfaceC8264e interfaceC8264e = this.f18192k;
        if (interfaceC8264e == null) {
            return false;
        }
        interfaceC8264e.dismissAd(true);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: w */
    public final Context mo20490w() {
        IAmraidWebViewController iAmraidWebViewController = this.f21262z;
        return m20483c(iAmraidWebViewController != null ? iAmraidWebViewController.f21565b : null);
    }
}
