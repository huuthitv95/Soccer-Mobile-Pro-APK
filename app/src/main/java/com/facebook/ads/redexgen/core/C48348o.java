package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8o */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48348o {
    public final Handler A00;
    public final InterfaceC48358p A01;

    public C48348o(Handler handler, InterfaceC48358p interfaceC48358p) {
        this.A00 = interfaceC48358p != null ? (Handler) AbstractC45353y.A01(handler) : null;
        this.A01 = interfaceC48358p;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A00(final int i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8a
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A01(final int i, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8e
                @Override // java.lang.Runnable
                public final void run() {
                    this.A03.A02(i, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j, long j2) {
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AD9(i, j, j2);
    }

    public final void A03(final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8f
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A04(j);
                }
            });
        }
    }

    public final /* synthetic */ void A04(long j) {
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AD5(j);
    }

    public final void A05(final C7472qI c7472qI, final C46826L c46826l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8j
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c7472qI, c46826l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C7472qI c7472qI, C46826L c46826l) {
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AD3(c7472qI);
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AD4(c7472qI, c46826l);
    }

    public final void A07(final C46796I c46796i) {
        c46796i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8h
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A09(c46796i);
                }
            });
        }
    }

    public final void A08(final C46796I c46796i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8n
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0A(c46796i);
                }
            });
        }
    }

    public final /* synthetic */ void A09(C46796I c46796i) {
        c46796i.A02();
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AD1(c46796i);
    }

    public final /* synthetic */ void A0A(C46796I c46796i) {
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AD2(c46796i);
    }

    public final void A0B(final C48368r c48368r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8d
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0C(final C48368r c48368r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Z
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0D(final Exception exc) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8g
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0E(exc);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Exception exc) {
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AD6(exc);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8k
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Y
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j, long j2) {
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AD0(str, j, j2);
    }

    public final void A0I(final boolean z) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8c
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0J(z);
                }
            });
        }
    }

    public final /* synthetic */ void A0J(boolean z) {
        ((InterfaceC48358p) AbstractC46115C.A0f(this.A01)).AFy(z);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0K(final byte[] bArr, final long j) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8l
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
