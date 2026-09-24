package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9n */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48799n extends AbstractC7327nv implements InterfaceC5093DI {
    public long A00;
    public InterfaceC46545t A01;
    public InterfaceC7153ku<InterfaceExecutorC5236Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C448032 A07;
    public final C7461q7 A08;
    public final InterfaceC46335Y A09;
    public final InterfaceC4897A6 A0A;
    public final InterfaceC5087DC A0B;
    public final InterfaceC5214FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C48799n(C7461q7 c7461q7, InterfaceC46335Y interfaceC46335Y, InterfaceC5087DC interfaceC5087DC, InterfaceC4897A6 interfaceC4897A6, InterfaceC5214FF interfaceC5214FF, int i, InterfaceC7153ku<InterfaceExecutorC5236Fb> interfaceC7153ku) {
        this.A07 = (C448032) AbstractC45353y.A01(c7461q7.A03);
        this.A08 = c7461q7;
        this.A09 = interfaceC46335Y;
        this.A0B = interfaceC5087DC;
        this.A0A = interfaceC4897A6 == null ? InterfaceC4897A6.A00 : interfaceC4897A6;
        this.A0C = interfaceC5214FF;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC7153ku;
    }

    private void A00() {
        final Timeline c48789m = new C48789m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new AbstractC48859t(c48789m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.facebook.ads.redexgen.core.AbstractC48859t, com.facebook.ads.androidx.media3.common.Timeline
                public final C7439pl A0I(int i, C7439pl c7439pl, boolean z) {
                    super.A0I(i, c7439pl, z);
                    c7439pl.A05 = true;
                    return c7439pl;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC48859t, com.facebook.ads.androidx.media3.common.Timeline
                public final C7437pj A0L(int i, C7437pj c7437pj, long j) {
                    super.A0L(i, c7437pj, j);
                    c7437pj.A0F = true;
                    return c7437pj;
                }
            };
            c48789m = timeline;
        }
        A05(c48789m);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7327nv
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7327nv
    public final void A0A(InterfaceC46545t interfaceC46545t) {
        this.A01 = interfaceC46545t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC45353y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5072Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC7321np A5W(C7320no c7320no, InterfaceC5199F0 interfaceC5199F0, long j) {
        InterfaceExecutorC5236Fb interfaceExecutorC5236Fb;
        InterfaceC7408pF interfaceC7408pFA5I = this.A09.A5I();
        if (this.A01 != null) {
            interfaceC7408pFA5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC5088DD interfaceC5088DDA5X = this.A0B.A5X(C48098O.A03);
        InterfaceC4897A6 interfaceC4897A6 = this.A0A;
        C4892A1 c4892a1A01 = A01(c7320no);
        InterfaceC5214FF interfaceC5214FF = this.A0C;
        C5083D8 c5083d8A02 = A02(c7320no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC5236Fb = this.A02.get();
        } else {
            interfaceExecutorC5236Fb = null;
        }
        return new C48819p(uri, interfaceC7408pFA5I, interfaceC5088DDA5X, interfaceC4897A6, c4892a1A01, interfaceC5214FF, c5083d8A02, this, interfaceC5199F0, str, i, interfaceExecutorC5236Fb);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5072Cx
    public final void ACT() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5093DI
    public final void AG0(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5072Cx
    public final void AHk(InterfaceC7321np interfaceC7321np) {
        ((C48819p) interfaceC7321np).A0a();
    }
}
