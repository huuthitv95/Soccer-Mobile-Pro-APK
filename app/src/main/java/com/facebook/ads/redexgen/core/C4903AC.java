package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4903AC extends AbstractC7477qP implements InterfaceC7385os {
    public static byte[] A0m;
    public static String[] A0n = {"elvUyEpYiUQqaqvwUQo90L33x5mfGGF5", "x3rc7jsIv6nSbJc9JPlcAze5yGxzQZsd", "UU9CG9klJf", "SZBoHO9Iw1qJ", "kHgqOkYqcJ", "2J3DKpzV", "imAdJlgwdHrtl5IWv7XQyaTS97", "KGY40HmMWVqKFUFEVN2bB10ght87eGPu"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C7478qQ A09;
    public C7456q2 A0A;
    public C7456q2 A0B;
    public C7456q2 A0C;
    public C7451px A0D;
    public C7449pv A0E;
    public C7425pW A0F;
    public C7420pR A0G;
    public C45984z A0H;
    public C4904AD A0I;
    public C47587Z A0J;
    public C47797u A0K;
    public InterfaceC5072Cx A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C7449pv A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Looper A0Y;
    public final InterfaceC45133b A0Z;
    public final C7439pl A0a;
    public final InterfaceC454245 A0b;
    public final C454548 A0c;
    public final C7383oq A0d;
    public final C4902AB A0e;
    public final InterfaceC7376oj A0f;
    public final AbstractC5195Ew A0g;
    public final C5196Ex A0h;
    public final CopyOnWriteArraySet<InterfaceC46936W> A0i;
    public final CopyOnWriteArraySet<InterfaceC45063U> A0j;
    public final boolean A0k;
    public final InterfaceC7381oo[] A0l;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0m, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0m = new byte[]{102, Ascii.f22494GS, 74, 119, 96, 95, 99, 110, 118, 106, 125, 70, 98, 127, 99, 0, Base64.padSymbol, 42, Ascii.NAK, 41, 36, 60, 32, 55, 9, 44, 39, 106, 119, 107, 125, 107, 116, 70, 97, 102, 123, 47, 71, 123, 118, 110, 114, 101, 55, 126, 100, 55, 118, 116, 116, 114, 100, 100, 114, 115, 55, 120, 121, 55, 99, 127, 114, 55, 96, 101, 120, 121, 112, 55, 99, 127, 101, 114, 118, 115, 57, Ascii.f22494GS, 84, 98, 101, 101, 114, 121, 99, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, Ascii.f22494GS, 82, 111, 103, 114, 116, 99, 114, 115, 55, 99, 127, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, Ascii.f22494GS, 68, 114, 114, 55, 127, 99, 99, 103, 100, 45, 56, 56, 114, 111, 120, 103, 123, 118, 110, 114, 101, 57, 115, 114, 97, 56, 126, 100, 100, 98, 114, 100, 56, 103, 123, 118, 110, 114, 101, 58, 118, 116, 116, 114, 100, 100, 114, 115, 58, 120, 121, 58, 96, 101, 120, 121, 112, 58, 99, 127, 101, 114, 118, 115, Ascii.DC4, 35, 42, 35, 39, 53, 35, 102, 122, 86, 43, 80, 99, 98, 92, 96, 109, 117, 105, 126, 95, 120, 109, 120, 105, 79, 100, 109, 98, 107, 105, 104, 93, 75, 75, 69, 122, 65, Ascii.f22500SO, 71, 73, SignedBytes.MAX_POWER_OF_TWO, 65, 92, 75, 74, Ascii.f22500SO, 76, 75, 77, 79, 91, 93, 75, Ascii.f22500SO, 79, SignedBytes.MAX_POWER_OF_TWO, Ascii.f22500SO, 79, 74, Ascii.f22500SO, 71, 93, Ascii.f22500SO, 94, 66, 79, 87, 71, SignedBytes.MAX_POWER_OF_TWO, 73};
    }

    static {
        A06();
    }

    public C4903AC(InterfaceC7381oo[] interfaceC7381ooArr, AbstractC5195Ew abstractC5195Ew, InterfaceC472774 interfaceC472774, InterfaceC5205F6 interfaceC5205F6, InterfaceC454245 interfaceC454245) {
        this(interfaceC7381ooArr, abstractC5195Ew, interfaceC472774, interfaceC5205F6, interfaceC454245, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public C4903AC(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC7381oo[] interfaceC7381ooArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") AbstractC5195Ew abstractC5195Ew, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") InterfaceC472774 interfaceC472774, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") InterfaceC5205F6 interfaceC5205F6, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") InterfaceC454245 interfaceC454245, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, boolean z7, int i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC45133b interfaceC45133b) {
        InterfaceC45133b interfaceC45133b2 = interfaceC45133b;
        Log.i(A04(2, 13, 30), A04(33, 5, 30) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 87) + A04(15, 18, 84) + A04(194, 3, 26) + AbstractC46115C.A04 + A04(193, 1, 54));
        this.A0c = new C454548();
        try {
            this.A0M = z13;
            AbstractC45353y.A08(interfaceC7381ooArr.length > 0);
            this.A0l = (InterfaceC7381oo[]) AbstractC45353y.A01(interfaceC7381ooArr);
            this.A0g = (AbstractC5195Ew) AbstractC45353y.A01(abstractC5195Ew);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0A = C7456q2.A0Z;
            this.A0B = C7456q2.A0Z;
            this.A0C = C7456q2.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C7478qQ.A07;
            this.A0W = 0L;
            this.A0j = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC7376oj analyticsCollector = InterfaceC7376oj.A00;
            this.A0f = analyticsCollector;
            this.A0K = C47797u.A03;
            this.A06 = 1;
            this.A0d = new C7383oq();
            this.A0h = new C5196Ex(new C47777s[interfaceC7381ooArr.length], new InterfaceC7284nE[interfaceC7381ooArr.length], C7427pY.A03, null);
            this.A0a = new C7439pl();
            this.A0T = new C45013P().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, abstractC5195Ew.A0Y()).A04();
            this.A0E = new C45013P().A02(this.A0T).A00(4).A00(10).A04();
            this.A0G = C7420pR.A03;
            this.A0D = C7451px.A06;
            this.A0Y = Looper.myLooper();
            final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
            this.A0X = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.6c
                @Override // android.os.Handler
                public final void handleMessage(Message msg) throws Throwable {
                    if (AbstractC6271WU.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.A0N(msg);
                    } catch (Throwable th) {
                        AbstractC6271WU.A00(th, this);
                    }
                }
            };
            this.A0b = interfaceC454245;
            this.A0Z = interfaceC45133b2 == null ? this : interfaceC45133b2;
            this.A0J = new C47587Z(Timeline.A02, 0L, C7302nW.A06, this.A0h);
            this.A0e = new C4902AB(interfaceC7381ooArr, abstractC5195Ew, this.A0h, interfaceC472774, interfaceC5205F6, this.A0Q, this.A05, this.A0S, this.A0X, interfaceC454245, z, z2, z3, z4, z5, z6, j, z7, i, z8, z9, z10, z11, z12, z14, C48098O.A03);
            this.A0F = C7425pW.A06;
            this.A0H = C45984z.A03;
            this.A0i = new CopyOnWriteArraySet<>();
        } finally {
            this.A0c.A04();
        }
    }

    private long A00(long j) {
        long jA01 = AbstractC44522Y.A01(j);
        if (!this.A0J.A05.A00()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a);
            long positionMs = this.A0a.A0B();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private long A01(Timeline timeline, C7320no c7320no, long j) {
        timeline.A0J(c7320no.A04, this.A0a);
        return j + this.A0a.A0C();
    }

    private C47587Z A02(boolean z, boolean z2, int i) {
        C5196Ex c5196Ex;
        if (z) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7h();
            this.A01 = A7c();
            this.A08 = A7e();
            this.A07 = A0J();
        }
        Timeline timeline = z2 ? Timeline.A02 : this.A0J.A03;
        C7320no c7320no = this.A0J.A05;
        long j = this.A0J.A02;
        long j2 = this.A0J.A01;
        C7302nW c7302nW = z2 ? C7302nW.A06 : this.A0J.A06;
        if (z2) {
            c5196Ex = this.A0h;
        } else {
            C47587Z c47587z = this.A0J;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0n;
            strArr2[3] = "Omd19LzmWdt3";
            strArr2[5] = "slTdP4Xe";
            c5196Ex = c47587z.A07;
        }
        return new C47587Z(timeline, c7320no, j, j2, i, false, c7302nW, c5196Ex, this.A0J.A05, this.A0J.A02, 0L, this.A0J.A02);
    }

    private C47627d A03(InterfaceC47617c interfaceC47617c) {
        int iA7h = A7h();
        C4902AB c4902ab = this.A0e;
        Timeline timeline = this.A0J.A03;
        if (iA7h == -1) {
            iA7h = 0;
        }
        return new C47627d(c4902ab, interfaceC47617c, timeline, iA7h, this.A0b, this.A0e.A1B());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0c.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String strA0n = AbstractC46115C.A0n(A04(38, 147, 6), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0k) {
                Log.w(A04(2, 13, 30), strA0n, this.A0N ? null : new IllegalStateException());
                if (A0n[6].length() == 12) {
                    throw new RuntimeException();
                }
                A0n[6] = "OHv4LuNWT";
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(strA0n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    private void A07(C47587Z c47587z, int i, boolean z, int i2) {
        int i3;
        C47587Z c47587zA06 = c47587z;
        this.A03 -= i;
        if (this.A03 == 0) {
            if (c47587zA06.A02 == -9223372036854775807L) {
                c47587zA06 = c47587zA06.A06(c47587zA06.A05, 0L, c47587zA06.A01, c47587zA06.A0D);
            }
            C47587Z playbackInfo = this.A0J;
            if (playbackInfo.A03.A0N()) {
                boolean z2 = this.A0O;
                String[] strArr = A0n;
                if (strArr[3].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0n[6] = "E7I7Mej0S3DTzUCwep";
                if (z2) {
                    if (c47587zA06.A03.A0N()) {
                        this.A01 = 0;
                        this.A02 = 0;
                        this.A08 = 0L;
                        this.A07 = 0L;
                    }
                }
            } else if (c47587zA06.A03.A0N()) {
                this.A01 = 0;
                this.A02 = 0;
                this.A08 = 0L;
                this.A07 = 0L;
            }
            if (this.A0O) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            boolean z3 = this.A0P;
            this.A0O = false;
            this.A0P = false;
            A08(c47587zA06, z, i2, i3, z3);
        }
    }

    private void A08(C47587Z c47587z, boolean z, int i, int i2, boolean z2) {
        Iterator<InterfaceC45063U> it;
        boolean isLoadingChanged = this.A0J.A03 != c47587z.A03;
        int i3 = this.A0J.A00;
        String[] strArr = A0n;
        if (strArr[2].length() == strArr[4].length()) {
            String[] strArr2 = A0n;
            strArr2[7] = "RJsywmu9iXbSHAOSoooup4iB6ctJ9GEd";
            strArr2[0] = "je0JKUsqzBp1pj8TVGEWBsFZVePcLGnq";
            boolean z3 = i3 != c47587z.A00;
            boolean playbackStateChanged = this.A0J.A0A;
            boolean timelineChanged = c47587z.A0A;
            boolean z4 = playbackStateChanged != timelineChanged;
            boolean z5 = this.A0J.A07 != c47587z.A07;
            this.A0J = c47587z;
            if (isLoadingChanged || i2 == 0) {
                Iterator<InterfaceC45063U> it2 = this.A0j.iterator();
                while (timelineChanged) {
                    InterfaceC45063U next = it2.next();
                    Timeline timeline = this.A0J.A03;
                    String[] strArr3 = A0n;
                    if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                        throw new RuntimeException();
                    }
                    A0n[6] = "RAQE2IWZazAhX";
                    next.AGA(timeline, i2);
                }
            }
            if (z) {
                Iterator<InterfaceC45063U> it3 = this.A0j.iterator();
                while (timelineChanged) {
                    it3.next();
                }
            }
            if (z5) {
                this.A0g.A0c(this.A0J.A07.A02);
                Iterator<InterfaceC45063U> it4 = this.A0j.iterator();
                while (timelineChanged) {
                    it4.next().AGE(this.A0J.A07.A01);
                }
            }
            if (z4) {
                Iterator<InterfaceC45063U> it5 = this.A0j.iterator();
                while (true) {
                    boolean zHasNext = it5.hasNext();
                    String[] strArr4 = A0n;
                    if (strArr4[2].length() == strArr4[4].length()) {
                        A0n[6] = "XRa";
                        if (!zHasNext) {
                            break;
                        } else {
                            it5.next();
                        }
                    }
                }
            }
            if (z3) {
                CopyOnWriteArraySet<InterfaceC45063U> copyOnWriteArraySet = this.A0j;
                if (A0n[1].charAt(28) != 'y') {
                    String[] strArr5 = A0n;
                    strArr5[3] = "HK22odgNy2pi";
                    strArr5[5] = "HFqBrVui";
                    it = copyOnWriteArraySet.iterator();
                } else {
                    it = copyOnWriteArraySet.iterator();
                }
                while (playbackStateChanged) {
                    InterfaceC45063U next2 = it.next();
                    boolean trackSelectorResultChanged = this.A0R;
                    next2.AFM(trackSelectorResultChanged, this.A0J.A00);
                }
            }
            if (z2) {
                Iterator<InterfaceC45063U> it6 = this.A0j.iterator();
                while (timelineChanged) {
                    it6.next().AFt();
                }
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z, boolean z2) {
        if (this.A0Q != z) {
            this.A0Q = z;
            this.A04++;
            this.A0e.A1G(z);
            C47587Z c47587z = this.A0J;
            if (!z) {
                this.A0R = z;
                for (InterfaceC45063U interfaceC45063U : this.A0j) {
                    if (0 != 0) {
                        throw new NullPointerException(A04(197, 20, 29));
                    }
                    interfaceC45063U.AFM(z, c47587z.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0J.A03.A0N() || this.A03 > 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7477qP
    public final void A0H(int i, long j) {
        long jA00;
        Timeline timeline = this.A0J.A03;
        if (i >= 0) {
            boolean zA0N = timeline.A0N();
            if (A0n[6].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0n;
            strArr[3] = "u5DgO7GwYyET";
            strArr[5] = "hfn3fs8A";
            if (zA0N || i < timeline.A07()) {
                this.A0P = true;
                this.A03++;
                if (AAd()) {
                    Log.w(A04(2, 13, 30), A04(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 39, 63));
                    this.A0X.obtainMessage(0, 1, -1, this.A0J).sendToTarget();
                    return;
                }
                this.A02 = i;
                if (timeline.A0N()) {
                    this.A08 = j == -9223372036854775807L ? 0L : j;
                    this.A01 = 0;
                } else {
                    if (j == -9223372036854775807L) {
                        jA00 = timeline.A0K(i, super.A00).A05();
                    } else {
                        jA00 = AbstractC44522Y.A00(j);
                    }
                    Pair<Object, Long> pairA0D = timeline.A0D(super.A00, this.A0a, i, jA00);
                    this.A08 = AbstractC44522Y.A01(jA00);
                    this.A01 = timeline.A0A(pairA0D.first);
                }
                this.A0e.A1D(timeline, i, AbstractC44522Y.A00(j));
                Iterator<InterfaceC45063U> it = this.A0j.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        throw new C44682q(timeline, i, j);
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A04.A03 != this.A0J.A05.A03) {
            return this.A0J.A03.A0K(A7h(), super.A00).A06();
        }
        long jA0D = this.A0J.A0B;
        if (this.A0J.A04.A00()) {
            C7439pl c7439plA0J = this.A0J.A03.A0J(this.A0J.A04.A04, this.A0a);
            jA0D = c7439plA0J.A0D(this.A0J.A04.A00);
            if (jA0D == Long.MIN_VALUE) {
                jA0D = c7439plA0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0J.A03, this.A0J.A04, jA0D);
        return AbstractC46115C.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            long j = this.A07;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A0n[1] = "SWSNQbytnn5JxmoGO3rxXNMtbmar9O4q";
            return j;
        }
        C47587Z c47587z = this.A0J;
        if (A0n[1].charAt(28) == 'y') {
            throw new RuntimeException();
        }
        A0n[1] = "VYQpOR71WpATH6H66c6IUhHHWo1qZbHI";
        return AbstractC44522Y.A01(c47587z.A0C);
    }

    public final Looper A0K() {
        return this.A0Y;
    }

    public final C47627d A0L(InterfaceC47617c interfaceC47617c) {
        A05();
        return A03(interfaceC47617c);
    }

    public final void A0M() {
        StringBuilder sbAppend = new StringBuilder().append(A04(185, 8, 87)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 87)).append(A04(15, 18, 84));
        String strA04 = A04(194, 3, 26);
        Log.i(A04(2, 13, 30), sbAppend.append(strA04).append(AbstractC46115C.A04).append(strA04).append(C448335.A00()).append(A04(193, 1, 54)).toString());
        this.A0L = null;
        this.A0e.A1C();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0J = A02(false, false, 1);
        this.A0G = C7420pR.A03;
    }

    public final void A0N(Message message) {
        switch (message.what) {
            case 0:
                A07((C47587Z) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C7451px c7451px = (C7451px) message.obj;
                C7451px c7451px2 = this.A0D;
                String[] strArr = A0n;
                if (strArr[2].length() == strArr[4].length()) {
                    String[] strArr2 = A0n;
                    strArr2[2] = "M5Fz4bo4aU";
                    strArr2[4] = "jAP48pK2xI";
                    if (!c7451px2.equals(c7451px)) {
                        this.A0D = c7451px;
                        Iterator<InterfaceC45063U> it = this.A0j.iterator();
                        while (it.hasNext()) {
                            it.next().AFI(c7451px);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 2:
                C4904AD c4904ad = (C4904AD) message.obj;
                this.A0I = c4904ad;
                CopyOnWriteArraySet<InterfaceC45063U> copyOnWriteArraySet = this.A0j;
                String[] strArr3 = A0n;
                if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0n;
                strArr4[3] = "qauhWK691fBn";
                strArr4[5] = "FsOQ1ovS";
                Iterator<InterfaceC45063U> it2 = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String[] strArr5 = A0n;
                    if (strArr5[3].length() != strArr5[5].length()) {
                        A0n[6] = "DbAY1NxOkLRBmNTAZlCZyxXxDbYRxJk";
                        if (!zHasNext) {
                            return;
                        }
                    } else if (!zHasNext) {
                        return;
                    }
                    it2.next().AFK(c4904ad);
                }
                break;
            case 3:
                this.A04--;
                if (this.A04 == 0) {
                    this.A0R = ((Boolean) message.obj).booleanValue();
                    CopyOnWriteArraySet<InterfaceC45063U> copyOnWriteArraySet2 = this.A0j;
                    if (A0n[1].charAt(28) == 'y') {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0n;
                    strArr6[3] = "yizDUJeCRugc";
                    strArr6[5] = "UffiDbl9";
                    for (InterfaceC45063U interfaceC45063U : copyOnWriteArraySet2) {
                        if (this.A0R) {
                            interfaceC45063U.AFM(this.A0R, this.A0J.A00);
                        }
                    }
                    return;
                }
                return;
            case 4:
                Iterator<InterfaceC45063U> it3 = this.A0j.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
                return;
            case 5:
                CopyOnWriteArraySet<InterfaceC45063U> copyOnWriteArraySet3 = this.A0j;
                String[] strArr7 = A0n;
                if (strArr7[7].charAt(29) == strArr7[0].charAt(29)) {
                    String[] strArr8 = A0n;
                    strArr8[3] = "QQxFLYRHq8rv";
                    strArr8[5] = "zDzShVZM";
                    Iterator<InterfaceC45063U> it4 = copyOnWriteArraySet3.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                    return;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final void A0O(InterfaceC45063U interfaceC45063U) {
        this.A0j.add(interfaceC45063U);
    }

    public final void A0P(InterfaceC5072Cx interfaceC5072Cx, boolean z, boolean z2) {
        this.A0I = null;
        this.A0L = interfaceC5072Cx;
        C47587Z c47587zA02 = A02(z, z2, 2);
        this.A0O = true;
        this.A03++;
        this.A0e.A1F(interfaceC5072Cx, z, z2);
        A08(c47587zA02, false, 4, 1, false);
    }

    public final void A0Q(boolean z) {
        A09(z, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A77() {
        if (AAd()) {
            if (this.A0J.A04.equals(this.A0J.A05)) {
                return AbstractC44522Y.A01(this.A0J.A0B);
            }
            return A7s();
        }
        return A0I();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A7T() {
        if (AAd()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a);
            return this.A0a.A0B() + AbstractC44522Y.A01(this.A0J.A01);
        }
        return A7e();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7Y() {
        if (AAd()) {
            return this.A0J.A05.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7Z() {
        if (AAd()) {
            return this.A0J.A05.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7b() {
        A05();
        int iA7h = A7h();
        if (iA7h == -1) {
            return 0;
        }
        return iA7h;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7c() {
        if (A0A()) {
            return this.A01;
        }
        Timeline timeline = this.A0J.A03;
        C7320no c7320no = this.A0J.A05;
        String[] strArr = A0n;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A0n[1] = "6o1scJ9TwXJl7WSt7vZ9WMBcl2tfzHGN";
        return timeline.A0A(c7320no.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A7e() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A05.A00()) {
            return AbstractC44522Y.A01(this.A0J.A0C);
        }
        return A00(this.A0J.A0C);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final Timeline A7g() {
        return this.A0J.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7h() {
        if (A0A()) {
            int i = this.A02;
            String[] strArr = A0n;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0n;
            strArr2[3] = "0i1iYNlUg7j9";
            strArr2[5] = "Koyujpdg";
            return i;
        }
        return this.A0J.A03.A0J(this.A0J.A05.A04, this.A0a).A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A7s() {
        Timeline timeline = this.A0J.A03;
        if (timeline.A0N()) {
            return -9223372036854775807L;
        }
        if (AAd()) {
            C7320no c7320no = this.A0J.A05;
            timeline.A0J(c7320no.A04, this.A0a);
            return AbstractC44522Y.A01(this.A0a.A0E(c7320no.A00, c7320no.A01));
        }
        return timeline.A0K(A7h(), super.A00).A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A9J() {
        return Math.max(0L, AbstractC44522Y.A01(this.A0J.A0D));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final boolean AAd() {
        return !A0A() && this.A0J.A05.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final void AKG(boolean z) {
        if (z) {
            this.A0I = null;
            this.A0L = null;
        }
        C47587Z c47587zA02 = A02(z, z, 1);
        this.A03++;
        this.A0e.A1H(z);
        A08(c47587zA02, false, 4, 1, false);
        this.A0G = new C7420pR(MetaExoPlayerCustomizedCollections.A01(), c47587zA02.A0C);
    }
}
