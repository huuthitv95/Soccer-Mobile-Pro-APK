package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4L */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C45584L extends C5152EF {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C6776eg A01;
    public boolean A02;
    public final AbstractC6143UN<C45574K> A03;
    public final AbstractC6143UN<C45484B> A04;
    public final AbstractC6143UN<C5140E3> A05;
    public final AbstractC6143UN<C45474A> A06;
    public final AbstractC6143UN<C5135Dy> A07;
    public final AbstractC6143UN<C5133Dw> A08;
    public final AbstractC6143UN<C5132Dv> A09;
    public final AbstractC6143UN<C5127Dq> A0A;
    public final AbstractC6143UN<C5126Dp> A0B;
    public final C5183Ek A0C;
    public final AbstractC5137E0 A0D;
    public final AbstractC5128Dr A0E;

    public C45584L(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, C5183Ek c5183Ek, String str) {
        this(c6902gi, interfaceC6192VA, c5183Ek, str, 0, 0, false, null, null);
    }

    public C45584L(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, C5183Ek c5183Ek, String str, int i, int i2, boolean z, Bundle bundle, Map<String, String> map) {
        super(c6902gi, interfaceC6192VA, c5183Ek, str, !c5183Ek.A0m(), i, i2, z, bundle, map, new C5151EE(c6902gi, c5183Ek));
        this.A0E = new AbstractC5128Dr() { // from class: com.facebook.ads.redexgen.X.4M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5129Ds c5129Ds) {
                this.A00.A0f();
            }
        };
        this.A08 = new C5163EQ(this);
        this.A04 = new C5161EO(this);
        this.A05 = new C5160EN(this);
        this.A06 = new C5159EM(this);
        this.A03 = new C5158EL(this);
        this.A07 = new C5157EK(this);
        this.A0A = new C5156EJ(this);
        this.A0B = new C5155EI(this);
        this.A09 = new C5176Ed(this);
        this.A0D = new AbstractC5137E0() { // from class: com.facebook.ads.redexgen.X.4N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5138E1 c5138e1) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = c5183Ek;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (C6171Up.A2u(c6902gi)) {
            this.A01 = new C6776eg(c5183Ek, str, z, null);
        }
    }

    public C45584L(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, C5183Ek c5183Ek, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c6902gi, interfaceC6192VA, c5183Ek, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.C5152EF
    public final void A0n(EnumC6780ek enumC6780ek, Map<String, String> map) {
        super.A0n(enumC6780ek, map);
        if (this.A01 != null && enumC6780ek == EnumC6780ek.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C5166ET c5166et = new C5166ET(this);
        if (this.A0C.A0q()) {
            ExecutorC6367Y4.A00(c5166et);
            return;
        }
        C5183Ek c5183Ek = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        c5183Ek.getStateHandler().post(c5166et);
    }
}
