package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.measurement.C8272f;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s;
import com.fyber.inneractive.sdk.renderers.C9073q;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.InterfaceC9218b0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.c0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8458c0 extends C8478s {

    /* JADX INFO: renamed from: F */
    public final AtomicBoolean f18826F;

    public C8458c0(AbstractC8846f abstractC8846f, AbstractC8902s abstractC8902s, C8028r0 c8028r0, C8006r c8006r) {
        super(abstractC8846f, abstractC8902s, c8028r0, c8006r, false, null);
        this.f18826F = new AtomicBoolean(false);
        this.f18883A = 0.5f;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: B */
    public final boolean mo20856B() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: C */
    public final void mo20857C() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.C8478s
    /* JADX INFO: renamed from: F */
    public final void mo20858F() {
        C8272f c8272f;
        AbstractC8476q abstractC8476q;
        IAlog.m21945a("%s handle buffering timeout: video paused on last shown frame", IAlog.m21943a(this));
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && (abstractC8476q = abstractC8846f.f20772a) != null) {
            abstractC8476q.m20909k();
            this.f18897a.f20772a.mo20849i();
        }
        AbstractC8846f abstractC8846f2 = this.f18897a;
        if (abstractC8846f2 == null || (c8272f = abstractC8846f2.f20776e) == null || c8272f.f18444c == null) {
            return;
        }
        IAlog.m21945a("%s pause", "OMVideo");
        try {
            c8272f.f18444c.pause();
        } catch (Throwable th) {
            c8272f.m20675a(th);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.C8478s
    /* JADX INFO: renamed from: H */
    public final void mo20859H() {
        AbstractC8902s abstractC8902s;
        AbstractC8846f abstractC8846f = this.f18897a;
        AbstractC8476q abstractC8476q = abstractC8846f != null ? abstractC8846f.f20772a : null;
        if (this.f18884B < this.f18883A || abstractC8476q == null || abstractC8476q.f18871e == EnumC8489b.Completed || abstractC8476q.f18876j == null || (abstractC8902s = this.f18900d) == null || !abstractC8902s.hasWindowFocus()) {
            return;
        }
        m20913c(0);
        m20943i(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.C8478s
    /* JADX INFO: renamed from: K */
    public final void mo20860K() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.C8478s, com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b
    /* JADX INFO: renamed from: a */
    public final void mo20861a(float f) {
        boolean z = f >= 0.01f && this.f18826F.compareAndSet(false, true);
        m20941e(z);
        super.mo20861a(f);
        if (z) {
            IAlog.m21945a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.m21943a(this), Float.valueOf(f * 100.0f));
            ((C9073q) ((InterfaceC8454a0) this.f18903g)).f21234a.mo21862I();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z, com.fyber.inneractive.sdk.player.controller.InterfaceC8455b
    /* JADX INFO: renamed from: a */
    public final void mo20851a(AbstractC8084b abstractC8084b) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.C8478s, com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: b */
    public final void mo20862b(C9152g1 c9152g1) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: e */
    public final boolean mo20863e() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: g */
    public final void mo20864g(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: h */
    public final void mo20865h() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: k */
    public final InterfaceC9218b0 mo20866k() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: n */
    public final C8178b mo20867n() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: s */
    public final void mo20868s() {
    }
}
