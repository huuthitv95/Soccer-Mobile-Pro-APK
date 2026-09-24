package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6398YZ extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C5796Og A02;
    public final C6902gi A03;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{103, 66};
    }

    static {
        A03();
        A08 = (int) (AbstractC6334XX.A02 * 50.0f);
        A05 = (int) (AbstractC6334XX.A02 * 10.0f);
        A06 = (int) (AbstractC6334XX.A02 * 20.0f);
        A09 = (int) (AbstractC6334XX.A02 * 4.0f);
        A07 = (int) (AbstractC6334XX.A02 * 12.0f);
    }

    public C6398YZ(C6902gi c6902gi, int i) {
        super(c6902gi);
        this.A03 = c6902gi;
        this.A02 = AbstractC5797Oh.A00(c6902gi.A02());
        setOrientation(0);
        this.A00 = new ImageView(c6902gi);
        this.A01 = new ImageView(c6902gi);
        A04(i);
    }

    private void A04(int i) {
        EnumC6385YM enumC6385YM;
        A05(this.A00, EnumC6385YM.AD_CHOICES_ICON);
        if (i == 2) {
            setPadding(A05, A05 / 3, A05, A05 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 80));
            textView.setTextColor(-1);
            textView.setPadding(0, A05 / 2, A05 / 2, A05 / 2);
            AbstractC6374YB.A0a(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        setPadding(A05, A05, A05, A05);
        if (i == 1) {
            enumC6385YM = EnumC6385YM.AN_INFO_ICON;
        } else {
            enumC6385YM = EnumC6385YM.DEFAULT_INFO_ICON;
        }
        A05(this.A01, enumC6385YM);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A06, A06);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, EnumC6385YM enumC6385YM) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(AbstractC6386YN.A01(enumC6385YM));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C5740Nm c5740Nm, String str, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh) {
        setOnClickListener(new ViewOnClickListenerC6397YY(this, c6200vi, interfaceC6406Yh, str, c5740Nm));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i);
        AbstractC6374YB.A0V(this, gradientDrawable);
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
        this.A01.setColorFilter(i);
    }
}
