package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5643MC extends AbstractC6464Zd {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C5796Og A03;
    public final C6902gi A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A01();
        A08 = (int) (AbstractC6334XX.A02 * 8.0f);
        A07 = (int) (AbstractC6334XX.A02 * 10.0f);
        A06 = (int) (AbstractC6334XX.A02 * 44.0f);
    }

    public C5643MC(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str) {
        super(c6902gi, interfaceC6192VA, str);
        this.A04 = c6902gi;
        this.A03 = AbstractC5797Oh.A00(this.A04.A02());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        AbstractC6374YB.A0N(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0O() {
        this.A00.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC6483Zw(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        C6468Zh c6468Zh = new C6468Zh(this.A04);
        c6468Zh.setData(this.A03.A0H(), EnumC6385YM.HIDE_AD);
        c6468Zh.setOnClickListener(new ViewOnClickListenerC6484Zx(this, c6468Zh));
        C6468Zh c6468Zh2 = new C6468Zh(this.A04);
        c6468Zh2.setData(this.A03.A0L(), EnumC6385YM.REPORT_AD);
        c6468Zh2.setOnClickListener(new ViewOnClickListenerC6485Zy(this, c6468Zh2));
        C6468Zh c6468Zh3 = new C6468Zh(this.A04);
        c6468Zh3.setData(this.A03.A0M(), EnumC6385YM.AD_CHOICES_ICON);
        c6468Zh3.setOnClickListener(new ViewOnClickListenerC6486Zz(this, c6468Zh3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC6374YB.A0W(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c6468Zh, menuParams);
        linearLayout.addView(c6468Zh2, menuParams);
        linearLayout.addView(c6468Zh3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0P() {
        AbstractC6374YB.A0I(this);
        AbstractC6374YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0Q(C5800Ok c5800Ok, EnumC5798Oi enumC5798Oi) {
        String strA0H;
        EnumC6385YM enumC6385YM;
        int i;
        this.A00.setOnClickListener(null);
        if (enumC5798Oi == EnumC5798Oi.A06) {
            strA0H = this.A03.A0F();
            enumC6385YM = EnumC6385YM.REPORT_AD;
            i = -552389;
        } else {
            strA0H = this.A03.A0H();
            enumC6385YM = EnumC6385YM.HIDE_AD;
            i = -13272859;
        }
        C6461Za c6461ZaA0H = new C6461Za(this.A04, this.A0D).A0H(strA0H);
        String title = this.A03.A0D();
        C6461Za c6461ZaA0G = c6461ZaA0H.A0G(title);
        String title2 = c5800Ok.A04();
        C6462Zb adHiddenView = c6461ZaA0G.A0E(title2).A0J(false).A0D(enumC6385YM).A0C(i).A0K(false).A0I(false).A0L();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC6374YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
        super.A0Q(c5800Ok, enumC5798Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0R(C5800Ok c5800Ok, EnumC5798Oi enumC5798Oi) {
        boolean isReportFlow = enumC5798Oi == EnumC5798Oi.A06;
        C6482Zv c6482Zv = new C6482Zv(this.A04, c5800Ok, this.A0D, isReportFlow ? EnumC6385YM.REPORT_AD : EnumC6385YM.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC6487a0(this));
        this.A00.setContentDescription(A00(0, 4, 114));
        AbstractC6374YB.A0W(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c6482Zv, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final boolean A0S() {
        return true;
    }
}
