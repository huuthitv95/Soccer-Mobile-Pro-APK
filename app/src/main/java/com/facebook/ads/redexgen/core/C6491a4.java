package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6491a4 extends LinearLayout {
    public final Handler A00;
    public final ImageView A01;
    public final ImageView A02;
    public final C5740Nm A03;
    public final C5796Og A04;
    public final C6902gi A05;
    public final C6200VI A06;
    public final InterfaceC6406Yh A07;
    public final Runnable A08;
    public final String A09;

    public C6491a4(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh) {
        super(c6902gi);
        this.A00 = new Handler(Looper.getMainLooper());
        this.A08 = new RunnableC6489a2(this);
        this.A05 = c6902gi;
        this.A09 = abstractC7077jd.A2E();
        this.A03 = abstractC7077jd.A2C();
        this.A07 = interfaceC6406Yh;
        this.A06 = c6200vi;
        this.A04 = AbstractC5797Oh.A00(c6902gi.A02());
        this.A01 = A01(EnumC6385YM.AD_CHOICE_V2_COLLAPSE, 1104);
        addView(this.A01);
        this.A02 = A01(EnumC6385YM.AD_CHOICE_V2_EXPAND, 1105);
        addView(this.A02);
        A07(8);
        setOnClickListener(new ViewOnClickListenerC6490a3(this));
    }

    private final ImageView A01(EnumC6385YM enumC6385YM, int i) {
        ImageView imageView = new ImageView(this.A05);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView.setImageBitmap(AbstractC6386YN.A01(enumC6385YM));
        AbstractC6374YB.A0G(i, imageView);
        return imageView;
    }

    public final void A04() {
        this.A00.removeCallbacksAndMessages(null);
    }

    public final void A05() {
        this.A00.removeCallbacks(this.A08);
        A07(8);
    }

    public final void A06() {
        if (this.A06 != null) {
            this.A06.A04(EnumC6199VH.A0A, null);
        }
        if (this.A04.A0O(this.A05.A02(), true)) {
            this.A07.AAo(this.A09, this.A03);
        } else {
            if (TextUtils.isEmpty(this.A03.A00())) {
                return;
            }
            C6307X6.A0O(new C6307X6(), this.A05, AbstractC6312XB.A00(this.A03.A00()), this.A09);
        }
    }

    public final void A07(int i) {
        if (i == 0) {
            this.A02.setVisibility(0);
            this.A01.setVisibility(8);
        } else {
            this.A02.setVisibility(8);
            this.A01.setVisibility(0);
        }
    }
}
