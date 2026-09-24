package com.facebook.ads.androidx.media3.extractor.mkv;

import android.net.Uri;
import android.util.SparseArray;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.ads.redexgen.core.AbstractC44522Y;
import com.facebook.ads.redexgen.core.AbstractC45353y;
import com.facebook.ads.redexgen.core.AbstractC45794g;
import com.facebook.ads.redexgen.core.AbstractC46115C;
import com.facebook.ads.redexgen.core.AbstractC5350HS;
import com.facebook.ads.redexgen.core.C44963K;
import com.facebook.ads.redexgen.core.C45804h;
import com.facebook.ads.redexgen.core.C45944v;
import com.facebook.ads.redexgen.core.C5353HV;
import com.facebook.ads.redexgen.core.C5359Hb;
import com.facebook.ads.redexgen.core.C5433Io;
import com.facebook.ads.redexgen.core.C5434Ip;
import com.facebook.ads.redexgen.core.C5435Iq;
import com.facebook.ads.redexgen.core.C7240mK;
import com.facebook.ads.redexgen.core.C7242mM;
import com.facebook.ads.redexgen.core.C7258mn;
import com.facebook.ads.redexgen.core.C7268my;
import com.facebook.ads.redexgen.core.InterfaceC5331H9;
import com.facebook.ads.redexgen.core.InterfaceC5332HA;
import com.facebook.ads.redexgen.core.InterfaceC5335HD;
import com.facebook.ads.redexgen.core.InterfaceC5356HY;
import com.facebook.ads.redexgen.core.InterfaceC5361Hd;
import com.facebook.ads.redexgen.core.InterfaceC5430Il;
import com.facebook.ads.redexgen.core.InterfaceC7263ms;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.FirebaseError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.p300io.encoding.Base64;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class MatroskaExtractor implements InterfaceC5331H9 {
    public static byte[] A0t;
    public static String[] A0u = {"tBqjpPNwSsfRjGbhoSofYeEQJAfxpzeJ", "SQ32k5yHiSqu0tF5bV2mYZI8q27OK2Wk", "Ew8EcvFtYPYsbuW", "MeCkyRYcfoGShRSoQHq7qyLBTkTGcoSQ", "UyV8GtaWyEclMV8OhG", "yLkQb0Xo1O", "PFhexnCJ0GZtqtRWjlJ7uY4w9", "UodjFtXG6f6h7NmMQ857"};
    public static final InterfaceC5335HD A0v;
    public static final Map<String, Integer> A0w;
    public static final UUID A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;

    @MetaExoPlayerCustomization("Removed the final from the member variable")
    public SparseArray<C5433Io> A0P;
    public C45804h A0Q;
    public C45804h A0R;
    public InterfaceC5332HA A0S;
    public C5433Io A0T;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "AR/VC customizations")
    public String A0U;
    public ByteBuffer A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public int[] A0f;
    public final C45944v A0g;
    public final C45944v A0h;
    public final C45944v A0i;
    public final C45944v A0j;
    public final C45944v A0k;
    public final C45944v A0l;
    public final C45944v A0m;
    public final C45944v A0n;
    public final C45944v A0o;
    public final C45944v A0p;
    public final InterfaceC5430Il A0q;
    public final C5435Iq A0r;
    public final boolean A0s;

    /* JADX WARN: Code duplicated, block: B:102:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:104:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:110:0x03be A[LOOP:1: B:108:0x03ba->B:110:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0415  */
    /* JADX WARN: Code duplicated, block: B:131:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x020d A[PHI: r0
  0x020d: PHI (r0v193 byte[]) = (r0v192 byte[]), (r0v208 byte[]) binds: [B:63:0x0209, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0309  */
    /* JADX WARN: Code duplicated, block: B:92:0x0320  */
    /* JADX WARN: Code duplicated, block: B:95:0x0338  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @RequiresNonNull({"#2.output"})
    private int A02(InterfaceC7263ms interfaceC7263ms, C5433Io c5433Io, int i, boolean z) throws IOException {
        int iA0A;
        byte[] bArrA0l;
        int i2;
        int i3;
        String[] strArr;
        String strA06;
        String str;
        String[] strArr2;
        String[] strArr3;
        boolean z2;
        byte[] bArrA0l2;
        if (A06(1012, 11, 56).equals(c5433Io.A0d)) {
            A0F(interfaceC7263ms, A10, i);
            return A00();
        }
        String[] strArr4 = A0u;
        if (strArr4[5].length() != strArr4[6].length()) {
            A0u[3] = "Q42iXR6evmRi7JQ7PxfR7toxYIITwFkY";
            if (A06(1002, 10, 101).equals(c5433Io.A0d)) {
                A0F(interfaceC7263ms, A0z, i);
                return A00();
            }
            if (A06(1023, 13, 32).equals(c5433Io.A0d)) {
                A0F(interfaceC7263ms, A11, i);
                return A00();
            }
            InterfaceC5361Hd interfaceC5361Hd = c5433Io.A0b;
            if (this.A0Y) {
                iA0A = i + this.A0k.A0A();
                if (A06(1207, 15, 14).equals(c5433Io.A0d)) {
                    bArrA0l = this.A0i.A0l();
                    bArrA0l[0] = 0;
                    bArrA0l[1] = 0;
                    bArrA0l[2] = 0;
                    i2 = c5433Io.A0Q;
                    i3 = 4 - c5433Io.A0Q;
                    while (this.A08 < iA0A) {
                        if (this.A0A == 0) {
                            A0G(interfaceC7263ms, bArrA0l, i3, i2);
                            this.A08 += i2;
                            this.A0i.A0f(0);
                            this.A0A = this.A0i.A0L();
                            this.A0j.A0f(0);
                            interfaceC5361Hd.AIr(this.A0j, 4);
                            strArr = A0u;
                            if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                String[] strArr5 = A0u;
                                strArr5[5] = "fro1mi6zSK";
                                strArr5[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                this.A09 += 4;
                            } else {
                                A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                this.A09 += 4;
                            }
                        } else {
                            int iA01 = A01(interfaceC7263ms, interfaceC5361Hd, this.A0A);
                            this.A08 += iA01;
                            this.A09 += iA01;
                            this.A0A -= iA01;
                        }
                    }
                } else {
                    strArr3 = A0u;
                    if (strArr3[2].length() != strArr3[4].length()) {
                        A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                        if (A06(1236, 16, 47).equals(c5433Io.A0d)) {
                            bArrA0l = this.A0i.A0l();
                            bArrA0l[0] = 0;
                            bArrA0l[1] = 0;
                            bArrA0l[2] = 0;
                            i2 = c5433Io.A0Q;
                            i3 = 4 - c5433Io.A0Q;
                            while (this.A08 < iA0A) {
                                if (this.A0A == 0) {
                                    A0G(interfaceC7263ms, bArrA0l, i3, i2);
                                    this.A08 += i2;
                                    this.A0i.A0f(0);
                                    this.A0A = this.A0i.A0L();
                                    this.A0j.A0f(0);
                                    interfaceC5361Hd.AIr(this.A0j, 4);
                                    strArr = A0u;
                                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                        String[] strArr6 = A0u;
                                        strArr6[5] = "fro1mi6zSK";
                                        strArr6[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                        this.A09 += 4;
                                    } else {
                                        A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                        this.A09 += 4;
                                    }
                                } else {
                                    int iA02 = A01(interfaceC7263ms, interfaceC5361Hd, this.A0A);
                                    this.A08 += iA02;
                                    this.A09 += iA02;
                                    this.A0A -= iA02;
                                }
                            }
                        } else {
                            if (c5433Io.A0c != null) {
                                if (this.A0k.A0A() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                AbstractC45353y.A08(z2);
                                c5433Io.A0c.A03(interfaceC7263ms);
                            }
                            while (this.A08 < iA0A) {
                                int iA03 = A01(interfaceC7263ms, interfaceC5361Hd, iA0A - this.A08);
                                this.A08 += iA03;
                                this.A09 += iA03;
                            }
                        }
                    }
                }
                strA06 = A06(271, 8, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
                str = c5433Io.A0d;
                strArr2 = A0u;
                if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                    A0u[3] = "L5Y1ZRMfFWOxp58RZlemSr0Ie3cKRoNn";
                    if (strA06.equals(str)) {
                        this.A0p.A0f(0);
                        interfaceC5361Hd.AIr(this.A0p, 4);
                        this.A09 += 4;
                    }
                } else {
                    String[] strArr7 = A0u;
                    strArr7[2] = "6h0vzYYIjFmBqGs";
                    strArr7[4] = "2CBNjdNTCI84kXMqqr";
                    if (strA06.equals(str)) {
                        this.A0p.A0f(0);
                        interfaceC5361Hd.AIr(this.A0p, 4);
                        this.A09 += 4;
                    }
                }
                return A00();
            }
            if (c5433Io.A0i) {
                this.A02 &= -1073741825;
                int i4 = 128;
                if (!this.A0b) {
                    interfaceC7263ms.readFully(this.A0l.A0l(), 0, 1);
                    this.A08++;
                    if ((this.A0l.A0l()[0] & 128) == 128) {
                        throw C44963K.A01(A06(694, 35, 14), null);
                    }
                    this.A00 = this.A0l.A0l()[0];
                    this.A0b = true;
                }
                if ((this.A00 & 1) == 1) {
                    boolean z3 = (this.A00 & 2) == 2;
                    this.A02 |= 1073741824;
                    if (!this.A0Z) {
                        byte[] bArrA0l3 = this.A0g.A0l();
                        String[] strArr8 = A0u;
                        if (strArr8[1].charAt(1) != strArr8[0].charAt(1)) {
                            String[] strArr9 = A0u;
                            strArr9[5] = "0YZVfaON5K";
                            strArr9[6] = "Vpm73VVBoM5AMHA6BL8GPMDLM";
                            interfaceC7263ms.readFully(bArrA0l3, 0, 8);
                            this.A08 += 8;
                            this.A0Z = true;
                            bArrA0l2 = this.A0l.A0l();
                            if (!z3) {
                                i4 = 0;
                            }
                        } else {
                            interfaceC7263ms.readFully(bArrA0l3, 0, 8);
                            this.A08 += 8;
                            this.A0Z = true;
                            bArrA0l2 = this.A0l.A0l();
                            if (!z3) {
                                i4 = 0;
                            }
                        }
                        bArrA0l2[0] = (byte) (i4 | 8);
                        this.A0l.A0f(0);
                        interfaceC5361Hd.AIs(this.A0l, 1, 1);
                        this.A09++;
                        this.A0g.A0f(0);
                        interfaceC5361Hd.AIs(this.A0g, 8, 1);
                        this.A09 += 8;
                    }
                    if (z3) {
                        boolean z4 = this.A0a;
                        String[] strArr10 = A0u;
                        if (strArr10[5].length() == strArr10[6].length()) {
                            throw new RuntimeException();
                        }
                        A0u[3] = "IbloDRbaqkSTIb2EEG1BJ7I1x09YBoFC";
                        if (!z4) {
                            interfaceC7263ms.readFully(this.A0l.A0l(), 0, 1);
                            this.A08++;
                            this.A0l.A0f(0);
                            this.A0B = this.A0l.A0I();
                            this.A0a = true;
                        }
                        int i5 = this.A0B * 4;
                        this.A0l.A0d(i5);
                        interfaceC7263ms.readFully(this.A0l.A0l(), 0, i5);
                        this.A08 += i5;
                        short s = (short) ((this.A0B / 2) + 1);
                        int i6 = (s * 6) + 2;
                        if (this.A0V == null || this.A0V.capacity() < i6) {
                            this.A0V = ByteBuffer.allocate(i6);
                        }
                        this.A0V.position(0);
                        this.A0V.putShort(s);
                        int iA0L = 0;
                        for (int i7 = 0; i7 < this.A0B; i7++) {
                            int i8 = iA0L;
                            iA0L = this.A0l.A0L();
                            if (i7 % 2 == 0) {
                                ByteBuffer byteBuffer = this.A0V;
                                short s2 = (short) (iA0L - i8);
                                String[] strArr11 = A0u;
                                if (strArr11[5].length() == strArr11[6].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr12 = A0u;
                                strArr12[5] = "ft008TAv7G";
                                strArr12[6] = "haHnc3qulCtaE6iMk670OeuEn";
                                byteBuffer.putShort(s2);
                            } else {
                                ByteBuffer byteBuffer2 = this.A0V;
                                String[] strArr13 = A0u;
                                if (strArr13[2].length() != strArr13[4].length()) {
                                    String[] strArr14 = A0u;
                                    strArr14[2] = "aiG4mSAFtmR28a0";
                                    strArr14[4] = "af0fkPAZLGHpLmON09";
                                    byteBuffer2.putInt(iA0L - i8);
                                }
                            }
                        }
                        int i9 = (i - this.A08) - iA0L;
                        if (this.A0B % 2 == 1) {
                            this.A0V.putInt(i9);
                        } else {
                            this.A0V.putShort((short) i9);
                            this.A0V.putInt(0);
                        }
                        this.A0h.A0j(this.A0V.array(), i6);
                        interfaceC5361Hd.AIs(this.A0h, i6, 1);
                        this.A09 += i6;
                    }
                }
            } else if (c5433Io.A0m != null) {
                this.A0k.A0j(c5433Io.A0m, c5433Io.A0m.length);
            }
            if (c5433Io.A0B(z)) {
                this.A02 |= 268435456;
                this.A0o.A0d(0);
                int iA0A2 = (this.A0k.A0A() + i) - this.A08;
                this.A0l.A0d(4);
                this.A0l.A0l()[0] = (byte) ((iA0A2 >> 24) & 255);
                this.A0l.A0l()[1] = (byte) ((iA0A2 >> 16) & 255);
                this.A0l.A0l()[2] = (byte) ((iA0A2 >> 8) & 255);
                this.A0l.A0l()[3] = (byte) (iA0A2 & 255);
                interfaceC5361Hd.AIs(this.A0l, 4, 2);
                this.A09 += 4;
            }
            this.A0Y = true;
            iA0A = i + this.A0k.A0A();
            if (A06(1207, 15, 14).equals(c5433Io.A0d)) {
                strArr3 = A0u;
                if (strArr3[2].length() != strArr3[4].length()) {
                    A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                    if (A06(1236, 16, 47).equals(c5433Io.A0d)) {
                        bArrA0l = this.A0i.A0l();
                        bArrA0l[0] = 0;
                        bArrA0l[1] = 0;
                        bArrA0l[2] = 0;
                        i2 = c5433Io.A0Q;
                        i3 = 4 - c5433Io.A0Q;
                        while (this.A08 < iA0A) {
                            if (this.A0A == 0) {
                                A0G(interfaceC7263ms, bArrA0l, i3, i2);
                                this.A08 += i2;
                                this.A0i.A0f(0);
                                this.A0A = this.A0i.A0L();
                                this.A0j.A0f(0);
                                interfaceC5361Hd.AIr(this.A0j, 4);
                                strArr = A0u;
                                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                                    String[] strArr15 = A0u;
                                    strArr15[5] = "fro1mi6zSK";
                                    strArr15[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                                    this.A09 += 4;
                                } else {
                                    A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                                    this.A09 += 4;
                                }
                            } else {
                                int iA04 = A01(interfaceC7263ms, interfaceC5361Hd, this.A0A);
                                this.A08 += iA04;
                                this.A09 += iA04;
                                this.A0A -= iA04;
                            }
                        }
                    } else {
                        if (c5433Io.A0c != null) {
                            if (this.A0k.A0A() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            AbstractC45353y.A08(z2);
                            c5433Io.A0c.A03(interfaceC7263ms);
                        }
                        while (this.A08 < iA0A) {
                            int iA05 = A01(interfaceC7263ms, interfaceC5361Hd, iA0A - this.A08);
                            this.A08 += iA05;
                            this.A09 += iA05;
                        }
                    }
                }
            } else {
                bArrA0l = this.A0i.A0l();
                bArrA0l[0] = 0;
                bArrA0l[1] = 0;
                bArrA0l[2] = 0;
                i2 = c5433Io.A0Q;
                i3 = 4 - c5433Io.A0Q;
                while (this.A08 < iA0A) {
                    if (this.A0A == 0) {
                        A0G(interfaceC7263ms, bArrA0l, i3, i2);
                        this.A08 += i2;
                        this.A0i.A0f(0);
                        this.A0A = this.A0i.A0L();
                        this.A0j.A0f(0);
                        interfaceC5361Hd.AIr(this.A0j, 4);
                        strArr = A0u;
                        if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                            String[] strArr16 = A0u;
                            strArr16[5] = "fro1mi6zSK";
                            strArr16[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                            this.A09 += 4;
                        } else {
                            A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                            this.A09 += 4;
                        }
                    } else {
                        int iA06 = A01(interfaceC7263ms, interfaceC5361Hd, this.A0A);
                        this.A08 += iA06;
                        this.A09 += iA06;
                        this.A0A -= iA06;
                    }
                }
            }
            strA06 = A06(271, 8, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            str = c5433Io.A0d;
            strArr2 = A0u;
            if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                A0u[3] = "L5Y1ZRMfFWOxp58RZlemSr0Ie3cKRoNn";
                if (strA06.equals(str)) {
                    this.A0p.A0f(0);
                    interfaceC5361Hd.AIr(this.A0p, 4);
                    this.A09 += 4;
                }
            } else {
                String[] strArr17 = A0u;
                strArr17[2] = "6h0vzYYIjFmBqGs";
                strArr17[4] = "2CBNjdNTCI84kXMqqr";
                if (strA06.equals(str)) {
                    this.A0p.A0f(0);
                    interfaceC5361Hd.AIr(this.A0p, 4);
                    this.A09 += 4;
                }
            }
            return A00();
        }
        throw new RuntimeException();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0t, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0t = new byte[]{90, Ascii.ETB, Ascii.f22499SI, 9, Ascii.f22500SO, 90, Ascii.CAN, Ascii.f22502US, 90, 19, Ascii.DC4, 90, Ascii.ESC, 90, 57, Ascii.f22499SI, Ascii.f22502US, 9, 96, 45, 53, 51, 52, 96, 34, 37, 96, 41, 46, 96, 33, 96, Ascii.DC4, 50, 33, 35, 43, 5, 46, 52, 50, 57, 19, 93, 92, 71, 19, SignedBytes.MAX_POWER_OF_TWO, 70, 67, 67, 92, 65, 71, 86, 87, 111, 122, 123, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, Ascii.SYN, 3, 1, 87, 9, Ascii.SYN, 3, 1, 87, 9, Ascii.SYN, 3, 1, 87, Ascii.f22502US, Ascii.SYN, 3, 0, 87, 19, 6, 4, 82, Ascii.f22492FF, 19, 6, 4, 82, Ascii.f22492FF, 19, 6, 4, 82, Ascii.CAN, 19, 6, 5, 82, 0, 4, Ascii.DC2, Ascii.DC2, 36, 53, 53, 40, 47, 38, 50, 2, 40, 49, 41, 36, 51, Ascii.f22492FF, 46, 37, 36, 97, 94, SignedBytes.MAX_POWER_OF_TWO, 94, 94, 92, Ascii.ETB, 9, Ascii.ETB, Ascii.NAK, 101, 58, 36, 63, 47, 40, 58, 36, 63, 47, 40, 84, 62, 35, 43, 41, 62, 40, 40, 80, 78, 85, 69, 66, 62, 93, 94, 66, 66, 93, 84, 66, 66, 120, 102, 124, 120, 122, 10, 110, 112, 105, 99, 110, 108, 33, 63, 45, 48, 37, 39, 79, 44, 82, 2, Ascii.f22493FS, Ascii.f22500SO, 19, 6, 4, 108, Ascii.f22499SI, 112, 33, 63, 45, 51, 79, 33, 35, 45, Ascii.f22502US, 1, 17, Ascii.f22500SO, Ascii.f22503VT, Ascii.f22490CR, 82, 76, 67, 80, 94, 60, 85, 95, 92, 82, 71, 60, 90, 86, 86, 86, 82, 76, 67, 80, 94, 60, 90, 93, 71, 60, 81, 90, 84, Ascii.f22492FF, Ascii.DC2, Ascii.f22494GS, Ascii.f22500SO, 0, 98, 4, 3, Ascii.f22491EM, 98, 1, 4, Ascii.f22491EM, 116, 106, 97, 103, 96, 112, 125, 113, 56, 38, 47, 54, 43, 59, 48, 42, 105, 75, 68, Ascii.f22490CR, 94, 10, 89, 73, 75, 70, 79, 10, 94, 67, 71, 79, 73, 69, 78, 79, 10, 90, 88, 67, 69, 88, 10, 94, 69, 10, 94, 67, 71, 79, 73, 69, 78, 79, 121, 73, 75, 70, 79, 10, 72, 79, 67, 68, 77, 10, 89, 79, 94, 4, 5, 41, 34, 35, 37, Ascii.f22499SI, 34, 102, 47, 53, 102, 43, 47, 53, 53, 47, 40, 33, 102, 47, 40, 102, Ascii.DC2, 52, 39, 37, 45, 3, 40, 50, 52, 63, 102, 35, 42, 35, 43, 35, 40, 50, 117, 89, 91, 84, 95, 88, 95, 88, 81, Ascii.SYN, 83, 88, 85, 68, 79, 70, 66, 95, 89, 88, Ascii.SYN, 87, 88, 82, Ascii.SYN, 85, 89, 91, 70, 68, 83, 69, 69, 95, 89, 88, Ascii.SYN, 95, 69, Ascii.SYN, 88, 89, 66, Ascii.SYN, 69, 67, 70, 70, 89, 68, 66, 83, 82, 86, 122, 123, 97, 112, 123, 97, 86, 122, 120, 101, 84, 121, 114, 122, 53, 107, 71, 70, 92, 77, 70, 92, 109, 70, 75, 105, 68, 79, 71, 8, 82, 126, 127, 101, 116, 127, 101, 84, 127, 114, 126, 117, 120, 127, 118, 94, 99, 117, 116, 99, 49, 95, 115, 114, 104, 121, 114, 104, 89, 114, 127, 115, 120, 117, 114, 123, 79, 127, 115, 108, 121, 60, 110, 67, 89, 73, 75, 88, 78, 67, 68, 77, 10, 70, 75, 89, 94, 10, 73, 95, 79, 10, 90, 69, 67, 68, 94, 10, 93, 67, 94, 66, 10, 95, 68, 79, 82, 90, 79, 73, 94, 79, 78, 10, 78, 95, 88, 75, 94, 67, 69, 68, Ascii.DLE, 10, Ascii.f22490CR, 38, 42, Ascii.f22494GS, 48, 57, 44, 105, 83, 120, 116, 67, 110, 103, 114, 69, 114, 118, 115, 65, 114, 101, 100, 126, 120, 121, 55, 71, SignedBytes.MAX_POWER_OF_TWO, 79, 78, 34, 110, 99, 97, 107, 108, 101, 34, 113, 99, 111, 114, 110, 103, 34, 113, 107, 120, 103, 34, 109, 119, 118, 34, 109, 100, 34, 112, 99, 108, 101, 103, 44, 51, 52, 59, 58, 36, 19, Ascii.ETB, Ascii.DC2, 32, 19, 4, 5, Ascii.f22502US, Ascii.f22491EM, Ascii.CAN, 86, 1, 40, 33, 41, 33, 42, 48, 100, 119, 92, 81, SignedBytes.MAX_POWER_OF_TWO, 75, 66, 70, 87, 86, Ascii.DC2, 102, SignedBytes.MAX_POWER_OF_TWO, 83, 81, 89, Ascii.DC2, 84, 93, 71, 92, 86, Ascii.DC2, 80, 71, 70, Ascii.DC2, 113, 93, 92, 70, 87, 92, 70, 119, 92, 81, 121, 87, 75, 123, 118, Ascii.DC2, 69, 83, 65, Ascii.DC2, 92, 93, 70, Ascii.DC2, 84, 93, 71, 92, 86, 71, 122, 118, 103, 108, 113, 107, 109, 108, 34, 96, 107, 118, 34, 107, 113, 34, 113, 103, 118, 34, 107, 108, 34, 113, 107, 101, 108, 99, 110, 34, 96, 123, 118, 103, 108, 69, 88, 71, 75, 94, Ascii.DLE, 10, 121, 94, 75, 88, 94, 6, 10, 111, 68, 78, 6, 10, 120, 79, 75, 78, 101, 88, 78, 79, 88, 6, 10, 102, 75, 83, 79, 88, 6, 10, 121, 94, 83, 70, 79, 6, 10, 100, 75, 71, 79, 6, 10, 103, 75, 88, 77, 67, 68, 102, 6, 10, 103, 75, 88, 77, 67, 68, 120, 6, 10, 103, 75, 88, 77, 67, 68, 124, 6, 10, 111, 76, 76, 79, 73, 94, 6, 10, 126, 79, 82, 94, 56, Ascii.DC4, Ascii.ESC, 17, Ascii.DC4, 1, Ascii.SUB, 7, Ascii.f22492FF, 85, Ascii.DLE, Ascii.f22491EM, Ascii.DLE, Ascii.CAN, Ascii.DLE, Ascii.ESC, 1, 85, 38, Ascii.DLE, Ascii.DLE, Ascii.f22498RS, 60, 49, 85, Ascii.SUB, 7, 85, 38, Ascii.DLE, Ascii.DLE, Ascii.f22498RS, 37, Ascii.SUB, 6, Ascii.f22493FS, 1, Ascii.f22493FS, Ascii.SUB, Ascii.ESC, 85, Ascii.ESC, Ascii.SUB, 1, 85, 19, Ascii.SUB, 0, Ascii.ESC, 17, Ascii.f22500SO, 34, 55, 49, 44, 48, 40, 34, 6, 59, 55, 49, 34, 32, 55, 44, 49, 54, Ascii.f22500SO, Ascii.ETB, Ascii.f22499SI, Ascii.DC2, Ascii.f22503VT, Ascii.ETB, Ascii.f22498RS, 91, 40, Ascii.f22498RS, Ascii.f22493FS, Ascii.SYN, Ascii.f22498RS, Ascii.NAK, Ascii.f22499SI, 91, Ascii.f22498RS, Ascii.ETB, Ascii.f22498RS, Ascii.SYN, Ascii.f22498RS, Ascii.NAK, Ascii.f22499SI, 8, 91, Ascii.NAK, Ascii.DC4, Ascii.f22499SI, 91, 8, Ascii.f22500SO, Ascii.f22503VT, Ascii.f22503VT, Ascii.DC4, 9, Ascii.f22499SI, Ascii.f22498RS, Ascii.f22502US, 32, 1, 78, Ascii.CAN, Ascii.f22499SI, 2, 7, 10, 78, Ascii.SUB, Ascii.f22493FS, Ascii.f22499SI, Ascii.f22490CR, 5, Ascii.f22494GS, 78, Ascii.f22491EM, Ascii.f22503VT, Ascii.f22493FS, Ascii.f22503VT, 78, 8, 1, Ascii.ESC, 0, 10, 91, 122, 53, 99, 116, 121, 124, 113, 53, 99, 116, 103, 124, 123, 97, 53, 121, 112, 123, 114, 97, 125, 53, 120, 116, 102, 126, 53, 115, 122, 96, 123, 113, Base64.padSymbol, 49, 42, 56, 44, Base64.padSymbol, 59, 44, 105, 101, 114, 126, 119, 108, Ascii.NAK, 106, 
        125, 105, 58, 54, Base64.padSymbol, 44, 49, Base64.padSymbol, 70, 40, 58, 58, 103, 107, 96, 113, 108, 96, Ascii.ESC, 97, 96, 114, Ascii.f22492FF, 127, 115, 120, 105, 116, 120, 3, 123, 105, 110, 122, 120, 120, 65, 77, 68, 93, 80, 65, 71, 80, 35, Ascii.ESC, Ascii.f22491EM, 0, 0, Ascii.f22491EM, Ascii.f22498RS, Ascii.ETB, 80, 3, 5, Ascii.DC2, 4, Ascii.f22491EM, 4, Ascii.f22493FS, Ascii.NAK, 80, 3, 17, Ascii.f22494GS, 0, Ascii.f22493FS, Ascii.NAK, 80, Ascii.f22491EM, Ascii.f22498RS, 80, Ascii.f22493FS, 17, 19, Ascii.NAK, Ascii.DC4, 80, Ascii.DC2, Ascii.f22493FS, Ascii.f22502US, 19, Ascii.ESC, 94, SignedBytes.MAX_POWER_OF_TWO, 120, 122, 99, 99, 122, 125, 116, 51, 96, 102, 113, 103, 122, 103, 127, 118, 51, 96, 114, 126, 99, 127, 118, 51, 100, 122, 103, 123, 51, 125, 124, 51, 119, 102, 97, 114, 103, 122, 124, 125, Base64.padSymbol, 81, 106, 97, 124, 116, 97, 103, 112, 97, 96, 36, 109, 96, 62, 36, 9, 50, 57, 36, 44, 57, 63, 40, 57, 56, 124, 48, Base64.padSymbol, 63, 53, 50, 59, 124, 42, Base64.padSymbol, 48, 41, 57, 102, 124, 45, 36, 58, 45, 74, 62, 55, 37, 56, 45, 47, 90, 122, 115, 97, 124, 105, 107, Ascii.CAN, 3, 101, 127, 99, 3, 109, 124, 102, 111, 125, 96, 117, 119, 4, Ascii.f22502US, 121, 99, 127, Ascii.f22502US, 113, 99, 96, 84, 93, 79, 82, 71, 69, 54, 45, 75, 81, 77, 45, 67, 84, 65, 60, 53, 39, 58, 47, 45, 94, 69, 35, 57, 37, 69, 57, 58, 117, 124, 110, 115, 102, 100, 107, Ascii.f22492FF, 106, 112, 108, Ascii.f22492FF, 107, 102, 117, 96, 76, 69, 87, 73, 53, 76, 92, 77, 53, 92, 85, 79, 72, 89, 89, 69, 76, 71, 91, 86, 92, 65, 82, Ascii.DC2, Ascii.ESC, Ascii.DC2, Ascii.DC4, 124, 2, Ascii.f22503VT, 2, 4, 109, 79, 83, 68, 120, 81, 78, 67, 66, 72, 120, 85, 72, 83, 102, 10, Ascii.ETB, Ascii.ETB, Ascii.ETB, 52, 40, 63, 3, 42, 53, 56, 57, 51, 3, 46, 51, 40, Ascii.f22494GS, 113, 108, 101, 108, 56, 36, 51, Ascii.f22499SI, 38, 57, 52, 53, 63, Ascii.f22499SI, 34, 63, 36, 17, 125, 97, 104, 96, 93, 65, 86, 106, 67, 92, 81, 80, 90, 106, 71, 90, 65, 116, Ascii.CAN, 7, 2, 5, 34, 46, 59, Base64.padSymbol, 32, 60, 36, 46, 56, 39, 42, 43, 33, 97, 57, 43, 44, 35, Ascii.NAK, 7, 0, Ascii.f22499SI};
    }

    static {
        A0B();
        A0v = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.mL
            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final InterfaceC5331H9[] A5N() {
                return MatroskaExtractor.A0Q();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
            public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
                return AbstractC5334HC.A01(this, uri, map);
            }
        };
        A10 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0y = AbstractC46115C.A1G(A06(729, 90, 38));
        A0z = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A11 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        A0x = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put(A06(1285, 18, 43), 0);
        map.put(A06(1303, 18, 80), 90);
        map.put(A06(1321, 18, 92), 180);
        map.put(A06(1339, 18, 57), 270);
        Map<String, Integer> trackNameToRotationDegrees = Collections.unmodifiableMap(map);
        A0w = trackNameToRotationDegrees;
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new C7242mM(), i);
    }

    public MatroskaExtractor(InterfaceC5430Il interfaceC5430Il, int i) {
        this.A0M = -1L;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = -9223372036854775807L;
        this.A0q = interfaceC5430Il;
        this.A0q.AAD(new C7240mK(this));
        this.A0s = (i & 1) == 0;
        this.A0r = new C5435Iq();
        this.A0P = new SparseArray<>();
        this.A0l = new C45944v(4);
        this.A0p = new C45944v(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0m = new C45944v(4);
        this.A0j = new C45944v(AbstractC5350HS.A03);
        this.A0i = new C45944v(4);
        this.A0k = new C45944v();
        this.A0n = new C45944v();
        this.A0g = new C45944v(8);
        this.A0h = new C45944v();
        this.A0o = new C45944v();
        this.A0f = new int[1];
    }

    private int A00() {
        int sampleSize = this.A09;
        A0A();
        return sampleSize;
    }

    private int A01(InterfaceC7263ms interfaceC7263ms, InterfaceC5361Hd interfaceC5361Hd, int i) throws IOException {
        int strippedBytesLeft = this.A0k.A07();
        if (strippedBytesLeft > 0) {
            int bytesWritten = Math.min(i, strippedBytesLeft);
            interfaceC5361Hd.AIr(this.A0k, bytesWritten);
            return bytesWritten;
        }
        return interfaceC5361Hd.AIp(interfaceC7263ms, i, false);
    }

    private long A03(long j) throws C44963K {
        if (this.A0O != -9223372036854775807L) {
            return AbstractC46115C.A0U(j, this.A0O, 1000L);
        }
        throw C44963K.A01(A06(279, 54, 38), null);
    }

    @MetaExoPlayerCustomization("Adding support AR/VR eventListener")
    private InterfaceC5356HY A04(C45804h c45804h, C45804h c45804h2) {
        if (this.A0M == -1 || this.A0J == -9223372036854775807L || c45804h == null || c45804h.A02() == 0 || c45804h2 == null || c45804h2.A02() != c45804h.A02()) {
            return new C7258mn(this.A0J);
        }
        int iA02 = c45804h.A02();
        int[] iArrCopyOf = new int[iA02];
        long[] timesUs = new long[iA02];
        long[] durationsUs = new long[iA02];
        long[] offsets = new long[iA02];
        for (int i = 0; i < iA02; i++) {
            offsets[i] = c45804h.A03(i);
            timesUs[i] = this.A0M + c45804h2.A03(i);
        }
        for (int i2 = 0; i2 < cuePointsSize; i2++) {
            int cuePointsSize = i2 + 1;
            iArrCopyOf[i2] = (int) (timesUs[cuePointsSize] - timesUs[i2]);
            int i3 = i2 + 1;
            if (A0u[7].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0u;
            strArr[1] = "EcqUdVdOszDxTX1GLg4Sg6FEnSFxXYEO";
            strArr[0] = "f3IXvdxpqPdXnJQYi44axyFnZVKpD9LT";
            durationsUs[i2] = offsets[i3] - offsets[i2];
        }
        iArrCopyOf[iA02 - 1] = (int) ((this.A0M + this.A0N) - timesUs[iA02 - 1]);
        durationsUs[iA02 - 1] = this.A0J - offsets[iA02 - 1];
        int cuePointsSize2 = iA02 - 1;
        long j = durationsUs[cuePointsSize2];
        if (j <= 0) {
            AbstractC45794g.A07(A06(869, 17, 79), A06(499, 52, 38) + j);
            int cuePointsSize3 = iArrCopyOf.length;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, cuePointsSize3 - 1);
            int cuePointsSize4 = timesUs.length;
            timesUs = Arrays.copyOf(timesUs, cuePointsSize4 - 1);
            int cuePointsSize5 = durationsUs.length;
            durationsUs = Arrays.copyOf(durationsUs, cuePointsSize5 - 1);
            int cuePointsSize6 = offsets.length;
            offsets = Arrays.copyOf(offsets, cuePointsSize6 - 1);
        }
        return new C7268my(iArrCopyOf, timesUs, durationsUs, offsets);
    }

    private final C5433Io A05(int i) throws C44963K {
        A0D(i);
        return this.A0T;
    }

    @EnsuresNonNull({"extractorOutput"})
    private void A09() {
        AbstractC45353y.A02(this.A0S);
    }

    private void A0A() {
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0Y = false;
        this.A0b = false;
        this.A0a = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0Z = false;
        this.A0k.A0d(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void A0C(int i) throws C44963K {
        if (this.A0R != null && this.A0Q != null) {
        } else {
            throw C44963K.A01(A06(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 8, 72) + i + A06(0, 18, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void A0D(int i) throws C44963K {
        if (this.A0T != null) {
        } else {
            throw C44963K.A01(A06(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 8, 72) + i + A06(18, 24, 76), null);
        }
    }

    private void A0E(InterfaceC7263ms interfaceC7263ms, int i) throws IOException {
        if (this.A0l.A0A() >= i) {
            return;
        }
        if (this.A0l.A08() < i) {
            this.A0l.A0c(Math.max(this.A0l.A08() * 2, i));
        }
        interfaceC7263ms.readFully(this.A0l.A0l(), this.A0l.A0A(), i - this.A0l.A0A());
        this.A0l.A0e(i);
    }

    private void A0F(InterfaceC7263ms interfaceC7263ms, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        int sizeWithPrefix = this.A0n.A08();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i;
            this.A0n.A0i(Arrays.copyOf(bArr, sizeWithPrefix2));
        } else {
            byte[] bArrA0l = this.A0n.A0l();
            int sizeWithPrefix3 = bArr.length;
            System.arraycopy(bArr, 0, bArrA0l, 0, sizeWithPrefix3);
        }
        byte[] bArrA0l2 = this.A0n.A0l();
        int sizeWithPrefix4 = bArr.length;
        interfaceC7263ms.readFully(bArrA0l2, sizeWithPrefix4, i);
        this.A0n.A0f(0);
        this.A0n.A0e(length);
    }

    private void A0G(InterfaceC7263ms interfaceC7263ms, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.A0k.A07());
        int pendingStrippedBytes = i + iMin;
        interfaceC7263ms.readFully(bArr, pendingStrippedBytes, i2 - iMin);
        if (iMin > 0) {
            this.A0k.A0k(bArr, i, iMin);
        }
    }

    private final void A0H(C5433Io c5433Io, int i, InterfaceC7263ms interfaceC7263ms, int i2) throws IOException {
        if (i == 4) {
            if (A06(1280, 5, 88).equals(c5433Io.A0d)) {
                this.A0o.A0d(i2);
                interfaceC7263ms.readFully(this.A0o.A0l(), 0, i2);
                return;
            }
        }
        interfaceC7263ms.AK3(i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:40:0x014e A[LOOP:0: B:34:0x0121->B:40:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0133 A[SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    private void A0I(C5433Io c5433Io, long j, int i, int i2, int i3) {
        int i4;
        String strA06;
        int iA09;
        int iA0A = i2;
        if (c5433Io.A0c != null) {
            c5433Io.A0c.A04(c5433Io.A0b, j, i, iA0A, i3, c5433Io.A0a);
        } else {
            if (!A06(1012, 11, 56).equals(c5433Io.A0d)) {
                boolean zEquals = A06(1002, 10, 101).equals(c5433Io.A0d);
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0u;
                strArr[2] = "WUIRLQPYspP06jV";
                strArr[4] = "IKED97K2catgdGs9C7";
                if (!zEquals) {
                    if (A06(1023, 13, 32).equals(c5433Io.A0d)) {
                        i4 = this.A03;
                        strA06 = A06(869, 17, 79);
                        if (i4 > 1) {
                            AbstractC45794g.A07(strA06, A06(IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, 40, 124));
                        } else if (this.A0D == -9223372036854775807L) {
                            AbstractC45794g.A07(strA06, A06(1084, 42, 31));
                        } else {
                            A0K(c5433Io.A0d, this.A0D, this.A0n.A0l());
                            for (iA09 = this.A0n.A09(); iA09 < this.A0n.A0A(); iA09++) {
                                if (this.A0n.A0l()[iA09] == 0) {
                                    this.A0n.A0e(iA09);
                                    break;
                                }
                            }
                            c5433Io.A0b.AIr(this.A0n, this.A0n.A0A());
                            iA0A += this.A0n.A0A();
                        }
                    }
                } else {
                    i4 = this.A03;
                    strA06 = A06(869, 17, 79);
                    if (i4 > 1) {
                        AbstractC45794g.A07(strA06, A06(IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, 40, 124));
                    } else if (this.A0D == -9223372036854775807L) {
                        AbstractC45794g.A07(strA06, A06(1084, 42, 31));
                    } else {
                        A0K(c5433Io.A0d, this.A0D, this.A0n.A0l());
                        while (iA09 < this.A0n.A0A()) {
                            if (this.A0n.A0l()[iA09] == 0) {
                                this.A0n.A0e(iA09);
                                break;
                            }
                        }
                        c5433Io.A0b.AIr(this.A0n, this.A0n.A0A());
                        iA0A += this.A0n.A0A();
                    }
                }
            } else {
                i4 = this.A03;
                strA06 = A06(869, 17, 79);
                if (i4 > 1) {
                    AbstractC45794g.A07(strA06, A06(IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES, 40, 124));
                } else if (this.A0D == -9223372036854775807L) {
                    AbstractC45794g.A07(strA06, A06(1084, 42, 31));
                } else {
                    A0K(c5433Io.A0d, this.A0D, this.A0n.A0l());
                    while (iA09 < this.A0n.A0A()) {
                        if (this.A0n.A0l()[iA09] == 0) {
                            this.A0n.A0e(iA09);
                            break;
                        }
                    }
                    c5433Io.A0b.AIr(this.A0n, this.A0n.A0A());
                    iA0A += this.A0n.A0A();
                }
            }
            if ((268435456 & i) != 0) {
                if (this.A03 > 1) {
                    C45944v c45944v = this.A0o;
                    String[] strArr2 = A0u;
                    if (strArr2[5].length() != strArr2[6].length()) {
                        String[] strArr3 = A0u;
                        strArr3[1] = "YYsRZc3YFjjR6whUDZFnD2lR7qwR3xQu";
                        strArr3[0] = "iPCTe70V3RVZDGWrxpNWfBz9u5oW1N1r";
                        c45944v.A0d(0);
                    } else {
                        A0u[3] = "dzMIMRhm8kdQoNm85GuPxt1OFbbjzRAM";
                        c45944v.A0d(0);
                    }
                } else {
                    int iA0A2 = this.A0o.A0A();
                    c5433Io.A0b.AIs(this.A0o, iA0A2, 2);
                    iA0A += iA0A2;
                }
            }
            InterfaceC5361Hd interfaceC5361Hd = c5433Io.A0b;
            C5359Hb c5359Hb = c5433Io.A0a;
            String[] strArr4 = A0u;
            if (strArr4[5].length() != strArr4[6].length()) {
                String[] strArr5 = A0u;
                strArr5[1] = "aEC8Q2NERZhQKbY6SRlQy9B7oXJI5nDv";
                strArr5[0] = "M5BYDTb0V4PW6b5ziiSZklpOYuXfea8a";
                interfaceC5361Hd.AIu(j, i, iA0A, i3, c5359Hb);
            } else {
                interfaceC5361Hd.AIu(j, i, iA0A, i3, c5359Hb);
            }
        }
        this.A0X = true;
    }

    private final void A0J(C5433Io c5433Io, InterfaceC7263ms interfaceC7263ms, int i) throws IOException {
        if (c5433Io.A0n != 1685485123) {
            int i2 = c5433Io.A0n;
            String[] strArr = A0u;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[2] = "z7J25JPdzWy80Kd";
            strArr2[4] = "xEqpvZ1X3IvVWW9v69";
            if (i2 != 1685480259) {
                interfaceC7263ms.AK3(i);
                return;
            }
        }
        c5433Io.A0k = new byte[i];
        interfaceC7263ms.readFully(c5433Io.A0k, 0, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public static void A0K(String str, long j, byte[] bArr) {
        byte b;
        String[] strArr;
        byte[] bArrA0O;
        int i;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    b = 1;
                } else {
                    b = -1;
                }
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr2[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b) {
                        case 0:
                            bArrA0O = A0O(j, A06(75, 19, 63), 1000L);
                            i = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j, A06(56, 19, 70), 10000L);
                            i = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j, A06(94, 19, 58), 1000L);
                            i = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
            case 1045209816:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                    String[] strArr4 = A0u;
                    strArr4[5] = "hOu1CB2frr";
                    strArr4[6] = "vZrPTqET3LPV3435yPIFppSrF";
                    if (str.equals(A06(1023, 13, 32))) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        String[] strArr5 = A0u;
                        strArr5[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                        strArr5[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                        switch (b) {
                            case 0:
                                bArrA0O = A0O(j, A06(75, 19, 63), 1000L);
                                i = 19;
                                break;
                            case 1:
                                bArrA0O = A0O(j, A06(56, 19, 70), 10000L);
                                i = 21;
                                break;
                            case 2:
                                bArrA0O = A0O(j, A06(94, 19, 58), 1000L);
                                i = 25;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrA0O, 0, bArr, i, bArrA0O.length);
                        return;
                    }
                }
                throw new RuntimeException();
            case 1422270023:
                if (str.equals(A06(1012, 11, 56))) {
                    b = 0;
                } else {
                    b = -1;
                }
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr6 = A0u;
                    strArr6[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr6[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b) {
                        case 0:
                            bArrA0O = A0O(j, A06(75, 19, 63), 1000L);
                            i = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j, A06(56, 19, 70), 10000L);
                            i = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j, A06(94, 19, 58), 1000L);
                            i = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
            default:
                b = -1;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr7 = A0u;
                    strArr7[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                    strArr7[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                    switch (b) {
                        case 0:
                            bArrA0O = A0O(j, A06(75, 19, 63), 1000L);
                            i = 19;
                            break;
                        case 1:
                            bArrA0O = A0O(j, A06(56, 19, 70), 10000L);
                            i = 21;
                            break;
                        case 2:
                            bArrA0O = A0O(j, A06(94, 19, 58), 1000L);
                            i = 25;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrA0O, 0, bArr, i, bArrA0O.length);
                    return;
                }
                throw new RuntimeException();
        }
    }

    private boolean A0L(C5353HV c5353hv, long j) {
        if (this.A0c) {
            this.A0L = j;
            c5353hv.A00 = this.A0H;
            this.A0c = false;
            return true;
        }
        if (!this.A0e || this.A0L == -1) {
            return false;
        }
        c5353hv.A00 = this.A0L;
        this.A0L = -1L;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0300  */
    /* JADX WARN: Code duplicated, block: B:124:0x032d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[RETURN] */
    public static boolean A0M(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A06(1178, 14, 32))) {
                    b = 6;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -2095575984:
                if (str.equals(A06(1222, 14, 102))) {
                    b = 4;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1985379776:
                boolean zEquals = str.equals(A06(207, 8, 108));
                if (A0u[7].length() != 16) {
                    A0u[3] = "TzGfoRLFuVo7UwCT9UC1nsicdZWWDAlG";
                    if (zEquals) {
                        b = Ascii.ETB;
                    }
                } else if (zEquals) {
                    b = Ascii.ETB;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1784763192:
                if (str.equals(A06(263, 8, 57))) {
                    b = Ascii.DC2;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1730367663:
                if (str.equals(A06(271, 8, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))) {
                    b = Ascii.f22492FF;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1482641358:
                if (str.equals(A06(189, 9, 108))) {
                    b = Ascii.f22500SO;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1482641357:
                if (str.equals(A06(198, 9, 79))) {
                    b = Ascii.f22499SI;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -1373388978:
                if (str.equals(A06(1252, 15, 22))) {
                    b = 9;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -933872740:
                if (str.equals(A06(984, 8, 98))) {
                    b = 32;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -538363189:
                if (str.equals(A06(1192, 15, 60))) {
                    b = 5;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -538363109:
                if (str.equals(A06(1207, 15, 14))) {
                    b = 7;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -425012669:
                if (str.equals(A06(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 8, 30))) {
                    b = Ascii.f22498RS;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case -356037306:
                if (str.equals(A06(163, 14, 29))) {
                    b = Ascii.NAK;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62923557:
                if (str.equals(A06(135, 5, 19))) {
                    b = Ascii.f22490CR;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62923603:
                if (str.equals(A06(140, 5, 90))) {
                    b = Ascii.DLE;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 62927045:
                if (str.equals(A06(145, 5, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE))) {
                    b = 19;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82318131:
                if (str.equals(A06(1166, 5, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE))) {
                    b = 2;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82338133:
                boolean zEquals2 = str.equals(A06(1275, 5, 72));
                if (A0u[7].length() != 16) {
                    String[] strArr = A0u;
                    strArr[5] = "F8wfBLRr4t";
                    strArr[6] = "m6KkyOOVg8X0ndZUQG2mgE6hH";
                    if (zEquals2) {
                        b = 0;
                    }
                } else {
                    String[] strArr2 = A0u;
                    strArr2[1] = "SKDMUFdFJPMXubKSzq5KjaXHZATq3OUF";
                    strArr2[0] = "Ghj8mYRv51e2wMnC9FEKaN4eHBhVqIAQ";
                    if (zEquals2) {
                        b = 0;
                    }
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 82338134:
                if (str.equals(A06(1280, 5, 88))) {
                    b = 1;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 99146302:
                if (str.equals(A06(992, 10, 54))) {
                    b = Ascii.f22502US;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 444813526:
                if (str.equals(A06(1267, 8, 31))) {
                    b = 10;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 542569478:
                if (str.equals(A06(150, 13, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE))) {
                    b = Ascii.DC4;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 635596514:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                    A0u[3] = "7MRDpRiWazQnh7KPJAJl4vRwzLx1BKGb";
                    if (str.equals(A06(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 16, 31))) {
                        b = Ascii.SUB;
                    }
                } else {
                    String[] strArr4 = A0u;
                    strArr4[5] = "W6YXr1xbPB";
                    strArr4[6] = "Gbq52SJwNi9qAu2AjciLJePWO";
                    if (str.equals(A06(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 16, 31))) {
                        b = Ascii.SUB;
                    }
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 725948237:
                boolean zEquals3 = str.equals(A06(237, 13, 31));
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                A0u[7] = "zUYiT8JvqtzTusXd0wwrN";
                if (zEquals3) {
                    b = Ascii.f22491EM;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 725957860:
                if (str.equals(A06(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 13, 65))) {
                    b = Ascii.CAN;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    b = Ascii.f22493FS;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 855502857:
                if (str.equals(A06(1236, 16, 47))) {
                    b = 8;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1045209816:
                String[] strArr5 = A0u;
                if (strArr5[2].length() == strArr5[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A0u;
                strArr6[1] = "l6rfMqL6uO4vJf2wQ9BlcS80aS9RAxdU";
                strArr6[0] = "kDo3bZmmggKJDtMwpBeZtATIDXYPDXog";
                if (str.equals(A06(1023, 13, 32))) {
                    b = Ascii.f22494GS;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1422270023:
                if (str.equals(A06(1012, 11, 56))) {
                    b = Ascii.ESC;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1809237540:
                if (str.equals(A06(1171, 7, 100))) {
                    b = 3;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1950749482:
                if (str.equals(A06(177, 6, 53))) {
                    b = 17;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1950789798:
                if (str.equals(A06(183, 6, 35))) {
                    b = Ascii.SYN;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
            case 1951062397:
                if (str.equals(A06(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 6, 82))) {
                    b = Ascii.f22503VT;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                        return true;
                    default:
                        return false;
                }
        }
        b = -1;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    public static byte[] A0O(long j, String str, long j2) {
        AbstractC45353y.A07(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((((long) i) * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((((long) i2) * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        int minutes = (int) ((j4 - (((long) i3) * 1000000)) / j2);
        return AbstractC46115C.A1G(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(minutes)));
    }

    public static int[] A0P(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public static /* synthetic */ InterfaceC5331H9[] A0Q() {
        return new InterfaceC5331H9[]{new MatroskaExtractor()};
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "Adding support for AR/VR TAGs")
    public final int A0R(int i) {
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 26568:
            case 28032:
            case 29555:
            case 30113:
            case 30320:
            case 290298740:
            case 307544935:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                String[] strArr = A0u;
                if (strArr[2].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0u;
                strArr2[1] = "HyhNlEIHHjvGo8KvAMWihGCcOuKz7U7o";
                strArr2[0] = "rV4cPIzb4RrvL4U1RF1zVSCUyrwoic3K";
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            case 17543:
            case 17827:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public final void A0S(int i) throws C44963K {
        A09();
        switch (i) {
            case 160:
                if (this.A05 == 2) {
                    C5433Io c5433Io = this.A0P.get(this.A06);
                    c5433Io.A06();
                    if (this.A0E > 0 && A06(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 6, 82).equals(c5433Io.A0d)) {
                        this.A0o.A0i(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0E).array());
                    }
                    int sampleFlags = 0;
                    if (A0u[7].length() != 16) {
                        String[] strArr = A0u;
                        strArr[5] = "BDPY36VwNm";
                        strArr[6] = "7hC1KMOm7DpnqonjeX0jtoaYt";
                        for (int sampleOffset = 0; sampleOffset < i; sampleOffset++) {
                            int i2 = this.A0f[sampleOffset];
                            sampleFlags += i2;
                            break;
                        }
                        for (int i3 = 0; i3 < sampleOffset; i3++) {
                            long j = this.A0F;
                            int sampleOffset2 = c5433Io.A0I;
                            long j2 = j + ((long) ((sampleOffset2 * i3) / 1000));
                            int i4 = this.A02;
                            if (i3 == 0 && !this.A0W) {
                                i4 |= 1;
                            }
                            int i5 = this.A0f[i3];
                            sampleFlags -= i5;
                            A0I(c5433Io, j2, i4, i5, sampleFlags);
                            break;
                        }
                        this.A05 = 0;
                        return;
                    }
                    throw new RuntimeException();
                }
                return;
            case 174:
                C5433Io c5433Io2 = (C5433Io) AbstractC45353y.A02(this.A0T);
                if (c5433Io2.A0d != null) {
                    if (A0M(c5433Io2.A0d)) {
                        c5433Io2.A0G(this.A0S, c5433Io2.A0R);
                        this.A0P.put(c5433Io2.A0R, c5433Io2);
                    }
                    this.A0T = null;
                    return;
                }
                throw C44963K.A01(A06(333, 40, 74), null);
            case 19899:
                int i6 = this.A0C;
                String[] strArr2 = A0u;
                if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                    A0u[7] = "tg6sq0stTi0cIlF7Upi0qsQ5QklGxJF";
                    if (i6 != -1) {
                        if (this.A0K != -1) {
                            if (this.A0C == 475249515) {
                                this.A0H = this.A0K;
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[2] = "yLIpCO5kJmqKflO";
                    strArr3[4] = "mFIbnXIm9TTTynra4E";
                    if (i6 != -1) {
                        if (this.A0K != -1) {
                            if (this.A0C == 475249515) {
                                this.A0H = this.A0K;
                                return;
                            }
                            return;
                        }
                    }
                }
                throw C44963K.A01(A06(819, 50, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), null);
            case 25152:
                A0D(i);
                if (!this.A0T.A0i) {
                    return;
                }
                if (this.A0T.A0a != null) {
                    this.A0T.A0Z = new DrmInitData(new DrmInitData.SchemeData(AbstractC44522Y.A03, A06(1365, 10, 66), this.A0T.A0a.A03));
                    return;
                }
                throw C44963K.A01(A06(639, 55, 62), null);
            case 28032:
                A0D(i);
                if (!this.A0T.A0i || this.A0T.A0m == null) {
                    return;
                } else {
                    throw C44963K.A01(A06(373, 53, 58), null);
                }
            case 357149030:
                long j3 = this.A0O;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "WZACEI803UG8FVl";
                if (j3 == -9223372036854775807L) {
                    this.A0O = 1000000L;
                }
                if (this.A0I != -9223372036854775807L) {
                    this.A0J = A03(this.A0I);
                    return;
                }
                return;
            case 374648427:
                if (this.A0P.size() != 0) {
                    this.A0S.A6O();
                    return;
                }
                throw C44963K.A01(A06(925, 26, 98), null);
            case 475249515:
                if (!this.A0e) {
                    this.A0S.AJ7(A04(this.A0R, this.A0Q));
                    this.A0e = true;
                }
                this.A0R = null;
                this.A0Q = null;
                return;
            default:
                return;
        }
    }

    public final void A0T(int i, double d) throws C44963K {
        switch (i) {
            case 181:
                C5433Io c5433IoA05 = A05(i);
                int i2 = (int) d;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "mnSBpt4UIloiGRhCy1GZQUK3TYQANP";
                c5433IoA05.A0T = i2;
                return;
            case 17545:
                this.A0I = (long) d;
                return;
            case 21969:
                A05(i).A06 = (float) d;
                return;
            case 21970:
                C5433Io c5433IoA06 = A05(i);
                if (A0u[7].length() != 16) {
                    A0u[7] = "bgRhYiIqKVlSmtLlUnVbMuj";
                    c5433IoA06.A07 = (float) d;
                    return;
                } else {
                    c5433IoA06.A07 = (float) d;
                    return;
                }
            case 21971:
                A05(i).A04 = (float) d;
                return;
            case 21972:
                A05(i).A05 = (float) d;
                return;
            case 21973:
                A05(i).A02 = (float) d;
                return;
            case 21974:
                A05(i).A03 = (float) d;
                return;
            case 21975:
                A05(i).A0B = (float) d;
                return;
            case 21976:
                C5433Io c5433IoA07 = A05(i);
                float f = (float) d;
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    A0u[7] = "0K";
                    c5433IoA07.A0C = f;
                    return;
                }
                throw new RuntimeException();
            case 21977:
                A05(i).A00 = (float) d;
                return;
            case 21978:
                A05(i).A01 = (float) d;
                return;
            case 30323:
                A05(i).A0A = (float) d;
                return;
            case 30324:
                A05(i).A08 = (float) d;
                return;
            case 30325:
                A05(i).A09 = (float) d;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x027f A[EDGE_INSN: B:123:0x027f->B:66:0x027f BREAK  A[LOOP:1: B:62:0x0248->B:127:0x0248], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x027f A[EDGE_INSN: B:124:0x027f->B:66:0x027f BREAK  A[LOOP:1: B:62:0x0248->B:127:0x0248], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x033a A[LOOP:4: B:89:0x0338->B:90:0x033a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x035c  */
    public final void A0U(int i, int i2, InterfaceC7263ms interfaceC7263ms) throws IOException {
        int i3;
        byte[] bArrA0l;
        int iCharAt;
        int totalSamplesSize;
        int i4;
        int i5;
        int timecode;
        int totalSamplesSize2 = 0;
        int i6 = 1;
        switch (i) {
            case 161:
            case 163:
                if (this.A05 == 0) {
                    this.A06 = (int) this.A0r.A05(interfaceC7263ms, false, true, 8);
                    this.A07 = this.A0r.A04();
                    String[] strArr = A0u;
                    if (strArr[5].length() == strArr[6].length()) {
                        this.A0D = -9223372036854775807L;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    } else {
                        String[] strArr2 = A0u;
                        strArr2[1] = "LCHoyUIFh4JbWXc3a57uog3rKRFOb5wV";
                        strArr2[0] = "47gJribS0awN4nsHBZkjm7XOEmPrRfLr";
                        this.A0D = -9223372036854775807L;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    }
                }
                C5433Io c5433Io = this.A0P.get(this.A06);
                if (c5433Io != null) {
                    c5433Io.A06();
                    if (this.A05 == 1) {
                        A0E(interfaceC7263ms, 3);
                        int byteValue = (this.A0l.A0l()[2] & 6) >> 1;
                        int i7 = 255;
                        if (byteValue != 0) {
                            A0E(interfaceC7263ms, 4);
                            int timecode2 = this.A0l.A0l()[3];
                            this.A03 = (timecode2 & 255) + 1;
                            int[] iArr = this.A0f;
                            int timecode3 = this.A03;
                            this.A0f = A0P(iArr, timecode3);
                            if (byteValue == 2) {
                                int timecode4 = this.A07;
                                int i8 = (i2 - timecode4) - 4;
                                int timecode5 = this.A03;
                                int i9 = i8 / timecode5;
                                int[] iArr2 = this.A0f;
                                int blockLacingSampleSize = this.A03;
                                Arrays.fill(iArr2, 0, blockLacingSampleSize, i9);
                            } else if (byteValue != 1) {
                                if (byteValue == 3) {
                                    int i10 = 0;
                                    int sampleIndex = 4;
                                    int i11 = 0;
                                    while (i11 < this.A03 - i6) {
                                        this.A0f[i11] = totalSamplesSize2;
                                        sampleIndex++;
                                        A0E(interfaceC7263ms, sampleIndex);
                                        C45944v c45944v = this.A0l;
                                        if (A0u[7].length() == 16) {
                                            break;
                                        } else {
                                            A0u[7] = "lQQ4f1MYxOwR1g4uON0whOI";
                                            if (c45944v.A0l()[sampleIndex - 1] != 0) {
                                                long j = 0;
                                                int i12 = 0;
                                                while (true) {
                                                    if (i12 < 8) {
                                                        int i13 = i6 << (7 - i12);
                                                        C45944v c45944v2 = this.A0l;
                                                        String[] strArr3 = A0u;
                                                        String str = strArr3[1];
                                                        String str2 = strArr3[0];
                                                        int iCharAt2 = str.charAt(1);
                                                        int lengthMask = str2.charAt(1);
                                                        if (iCharAt2 != lengthMask) {
                                                            A0u[3] = "6gmtIRdzQjg9uolj5CgbNQmEFE2eXosQ";
                                                            if ((c45944v2.A0l()[sampleIndex - 1] & i13) != 0) {
                                                                int totalSamplesSize3 = sampleIndex - 1;
                                                                sampleIndex += i12;
                                                                A0E(interfaceC7263ms, sampleIndex);
                                                                i3 = totalSamplesSize3 + 1;
                                                                int totalSamplesSize4 = this.A0l.A0l()[totalSamplesSize3] & i7;
                                                                int lengthMask2 = ~i13;
                                                                j = totalSamplesSize4 & lengthMask2;
                                                                while (i3 < sampleIndex) {
                                                                    int readPosition = i3 + 1;
                                                                    j = (j << 8) | ((long) (this.A0l.A0l()[i3] & i7));
                                                                    i3 = readPosition;
                                                                }
                                                                if (i11 > 0) {
                                                                    j -= (1 << ((i12 * 7) + 6)) - 1;
                                                                }
                                                            } else {
                                                                i12++;
                                                                i6 = 1;
                                                            }
                                                        } else if ((c45944v2.A0l()[sampleIndex - 1] & i13) != 0) {
                                                            int totalSamplesSize5 = sampleIndex - 1;
                                                            sampleIndex += i12;
                                                            A0E(interfaceC7263ms, sampleIndex);
                                                            i3 = totalSamplesSize5 + 1;
                                                            int totalSamplesSize6 = this.A0l.A0l()[totalSamplesSize5] & i7;
                                                            int lengthMask3 = ~i13;
                                                            j = totalSamplesSize6 & lengthMask3;
                                                            while (i3 < sampleIndex) {
                                                                int readPosition2 = i3 + 1;
                                                                j = (j << 8) | ((long) (this.A0l.A0l()[i3] & i7));
                                                                i3 = readPosition2;
                                                            }
                                                            if (i11 > 0) {
                                                                j -= (1 << ((i12 * 7) + 6)) - 1;
                                                            }
                                                        } else {
                                                            i12++;
                                                            i6 = 1;
                                                        }
                                                    }
                                                    if (j >= -2147483648L && j <= 2147483647L) {
                                                        int i14 = (int) j;
                                                        int[] iArr3 = this.A0f;
                                                        if (i11 != 0) {
                                                            i14 += this.A0f[i11 - 1];
                                                        }
                                                        iArr3[i11] = i14;
                                                        i10 += this.A0f[i11];
                                                        i11++;
                                                        i7 = 255;
                                                        totalSamplesSize2 = 0;
                                                        i6 = 1;
                                                    } else {
                                                        throw C44963K.A01(A06(578, 37, 14), null);
                                                    }
                                                }
                                            } else {
                                                throw C44963K.A01(A06(951, 33, 25), null);
                                            }
                                        }
                                    }
                                    this.A0f[this.A03 - 1] = ((i2 - this.A07) - sampleIndex) - i10;
                                } else {
                                    throw C44963K.A01(A06(1141, 25, 80) + byteValue, null);
                                }
                            } else {
                                int i15 = 0;
                                int i16 = 4;
                                int i17 = 0;
                                while (true) {
                                    int i18 = this.A03;
                                    if (A0u[3].charAt(5) != 'R') {
                                        if (i17 >= i18 - 1) {
                                        }
                                        this.A0f[i17] = 0;
                                        while (true) {
                                            i16++;
                                            A0E(interfaceC7263ms, i16);
                                            bArrA0l = this.A0l.A0l();
                                            String[] strArr4 = A0u;
                                            String str3 = strArr4[1];
                                            String str4 = strArr4[0];
                                            iCharAt = str3.charAt(1);
                                            totalSamplesSize = str4.charAt(1);
                                            if (iCharAt != totalSamplesSize) {
                                                String[] strArr5 = A0u;
                                                strArr5[1] = "QqySTVYSyUdR3w6zpaSbgPrcegDpRTeR";
                                                strArr5[0] = "gT3bwZtYi7wT97ycLVgitbKLuY9aoVNS";
                                                int totalSamplesSize7 = i16 - 1;
                                                i4 = bArrA0l[totalSamplesSize7] & 255;
                                                int[] iArr4 = this.A0f;
                                                int totalSamplesSize8 = iArr4[i17];
                                                iArr4[i17] = totalSamplesSize8 + i4;
                                                if (i4 != 255) {
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize9 = i16 - 1;
                                                i5 = bArrA0l[totalSamplesSize9] & 255;
                                                int[] iArr5 = this.A0f;
                                                int totalSamplesSize10 = iArr5[i17];
                                                iArr5[i17] = totalSamplesSize10 + i5;
                                                if (i5 != 255) {
                                                }
                                            }
                                            break;
                                        }
                                        int totalSamplesSize11 = this.A0f[i17];
                                        i15 += totalSamplesSize11;
                                        i17++;
                                    } else {
                                        String[] strArr6 = A0u;
                                        strArr6[1] = "uG7prxZBXLM0QG5e8GSw94nYMCP7upCE";
                                        strArr6[0] = "tV31aGArCsXy4K1N5Jjs7nQ9FZDzw28J";
                                        if (i17 >= i18 - 1) {
                                        }
                                        this.A0f[i17] = 0;
                                        while (true) {
                                            i16++;
                                            A0E(interfaceC7263ms, i16);
                                            bArrA0l = this.A0l.A0l();
                                            String[] strArr7 = A0u;
                                            String str5 = strArr7[1];
                                            String str6 = strArr7[0];
                                            iCharAt = str5.charAt(1);
                                            totalSamplesSize = str6.charAt(1);
                                            if (iCharAt != totalSamplesSize) {
                                                String[] strArr8 = A0u;
                                                strArr8[1] = "QqySTVYSyUdR3w6zpaSbgPrcegDpRTeR";
                                                strArr8[0] = "gT3bwZtYi7wT97ycLVgitbKLuY9aoVNS";
                                                int totalSamplesSize12 = i16 - 1;
                                                i4 = bArrA0l[totalSamplesSize12] & 255;
                                                int[] iArr6 = this.A0f;
                                                int totalSamplesSize13 = iArr6[i17];
                                                iArr6[i17] = totalSamplesSize13 + i4;
                                                if (i4 != 255) {
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize14 = i16 - 1;
                                                i5 = bArrA0l[totalSamplesSize14] & 255;
                                                int[] iArr7 = this.A0f;
                                                int totalSamplesSize15 = iArr7[i17];
                                                iArr7[i17] = totalSamplesSize15 + i5;
                                                if (i5 != 255) {
                                                }
                                            }
                                            break;
                                        }
                                        int totalSamplesSize16 = this.A0f[i17];
                                        i15 += totalSamplesSize16;
                                        i17++;
                                    }
                                }
                                int[] iArr8 = this.A0f;
                                int i19 = this.A03 - 1;
                                int totalSamplesSize17 = this.A07;
                                iArr8[i19] = ((i2 - totalSamplesSize17) - i16) - i15;
                            }
                        } else {
                            this.A03 = 1;
                            this.A0f = A0P(this.A0f, 1);
                            this.A0f[0] = (i2 - this.A07) - 3;
                        }
                        int lacing = this.A0l.A0l()[0];
                        this.A0F = this.A0G + A03((lacing << 8) | (this.A0l.A0l()[1] & 255));
                        int timecode6 = c5433Io.A0V;
                        if (timecode6 != 2) {
                            if (i == 163) {
                                byte[] bArrA0l2 = this.A0l.A0l();
                                String[] strArr9 = A0u;
                                String str7 = strArr9[1];
                                String str8 = strArr9[0];
                                int iCharAt3 = str7.charAt(1);
                                int timecode7 = str8.charAt(1);
                                if (iCharAt3 == timecode7) {
                                    throw new RuntimeException();
                                }
                                String[] strArr10 = A0u;
                                strArr10[1] = "Vc6YaXBr4sE6Z9Kledba3u83scjXoejR";
                                strArr10[0] = "GPxnjQ5uiYxzVhoi9JJVxDxAifN9s8px";
                                timecode = (bArrA0l2[2] & 128) == 128 ? 1 : 0;
                            }
                        }
                        int timecode8 = timecode != 0 ? 1 : 0;
                        this.A02 = timecode8;
                        this.A05 = 2;
                        this.A04 = 0;
                    }
                    if (i == 163) {
                        while (i < timecode) {
                            int[] iArr9 = this.A0f;
                            int timecode9 = this.A04;
                            int iA02 = A02(interfaceC7263ms, c5433Io, iArr9[timecode9], false);
                            c5433Io = c5433Io;
                            A0I(c5433Io, this.A0F + ((long) ((this.A04 * c5433Io.A0I) / 1000)), this.A02, iA02, 0);
                            this.A04++;
                            break;
                        }
                        this.A05 = 0;
                        return;
                    }
                    while (this.A04 < this.A03) {
                        this.A0f[this.A04] = A02(interfaceC7263ms, c5433Io, this.A0f[this.A04], true);
                        this.A04++;
                    }
                    return;
                }
                interfaceC7263ms.AK3(i2 - this.A07);
                this.A05 = 0;
                return;
            case 165:
                if (this.A05 != 2) {
                    return;
                }
                A0H(this.A0P.get(this.A06), this.A01, interfaceC7263ms, i2);
                return;
            case 16877:
                A0J(A05(i), interfaceC7263ms, i2);
                return;
            case 16981:
                A0D(i);
                this.A0T.A0m = new byte[i2];
                interfaceC7263ms.readFully(this.A0T.A0m, 0, i2);
                return;
            case 18402:
                byte[] bArr = new byte[i2];
                interfaceC7263ms.readFully(bArr, 0, i2);
                A05(i).A0a = new C5359Hb(1, bArr, 0, 0);
                return;
            case 21419:
                Arrays.fill(this.A0m.A0l(), (byte) 0);
                interfaceC7263ms.readFully(this.A0m.A0l(), 4 - i2, i2);
                this.A0m.A0f(0);
                this.A0C = (int) this.A0m.A0Q();
                return;
            case 25506:
                A0D(i);
                String[] strArr11 = A0u;
                if (strArr11[1].charAt(1) != strArr11[0].charAt(1)) {
                    A0u[3] = "vSk1rRCvXwYs114cFInjW7yvt4gWKzzv";
                    this.A0T.A0j = new byte[i2];
                    interfaceC7263ms.readFully(this.A0T.A0j, 0, i2);
                    return;
                }
                break;
            case 30322:
                A0D(i);
                this.A0T.A0l = new byte[i2];
                interfaceC7263ms.readFully(this.A0T.A0l, 0, i2);
                return;
            default:
                throw C44963K.A01(A06(1126, 15, 8) + i, null);
        }
        throw new RuntimeException();
    }

    public final void A0V(int i, long j) throws C44963K {
        String strA06 = A06(42, 14, 63);
        switch (i) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                A05(i).A0V = (int) j;
                return;
            case 136:
                A05(i).A0f = j == 1;
                return;
            case 155:
                this.A0D = A03(j);
                return;
            case 159:
                A05(i).A0E = (int) j;
                return;
            case 176:
                A05(i).A0W = (int) j;
                return;
            case 179:
                A0C(i);
                this.A0R.A04(A03(j));
                return;
            case 186:
                A05(i).A0M = (int) j;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                A05(i).A0R = (int) j;
                return;
            case 231:
                this.A0G = A03(j);
                return;
            case 238:
                this.A01 = (int) j;
                return;
            case 241:
                if (this.A0d) {
                    return;
                }
                A0C(i);
                this.A0Q.A04(j);
                this.A0d = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16871:
                A05(i).A0n = (int) j;
                return;
            case 16980:
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "siSTSWWHFDsKrirn3iU8fidRJrb4DuSX";
                    strArr2[0] = "o7Su23MSMUKyfq0AiKXYGeUTl03UpruG";
                    if (j == 3) {
                        return;
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[5] = "wDyyIq2mnN";
                    strArr3[6] = "u9jmr3hENDVfo4ybwkpsevoxR";
                    if (j == 3) {
                        return;
                    }
                }
                throw C44963K.A01(A06(426, 16, 25) + j + strA06, null);
            case 17029:
                if (j >= 1 && j <= 2) {
                    return;
                } else {
                    throw C44963K.A01(A06(559, 19, 27) + j + strA06, null);
                }
            case 17143:
                if (j == 1) {
                    return;
                } else {
                    throw C44963K.A01(A06(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 16, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + j + strA06, null);
                }
            case 18401:
                if (j == 5) {
                    return;
                } else {
                    throw C44963K.A01(A06(442, 15, 36) + j + strA06, null);
                }
            case 18408:
                if (j == 1) {
                    return;
                } else {
                    throw C44963K.A01(A06(113, 22, 77) + j + strA06, null);
                }
            case 20529:
                if (j == 0) {
                    return;
                } else {
                    throw C44963K.A01(A06(457, 21, 29) + j + strA06, null);
                }
            case 20530:
                if (j == 1) {
                    return;
                } else {
                    throw C44963K.A01(A06(478, 21, 16) + j + strA06, null);
                }
            case 21420:
                this.A0K = this.A0M + j;
                return;
            case 21432:
                int i2 = (int) j;
                A0D(i);
                switch (i2) {
                    case 0:
                        this.A0T.A0U = 0;
                        return;
                    case 1:
                        this.A0T.A0U = 2;
                        return;
                    case 3:
                        this.A0T.A0U = 1;
                        return;
                    case 15:
                        this.A0T.A0U = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                A05(i).A0L = (int) j;
                return;
            case 21682:
                A05(i).A0K = (int) j;
                return;
            case 21690:
                A05(i).A0J = (int) j;
                return;
            case 21930:
                A05(i).A0g = j == 1;
                return;
            case 21945:
                A0D(i);
                switch ((int) j) {
                    case 1:
                        C5433Io c5433Io = this.A0T;
                        if (A0u[7].length() != 16) {
                            String[] strArr4 = A0u;
                            strArr4[1] = "46IydxS7gy6otlVQjCqCZWblmnAwVrZG";
                            strArr4[0] = "ABdhU4etfaEDzGqzhVxfZNO7CdkZTY0J";
                            c5433Io.A0F = 2;
                            return;
                        }
                        c5433Io.A0F = 2;
                        return;
                    case 2:
                        this.A0T.A0F = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                A0D(i);
                int iA01 = ColorInfo.A01((int) j);
                if (iA01 == -1) {
                    return;
                }
                this.A0T.A0H = iA01;
                return;
            case 21947:
                A0D(i);
                this.A0T.A0h = true;
                int iA00 = ColorInfo.A00((int) j);
                if (iA00 == -1) {
                    return;
                }
                this.A0T.A0G = iA00;
                return;
            case 21948:
                A05(i).A0O = (int) j;
                return;
            case 21949:
                A05(i).A0P = (int) j;
                return;
            case 21998:
                A05(i).A0N = (int) j;
                return;
            case 22186:
                A05(i).A0X = j;
                return;
            case 22203:
                A05(i).A0Y = j;
                return;
            case 25188:
                A05(i).A0D = (int) j;
                return;
            case 30114:
                this.A0E = j;
                return;
            case 30321:
                A0D(i);
                switch ((int) j) {
                    case 0:
                        this.A0T.A0S = 0;
                        return;
                    case 1:
                        this.A0T.A0S = 1;
                        return;
                    case 2:
                        this.A0T.A0S = 2;
                        return;
                    case 3:
                        this.A0T.A0S = 3;
                        return;
                    default:
                        return;
                }
            case 2352003:
                C5433Io c5433IoA05 = A05(i);
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[3] = "17DkRR24xbcR08jR5ve3iaIolPHvV07P";
                c5433IoA05.A0I = (int) j;
                return;
            case 2807729:
                this.A0O = j;
                return;
            default:
                return;
        }
    }

    public final void A0W(int i, long j, long j2) throws C44963K {
        A09();
        switch (i) {
            case 160:
                this.A0W = false;
                this.A0E = 0L;
                return;
            case 174:
                this.A0T = new C5433Io();
                return;
            case 187:
                this.A0d = false;
                return;
            case 19899:
                this.A0C = -1;
                this.A0K = -1L;
                return;
            case 20533:
                A05(i).A0i = true;
                return;
            case 21968:
                A05(i).A0h = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                if (this.A0M == -1 || this.A0M == j) {
                    this.A0M = j;
                    this.A0N = j2;
                    return;
                }
                throw C44963K.A01(A06(886, 39, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), null);
            case 475249515:
                this.A0R = new C45804h();
                this.A0Q = new C45804h();
                return;
            case 524531317:
                if (this.A0e) {
                    return;
                }
                if (this.A0s && this.A0H != -1) {
                    this.A0c = true;
                    return;
                } else {
                    this.A0S.AJ7(new C7258mn(this.A0J));
                    this.A0e = true;
                    return;
                }
        }
    }

    @MetaExoPlayerCustomization("Adding support for AR/VR TAGs")
    public final void A0X(int i, String str) throws C44963K {
        switch (i) {
            case 134:
                A05(i).A0d = str;
                return;
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                if (!A06(1375, 4, 110).equals(str) && !A06(1357, 8, 67).equals(str)) {
                    throw C44963K.A01(A06(551, 8, 69) + str + A06(42, 14, 63), null);
                }
                return;
            case 17827:
                this.A0U = str;
                return;
            case 21358:
                C5433Io c5433IoA05 = A05(i);
                if (A0u[7].length() != 16) {
                    String[] strArr = A0u;
                    strArr[1] = "fMu5gmFUMMjyE5zZcj2yfEtnORci9Tka";
                    strArr[0] = "H9jO6y53WPcXDhmRgvdqczqosoX1IojD";
                    c5433IoA05.A0e = str;
                    return;
                }
                throw new RuntimeException();
            case 2274716:
                A05(i).A0o = str;
                return;
            default:
                return;
        }
    }

    public final boolean A0Y(int i) {
        if (i != 357149030 && i != 524531317) {
            String[] strArr = A0u;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[5] = "AFdTkHzIX2";
            strArr2[6] = "QjCHXWDM6RodCI1HM4Zn3pBBf";
            if (i != 475249515 && i != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AAC(InterfaceC5332HA interfaceC5332HA) {
        this.A0S = interfaceC5332HA;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final int AHL(InterfaceC7263ms interfaceC7263ms, C5353HV c5353hv) throws IOException {
        this.A0X = false;
        boolean zAHO = true;
        while (zAHO && !this.A0X) {
            zAHO = this.A0q.AHO(interfaceC7263ms);
            if (zAHO && A0L(c5353hv, interfaceC7263ms.A8n())) {
                return 1;
            }
        }
        if (zAHO) {
            return 0;
        }
        for (int i = 0; i < i; i++) {
            C5433Io c5433IoValueAt = this.A0P.valueAt(i);
            c5433IoValueAt.A06();
            c5433IoValueAt.A0E();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final void AJ6(long j, long j2) {
        this.A0G = -9223372036854775807L;
        this.A05 = 0;
        this.A0q.reset();
        this.A0r.A06();
        A0A();
        for (int i = 0; i < i; i++) {
            this.A0P.valueAt(i).A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5331H9
    public final boolean AK5(InterfaceC7263ms interfaceC7263ms) throws IOException {
        return new C5434Ip().A01(interfaceC7263ms);
    }
}
