package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.D8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5083D8 {
    public final int A00;
    public final C7320no A01;
    public final long A02;
    public final CopyOnWriteArrayList<C5082D7> A03;

    public C5083D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C5083D8(CopyOnWriteArrayList<C5082D7> copyOnWriteArrayList, int i, C7320no c7320no, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c7320no;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA0P = AbstractC46115C.A0P(j);
        if (jA0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final C5065Cq c5065Cq, final C5067Cs c5067Cs, final int i) {
        for (C5082D7 c5082d7 : this.A03) {
            final InterfaceC5084D9 interfaceC5084D9 = c5082d7.A01;
            AbstractC46115C.A1B(c5082d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final C5083D8 A02(int i, C7320no c7320no, long j) {
        return new C5083D8(this.A03, i, c7320no, j);
    }

    public final void A03(int i, C7472qI c7472qI, int i2, Object obj, long j) {
        A0C(new C5067Cs(1, i, c7472qI, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A04(Handler handler, InterfaceC5084D9 interfaceC5084D9) {
        AbstractC45353y.A01(handler);
        AbstractC45353y.A01(interfaceC5084D9);
        this.A03.add(new C5082D7(handler, interfaceC5084D9));
    }

    public final void A05(C5065Cq c5065Cq, int i, int i2, C7472qI c7472qI, int i3, Object obj, long j, long j2) {
        A09(c5065Cq, new C5067Cs(i, i2, c7472qI, i3, obj, A00(j), A00(j2)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(C5065Cq c5065Cq, int i, int i2, C7472qI c7472qI, int i3, Object obj, long j, long j2, int i4) {
        A01(c5065Cq, new C5067Cs(i, i2, c7472qI, i3, obj, A00(j), A00(j2)), i4);
    }

    public final void A07(C5065Cq c5065Cq, int i, int i2, C7472qI c7472qI, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        A0A(c5065Cq, new C5067Cs(i, i2, c7472qI, i3, obj, A00(j), A00(j2)), iOException, z);
    }

    public final void A08(@MetaExoPlayerCustomization C5065Cq c5065Cq, @MetaExoPlayerCustomization int i, int i2, C7472qI c7472qI, int i3, Object obj, long j, long j2, Object obj2, Object obj3) {
        A0B(c5065Cq, new C5067Cs(i, i2, c7472qI, i3, obj, A00(j), A00(j2)), obj2, obj3);
    }

    public final void A09(final C5065Cq c5065Cq, final C5067Cs c5067Cs) {
        for (C5082D7 c5082d7 : this.A03) {
            final InterfaceC5084D9 listener = c5082d7.A01;
            AbstractC46115C.A1B(c5082d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, c5065Cq, c5067Cs);
                }
            });
        }
    }

    public final void A0A(final C5065Cq c5065Cq, final C5067Cs c5067Cs, final IOException iOException, final boolean z) {
        for (C5082D7 c5082d7 : this.A03) {
            final InterfaceC5084D9 interfaceC5084D9 = c5082d7.A01;
            AbstractC46115C.A1B(c5082d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0F(interfaceC5084D9, c5065Cq, c5067Cs, iOException, z);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final C5065Cq c5065Cq, @MetaExoPlayerCustomization final C5067Cs c5067Cs, final Object obj, final Object obj2) {
        for (C5082D7 c5082d7 : this.A03) {
            final InterfaceC5084D9 interfaceC5084D9 = c5082d7.A01;
            AbstractC46115C.A1B(c5082d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(interfaceC5084D9, c5065Cq, c5067Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C5067Cs c5067Cs) {
        for (C5082D7 c5082d7 : this.A03) {
            final InterfaceC5084D9 listener = c5082d7.A01;
            AbstractC46115C.A1B(c5082d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0H(listener, c5067Cs);
                }
            });
        }
    }

    public final void A0D(InterfaceC5084D9 interfaceC5084D9) {
        for (C5082D7 listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == interfaceC5084D9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(InterfaceC5084D9 interfaceC5084D9, C5065Cq c5065Cq, C5067Cs c5067Cs) {
        interfaceC5084D9.AEb(this.A00, this.A01, c5065Cq, c5067Cs);
    }

    public final /* synthetic */ void A0F(InterfaceC5084D9 interfaceC5084D9, C5065Cq c5065Cq, C5067Cs c5067Cs, IOException iOException, boolean z) {
        interfaceC5084D9.AEg(this.A00, this.A01, c5065Cq, c5067Cs, iOException, z);
    }

    public final /* synthetic */ void A0G(InterfaceC5084D9 interfaceC5084D9, C5065Cq c5065Cq, C5067Cs c5067Cs, Object obj, Object obj2) {
        interfaceC5084D9.AEd(this.A00, this.A01, c5065Cq, c5067Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(InterfaceC5084D9 interfaceC5084D9, C5067Cs c5067Cs) {
        interfaceC5084D9.ADk(this.A00, this.A01, c5067Cs);
    }
}
