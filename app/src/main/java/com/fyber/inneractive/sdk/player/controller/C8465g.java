package com.fyber.inneractive.sdk.player.controller;

import android.media.AudioManager;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.fyber.inneractive.sdk.config.C8015l;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7975c;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.config.global.features.EnumC7993u;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8190b;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8465g extends AbstractC8485z implements InterfaceC8190b {

    /* JADX INFO: renamed from: A */
    public boolean f18853A;

    /* JADX INFO: renamed from: B */
    public final boolean f18854B;

    /* JADX INFO: renamed from: z */
    public final boolean f18855z;

    public C8465g(AbstractC8846f abstractC8846f, AbstractC8902s abstractC8902s, InterfaceC8041s0 interfaceC8041s0, C8006r c8006r, boolean z, boolean z2, String str) {
        C8178b c8178b;
        super(abstractC8846f, abstractC8902s, interfaceC8041s0, c8006r, z, str);
        this.f18855z = false;
        this.f18853A = false;
        AbstractC8846f abstractC8846f2 = this.f18897a;
        if (abstractC8846f2 != null && (c8178b = ((C8870n) abstractC8846f2).f20840v) != null) {
            c8178b.f18215e = this;
        }
        this.f18855z = false;
        this.f18854B = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: A */
    public final boolean mo20873A() {
        return !this.f18855z;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: E */
    public final void mo20874E() {
        AbstractC8476q abstractC8476q;
        super.mo20874E();
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null || abstractC8476q.f18871e != EnumC8489b.Completed || !this.f18855z) {
            return;
        }
        this.f18900d.mo21452m();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n
    /* JADX INFO: renamed from: a */
    public final void mo20875a() {
        if (!this.f18904h) {
            mo20877f();
            return;
        }
        if (this.f18900d.mo21459c()) {
            return;
        }
        this.f18900d.mo21435a(false);
        Runnable runnable = this.f18906j;
        if (runnable != null) {
            this.f18900d.removeCallbacks(runnable);
            this.f18906j = null;
        }
        mo20874E();
        m20930D();
        this.f18907k = false;
        this.f18904h = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8190b
    /* JADX INFO: renamed from: a */
    public final void mo20603a(C9152g1 c9152g1) {
        m20932a(11, c9152g1);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n
    /* JADX INFO: renamed from: a */
    public final void mo20876a(boolean z) {
        m20941e(z);
        super.mo20876a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: b */
    public final void mo20862b(C9152g1 c9152g1) {
        AbstractC8902s abstractC8902s;
        TapAction tapAction = ((C8028r0) this.f18898b).f17816f.f17875i;
        if (tapAction == TapAction.CTR) {
            m20936a(false, VideoClickOrigin.VIDEO, c9152g1);
            return;
        }
        if (tapAction != TapAction.FULLSCREEN && tapAction != TapAction.DO_NOTHING) {
            IAlog.m21945a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m21943a(this), tapAction);
            return;
        }
        if (((C7994v) this.f18899c.m20432a(C7994v.class)).m20427c().equals(EnumC7993u.OPEN) || ((this.f18916t != EnumC8253m.NONE && IAConfigManager.f17654M.f17660D.m20650n()) || ((abstractC8902s = this.f18900d) != null && abstractC8902s.mo21427b()))) {
            m20936a(false, VideoClickOrigin.VIDEO, c9152g1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z, com.fyber.inneractive.sdk.player.controller.InterfaceC8455b
    /* JADX INFO: renamed from: b */
    public final void mo20852b(boolean z) {
        super.mo20852b(z);
        if (this.f18855z) {
            this.f18900d.mo21452m();
            this.f18900d.mo21446g(false);
            this.f18902f = 0;
        }
        mo20857C();
        this.f18900d.mo21443e(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: f */
    public final void mo20877f() {
        int ringerMode;
        int streamVolume;
        super.mo20877f();
        AbstractC8846f abstractC8846f = this.f18897a;
        if (abstractC8846f != null && abstractC8846f.f20772a != null && !this.f18853A) {
            try {
                AudioManager audioManager = (AudioManager) this.f18900d.getContext().getSystemService("audio");
                ringerMode = audioManager.getRingerMode();
                try {
                    streamVolume = audioManager.getStreamVolume(2);
                } catch (Throwable unused) {
                    streamVolume = 0;
                }
            } catch (Throwable unused2) {
                ringerMode = 0;
            }
            if ((!this.f18855z && ((C8028r0) this.f18898b).f17816f.f17870d.booleanValue()) || this.f18854B || m20947p()) {
                m20942f(false);
            } else if (streamVolume > 0 && ringerMode == 2) {
                IAlog.m21945a("%s setting default volume. unmuting player", IAlog.m21943a(this));
                m20943i(false);
            }
            this.f18900d.setMuteButtonState(m20947p());
            this.f18853A = true;
        }
        mo20915h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: i */
    public final int mo20878i() {
        return IAConfigManager.f17654M.f17688t.f17862b.m20443a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: o */
    public final int mo20879o() {
        C7975c c7975c;
        int iIntValue;
        int i;
        C8043t0 c8043t0;
        C8006r c8006r = this.f18899c;
        if (c8006r != null) {
            C7975c c7975c2 = (C7975c) c8006r.m20432a(C7975c.class);
            c7975c2.getClass();
            if (new ArrayList(c7975c2.f17758c.values()).size() > 0) {
                c7975c = (C7975c) this.f18899c.m20432a(C7975c.class);
            } else {
                c7975c = null;
            }
        } else {
            c7975c = null;
        }
        if (c7975c != null) {
            Integer numMo20416a = c7975c.mo20416a("skip_time_sec");
            iIntValue = numMo20416a != null ? numMo20416a.intValue() : 5;
            if (iIntValue < 0 || iIntValue > 8) {
                iIntValue = 5;
            }
        } else {
            iIntValue = -1;
        }
        C8021o c8021o = IAConfigManager.f17654M.f17688t.f17862b;
        InterfaceC8041s0 interfaceC8041s0 = this.f18898b;
        Skip skip = this.f18920x;
        boolean zIsCurrentUserAChild = InneractiveAdManager.isCurrentUserAChild();
        C8015l c8015lM20444a = c8021o.m20444a("vast_configuration");
        c8015lM20444a.getClass();
        try {
            i = c8015lM20444a.f17796a.containsKey("skip_d") ? Integer.parseInt((String) c8015lM20444a.f17796a.get("skip_d")) : -1;
        } catch (Exception unused) {
        }
        int iMax = Math.max(i, -1);
        if (skip == null && interfaceC8041s0 != null && (c8043t0 = ((C8028r0) interfaceC8041s0).f17816f) != null) {
            skip = c8043t0.f17874h;
        }
        if (zIsCurrentUserAChild) {
            if (iIntValue > -1 && iIntValue <= 8) {
                return iIntValue;
            }
            if (iMax <= -1 || iMax > 8) {
                int iIntValue2 = skip.value().intValue();
                if (iIntValue2 <= -1 || iIntValue2 > 8) {
                    return 5;
                }
                return skip.value().intValue();
            }
        } else if (iMax <= -1 || iMax > 5) {
            return skip == Skip.DEFAULT ? DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE : skip.value().intValue();
        }
        return iMax;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: r */
    public final void mo20880r() {
        InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
        if (interfaceC8466g0 != null) {
            interfaceC8466g0.mo20895g();
        }
        this.f18914r = true;
        IAlog.m21945a("%s onBufferingTimeout reached. Skipping to end card", IAlog.m21943a(this));
        if (mo20856B()) {
            mo20864g(false);
        } else {
            m20940d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: t */
    public final void mo20881t() {
        InterfaceC8466g0 interfaceC8466g0 = this.f18903g;
        if (interfaceC8466g0 != null) {
            interfaceC8466g0.mo20897i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: v */
    public final void mo20882v() {
        this.f18900d.mo21446g(true);
        mo20857C();
        mo20865h();
        mo20877f();
        mo20915h(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.AbstractC8485z
    /* JADX INFO: renamed from: x */
    public final void mo20883x() {
        super.mo20883x();
        if (this.f18855z) {
            this.f18900d.mo21452m();
        }
    }
}
