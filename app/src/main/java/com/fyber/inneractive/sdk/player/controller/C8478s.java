package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s;
import com.fyber.inneractive.sdk.renderers.C9073q;
import com.fyber.inneractive.sdk.renderers.C9074r;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.s */
/* JADX INFO: loaded from: classes4.dex */
public class C8478s extends AbstractC8485z {

    /* JADX INFO: renamed from: A */
    public float f18883A;

    /* JADX INFO: renamed from: B */
    public float f18884B;

    /* JADX INFO: renamed from: C */
    public boolean f18885C;

    /* JADX INFO: renamed from: D */
    public boolean f18886D;

    /* JADX INFO: renamed from: E */
    public boolean f18887E;

    /* JADX INFO: renamed from: z */
    public RunnableC8477r f18888z;

    public C8478s(AbstractC8846f abstractC8846f, AbstractC8902s abstractC8902s, C8028r0 c8028r0, C8006r c8006r, boolean z, String str) {
        super(abstractC8846f, abstractC8902s, c8028r0, c8006r, z, str);
        this.f18884B = 0.0f;
        this.f18885C = false;
        this.f18886D = false;
        this.f18887E = false;
        this.f18883A = ((C8028r0) this.f18898b).f17817g.f17880b.intValue() / 100.0f;
        m20912J();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: A */
    public boolean mo20873A() {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public void mo20858F() {
        IAlog.m21945a("%s handle buffering timeout: Skipping to end card", IAlog.m21943a(this));
        if (mo20856B()) {
            mo20864g(false);
        } else {
            m20940d(false);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m20910G() {
        Context context;
        if (this.f18903g == null || this.f18887E) {
            return;
        }
        m20911I();
        super.mo20914g();
        C9073q c9073q = (C9073q) ((InterfaceC8454a0) this.f18903g);
        C9074r c9074r = c9073q.f21234a;
        InneractiveUnitController.EventsListener eventsListener = c9074r.f17959c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdExpanded(c9074r.f17957a);
        }
        C9074r c9074r2 = c9073q.f21234a;
        ViewGroup viewGroup = c9074r2.f21239p;
        if (viewGroup != null && c9074r2.f17957a != null && (context = viewGroup.getContext()) != null) {
            InneractiveAdSpot inneractiveAdSpot = c9073q.f21234a.f17957a;
            Intent intent = new Intent(context, (Class<?>) InneractiveFullscreenAdActivity.class);
            intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                IAlog.m21945a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.m21943a(context), inneractiveAdSpot.getLocalUniqueId());
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                IAlog.m21947c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.m21943a(context));
            }
        }
        IAlog.m21945a("%sopening fullscreen", IAlog.m21943a(this));
        this.f18887E = true;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null) {
            C8870n c8870n = (C8870n) abstractC8846f;
            c8870n.mo21401a(c8870n.f20834p, VideoClickOrigin.InvalidOrigin, EnumC8315x.EVENT_FULLSCREEN, EnumC8315x.EVENT_EXPAND);
        }
    }

    /* JADX INFO: renamed from: H */
    public void mo20859H() {
        AbstractC8846f abstractC8846f;
        AbstractC8476q abstractC8476q;
        AbstractC8902s abstractC8902s;
        if (this.f18884B < this.f18883A || (abstractC8846f = this.f18897a) == null || (abstractC8476q = abstractC8846f.f20772a) == null || abstractC8476q.f18871e == EnumC8489b.Completed || (abstractC8902s = this.f18900d) == null || abstractC8902s.mo21459c() || this.f18897a.f20772a.f18876j == null) {
            return;
        }
        if (((C8028r0) this.f18898b).f17816f.f17867a.booleanValue() || this.f18885C) {
            m20913c(IAConfigManager.f17654M.f17677i.f17789a);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m20911I() {
        if (this.f18888z != null) {
            IAlog.m21945a("%sCancelling play runnable", IAlog.m21943a(this));
            this.f18900d.removeCallbacks(this.f18888z);
            this.f18888z = null;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m20912J() {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null || abstractC8476q.f18880n) {
            return;
        }
        if (((C8028r0) this.f18898b).f17816f.f17870d.booleanValue()) {
            this.f18897a.f20772a.mo20842b(false);
        } else {
            if (m20947p()) {
                return;
            }
            this.f18897a.f20772a.mo20845d(false);
        }
    }

    /* JADX INFO: renamed from: K */
    public void mo20860K() {
        if (((C8028r0) this.f18898b).f17816f.f17875i != TapAction.FULLSCREEN) {
            this.f18900d.mo21453n();
        }
        mo20857C();
    }

    @Override // com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b
    /* JADX INFO: renamed from: a */
    public void mo20861a(float f) {
        AbstractC8476q abstractC8476q;
        this.f18884B = f;
        if (IAlog.f21426a >= 3) {
            IAlog.m21947c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.m21943a(this), Float.valueOf(f), Float.valueOf(this.f18883A), Float.valueOf(1.0f - this.f18883A));
        }
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null) {
            return;
        }
        if (abstractC8476q.f18871e != EnumC8489b.Playing) {
            mo20859H();
            return;
        }
        if (f <= this.f18883A) {
            IAlog.m21949e("%sonVisibilityChanged pausing player", IAlog.m21943a(this));
            if (this.f18897a.f20772a.f18876j != null) {
                this.f18885C = false;
                m20911I();
                super.mo20919z();
                m20942f(false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n
    /* JADX INFO: renamed from: a */
    public final void mo20876a(boolean z) {
        if (z) {
            mo20861a(this.f18884B);
        }
        super.mo20876a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: b */
    public void mo20862b(C9152g1 c9152g1) {
        AbstractC8476q abstractC8476q;
        TapAction tapAction = ((C8028r0) this.f18898b).f17816f.f17875i;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || abstractC8846f.f20772a == null || this.f18884B >= this.f18883A) {
            if (tapAction == TapAction.CTR) {
                m20936a(false, VideoClickOrigin.CTA, c9152g1);
                return;
            }
            if (tapAction == TapAction.FULLSCREEN) {
                m20910G();
                return;
            }
            if (tapAction != TapAction.DO_NOTHING) {
                IAlog.m21945a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m21943a(this), tapAction);
                return;
            }
            if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null) {
                return;
            }
            EnumC8489b enumC8489b = abstractC8476q.f18871e;
            if (enumC8489b == EnumC8489b.Completed || enumC8489b == EnumC8489b.Prepared) {
                abstractC8476q.mo20837a(1, true);
            } else {
                abstractC8476q.mo20850j();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z, com.fyber.inneractive.sdk.player.controller.InterfaceC8455b
    /* JADX INFO: renamed from: b */
    public final void mo20852b(boolean z) {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && (abstractC8476q = abstractC8846f.f20772a) != null && abstractC8476q.f18871e != EnumC8489b.Completed) {
            mo20860K();
        }
        super.mo20852b(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z, com.fyber.inneractive.sdk.player.controller.InterfaceC8455b
    /* JADX INFO: renamed from: b */
    public boolean mo20853b() {
        return !(this instanceof C8458c0);
    }

    /* JADX INFO: renamed from: c */
    public final void m20913c(int i) {
        AbstractC8476q abstractC8476q;
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null || abstractC8476q.f18871e == EnumC8489b.Playing || this.f18888z != null) {
            return;
        }
        IAlog.m21945a("%splayVideo %s", IAlog.m21943a(this), this.f18900d);
        if (i == 0) {
            mo20915h(false);
            return;
        }
        RunnableC8477r runnableC8477r = new RunnableC8477r(this);
        this.f18888z = runnableC8477r;
        this.f18900d.postDelayed(runnableC8477r, i);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z, com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b
    public final void destroy() {
        m20911I();
        this.f18903g = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: f */
    public final void mo20877f() {
        super.mo20877f();
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && abstractC8846f.f20772a != null) {
            IAlog.m21945a("%sconnectToTextureView playing state = %s", IAlog.m21943a(this), this.f18897a.f20772a.f18871e);
            if (this.f18897a.f20772a.mo20872h()) {
                this.f18900d.mo21443e(true ^ this.f18897a.f20778g);
                m20912J();
            }
        }
        mo20861a(this.f18884B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: g */
    public final void mo20914g() {
        m20911I();
        super.mo20914g();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: h */
    public final void mo20915h(boolean z) {
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || abstractC8846f.f20772a == null) {
            return;
        }
        m20912J();
        super.mo20915h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: i */
    public final int mo20878i() {
        return IAConfigManager.f17654M.f17688t.f17862b.m20443a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    /* JADX INFO: renamed from: j */
    public final void m20916j(boolean z) {
        AbstractC8846f abstractC8846f;
        AbstractC8476q abstractC8476q;
        this.f18886D = z;
        if (!z || (abstractC8846f = this.f18897a) == null || (abstractC8476q = abstractC8846f.f20772a) == null || abstractC8476q.f18876j != null || !this.f18900d.f20880e || abstractC8476q.f18871e == EnumC8489b.Completed) {
            return;
        }
        mo20877f();
        mo20861a(this.f18884B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: o */
    public final int mo20879o() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: r */
    public final void mo20880r() {
        IAlog.m21945a("%s onBufferingTimeout reached", IAlog.m21943a(this));
        if (this.f18900d.f20880e) {
            this.f18914r = true;
            mo20858F();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: t */
    public final void mo20881t() {
        m20910G();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: u */
    public final void mo20917u() {
        super.mo20917u();
        m20911I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: v */
    public final void mo20882v() {
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || abstractC8846f.f20772a == null) {
            return;
        }
        mo20877f();
        mo20915h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: w */
    public final void mo20918w() {
        mo20859H();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: x */
    public final void mo20883x() {
        super.mo20883x();
        mo20860K();
        this.f18885C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: z */
    public final void mo20919z() {
        m20911I();
        super.mo20919z();
    }
}
