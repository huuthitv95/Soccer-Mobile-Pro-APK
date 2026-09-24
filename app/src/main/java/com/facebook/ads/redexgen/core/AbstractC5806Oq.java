package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5806Oq extends RelativeLayout implements InterfaceC6507aK {
    public Handler A00;
    public C6510aN A01;
    public boolean A02;
    public C6421Yw A03;
    public C6492a5 A04;
    public C6506aJ A05;
    public final View.OnClickListener A06;
    public final AbstractC7077jd A07;
    public final C6902gi A08;
    public final C6200VI A09;
    public static String[] A0A = {"eRMzgHG", "A1D1mRRaU8os3umLxugsgnfT", "YU6ciw9hf2Bpu6e80GlNKt1", "R20K8nAvAy9bKMjQ", "gFet4GA2ogUQ417QxbSlVnm1t01blQtv", "7PQXGNMvVATtl2qomoZDAZcCFPoRgKLz", "RpQ71swlwo7OfFOP9TN2ZPjcOzOs9RuN", "6yF"};
    public static final int A0C = (int) (AbstractC6334XX.A02 * 4.0f);
    public static final int A0D = (int) (AbstractC6334XX.A02 * 40.0f);
    public static final int A0B = (int) (AbstractC6334XX.A02 * 24.0f);

    public abstract int getMediaViewId();

    public AbstractC5806Oq(C6902gi c6902gi, View.OnClickListener onClickListener, C6200VI c6200vi, AbstractC7077jd abstractC7077jd) {
        super(c6902gi);
        this.A02 = true;
        this.A08 = c6902gi;
        this.A06 = onClickListener;
        this.A09 = c6200vi;
        this.A07 = abstractC7077jd;
        A0B();
    }

    public static RelativeLayout.LayoutParams A0A(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (view != null) {
            layoutParams.addRule(1, view.getId());
            layoutParams.setMargins(AbstractC6332XV.A0I, AbstractC6332XV.A0U, AbstractC6332XV.A00, AbstractC6332XV.A00);
        } else {
            layoutParams.addRule(20);
            layoutParams.setMargins(AbstractC6332XV.A0U, AbstractC6332XV.A0U, AbstractC6332XV.A00, AbstractC6332XV.A00);
        }
        return layoutParams;
    }

    private void A0B() {
        if (this.A07 != null) {
            if (this.A07.A2Q()) {
                this.A00 = new Handler(Looper.getMainLooper());
                this.A05 = AbstractC6511aO.A00(this.A08, true, this.A07, this.A09, null, EnumC6509aM.A04, this, AbstractC6508aL.A00(this.A07));
            } else if (this.A07.A2W()) {
                this.A01 = AbstractC6511aO.A02(this.A08, EnumC6509aM.A04, this.A07);
                AbstractC6374YB.A0K(this.A01);
            }
            if (this.A07.A2U()) {
                this.A04 = new C6492a5(this.A08, EnumC6509aM.A04);
                AbstractC6374YB.A0K(this.A04);
                this.A04.setOnClickListener(this.A06);
            } else {
                this.A03 = new C6421Yw(this.A08);
                this.A03.setOnClickListener(this.A06);
            }
        }
    }

    public final RelativeLayout.LayoutParams A0C(boolean z, boolean z2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0D, A0B);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        if (this.A02) {
            layoutParams.addRule(z ? 12 : 10);
            layoutParams.addRule(z2 ? 11 : 9);
        } else {
            int mediaViewId = getMediaViewId();
            layoutParams.addRule(z ? 8 : 6, mediaViewId);
            layoutParams.addRule(z2 ? 7 : 5, mediaViewId);
        }
        return layoutParams;
    }

    public void A0D() {
        if (this.A00 != null) {
            this.A00.removeCallbacksAndMessages(null);
        }
    }

    public void A0E() {
        if (this.A01 != null) {
            this.A01.A04();
        }
    }

    public void A0F() {
        if (this.A03 != null) {
            AbstractC6374YB.A0J(this.A03);
            this.A03.setLayoutParams(A0C(false, true));
            addView(this.A03);
        }
        if (this.A05 != null) {
            AbstractC6374YB.A0J(this.A05);
            this.A05.setLayoutParams(getCreditLineLayoutParams());
            addView(this.A05);
        }
        if (this.A01 != null) {
            AbstractC6374YB.A0J(this.A01);
            C6510aN c6510aN = this.A01;
            String[] strArr = A0A;
            if (strArr[4].charAt(11) == strArr[5].charAt(11)) {
                throw new RuntimeException();
            }
            A0A[1] = "xKxjkz1d3wlL2PrvsvNwOjyj";
            c6510aN.setLayoutParams(getCreditLineLayoutParams());
            addView(this.A01);
        }
    }

    public boolean A0G() {
        return true;
    }

    public boolean A0H() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6507aK
    public final void ADW(View view) {
        this.A06.onClick(view);
    }

    public static RelativeLayout.LayoutParams getCreditLineLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(AbstractC6332XV.A00, AbstractC6332XV.A0U, AbstractC6332XV.A0U, AbstractC6332XV.A00);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean zA0H = A0H();
        boolean newShouldLayoutButtonsRelativeToParent = this.A02;
        if (zA0H != newShouldLayoutButtonsRelativeToParent) {
            this.A02 = zA0H;
            A0F();
        }
    }
}
