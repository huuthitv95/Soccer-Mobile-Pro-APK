package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.measurement.C8272f;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8475p;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.player.mediaplayer.C8868o;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8872p implements InterfaceC8475p {

    /* JADX INFO: renamed from: a */
    public final C8272f f20843a;

    /* JADX INFO: renamed from: b */
    public boolean f20844b = false;

    /* JADX INFO: renamed from: c */
    public boolean f20845c = false;

    /* JADX INFO: renamed from: d */
    public boolean f20846d = false;

    public C8872p(C8272f c8272f) {
        this.f20843a = c8272f;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: a */
    public final void mo20901a(EnumC8489b enumC8489b) {
        IAlog.m21945a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", enumC8489b, String.valueOf(this.f20844b), String.valueOf(this.f20846d));
        if (this.f20843a != null) {
            int i = AbstractC8871o.f20842a[enumC8489b.ordinal()];
            if (i == 1) {
                this.f20846d = true;
                return;
            }
            if (i == 2) {
                if (this.f20846d) {
                    C8272f c8272f = this.f20843a;
                    if (c8272f.f18444c != null) {
                        IAlog.m21945a("%s bufferStart", "OMVideo");
                        try {
                            c8272f.f18444c.bufferStart();
                        } catch (Throwable th) {
                            c8272f.m20675a(th);
                        }
                    }
                    this.f20844b = true;
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    C8272f c8272f2 = this.f20843a;
                    if (c8272f2.f18444c != null) {
                        IAlog.m21945a("%s pause", "OMVideo");
                        try {
                            c8272f2.f18444c.pause();
                        } catch (Throwable th2) {
                            c8272f2.m20675a(th2);
                        }
                    }
                    this.f20845c = true;
                    return;
                }
                if (i != 5) {
                    return;
                }
                C8272f c8272f3 = this.f20843a;
                if (c8272f3.f18444c != null) {
                    IAlog.m21945a("%s complete", "OMVideo");
                    try {
                        c8272f3.f18444c.complete();
                        return;
                    } catch (Throwable th3) {
                        c8272f3.m20675a(th3);
                        return;
                    }
                }
                return;
            }
            if (this.f20844b) {
                this.f20844b = false;
                C8272f c8272f4 = this.f20843a;
                if (c8272f4.f18444c != null) {
                    IAlog.m21945a("%s bufferEnd", "OMVideo");
                    try {
                        c8272f4.f18444c.bufferFinish();
                        return;
                    } catch (Throwable th4) {
                        c8272f4.m20675a(th4);
                        return;
                    }
                }
                return;
            }
            if (this.f20845c) {
                C8272f c8272f5 = this.f20843a;
                if (c8272f5.f18444c != null) {
                    IAlog.m21945a("%s resume", "OMVideo");
                    try {
                        c8272f5.f18444c.resume();
                    } catch (Throwable th5) {
                        c8272f5.m20675a(th5);
                    }
                }
                this.f20845c = false;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: a */
    public final void mo20902a(C8868o c8868o) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: c */
    public final void mo20903c(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC8475p
    /* JADX INFO: renamed from: d */
    public final void mo20904d() {
    }
}
