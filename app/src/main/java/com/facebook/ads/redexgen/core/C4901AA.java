package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4901AA extends AbstractC7477qP implements InterfaceC7385os {
    public static byte[] A0N;
    public static String[] A0O = {"ryR4HSm2zR8tip5OkgYwdb0JWy9e3v2W", "Fm5MoQAoRuRRmRXPK4I4CJ8bYaju2JW1", "syIAGKVT8Ewa7Rni6nktnCNdH4Ja85Gc", "ScHbfbbxkU", "HZJXjhizoNO31MnMnm7FxQnRU8I8lePN", "YCsl9os6nHqs6yB8LR1hlQvfR5oCt3rk", "Ml6mHBX1GsWDWNWH2EtCrt2HpilhtHKz", "59SI8zfcXXU2xe69nRlPKARsr0343GFe"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C7478qQ A06;
    public C7472qI A07;
    public C7472qI A08;
    public C46796I A09;
    public C46796I A0A;
    public InterfaceC5072Cx A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C4903AC A0E;
    public final SurfaceHolderCallbackC7379om A0F;
    public final InterfaceC7376oj A0G;
    public final CopyOnWriteArraySet<InterfaceC48358p> A0H;
    public final CopyOnWriteArraySet<InterfaceC45063U> A0I;
    public final CopyOnWriteArraySet<InterfaceC4994Bf> A0J;
    public final CopyOnWriteArraySet<InterfaceC5286GQ> A0K;
    public final CopyOnWriteArraySet<InterfaceC7378ol> A0L;
    public final InterfaceC7381oo[] A0M;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C4901AA(Context context, InterfaceC47787t interfaceC47787t, AbstractC5195Ew abstractC5195Ew, InterfaceC472774 interfaceC472774, InterfaceC5205F6 interfaceC5205F6, InterfaceC4897A6 interfaceC4897A6, InterfaceC7123kO<InterfaceC454245, InterfaceC7376oj> interfaceC7123kO, InterfaceC454245 interfaceC454245) {
        this.A0F = new SurfaceHolderCallbackC7379om(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(looperMyLooper);
        this.A0M = interfaceC47787t.A5Y(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, interfaceC4897A6);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C7478qQ.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, abstractC5195Ew, interfaceC472774, interfaceC5205F6, interfaceC454245);
        this.A0G = interfaceC7123kO.A4B(interfaceC454245);
        this.A0G.AJf(this.A0E, looperMyLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0N = new byte[]{-41, -19, -15, -12, -16, -23, -55, -4, -13, -44, -16, -27, -3, -23, -10, Ascii.f22492FF, 46, 43, Ascii.f22502US, Ascii.SUB, Ascii.f22493FS, Ascii.f22498RS, Ascii.f22490CR, Ascii.f22498RS, 49, 45, 46, 43, Ascii.f22498RS, 5, 34, 44, 45, Ascii.f22498RS, 39, Ascii.f22498RS, 43, -39, Ascii.SUB, 37, 43, Ascii.f22498RS, Ascii.SUB, Ascii.f22494GS, 50, -39, 46, 39, 44, Ascii.f22498RS, 45, -39, 40, 43, -39, 43, Ascii.f22498RS, 41, 37, Ascii.SUB, Ascii.f22493FS, Ascii.f22498RS, Ascii.f22494GS, -25};
    }

    static {
        A0E();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<com.facebook.ads.androidx.media3.common.util.Clock, com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsCollector> */
    public C4901AA(Context context, InterfaceC47787t interfaceC47787t, AbstractC5195Ew abstractC5195Ew, InterfaceC472774 interfaceC472774, InterfaceC5205F6 interfaceC5205F6, InterfaceC4897A6 interfaceC4897A6, InterfaceC7123kO<InterfaceC454245, InterfaceC7376oj> interfaceC7123kO) {
        this(context, interfaceC47787t, abstractC5195Ew, interfaceC472774, interfaceC5205F6, interfaceC4897A6, interfaceC7123kO, InterfaceC454245.A00);
    }

    @Deprecated
    public C4901AA(InterfaceC47787t interfaceC47787t, AbstractC5195Ew abstractC5195Ew, InterfaceC472774 interfaceC472774, InterfaceC5205F6 interfaceC5205F6, InterfaceC4897A6 interfaceC4897A6) {
        this(null, interfaceC47787t, abstractC5195Ew, interfaceC472774, interfaceC5205F6, interfaceC4897A6, new InterfaceC7123kO() { // from class: com.facebook.ads.redexgen.X.or
            @Override // com.facebook.ads.redexgen.core.InterfaceC7123kO
            public final Object A4B(Object obj) {
                return new C4899A8((InterfaceC454245) obj);
            }
        });
    }

    private final C4903AC A06(InterfaceC7381oo[] interfaceC7381ooArr, AbstractC5195Ew abstractC5195Ew, InterfaceC472774 interfaceC472774, InterfaceC5205F6 interfaceC5205F6, InterfaceC454245 interfaceC454245) {
        return new C4903AC(interfaceC7381ooArr, abstractC5195Ew, interfaceC472774, interfaceC5205F6, interfaceC454245);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 71), A07(15, 49, 124));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            String[] strArr = A0O;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[6] = "1mt3T64XRkFMJTK0AHNCLCnfNjMbTppi";
            strArr2[3] = "rnp4JtgfYQ";
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7381oo interfaceC7381oo : this.A0M) {
            if (interfaceC7381oo.A9N() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC7381oo).A07(1).A08(surface).A06());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C47627d) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7477qP
    public final void A0H(int i, long j) {
        this.A0G.ACe();
        this.A0E.A0H(i, j);
    }

    public final int A0I() {
        return this.A01;
    }

    public final C7472qI A0J() {
        return this.A07;
    }

    public final C7472qI A0K() {
        return this.A08;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f) {
        float fA00 = AbstractC46115C.A00(f, 0.0f, 1.0f);
        if (this.A00 == fA00) {
            return;
        }
        this.A00 = fA00;
        for (InterfaceC7381oo interfaceC7381oo : this.A0M) {
            if (interfaceC7381oo.A9N() == 1) {
                this.A0E.A0L(interfaceC7381oo).A07(2).A08(Float.valueOf(fA00)).A06();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(InterfaceC45063U interfaceC45063U) {
        this.A0E.A0O(interfaceC45063U);
        this.A0I.add(interfaceC45063U);
    }

    public final void A0P(InterfaceC7378ol interfaceC7378ol) {
        this.A0L.add(interfaceC7378ol);
    }

    public final void A0Q(InterfaceC5072Cx interfaceC5072Cx) {
        A0R(interfaceC5072Cx, true, true);
    }

    public final void A0R(InterfaceC5072Cx interfaceC5072Cx, boolean z, boolean z2) {
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
        }
        this.A0B = interfaceC5072Cx;
        interfaceC5072Cx.A3z(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC5072Cx, z, z2);
    }

    public final void A0S(boolean z) {
        this.A0E.A0Q(z);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A77() {
        return this.A0E.A77();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A7T() {
        return this.A0E.A7T();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7Y() {
        return this.A0E.A7Y();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7Z() {
        return this.A0E.A7Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7b() {
        return this.A0E.A7b();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7c() {
        return this.A0E.A7c();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A7e() {
        return this.A0E.A7e();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final Timeline A7g() {
        return this.A0E.A7g();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final int A7h() {
        return this.A0E.A7h();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A7s() {
        return this.A0E.A7s();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final long A9J() {
        return this.A0E.A9J();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final boolean AAd() {
        return this.A0E.AAd();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC45133b
    public final void AKG(boolean z) {
        this.A0E.AKG(z);
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
            if (z) {
                this.A0B = null;
            }
        }
    }
}
