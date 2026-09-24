package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5285GP {
    public final Handler A00;
    public final InterfaceC5286GQ A01;

    public C5285GP(Handler handler, InterfaceC5286GQ interfaceC5286GQ) {
        this.A00 = interfaceC5286GQ != null ? (Handler) AbstractC45353y.A01(handler) : null;
        this.A01 = interfaceC5286GQ;
    }

    public final void A00(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GL
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A02(i, j);
                }
            });
        }
    }

    public final void A01(final int i, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GC
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A03(i, j);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j) {
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).ADU(i, j);
    }

    public final /* synthetic */ void A03(int i, long j) {
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).ADl(i, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i, C7472qI c7472qI) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC5284GO(this, i, c7472qI));
        }
    }

    public final void A05(final C7472qI c7472qI, final C46826L c46826l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GI
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c7472qI, c46826l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C7472qI c7472qI, C46826L c46826l) {
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).AGU(c7472qI);
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).AGV(c7472qI, c46826l);
    }

    public final void A07(final C7425pW c7425pW) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GK
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(c7425pW);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C7425pW c7425pW) {
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).AGb(c7425pW);
    }

    public final void A09(final C46796I c46796i) {
        c46796i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GM
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0B(c46796i);
                }
            });
        }
    }

    public final void A0A(final C46796I c46796i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GG
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0C(c46796i);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C46796I c46796i) {
        c46796i.A02();
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).AGO(c46796i);
    }

    public final /* synthetic */ void A0C(C46796I c46796i) {
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).AGP(c46796i);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GH
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0E(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j) {
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).AFf(obj, j);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GJ
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GF
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j2) {
        ((InterfaceC5286GQ) AbstractC46115C.A0f(this.A01)).AGN(str, j, j2);
    }
}
