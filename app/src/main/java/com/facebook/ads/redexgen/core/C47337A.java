package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7A */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47337A {
    public static byte[] A0E;
    public static String[] A0F = {"qTjlphzGhjtz23pZpbkrfGV3", "gcvQ0aFRAZsVeDDMvPpq9fmBIR43z3dS", "1g2pSH5s64tGUAh3eJ0e3X43Q9jzw3mq", "lB1M4R9KcDs1NZsKBVQ3JQYLP4RbMvTH", "7AgciWFjZyCuzmH359m88XAJrahqi7eF", "Et2BwvNp", "Oz1eJxJHgMWzrYsZQ0zZlFN1YCxGY3CZ", "Iy7o67ktSbvMBIxm3lxnuK7UTKgUaVFx"};
    public C47347B A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C47337A A04;
    public C7302nW A05 = C7302nW.A06;
    public C5196Ex A06;
    public final InterfaceC7321np A07;
    public final Object A08;
    public final InterfaceC5104DT[] A09;
    public final InterfaceC473279 A0A;
    public final AbstractC5195Ew A0B;
    public final InterfaceC47747p[] A0C;
    public final boolean[] A0D;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{81, 121, 120, 117, 125, 76, 121, 110, 117, 115, 120, 84, 115, 112, 120, 121, 110, Ascii.f22493FS, 41, 62, 37, 35, 40, 108, 62, 41, 32, 41, 45, 63, 41, 108, 42, 45, 37, 32, 41, 40, 98};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C47337A(InterfaceC47747p[] interfaceC47747pArr, long j, AbstractC5195Ew abstractC5195Ew, InterfaceC5199F0 interfaceC5199F0, InterfaceC5072Cx interfaceC5072Cx, C47347B c47347b, C5196Ex c5196Ex) {
        this.A0C = interfaceC47747pArr;
        this.A03 = j - c47347b.A03;
        this.A0B = abstractC5195Ew;
        this.A08 = AbstractC45353y.A01(c47347b.A04.A04);
        this.A00 = c47347b;
        this.A06 = c5196Ex;
        this.A09 = new InterfaceC5104DT[interfaceC47747pArr.length];
        this.A0D = new boolean[interfaceC47747pArr.length];
        this.A0A = new C7382op(this, interfaceC5072Cx);
        this.A07 = A00(c47347b.A04, this.A0A, interfaceC5199F0, c47347b.A03, c47347b.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static InterfaceC7321np A00(C7320no c7320no, InterfaceC473279 interfaceC473279, InterfaceC5199F0 interfaceC5199F0, long j, long j2) {
        InterfaceC7321np interfaceC7321npA5W = interfaceC473279.A5W(c7320no, interfaceC5199F0, j);
        if (j2 != -9223372036854775807L) {
            return new C48869v(interfaceC7321npA5W, true, 0L, j2);
        }
        return interfaceC7321npA5W;
    }

    private void A02() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            InterfaceC7284nE interfaceC7284nE = this.A06.A04[i];
            if (rendererEnabled && interfaceC7284nE != null) {
                interfaceC7284nE.A5x();
            }
        }
    }

    private void A03() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            InterfaceC7284nE interfaceC7284nE = this.A06.A04[i];
            if (rendererEnabled && interfaceC7284nE != null) {
                interfaceC7284nE.A6K();
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(InterfaceC473279 interfaceC473279, InterfaceC7321np interfaceC7321np) {
        try {
            if (interfaceC7321np instanceof C48869v) {
                interfaceC473279.AHk(((C48869v) interfaceC7321np).A05);
            } else {
                interfaceC473279.AHk(interfaceC7321np);
            }
        } catch (RuntimeException e) {
            AbstractC45794g.A08(A01(0, 17, 10), A01(17, 22, 90), e);
        }
    }

    private void A06(InterfaceC5104DT[] interfaceC5104DTArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9N() == -2 && this.A06.A00(i)) {
                interfaceC5104DTArr[i] = new C7323nr();
            }
        }
    }

    private void A07(InterfaceC5104DT[] interfaceC5104DTArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9N() == -2) {
                interfaceC5104DTArr[i] = null;
            }
        }
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long jA78 = this.A01 ? this.A07.A78() : Long.MIN_VALUE;
        return jA78 == Long.MIN_VALUE ? this.A00.A00 : jA78;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8b();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j) {
        return this.A07.A76(j);
    }

    public final long A0D(long j) {
        return j - A0B();
    }

    public final long A0E(long j) {
        return A0B() + j;
    }

    public final long A0F(C5196Ex c5196Ex, long j, boolean z) {
        return A0G(c5196Ex, j, z, new boolean[this.A0C.length]);
    }

    public final long A0G(C5196Ex c5196Ex, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i < c5196Ex.A00) {
                boolean[] zArr2 = this.A0D;
                if (!z) {
                    boolean zA01 = c5196Ex.A01(this.A06, i);
                    if (A0F[5].length() != 8) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[4] = "ZW5cY05fUZ7YDJtoLiROAD1s3u7pqZaY";
                    strArr[3] = "DBvv8TdqbKzS7YgGUgxEKNMIgeBwY4FK";
                    if (zA01) {
                        z2 = true;
                    }
                }
                zArr2[i] = z2;
                i++;
            } else {
                A07(this.A09);
                A02();
                this.A06 = c5196Ex;
                A03();
                long jAJ9 = this.A07.AJ9(c5196Ex.A04, this.A0D, this.A09, zArr, j);
                A06(this.A09);
                this.A01 = false;
                for (int i2 = 0; i2 < this.A09.length; i2++) {
                    if (this.A09[i2] != null) {
                        AbstractC45353y.A08(c5196Ex.A00(i2));
                        if (this.A0C[i2].A9N() != -2) {
                            this.A01 = true;
                        }
                    } else {
                        AbstractC45353y.A08(c5196Ex.A04[i2] == null);
                    }
                }
                return jAJ9;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z) {
        if (!z) {
            return this.A03;
        }
        return this.A00.A03 + this.A03;
    }

    public final C47337A A0I() {
        return this.A04;
    }

    public final C7302nW A0J() {
        return this.A05;
    }

    public final C5196Ex A0K() {
        return this.A06;
    }

    public final C5196Ex A0L(float f, Timeline timeline) throws C4904AD {
        C5196Ex c5196ExA0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (InterfaceC7284nE interfaceC7284nE : c5196ExA0b.A04) {
            if (interfaceC7284nE != null) {
                interfaceC7284nE.AFJ(f);
            }
        }
        return c5196ExA0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f, Timeline timeline) throws C4904AD {
        this.A02 = true;
        this.A05 = this.A07.A9M();
        long jA0F = A0F(A0L(f, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - jA0F;
        this.A00 = this.A00.A00(jA0F);
    }

    public final void A0O(long j) {
        AbstractC45353y.A08(A08());
        this.A07.A5C(A0D(j));
    }

    public final void A0P(long j) {
        AbstractC45353y.A08(A08());
        if (this.A02) {
            this.A07.AHW(A0D(j));
        }
    }

    public final void A0Q(C47337A c47337a) {
        if (c47337a == this.A04) {
            return;
        }
        A02();
        this.A04 = c47337a;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A78() == Long.MIN_VALUE);
    }
}
