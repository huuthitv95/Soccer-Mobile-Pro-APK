package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lv */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7216lv extends AbstractC5482Jb {
    public static byte[] A01;
    public static String[] A02 = {"llfHvvp5w7AsdcfCf5e", "amqCmPcUyTwYr5NdTloeCtiw", "0NAIhycYLxj75", "dj34azdkZPKXRKaV6TbpL4Sg", "ijcAEj6S85lKiCQyoflHjypUMqTEGqRn", "eY0hdp8", "jqGnWXF3Z8AkxtecEpgwxV1mUEmkJWKs", "4zwbE0EN4gXO5y3Vp0p"};
    public static final byte[] A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-1, 19, 2, 7, Ascii.f22490CR, -51, Ascii.f22490CR, Ascii.f22500SO, 19, 17};
    }

    static {
        A01();
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
        A03 = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    }

    public static boolean A02(C45944v c45944v) {
        return A03(c45944v, A04);
    }

    public static boolean A03(C45944v c45944v, byte[] bArr) {
        if (c45944v.A07() < bArr.length) {
            return false;
        }
        int iA09 = c45944v.A09();
        int startPosition = bArr.length;
        byte[] header = new byte[startPosition];
        int startPosition2 = bArr.length;
        c45944v.A0k(header, 0, startPosition2);
        c45944v.A0f(iA09);
        return Arrays.equals(header, bArr);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    public final long A09(C45944v c45944v) {
        return A06(AbstractC5351HT.A05(c45944v.A0l()));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5482Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public final boolean A0C(C45944v c45944v, long j, C5481Ja c5481Ja) throws C44963K {
        if (A03(c45944v, A04)) {
            byte[] headerBytes = Arrays.copyOf(c45944v.A0l(), c45944v.A0A());
            int iA01 = AbstractC5351HT.A01(headerBytes);
            List<byte[]> listA06 = AbstractC5351HT.A06(headerBytes);
            if (c5481Ja.A00 != null) {
                return true;
            }
            c5481Ja.A00 = new C44672p().A11(A00(0, 10, 33)).A0b(iA01).A0m(48000).A12(listA06).A14();
            return true;
        }
        if (A03(c45944v, A03)) {
            AbstractC45353y.A02(c5481Ja.A00);
            if (this.A00) {
                return true;
            }
            this.A00 = true;
            c45944v.A0g(A03.length);
            C5365Hh commentHeader = AbstractC5368Hk.A05(c45944v, false, false);
            Metadata metadataA02 = AbstractC5368Hk.A02(MetaExoPlayerCustomizedCollections.A02(commentHeader.A02));
            if (metadataA02 == null) {
                return true;
            }
            C44672p c44672pA07 = c5481Ja.A00.A07();
            String[] strArr = A02;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "80vtnZ0VGuLh5BtNytGnkcmL";
            strArr2[1] = "kfnMkjsOg47yHVBMKsSTRfGb";
            c5481Ja.A00 = c44672pA07.A0v(metadataA02.A04(c5481Ja.A00.A0P)).A14();
            return true;
        }
        AbstractC45353y.A02(c5481Ja.A00);
        return false;
    }
}
