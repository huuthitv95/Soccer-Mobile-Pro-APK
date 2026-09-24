package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6437ZC extends LinearLayout {
    public static final int A03 = (int) (AbstractC6334XX.A02 * 10.0f);
    public static final int A04 = (int) (AbstractC6334XX.A02 * 24.0f);
    public final ImageView A00;
    public final C5796Og A01;
    public final C6902gi A02;

    public C6437ZC(C6902gi c6902gi) {
        super(c6902gi);
        this.A02 = c6902gi;
        this.A01 = AbstractC5797Oh.A00(c6902gi.A02());
        this.A00 = new ImageView(c6902gi);
        A02();
    }

    private void A02() {
        A03(this.A00, EnumC6385YM.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, EnumC6385YM enumC6385YM) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(AbstractC6386YN.A01(enumC6385YM));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C5740Nm c5740Nm, String str, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh) {
        setOnClickListener(new ViewOnClickListenerC6436ZB(this, c6200vi, interfaceC6406Yh, str, c5740Nm));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
