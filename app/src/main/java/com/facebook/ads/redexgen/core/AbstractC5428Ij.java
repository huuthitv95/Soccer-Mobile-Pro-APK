package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ij */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5428Ij extends RelativeLayout implements InterfaceC6327XQ {
    public static byte[] A0E;
    public static String[] A0F = {"uUMDphsbcltlMAasrXzhzXIIsD27sBrh", "kD4ASPr1mkkPPQg7686pKphnCznMXNdE", "3u4w9tHTXiQc09zCQQwrpogVyGpuea0B", "uLxjLzdSNqmjg5WlrsUTBNxe2IHJHDsH", "sowIyJkgs7pChNHWV216bYY5IvqkL5", "woZqrf3JBfr8DagdWcXdOyEt75sBOiDm", "mZPGIv6MosabarlDevuwzM4J02qRjqBR", "rZe00TaCIEKWr55DYJNI366SEGcMY1oV"};
    public static final int A0G;
    public String A00;
    public boolean A01;
    public final int A02;
    public final AbstractC6846fo A03;
    public final boolean A04;
    public final boolean A05;
    public final AbstractC7077jd A06;
    public final C6902gi A07;
    public final InterfaceC6192VA A08;
    public final C6329XS A09;
    public final C6365Y2 A0A;
    public final InterfaceC6406Yh A0B;
    public final InterfaceC6455ZU A0C;
    public final C6847fp A0D;

    public static String A19(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A1A() {
        A0E = new byte[]{95, Ascii.DLE, Ascii.f22491EM, 95, 5, 32, 100};
        if (A0F[4].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "lGg0879wdsNhw7V1Qtd20OQ8gEXobd5O";
        strArr[0] = "a2lydBkKvgM6UKG9QoQR6B5cBx9Kev1F";
    }

    public abstract EnumC5683Mq A1D(String str);

    public abstract void A1G();

    public abstract void A1H();

    public abstract void A1J(boolean z);

    public abstract void A1K(boolean z);

    public abstract boolean A1L();

    public abstract boolean A1M();

    public abstract boolean A1N();

    public abstract C6719dk getFullScreenAdStyle();

    static {
        A1A();
        A0G = (int) (AbstractC6334XX.A02 * 80.0f);
    }

    public AbstractC5428Ij(C6902gi c6902gi, InterfaceC6455ZU interfaceC6455ZU, InterfaceC6192VA interfaceC6192VA, AbstractC7077jd abstractC7077jd, int i, boolean z, boolean z2, InterfaceC6406Yh interfaceC6406Yh, int i2) {
        super(c6902gi);
        this.A0A = new C6365Y2();
        this.A01 = false;
        this.A00 = A19(0, 0, 48);
        this.A03 = new C5432In(this);
        this.A02 = i;
        this.A07 = c6902gi;
        this.A05 = z;
        this.A04 = z2;
        this.A0B = interfaceC6406Yh;
        this.A0C = interfaceC6455ZU;
        this.A06 = abstractC7077jd;
        this.A08 = interfaceC6192VA;
        this.A0D = new C6847fp(this, 1, new WeakReference(this.A03), c6902gi);
        this.A0D.A0W(abstractC7077jd.A0m());
        this.A0D.A0X(abstractC7077jd.A0n());
        this.A09 = C6329XS.A00(this.A07, this.A06, this);
        if (this.A06.A1c()) {
            this.A00 = A18(this.A02, i2);
        }
    }

    public static String A18(int i, int i2) {
        return A19(4, 3, 9) + (i + 1) + A19(0, 4, 50) + i2;
    }

    public void A1E() {
        this.A09.A03();
    }

    public final void A1F() {
        if (!this.A01) {
            this.A0D.A0U();
            this.A01 = true;
        }
    }

    public void A1I(boolean z) {
    }

    public AbstractC7077jd getAdDataBundle() {
        return this.A06;
    }

    public C6847fp getAdViewabilityChecker() {
        return this.A0D;
    }

    public C6365Y2 getTouchDataRecorder() {
        return this.A0A;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
