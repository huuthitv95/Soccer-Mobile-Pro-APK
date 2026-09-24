package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.RunnableC7915d;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7917a;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8051x0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.C8060g;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.AbstractC8170p0;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C9075s extends AbstractC8170p0 implements InterfaceC8466g0 {

    /* JADX INFO: renamed from: x */
    public boolean f21246x = false;

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: I */
    public final boolean mo20585I() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: K */
    public final int mo20587K() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: L */
    public final int mo20588L() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: M */
    public final long mo20589M() {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: N */
    public final boolean mo20590N() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: a */
    public final long mo20591a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20884a(C9152g1 c9152g1, EnumC9150g enumC9150g) {
        InterfaceC8041s0 interfaceC8041s0;
        C8016l0 c8016l0;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null && (interfaceC8041s0 = ((C8219t0) abstractC8236x).f18376d) != null && (c8016l0 = ((C8028r0) interfaceC8041s0).f17813c) != null) {
            UnitDisplayType unitDisplayType = c8016l0.f17798b;
            C8051x0 c8051x0 = IAConfigManager.f17654M.f17691w;
            EnumC7919c enumC7919c = unitDisplayType == UnitDisplayType.REWARDED ? EnumC7919c.REWARDED_VIDEO : EnumC7919c.INTERSTITIAL_VIDEO;
            EnumC7917a enumC7917a = EnumC7917a.CLICK;
            C7916e c7916e = c8051x0.f17888a;
            if (c7916e != null) {
                AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
            }
        }
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20885a(String str, C9152g1 c9152g1, boolean z) {
        return new C9142d0(EnumC9151g0.FAILED, new Exception("No Companion clicked"));
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20666a() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20886a(int i, boolean z) {
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
        if (view == null || view.getContext() == null) {
            return;
        }
        InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
        m20483c(view);
        m20484c(false);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: a */
    public final void mo20667a(C8060g c8060g) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20889a(String str, String str2) {
        IAlog.m21945a(IAlog.m21943a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20890a(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: a */
    public final void mo20891a(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20596b(AbstractC8236x abstractC8236x) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: c */
    public final void mo20892c() {
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8170p0, com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        if (!this.f21246x) {
            mo20668k();
        }
        this.f17958b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: e */
    public final void mo20893e() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: f */
    public final void mo20894f() {
        IAlog.m21945a("%snShownCloseButton", IAlog.m21943a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: g */
    public final void mo20895g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: h */
    public final void mo20896h() {
        m20480a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: i */
    public final void mo20897i() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    /* JADX INFO: renamed from: j */
    public final void mo20898j() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: k */
    public final void mo20668k() {
        this.f21246x = true;
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
        }
        IAlog.m21945a("%sunit controller is null!", IAlog.m21943a(this));
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: m */
    public final void mo20669m() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    public final void onPlayerError() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8466g0
    public final void onProgress(int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: r */
    public final void mo20670r() {
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9125c
    /* JADX INFO: renamed from: t */
    public final void mo20488t() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8265f
    /* JADX INFO: renamed from: u */
    public final boolean mo20671u() {
        return false;
    }
}
