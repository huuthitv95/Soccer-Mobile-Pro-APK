package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6757eM {
    public ViewOnClickListenerC5560Kr A00;
    public final C5715NN A01;
    public final C5726NY A02;
    public final C5731Nd A03;
    public final C5740Nm A04;
    public final C6902gi A05;
    public final C6200VI A06;
    public static final int A09 = (int) (AbstractC6334XX.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC6334XX.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC6334XX.A02 * 8.0f);

    public C6757eM(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, AbstractC7077jd abstractC7077jd) {
        this.A05 = c6902gi;
        this.A06 = new C6200VI(abstractC7077jd.A2E(), interfaceC6192VA);
        this.A01 = abstractC7077jd.A28();
        this.A02 = abstractC7077jd.A29().A0I();
        this.A04 = abstractC7077jd.A2C();
        this.A03 = abstractC7077jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        C6601bq c6601bq = new C6601bq(this.A05, this.A01.A01(), true, false, false);
        c6601bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c6601bq.setAlignment(17);
        C6595bk c6595bk = new C6595bk(this.A05);
        AbstractC6374YB.A0N(c6595bk, 0);
        c6595bk.setRadius(50);
        new AsyncTaskC5591LM(c6595bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c6595bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c6601bq, layoutParams);
        if (viewOnClickListenerC5560Kr != null) {
            AbstractC6374YB.A0J(viewOnClickListenerC5560Kr);
            linearLayout.addView(viewOnClickListenerC5560Kr, layoutParams);
            viewOnClickListenerC5560Kr.setPadding(AbstractC6332XV.A0Z, 0, AbstractC6332XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC5560Kr.getText())) {
                AbstractC6374YB.A0H(viewOnClickListenerC5560Kr);
            }
        }
        return linearLayout;
    }

    private C47457M A01() {
        C47457M c47457m = new C47457M(this.A05);
        c47457m.setLayoutManager(new C6972hr(this.A05, 0, false));
        c47457m.setAdapter(new C5216FH(this.A05, this.A03.A02(), A09, this.A00));
        return c47457m;
    }

    private final EnumC6756eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC6756eL.A03;
        }
        return EnumC6756eL.A02;
    }

    public final Pair<EnumC6756eL, View> A03(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        View viewA01;
        this.A00 = viewOnClickListenerC5560Kr;
        EnumC6756eL enumC6756eLA02 = A02();
        switch (enumC6756eLA02) {
            case A03:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AbstractC6202VK.A04(viewA01, this.A06, EnumC6199VH.A0S);
        return new Pair<>(enumC6756eLA02, viewA01);
    }
}
