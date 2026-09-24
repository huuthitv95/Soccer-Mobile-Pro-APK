package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4902AB implements Handler.Callback, InterfaceC7322nq, InterfaceC5194Ev, InterfaceC5071Cw, InterfaceC46866P, InterfaceC47607b {
    public static byte[] A0x;
    public static String[] A0y = {"EvYOBb0fNCsu7OcAaOZNwoEPwn2", "8jIqnMhTOhQ3fU", "vmW", "edZR1F4oYcKYyzs7tUfX3dHGMGqqrKBY", "TI8UsWNSVk9Jh7srInWeHwVEqkc209d4", "AVB8fiMNMM9Dy8Zuh880FwllBoFt5PF1", "1mkHXRje2n0Pvvw2j", "LF2w13BN71krhrKRtprOb2x3jYcy1FYO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A06;
    public C47066j A07;
    public C47106n A08;
    public C47587Z A0A;

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public InterfaceC7381oo A0B;
    public C47797u A0C;
    public InterfaceC5072Cx A0D;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0K;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public InterfaceC7381oo[] A0W;
    public final long A0Y;
    public final long A0Z;
    public final Handler A0a;
    public final HandlerThread A0b;
    public final C7439pl A0c;
    public final C7437pj A0d;
    public final InterfaceC454245 A0e;
    public final InterfaceC45704X A0f;
    public final C7389ow A0g;
    public final C47096m A0h;
    public final InterfaceC472774 A0i;
    public final C7377ok A0k;
    public final AbstractC5195Ew A0l;
    public final C5196Ex A0m;
    public final InterfaceC5205F6 A0n;
    public final C48729g A0o;
    public final ArrayList<C47086l> A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final InterfaceC7381oo[] A0v;
    public final InterfaceC47747p[] A0w;
    public long A05 = -9223372036854775807L;

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public EnumC7031ir A0E = EnumC7031ir.A09;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public boolean A0J = false;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public C47557W A09 = null;

    @MetaExoPlayerCustomization("D63737392: Added for negative testing")
    public boolean A0L = false;

    @MetaExoPlayerCustomization("D71523094: Added for negative testing")
    public Integer A0F = null;
    public final C47377E A0j = new C47377E();

    @MetaExoPlayerCustomization
    public final int A0X = A00();

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0x, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "wOV";
            strArr[6] = "lGv9KfQpa0xBFnWlu";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:142:0x030f  */
    /* JADX WARN: Code duplicated, block: B:145:0x031b  */
    /* JADX WARN: Code duplicated, block: B:150:0x032a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0380  */
    /* JADX WARN: Code duplicated, block: B:178:0x0396  */
    /* JADX WARN: Code duplicated, block: B:180:0x039c  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x043a A[EDGE_INSN: B:231:0x043a->B:216:0x043a BREAK  A[LOOP:0: B:10:0x0060->B:67:0x0190], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01de  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03ab, code lost:
    
        r24.A0R = r24.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03bb, code lost:
    
        if (com.facebook.ads.redexgen.core.C4902AB.A0y[5].charAt(1) == 'q') goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03bd, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C4902AB.A0y;
        r2[4] = "Uyz0TdICBPSSMiRUHh3H6S4m2yqjGOAg";
        r2[3] = "3B1Lhsj2yRloVQBWBzqqqLZ9kauiXzuH";
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03cb, code lost:
    
        if (r24.A0B == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03d4, code lost:
    
        if (r24.A0B.A9N() != 1) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d6, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03d7, code lost:
    
        A0W(2, r8);
        A0O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044b, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 25
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0F() throws com.facebook.ads.redexgen.core.C4904AD, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C4902AB.A0F():void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x020f  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0P() throws C4904AD, IOException {
        boolean zA00;
        boolean z;
        if (this.A0D == null) {
            return;
        }
        if (this.A02 > 0) {
            this.A0D.ACT();
            return;
        }
        A0J();
        C47337A c47337aA0E = this.A0j.A0E();
        if (c47337aA0E != null && !c47337aA0E.A0R()) {
            boolean z2 = this.A0A.A0A;
            if (A0y[1].length() != 31) {
                A0y[5] = "JakbFE5sCqyiHPWhcmq5QKrahWaBlD8R";
                if (!z2) {
                    A0w(false);
                }
            }
            throw new RuntimeException();
        }
        A0y(false);
        if (this.A0j.A0N()) {
            C47337A c47337aA0F = this.A0j.A0F();
            C47337A c47337aA0G = this.A0j.A0G();
            boolean z3 = false;
            while (this.A0P && c47337aA0F != c47337aA0G && this.A06 >= c47337aA0F.A0I().A0H(this.A0K)) {
                if (z3) {
                    A0H();
                }
                int i = c47337aA0F.A00.A07 ? 0 : 3;
                C47337A c47337a = c47337aA0F;
                c47337aA0F = this.A0j.A0B();
                A0g(c47337a);
                C47587Z c47587z = this.A0A;
                C7320no c7320no = c47337aA0F.A00.A04;
                long j = c47337aA0F.A00.A03;
                if (A0y[7].charAt(12) == '2') {
                    throw new RuntimeException();
                }
                String[] strArr = A0y;
                strArr[4] = "OGZbExKcucXIKKZQBdHGOATJ9dYdrwhN";
                strArr[3] = "TJxPjvISq11gHqp4fguKhlEOGAavfVmH";
                this.A0A = c47587z.A06(c7320no, j, c47337aA0F.A00.A02, A01());
                this.A0h.A04(i);
                A0Q();
                z3 = true;
            }
            C47347B c47347b = c47337aA0G.A00;
            String[] strArr2 = A0y;
            if (strArr2[4].charAt(1) != strArr2[3].charAt(1)) {
                A0y[7] = "WHxPanRASNJPtq4bnE3dJm5Kco7OvEcN";
                if (c47347b.A05) {
                    for (int i2 = 0; i2 < this.A0v.length; i2++) {
                        InterfaceC7381oo interfaceC7381oo = this.A0v[i2];
                        InterfaceC5104DT interfaceC5104DT = c47337aA0G.A09[i2];
                        if (interfaceC5104DT != null && interfaceC7381oo.A9D() == interfaceC5104DT && interfaceC7381oo.A9p()) {
                            interfaceC7381oo.AJN();
                        }
                    }
                    return;
                }
                if (c47337aA0G.A0I() == null) {
                    return;
                }
                C47337A c47337aA0I = c47337aA0G.A0I();
                String[] strArr3 = A0y;
                if (strArr3[4].charAt(1) != strArr3[3].charAt(1)) {
                    A0y[7] = "aMxVvZtAQBe9jxU0Z4NX1LXmsoJEfXr7";
                    if (c47337aA0I.A02) {
                        for (int i3 = 0; i3 < this.A0v.length; i3++) {
                            InterfaceC7381oo interfaceC7381oo2 = this.A0v[i3];
                            InterfaceC5104DT interfaceC5104DT2 = c47337aA0G.A09[i3];
                            if (interfaceC7381oo2.A9D() != interfaceC5104DT2) {
                                return;
                            }
                            if (interfaceC5104DT2 != null && !interfaceC7381oo2.A9p()) {
                                return;
                            }
                        }
                        C5196Ex c5196ExA0K = c47337aA0G.A0K();
                        C47337A c47337aA0C = this.A0j.A0C();
                        C5196Ex c5196ExA0K2 = c47337aA0C.A0K();
                        boolean z4 = c47337aA0C.A07.AHQ() != -9223372036854775807L;
                        for (int i4 = 0; i4 < this.A0v.length; i4++) {
                            InterfaceC7381oo interfaceC7381oo3 = this.A0v[i4];
                            if (c5196ExA0K.A00(i4)) {
                                if (z4) {
                                    interfaceC7381oo3.AJN();
                                } else {
                                    boolean zAAN = interfaceC7381oo3.AAN();
                                    if (A0y[0].length() != 16) {
                                        A0y[1] = "9mAYXkFxI0mZazBGslnkswropOC4T";
                                        if (zAAN) {
                                            continue;
                                        } else {
                                            InterfaceC7284nE interfaceC7284nE = c5196ExA0K2.A04[i4];
                                            zA00 = c5196ExA0K2.A00(i4);
                                            if (this.A0w[i4].A9N() == -2) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            C47777s c47777s = c5196ExA0K.A03[i4];
                                            C47777s c47777s2 = c5196ExA0K2.A03[i4];
                                            if (A0y[1].length() != 31) {
                                                throw new RuntimeException();
                                            }
                                            A0y[1] = "R6UwS9N6ly40SGlMhcEQ765TyuQep";
                                            if (zA00 || !c47777s2.equals(c47777s) || z) {
                                                interfaceC7381oo3.AJN();
                                            } else {
                                                C7472qI[] c7472qIArrA1A = A1A(interfaceC7284nE);
                                                Log.e(A0D(0, 21, 22), A0D(392, 13, 67));
                                                interfaceC7381oo3.AIa(c7472qIArrA1A, c47337aA0C.A09[i4], c47337aA0C.A0H(this.A0K), c47337aA0C.A0B());
                                            }
                                        }
                                    } else {
                                        A0y[0] = "RavyRccOc8FddTyMpAZEZ";
                                        if (zAAN) {
                                            continue;
                                        } else {
                                            InterfaceC7284nE interfaceC7284nE2 = c5196ExA0K2.A04[i4];
                                            zA00 = c5196ExA0K2.A00(i4);
                                            if (this.A0w[i4].A9N() == -2) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            C47777s c47777s3 = c5196ExA0K.A03[i4];
                                            C47777s c47777s4 = c5196ExA0K2.A03[i4];
                                            if (A0y[1].length() != 31) {
                                                throw new RuntimeException();
                                            }
                                            A0y[1] = "R6UwS9N6ly40SGlMhcEQ765TyuQep";
                                            if (zA00) {
                                                interfaceC7381oo3.AJN();
                                            } else {
                                                interfaceC7381oo3.AJN();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    public static void A0R() {
        A0x = new byte[]{-108, -57, -66, -97, -69, -80, -56, -76, -63, -104, -68, -65, -69, -104, -67, -61, -76, -63, -67, -80, -69, -15, 36, Ascii.ESC, -4, Ascii.CAN, Ascii.f22490CR, 37, 17, Ascii.f22498RS, -11, Ascii.f22491EM, Ascii.f22493FS, Ascii.CAN, -11, Ascii.SUB, 32, 17, Ascii.f22498RS, Ascii.SUB, Ascii.f22490CR, Ascii.CAN, -26, -12, Ascii.f22490CR, Ascii.SUB, Ascii.DLE, Ascii.CAN, 17, Ascii.f22498RS, -87, -57, -50, -49, -46, -55, -50, -57, -128, -51, -59, -45, -45, -63, -57, -59, -45, -128, -45, -59, -50, -44, -128, -63, -58, -44, -59, -46, -128, -46, -59, -52, -59, -63, -45, -59, -114, -107, -70, -64, -79, -66, -70, -83, -72, 108, -66, -63, -70, -64, -75, -71, -79, 108, -79, -66, -66, -69, -66, 122, -54, -26, -37, -13, -36, -37, -35, -27, -102, -33, -20, -20, -23, -20, -88, -114, -86, -97, -73, -96, -97, -95, -87, -114, -83, -79, -89, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, 106, 94, -96, -77, -92, -92, -93, -80, -93, -94, -126, -77, -80, -97, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, 106, 94, -84, -93, -74, -78, -118, -83, -97, -94, -114, -83, -79, -89, -78, -89, -83, -84, -117, -79, 120, 94, 99, -94, -76, -48, -42, -45, -60, -58, -127, -58, -45, -45, -48, -45, -113, -72, -39, -44, -43, -123, -53, -58, -50, -47, -54, -55, -109, -78, -97, -91, -84, -67, -59, -56, -57, -54, -71, -54, -63, -60, -47, 120, -63, -65, -58, -57, -54, -63, -58, -65, 120, -53, -52, -54, -67, -71, -59, 120, -67, -54, -54, -57, -54, -110, 120, -108, -78, -71, -87, -82, -89, 96, -76, -81, 96, -77, -91, -82, -92, 96, -83, -91, -77, -77, -95, -89, -91, 96, -81, -82, 96, -95, 96, -92, -91, -95, -92, 96, -76, -88, -78, -91, -95, -92, 110, 5, Ascii.f22498RS, Ascii.NAK, 40, 32, Ascii.NAK, 19, 36, Ascii.NAK, Ascii.DC4, -48, Ascii.NAK, 34, 34, Ascii.f22502US, 34, -48, Ascii.DC4, Ascii.NAK, Ascii.f22493FS, Ascii.f22491EM, 38, Ascii.NAK, 34, Ascii.f22491EM, Ascii.f22498RS, Ascii.ETB, -48, Ascii.f22494GS, Ascii.NAK, 35, 35, 17, Ascii.ETB, Ascii.NAK, -48, Ascii.f22502US, Ascii.f22498RS, -48, Ascii.NAK, 40, 36, Ascii.NAK, 34, Ascii.f22498RS, 17, Ascii.f22493FS, -48, 36, Ascii.CAN, 34, Ascii.NAK, 17, Ascii.DC4, -34, -34, -23, -51, -23, -25, -33, -47, -23, -20, -27, 37, Ascii.f22494GS, Ascii.f22493FS, 33, Ascii.f22491EM, 8, Ascii.f22494GS, 42, 33, 39, Ascii.f22493FS, 1, Ascii.f22493FS, -70, -81, -68, -77, -71, -82, -102, -71, -67, -77, -66, -77, -71, -72, -97, -67, -18, -31, -20, -24, -35, -33, -31, -49, -16, -18, -31, -35, -23};
    }

    /* JADX WARN: Code duplicated, block: B:84:0x021b A[PHI: r8
  0x021b: PHI (r8v4 com.facebook.ads.redexgen.X.no) = (r8v2 com.facebook.ads.redexgen.X.no), (r8v6 com.facebook.ads.redexgen.X.no) binds: [B:93:0x024d, B:83:0x0219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x022b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0231  */
    /* JADX WARN: Code duplicated, block: B:91:0x0245  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0e(C47076k c47076k) throws C4904AD {
        C7320no c7320no;
        C7320no c7320noA0K;
        long j;
        if (c47076k.A01 != this.A0D) {
            return;
        }
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c47076k.A00;
        this.A0A = this.A0A.A04(timeline2);
        A0M();
        if (this.A02 > 0) {
            this.A0h.A03(this.A02);
            this.A02 = 0;
            if (this.A08 != null) {
                Pair<Object, Long> pairA09 = A09(this.A08, true);
                this.A08 = null;
                if (pairA09 == null) {
                    A0G();
                    return;
                }
                Object obj = pairA09.first;
                long jLongValue = ((Long) pairA09.second).longValue();
                C7320no c7320noA0K2 = this.A0j.A0K(timeline2, obj, jLongValue);
                this.A0A = this.A0A.A06(c7320noA0K2, c7320noA0K2.A00() ? 0L : jLongValue, jLongValue, this.A0A.A0D);
                return;
            }
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "O4I";
            strArr[6] = "ahZa31gq0LeVPqA4e";
            if (0 != 0) {
                throw new NullPointerException(A0D(376, 16, 17));
            }
            if (this.A0A.A02 == -9223372036854775807L) {
                if (timeline2.A0N()) {
                    A0G();
                    return;
                }
                Pair<Object, Long> pairA08 = A08(timeline2, timeline2.A0B(this.A0V), -9223372036854775807L);
                Object obj2 = pairA08.first;
                long jLongValue2 = ((Long) pairA08.second).longValue();
                C7320no c7320noA0K3 = this.A0j.A0K(timeline2, obj2, jLongValue2);
                C47587Z c47587z = this.A0A;
                String[] strArr2 = A0y;
                if (strArr2[2].length() == strArr2[6].length()) {
                    throw new RuntimeException();
                }
                A0y[0] = "JR6dPBbFHW2aBR0iQ91GP51A";
                this.A0A = c47587z.A06(c7320noA0K3, c7320noA0K3.A00() ? 0L : jLongValue2, jLongValue2, this.A0A.A0D);
                return;
            }
            return;
        }
        Object obj3 = this.A0A.A05.A04;
        long j2 = this.A0A.A01;
        if (timeline.A0N()) {
            if (timeline2.A0N()) {
                return;
            }
            C7320no c7320noA0K4 = this.A0j.A0K(timeline2, obj3, j2);
            this.A0A = this.A0A.A06(c7320noA0K4, c7320noA0K4.A00() ? 0L : j2, j2, this.A0A.A0D);
            return;
        }
        C47337A c47337aA0D = this.A0j.A0D();
        Object obj4 = c47337aA0D == null ? this.A0A.A05.A04 : c47337aA0D.A08;
        int iA0A = timeline2.A0A(obj4);
        if (iA0A == -1) {
            Object objA0C = A0C(obj4, timeline, timeline2);
            if (objA0C == null) {
                A0G();
                return;
            }
            Pair<Object, Long> pairA010 = A08(timeline2, timeline2.A0J(objA0C, this.A0c).A00, -9223372036854775807L);
            Object obj5 = pairA010.first;
            long jLongValue3 = ((Long) pairA010.second).longValue();
            C7320no c7320noA0K5 = this.A0j.A0K(timeline2, obj5, jLongValue3);
            if (c47337aA0D != null) {
                while (c47337aA0D.A0I() != null) {
                    c47337aA0D = c47337aA0D.A0I();
                    if (c47337aA0D.A00.A04.equals(c7320noA0K5)) {
                        C47377E c47377e = this.A0j;
                        String[] strArr3 = A0y;
                        if (strArr3[4].charAt(1) != strArr3[3].charAt(1)) {
                            A0y[0] = "lm8nmDAIswUHpj0OrSP7ctv";
                            c47337aA0D.A00 = c47377e.A0I(timeline2, c47337aA0D.A00);
                        } else {
                            c47337aA0D.A00 = c47377e.A0I(timeline2, c47337aA0D.A00);
                        }
                    }
                }
            }
            long jA06 = A06(c7320noA0K5, c7320noA0K5.A00() ? 0L : jLongValue3);
            C47587Z c47587z2 = this.A0A;
            long jA01 = A01();
            String[] strArr4 = A0y;
            if (strArr4[4].charAt(1) == strArr4[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0y;
            strArr5[2] = "HJD";
            strArr5[6] = "HIUAzKTwmQi0tOVOF";
            this.A0A = c47587z2.A06(c7320noA0K5, jA06, jLongValue3, jA01);
            return;
        }
        C47587Z c47587z3 = this.A0A;
        String[] strArr6 = A0y;
        if (strArr6[4].charAt(1) != strArr6[3].charAt(1)) {
            String[] strArr7 = A0y;
            strArr7[4] = "QYIV2IuM2tD6Cg4Dd0tvfiQK4IQ6icHf";
            strArr7[3] = "hXYkHU7O6zP410ynmzMqamHjkcWcTxII";
            c7320no = c47587z3.A05;
            if (c7320no.A00()) {
                c7320noA0K = this.A0j.A0K(timeline2, Integer.valueOf(iA0A), j2);
                if (!c7320noA0K.equals(c7320no)) {
                    if (c7320noA0K.A00()) {
                        j = 0;
                    } else {
                        j = j2;
                    }
                    this.A0A = this.A0A.A06(c7320noA0K, A06(c7320noA0K, j), j2, A01());
                    return;
                }
            }
        } else {
            c7320no = c47587z3.A05;
            if (c7320no.A00()) {
                c7320noA0K = this.A0j.A0K(timeline2, Integer.valueOf(iA0A), j2);
                if (!c7320noA0K.equals(c7320no)) {
                    if (c7320noA0K.A00()) {
                        j = 0;
                    } else {
                        j = j2;
                    }
                    this.A0A = this.A0A.A06(c7320noA0K, A06(c7320noA0K, j), j2, A01());
                    return;
                }
            }
        }
        C47377E c47377e2 = this.A0j;
        long j3 = this.A06;
        if (A0y[1].length() == 31) {
            throw new RuntimeException();
        }
        String[] strArr8 = A0y;
        strArr8[4] = "30gHr5wufVP7jVH5IRZCDYCZy2V5u0Zf";
        strArr8[3] = "xPVmpg9j3VPOmOyowbQUJ4kDfZKAMzov";
        if (!c47377e2.A0Q(timeline2, c7320no, j3)) {
            A0x(false);
        }
        A0v(false);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0f(C47106n c47106n) throws Throwable {
        long jLongValue;
        C7320no c7320noA0K;
        long jLongValue2;
        boolean z;
        this.A0h.A03(1);
        Pair<Object, Long> pairA09 = A09(c47106n, true);
        if (pairA09 == null) {
            c7320noA0K = A0A();
            jLongValue2 = -9223372036854775807L;
            jLongValue = -9223372036854775807L;
            z = true;
        } else {
            Object obj = pairA09.first;
            jLongValue = ((Long) pairA09.second).longValue();
            c7320noA0K = this.A0j.A0K(this.A0A.A03, obj, jLongValue);
            if (c7320noA0K.A00()) {
                jLongValue2 = 0;
                z = true;
            } else {
                jLongValue2 = ((Long) pairA09.second).longValue();
                z = c47106n.A01 == -9223372036854775807L;
            }
        }
        try {
            try {
                if (this.A0D == null || this.A02 > 0) {
                    this.A08 = c47106n;
                    this.A07 = null;
                } else {
                    try {
                        if (jLongValue2 == -9223372036854775807L) {
                            A0V(4);
                            A13(false, true, false);
                        } else {
                            long jA6r = jLongValue2;
                            if (c7320noA0K.equals(this.A0A.A05)) {
                                C47337A c47337aA0F = this.A0j.A0F();
                                if (c47337aA0F != null && jA6r != 0) {
                                    jA6r = c47337aA0F.A07.A6r(jA6r, this.A0C);
                                }
                                if (AbstractC44522Y.A01(jA6r) == AbstractC44522Y.A01(this.A0A.A0C)) {
                                    this.A0A = this.A0A.A06(c7320noA0K, this.A0A.A0C, jLongValue, A01());
                                    if (z) {
                                        this.A0h.A04(2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            long jA06 = A06(c7320noA0K, jA6r);
                            z |= jLongValue2 != jA06;
                            jLongValue2 = jA06;
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.A0A = this.A0A.A06(c7320noA0K, jLongValue2, jLongValue, A01());
                        if (z) {
                            this.A0h.A04(2);
                        }
                        throw th;
                    }
                }
                this.A0A = this.A0A.A06(c7320noA0K, jLongValue2, jLongValue, A01());
                if (z) {
                    this.A0h.A04(2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static {
        A0R();
    }

    public C4902AB(InterfaceC7381oo[] interfaceC7381ooArr, AbstractC5195Ew abstractC5195Ew, C5196Ex c5196Ex, InterfaceC472774 interfaceC472774, InterfaceC5205F6 interfaceC5205F6, boolean z, int i, boolean z2, Handler handler, InterfaceC454245 interfaceC454245, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j, boolean z9, int i2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, C48098O c48098o) {
        this.A0v = interfaceC7381ooArr;
        this.A0l = abstractC5195Ew;
        this.A0m = c5196Ex;
        this.A0i = interfaceC472774;
        this.A0n = interfaceC5205F6;
        this.A0P = z;
        this.A03 = i;
        this.A0V = z2;
        this.A0a = handler;
        this.A0e = interfaceC454245;
        this.A0U = z3;
        this.A0H = z4;
        this.A0G = z5;
        this.A0M = z6;
        this.A0I = z7;
        this.A0T = z8;
        this.A0Z = j;
        this.A0q = z9;
        this.A00 = i2;
        this.A0u = z11;
        this.A0s = z10;
        this.A0O = z12;
        this.A0Q = z13;
        this.A0K = z14;
        this.A0t = z15;
        this.A0N = j > 0;
        this.A0Y = interfaceC472774.A70(c48098o);
        this.A0r = interfaceC472774.AIn(c48098o);
        this.A0C = C47797u.A03;
        this.A0A = new C47587Z(Timeline.A02, -9223372036854775807L, C7302nW.A06, c5196Ex);
        this.A0h = new C47096m();
        this.A0w = new InterfaceC47747p[interfaceC7381ooArr.length];
        for (int i3 = 0; i3 < interfaceC7381ooArr.length; i3++) {
            interfaceC7381ooArr[i3].AA9(i3, c48098o);
            this.A0w[i3] = interfaceC7381ooArr[i3].A7D();
        }
        this.A0g = new C7389ow(this, interfaceC454245);
        this.A0k = new C7377ok(interfaceC454245);
        this.A0o = z11 ? new C48729g(interfaceC454245) : null;
        this.A0p = new ArrayList<>();
        this.A0W = new InterfaceC7381oo[0];
        this.A0d = new C7437pj();
        this.A0c = new C7439pl();
        abstractC5195Ew.A02(this, interfaceC5205F6);
        this.A0b = new HandlerThread(A0D(21, 29, 115), -16);
        this.A0b.start();
        this.A0f = interfaceC454245.A5P(this.A0b.getLooper(), this);
    }

    @MetaExoPlayerCustomization
    private int A00() {
        int exoplayerThreadPollingIntervalMs = MetaExoPlayerUpgradeConfig.A00(EnumC7072jY.A04);
        if (exoplayerThreadPollingIntervalMs > 0) {
            return exoplayerThreadPollingIntervalMs;
        }
        return 10;
    }

    private long A01() {
        return A04(this.A0A.A0B);
    }

    private final long A02() {
        long loadingPeriodStartPositionUs;
        C47337A c47337aA0E = this.A0j.A0E();
        if (c47337aA0E == null) {
            loadingPeriodStartPositionUs = 0;
        } else {
            loadingPeriodStartPositionUs = A05(c47337aA0E);
        }
        if (c47337aA0E == null || loadingPeriodStartPositionUs == -9223372036854775807L) {
            return 0L;
        }
        return c47337aA0E.A0C(loadingPeriodStartPositionUs);
    }

    private final long A03() {
        long jA0C;
        C47337A c47337aA0F = this.A0j.A0F();
        if (c47337aA0F == null) {
            jA0C = 0;
        } else {
            jA0C = c47337aA0F.A0C(c47337aA0F.A0D(this.A06));
        }
        return jA0C + A02();
    }

    private long A04(long j) {
        C47337A c47337aA0E = this.A0j.A0E();
        if (c47337aA0E == null) {
            return 0L;
        }
        return j - c47337aA0E.A0D(this.A06);
    }

    private final long A05(C47337A c47337a) {
        long jMin = Long.MAX_VALUE;
        InterfaceC5104DT[] interfaceC5104DTArr = c47337a.A09;
        for (int i = 0; i < interfaceC5104DTArr.length; i++) {
            if (interfaceC5104DTArr[i] instanceof InterfaceC5105DU) {
                long periodStartPositionUs = ((InterfaceC5105DU) interfaceC5104DTArr[i]).A89();
                jMin = Math.min(jMin, periodStartPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return jMin;
    }

    private long A06(C7320no c7320no, long j) throws C4904AD {
        return A07(false, c7320no, j, this.A0j.A0F() != this.A0j.A0G());
    }

    private long A07(boolean z, C7320no c7320no, long j, boolean z2) throws C4904AD {
        A0O();
        this.A0R = false;
        A0V(2);
        C47337A c47337aA0F = this.A0j.A0F();
        C47337A c47337aA0B = c47337aA0F;
        while (c47337aA0B != null) {
            if (A18(c7320no, j, c47337aA0B)) {
                this.A0j.A0S(c47337aA0B);
                break;
            }
            c47337aA0B = this.A0j.A0B();
        }
        if (c47337aA0F != c47337aA0B || z2) {
            for (InterfaceC7381oo interfaceC7381oo : this.A0W) {
                A0l(interfaceC7381oo);
            }
            this.A0W = new InterfaceC7381oo[0];
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[4] = "70t8rv27mnV5UL6KHl8v284ienTbIO4o";
            strArr[3] = "4hBvGCC7ZdKRW68bijyzpqxjpy9h3CGi";
            c47337aA0F = null;
        }
        if (c47337aA0B != null) {
            A0g(c47337aA0F);
            if (c47337aA0B.A01) {
                j = c47337aA0B.A07.AJ8(j, z);
                c47337aA0B.A07.A60(j - this.A0Y, this.A0r);
            }
            A0Y(j);
            A0w(this.A0G);
        } else {
            this.A0j.A0M(true);
            A0Y(j);
        }
        A0v(false);
        this.A0f.AJA(2);
        return j;
    }

    private Pair<Object, Long> A08(Timeline timeline, int i, long j) {
        return timeline.A0D(this.A0d, this.A0c, i, j);
    }

    private Pair<Object, Long> A09(C47106n c47106n, boolean z) {
        int iA0A;
        Timeline timeline = this.A0A.A03;
        Timeline timeline2 = c47106n.A02;
        if (timeline.A0N()) {
            return null;
        }
        if (timeline2.A0N()) {
            timeline2 = timeline;
        }
        try {
            Pair<Object, Long> periodPosition = timeline2.A0E(this.A0d, this.A0c, c47106n.A00, c47106n.A01);
            if (timeline == timeline2 || (iA0A = timeline.A0A(periodPosition.first)) != -1) {
                return periodPosition;
            }
            if (!z || A0C(periodPosition.first, timeline2, timeline) == null) {
                return null;
            }
            return A08(timeline, timeline.A0H(iA0A, this.A0c).A00, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C44682q(timeline, c47106n.A00, c47106n.A01);
        }
    }

    private C7320no A0A() {
        Timeline timeline = this.A0A.A03;
        if (timeline.A0N()) {
            return C47587Z.A0E;
        }
        return new C7320no(timeline.A0M(timeline.A0K(timeline.A0B(this.A0V), this.A0d).A00));
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D71523094: Added for negative testing")
    private final Integer A0B() {
        C47547V playbackLatencyConfig;
        if (this.A09 == null || (playbackLatencyConfig = this.A09.A02()) == null) {
            String[] strArr = A0y;
            if (strArr[2].length() != strArr[6].length()) {
                A0y[7] = "1rqbEBrQgQNr61xUccdMybR9UEwvq3L8";
                return null;
            }
        } else {
            int iA00 = playbackLatencyConfig.A00();
            if (A0y[0].length() != 16) {
                String[] strArr2 = A0y;
                strArr2[2] = "KUZ";
                strArr2[6] = "wQAKuizVIm50S6vdz";
                return Integer.valueOf(iA00);
            }
        }
        throw new RuntimeException();
    }

    private Object A0C(Object obj, Timeline timeline, Timeline timeline2) {
        int iA0A = timeline.A0A(obj);
        int i = -1;
        int maxIterations = timeline.A06();
        for (int newPeriodIndex = 0; newPeriodIndex < maxIterations && i == -1 && (iA0A = timeline.A09(iA0A, this.A0c, this.A0d, this.A03, this.A0V)) != -1; newPeriodIndex++) {
            i = timeline2.A0A(timeline.A0M(iA0A));
        }
        if (i == -1) {
            return null;
        }
        return timeline2.A0M(i);
    }

    private void A0E() {
        C47337A c47337aA0E = this.A0j.A0E();
        if (c47337aA0E == null) {
            return;
        }
        c47337aA0E.A07.A4s(c47337aA0E.A0D(this.A06));
    }

    private void A0G() {
        A0V(4);
        A13(false, true, false);
    }

    private void A0H() {
        int i;
        if (this.A0h.A06(this.A0A)) {
            Handler handler = this.A0a;
            int i2 = this.A0h.A01;
            if (this.A0h.A03) {
                i = this.A0h.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, this.A0A).sendToTarget();
            this.A0h.A05(this.A0A);
        }
    }

    private void A0I() throws IOException {
        C47337A c47337aA0E = this.A0j.A0E();
        C47337A readingPeriodHolder = this.A0j.A0G();
        if (c47337aA0E != null && !c47337aA0E.A02) {
            if (readingPeriodHolder != null) {
                C47337A loadingPeriodHolder = readingPeriodHolder.A0I();
                if (loadingPeriodHolder != c47337aA0E) {
                    return;
                }
            }
            for (InterfaceC7381oo interfaceC7381oo : this.A0W) {
                if (!interfaceC7381oo.A9p()) {
                    return;
                }
            }
            c47337aA0E.A07.ACS();
        }
    }

    private void A0J() throws IOException {
        this.A0j.A0L(this.A06);
        if (this.A0j.A0O()) {
            C47347B c47347bA0H = this.A0j.A0H(this.A06, this.A0A);
            if (c47347bA0H == null) {
                this.A0D.ACT();
                return;
            }
            this.A0j.A0J(this.A0w, this.A0t ? 60000000L : 0L, this.A0l, this.A0i.A6v(), this.A0D, c47347bA0H, this.A0m).AH5(this, c47347bA0H.A03);
            A0y(true);
            A0v(false);
        }
    }

    private void A0K() {
        A13(true, true, true);
        this.A0i.AFc(C48098O.A03);
        A0V(1);
        this.A0b.quit();
        synchronized (this) {
            this.A0S = true;
            notifyAll();
        }
    }

    private void A0L() throws C4904AD {
        boolean z;
        if (!this.A0j.A0N()) {
            return;
        }
        float f = this.A0g.A8m().A01;
        C47337A periodHolder = this.A0j.A0G();
        boolean z2 = true;
        for (C47337A c47337aA0F = this.A0j.A0F(); c47337aA0F != null && c47337aA0F.A02; c47337aA0F = c47337aA0F.A0I()) {
            C5196Ex c5196ExA0L = c47337aA0F.A0L(f, this.A0A.A03);
            if (c5196ExA0L != null) {
                if (z2) {
                    C47337A c47337aA0F2 = this.A0j.A0F();
                    boolean zA0S = this.A0j.A0S(c47337aA0F2);
                    boolean[] zArr = new boolean[this.A0v.length];
                    long jA0G = c47337aA0F2.A0G(c5196ExA0L, this.A0A.A0C, zA0S, zArr);
                    if (this.A0A.A00 != 4 && jA0G != this.A0A.A0C) {
                        this.A0A = this.A0A.A06(this.A0A.A05, jA0G, this.A0A.A01, A01());
                        this.A0h.A04(4);
                        A0Y(jA0G);
                    }
                    int i = 0;
                    boolean[] zArr2 = new boolean[this.A0v.length];
                    for (int i2 = 0; i2 < this.A0v.length; i2++) {
                        InterfaceC7381oo interfaceC7381oo = this.A0v[i2];
                        zArr2[i2] = interfaceC7381oo.A9A() != 0;
                        InterfaceC5104DT interfaceC5104DT = c47337aA0F2.A09[i2];
                        if (interfaceC5104DT != null) {
                            i++;
                        }
                        if (zArr2[i2]) {
                            InterfaceC5104DT interfaceC5104DTA9D = interfaceC7381oo.A9D();
                            if (A0y[7].charAt(12) == '2') {
                                throw new RuntimeException();
                            }
                            A0y[1] = "PyyQ9suxdi7C";
                            if (interfaceC5104DT != interfaceC5104DTA9D) {
                                A0l(interfaceC7381oo);
                            } else if (zArr[i2]) {
                                interfaceC7381oo.AIm(this.A06);
                            }
                        }
                    }
                    this.A0A = this.A0A.A07(c47337aA0F2.A0J(), c47337aA0F2.A0K());
                    A14(zArr2, i);
                    z = false;
                } else {
                    this.A0j.A0S(c47337aA0F);
                    if (c47337aA0F.A02) {
                        z = false;
                        c47337aA0F.A0F(c5196ExA0L, Math.max(c47337aA0F.A00.A03, c47337aA0F.A0D(this.A06)), false);
                    } else {
                        z = false;
                    }
                }
                A0v(true);
                if (this.A0A.A00 != 4) {
                    A0w(z);
                    A0Q();
                    this.A0f.AJA(2);
                    return;
                }
                return;
            }
            if (c47337aA0F == periodHolder) {
                z2 = false;
            }
        }
    }

    private void A0M() {
        for (int size = this.A0p.size() - 1; size >= 0; size--) {
            if (!A16(this.A0p.get(size))) {
                this.A0p.get(size).A03.A0A(false);
                this.A0p.remove(size);
            }
        }
        Collections.sort(this.A0p);
    }

    private void A0N() throws C4904AD {
        this.A0R = false;
        this.A0g.A05();
        this.A0k.A00();
        if (this.A0u) {
            this.A0o.A00();
        }
        for (InterfaceC7381oo interfaceC7381oo : this.A0W) {
            interfaceC7381oo.start();
        }
    }

    private void A0O() throws C4904AD {
        this.A0g.A06();
        this.A0k.A01();
        if (this.A0u) {
            this.A0o.A01();
        }
        for (InterfaceC7381oo interfaceC7381oo : this.A0W) {
            A0m(interfaceC7381oo);
        }
    }

    private void A0Q() throws C4904AD {
        if (!this.A0j.A0N()) {
            return;
        }
        C47337A c47337aA0F = this.A0j.A0F();
        long jAHQ = c47337aA0F.A07.AHQ();
        if (jAHQ != -9223372036854775807L) {
            A0Y(jAHQ);
            if (jAHQ != this.A0A.A0C) {
                this.A0A = this.A0A.A06(this.A0A.A05, jAHQ, this.A0A.A01, A01());
                this.A0h.A04(4);
            }
        } else {
            C7389ow c7389ow = this.A0g;
            C47337A playingPeriodHolder = this.A0j.A0G();
            this.A06 = c7389ow.A04(c47337aA0F != playingPeriodHolder);
            long jA0D = c47337aA0F.A0D(this.A06);
            A0Z(this.A0A.A0C, jA0D);
            this.A0A.A0C = jA0D;
        }
        C47337A playingPeriodHolder2 = this.A0j.A0E();
        this.A0A.A0B = playingPeriodHolder2.A09();
        this.A0A.A0D = A01();
        this.A0A.A0D = c47337aA0F.A0C(this.A0A.A0C);
    }

    private void A0S(byte b) {
        C47337A c47337aA0E = this.A0j.A0E();
        if (c47337aA0E != null && this.A0U) {
            c47337aA0E.A07.AKb(b);
        }
    }

    private void A0T(float f) {
        for (C47337A c47337aA0D = this.A0j.A0D(); c47337aA0D != null && c47337aA0D.A02; c47337aA0D = c47337aA0D.A0I()) {
            for (InterfaceC7284nE interfaceC7284nE : c47337aA0D.A0K().A04) {
                if (interfaceC7284nE != null) {
                    interfaceC7284nE.AFJ(f);
                }
            }
        }
    }

    private void A0U(int i) throws C4904AD {
        this.A03 = i;
        if (!this.A0j.A0P(this.A0A.A03, i)) {
            if (A0y[0].length() == 16) {
                throw new RuntimeException();
            }
            A0y[5] = "F0pbcDG7mrKSFF2ySsjJdp1en5xQxzay";
            A0x(true);
        }
        A0v(false);
    }

    private void A0V(int i) {
        if (this.A0A.A00 != i) {
            this.A0A = this.A0A.A01(i);
            if (i == 2) {
                this.A04 = System.currentTimeMillis();
            } else {
                this.A04 = -1L;
            }
        }
    }

    private void A0W(int i, boolean z) {
        if (this.A0A.A00 != i) {
            C47587Z c47587zA03 = this.A0A.A03(i, z);
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            A0y[1] = "pTubBuiOOGTe";
            this.A0A = c47587zA03;
            if (i == 2) {
                this.A04 = System.currentTimeMillis();
            } else {
                this.A04 = -1L;
            }
        }
    }

    private void A0X(int i, boolean playing, int i2) throws C4904AD {
        C47337A c47337aA0F = this.A0j.A0F();
        InterfaceC7381oo interfaceC7381oo = this.A0v[i];
        this.A0W[i2] = interfaceC7381oo;
        if (interfaceC7381oo.A9A() == 0) {
            C47337A c47337aA0G = this.A0j.A0G();
            C47337A playingPeriodHolder = this.A0j.A0F();
            boolean z = c47337aA0G == playingPeriodHolder;
            C47777s c47777s = c47337aA0F.A0K().A03[i];
            C7472qI[] c7472qIArrA1A = A1A(c47337aA0F.A0K().A04[i]);
            boolean z2 = this.A0P && this.A0A.A00 == 3;
            interfaceC7381oo.A6L(c47777s, c7472qIArrA1A, c47337aA0F.A09[i], this.A06, !playing && z2, z, c47337aA0G.A0H(this.A0K), c47337aA0F.A0B());
            this.A0g.A09(interfaceC7381oo);
            if (z2) {
                interfaceC7381oo.start();
            }
        }
    }

    private void A0Y(long j) throws C4904AD {
        long jA0E;
        if (this.A0j.A0N()) {
            jA0E = this.A0j.A0F().A0E(j);
        } else {
            jA0E = ((long) (this.A0t ? 60000000 : 0)) + j;
        }
        this.A06 = jA0E;
        this.A0g.A07(this.A06);
        for (InterfaceC7381oo interfaceC7381oo : this.A0W) {
            long j2 = this.A06;
            String[] strArr = A0y;
            if (strArr[2].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0y[5] = "3LWS1la82nevxXslk8B3HGv7gilut34u";
            interfaceC7381oo.AIm(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f A[SYNTHETIC] */
    private void A0Z(long j, long j2) throws C4904AD {
        C47086l c47086l;
        C47086l nextInfo;
        int i;
        if (this.A0p.isEmpty() || this.A0A.A05.A00()) {
            return;
        }
        C47587Z c47587z = this.A0A;
        if (A0y[0].length() != 16) {
            String[] strArr = A0y;
            strArr[4] = "N4EB4VnnGuurJLGLQe09RRoMwim7ZTwR";
            strArr[3] = "el7QB6NOzA9v772mMpBH3ujflXdKxCpX";
            if (c47587z.A02 == j) {
                j--;
            }
            int iA0A = this.A0A.A03.A0A(this.A0A.A05.A04);
            int currentPeriodIndex = this.A01;
            if (currentPeriodIndex > 0) {
                ArrayList<C47086l> arrayList = this.A0p;
                int currentPeriodIndex2 = this.A01;
                int i2 = currentPeriodIndex2 - 1;
                if (A0y[1].length() != 31) {
                    String[] strArr2 = A0y;
                    strArr2[2] = "q3c";
                    strArr2[6] = "HlTr3zIzL5MxTNWEN";
                    c47086l = arrayList.get(i2);
                }
            } else {
                c47086l = null;
            }
            while (c47086l != null && (c47086l.A00 > iA0A || (c47086l.A00 == iA0A && c47086l.A01 > j))) {
                int currentPeriodIndex3 = this.A01;
                this.A01 = currentPeriodIndex3 - 1;
                int currentPeriodIndex4 = this.A01;
                if (currentPeriodIndex4 > 0) {
                    ArrayList<C47086l> arrayList2 = this.A0p;
                    int currentPeriodIndex5 = this.A01;
                    c47086l = arrayList2.get(currentPeriodIndex5 - 1);
                } else {
                    c47086l = null;
                }
            }
            int i3 = this.A01;
            int currentPeriodIndex6 = this.A0p.size();
            if (i3 < currentPeriodIndex6) {
                ArrayList<C47086l> arrayList3 = this.A0p;
                int currentPeriodIndex7 = this.A01;
                nextInfo = arrayList3.get(currentPeriodIndex7);
            } else {
                nextInfo = null;
            }
            while (nextInfo != null && nextInfo.A02 != null) {
                int i4 = nextInfo.A00;
                if (A0y[5].charAt(1) != 'q') {
                    A0y[1] = "urcr7rEa5cce4ZESz6";
                    if (i4 >= iA0A) {
                        i = nextInfo.A00;
                        if (A0y[7].charAt(12) != '2') {
                            throw new RuntimeException();
                        }
                        A0y[7] = "Pqus3FB2V0wQm49ac7wvllFxwdLgqwrG";
                        if (i != iA0A || nextInfo.A01 > j) {
                            break;
                        }
                    }
                } else if (i4 >= iA0A) {
                    i = nextInfo.A00;
                    if (A0y[7].charAt(12) != '2') {
                        throw new RuntimeException();
                    }
                    A0y[7] = "Pqus3FB2V0wQm49ac7wvllFxwdLgqwrG";
                    if (i != iA0A) {
                        break;
                    }
                    break;
                    break;
                }
                int currentPeriodIndex8 = this.A01;
                this.A01 = currentPeriodIndex8 + 1;
                int i5 = this.A01;
                int currentPeriodIndex9 = this.A0p.size();
                if (i5 < currentPeriodIndex9) {
                    ArrayList<C47086l> arrayList4 = this.A0p;
                    int currentPeriodIndex10 = this.A01;
                    C47086l nextInfo2 = arrayList4.get(currentPeriodIndex10);
                    nextInfo = nextInfo2;
                } else {
                    nextInfo = null;
                }
            }
            while (nextInfo != null) {
                Object obj = nextInfo.A02;
                if (A0y[1].length() != 31) {
                    String[] strArr3 = A0y;
                    strArr3[2] = "ENU";
                    strArr3[6] = "SOUOSvSypycWuSHSN";
                    if (obj == null) {
                        return;
                    }
                    int currentPeriodIndex11 = nextInfo.A00;
                    if (currentPeriodIndex11 == iA0A && nextInfo.A01 > j && nextInfo.A01 <= j2) {
                        A0j(nextInfo.A03);
                        if (nextInfo.A03.A0B() || nextInfo.A03.A0D()) {
                            ArrayList<C47086l> arrayList5 = this.A0p;
                            int currentPeriodIndex12 = this.A01;
                            arrayList5.remove(currentPeriodIndex12);
                        } else {
                            int currentPeriodIndex13 = this.A01;
                            this.A01 = currentPeriodIndex13 + 1;
                        }
                        int i6 = this.A01;
                        int currentPeriodIndex14 = this.A0p.size();
                        if (i6 < currentPeriodIndex14) {
                            ArrayList<C47086l> arrayList6 = this.A0p;
                            int currentPeriodIndex15 = this.A01;
                            C47086l nextInfo3 = arrayList6.get(currentPeriodIndex15);
                            nextInfo = nextInfo3;
                        } else {
                            nextInfo = null;
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0a(long j, long j2) {
        this.A0f.AIT(2);
        this.A0f.AJB(2, j + j2);
    }

    private void A0b(C7451px c7451px) {
        this.A0g.AJd(c7451px);
        if (this.A0o != null) {
            this.A0o.AJd(c7451px);
        }
        if (this.A0k != null) {
            this.A0k.AJd(c7451px);
        }
    }

    private void A0c(C47066j c47066j) throws C4904AD {
        throw new NullPointerException(A0D(376, 16, 17));
    }

    private void A0d(C47066j c47066j, boolean z) throws C4904AD {
        this.A0h.A03(1);
        throw new NullPointerException(A0D(363, 13, 127));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    private void A0g(C47337A c47337a) throws C4904AD {
        C47337A c47337aA0F = this.A0j.A0F();
        if (c47337aA0F == null || c47337a == c47337aA0F) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0v.length];
        String[] strArr = A0y;
        String str = strArr[4];
        String str2 = strArr[3];
        int enabledRendererCount = str.charAt(1);
        if (enabledRendererCount == str2.charAt(1)) {
            throw new RuntimeException();
        }
        A0y[0] = "";
        for (int i2 = 0; i2 < this.A0v.length; i2++) {
            InterfaceC7381oo interfaceC7381oo = this.A0v[i2];
            zArr[i2] = interfaceC7381oo.A9A() != 0;
            if (c47337aA0F.A0K().A00(i2)) {
                i++;
            }
            if (zArr[i2]) {
                C5196Ex c5196ExA0K = c47337aA0F.A0K();
                int enabledRendererCount2 = A0y[5].charAt(1);
                if (enabledRendererCount2 != 113) {
                    String[] strArr2 = A0y;
                    strArr2[4] = "5yNp1I7g7IY9vjHrSpd0TTAHnxoP5q4N";
                    strArr2[3] = "spEmpaFlzQc3LcHeWE04rIrq6t30lchN";
                    if (c5196ExA0K.A00(i2)) {
                        if (interfaceC7381oo.AAN() || interfaceC7381oo.A9D() != c47337a.A09[i2]) {
                        }
                    }
                } else if (c5196ExA0K.A00(i2)) {
                    if (interfaceC7381oo.AAN()) {
                    }
                }
                A0l(interfaceC7381oo);
            }
        }
        this.A0A = this.A0A.A07(c47337aA0F.A0J(), c47337aA0F.A0K());
        A14(zArr, i);
    }

    private void A0h(C47627d c47627d) throws C4904AD {
        if (c47627d.A0D()) {
            return;
        }
        try {
            c47627d.A05().A9i(c47627d.A01(), c47627d.A09());
        } finally {
            c47627d.A0A(true);
        }
    }

    private void A0i(C47627d c47627d) throws C4904AD {
        if (c47627d.A02() == -9223372036854775807L) {
            A0j(c47627d);
            return;
        }
        if (this.A0D == null || this.A02 > 0) {
            this.A0p.add(new C47086l(c47627d));
            return;
        }
        C47086l c47086l = new C47086l(c47627d);
        if (A16(c47086l)) {
            this.A0p.add(c47086l);
            Collections.sort(this.A0p);
        } else {
            c47627d.A0A(false);
        }
    }

    private void A0j(C47627d c47627d) throws C4904AD {
        if (c47627d.A03() == this.A0f.A8R()) {
            A0h(c47627d);
            if (this.A0A.A00 == 3 || this.A0A.A00 == 2) {
                this.A0f.AJA(2);
                return;
            }
            return;
        }
        this.A0f.ACj(15, c47627d).A02();
    }

    private void A0k(final C47627d c47627d) {
        Looper looperA03 = c47627d.A03();
        if (!looperA03.getThread().isAlive()) {
            Log.w(A0D(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 3, 37), A0D(258, 40, 7));
            c47627d.A0A(false);
        } else {
            this.A0e.A5P(looperA03, null).A03(new Runnable() { // from class: com.facebook.ads.redexgen.X.6h
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A1E(c47627d);
                }
            });
        }
    }

    private void A0l(InterfaceC7381oo interfaceC7381oo) throws C4904AD {
        this.A0g.A08(interfaceC7381oo);
        A0m(interfaceC7381oo);
        interfaceC7381oo.A5x();
    }

    private void A0m(InterfaceC7381oo interfaceC7381oo) throws C4904AD {
        if (interfaceC7381oo.A9A() == 2) {
            interfaceC7381oo.stop();
        }
    }

    private void A0n(C47797u c47797u) {
        this.A0C = c47797u;
    }

    private void A0o(InterfaceC7321np interfaceC7321np) {
        if (!this.A0j.A0T(interfaceC7321np)) {
            return;
        }
        this.A0j.A0L(this.A06);
        A0w(false);
    }

    private void A0p(InterfaceC7321np interfaceC7321np) throws C4904AD {
        byte b;
        if (!this.A0j.A0T(interfaceC7321np)) {
            return;
        }
        C47337A c47337aA0E = this.A0j.A0E();
        c47337aA0E.A0N(this.A0g.A8m().A01, this.A0A.A03);
        A0s(c47337aA0E.A0J(), c47337aA0E.A0K());
        if (!this.A0j.A0N()) {
            C47337A loadingPeriodHolder = this.A0j.A0B();
            A0Y(loadingPeriodHolder.A00.A03);
            A0g(null);
        }
        if (this.A0M || this.A0P) {
            b = 0;
        } else {
            b = 2;
        }
        A0S(b);
        A10(this.A0P);
        if (A0y[7].charAt(12) == '2') {
            throw new RuntimeException();
        }
        A0y[5] = "0JHOWU68jltYXS7XBlXTYuPeT3LWkLA2";
        A0w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC5107DW
    /* JADX INFO: renamed from: A0q, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC7321np interfaceC7321np) {
        this.A0f.ACj(10, interfaceC7321np).A02();
    }

    private void A0r(InterfaceC5072Cx interfaceC5072Cx, boolean z, boolean z2) {
        this.A02++;
        A13(true, z, z2);
        this.A0i.AFR(C48098O.A03);
        this.A0D = interfaceC5072Cx;
        A0V(2);
        interfaceC5072Cx.AH7(this, null);
        this.A0f.AJA(2);
    }

    private void A0s(C7302nW c7302nW, C5196Ex c5196Ex) {
        this.A0i.AGF(new C472673(C48098O.A03, this.A0A.A03, this.A0A.A04, this.A0A.A0C, A01(), this.A0g.A8m().A01, this.A0P, this.A0R, -9223372036854775807L, this.A04), c7302nW, c5196Ex.A04);
    }

    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    private void A0t(EnumC7031ir enumC7031ir, boolean z) {
        if (this.A0A.A00 != 3) {
            this.A0A = this.A0A.A02(3, enumC7031ir, z);
            this.A04 = -1L;
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D63737392: Added for negative testing")
    private void A0u(String str) {
        boolean z = false;
        if (str == null) {
            this.A0J = false;
            this.A09 = null;
            return;
        }
        if (str != null && str.length() > 0) {
            z = true;
        }
        this.A0J = z;
        this.A09 = new C47557W(str);
    }

    private void A0v(boolean z) {
        C7320no c7320no;
        C47337A c47337aA0E = this.A0j.A0E();
        if (c47337aA0E == null) {
            C47587Z c47587z = this.A0A;
            if (A0y[1].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0y;
            strArr[2] = "b0w";
            strArr[6] = "WyMJg745VdMbfing6";
            c7320no = c47587z.A05;
        } else {
            c7320no = c47337aA0E.A00.A04;
        }
        C7320no loadingMediaPeriodId = this.A0A.A04;
        boolean loadingMediaPeriodChanged = !loadingMediaPeriodId.equals(c7320no);
        if (loadingMediaPeriodChanged) {
            this.A0A = this.A0A.A05(c7320no);
        }
        if ((loadingMediaPeriodChanged || z) && c47337aA0E != null && c47337aA0E.A02) {
            A0s(c47337aA0E.A0J(), c47337aA0E.A0K());
        }
    }

    @MetaExoPlayerCustomization("Customized Buffered Duration MS D23157182")
    private void A0w(boolean z) {
        long jA0C;
        C47337A c47337aA0E = this.A0j.A0E();
        long jA0A = c47337aA0E.A0A();
        if (jA0A == Long.MIN_VALUE) {
            A0y(false);
            return;
        }
        long jA0D = c47337aA0E.A0D(this.A06);
        if (!this.A0s || c47337aA0E == this.A0j.A0F() || this.A0j.A0F() == null) {
            jA0C = c47337aA0E.A0C(jA0D);
            if (this.A0O) {
                for (C47337A c47337aA0F = this.A0j.A0F(); c47337aA0F != null && c47337aA0F != c47337aA0E; c47337aA0F = c47337aA0F.A0I()) {
                    long nextLoadPositionUs = this.A06;
                    jA0C += c47337aA0F.A0C(c47337aA0F.A0D(nextLoadPositionUs));
                }
            }
        } else {
            jA0C = A02();
        }
        Timeline timeline = this.A0A.A03;
        C7320no c7320no = c47337aA0E.A00.A04;
        float f = this.A0g.A8m().A01;
        boolean z2 = this.A0P || z;
        boolean z3 = this.A0R;
        long nextLoadPositionUs2 = this.A04;
        boolean zAJv = this.A0i.AJv(new C472673(null, timeline, c7320no, jA0D, jA0C, f, z2, z3, -9223372036854775807L, nextLoadPositionUs2));
        if (this.A0T && this.A0P && this.A0R && !zAJv && this.A0A.A00 == 2) {
            Long lValueOf = Long.valueOf(jA0D / 1000);
            Long lValueOf2 = Long.valueOf(jA0C / 1000);
            Long lValueOf3 = Long.valueOf(jA0A / 1000);
            String[] strArr = A0y;
            if (strArr[4].charAt(1) == strArr[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0y;
            strArr2[2] = "Frr";
            strArr2[6] = "mfKzHFhLmxUYLc6Gx";
            this.A0a.obtainMessage(5, AbstractC46115C.A0n(A0D(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 70, 5), lValueOf, lValueOf2, lValueOf3)).sendToTarget();
            this.A0T = false;
        }
        A0y(zAJv);
        if (zAJv) {
            c47337aA0E.A0O(this.A06);
        }
    }

    private void A0x(boolean z) throws C4904AD {
        C7320no c7320no = this.A0j.A0F().A00.A04;
        long jA07 = A07(false, c7320no, this.A0A.A0C, true);
        if (jA07 != this.A0A.A0C) {
            this.A0A = this.A0A.A06(c7320no, jA07, this.A0A.A01, A01());
            if (z) {
                C47096m c47096m = this.A0h;
                String[] strArr = A0y;
                if (strArr[4].charAt(1) == strArr[3].charAt(1)) {
                    throw new RuntimeException();
                }
                A0y[5] = "dnthUoDEzHvBWSE2tp3YAJwgKJx1FOWZ";
                c47096m.A04(4);
            }
        }
    }

    private void A0y(boolean z) {
        if (this.A0A.A0A != z) {
            this.A0A = this.A0A.A08(z);
        }
    }

    private void A0z(boolean z) throws C4904AD {
        try {
            this.A0R = false;
            this.A0P = z;
            A10(z);
            if (!z) {
                A0O();
                A0Q();
                A0S((byte) 2);
                if (this.A0I) {
                    A0E();
                }
            } else {
                A0S((byte) 0);
                if (this.A0A.A00 != 3) {
                    if (this.A0A.A00 == 2) {
                        this.A0f.AJA(2);
                    }
                } else {
                    A0N();
                    this.A0f.AJA(2);
                }
            }
        } finally {
            this.A0a.obtainMessage(3, Boolean.valueOf(z)).sendToTarget();
        }
    }

    @MetaExoPlayerCustomization("D19875605 Prevent further error loading once pausing video")
    private void A10(boolean z) {
        C47337A loadingPeriod = this.A0j.A0E();
        if (loadingPeriod == null) {
            return;
        }
        loadingPeriod.A07.AJc(z);
    }

    private void A11(boolean z) throws C4904AD {
        this.A0V = z;
        if (!this.A0j.A0R(this.A0A.A03, z)) {
            A0x(true);
        }
        A0v(false);
    }

    private void A12(boolean z, boolean z2) {
        A13(true, z, z);
        this.A0h.A03(this.A02 + (z2 ? 1 : 0));
        this.A02 = 0;
        this.A0i.AG6(C48098O.A03);
        A0V(1);
    }

    private void A13(boolean z, boolean z2, boolean z3) {
        long j;
        C7302nW c7302nW;
        C5196Ex c5196Ex;
        this.A0f.AIT(2);
        this.A0R = false;
        this.A0g.A06();
        this.A0k.A01();
        if (this.A0u) {
            this.A0o.A01();
        }
        this.A06 = this.A0t ? 60000000L : 0L;
        for (InterfaceC7381oo interfaceC7381oo : this.A0W) {
            try {
                A0l(interfaceC7381oo);
            } catch (C4904AD | RuntimeException e) {
                Log.e(A0D(0, 21, 22), A0D(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 12, 44), e);
            }
        }
        this.A0W = new InterfaceC7381oo[0];
        this.A0j.A0M(!z2);
        A0y(false);
        if (z2) {
            this.A08 = null;
        }
        if (z3) {
            Iterator<C47086l> it = this.A0p.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0p.clear();
            this.A01 = 0;
        }
        C7320no c7320noA0A = z2 ? A0A() : this.A0A.A05;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            C47587Z c47587z = this.A0A;
            if (A0y[5].charAt(1) != 'q') {
                String[] strArr = A0y;
                strArr[4] = "7gx390g1msf1u5QKnR2KjvR4WQmRx8YK";
                strArr[3] = "VlC7tbQkEF507tv73u1W2v85d7ApXXNM";
                j = c47587z.A0C;
            } else {
                A0y[5] = "C79IK8sPJjEkg2u4SoGimfUAaE3F5yew";
                j = c47587z.A0C;
            }
        }
        if (!z2) {
            C47587Z c47587z2 = this.A0A;
            if (A0y[5].charAt(1) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr2 = A0y;
            strArr2[2] = "uSR";
            strArr2[6] = "FwoZ6mA9qzJ4hrvJt";
            j2 = c47587z2.A01;
        }
        Timeline timeline = z3 ? Timeline.A02 : this.A0A.A03;
        int i = this.A0A.A00;
        if (z3) {
            c7302nW = C7302nW.A06;
        } else {
            C47587Z c47587z3 = this.A0A;
            if (A0y[7].charAt(12) == '2') {
                throw new RuntimeException();
            }
            A0y[5] = "yizxhFEcEwEbIh7DB6ScCbr86G64zHmf";
            c7302nW = c47587z3.A06;
        }
        if (z3) {
            c5196Ex = this.A0m;
        } else {
            c5196Ex = this.A0A.A07;
        }
        this.A0A = new C47587Z(timeline, c7320noA0A, j, j2, i, false, c7302nW, c5196Ex, c7320noA0A, j, 0L, j);
        if (z && this.A0D != null) {
            this.A0D.AHl(this);
            this.A0D = null;
        }
    }

    private void A14(boolean[] zArr, int i) throws C4904AD {
        this.A0W = new InterfaceC7381oo[i];
        int enabledRendererCount = 0;
        C47337A c47337aA0F = this.A0j.A0F();
        for (int i2 = 0; i2 < enabledRendererCount; i2++) {
            if (c47337aA0F.A0K().A00(i2)) {
                A0X(i2, zArr[i2], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A15() {
        C47337A playingPeriodHolder = this.A0j.A0F();
        C47337A c47337aA0I = playingPeriodHolder.A0I();
        long j = playingPeriodHolder.A00.A00;
        return j == -9223372036854775807L || this.A0A.A0C < j || (c47337aA0I != null && (c47337aA0I.A02 || c47337aA0I.A00.A04.A00()));
    }

    private boolean A16(C47086l c47086l) {
        if (c47086l.A02 == null) {
            Pair<Object, Long> pairA09 = A09(new C47106n(c47086l.A03.A04(), c47086l.A03.A00(), AbstractC44522Y.A00(c47086l.A03.A02())), false);
            if (pairA09 == null) {
                return false;
            }
            int iA0A = this.A0A.A03.A0A(pairA09.first);
            if (A0y[5].charAt(1) != 'q') {
                A0y[5] = "NfGCtpMsHKBVYsn3O7a8Zqq9gxyOlhFa";
                c47086l.A01(iA0A, ((Long) pairA09.second).longValue(), pairA09.first);
                return true;
            }
            throw new RuntimeException();
        }
        int iA0A2 = this.A0A.A03.A0A(c47086l.A02);
        if (iA0A2 == -1) {
            return false;
        }
        c47086l.A00 = iA0A2;
        return true;
    }

    private boolean A17(InterfaceC7381oo interfaceC7381oo) {
        C47337A c47337aA0G = this.A0j.A0G();
        C47337A readingPeriodHolder = c47337aA0G.A0I();
        if (readingPeriodHolder != null) {
            C47337A readingPeriodHolder2 = c47337aA0G.A0I();
            if (readingPeriodHolder2.A02 && interfaceC7381oo.A9p()) {
                return true;
            }
        }
        return false;
    }

    private boolean A18(C7320no c7320no, long j, C47337A c47337a) {
        if (!c7320no.equals(c47337a.A00.A04)) {
            return false;
        }
        boolean z = c47337a.A02;
        if (A0y[1].length() == 31) {
            throw new RuntimeException();
        }
        A0y[1] = "z9";
        if (z) {
            this.A0A.A03.A0J(this.A0A.A05.A04, this.A0c);
            int iA07 = this.A0c.A07(j);
            if (iA07 != -1) {
                long jA0D = this.A0c.A0D(iA07);
                C47347B c47347b = c47337a.A00;
                if (A0y[5].charAt(1) == 'q') {
                    A0y[5] = "RcBDfVPYXZ1IWswHj8kiKJAUw6BsFYM7";
                    if (jA0D == c47347b.A01) {
                        return true;
                    }
                    return false;
                }
                String[] strArr = A0y;
                strArr[4] = "w6QknFDGuvwfcqywG7nwGfdAAoNokq6y";
                strArr[3] = "I5j8Ais0ITqpKL2oROmKoI7QN1W2GqI7";
                if (jA0D == c47347b.A01) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("Customized Buffered Duration MS D23157182"), @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")})
    private boolean A19(boolean z) {
        boolean z2;
        long jA0C;
        if (this.A0W.length == 0) {
            return A15();
        }
        if (!z) {
            if (this.A0B != null) {
                this.A0E = this.A0B.A99();
            }
            return false;
        }
        if (!this.A0A.A0A) {
            return true;
        }
        C47337A c47337aA0E = this.A0j.A0E();
        if (c47337aA0E.A0R()) {
            C47347B c47347b = c47337aA0E.A00;
            if (A0y[7].charAt(12) == '2') {
                throw new RuntimeException();
            }
            A0y[5] = "JVFQROlQoWGuZTJ8G1Kf7NjovTqMHrup";
            if (c47347b.A05) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!this.A0s || this.A0j.A0F() == this.A0j.A0E() || this.A0j.A0F() == null) {
            jA0C = c47337aA0E.A0C(c47337aA0E.A0D(this.A06));
        } else {
            jA0C = A03();
        }
        boolean z3 = z2 || this.A0i.AJy(jA0C, this.A0g.A8m().A01, this.A0R, this.A00 > 0 && (this.A04 > 0L ? 1 : (this.A04 == 0L ? 0 : -1)) > 0 && ((System.currentTimeMillis() - this.A04) > ((long) this.A00) ? 1 : ((System.currentTimeMillis() - this.A04) == ((long) this.A00) ? 0 : -1)) < 0, -9223372036854775807L);
        if (!z3) {
            this.A0E = EnumC7031ir.A04;
        }
        return z3;
    }

    public static C7472qI[] A1A(InterfaceC5189Eq interfaceC5189Eq) {
        int length = interfaceC5189Eq != null ? interfaceC5189Eq.length() : 0;
        C7472qI[] c7472qIArr = new C7472qI[length];
        for (int i = 0; i < length; i++) {
            c7472qIArr[i] = interfaceC5189Eq.A8B(i);
        }
        return c7472qIArr;
    }

    public final Looper A1B() {
        return this.A0b.getLooper();
    }

    public final synchronized void A1C() {
        if (this.A0S) {
            return;
        }
        this.A0f.AJA(7);
        boolean z = false;
        while (!wasInterrupted) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A1D(Timeline timeline, int i, long j) {
        this.A0f.ACj(3, new C47106n(timeline, i, j)).A02();
    }

    public final /* synthetic */ void A1E(C47627d c47627d) {
        try {
            A0h(c47627d);
        } catch (C4904AD e) {
            Log.e(A0D(0, 21, 22), A0D(298, 55, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), e);
            throw new RuntimeException(e);
        }
    }

    public final void A1F(InterfaceC5072Cx interfaceC5072Cx, boolean z, boolean z2) {
        this.A0f.ACi(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC5072Cx).A02();
    }

    public final void A1G(boolean z) {
        this.A0f.ACh(1, z ? 1 : 0, 0).A02();
    }

    public final void A1H(boolean z) {
        this.A0f.ACh(6, z ? 1 : 0, 0).A02();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC46866P
    public final void AFI(C7451px c7451px) {
        this.A0a.obtainMessage(1, c7451px).sendToTarget();
        A0T(c7451px.A01);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7322nq
    public final void AFS(InterfaceC7321np interfaceC7321np) {
        this.A0f.ACj(9, interfaceC7321np).A02();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5071Cw
    public final void AG1(InterfaceC5072Cx interfaceC5072Cx, Timeline timeline) {
        this.A0f.ACj(8, new C47076k(interfaceC5072Cx, timeline)).A02();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5194Ev
    public final void AGD() {
        this.A0f.AJA(11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC47607b
    public final synchronized void AJC(C47627d c47627d) {
        if (this.A0S) {
            Log.w(A0D(0, 21, 22), A0D(50, 37, 39));
            c47627d.A0A(false);
        } else {
            this.A0f.ACj(14, c47627d).A02();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strA0D = A0D(0, 21, 22);
        try {
            switch (message.what) {
                case 0:
                    A0r((InterfaceC5072Cx) message.obj, message.arg1 != 0, message.arg2 != 0);
                    A0H();
                    return true;
                case 1:
                    A0z(message.arg1 != 0);
                    A0H();
                    return true;
                case 2:
                    A0F();
                    A0H();
                    return true;
                case 3:
                    A0f((C47106n) message.obj);
                    A0H();
                    return true;
                case 4:
                    A0b((C7451px) message.obj);
                    A0H();
                    return true;
                case 5:
                    A0n((C47797u) message.obj);
                    A0H();
                    return true;
                case 6:
                    A12(message.arg1 != 0, true);
                    A0H();
                    return true;
                case 7:
                    A0K();
                    return true;
                case 8:
                    A0e((C47076k) message.obj);
                    A0H();
                    return true;
                case 9:
                    A0p((InterfaceC7321np) message.obj);
                    A0H();
                    return true;
                case 10:
                    A0o((InterfaceC7321np) message.obj);
                    A0H();
                    return true;
                case 11:
                    A0L();
                    A0H();
                    return true;
                case 12:
                    A0U(message.arg1);
                    A0H();
                    return true;
                case 13:
                    A11(message.arg1 != 0);
                    A0H();
                    return true;
                case 14:
                    A0i((C47627d) message.obj);
                    A0H();
                    return true;
                case 15:
                    A0k((C47627d) message.obj);
                    A0H();
                    return true;
                case 16:
                    A0H();
                    return true;
                case 17:
                    A0d(null, false);
                    throw null;
                case 18:
                    A0c(null);
                    throw null;
                case 19:
                    A0u((String) message.obj);
                    A0H();
                    return true;
                default:
                    return false;
            }
        } catch (C4904AD e) {
            Log.e(strA0D, A0D(110, 15, 65), e);
            A12(false, false);
            this.A0a.obtainMessage(2, e).sendToTarget();
            A0H();
        } catch (IOException e2) {
            Log.e(strA0D, A0D(195, 13, 40), e2);
            A12(false, false);
            this.A0a.obtainMessage(2, C4904AD.A01(e2, 2000)).sendToTarget();
            A0H();
        } catch (RuntimeException e3) {
            Log.e(strA0D, A0D(87, 23, 19), e3);
            A12(false, false);
            this.A0a.obtainMessage(2, C4904AD.A02(e3)).sendToTarget();
            A0H();
        }
    }
}
