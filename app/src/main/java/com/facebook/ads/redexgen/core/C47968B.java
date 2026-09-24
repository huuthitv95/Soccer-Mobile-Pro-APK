package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Log;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8B */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47968B implements InterfaceC7408pF {
    public static byte[] A0M;
    public static String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public InterfaceC7408pF A06;
    public C46435i A07;
    public C46435i A08;

    @MetaExoPlayerCustomization
    public C5652ML A09;
    public C5666MZ A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC7408pF A0D;
    public final InterfaceC7408pF A0E;
    public final InterfaceC7408pF A0F;
    public final InterfaceC5656MP A0G;
    public final InterfaceC5659MS A0H;
    public final InterfaceC5665MY A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A0N[4].length() == 12) {
                throw new RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{Ascii.f22491EM, 59, 57, 50, 63, Ascii.f22498RS, 59, 46, 59, 9, 53, 47, 40, 57, 63, Ascii.SYN, 58, 32, 57, 49, 59, 114, 33, 117, 32, 37, 49, 52, 33, 48, 117, 39, 48, 49, 60, 39, 48, 54, 33, 48, 49, 117, 0, 7, Ascii.f22493FS, 123, 117, 1, Base64.padSymbol, 60, 38, 117, 56, 60, 50, Base64.padSymbol, 33, 117, 54, 52, 32, 38, 48, 117, 39, 48, 57, 52, 33, 60, 35, 48, 117, 0, 7, Ascii.f22493FS, 38, 117, 50, 48, 33, 117, 39, 48, 38, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, 39, 39, 48, 54, 33, 57, 44, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AGi(C46435i c46435i) throws IOException {
        try {
            String strA4l = this.A0I.A4l(c46435i);
            C46435i c46435iA09 = c46435i.A04().A08(strA4l).A09();
            this.A08 = c46435iA09;
            this.A05 = A01(this.A0G, strA4l, c46435iA09.A06);
            this.A03 = c46435i.A04;
            this.A09 = new C5652ML(c46435i.A07);
            this.A0B = A00(c46435i) != -1;
            boolean z = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = AbstractC5676Mj.A00(this.A0G.A7S(strA4l));
                if (this.A00 != -1) {
                    this.A00 -= c46435i.A04;
                    if (this.A00 < 0) {
                        throw new C46365b(2008);
                    }
                }
            }
            boolean z2 = c46435i.A07.A08 <= 0 && c46435i.A07.A07 <= 0;
            if (c46435i.A03 != -1) {
                this.A00 = this.A00 == -1 ? c46435i.A03 : Math.min(this.A00, c46435i.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(c46435iA09, false, z2);
            }
            return c46435i.A03 != -1 ? c46435i.A03 : this.A00;
        } catch (Throwable th) {
            A09(th);
            throw th;
        }
    }

    static {
        A05();
    }

    public C47968B(InterfaceC5656MP interfaceC5656MP, InterfaceC7408pF interfaceC7408pF, InterfaceC7408pF interfaceC7408pF2, InterfaceC46315W interfaceC46315W, InterfaceC5665MY interfaceC5665MY, int i, AbstractC45153d abstractC45153d, int i2, InterfaceC5659MS interfaceC5659MS) {
        this.A0G = interfaceC5656MP;
        this.A0D = interfaceC7408pF2;
        this.A0I = interfaceC5665MY == null ? InterfaceC5665MY.A00 : interfaceC5665MY;
        this.A0J = (i & 1) != 0;
        this.A0L = (i & 2) != 0;
        this.A0K = (i & 4) != 0;
        if (interfaceC7408pF != null) {
            interfaceC7408pF = abstractC45153d != null ? new C4908AH(interfaceC7408pF, abstractC45153d, i2) : interfaceC7408pF;
            this.A0F = interfaceC7408pF;
            this.A0E = interfaceC46315W != null ? new C4906AF(interfaceC7408pF, interfaceC46315W) : null;
        } else {
            this.A0F = C4909AI.A02;
            this.A0E = null;
        }
        this.A0H = interfaceC5659MS;
    }

    private int A00(C46435i c46435i) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && c46435i.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC5656MP interfaceC5656MP, String str, Uri redirectedUri) {
        Uri redirectedUri2 = AbstractC5676Mj.A01(interfaceC5656MP.A7S(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    InterfaceC5656MP interfaceC5656MP = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        interfaceC5656MP.AHg(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AHg(this.A0A);
                this.A0A = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A7A();
            throw new NullPointerException(A02(103, 17, 44));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    @MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    private void A06(C46435i c46435i, boolean z, boolean z2) throws Throwable {
        C5666MZ c5666mzAKA;
        long jMin;
        C46435i c46435iA09;
        InterfaceC7408pF interfaceC7408pF;
        long j;
        Uri uri;
        long j2;
        String str = (String) AbstractC46115C.A0f(c46435i.A08);
        EnumC5654MN enumC5654MN = z2 ? EnumC5654MN.A03 : EnumC5654MN.A06;
        if (this.A0B) {
            c5666mzAKA = null;
        } else if (this.A0J) {
            try {
                c5666mzAKA = this.A0G.AKA(str, this.A03, this.A00, enumC5654MN);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            str = str;
            c5666mzAKA = this.A0G.AKB(str, this.A03, this.A00, enumC5654MN);
        }
        if (c5666mzAKA == null) {
            interfaceC7408pF = this.A0F;
            c46435iA09 = c46435i.A04().A04(this.A03).A03(this.A00).A07(this.A09).A09();
        } else {
            boolean z3 = c5666mzAKA.A05;
            String[] strArr = A0N;
            if (strArr[0].charAt(4) == strArr[7].charAt(4)) {
                A0N[5] = "u32inRltH66jjh9yXIb3cYFcwSkjtAHW";
                if (z3) {
                    Uri uriFromFile = Uri.fromFile((File) AbstractC46115C.A0f(c5666mzAKA.A03));
                    long j3 = c5666mzAKA.A02;
                    long j4 = this.A03 - j3;
                    long jMin2 = c5666mzAKA.A01 - j4;
                    if (this.A00 != -1) {
                        jMin2 = Math.min(jMin2, this.A00);
                    }
                    c46435iA09 = c46435i.A04().A06(uriFromFile).A05(j3).A04(j4).A03(jMin2).A07(this.A09).A09();
                    interfaceC7408pF = this.A0D;
                } else {
                    if (c5666mzAKA.A04()) {
                        jMin = this.A00;
                    } else {
                        jMin = c5666mzAKA.A01;
                        if (this.A00 != -1) {
                            jMin = Math.min(jMin, this.A00);
                        }
                    }
                    c46435iA09 = c46435i.A04().A04(this.A03).A03(jMin).A07(this.A09).A09();
                    if (this.A0E != null) {
                        interfaceC7408pF = this.A0E;
                    } else {
                        interfaceC7408pF = this.A0F;
                        this.A0G.AHg(c5666mzAKA);
                        c5666mzAKA = null;
                    }
                }
            }
            throw new RuntimeException();
        }
        boolean z4 = this.A0B;
        if (A0N[5].charAt(3) == 'i') {
            String[] strArr2 = A0N;
            strArr2[0] = "KvC0Ia1A4x1eGi9X8aRBDgkMlzCJszIJ";
            strArr2[7] = "nNrFIIpUFsn1fqvNydhqNDEn907tEQAg";
            if (!z4 && interfaceC7408pF == this.A0F) {
                j = this.A03 + 102400;
            } else {
                j = Long.MAX_VALUE;
            }
            this.A01 = j;
            if (z) {
                AbstractC45353y.A08(A0A());
                InterfaceC7408pF interfaceC7408pF2 = this.A0F;
                if (A0N[3].charAt(26) == 'u') {
                    Throwable e = new RuntimeException();
                    throw e;
                }
                A0N[5] = "8XoiTPgLcR8ApVu7jrAIE2ygde6TsOz1";
                if (interfaceC7408pF == interfaceC7408pF2) {
                    return;
                }
                try {
                    A03();
                } catch (Throwable th) {
                    if (((C5666MZ) AbstractC46115C.A0f(c5666mzAKA)).A03()) {
                        this.A0G.AHg(c5666mzAKA);
                    }
                    throw th;
                }
            }
            if (c5666mzAKA != null && c5666mzAKA.A03()) {
                this.A0A = c5666mzAKA;
            }
            this.A06 = interfaceC7408pF;
            this.A07 = c46435iA09;
            this.A02 = 0L;
            long jAGi = interfaceC7408pF.AGi(c46435iA09);
            C5678Ml c5678Ml = new C5678Ml();
            if (c46435iA09.A03 == -1) {
                if (A0N[4].length() != 12) {
                    A0N[3] = "AihO48tXyqmUqd3oId9EAGnNfKcJ6kuS";
                    if (jAGi != -1) {
                        this.A00 = jAGi;
                        j2 = this.A03 + this.A00;
                        if (A0N[5].charAt(3) != 'i') {
                            throw new RuntimeException();
                        }
                        A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
                        C5678Ml.A00(c5678Ml, j2);
                    }
                } else if (jAGi != -1) {
                    this.A00 = jAGi;
                    j2 = this.A03 + this.A00;
                    if (A0N[5].charAt(3) != 'i') {
                        throw new RuntimeException();
                    }
                    A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
                    C5678Ml.A00(c5678Ml, j2);
                }
            }
            if (A0C()) {
                this.A05 = interfaceC7408pF.A9P();
                boolean isRedirected = !c46435i.A06.equals(this.A05);
                if (A0N[4].length() != 12) {
                    A0N[4] = "aty3owKlrPhsH";
                    if (isRedirected) {
                        uri = this.A05;
                    } else {
                        uri = null;
                    }
                    C5678Ml.A01(c5678Ml, uri);
                }
            }
            if (A0D()) {
                this.A0G.A4E(str, c5678Ml);
            }
            A08(str, this.A05);
            return;
        }
        throw new RuntimeException();
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            C5678Ml c5678Ml = new C5678Ml();
            C5678Ml.A00(c5678Ml, this.A03);
            this.A0G.A4E(str, c5678Ml);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        C5678Ml c5678Ml = new C5678Ml();
        if (!uri.equals(this.A05)) {
            Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            C5678Ml.A01(c5678Ml, uri2);
        } else {
            C5678Ml.A01(c5678Ml, null);
        }
        try {
            this.A0G.A4E(str, c5678Ml);
        } catch (C5653MM e) {
            String message = A02(15, 88, 73);
            Log.w(A02(0, 15, 70), message, e);
        }
    }

    private void A09(Throwable th) {
        if (A0B() || (th instanceof C5653MM)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final InterfaceC5656MP A0E() {
        return this.A0G;
    }

    public final InterfaceC5665MY A0F() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final void A43(InterfaceC46545t interfaceC46545t) {
        AbstractC45353y.A01(interfaceC46545t);
        this.A0D.A43(interfaceC46545t);
        this.A0F.A43(interfaceC46545t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final Map<String, List<String>> A8t() {
        if (A0C()) {
            return this.A0F.A8t();
        }
        return Collections.emptyMap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final Uri A9P() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7408pF
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e) {
            A09(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC44562c
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        C46435i currentDataSpec = (C46435i) AbstractC45353y.A01(this.A08);
        C46435i c46435i = (C46435i) AbstractC45353y.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
            try {
                int bytesRead = ((InterfaceC7408pF) AbstractC45353y.A01(this.A06)).read(bArr, i, i2);
                if (bytesRead != -1) {
                    if (A0B()) {
                        this.A04 += (long) bytesRead;
                    }
                    this.A03 += (long) bytesRead;
                    this.A02 += (long) bytesRead;
                    if (this.A00 != -1) {
                        this.A00 -= (long) bytesRead;
                    }
                } else if (A0C() && (c46435i.A03 == -1 || this.A02 < c46435i.A03)) {
                    A07((String) AbstractC46115C.A0f(currentDataSpec.A08));
                } else if (this.A00 > 0 || this.A00 == -1) {
                    A03();
                    A06(currentDataSpec, false, false);
                    return read(bArr, i, i2);
                }
                return bytesRead;
            } catch (Throwable th) {
                e = th;
                A09(e);
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
        }
    }
}
