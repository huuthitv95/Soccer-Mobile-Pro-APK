package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6617c6 {
    public boolean A00;
    public View A03;
    public AbstractC5686Mt A04;
    public C6200VI A05;
    public C6140UK A06;
    public InterfaceC6344Xh A07;
    public AbstractC6400Yb A08;
    public InterfaceC6721dm A09;
    public C5110DZ A0A;
    public String A0B;
    public final View A0C;
    public final AbstractC7077jd A0D;
    public final C6902gi A0E;
    public final InterfaceC6192VA A0F;
    public final C6365Y2 A0G;
    public final InterfaceC6406Yh A0H;
    public final C6847fp A0I;
    public int A02 = 0;
    public int A01 = 1;

    public C6617c6(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, AbstractC7077jd abstractC7077jd, View view, C6847fp c6847fp, C6365Y2 c6365y2) {
        this.A0E = c6902gi;
        this.A0F = interfaceC6192VA;
        this.A0H = interfaceC6406Yh;
        this.A0D = abstractC7077jd;
        this.A0C = view;
        this.A0I = c6847fp;
        this.A0G = c6365y2;
    }

    public final C6617c6 A0I(int i) {
        this.A01 = i;
        return this;
    }

    public final C6617c6 A0J(int i) {
        this.A02 = i;
        return this;
    }

    public final C6617c6 A0K(View view) {
        this.A03 = view;
        return this;
    }

    public final C6617c6 A0L(AbstractC5686Mt abstractC5686Mt) {
        this.A04 = abstractC5686Mt;
        return this;
    }

    public final C6617c6 A0M(C6200VI c6200vi) {
        this.A05 = c6200vi;
        return this;
    }

    public final C6617c6 A0N(C6140UK c6140uk) {
        this.A06 = c6140uk;
        return this;
    }

    public final C6617c6 A0O(InterfaceC6344Xh interfaceC6344Xh) {
        this.A07 = interfaceC6344Xh;
        return this;
    }

    public final C6617c6 A0P(AbstractC6400Yb abstractC6400Yb) {
        this.A08 = abstractC6400Yb;
        return this;
    }

    public final C6617c6 A0Q(InterfaceC6721dm interfaceC6721dm) {
        this.A09 = interfaceC6721dm;
        return this;
    }

    public final C6617c6 A0R(C5110DZ c5110dz) {
        this.A0A = c5110dz;
        return this;
    }

    public final C6617c6 A0S(String str) {
        this.A0B = str;
        return this;
    }

    public final C6617c6 A0T(boolean z) {
        this.A00 = z;
        return this;
    }

    public final C6618c7 A0U() {
        return new C6618c7(this);
    }
}
