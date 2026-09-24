package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6650cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC5560Kr A02;
    public static final int A05 = (int) (AbstractC6334XX.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC6334XX.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC6334XX.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC6334XX.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC6334XX.A02 * 4.0f);

    public C6650cd(C6902gi c6902gi, ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr, AbstractC7077jd abstractC7077jd, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, C6847fp c6847fp, C6365Y2 c6365y2, C5728Na c5728Na, InterfaceC6579bU interfaceC6579bU) {
        super(c6902gi);
        this.A00 = c5728Na.A09(true);
        this.A01 = new RelativeLayout(c6902gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c6902gi, abstractC7077jd.A29().A0J().A04());
        if (viewOnClickListenerC5560Kr == null) {
            this.A02 = new ViewOnClickListenerC5560Kr(c6902gi, abstractC7077jd.A0w(), (C5728Na) null, interfaceC6192VA, interfaceC6406Yh, c6847fp, c6365y2, abstractC7077jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC5560Kr;
        }
        A03();
        this.A02.setCta(abstractC7077jd.A29().A0J(), abstractC7077jd.A2E(), new HashMap(), interfaceC6579bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C6902gi c6902gi, View view) {
        ImageView imageView = new ImageView(c6902gi);
        imageView.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C6902gi c6902gi, String str) {
        Button button = new Button(c6902gi);
        AbstractC6374YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC6374YB.A0Q(button, this.A00, A07);
        button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c6902gi, button);
    }

    public final EnumC5683Mq A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC7077jd abstractC7077jd, AbstractC6400Yb abstractC6400Yb) {
        this.A02.A0F(abstractC7077jd, abstractC6400Yb);
    }

    public void setCta(C5730Nc c5730Nc, String str, HashMap<String, String> extras, InterfaceC6579bU interfaceC6579bU) {
        this.A02.setCta(c5730Nc, str, extras, interfaceC6579bU);
    }
}
