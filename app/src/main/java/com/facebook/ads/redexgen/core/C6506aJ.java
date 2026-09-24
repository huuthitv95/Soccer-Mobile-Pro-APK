package com.facebook.ads.redexgen.core;

import android.animation.LayoutTransition;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6506aJ extends LinearLayout {
    public static String[] A0I = {"Jjhv1QqAIW86EmEZitDWSXUy5KAygWmD", "Knznf5NxnzMSGuCyCavmDPpLrbg6IGSX", "ILZruYKannRuDYsFiZYXNynBpyms", "eZKheB7115JCtr5xxUXw9oXkLPe4M5DC", "o2TLnhgUMatQJZ63WkSJRDhfBnbI", "vZrVQG4SvGUnBHUUGdfxrKmAlJmFc80m", "RT8BtEaKHOdmDtB2bzxk3zMCIxucDNYE", "yGiX4fEKWzcCLDIcRuEbwAcVWGPLZUB"};
    public ImageView A00;
    public ImageView A01;
    public InterfaceC6507aK A02;
    public Runnable A03;
    public boolean A04;
    public final int A05;
    public final Bitmap A06;
    public final Bitmap A07;
    public final Bitmap A08;
    public final Bitmap A09;
    public final Bitmap A0A;
    public final Bitmap A0B;
    public final AbstractC7077jd A0C;
    public final C6902gi A0D;
    public final C6200VI A0E;
    public final InterfaceC6406Yh A0F;
    public final EnumC6509aM A0G;
    public final EnumC6512aP A0H;

    public C6506aJ(C6902gi c6902gi, boolean z, AbstractC7077jd abstractC7077jd, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh, EnumC6509aM enumC6509aM, InterfaceC6507aK interfaceC6507aK, EnumC6512aP enumC6512aP) {
        this(c6902gi, z, abstractC7077jd, c6200vi, interfaceC6406Yh, enumC6509aM, enumC6512aP);
        this.A02 = interfaceC6507aK;
    }

    public C6506aJ(C6902gi c6902gi, boolean z, AbstractC7077jd abstractC7077jd, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh, EnumC6509aM enumC6509aM, EnumC6512aP enumC6512aP) {
        super(c6902gi);
        this.A07 = AbstractC6386YN.A01(EnumC6385YM.CREDIT_LINE_INFO_ICON);
        this.A06 = AbstractC6386YN.A01(EnumC6385YM.CREDIT_LINE_DETAIL_ICON);
        this.A04 = false;
        this.A08 = AbstractC6386YN.A01(EnumC6385YM.AD_CHOICE_ICON);
        this.A09 = AbstractC6386YN.A01(EnumC6385YM.AD_CHOICE_TEXT);
        this.A0A = AbstractC6386YN.A01(EnumC6385YM.AD_CREDIT_LINE_COLLAPSE_TEXT);
        this.A0B = AbstractC6386YN.A01(EnumC6385YM.CREDIT_LINE_TEXT);
        this.A05 = abstractC7077jd.A27();
        this.A0E = c6200vi;
        this.A0F = interfaceC6406Yh;
        this.A0G = enumC6509aM;
        this.A0D = c6902gi;
        this.A0C = abstractC7077jd;
        this.A0H = enumC6512aP;
        A05();
        A0K(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        AbstractC6374YB.A0M(this.A00, 1.0f, 0.0f, 100);
        A0E(3, 300, new InterfaceC6493a6() { // from class: com.facebook.ads.redexgen.X.MA
            @Override // com.facebook.ads.redexgen.core.InterfaceC6493a6
            public final void AK7(Object obj, long j) {
                this.A00.A0U(obj, j);
            }
        }, new C6502aF(this));
        postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.aA
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0R();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        A0E(2, 300, new InterfaceC6493a6() { // from class: com.facebook.ads.redexgen.X.MB
            @Override // com.facebook.ads.redexgen.core.InterfaceC6493a6
            public final void AK7(Object obj, long j) {
                this.A00.A0V(obj, j);
            }
        }, new C6500aD(this));
        AbstractC6374YB.A0M(this.A00, 0.0f, 1.0f, 0);
        AbstractC6374YB.A0O(this.A00, 0);
    }

    private void A04() {
        if (this.A04 && this.A03 != null) {
            A06();
            A02();
        }
    }

    private void A05() {
        switch (this.A0H) {
            case A03:
                AbstractC6508aL.A02(this.A0D, this.A0G);
                break;
            case A02:
                AbstractC6508aL.A01(this.A0D, this.A0G);
                break;
        }
    }

    private void A06() {
        if (this.A04 && this.A03 != null) {
            removeCallbacks(this.A03);
            this.A03 = null;
        }
        String[] strArr = A0I;
        if (strArr[4].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0I[6] = "PZwK6paCNaN1NNUi7D9zVsXgJs4CpRYo";
        this.A04 = false;
    }

    private void A07() {
        switch (this.A0H) {
            case A02:
                AbstractC6374YB.A0N(this, -859190839);
                return;
            default:
                if (A0I[7].length() == 20) {
                    throw new RuntimeException();
                }
                A0I[6] = "J4Bl2paDruPebaLnqzXafrD0wXfUXyp3";
                AbstractC6374YB.A0N(this, -870569165);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        switch (this.A0H) {
            case A02:
                ImageView imageView = this.A01;
                int i = AbstractC6332XV.A0S;
                if (A0I[7].length() != 20) {
                    String[] strArr = A0I;
                    strArr[4] = "IwvL04OrKqzmIeLShS8Q4SIdnVqi";
                    strArr[2] = "Ml3LYYHXQPQgDXepFoLqaPfqy73Y";
                    imageView.setPadding(i, AbstractC6332XV.A00, AbstractC6332XV.A0A, AbstractC6332XV.A00);
                    return;
                }
                throw new RuntimeException();
            case A04:
                this.A01.setPadding(AbstractC6332XV.A0S, AbstractC6332XV.A00, AbstractC6332XV.A0S, AbstractC6332XV.A00);
                this.A01.setVisibility(8);
                return;
            default:
                this.A01.setPadding(AbstractC6332XV.A0I, AbstractC6332XV.A00, AbstractC6332XV.A0A, AbstractC6332XV.A00);
                return;
        }
    }

    private void A09() {
        switch (this.A0H) {
            case A02:
                A0F(this.A00, this.A09, AbstractC6332XV.A00, AbstractC6332XV.A01, AbstractC6332XV.A0S, AbstractC6332XV.A01, AbstractC6332XV.A0U);
                break;
            case A04:
                A0F(this.A00, this.A0B, AbstractC6332XV.A02, AbstractC6332XV.A00, AbstractC6332XV.A02, AbstractC6332XV.A00, -2);
                break;
            default:
                A0F(this.A00, this.A06, AbstractC6332XV.A00, AbstractC6332XV.A0A, AbstractC6332XV.A0S, AbstractC6332XV.A0A, -2);
                break;
        }
    }

    private void A0A() {
        switch (this.A0H) {
            case A02:
                A0F(this.A01, this.A08, AbstractC6332XV.A0I, AbstractC6332XV.A00, AbstractC6332XV.A0I, AbstractC6332XV.A00, AbstractC6332XV.A0U);
                return;
            case A04:
                ImageView imageView = this.A01;
                Bitmap bitmap = this.A0A;
                int i = AbstractC6332XV.A0S;
                int i2 = AbstractC6332XV.A00;
                int i3 = AbstractC6332XV.A0S;
                int i4 = AbstractC6332XV.A00;
                String[] strArr = A0I;
                if (strArr[4].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[0] = "BqxrFQJIBIExT1rCMndHo1bmHb8U1dtr";
                strArr2[3] = "4mbJeCFNsEoBSiTcA819Z9qBG38wKlHe";
                A0F(imageView, bitmap, i, i2, i3, i4, -2);
                return;
            default:
                A0F(this.A01, this.A07, AbstractC6332XV.A0I, AbstractC6332XV.A00, AbstractC6332XV.A0I, AbstractC6332XV.A00, -2);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A03 = new Runnable() { // from class: com.facebook.ads.redexgen.X.a9
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A02();
            }
        };
        postDelayed(this.A03, this.A05);
    }

    private void A0C() {
        this.A04 = true;
        AbstractC6374YB.A0O(this.A00, 0);
        A0B();
    }

    private final void A0D() {
        AbstractC6374YB.A0O(this.A00, 8);
        AbstractC6374YB.A0O(this.A01, 0);
        if (this.A0H == EnumC6512aP.A04) {
            this.A01.setPadding(AbstractC6332XV.A0S, AbstractC6332XV.A00, AbstractC6332XV.A0S, AbstractC6332XV.A00);
        } else {
            this.A01.setPadding(AbstractC6332XV.A0I, AbstractC6332XV.A00, AbstractC6332XV.A0I, AbstractC6332XV.A00);
        }
    }

    private void A0E(int i, int i2, InterfaceC6493a6 interfaceC6493a6, LayoutTransition.TransitionListener transitionListener) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(i, new C6504aH(this, i2, interfaceC6493a6));
        layoutTransition.addTransitionListener(transitionListener);
        setLayoutTransition(layoutTransition);
    }

    private void A0F(ImageView imageView, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        AbstractC6374YB.A0K(imageView);
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i5);
        imageView.setPadding(i, i2, i3, i4);
        imageView.setLayoutParams(layoutParams);
    }

    private void A0K(boolean z) {
        setOrientation(0);
        setPadding(AbstractC6332XV.A00, AbstractC6332XV.A0I, AbstractC6332XV.A00, AbstractC6332XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        A07();
        setCornerRadius(AbstractC6332XV.A0C);
        this.A01 = new ImageView(getContext());
        A0A();
        addView(this.A01);
        if (this.A0H == EnumC6512aP.A04) {
            this.A01.setVisibility(8);
        }
        this.A00 = new ImageView(getContext());
        A09();
        addView(this.A00);
        A0L(z);
        setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.a8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0T(view);
            }
        });
    }

    private void A0L(boolean z) {
        if (z && (this.A0H == EnumC6512aP.A03 || this.A0H == EnumC6512aP.A04)) {
            A0C();
        } else {
            AbstractC6374YB.A0O(this.A00, 8);
            AbstractC6374YB.A0O(this.A01, 0);
        }
    }

    public final void A0O() {
        A06();
    }

    public final void A0P() {
        A06();
        A0D();
    }

    public final void A0Q() {
        this.A04 = true;
        post(new Runnable() { // from class: com.facebook.ads.redexgen.X.aB
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0S();
            }
        });
    }

    public final /* synthetic */ void A0R() {
        AbstractC6374YB.A0O(this.A00, 8);
    }

    public final /* synthetic */ void A0S() {
        postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.a7
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A03();
            }
        }, 300L);
    }

    public final /* synthetic */ void A0T(View view) {
        if (this.A04) {
            if (this.A0H == EnumC6512aP.A04) {
                return;
            }
            A04();
            if (this.A02 != null) {
                this.A02.ADW(view);
                return;
            } else {
                AbstractC6508aL.A07(this.A0E, this.A0D, this.A0F, this.A0C, this.A0G);
                return;
            }
        }
        A0Q();
    }

    public final /* synthetic */ void A0U(Object obj, long j) {
        ((View) obj).animate().translationX(getWidth()).setDuration(j).setInterpolator(new InterpolatorC6308X7(1.5f)).setListener(new C6503aG(this)).start();
    }

    public final /* synthetic */ void A0V(Object obj, long j) {
        View view = (View) obj;
        view.setTranslationX(getWidth());
        view.animate().translationX(0.0f).setDuration(j).setListener(new C6501aE(this)).setInterpolator(new InterpolatorC6309X8(1.5f)).start();
    }

    private void setCornerRadius(float f) {
        setOutlineProvider(new C6499aC(this, f));
        setClipToOutline(true);
    }
}
