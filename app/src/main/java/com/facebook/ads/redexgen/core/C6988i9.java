package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6988i9 implements InterfaceC5810Ou {
    private C5811Ov A00(InterfaceC5809Ot interfaceC5809Ot) {
        return (C5811Ov) interfaceC5809Ot.A7E();
    }

    public final void A01(InterfaceC5809Ot interfaceC5809Ot) {
        if (!interfaceC5809Ot.A9R()) {
            interfaceC5809Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC5809Ot);
        float fA8r = A8r(interfaceC5809Ot);
        float elevation = AbstractC5813Ox.A00(fA8S, fA8r, interfaceC5809Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC5813Ox.A01(fA8S, fA8r, interfaceC5809Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC5809Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final ColorStateList A71(InterfaceC5809Ot interfaceC5809Ot) {
        return A00(interfaceC5809Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final float A7v(InterfaceC5809Ot interfaceC5809Ot) {
        return interfaceC5809Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final float A8S(InterfaceC5809Ot interfaceC5809Ot) {
        return A00(interfaceC5809Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final float A8X(InterfaceC5809Ot interfaceC5809Ot) {
        return A8r(interfaceC5809Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final float A8Y(InterfaceC5809Ot interfaceC5809Ot) {
        return A8r(interfaceC5809Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final float A8r(InterfaceC5809Ot interfaceC5809Ot) {
        return A00(interfaceC5809Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final void AAG(InterfaceC5809Ot interfaceC5809Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C5811Ov background = new C5811Ov(colorStateList, f);
        interfaceC5809Ot.AJK(background);
        View view = interfaceC5809Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC5809Ot, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final void ADP(InterfaceC5809Ot interfaceC5809Ot) {
        AJX(interfaceC5809Ot, A8S(interfaceC5809Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final void AFT(InterfaceC5809Ot interfaceC5809Ot) {
        AJX(interfaceC5809Ot, A8S(interfaceC5809Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final void AJJ(InterfaceC5809Ot interfaceC5809Ot, ColorStateList colorStateList) {
        A00(interfaceC5809Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final void AJP(InterfaceC5809Ot interfaceC5809Ot, float f) {
        interfaceC5809Ot.A7F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final void AJX(InterfaceC5809Ot interfaceC5809Ot, float f) {
        A00(interfaceC5809Ot).A07(f, interfaceC5809Ot.A9R(), interfaceC5809Ot.A8q());
        A01(interfaceC5809Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5810Ou
    public final void AJj(InterfaceC5809Ot interfaceC5809Ot, float f) {
        A00(interfaceC5809Ot).A06(f);
    }
}
