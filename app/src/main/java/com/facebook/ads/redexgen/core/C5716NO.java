package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.base.Ascii;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5716NO extends RelativeLayout implements InterfaceC6407Yi {
    public static byte[] A0h;
    public static String[] A0i = {"HOR7o31Iej4cYWuhQXExnEuENMywT0cc", "lMe4cl58LNQGNUAHyasApQ9JUE0svDiV", "D3sd2x1kxAGmbwUwbgSwAdGIbJmc5gOO", "0qcoppWNPh", "IKOWodR4Z8ze5gnDmb", "KTSiIx6w", "wnW3I4EzpNnUTo4gipPMifUFglZZiY67", "f8O"};
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final RelativeLayout.LayoutParams A0p;
    public View A00;
    public LinearLayout A01;
    public RelativeLayout A02;
    public RelativeLayout A03;
    public RelativeLayout A04;
    public Toast A05;
    public C5976Re A06;
    public C6325XO A07;
    public C6506aJ A08;
    public C6510aN A09;
    public ViewOnClickListenerC5560Kr A0A;
    public C6753eI A0B;
    public C6770ea A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Handler A0N;
    public final AbstractC7077jd A0O;
    public final C5742No A0P;
    public final InterfaceC5982Rk A0Q;
    public final C6902gi A0R;
    public final InterfaceC6192VA A0S;
    public final C6200VI A0T;
    public final C6325XO A0U;
    public final ViewOnSystemUiVisibilityChangeListenerC6360Xx A0V;
    public final InterfaceC6406Yh A0W;
    public final InterfaceC6455ZU A0X;
    public final InterfaceC6592bh A0Y;
    public final C6593bi A0Z;
    public final C6757eM A0a;
    public final AtomicBoolean A0b;
    public final AtomicBoolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final AbstractC6400Yb A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C5716NO(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, AbstractC7077jd abstractC7077jd, String str, InterfaceC6455ZU interfaceC6455ZU, boolean z) {
        super(c6902gi);
        String strA0D = A0D(0, 0, 113);
        this.A0E = strA0D;
        this.A0D = strA0D;
        this.A0Q = new C5785OV(this);
        this.A0c = new AtomicBoolean(false);
        this.A0b = new AtomicBoolean(false);
        this.A0K = false;
        this.A0M = true;
        this.A0H = false;
        this.A0G = false;
        this.A0N = new Handler(Looper.getMainLooper());
        this.A0F = false;
        this.A0f = z;
        this.A0R = c6902gi;
        this.A0W = interfaceC6406Yh;
        this.A0S = interfaceC6192VA;
        this.A0O = abstractC7077jd;
        this.A0P = abstractC7077jd.A29().A0H().A07();
        this.A0T = new C6200VI(this.A0O.A2E(), this.A0S);
        this.A0X = interfaceC6455ZU;
        this.A0C = new C6770ea(c6902gi, this.A0X, str, this.A0W);
        if (abstractC7077jd.A29().A0H().A07() != null) {
            this.A0I = abstractC7077jd.A29().A0H().A07().A0X();
            this.A0E = abstractC7077jd.A29().A0H().A07().A0O();
            this.A0D = abstractC7077jd.A29().A0H().A07().A0N();
        }
        this.A0J = this.A0O.A29().A0S() && this.A0O.A29().A0H().A03() > 0;
        this.A0e = this.A0O.A29().A0H().A0B();
        if (this.A0P == null) {
            this.A0W.A4j(this.A0X.A81());
            this.A0W.A4j(this.A0X.A7w());
        }
        int iA03 = this.A0P != null ? !this.A0P.A0c() ? (this.A0J && this.A0e) ? this.A0O.A29().A0H().A03() : this.A0P.A0C() : this.A0P.A0E() : 0;
        this.A0c.set(!this.A0P.A0W());
        C5785OV c5785ov = null;
        this.A0U = new C6325XO(iA03, new C5749Nv(this, c5785ov));
        this.A0d = C6171Up.A0o(this.A0R);
        this.A0g = A07();
        if (this.A0P.A0c()) {
            this.A0g.A09();
        }
        this.A0a = new C6757eM(this.A0R, this.A0S, this.A0O);
        AbstractC6602br.A00(c6902gi, this, abstractC7077jd.A29().A0H().A08());
        this.A0V = new ViewOnSystemUiVisibilityChangeListenerC6360Xx(this);
        this.A0V.A05(EnumC6359Xw.A02);
        if (C6171Up.A2K(this.A0R)) {
            this.A0g.setProgressSpinnerInvisible(true);
        }
        C5717NP c5717np = new C5717NP(this, c5785ov);
        HashMap map = new HashMap();
        map.put(A0D(56, 9, 90), this.A0X.A8l());
        this.A0B = new C6753eI(this.A0R, this.A0O, this.A0P, this.A0S, c5717np, map);
        A0K();
        this.A0W.A45(this, new RelativeLayout.LayoutParams(-1, -1));
        A0H();
        this.A0Y = new C5753Nz(this);
        this.A0Z = new C6593bi(this.A0R, this.A0g, this.A0O, (C5183Ek) null, this.A0W, this.A0Y, this.A0A, this.A02, this.A0B);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        if (this.A0P.A0c()) {
            this.A0R.A0F().AEU();
        }
    }

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0h = new byte[]{124, 85, 123, 83, 69, 67, 83, 125, 49, 62, 59, 49, 57, Ascii.f22490CR, Base64.padSymbol, 32, 59, 53, 59, 60, Ascii.f22499SI, 0, 5, Ascii.f22499SI, 7, 51, Ascii.f22502US, 3, Ascii.f22491EM, Ascii.f22498RS, Ascii.f22499SI, 9, 62, 57, 35, 50, 37, 36, 35, 62, 35, 62, 54, 59, 87, 88, 77, 80, 79, 92, 102, 90, 85, 80, 90, 82, 65, 93, 80, 82, 84, 92, 84, 95, 69, 104, 127, 109, 123, 104, 126, 127, 126, 69, 108, 115, 126, 127, 117, Ascii.f22498RS, Ascii.f22492FF, Ascii.f22503VT, Ascii.f22502US, 0, Ascii.f22492FF, Ascii.f22498RS, 54, 10, 5, 0, 10, 2};
    }

    static {
        A0P();
        A0p = new RelativeLayout.LayoutParams(-1, -1);
        A0k = AbstractC6332XV.A0N;
        A0l = AbstractC6332XV.A09;
        A0o = AbstractC6332XV.A07;
        A0m = AbstractC6332XV.A05;
        A0n = AbstractC5819P3.A02(-1, 77);
        A0j = AbstractC6332XV.A0U;
    }

    public C5716NO(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, AbstractC7077jd abstractC7077jd, String str, InterfaceC6455ZU interfaceC6455ZU) {
        this(c6902gi, interfaceC6192VA, interfaceC6406Yh, abstractC7077jd, str, interfaceC6455ZU, false);
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0R, this.A0W, this.A0T, 0, this.A0O.A22(), this.A0I);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A0D(this.A0O.A28().A01(), ViewOnClickListenerC5560Kr.A05(this.A0O));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0O.A2C(), this.A0O.A2E(), this.A0P.A0C(), this.A0O.A2D());
        fullScreenAdToolbar.setToolbarListener(new C5750Nw(this));
        return fullScreenAdToolbar;
    }

    private ViewOnClickListenerC5560Kr A09() {
        if (this.A0B == null || this.A0B.getViewabilityChecker() == null || this.A0B.getTouchDataRecorder() == null) {
            return null;
        }
        ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr = new ViewOnClickListenerC5560Kr(this.A0R, this.A0X.A7M(), this.A0O.A28().A01(), this.A0S, this.A0W, this.A0B.getViewabilityChecker(), this.A0B.getTouchDataRecorder(), this.A0O.A2A());
        AbstractC6374YB.A0K(viewOnClickListenerC5560Kr);
        viewOnClickListenerC5560Kr.setText(this.A0O.A29().A0J().A04());
        viewOnClickListenerC5560Kr.setTextSize(14.0f);
        viewOnClickListenerC5560Kr.setPadding(AbstractC6332XV.A02, AbstractC6332XV.A02, AbstractC6332XV.A02, AbstractC6332XV.A02);
        viewOnClickListenerC5560Kr.setOnClickListener(new ViewOnClickListenerC6431Z6(this));
        return viewOnClickListenerC5560Kr;
    }

    private C6601bq A0B() {
        C6902gi c6902gi = this.A0R;
        C5728Na c5728NaA01 = this.A0O.A28().A01();
        int i = !this.A0J ? 16 : 17;
        boolean z = this.A0J;
        String[] strArr = A0i;
        if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[7] = "YLS";
        strArr2[4] = "sNsC3VBoYaF6TxGjee";
        C6601bq c6601bq = new C6601bq(c6902gi, c5728NaA01, true, i, !z ? 14 : 13, 0);
        c6601bq.A04(this.A0O.A29().A0I().A0G(), this.A0O.A29().A0I().A0F(), null, false, true);
        TextView descriptionTv = c6601bq.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = c6601bq.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return c6601bq;
    }

    private void A0G() {
        String strA01;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0k, A0k);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C6595bk c6595bk = new C6595bk(this.A0R);
        AbstractC6374YB.A0N(c6595bk, 0);
        AbstractC6374YB.A0K(c6595bk);
        new AsyncTaskC5591LM(c6595bk, this.A0R).A05(A0k, A0k).A07(this.A0O.A2C().A01());
        TextView textView = new TextView(this.A0R);
        AbstractC6374YB.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0O.A28().A01().A07(true));
        textView.setText(this.A0O.A29().A0I().A0G());
        textView.setTextSize(!this.A0I ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C6597bm c6597bm = new C6597bm(this.A0R, !this.A0I ? A0o : A0m, 5, A0n, -1);
        c6597bm.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0R);
        textView2.setTextColor(this.A0O.A28().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!this.A0I) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = AbstractC6332XV.A0U;
        LinearLayout linearLayout = new LinearLayout(this.A0R);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0l);
        layoutParams4.topMargin = AbstractC6332XV.A0U / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(c6597bm, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        ratingInfoContainerParams.leftMargin = AbstractC6332XV.A0U;
        ratingInfoContainerParams.addRule(1, c6595bk.getId());
        ratingInfoContainerParams.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        if (this.A04 != null) {
            this.A04.removeAllViews();
            this.A04.addView(relativeLayout, ratingInfoContainerParams);
            this.A04.addView(c6595bk, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0O.A29().A0I().A0C())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c6597bm.setRating(Float.parseFloat(this.A0O.A29().A0I().A0C()));
        if (this.A0O.A29().A0I().A09() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A0D(0, 1, 63));
        if (!this.A0I) {
            strA01 = NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0O.A29().A0I().A09()));
        } else {
            strA01 = AbstractC6343Xg.A01(Integer.parseInt(this.A0O.A29().A0I().A09()));
        }
        sb.append(strA01);
        sb.append(A0D(1, 1, 23));
        textView2.setText(sb.toString());
    }

    private void A0H() {
        if (this.A0P.A0W()) {
            A0J();
        } else {
            A0O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0L = true;
        if (this.A0O.A29().A0S()) {
            this.A0C.A06();
            this.A0W.A4k(this.A0X.A6l(), new C45574K(0, 0));
        }
    }

    private void A0J() {
        C6725dq c6725dqA0F = new C6723do(this.A0R, this.A0O.A29().A0I(), this.A0O.A2C()).A0A(this.A0O.A28().A01()).A0D(this.A0P.A0Q()).A0C(this.A0P.A0K()).A09(2000).A0E(this.A0I).A0B(this.A0E).A0F();
        AbstractC6202VK.A04(c6725dqA0F, this.A0T, EnumC6199VH.A0U);
        addView(c6725dqA0F, A0p);
        c6725dqA0F.A04(new C5752Ny(this));
    }

    private void A0K() {
        RelativeLayout.LayoutParams layoutParams;
        this.A0A = A09();
        this.A02 = new RelativeLayout(getContext());
        AbstractC6374YB.A0K(this.A02);
        this.A04 = new RelativeLayout(getContext());
        AbstractC6374YB.A0K(this.A04);
        if (this.A0d) {
            A0G();
        } else {
            RelativeLayout relativeLayout = this.A04;
            C6601bq c6601bqA0B = A0B();
            RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(c6601bqA0B, iconAndMetaDataContainerParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, AbstractC6332XV.A09, 0);
        this.A02.addView(this.A04, layoutParams2);
        if (this.A0A != null) {
            ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr = this.A0A;
            String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            A0i[3] = InneractiveMediationDefs.GENDER_FEMALE;
            layoutParams2.addRule(0, viewOnClickListenerC5560Kr.getId());
            if (!this.A0I) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(6, this.A04.getId());
                layoutParams.addRule(8, this.A04.getId());
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                AbstractC6374YB.A0V(this.A0A, AbstractC6374YB.A06(-16738826, A0j));
                this.A0A.setStateListAnimator(null);
                this.A0A.setPadding(AbstractC6332XV.A0B, AbstractC6332XV.A06, AbstractC6332XV.A0B, AbstractC6332XV.A06);
                AbstractC6374YB.A0Z(this.A0A);
            }
            layoutParams.addRule(11);
            this.A02.addView(this.A0A, layoutParams);
        }
        AbstractC6374YB.A0K(this.A0g);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(10);
        this.A01 = new LinearLayout(getContext());
        AbstractC6374YB.A0K(this.A01);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-2, -2);
        adWebViewParams.setMargins(AbstractC6332XV.A09, AbstractC6332XV.A05, AbstractC6332XV.A09, AbstractC6332XV.A05);
        adWebViewParams.addRule(12);
        this.A01.setOrientation(1);
        RelativeLayout.LayoutParams toolbarParams = new RelativeLayout.LayoutParams(-1, -1);
        toolbarParams.setMargins(AbstractC6332XV.A09, 0, AbstractC6332XV.A09, 0);
        toolbarParams.addRule(3, this.A0g.getId());
        toolbarParams.addRule(2, this.A01.getId());
        this.A01.addView(this.A02, new RelativeLayout.LayoutParams(-2, -2));
        this.A03 = new RelativeLayout(getContext());
        AbstractC6374YB.A0K(this.A03);
        this.A01.addView(this.A03);
        if (this.A0O.A2M()) {
            this.A0g.A08();
            A0M();
        }
        if (this.A0O.A2W()) {
            A0L();
        }
        this.A0g.setVisibility(4);
        this.A0B.setVisibility(4);
        this.A02.setVisibility(4);
        addView(this.A0g, layoutParams3);
        addView(this.A0B, toolbarParams);
        addView(this.A01, adWebViewParams);
        if (this.A0P.A0Y()) {
            this.A0B.A0C();
        }
    }

    private void A0L() {
        this.A09 = AbstractC6511aO.A02(this.A0R, EnumC6509aM.A03, this.A0O);
        AbstractC6374YB.A0K(this.A09);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.topMargin = AbstractC6332XV.A09;
        this.A03.addView(this.A09, layoutParams);
    }

    private void A0M() {
        this.A08 = AbstractC6511aO.A01(this.A0R, true, this.A0O, this.A0T, this.A0W, EnumC6509aM.A03, AbstractC6508aL.A00(this.A0O));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.topMargin = AbstractC6332XV.A09;
        this.A03.addView(this.A08, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0O.A2M() && this.A08 != null) {
            this.A08.A0P();
            if (this.A0O.A2U()) {
                AbstractC6508aL.A04(this.A0R, EnumC6509aM.A02);
            } else {
                AbstractC6508aL.A05(this.A0R, EnumC6509aM.A02);
            }
        }
        if (this.A0O.A2W() && this.A09 != null) {
            AbstractC6508aL.A06(this.A0R, EnumC6509aM.A02);
        }
        new C6200VI(this.A0O.A2E(), this.A0S).A04(EnumC6199VH.A0z, null);
        this.A0b.set(true);
        AbstractC6374YB.A0W(this);
        AbstractC6374YB.A0H(this.A0B);
        AbstractC6374YB.A0d(this.A0Z, this.A00, this.A0B);
        if (this.A0I) {
            boolean z = this.A0d;
            String[] strArr = A0i;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[6] = "qNCG6dDJsAPFbWTySRxInyS8ppXyMF33";
            strArr2[1] = "jWdNFAVobp8QAHjjZXwWCxlFqJ2u0nxR";
            if (z) {
                AbstractC6374YB.A0H(this.A0g);
            }
        } else {
            AbstractC6374YB.A0L(this.A0g);
        }
        AbstractC6374YB.A0L(this.A0A);
        Pair<EnumC6756eL, View> pairA03 = this.A0a.A03(this.A0A);
        this.A00 = (View) pairA03.second;
        switch (C6432Z7.A00[((EnumC6756eL) pairA03.first).ordinal()]) {
            case 1:
                RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
                screenshotParams.setMargins(0, this.A0g.getToolbarHeight(), 0, 0);
                if (!this.A0I) {
                    AbstractC6374YB.A0L(this.A02);
                    screenshotParams.addRule(2, this.A01.getId());
                    addView(this.A00, screenshotParams);
                } else {
                    View c6718dj = new C6718dj(this.A0R, this.A0O.A2C(), this.A0O.A29().A0I(), A09(), this.A0D, new ViewOnClickListenerC6430Z5(this));
                    RelativeLayout.LayoutParams screenshotParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    if (this.A0O.A2M()) {
                        screenshotParams2.addRule(2, this.A01.getId());
                        if (this.A02 != null) {
                            AbstractC6374YB.A0O(this.A02, 8);
                        }
                    }
                    addView(c6718dj, screenshotParams2);
                    View view = this.A0g;
                    String[] strArr3 = A0i;
                    if (strArr3[7].length() == strArr3[4].length()) {
                        A0i[5] = "GuR3tgtU";
                        removeView(view);
                    } else {
                        String[] strArr4 = A0i;
                        strArr4[0] = "xaRPgQ1Vn5AR5k4AW07eBuZz1tirIodN";
                        strArr4[2] = "10QTFu18AzpwL0fCi5Lt2x9tRdyuYXAR";
                        removeView(view);
                    }
                }
                break;
            case 2:
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (this.A0O.A2M()) {
                    layoutParams.addRule(2, this.A01.getId());
                    if (this.A02 != null) {
                        AbstractC6374YB.A0O(this.A02, 8);
                    }
                } else {
                    AbstractC6374YB.A0d(this.A01);
                }
                addView(this.A00, layoutParams);
                break;
        }
        if (this.A0P.A0c()) {
            this.A0R.A0F().AEP();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        AbstractC6374YB.A0W(this);
        if (!this.A0P.A0Y()) {
            this.A0B.A0C();
        }
        this.A0g.setVisibility(0);
        this.A0B.setVisibility(0);
        if (this.A02 != null) {
            RelativeLayout relativeLayout = this.A02;
            String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            A0i[3] = "XO2ZpTY6Mgvz2u";
            relativeLayout.setVisibility(0);
        }
        if (this.A0A != null && this.A0O.A25() > 0 && this.A07 == null) {
            this.A07 = new C6325XO(this.A0O.A25(), new C5751Nx(this));
            this.A07.A07();
        }
        this.A0U.A07();
        if (this.A08 != null && this.A0O.A2Q()) {
            C6506aJ c6506aJ = this.A08;
            String[] strArr2 = A0i;
            if (strArr2[0].charAt(6) != strArr2[2].charAt(6)) {
                c6506aJ.A0Q();
            } else {
                A0i[5] = "teHq37vz";
                c6506aJ.A0Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i) {
        String strValueOf = String.valueOf(i);
        Toast toast = this.A05;
        String strA0J = this.A0P.A0J();
        String progress = A0D(2, 6, 75);
        AbstractC6374YB.A0b(toast, strA0J.replace(progress, strValueOf), 49, 0, AbstractC6332XV.A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W(boolean z, String str) {
        this.A0H = true;
        HashMap map = new HashMap();
        map.put(A0D(8, 12, 57), z ? A0D(79, 13, 2) : A0D(44, 12, 82));
        map.put(A0D(20, 12, 7), str);
        new C6580bV(this.A0R, this.A0X.A7M(), this.A0B.getViewabilityChecker(), this.A0B.getTouchDataRecorder(), this.A0S, this.A0O.A2A(), this.A0W).A05(this.A0O.A2E(), this.A0O.A29().A0J().A05(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0X() {
        return this.A0O.A10().equals(A0D(65, 14, 113)) || (this.A0O.A10().equals(A0D(32, 12, 60)) && this.A0O.A29().A0V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        return this.A0e && !this.A0K && !this.A0M && this.A0P.A0C() < this.A0O.A29().A0H().A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AAu(Intent intent, Bundle bundle, C5976Re c5976Re) {
        this.A06 = c5976Re;
        this.A06.A0A(this.A0Q);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFA(boolean z) {
        this.A0U.A06();
        this.A0G = true;
        if (!this.A0F && !z && this.A08 != null) {
            this.A08.A0P();
        }
        this.A0F = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFi(boolean z) {
        if ((!this.A0e || !this.A0M) && !this.A0K) {
            boolean z2 = this.A0c.get();
            String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[0] = "5YF9hd1VnayjDYXn8X9NIXHiJcVpNWhU";
            strArr2[2] = "6mHNY01g6eF3bUPoEn1oonlPgYyDS663";
            if (z2) {
                C6325XO c6325xo = this.A0U;
                String[] strArr3 = A0i;
                if (strArr3[6].charAt(22) != strArr3[1].charAt(22)) {
                    String[] strArr4 = A0i;
                    strArr4[7] = "SY9";
                    strArr4[4] = "T1jNCZgiG5fRSAcWDF";
                    if (c6325xo.A05()) {
                        return;
                    }
                } else {
                    String[] strArr5 = A0i;
                    strArr5[7] = "0UX";
                    strArr5[4] = "cSjXeSxWsZqlnq3791";
                    if (c6325xo.A05()) {
                        return;
                    }
                }
                this.A0U.A07();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public String getCurrentClientToken() {
        return this.A0O.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void onDestroy() {
        this.A0V.A03();
        if (this.A08 != null) {
            this.A08.A0O();
        }
        if (this.A06 != null) {
            this.A06.A0B(this.A0Q);
        }
        if (this.A0B != null) {
            if (!TextUtils.isEmpty(this.A0O.A2E())) {
                this.A0S.AB7(this.A0O.A2E(), new C6558b9().A03(this.A0B.getViewabilityChecker()).A02(this.A0B.getTouchDataRecorder()).A05());
            }
            C6753eI c6753eI = this.A0B;
            String[] strArr = A0i;
            if (strArr[0].charAt(6) != strArr[2].charAt(6)) {
                throw new RuntimeException();
            }
            A0i[3] = "Lk0Kz0u4YEu";
            c6753eI.A0D();
        }
        this.A0U.A06();
        this.A0g.setToolbarListener(null);
        this.A0N.removeCallbacksAndMessages(null);
        this.A05 = null;
        this.A06 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AFi(false);
        } else {
            this.A0F = true;
            AFA(false);
        }
    }

    public void setListener(InterfaceC6406Yh interfaceC6406Yh) {
    }

    public void setServerSideRewardHandler(C6770ea c6770ea) {
        this.A0C = c6770ea;
    }
}
