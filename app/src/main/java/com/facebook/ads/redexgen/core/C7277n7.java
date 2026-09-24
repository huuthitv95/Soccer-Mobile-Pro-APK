package com.facebook.ads.redexgen.core;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7277n7 {
    public static byte[] A03;
    public static String[] A04 = {"unLJAGqnT9K2C6pR52hzklfZHwTRg6Yr", "LeSEUls9Myr0akOYyr4ALINYOEymKOkL", "W8GYPv6JCblyMHrg4mb8qhrlE9HlP5p8", "LeDDfwbzgRXTDhaT1cwFWvWAB6ITTWPz", "taf7WKL89SeyG6P6BerDozU5lBYArJ2v", "", "BSTJObkWS6NqTAYjIRk7bCGrxc9Lgut2", "ohz3nwuOVveogY5495fLWWA936p3Bkwf"};
    public static final C5218FJ A05;
    public static final C5218FJ A06;
    public static final C5218FJ A07;
    public static final C5218FJ A08;
    public HandlerC5219FK<? extends InterfaceC5220FL> A00;
    public IOException A01;
    public final InterfaceExecutorC5236Fb A02;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A03 = new byte[]{62, 3, Ascii.DC4, 43, Ascii.ETB, Ascii.SUB, 2, Ascii.f22498RS, 9, 65, 55, Ascii.DC4, Ascii.SUB, Ascii.f22502US, Ascii.f22498RS, 9, 65};
    }

    static {
        A07();
        A07 = A01(false, -9223372036854775807L);
        A08 = A01(true, -9223372036854775807L);
        A05 = new C5218FJ(2, -9223372036854775807L);
        A06 = new C5218FJ(3, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C7277n7(InterfaceExecutorC5236Fb interfaceExecutorC5236Fb) {
        this.A02 = interfaceExecutorC5236Fb;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C7277n7(String str) {
        this(AbstractC5235Fa.A00(AbstractC46115C.A0u(A06(0, 17, 64) + str), new InterfaceC454649() { // from class: com.facebook.ads.redexgen.X.n8
            @Override // com.facebook.ads.redexgen.core.InterfaceC454649
            public final void A39(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    @MetaExoPlayerCustomization("D14742363 Needed to accept supplied looper for Exo2DashLiveManifestFetcher manifest loading")
    private final <T extends InterfaceC5220FL> long A00(Looper looper, T t, InterfaceC5217FI<T> interfaceC5217FI, int i) {
        AbstractC45353y.A08(looper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC5219FK(this, looper, t, interfaceC5217FI, i, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public static C5218FJ A01(boolean z, long j) {
        return new C5218FJ(z ? 1 : 0, j);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    public final <T extends InterfaceC5220FL> long A08(T t, InterfaceC5217FI<T> interfaceC5217FI, int i) {
        Looper looper = (Looper) AbstractC45353y.A02(Looper.myLooper());
        return A00(looper, t, interfaceC5217FI, i);
    }

    public final void A09() {
        ((HandlerC5219FK) AbstractC45353y.A02(this.A00)).A07(false);
    }

    public final void A0A() {
        this.A01 = null;
    }

    public final void A0B(int i) throws IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                HandlerC5219FK<? extends InterfaceC5220FL> handlerC5219FK = this.A00;
                if (i == Integer.MIN_VALUE) {
                    HandlerC5219FK<? extends InterfaceC5220FL> handlerC5219FK2 = this.A00;
                    String[] strArr = A04;
                    if (strArr[6].charAt(7) == strArr[1].charAt(7)) {
                        throw new RuntimeException();
                    }
                    A04[2] = "wo2YdO45DQEJfRTdGKzxAcazBLTDj4mX";
                    i = handlerC5219FK2.A06;
                }
                handlerC5219FK.A05(i);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A0C(InterfaceC5221FM interfaceC5221FM) {
        if (this.A00 != null) {
            HandlerC5219FK<? extends InterfaceC5220FL> handlerC5219FK = this.A00;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "XVuhTdSnDMDRP6HltjyP328n9S8al0u6";
            strArr2[0] = "1piWh3nqPhJ4K6qVEs9qRP5dHkNT6n7u";
            handlerC5219FK.A07(true);
        }
        if (interfaceC5221FM != null) {
            this.A02.execute(new RunnableC5222FN(interfaceC5221FM));
        }
        this.A02.AHb();
    }

    public final boolean A0D() {
        return this.A01 != null;
    }

    public final boolean A0E() {
        return this.A00 != null;
    }
}
