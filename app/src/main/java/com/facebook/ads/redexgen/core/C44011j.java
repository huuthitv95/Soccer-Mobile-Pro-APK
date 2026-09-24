package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1j */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C44011j extends AbstractC4917AQ {
    public static byte[] A04;
    public static String[] A05 = {"EpUFNdKyF", "ElnVCWkanZ28CNZmVbXI8Cgdfk8l0", "X39VUuGfeiZ7XA2vCr", "EABpQNGHZAa4ZPAJBF04BZM7WLurFTC9", "chwMXTauvlPIh4ZEXg6aw7fxDLbtX6Fs", "XZGBORnRKKQlpHrvvOBFjnqbRPoZpqW4", "uC2aRCtD", "rZqfEylCjzpizgmEVXgae15ipmvYBT3W"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {99, 108, 105, 96, 86, 119, 102, 87, 96, 100, 97, 74, 117, 96, 107, 111, 96, 101, 108, 90, 123, 106, 91, 108, 104, 109, 91, 72, 79, 47, 36, 35, 56, 113, 57, 48, 34, 113, 32, 36, 52, 35, 40, 113, 48, 63, 53, 126, 62, 35, 113, 55, 35, 48, 54, 60, 52, 63, 37, 125, 113, 38, 57, 56, 50, 57, 113, 48, 35, 52, 113, 63, 62, 37, 113, 34, 36, 33, 33, 62, 35, 37, 52, 53, 127, 113, Ascii.NAK, 56, 53, 113, 40, 62, 36, 113, 50, 48, Base64.padSymbol, Base64.padSymbol, 113, 4, 35, 56, 127, 33, 48, 35, 34, 52, 121, 120, 113, 62, 63, 113, 48, 113, 34, 37, 35, 56, 63, 54, 113, 50, 62, 63, 37, 48, 56, 63, 56, 63, 54, 113, 118, 110, 118, 113, 62, 35, 113, 118, 114, 118, 110, 113, 4, 34, 52, 113, 4, 35, 56, 127, 55, 35, 62, 60, Ascii.ETB, 56, Base64.padSymbol, 52, 121, 63, 52, 38, 113, Ascii.ETB, 56, Base64.padSymbol, 52, 121, 33, 48, 37, 57, 120, 120, 113, 37, 62, 113, 48, 39, 62, 56, 53, 113, 37, 57, 56, 34, 127, 113, 33, 48, 37, 57, 108, 116, 34, 125, 32, 36, 52, 35, 40, 108, 116, 34, 125, 55, 35, 48, 54, 60, 52, 63, 37, 108, 116, 34};
        String[] strArr = A05;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[3] = "X0VoZl0WlZuonvRnqv5GR18rztIlLTBl";
        strArr2[7] = "XOIDFuTAWw0P55lYRHi5z3HfEt22MTH0";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AGi(C46435i c46435i) throws C7403pA {
        AbstractC460354.A02(A01(0, 15, 71));
        Uri uri = c46435i.A06;
        this.A01 = uri;
        A0G(c46435i);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(c46435i.A04);
                this.A00 = c46435i.A03 == -1 ? this.A02.length() - c46435i.A04 : c46435i.A03;
                AbstractC460354.A00();
                if (this.A00 < 0) {
                    throw new C7403pA(null, null, 2008);
                }
                this.A03 = true;
                A0H(c46435i);
                long j = this.A00;
                if (A05[1].length() == 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[0] = "xa7zJISj9";
                strArr[2] = "YSvWE2PgVF009LXgrm";
                return j;
            } catch (IOException e) {
                throw new C7403pA(e, 2000);
            }
        } catch (Throwable th) {
            AbstractC460354.A00();
            throw th;
        }
    }

    static {
        A02();
    }

    public C44011j() {
        super(false);
    }

    public static RandomAccessFile A00(Uri uri) throws C7403pA {
        try {
            return new RandomAccessFile((String) AbstractC45353y.A01(uri.getPath()), A01(29, 1, 31));
        } catch (FileNotFoundException e) {
            boolean zIsEmpty = TextUtils.isEmpty(uri.getQuery());
            String[] strArr = A05;
            if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            A05[1] = "uF4";
            if (zIsEmpty && TextUtils.isEmpty(uri.getFragment())) {
                throw new C7403pA(e, (AbstractC46115C.A02 < 21 || !C46455k.A00(e.getCause())) ? 2005 : 2006);
            }
            throw new C7403pA(String.format(A01(30, 192, 19), uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new C7403pA(e2, 2006);
        } catch (RuntimeException e3) {
            throw new C7403pA(e3, 2000);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final Uri A9P() {
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final void close() throws C7403pA {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                boolean z = this.A03;
                String[] strArr = A05;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[3] = "OaGc5WGUg2QUkWgGCbKJpnMVI4k73TqR";
                strArr2[7] = "7y85lWdOal5lz5BxO7mJ0PPL1NIIxTrt";
                if (z) {
                    this.A03 = false;
                    A0E();
                }
            } catch (IOException e) {
                throw new C7403pA(e, 2000);
            }
        } catch (Throwable th) {
            this.A02 = null;
            boolean z2 = this.A03;
            String[] strArr3 = A05;
            if (strArr3[3].charAt(29) != strArr3[7].charAt(29)) {
                String[] strArr4 = A05;
                strArr4[0] = "Vm3YcALUN";
                strArr4[2] = "c4edS4Kr4EVyTdnKAl";
                if (z2) {
                    this.A03 = false;
                    A0E();
                }
            } else {
                String[] strArr5 = A05;
                strArr5[5] = "xGGiO6aoc87d3bdrOM0514KxVU6xxq2z";
                strArr5[4] = "rL55lenIs2jXGgYduJCww9Rx5eQkWv1P";
                if (z2) {
                    this.A03 = false;
                    A0E();
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC44562c
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i, int i2) throws C7403pA {
        if (i2 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                AbstractC460354.A02(A01(15, 14, 75));
                int i3 = ((RandomAccessFile) AbstractC46115C.A0f(this.A02)).read(bArr, i, (int) Math.min(this.A00, i2));
                AbstractC460354.A00();
                if (i3 > 0) {
                    this.A00 -= (long) i3;
                    A0F(i3);
                }
                return i3;
            } catch (IOException e) {
                throw new C7403pA(e, 2000);
            }
        } catch (Throwable th) {
            AbstractC460354.A00();
            throw th;
        }
    }
}
