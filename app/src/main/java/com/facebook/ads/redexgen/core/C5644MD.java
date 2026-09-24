package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5644MD extends AbstractC6464Zd {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C5796Og A04;
    public final C6902gi A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, Ascii.DC2, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A01();
        A09 = (int) (AbstractC6334XX.A02 * 4.0f);
        A08 = (int) (AbstractC6334XX.A02 * 10.0f);
        A07 = (int) (AbstractC6334XX.A02 * 44.0f);
    }

    public C5644MD(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, String str) {
        super(c6902gi, interfaceC6192VA, str);
        this.A05 = c6902gi;
        this.A04 = AbstractC5797Oh.A00(c6902gi.A02());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        AbstractC6374YB.A0N(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0O() {
        this.A01.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC6473Zm(this));
        this.A01.setContentDescription(A00(4, 18, 84));
        C6468Zh c6468Zh = new C6468Zh(this.A05);
        c6468Zh.setData(this.A04.A0H(), EnumC6385YM.HIDE_AD);
        c6468Zh.setOnClickListener(new ViewOnClickListenerC6474Zn(this, c6468Zh));
        C6468Zh c6468Zh2 = new C6468Zh(this.A05);
        c6468Zh2.setData(this.A04.A0L(), EnumC6385YM.REPORT_AD);
        c6468Zh2.setOnClickListener(new ViewOnClickListenerC6475Zo(this, c6468Zh2));
        C6468Zh c6468Zh3 = new C6468Zh(this.A05);
        c6468Zh3.setData(this.A04.A0M(), EnumC6385YM.AD_CHOICES_ICON);
        c6468Zh3.setOnClickListener(new ViewOnClickListenerC6476Zp(this, c6468Zh3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        AbstractC6374YB.A0W(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c6468Zh, layoutParams);
        this.A02.addView(c6468Zh2, layoutParams);
        this.A02.addView(c6468Zh3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0P() {
        AbstractC6374YB.A0I(this);
        AbstractC6374YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0Q(C5800Ok c5800Ok, EnumC5798Oi enumC5798Oi) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        AbstractC6374YB.A0a(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        AbstractC6374YB.A0W(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
        super.A0Q(c5800Ok, enumC5798Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final void A0R(C5800Ok c5800Ok, EnumC5798Oi enumC5798Oi) {
        AbstractC6374YB.A0W(this.A03);
        this.A01.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC6477Zq(this));
        this.A01.setContentDescription(A00(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (C5800Ok c5800Ok2 : c5800Ok.A05()) {
            C6468Zh c6468Zh = new C6468Zh(this.A05);
            c6468Zh.setData(c5800Ok2.A04(), null);
            c6468Zh.setOnClickListener(new ViewOnClickListenerC6478Zr(this, c6468Zh, c5800Ok2));
            this.A02.addView(c6468Zh, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6464Zd
    public final boolean A0S() {
        return true;
    }
}
