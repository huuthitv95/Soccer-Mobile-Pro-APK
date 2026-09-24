package com.facebook.ads.redexgen.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ME */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5645ME extends AbstractC6464Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (AbstractC6334XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C5796Og A01;
    public final C6902gi A02;

    public C5645ME(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str, C5740Nm c5740Nm, InterfaceC6407Yi interfaceC6407Yi, InterfaceC6406Yh interfaceC6406Yh) {
        super(c6902gi, interfaceC6192VA, str, c5740Nm, interfaceC6407Yi, interfaceC6406Yh);
        this.A02 = c6902gi;
        this.A01 = AbstractC5797Oh.A00(c6902gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC6374YB.A0N(this.A00, -1728053248);
        if (C6171Up.A2b(c6902gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0O() {
        C5800Ok c5800OkA0A = this.A01.A0A();
        C6479Zs c6479Zs = new C6479Zs(this.A02);
        c6479Zs.setInfo(EnumC6385YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c6479Zs.setOnClickListener(new ViewOnClickListenerC6470Zj(this));
        C5800Ok c5800OkA0B = this.A01.A0B();
        C6479Zs c6479Zs2 = new C6479Zs(this.A02);
        c6479Zs2.setInfo(EnumC6385YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c6479Zs2.setOnClickListener(new ViewOnClickListenerC6471Zk(this));
        C6479Zs c6479Zs3 = new C6479Zs(this.A02);
        c6479Zs3.setInfo(EnumC6385YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c6479Zs3.setOnClickListener(new ViewOnClickListenerC6472Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        AbstractC6374YB.A0N(linearLayout, -1);
        if (!c5800OkA0A.A05().isEmpty()) {
            linearLayout.addView(c6479Zs, itemParams);
        }
        if (!c5800OkA0B.A05().isEmpty()) {
            linearLayout.addView(c6479Zs2, itemParams);
        }
        linearLayout.addView(c6479Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0P() {
        this.A00.removeAllViews();
        AbstractC6374YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0Q(C5800Ok c5800Ok, EnumC5798Oi enumC5798Oi) {
        String strA0E;
        int i;
        String strA01;
        if (enumC5798Oi == EnumC5798Oi.A05) {
            return;
        }
        boolean z = enumC5798Oi == EnumC5798Oi.A06;
        C6461Za c6461Za = new C6461Za(this.A02, this.A0D);
        if (z) {
            C5796Og c5796Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            strA0E = c5796Og.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C6461Za c6461ZaA0D = c6461Za.A0H(strA0E).A0G(this.A01.A0D()).A0E(c5800Ok.A04()).A0D(z ? EnumC6385YM.REPORT_AD : EnumC6385YM.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C6461Za c6461ZaA0C = c6461ZaA0D.A0C(i);
        if (this.A0C != null) {
            C5740Nm c5740Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                strA01 = c5740Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                strA01 = c5740Nm.A01();
            }
        } else {
            strA01 = "";
        }
        C6462Zb adHiddenView = c6461ZaA0C.A0F(strA01).A0L();
        AbstractC6374YB.A0N(adHiddenView, -1);
        AbstractC6374YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c5800Ok, enumC5798Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0R(C5800Ok c5800Ok, EnumC5798Oi enumC5798Oi) {
        String strA0H;
        boolean z = enumC5798Oi == EnumC5798Oi.A06;
        C6902gi c6902gi = this.A02;
        InterfaceC6466Zf interfaceC6466Zf = this.A0D;
        if (z) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C6482Zv c6482Zv = new C6482Zv(c6902gi, c5800Ok, interfaceC6466Zf, strA0H, z ? EnumC6385YM.REPORT_AD : EnumC6385YM.HIDE_AD);
        c6482Zv.setClickable(true);
        AbstractC6374YB.A0N(c6482Zv, -1);
        c6482Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c6482Zv, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
