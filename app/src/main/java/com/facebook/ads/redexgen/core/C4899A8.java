package com.facebook.ads.redexgen.core;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4899A8 implements InterfaceC7376oj {
    public static String[] A09 = {"4o0rkz4sfHeK33SO99B05QXsoRhyQzGZ", "K0gAeF3eD9ckm8sSKGrLnlGwgDvg6cGZ", "7dDhReETm", "uWDgAo3QhNS2SDAVWxvGGUxEzkeXCi8E", "iTLUe92lN", "exEbYNMUNVYj7aZkfWzuIWQ7Xih8easj", "xOp2qsvLijFTZdD02NXuZsLwHYitQrqs", "G4m8GVqXoTOlF678hGe6mWsbCNLG0"};
    public InterfaceC45133b A00;
    public InterfaceC45704X A01;
    public C45764d<InterfaceC479388> A02;
    public boolean A03;
    public final InterfaceC454245 A07;
    public final C7439pl A05 = new C7439pl();
    public final C7437pj A06 = new C7437pj();
    public final C47958A A08 = new C47958A(this.A05);
    public final SparseArray<C479186> A04 = new SparseArray<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.ads.redexgen.X.86] */
    @RequiresNonNull({"player"})
    private final C479186 A03(final Timeline timeline, final int i, C7320no c7320no) {
        final C7320no c7320no2 = c7320no;
        if (timeline.A0N()) {
            c7320no2 = null;
        }
        final long jA6J = this.A07.A6J();
        boolean z = timeline.equals(this.A00.A7g()) && i == this.A00.A7b();
        final long jA04 = 0;
        if (c7320no2 != null && c7320no2.A00()) {
            if (z && this.A00.A7Y() == c7320no2.A00 && this.A00.A7Z() == c7320no2.A01) {
                jA04 = this.A00.A7e();
            }
        } else if (z) {
            jA04 = this.A00.A7T();
            String[] strArr = A09;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A09[6] = "ZwCTxmE9kC93SnFyqUzyIs0NB6ZXsqqf";
        } else {
            jA04 = timeline.A0N() ? 0L : timeline.A0K(i, this.A06).A04();
            String[] strArr2 = A09;
            if (strArr2[3].length() == strArr2[1].length()) {
                A09[6] = "IrjjFtfbEX9d6APA3g1gQ2wngpNkMZh7";
            }
        }
        final C7320no c7320noA06 = this.A08.A06();
        final Timeline timelineA7g = this.A00.A7g();
        final int iA7b = this.A00.A7b();
        final long jA7e = this.A00.A7e();
        final long jA9J = this.A00.A9J();
        return new Object(jA6J, timeline, i, c7320no2, jA04, timelineA7g, iA7b, c7320noA06, jA7e, jA9J) { // from class: com.facebook.ads.redexgen.X.86
            public final int A00;
            public final int A01;
            public final long A02;
            public final long A03;
            public final long A04;
            public final long A05;
            public final Timeline A06;
            public final Timeline A07;
            public final C7320no A08;
            public final C7320no A09;

            {
                this.A04 = jA6J;
                this.A07 = timeline;
                this.A01 = i;
                this.A09 = c7320no2;
                this.A03 = jA04;
                this.A06 = timelineA7g;
                this.A00 = iA7b;
                this.A08 = c7320noA06;
                this.A02 = jA7e;
                this.A05 = jA9J;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C479186 c479186 = (C479186) obj;
                if (this.A04 == c479186.A04 && this.A01 == c479186.A01 && this.A03 == c479186.A03 && this.A00 == c479186.A00 && this.A02 == c479186.A02 && this.A05 == c479186.A05 && AbstractC5025CB.A01(this.A07, c479186.A07) && AbstractC5025CB.A01(this.A09, c479186.A09) && AbstractC5025CB.A01(this.A06, c479186.A06) && AbstractC5025CB.A01(this.A08, c479186.A08)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return AbstractC5025CB.A00(Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05));
            }
        };
    }

    public C4899A8(InterfaceC454245 interfaceC454245) {
        this.A07 = (InterfaceC454245) AbstractC45353y.A01(interfaceC454245);
        this.A02 = new C45764d<>(AbstractC46115C.A0d(), interfaceC454245, new InterfaceC45744b() { // from class: com.facebook.ads.redexgen.X.og
        });
    }

    private final C479186 A00() {
        return A04(this.A08.A06());
    }

    private C479186 A01(int i, C7320no c7320no) {
        AbstractC45353y.A01(this.A00);
        boolean z = true;
        if (c7320no != null) {
            if (this.A08.A05(c7320no) == null) {
                z = false;
            }
            if (z) {
                return A04(c7320no);
            }
            return A03(Timeline.A02, i, c7320no);
        }
        Timeline timelineA7g = this.A00.A7g();
        if (i >= timelineA7g.A07()) {
            z = false;
        }
        if (!z) {
            timelineA7g = Timeline.A02;
        }
        return A03(timelineA7g, i, null);
    }

    private C479186 A02(C7453pz c7453pz) {
        if (c7453pz instanceof C4904AD) {
            C4904AD c4904ad = (C4904AD) c7453pz;
            if (c4904ad.A05 != null) {
                return A04(new C7320no(c4904ad.A05));
            }
        }
        return A00();
    }

    private C479186 A04(C7320no c7320no) {
        Timeline timelineA05;
        AbstractC45353y.A01(this.A00);
        if (c7320no == null) {
            timelineA05 = null;
        } else {
            timelineA05 = this.A08.A05(c7320no);
        }
        if (c7320no == null || timelineA05 == null) {
            int windowIndex = this.A00.A7b();
            Timeline knownTimeline = this.A00.A7g();
            if (!(windowIndex < knownTimeline.A07())) {
                knownTimeline = Timeline.A02;
            }
            return A03(knownTimeline, windowIndex, null);
        }
        return A03(timelineA05, timelineA05.A0J(c7320no.A04, this.A05).A00, c7320no);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsListener> */
    private final void A05(C479186 c479186, int i, InterfaceC45734a<InterfaceC479388> interfaceC45734a) {
        this.A04.put(i, c479186);
        this.A02.A0A(i, interfaceC45734a);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7376oj
    public final void ACe() {
        if (!this.A03) {
            final C479186 c479186A00 = A00();
            this.A03 = true;
            A05(c479186A00, -1, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oe
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45063U
    public final void ADZ(final C7420pR c7420pR) {
        final C479186 c479186A00 = A00();
        A05(c479186A00, 27, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oc
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45063U
    public final void ADa(final List<C7422pT> list) {
        final C479186 c479186A00 = A00();
        A05(c479186A00, 27, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oR
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5084D9
    public final void ADk(int i, C7320no c7320no, final C5067Cs c5067Cs) {
        final C479186 c479186A01 = A01(i, c7320no);
        A05(c479186A01, 1004, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oh
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5084D9
    public final void AEb(int i, C7320no c7320no, final C5065Cq c5065Cq, final C5067Cs c5067Cs) {
        final C479186 c479186A01 = A01(i, c7320no);
        A05(c479186A01, 1002, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.od
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5084D9
    public final void AEd(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C7320no c7320no, final C5065Cq c5065Cq, final C5067Cs c5067Cs, Object obj, Object obj2) {
        final C479186 c479186A01 = A01(i, c7320no);
        A05(c479186A01, 1001, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oT
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5084D9
    public final void AEg(int i, C7320no c7320no, final C5065Cq c5065Cq, final C5067Cs c5067Cs, final IOException iOException, final boolean z) {
        final C479186 c479186A01 = A01(i, c7320no);
        A05(c479186A01, 1003, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oi
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45063U
    public final void AFI(final C7451px c7451px) {
        final C479186 c479186A00 = A00();
        A05(c479186A00, 12, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.ob
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45063U
    public final void AFK(final C7453pz c7453pz) {
        final C479186 c479186A02 = A02(c7453pz);
        A05(c479186A02, 10, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.of
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45063U
    public final void AFM(final boolean z, final int i) {
        final C479186 c479186A00 = A00();
        A05(c479186A00, -1, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oa
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45063U
    public final void AFt() {
        final C479186 c479186A00 = A00();
        A05(c479186A00, -1, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oS
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45063U
    public final void AGA(Timeline timeline, final int i) {
        this.A08.A07((InterfaceC45133b) AbstractC45353y.A01(this.A00));
        final C479186 c479186A00 = A00();
        A05(c479186A00, 0, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oY
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45063U
    public final void AGE(final C7427pY c7427pY) {
        final C479186 c479186A00 = A00();
        A05(c479186A00, 2, new InterfaceC45734a() { // from class: com.facebook.ads.redexgen.X.oW
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7376oj
    public final void AJf(final InterfaceC45133b interfaceC45133b, Looper looper) {
        AbstractC45353y.A08(this.A00 == null || this.A08.A03.isEmpty());
        this.A00 = (InterfaceC45133b) AbstractC45353y.A01(interfaceC45133b);
        this.A01 = this.A07.A5P(looper, null);
        this.A02 = this.A02.A07(looper, new InterfaceC45744b() { // from class: com.facebook.ads.redexgen.X.oZ
        });
    }
}
