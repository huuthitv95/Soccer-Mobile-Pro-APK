package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.B7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4960B7 {
    public static byte[] A06;
    public static String[] A07 = {"eoBlep8s1FBIN6Rt", "z5PVad8lFvymSbVcRUVN6mCVOAyUTpZZ", "CSzRbjHFCczJ9I", "vibjkM4Umklha9WpeyLj2yq757BqeZSZ", "UWrS", "", "nE8lp", "HlO2gnmnWOpwEq19Q9DE2Hcik4TJ8nc9"};
    public static final C4960B7 A08;

    @Nullable
    public MediaCodecPoolTracker A01;

    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<InterfaceC4953B0>> A04 = new HashMap();
    public final C4959B6 A03 = new C4959B6(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{-63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58};
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #3 {all -> 0x009f, blocks: (B:41:0x0078, B:44:0x007e, B:46:0x0082), top: B:56:0x0078 }] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z, C7066jQ c7066jQ, EnumC7061jL enumC7061jL, String str, InterfaceC4953B0 interfaceC4953B0) {
        if (A0I(z, c7066jQ) && A0G(str, c7066jQ)) {
            boolean z2 = true;
            synchronized (this) {
                if (this.A00 < c7066jQ.A07) {
                    Set<InterfaceC4953B0> setA06 = this.A04.get(str);
                    if (setA06 == null) {
                        setA06 = A06();
                        this.A04.put(str, setA06);
                    }
                    if (setA06.contains(interfaceC4953B0)) {
                        z2 = false;
                    } else if (((z && c7066jQ.A0N) || (!z && c7066jQ.A0M)) && setA06.size() < c7066jQ.A06) {
                        setA06.add(interfaceC4953B0);
                        this.A00++;
                        z2 = false;
                    }
                }
                if (!z2) {
                    try {
                        try {
                            this.A05 = SystemClock.elapsedRealtime();
                            interfaceC4953B0.reset();
                            A03().A09(enumC7061jL, interfaceC4953B0.hashCode());
                            this.A05 = -1L;
                            return;
                        } catch (IllegalStateException unused) {
                            A0B(str, interfaceC4953B0);
                            this.A05 = -1L;
                            if (c7066jQ.A0R) {
                                interfaceC4953B0.stop();
                            } else {
                                interfaceC4953B0.stop();
                            }
                        }
                    } catch (Throwable th) {
                        this.A05 = -1L;
                        throw th;
                    }
                }
            }
        }
        try {
            if (c7066jQ.A0R || (!z && !c7066jQ.A0Q)) {
                interfaceC4953B0.stop();
            }
        } finally {
            A03().A08(enumC7061jL, interfaceC4953B0.hashCode());
            interfaceC4953B0.AHb();
            A03().A07(enumC7061jL, interfaceC4953B0.hashCode());
        }
    }

    static {
        A08();
        A08 = new C4960B7();
    }

    private InterfaceC4953B0 A01(boolean z, C7066jQ c7066jQ, EnumC7061jL enumC7061jL, String str) throws Exception {
        if (A0I(z, c7066jQ) && A0G(str, c7066jQ)) {
            synchronized (this) {
                Set<InterfaceC4953B0> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<InterfaceC4953B0> it = set.iterator();
                    InterfaceC4953B0 ret = it.next();
                    it.remove();
                    A03().A0A(z, str, enumC7061jL, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            C7059jJ c7059jJA05 = A03().A05(z, str, enumC7061jL);
            InterfaceC4953B0 interfaceC4953B0A03 = this.A03.A03(z, str);
            A03().A06(c7059jJA05, interfaceC4953B0A03.hashCode());
            return interfaceC4953B0A03;
        } catch (Exception e) {
            throw new MediaCodecInitializationException(str, e);
        }
    }

    public static C4960B7 A02() {
        C4960B7 c4960b7 = A08;
        String[] strArr = A07;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "gdX1n";
        strArr2[4] = "uqN6";
        return c4960b7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaCodecPoolTracker A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return NoOpMediaCodecPoolTracker.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<InterfaceC4953B0> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(MediaCodecPoolTracker mediaCodecPoolTracker) {
        if (this.A01 == null) {
            this.A01 = mediaCodecPoolTracker;
        }
    }

    private void A0A(C7066jQ c7066jQ) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c7066jQ.A0S);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, InterfaceC4953B0 interfaceC4953B0) {
        Set<InterfaceC4953B0> set = this.A04.get(str);
        if (set != null && set.remove(interfaceC4953B0)) {
            int i = this.A00;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[1].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "FxBrmOrzGAHEl951IE67fieu752sH0JZ";
            strArr2[1] = "QwM4isUBZzXVsf3PyxWpFGvjBfZOcOMZ";
            this.A00 = i - 1;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 10));
    }

    public static boolean A0G(String str, C7066jQ c7066jQ) {
        if (A0E(str) && c7066jQ.A0C) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z, C7066jQ c7066jQ) {
        if (c7066jQ.A0E && this.A05 != -1 && SystemClock.elapsedRealtime() - this.A05 > 5000) {
            return false;
        }
        return A0J(z, c7066jQ);
    }

    public static boolean A0J(boolean z, C7066jQ c7066jQ) {
        return (z && c7066jQ.A0N) || (!z && c7066jQ.A0M);
    }

    public final InterfaceC4953B0 A0K(boolean z, C7066jQ c7066jQ, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC7061jL enumC7061jL, String str) throws Exception {
        A09(mediaCodecPoolTracker);
        A0A(c7066jQ);
        if (c7066jQ.A0K) {
            InterfaceC4953B0 interfaceC4953B0A02 = this.A03.A02(z, c7066jQ, enumC7061jL, str);
            String[] strArr = A07;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "ttyEUrXfsAwEm9Eniby4AXTGkmRMb34Z";
            strArr2[1] = "BAFCEyHtTeugEvQpUcdazZ0OUcRhptwZ";
            return interfaceC4953B0A02;
        }
        return A01(z, c7066jQ, enumC7061jL, str);
    }

    public final void A0L(boolean z, C7066jQ c7066jQ, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC7061jL enumC7061jL, String str, InterfaceC4953B0 interfaceC4953B0) throws Throwable {
        A09(mediaCodecPoolTracker);
        if (c7066jQ.A0K) {
            this.A03.A0A(z, c7066jQ, enumC7061jL, str, interfaceC4953B0);
        } else {
            A0C(z, c7066jQ, enumC7061jL, str, interfaceC4953B0);
        }
    }
}
