package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dj */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6718dj extends RelativeLayout {
    public ViewOnClickListenerC5560Kr A00;
    public final View.OnClickListener A01;
    public final C5726NY A02;
    public final C5740Nm A03;
    public final C6902gi A04;
    public final C6595bk A05;
    public final C6601bq A06;
    public final String A07;
    public static final int A0B = (int) (AbstractC6334XX.A02 * 2.0f);
    public static final int A0F = (int) (AbstractC6334XX.A02 * 16.0f);
    public static final int A0D = (int) (AbstractC6334XX.A02 * 20.0f);
    public static final int A0E = (int) (AbstractC6334XX.A02 * 13.0f);
    public static final int A08 = (int) (AbstractC6334XX.A02 * 72.0f);
    public static final int A0C = (int) (AbstractC6334XX.A02 * 8.0f);
    public static final int A0A = (int) (AbstractC6334XX.A02 * 24.0f);
    public static final int A09 = (int) (AbstractC6334XX.A02 * 16.0f);

    public C6718dj(C6902gi c6902gi, C5740Nm c5740Nm, C5726NY c5726ny, ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr, String str, View.OnClickListener onClickListener) {
        super(c6902gi);
        this.A04 = c6902gi;
        this.A03 = c5740Nm;
        this.A02 = c5726ny;
        this.A00 = viewOnClickListenerC5560Kr;
        this.A07 = str;
        this.A01 = onClickListener;
        this.A05 = new C6595bk(this.A04);
        this.A06 = new C6601bq(this.A04, C5728Na.A01(null), true, false, true);
        A00();
    }

    private void A00() {
        AbstractC6602br.A00(this.A04, this, this.A03.A01());
        ImageView imageView = new ImageView(this.A04);
        imageView.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.REDESIGN_CLOSE_ICON));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0A, A0A);
        imageView.setColorFilter(-1);
        layoutParams.addRule(11);
        layoutParams.setMargins(A09, A09, A09, A09);
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        imageView.setOnClickListener(this.A01);
        LinearLayout layout = new LinearLayout(this.A04);
        layout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        layout.setGravity(17);
        layout.setOrientation(1);
        ImageView closeImageView = this.A05;
        AbstractC6374YB.A0N(closeImageView, 0);
        this.A05.setRadius(A0B);
        new AsyncTaskC5591LM(this.A05, this.A04).A04().A07(this.A03.A01());
        this.A06.A04(this.A02.A0G(), this.A03.A03(), null, false, true);
        this.A06.setAlignment(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, A0F, 0, A0F);
        this.A06.getDescriptionTextView().setText(this.A07);
        layout.addView(this.A05, new LinearLayout.LayoutParams(A08, A08));
        layout.addView(this.A06, layoutParams2);
        if (this.A00 != null) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            this.A00.setPadding(A0D, A0E, A0D, A0E);
            this.A00.setLayoutParams(layoutParams3);
            AbstractC6374YB.A0V(this.A00, AbstractC6374YB.A06(-16738826, A0C));
            this.A00.setStateListAnimator(null);
            AbstractC6374YB.A0Z(this.A00);
            layout.addView(this.A00);
        }
        addView(layout);
    }
}
