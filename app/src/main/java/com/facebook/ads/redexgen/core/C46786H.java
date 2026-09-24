package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.text.NumberFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6H */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C46786H extends AbstractC5543Ka {
    public static byte[] A0K;
    public static String[] A0L = {"zra6hnpaifP7bxfZB5bQOHnqie2tQjg", "wy9og3M9LeWlDzkU0RS7zgtaq3xQKlMR", "jyAiwm88v9hsYzrfl9gFIABQTfRULZfl", "Wwy1p0nUO1H5ggrsb6VvEsAvpBZyxSvp", "wjN7zQjrZyyYli8cgu97rk5B2y3BycTh", "DSxnyYt0igg0K0GbJ5jSMl2rvJzineXI", "irrLwQMNjn2DglpbBC8hfvG7oGwbzPRC", "9jAewdJckPVrzkqluL1z0QkIRDh51Ovv"};
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public View A00;
    public View A01;
    public ImageView A02;
    public C6902gi A03;
    public C6325XO A04;
    public AbstractC6400Yb A05;
    public AbstractC6614c3 A06;
    public C6630cJ A07;
    public C6757eM A08;
    public C6763eS A09;
    public C5085DA A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final InterfaceC6406Yh A0E;
    public final InterfaceC6592bh A0F;
    public final C6593bi A0G;
    public final C6618c7 A0H;
    public final C5183Ek A0I;
    public final C5110DZ A0J;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{-23, -117, 1, -6, Ascii.f22499SI, -2, Ascii.CAN, Ascii.f22492FF, Ascii.f22490CR, -6, Ascii.f22503VT, Ascii.f22490CR, 2, 7, 0, Ascii.CAN, -6, 7, 2, 6, -6, Ascii.f22490CR, 2, 8, 7, Ascii.f22492FF, Ascii.CAN, 9, 5, -6, Ascii.DC2, -2, -3, Ascii.SUB, Ascii.f22494GS, 33, 19, 45, 32, 19, 37, Ascii.f22499SI, 32, Ascii.DC2, 45, 33, 17, 32, 19, 19, Ascii.f22493FS, 45, 33, Ascii.SYN, Ascii.f22494GS, 37, Ascii.f22493FS, -7, -29, -11, 1, -25, -16, -26, 1, -27, -29, -12, -26, 1, -11, -22, -15, -7, -16, -17, -19, -33, -20, -35, -26, -29, -35, -27};
    }

    static {
        A0D();
        A0P = AbstractC6332XV.A0b;
        A0X = AbstractC6332XV.A0Z;
        A0M = (int) (AbstractC6334XX.A02 * 8.0f);
        A0N = (int) (AbstractC6334XX.A02 * 10.0f);
        A0S = (int) (AbstractC6334XX.A02 * 20.0f);
        A0T = (int) (AbstractC6334XX.A02 * 13.0f);
        A0Q = (int) (AbstractC6334XX.A02 * 48.0f);
        A0W = (int) (AbstractC6334XX.A02 * 14.0f);
        A0U = (int) (AbstractC6334XX.A02 * 12.0f);
        A0O = AbstractC6332XV.A0v;
        A0V = AbstractC5819P3.A02(-1, 77);
        A0R = (int) (AbstractC6334XX.A02 * 16.0f);
        A0Y = (int) (AbstractC6334XX.A02 * 12.0f);
    }

    public C46786H(C6618c7 c6618c7) {
        super(c6618c7, false);
        this.A0D = new Handler(Looper.getMainLooper());
        this.A0C = false;
        this.A0B = false;
        this.A03 = c6618c7.A06();
        this.A05 = c6618c7.A0B();
        this.A0H = c6618c7;
        this.A01 = new View(this.A03);
        AbstractC6374YB.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A0A();
        this.A0E = c6618c7.A0C();
        AbstractC6602br.A00(c6618c7.A06(), this, getAdInfo().A0H().A08());
        this.A0I = A02(c6618c7);
        AbstractC6374YB.A0K(this.A0I);
        getAdDetailsView().bringToFront();
        if (!A04()) {
            this.A0J = A03(c6618c7);
        } else {
            this.A0J = null;
        }
        if (getAdDataBundle().A1u()) {
            if (this.A0J != null) {
                this.A0J.setVisibility(8);
            }
            getAdDetailsView().setVisibility(8);
            A09();
        }
        A1S();
        this.A08 = new C6757eM(this.A03, c6618c7.A07(), getAdDataBundle());
        this.A0F = new C5539KW(this);
        this.A0G = A01(c6618c7);
        C6328XR c6328xrA02 = super.A08.A02(getAdDataBundle());
        this.A03.A0H().A00(c6328xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A08);
        if (c6328xrA02.A00) {
            this.A0I.getVideoImplView().setOnClickListener(new ViewOnClickListenerC6621cA(this));
        } else if (C6171Up.A1L(getAdContextWrapper())) {
            AbstractC6561bC.A00(this.A0I.getVideoImplView(), C6171Up.A1M(getAdContextWrapper()), new ViewOnClickListenerC6622cB(this));
        }
        if (c6618c7.A05().A1o()) {
            if (this.A0H.A05().A1r()) {
                this.A06 = new C5518KB(c6618c7);
            } else {
                this.A06 = new C5520KD(c6618c7);
            }
            View view = this.A06;
            ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            addView(view, layoutParams2);
            getAdDetailsView().setVisibility(8);
        }
    }

    private C6593bi A01(C6618c7 c6618c7) {
        if (this.A0J != null) {
            return new C6593bi(c6618c7, getAdDataBundle(), this.A0I, this.A0J, getAdDetailsView(), this.A0E, this.A0F);
        }
        return new C6593bi(c6618c7, getAdDataBundle(), this.A0I, this.A0E, this.A0F, getAdDetailsView());
    }

    private C5183Ek A02(C6618c7 c6618c7) {
        RelativeLayout.LayoutParams layoutParams;
        C5183Ek c5183Ek = (C5183Ek) c6618c7.A02();
        if (c5183Ek == null) {
            c5183Ek = new C5183Ek(this.A03);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A1u()) {
            c5183Ek.getVideoView().setPadding(c5183Ek.getVideoView().getPaddingLeft(), c5183Ek.getVideoView().getPaddingTop(), c5183Ek.getVideoView().getPaddingRight(), c5183Ek.getVideoView().getPaddingBottom() + A0Y);
        }
        layoutParams2.addRule(13);
        addView(c5183Ek, layoutParams2);
        int iA1Q = A1Q(c6618c7.A0B());
        this.A02 = (ImageView) c6618c7.A03();
        if (this.A02 != null) {
            if (!A04()) {
                ImageView imageView = this.A02;
                int i = AbstractC5543Ka.A0J;
                int toolbarHeight = AbstractC5543Ka.A0J;
                imageView.setPadding(i, toolbarHeight, AbstractC5543Ka.A0J, AbstractC5543Ka.A0J);
                layoutParams = new RelativeLayout.LayoutParams(AbstractC5543Ka.A0K, AbstractC5543Ka.A0K);
                layoutParams.setMargins(0, iA1Q, AbstractC5543Ka.A0I, 0);
                layoutParams.addRule(11);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(AbstractC6614c3.A0A, AbstractC6614c3.A0A);
                int i2 = AbstractC6332XV.A0b;
                int toolbarHeight2 = AbstractC6332XV.A0r;
                layoutParams.setMargins(i2, toolbarHeight2, AbstractC6332XV.A0b, AbstractC6332XV.A0Z);
                layoutParams.addRule(9);
            }
            layoutParams.addRule(10);
            c5183Ek.addView(this.A02, layoutParams);
        }
        return c5183Ek;
    }

    private C5110DZ A03(C6618c7 c6618c7) {
        C5110DZ c5110dzA0E = c6618c7.A0E();
        if (c5110dzA0E == null) {
            return null;
        }
        c5110dzA0E.A08(-1, AbstractC5543Ka.A0C, false);
        c5110dzA0E.setPadding(AbstractC5543Ka.A0N, AbstractC5543Ka.A0N, AbstractC5543Ka.A0N, AbstractC5543Ka.A0N);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC5543Ka.A0M);
        progressBarLayoutParams.addRule(12);
        addView(c5110dzA0E, progressBarLayoutParams);
        return c5110dzA0E;
    }

    private void A05() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A09 != null) {
            addView(this.A09.A0W(), layoutParams);
        }
    }

    private void A06() {
        this.A07 = new C6630cJ(this.A0H.A06(), getAdDataBundle(), this.A0H.A08(), this.A0D, this.A0H.A0C());
        addView(this.A07.A0C(getCtaButton()));
    }

    private void A07() {
        AbstractC6374YB.A0d(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0G, this.A0H.A0B());
        for (InterfaceC6790eu interfaceC6790eu : this.A0I.getPlugins()) {
            if (interfaceC6790eu instanceof C448234) {
                this.A0I.A0g(interfaceC6790eu);
                return;
            }
        }
    }

    private void A08() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0H();
            this.A0I.A0g(getAnimationPlugin());
        }
    }

    private void A09() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        A0E(relativeLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0P, 0);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        appMetadataLayoutParams.setMargins(A0P, A0X, A0P, A0X);
        appMetadataLayoutParams.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        ViewOnClickListenerC5560Kr ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (!getAdDataBundle().A1s()) {
            ctaButton.setPadding(A0N, A0N, A0N, A0N);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AbstractC6374YB.A0V(ctaButton, AbstractC6374YB.A06(-16738826, A0M));
            ctaButton.setPadding(A0S, A0T, A0S, A0T);
            ctaButton.setStateListAnimator(null);
            AbstractC6374YB.A0Z(ctaButton);
        }
        layoutParams.addRule(11);
        if (ctaButton.getParent() != null) {
            AbstractC6374YB.A0d(ctaButton);
        }
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, appMetadataLayoutParams);
        relativeLayout2.bringToFront();
    }

    private void A0A() {
        if (this.A05 != null && !getAdDataBundle().A1W()) {
            this.A0A = new C5085DA(this.A05, 400, -this.A05.getToolbarHeight(), 0);
        }
    }

    private void A0B() {
        new C6200VI(getAdDataBundle().A2E(), getAdEventManager()).A04(EnumC6199VH.A0z, null);
        if (!getAdInfo().A0V()) {
            return;
        }
        super.A09.set(true);
        AbstractC6374YB.A0W(this);
        AbstractC6374YB.A0d(this.A0J, this.A0G, this.A00);
        AbstractC6374YB.A0L(this.A05);
        Pair<EnumC6756eL, View> pairA03 = this.A08.A03(getCtaButton());
        this.A00 = (View) pairA03.second;
        A0F((EnumC6756eL) pairA03.first);
        if (getAdInfo().A0K().A00() >= 0) {
            this.A0B = true;
            if (this.A05 != null) {
                this.A05.setToolbarActionMode(getAdDataBundle().A2P() ? 8 : 2);
                this.A05.setProgressImmediate(0.0f);
            }
            this.A04 = new C6325XO((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C5538KV(this));
            this.A04.A07();
        }
    }

    private void A0C() {
        if (this.A0A != null) {
            this.A0A.A4A(true, false);
        }
        if (!A04() && !getAdDataBundle().A1u() && getAdDetailsAnimation() != null) {
            C5085DA adDetailsAnimation = getAdDetailsAnimation();
            String[] strArr = A0L;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            A0L[1] = "NNplzEPPEJhw482VYN3vhqCWu3reteuX";
            adDetailsAnimation.A4A(true, false);
        }
    }

    private void A0E(RelativeLayout relativeLayout) {
        int i;
        String formattingRatingCount;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0Q, A0Q);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C6595bk c6595bk = new C6595bk(this.A03);
        AbstractC6374YB.A0N(c6595bk, 0);
        AbstractC6374YB.A0K(c6595bk);
        new AsyncTaskC5591LM(c6595bk, this.A03).A05(A0Q, A0Q).A07(getAdDataBundle().A2C().A01());
        TextView textView = new TextView(this.A03);
        AbstractC6374YB.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A28().A01().A07(true));
        textView.setText(getAdDataBundle().A29().A0I().A0G());
        textView.setTextSize(!getAdDataBundle().A1s() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C6902gi c6902gi = this.A03;
        if (!getAdDataBundle().A1s()) {
            i = A0W;
        } else {
            i = A0U;
        }
        C6597bm c6597bm = new C6597bm(c6902gi, i, 5, A0V, -1);
        c6597bm.setGravity(16);
        LinearLayout.LayoutParams ratingCountParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(getAdDataBundle().A28().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A1s()) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0O;
        LinearLayout linearLayout = new LinearLayout(this.A03);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, A0R);
        ratingInfoContainerParams.topMargin = A0O / 2;
        ratingInfoContainerParams.addRule(3, textView.getId());
        linearLayout.addView(c6597bm, ratingCountParams);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams iconParams = new RelativeLayout.LayoutParams(-2, -2);
        iconParams.leftMargin = A0O;
        iconParams.addRule(1, c6595bk.getId());
        iconParams.addRule(15);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, ratingInfoContainerParams);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, iconParams);
        relativeLayout.addView(c6595bk, layoutParams);
        if (TextUtils.isEmpty(getAdDataBundle().A29().A0I().A0C())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c6597bm.setRating(Float.parseFloat(getAdDataBundle().A29().A0I().A0C()));
        if (getAdDataBundle().A29().A0I().A09() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A04(0, 1, 108));
        if (!getAdDataBundle().A1s()) {
            formattingRatingCount = NumberFormat.getNumberInstance().format(Integer.parseInt(getAdDataBundle().A29().A0I().A09()));
        } else {
            formattingRatingCount = AbstractC6343Xg.A01(Integer.parseInt(getAdDataBundle().A29().A0I().A09()));
        }
        sb.append(formattingRatingCount);
        String formattingRatingCount2 = A04(1, 1, 13);
        sb.append(formattingRatingCount2);
        String formattingRatingCount3 = sb.toString();
        textView2.setText(formattingRatingCount3);
    }

    private void A0F(EnumC6756eL enumC6756eL) {
        if (!getAdDataBundle().A29().A0K().A02().isEmpty()) {
            if (getAdDataBundle().A29().A0K().A03()) {
                this.A09 = new C6763eS(this.A03, getAdDataBundle(), this.A0E, getCtaButton(), this.A0D, this.A0H.A08());
                AbstractC6374YB.A0d(this.A05, getAdDetailsView(), this.A02);
                A05();
                return;
            }
        } else if (getAdDataBundle().A29().A0K().A03() || getAdDataBundle().A29().A0K().A04()) {
            A07();
            A06();
            return;
        }
        A0G(enumC6756eL);
    }

    private void A0G(EnumC6756eL enumC6756eL) {
        if (this.A00 == null) {
        }
        this.A0I.A0h(false);
        this.A0I.setVisibility(8);
        switch (enumC6756eL) {
            case A03:
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A1Q(this.A05), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case A02:
                AbstractC6374YB.A0d(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC5543Ka.A0L, AbstractC5543Ka.A0L, AbstractC5543Ka.A0L, AbstractC5543Ka.A0L);
                addView(this.A00, layoutParams2);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka, com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1C() {
        super.A1C();
        A08();
        getAdDetailsView().A0j();
        if (this.A09 != null) {
            this.A09.A0Y();
        }
        if (this.A07 != null) {
            this.A07.A0F();
        }
        this.A0D.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka, com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1H(C5719NR c5719nr, String str, double d, Bundle bundle) {
        super.A1H(c5719nr, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A04(2, 31, 100), false)) {
            A0C();
        }
        if (bundle.getBoolean(A04(57, 18, 77), false)) {
            A0B();
        }
        if (bundle.getBoolean(A04(33, 24, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), false)) {
            this.A0G.A07(this);
        }
        if (A04()) {
            boolean z = getAdDetailsView() instanceof AbstractC5589LK;
            if (A0L[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[3] = "TYF9Gze5okVE8nAMFw0kZuTKWJAG4GPN";
            strArr[6] = "e5C8lQxoH1vEX5uTYGqpe7vBIorNDTyW";
            if (z) {
                ((AbstractC5589LK) getAdDetailsView()).A0q();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1I(C45574K c45574k) {
        super.A1I(c45574k);
        if (A04()) {
            AbstractC7077jd adDataBundle = getAdDataBundle();
            if (A0L[4].charAt(31) == 'A') {
                throw new RuntimeException();
            }
            A0L[0] = "gTgOd0";
            if (!adDataBundle.A1W()) {
                removeView(getAdDetailsView());
            }
        }
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1J(C5138E1 c5138e1) {
        super.A1J(c5138e1);
        if (this.A06 != null && this.A06.getVisibility() == 0) {
            return;
        }
        if (A04()) {
            this.A03.A0F().AKh(AbstractC6322XL.A00((float) this.A0H.A05().A0k()), getResources().getConfiguration().orientation, true, false, AbstractC5686Mt.A0C(this.A0H.A04()));
        }
        A1a(getResources().getConfiguration().orientation);
        if (getAdDataBundle().A1e()) {
            this.A0I.setOnClickListener(getCtaButton());
        }
        if (A04()) {
            getAdDetailsView().setVisibility(0);
            if (getAdDetailsView() instanceof AbstractC5589LK) {
                ((AbstractC5589LK) getAdDetailsView()).A0u(getResources().getConfiguration().orientation);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1K(C45474A c45474a, int i) {
        super.A1K(c45474a, i);
        int videoLengthMs = c45474a.A00();
        int remainingVideoTimeInMillis = this.A0I.getDuration();
        int videoLengthMs2 = remainingVideoTimeInMillis - videoLengthMs;
        if (getAnimationPlugin() != null && videoLengthMs2 < 3000 && getAnimationPlugin().A0M()) {
            getAnimationPlugin().A0I();
        }
        if ((getAdDetailsView() instanceof AbstractC5589LK) && !this.A0H.A05().A1r()) {
            int currentPosMs = c45474a.A00();
            ((AbstractC5589LK) getAdDetailsView()).A0s(((remainingVideoTimeInMillis * i) + currentPosMs) / 1000);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1L(boolean z) {
        super.A1L(z);
        getAdDetailsView().A0m(z);
        if (this.A06 != null) {
            this.A06.A1L(z);
        }
        if (this.A09 != null) {
            this.A09.A0e(z);
        }
        C6630cJ c6630cJ = this.A07;
        if (A0L[2].charAt(18) == 'X') {
            throw new RuntimeException();
        }
        A0L[0] = "DykuMGFkjhCaLudJ";
        if (c6630cJ != null) {
            this.A07.A0H(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1M() {
        return getAdInfo().A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1P(boolean z) {
        if (z && !this.A0C && !super.A09.get()) {
            this.A0G.A07(this);
            return true;
        }
        if (!getAdInfo().A0V()) {
            return false;
        }
        boolean z2 = super.A09.get();
        if (A0L[4].charAt(31) == 'A') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[3] = "EPxoCM5ZHywZjaL2iUUSFMk3WFd5m6XL";
        strArr[6] = "lTBjgNJWw5Z4CB7iubQhWZLtOmC1X7yD";
        if (!z2) {
            this.A0I.A0d(EnumC6781el.A08);
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka
    public final AbstractC6564bF A1R(C6618c7 c6618c7, C5719NR c5719nr, String str) {
        double dA0k = c6618c7.A05().A0k();
        if (A04()) {
            return new C6603bs((float) dA0k, str, c6618c7.A06(), getColors(), c6618c7.A05(), c6618c7.A0C(), getCtaButton(), AbstractC5543Ka.A0G, false, c6618c7.A07(), c6618c7.A0F(), c6618c7.A0A(), c6618c7.A0E(), c6618c7.A08(), false).A03();
        }
        return new C5546Kd(c6618c7.A06(), getCtaButton(), AbstractC5543Ka.A0H, c5719nr.A0I().A00() == EnumC5724NW.A05, getColors(), c5719nr.A0J().A06(), str, c6618c7.A07(), c6618c7.A0C(), c6618c7.A0F(), c6618c7.A0A(), c6618c7.A05());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka
    public final void A1S() {
        super.A1S();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().AAv(this.A0I);
        }
    }

    public final void A1X() {
        getCtaButton().A0E(A04(75, 9, 37));
    }

    public final void A1Y() {
        if (getAdDetailsView() instanceof AbstractC5589LK) {
            ((AbstractC5589LK) getAdDetailsView()).setPlaceHolderTextForRewardsConversion(getAdDataBundle().A1A());
        }
    }

    public final void A1Z() {
        new C6200VI(this.A0H.A05().A2E(), getAdEventManager()).A04(EnumC6199VH.A0h, null);
        if (this.A0H.A0B() != null) {
            AbstractC6400Yb abstractC6400YbA0B = this.A0H.A0B();
            if (A0L[4].charAt(31) == 'A') {
                throw new RuntimeException();
            }
            A0L[2] = "qVUXWES3bTCAG5k5pbCpCu4g17099rEp";
            abstractC6400YbA0B.setVisibility(8);
            removeView(this.A0H.A0B());
        }
        removeView(this.A06);
        removeView(this.A0I);
        A08();
        removeView(getAdDetailsView());
        removeView(this.A0J);
        removeView(this.A00);
        if (this.A09 != null) {
            removeView(this.A09.A0X());
        }
        if (this.A0H.A05().A1r()) {
            A1U();
        } else {
            A1T();
        }
    }

    public final void A1a(int i) {
        if (!A04()) {
            return;
        }
        this.A03.A0F().AKj(i);
        this.A0I.A0Z(i);
        A1V(i, this.A0I, (RelativeLayout) this.A0I.getVideoView());
    }

    public final void A1b(C45584L c45584l) {
        if (this.A06 != null) {
            if (this.A06 instanceof C5518KB) {
                ((C5518KB) this.A06).A1Q(c45584l);
            }
            if (this.A06 instanceof C5520KD) {
                ((C5520KD) this.A06).A1Q(c45584l);
            }
            this.A06.A1C();
            AbstractC6614c3 abstractC6614c3 = this.A06;
            String[] strArr = A0L;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "wl3lZ2t8QgZzPvgxh0a22wDB24cvqHL6";
            strArr2[6] = "goKzKnMqtJl7yehw7GAGrdNRW8UKCTH6";
            removeView(abstractC6614c3);
            this.A06 = null;
        }
        getAdDetailsView().setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public int getCloseButtonStyle() {
        if (getAdDataBundle().A1v() && this.A05 != null) {
            return this.A05.getToolbarActionMode();
        }
        if (this.A0B) {
            if (getAdDataBundle().A2P()) {
                return 8;
            }
            return 2;
        }
        if (A1M() && !super.A09.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka, com.facebook.ads.redexgen.core.AbstractC6614c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A06 != null) {
            AbstractC6614c3 abstractC6614c3 = this.A06;
            if (A0L[0].length() == 5) {
                throw new RuntimeException();
            }
            A0L[4] = "EpyE2nRNkziEqwhglEeRfTluajKoT9IB";
            if (abstractC6614c3.getVisibility() == 0) {
                getAdDetailsView().setVisibility(8);
                return;
            }
        }
        if (getAdDataBundle().A29().A0K().A03() && this.A09 != null && super.A09.get()) {
            this.A09.A0a(configuration.orientation);
        } else {
            A1a(configuration.orientation);
        }
    }

    public void setVideoAdViewListener(InterfaceC6732dx interfaceC6732dx) {
        if (this.A06 instanceof C5518KB) {
            ((C5518KB) this.A06).setVideoAdViewListener(interfaceC6732dx);
        }
        if (this.A06 instanceof C5520KD) {
            ((C5520KD) this.A06).setVideoAdViewListener(interfaceC6732dx);
        }
    }
}
