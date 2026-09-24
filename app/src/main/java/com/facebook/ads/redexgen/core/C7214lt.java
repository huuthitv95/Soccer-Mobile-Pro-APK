package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7214lt extends AbstractC5482Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", InneractiveMediationDefs.GENDER_MALE, "OXoEHzgO5FTzqO33f", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT};
    public int A00;
    public C5365Hh A01;
    public C5367Hj A02;
    public C5483Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C5483Jc A02(C45944v c45944v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC5368Hk.A06(c45944v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC5368Hk.A04(c45944v);
            return null;
        }
        C5367Hj c5367Hj = this.A02;
        C5365Hh c5365Hh = this.A01;
        byte[] bArr = new byte[c45944v.A0A()];
        System.arraycopy(c45944v.A0l(), 0, bArr, 0, c45944v.A0A());
        C5366Hi[] c5366HiArrA0D = AbstractC5368Hk.A0D(c45944v, c5367Hj.A05);
        return new C5483Jc(c5367Hj, c5365Hh, bArr, c5366HiArrA0D, AbstractC5368Hk.A00(c5366HiArrA0D.length - 1));
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C5483Jc c5483Jc) {
        if (!c5483Jc.A04[A00(b, c5483Jc.A00, 1)].A03) {
            int modeNumber = c5483Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c5483Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C45944v c45944v, long j) {
        if (c45944v.A08() < c45944v.A0A() + 4) {
            c45944v.A0i(Arrays.copyOf(c45944v.A0l(), c45944v.A0A() + 4));
        } else {
            c45944v.A0e(c45944v.A0A() + 4);
        }
        byte[] bArrA0l = c45944v.A0l();
        bArrA0l[c45944v.A0A() - 4] = (byte) (j & 255);
        bArrA0l[c45944v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        bArrA0l[c45944v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        bArrA0l[c45944v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C45944v c45944v) {
        try {
            return AbstractC5368Hk.A0C(1, c45944v, true);
        } catch (C44963K unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    public final long A09(C45944v c45944v) {
        int i = 0;
        if ((c45944v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c45944v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b, (C5483Jc) AbstractC45353y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c45944v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C45944v c45944v, long j, C5481Ja c5481Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC45353y.A01(c5481Ja.A00);
            return false;
        }
        this.A03 = A02(c45944v);
        if (this.A03 == null) {
            return true;
        }
        C5483Jc c5483Jc = this.A03;
        C5367Hj c5367Hj = c5483Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c5367Hj.A09);
        codecInitializationData.add(c5483Jc.A03);
        c5481Ja.A00 = new C44672p().A11(A03(0, 12, 22)).A0a(c5367Hj.A02).A0j(c5367Hj.A00).A0b(c5367Hj.A05).A0m(c5367Hj.A06).A12(codecInitializationData).A0v(AbstractC5368Hk.A02(MetaExoPlayerCustomizedCollections.A02(c5483Jc.A01.A02))).A14();
        return true;
    }
}
