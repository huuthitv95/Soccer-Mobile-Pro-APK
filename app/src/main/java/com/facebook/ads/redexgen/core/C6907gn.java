package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6907gn extends AbstractRunnableC6279Wc {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC6048Sp A00;
    public final /* synthetic */ C6049Sq A01;
    public final /* synthetic */ C6056Sx A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C6907gn(C6056Sx c6056Sx, ArrayList arrayList, C6049Sq c6049Sq, InterfaceC6048Sp interfaceC6048Sp, ArrayList arrayList2) {
        this.A02 = c6056Sx;
        this.A03 = arrayList;
        this.A01 = c6049Sq;
        this.A00 = interfaceC6048Sp;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        AtomicBoolean atomicBooleanA0D = C6056Sx.A0D(this.A03);
        if (this.A02.A04 instanceof C6902gi) {
            C6902gi c6902gi = (C6902gi) this.A02.A04;
            if (this.A01.A00 == -1) {
                boolean z = atomicBooleanA0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z) {
                        c6902gi.A0F().A4p(C6364Y1.A01(this.A02.A00));
                    } else {
                        c6902gi.A0F().A4n(C6364Y1.A01(this.A02.A00));
                    }
                }
                throw new RuntimeException();
            }
            if (atomicBooleanA0D.get()) {
                InterfaceC5624Lt interfaceC5624LtA0F = c6902gi.A0F();
                long jA01 = C6364Y1.A01(this.A02.A00);
                C6049Sq c6049Sq = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    interfaceC5624LtA0F.A4q(jA01, c6049Sq.A00);
                }
                throw new RuntimeException();
            }
            c6902gi.A0F().A4o(C6364Y1.A01(this.A02.A00), this.A01.A00);
        }
        this.A02.A02.post(new C6908go(this, atomicBooleanA0D));
        C6056Sx.A0D(this.A04);
    }
}
