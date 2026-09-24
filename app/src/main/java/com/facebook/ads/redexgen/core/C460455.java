package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.55 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C460455 extends AbstractC5428Ij {
    public static byte[] A0o;
    public static String[] A0p = {"PW", "VMuxnsAFAgr5cT24vzltLNiVzxTvarbU", "jq4GRSBqKMr4rGHs6WabqGWnms1UYtFJ", "ha", "80KuzsseMGT5f9rKVuNW3ow7LLk13v1X", "uG1OElCv3xaCg8aDr811TJkNgBcTan1c", "YwXHrw3Tlq3bJQZfooudgwuoCwRnfSi1", "LVHFB8bkqwAuG3vKzwVN0RmVN3FHwXeF"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public float A00;
    public int A01;
    public ImageView A02;
    public LinearLayout A03;
    public C5639M8 A04;
    public C6530ah A05;
    public C5634M3 A06;
    public C6578bT A07;
    public ViewOnClickListenerC5560Kr A08;
    public C6630cJ A09;
    public EnumC6789et A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final float A0N;
    public final int A0O;
    public final Handler A0P;
    public final Handler A0Q;
    public final Handler A0R;
    public final AbstractC5686Mt A0S;
    public final C5728Na A0T;
    public final C6902gi A0U;
    public final C6200VI A0V;
    public final AbstractC6400Yb A0W;
    public final AbstractC5589LK A0X;
    public final InterfaceC6579bU A0Y;
    public final InterfaceC6721dm A0Z;
    public final C5193Eu A0a;
    public final C5183Ek A0b;
    public final C45584L A0c;
    public final AbstractC5147EA A0d;
    public final AbstractC5145E8 A0e;
    public final AbstractC5141E4 A0f;
    public final AbstractC5139E2 A0g;
    public final AbstractC5137E0 A0h;
    public final AbstractC5136Dz A0i;
    public final C5114Dd A0j;
    public final C5110DZ A0k;
    public final Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0o, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0W() {
        A0o = new byte[]{33, 46, 43, 33, 41, Ascii.f22494GS, 49, 45, 55, 48, 33, 39, 58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, Base64.padSymbol, 42, 119, 48, 55, 45, 60, 43, 42, 45, 48, 45, 48, 56, 53, 119, 58, 53, 48, 58, 50, 60, Base64.padSymbol, 33, 54, 36, 50, 33, 55, 54, 55, Ascii.f22492FF, 37, 58, 55, 54, 60, Base64.padSymbol, 59, 45, 58, 43, 36, 33, 43, 35, Ascii.ETB, 46, 33, 36, 60, 45, 58, 45, 44, 9};
    }

    static {
        A0W();
        A0q = (int) (AbstractC6334XX.A02 * 4.0f);
        A0r = (int) (AbstractC6334XX.A02 * 32.0f);
        A0s = AbstractC5819P3.A02(-1, 77);
        A0t = (int) (AbstractC6334XX.A02 * 26.0f);
        A0u = (int) (AbstractC6334XX.A02 * 12.0f);
    }

    public C460455(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, AbstractC6400Yb abstractC6400Yb, AbstractC7077jd abstractC7077jd, C6056Sx c6056Sx, InterfaceC6455ZU interfaceC6455ZU, int i, InterfaceC6406Yh interfaceC6406Yh, C6200VI c6200vi, int i2, boolean z, boolean z2, InterfaceC6721dm interfaceC6721dm, int i3, int i4) {
        C5728Na c5728NaA00;
        super(c6902gi, interfaceC6455ZU, interfaceC6192VA, abstractC7077jd, i, z, z2, interfaceC6406Yh, i4);
        this.A0H = false;
        this.A0G = false;
        this.A0F = false;
        this.A01 = 0;
        this.A0J = true;
        this.A0M = false;
        this.A0I = false;
        this.A0Q = new Handler(Looper.getMainLooper());
        this.A0l = new RunnableC6714df(this);
        this.A0E = false;
        this.A00 = 0.0f;
        this.A0B = true;
        this.A0C = false;
        this.A0K = false;
        this.A0R = new Handler(Looper.getMainLooper());
        this.A0h = new AbstractC5137E0() { // from class: com.facebook.ads.redexgen.X.5D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5138E1 c5138e1) {
                if (!this.A00.A0M) {
                    this.A00.A0M = true;
                    this.A00.A0U.A0F().AKh(AbstractC6322XL.A00((float) ((AbstractC5428Ij) this.A00).A06.A0k()), this.A00.getResources().getConfiguration().orientation, true, true, AbstractC5686Mt.A0A());
                    this.A00.A0X(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0X.setVisibility(0);
                    this.A00.A0X.A0u(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0X.bringToFront();
                    this.A00.A0V();
                }
            }
        };
        this.A0g = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.5B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                if (!((AbstractC5428Ij) this.A00).A0A.A07()) {
                    this.A00.A1F();
                }
            }
        };
        this.A0f = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.59
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            public final /* bridge */ /* synthetic */ void A03(C6141UL c6141ul) {
            }
        };
        this.A0i = new AbstractC5136Dz() { // from class: com.facebook.ads.redexgen.X.58
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45474A c45474a) {
                this.A00.A0o(c45474a);
                this.A00.A0Z.ADw((this.A00.A00 * this.A00.A0b.getDuration()) + c45474a.A00());
            }
        };
        this.A0d = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.57
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                this.A00.A0Z.ADc(this.A00.A0b.getDuration());
                C460455.A01(this.A00, 1.0f);
                this.A00.A0b.A0e(EnumC6789et.A02, 28);
            }
        };
        this.A0e = new C460556(this);
        this.A0Y = new C5354HW(this);
        this.A0W = abstractC6400Yb;
        this.A0O = i3;
        this.A0P = new Handler(Looper.getMainLooper());
        this.A0S = C5687Mu.A01(c6902gi, interfaceC6192VA, abstractC7077jd.A2E(), AbstractC6312XB.A00(abstractC7077jd.A29().A0J().A05()), new HashMap(), false, true, abstractC7077jd.A2A());
        this.A0U = c6902gi;
        this.A0V = c6200vi;
        this.A0j = new C5114Dd(this.A0U, this.A0V);
        this.A0k = new C5110DZ(this.A0U, i3);
        this.A0Z = interfaceC6721dm;
        if (i2 == 1) {
            c5728NaA00 = super.A06.A28().A01();
        } else {
            c5728NaA00 = super.A06.A28().A00();
        }
        this.A0T = c5728NaA00;
        AbstractC6602br.A00(this.A0U, this, abstractC7077jd.A29().A0H().A08());
        this.A0b = new C5183Ek(this.A0U);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new C45584L(c6902gi, interfaceC6192VA, this.A0b, abstractC7077jd.A2E());
        A0U();
        String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c6056Sx.A0T(videoUrl));
        this.A0N = (float) abstractC7077jd.A0k();
        A0Q();
        A0M();
        A0L();
        this.A0X = A0D();
        addView(this.A0X);
        AbstractC6374YB.A0K(this.A0X);
        A0T();
        A0R();
        A0S();
        this.A0X.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        if (C6171Up.A1z(this.A0U)) {
            InterfaceC6204VM interfaceC6204VMA0B = this.A0U.A0B();
            C5183Ek c5183Ek = this.A0b;
            String videoUrl2 = super.A06.A2E();
            interfaceC6204VMA0B.AKn(c5183Ek, videoUrl2, true);
        }
        if (C6171Up.A20(this.A0U)) {
            this.A0a = new C5193Eu(this.A0U, interfaceC6192VA, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0d(abstractC7077jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        A0P();
        c6902gi.A0F().ACI(this.A0m, this.A0n, true);
        this.A0j.bringToFront();
    }

    public static /* synthetic */ float A01(C460455 c460455, float f) {
        float f2 = c460455.A00 + f;
        c460455.A00 = f2;
        return f2;
    }

    public static /* synthetic */ int A03(C460455 c460455) {
        int i = c460455.A01;
        c460455.A01 = i + 1;
        return i;
    }

    private AbstractC5589LK A0D() {
        String strA0J;
        if (super.A06.A10().equals(A0J(49, 14, 78))) {
            strA0J = EnumC6795ez.A04.A03();
        } else {
            strA0J = A0J(12, 37, 68);
        }
        AbstractC5589LK abstractC5589LKA03 = new C6603bs(this.A0N, strA0J, this.A0U, getColors(), super.A06, super.A0B, this.A08, AbstractC5428Ij.A0G, false, super.A08, super.A0D, super.A0A, this.A0k, this.A0V, true).A03();
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -1);
        adDetailsParams.addRule(12);
        abstractC5589LKA03.setVisibility(8);
        abstractC5589LKA03.setChainedAdInfo(super.A00);
        abstractC5589LKA03.setLayoutParams(adDetailsParams);
        return abstractC5589LKA03;
    }

    private void A0K() {
        this.A09 = new C6630cJ(this.A0U, super.A06, this.A0V, this.A0Q, super.A0B);
        this.A09.A0I(false);
        addView(this.A09.A0C(getRegularCtaForEndCard()));
    }

    private void A0L() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0u, A0u, A0u, A0u);
    }

    private void A0M() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0r, A0r);
        layoutParams.setMargins(AbstractC6332XV.A0b, AbstractC6332XV.A0r, AbstractC6332XV.A0b, AbstractC6332XV.A0Z);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            A0q(A0J(63, 18, 85));
        }
    }

    private void A0O() {
        if (super.A06.A1e() && this.A0E) {
            this.A0E = false;
            Map<String, String> mapA05 = new C6558b9().A03(null).A02(null).A05();
            mapA05.put(A0J(0, 12, 95), A0J(63, 18, 85));
            super.A08.AB6(super.A06.A2E(), mapA05);
        }
    }

    private void A0P() {
        if (!super.A06.A29().A0K().A04()) {
            return;
        }
        this.A02 = new ImageView(this.A0U);
        addView(this.A02);
        this.A02.setVisibility(4);
        new AsyncTaskC5591LM(this.A02, this.A0U).A04().A06(new C5360Hc(this)).A07(super.A06.A29().A0H().A08());
    }

    private void A0Q() {
        postDelayed(new C5371Hn(this), C6171Up.A0P(this.A0U));
    }

    private void A0R() {
        AbstractC6374YB.A0J(this.A03);
        this.A03 = new LinearLayout(this.A0U);
        this.A03.setOrientation(1);
        AbstractC6374YB.A0K(this.A03);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0S() {
        if (super.A06.A1X() && this.A0S != null && AbstractC6322XL.A03(this.A0N)) {
            this.A07 = new C6578bT(this.A0U, super.A0B, super.A06.A0l(), this.A0S, this.A0X.getCTAButton(), this.A0X);
            addView(this.A07.getBrowserPeekView());
            this.A0R.postDelayed(new RunnableC6711dc(this), 5900L);
        }
    }

    private void A0T() {
        if (super.A06.A1e()) {
            this.A0b.setOnClickListener(new ViewOnClickListenerC6717di(this));
        }
        AbstractC6374YB.A0J(this.A0b);
        AbstractC6374YB.A0K(this.A0b);
        addView(this.A0b, new RelativeLayout.LayoutParams(-1, -2));
        this.A08 = new ViewOnClickListenerC5560Kr(this.A0U, super.A06, this.A0T, super.A08, super.A0B, super.A0D, super.A0A, (InterfaceC6344Xh) null);
        AbstractC6374YB.A0G(1001, this.A08);
        if (C6171Up.A17(this.A0U)) {
            View.OnClickListener onClickListener = new ViewOnClickListenerC6709da(this);
            this.A0X.setCTAClickListener(onClickListener);
            if (this.A0W != null) {
                View.OnClickListener onClickListener2 = new ViewOnClickListenerC6710db(this);
                this.A0W.setCTAClickListener(onClickListener2);
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C45043S c45043s = new C45043S(this.A0U, true);
            this.A0b.A0f(c45043s);
            c45043s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new C44893B(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        int duration = this.A0b.getDuration();
        int videoDuration = this.A0k.getCustomDuration();
        if (videoDuration > duration) {
            this.A0k.setCustomDuration(duration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(int i) {
        if (!this.A0M) {
            return;
        }
        C5183Ek c5183Ek = this.A0b;
        RelativeLayout adjacentView = (RelativeLayout) this.A0b.getVideoView();
        this.A0b.A0Z(i);
        A0Z(i, c5183Ek, adjacentView);
    }

    private void A0Y(int i) {
        if (this.A0j != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0j.getLayoutParams();
            layoutParams.setMargins(AbstractC6332XV.A09, i, AbstractC6332XV.A09, AbstractC6332XV.A05);
            this.A0j.setLayoutParams(layoutParams);
        }
    }

    private void A0Z(int i, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        AbstractC6374YB.A0J(this.A0X);
        if ((this.A0X instanceof C46926V) || (this.A0X instanceof C46916U)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0X.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0X);
            } else {
                View view = this.A0X;
                String[] strArr = A0p;
                if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                    throw new RuntimeException();
                }
                A0p[4] = "hNSRRdlixh2gw3rjMoVJbJnBOeMmg8Zc";
                addView(view, layoutParams);
            }
        } else if (this.A0X instanceof C46906T) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0X.setLayoutParams(layoutParams2);
            addView(this.A0X, layoutParams2);
        }
        this.A0X.A0l(i);
        this.A0X.A0y(viewGroup, relativeLayout, i);
    }

    private void A0a(ViewGroup viewGroup, View view, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0X(i);
    }

    private void A0b(ViewGroup viewGroup, View view, AbstractC6400Yb abstractC6400Yb, int i) {
        AbstractC6374YB.A0d(this.A03);
        AbstractC6374YB.A0J(abstractC6400Yb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, abstractC6400Yb.getToolbarHeight());
        layoutParams.addRule(10);
        layoutParams.setMargins(AbstractC6332XV.A0u, AbstractC6332XV.A0r, 0, 0);
        RelativeLayout.LayoutParams parentLayoutParam = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams toolbarParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        parentLayoutParam.width = -1;
        parentLayoutParam.height = -1;
        if (i == 1) {
            toolbarParams.width = -1;
            toolbarParams.height = -2;
        } else {
            toolbarParams.width = -2;
            toolbarParams.height = -1;
        }
        toolbarParams.removeRule(14);
        viewGroup.setLayoutParams(parentLayoutParam);
        view.setLayoutParams(toolbarParams);
        this.A0X.A0z(viewGroup, false, false, this.A03.getId());
        A0X(i);
        viewGroup.addView(abstractC6400Yb, layoutParams);
    }

    private void A0c(ViewGroup viewGroup, View view, AbstractC6400Yb abstractC6400Yb, int i) {
        AbstractC6374YB.A0J(this.A03);
        AbstractC6374YB.A0J(abstractC6400Yb);
        AbstractC6374YB.A0J(this.A0X);
        boolean zA05 = AbstractC6322XL.A05(this.A0N);
        boolean isBrowserBelowMediaView = i == 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        if (!super.A06.A2U() || i != 2 || !zA05) {
            A0Y(AbstractC6332XV.A0N);
            layoutParams.setMargins(AbstractC6332XV.A0T, AbstractC6332XV.A0N, 0, 0);
        } else {
            layoutParams.setMargins(AbstractC6332XV.A0T, AbstractC6332XV.A0B, 0, 0);
            A0Y(AbstractC6332XV.A0B);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams browserLayoutParam = (RelativeLayout.LayoutParams) view.getLayoutParams();
        browserLayoutParam.removeRule(14);
        browserLayoutParam.removeRule(9);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams3.removeRule(3);
        layoutParams3.removeRule(1);
        boolean z = isBrowserBelowMediaView || zA05;
        if (z) {
            layoutParams2.height = getHeightPixels() / 4;
            browserLayoutParam.height = getHeightPixels() / 4;
            if (A0p[5].charAt(30) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A0p;
            strArr[1] = "aNPRQigyxlriqHgRS6C1obCW9NP8FFpI";
            strArr[2] = "RUJfPTyX2Zr9a7jBp48wtOZ1EckF1HKn";
            browserLayoutParam.addRule(14);
            layoutParams3.addRule(3, viewGroup.getId());
        } else {
            this.A0b.A0Z(i);
            layoutParams2.height = -1;
            browserLayoutParam.height = -1;
            browserLayoutParam.addRule(9);
            layoutParams3.addRule(1, view.getId());
        }
        layoutParams2.addRule(9);
        layoutParams2.addRule(10);
        viewGroup.setLayoutParams(layoutParams2);
        browserLayoutParam.width = -2;
        view.setLayoutParams(browserLayoutParam);
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams3);
        if (z) {
            addView(this.A03);
            addView(abstractC6400Yb, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            layoutParams.addRule(0, this.A03.getId());
            viewGroup.addView(abstractC6400Yb, layoutParams);
        }
        this.A0X.A0z(viewGroup, true, zA05, this.A03.getId());
    }

    private void A0d(C5719NR c5719nr) {
        this.A0X.setInfo(c5719nr.A0I(), c5719nr.A0J(), super.A06.A2E(), super.A06.A2C().A01(), null, this.A0Y);
        this.A0X.getCTAButton().setIsInAppBrowser(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(C45474A c45474a) {
        if (this.A0b.getState() == EnumC6844fm.A02 && C6171Up.A1e(this.A0U)) {
            postDelayed(new C5370Hm(this, c45474a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(String str) {
        C5634M3 c5634m3;
        AbstractC6374YB.A0J(this.A06);
        C5375Hr c5375Hr = new C5375Hr(this);
        if (this.A0U.A0E() == null) {
            this.A0U.A0F().A9v();
        }
        if (this.A07 != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (AbstractC6172Uq.A02(this.A0U) || this.A0U.A0E() == null) {
            c5634m3 = new C5634M3(this.A0U, c5375Hr);
        } else {
            c5634m3 = new C5634M3(this.A0U, this.A0U.A0E(), c5375Hr);
        }
        this.A06 = c5634m3;
        setUpBrowserControls(this.A06);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A03.addView(this.A06, layoutParams);
        this.A06.loadUrl(str);
    }

    private void A0q(String str) {
        Map<String, String> mapA05 = new C6558b9().A03(null).A02(null).A05();
        mapA05.put(A0J(0, 12, 95), str);
        this.A0V.A04(EnumC6199VH.A0J, mapA05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), mapA05);
        if (C6171Up.A2U(this.A0U)) {
            HashMap map = new HashMap();
            map.put(AbstractC7116kH.A04, Boolean.TRUE.toString());
            map.put(AbstractC7116kH.A05, Boolean.TRUE.toString());
            map.put(AbstractC7116kH.A06, Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0r(String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O() && this.A0F) {
                return;
            }
            this.A0F = true;
            A0q(str);
            return;
        }
        if (super.A06.A1d()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0s(String str) {
        if (!this.A0K) {
            this.A0K = true;
            this.A0Z.AGQ(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0t(String str) {
        if (!this.A0D) {
            this.A0X.getCTAButton().A0E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0u(boolean z) {
        if (!z && this.A0m) {
            return;
        }
        this.A0D = z;
        if (z) {
            this.A01 = 0;
            this.A0G = false;
            this.A0F = false;
        } else {
            this.A0P.removeCallbacksAndMessages(null);
        }
        LinearLayout linearLayout = this.A03;
        float y = this.A03.getY();
        float heightPixels = getHeightPixels();
        if (z) {
            heightPixels /= 4.0f;
        }
        String strA0J = A0J(81, 1, 109);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, strA0J, y, heightPixels);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A0b, strA0J, this.A0b.getY(), 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        int height = this.A0b.getHeight();
        int heightPixels2 = getHeightPixels();
        if (z) {
            heightPixels2 /= 4;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
        duration.addUpdateListener(new C6712dd(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, duration);
        animatorSet.addListener(new C6713de(this, z));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z);
        }
        A0w(this.A0D, true);
        if (!z && this.A06 != null) {
            this.A06.destroy();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    private void A0v(boolean z, int i) {
        this.A0U.A0F().ACG(!z, i);
        if (this.A04 != null) {
            boolean z2 = this.A0m;
            int i2 = 4;
            String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[6] = "EaXPQIkUGhcx1dZHr3fchF7eoR8nmh6r";
            strArr2[7] = "BoqCm6Atk4DXyXzUZY25jylGRvSX4IAb";
            if (z2) {
                this.A04.setCloseButtonVisibility(4);
                return;
            }
            C5639M8 c5639m8 = this.A04;
            String[] strArr3 = A0p;
            if (strArr3[3].length() == strArr3[0].length()) {
                String[] strArr4 = A0p;
                strArr4[3] = "X7";
                strArr4[0] = "zP";
                if (z) {
                    i2 = 0;
                }
            } else if (z) {
                i2 = 0;
            }
            c5639m8.setCloseButtonVisibility(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0w(boolean z, boolean z2) {
        if (!this.A0M) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        if (z) {
            A0c(this.A0b, this.A0b.getVideoView(), this.A0W, i);
            return;
        }
        if (z2) {
            C5183Ek c5183Ek = this.A0b;
            C5183Ek c5183Ek2 = this.A0b;
            String[] strArr = A0p;
            String str = strArr[6];
            String str2 = strArr[7];
            int iCharAt = str.charAt(0);
            int orientation = str2.charAt(0);
            if (iCharAt == orientation) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[6] = "obEiGvqtCCvFNuJUlwIyPJMxkodqaQ5K";
            strArr2[7] = "nJocAzrRDHwRQikLytOPP2BE8QGdYkmy";
            A0b(c5183Ek, c5183Ek2.getVideoView(), this.A0W, i);
            return;
        }
        A0a(this.A0b, this.A0b.getVideoView(), i);
    }

    private final boolean A0x() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final EnumC5683Mq A1D(String str) {
        if (!A0x()) {
            if (this.A09 != null) {
                return this.A09.A0E().A0E(str);
            }
            return this.A0X.getCTAButton().A0E(str);
        }
        return EnumC5683Mq.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1E() {
        A0O();
        this.A0X.A0j();
        this.A0R.removeCallbacksAndMessages(null);
        if (this.A09 != null) {
            this.A09.A0F();
        }
        this.A0Q.removeCallbacksAndMessages(null);
        if (C6171Up.A1z(this.A0U)) {
            this.A0U.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            this.A0a.A07();
        }
        C6578bT c6578bT = this.A07;
        String[] strArr = A0p;
        if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
            throw new RuntimeException();
        }
        A0p[4] = "zZx5K1WC5ur1IIrcKdsfSp5hTLdY49e9";
        if (c6578bT != null) {
            this.A07.A0B();
            this.A07 = null;
        }
        if (this.A0b != null) {
            this.A0b.getEventBus().A04(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
            AbstractC6374YB.A0H(this.A0b);
            this.A0b.A0W();
        }
        this.A0c.A0p();
        AbstractC6374YB.A0d(this.A0b, this.A0k, this.A0j);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1G() {
        this.A0I = true;
        this.A0X.A0o();
        AbstractC6374YB.A0d(this.A0b, this.A0X, this.A0k, this.A04, this.A0j, this.A03, this.A0W);
        if (this.A07 != null) {
            this.A07.A0B();
        }
        AbstractC6374YB.A0W(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        A0K();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(AbstractC6332XV.A0u, AbstractC6332XV.A0r, 0, 0);
        addView(this.A0W, layoutParams);
        this.A0W.bringToFront();
        this.A0B = true;
        this.A0Z.AFw(true);
        if (this.A0W != null && getAdDataBundle().A29().A0K().A00() > 0) {
            this.A0B = false;
            if (getAdDataBundle().A2P()) {
                this.A0W.setToolbarActionMode(8);
            } else {
                this.A0W.setToolbarActionMode(2);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6715dg(this), getAdDataBundle().A29().A0K().A00());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1H() {
        C5183Ek c5183Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c5183Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(EnumC6789et.A02, 20);
        int iA02 = super.A06.A29().A0H().A02();
        if (iA02 != 0) {
            int secondsForNextCta2 = this.A0O;
            if (iA02 < secondsForNextCta2) {
                if (iA02 <= 0) {
                    return;
                }
                this.A0W.setProgressSpinnerInvisible(true);
                new C6325XO(iA02, new C5373Hp(this)).A07();
                return;
            }
        }
        this.A0W.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1I(boolean z) {
        this.A0J = z;
        A0v(z, 4);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1J(boolean z) {
        C6578bT c6578bT;
        if (!this.A0C) {
            this.A0X.A0m(z);
        }
        if (this.A09 != null) {
            boolean z2 = this.A0C;
            String[] strArr = A0p;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[1] = "0qZcOgUU1tryulZiP6XyTUbAv74itU8r";
            strArr2[2] = "FbQDSrVtnmrn6n1tCiGdEtRCABZgMVu6";
            if (!z2) {
                this.A09.A0H(z);
            }
        }
        this.A0C = false;
        if (this.A0b.A0n()) {
            return;
        }
        if (this.A07 != null) {
            int i = getResources().getConfiguration().orientation;
            if (A0p[5].charAt(30) != '1') {
                A0p[5] = "NO4KYfXMvMpDq3TiuILiTAIZZLlPHE1o";
                if (i == 1) {
                    c6578bT = this.A07;
                    if (A0p[4].charAt(14) != 'r') {
                        throw new RuntimeException();
                    }
                    A0p[5] = "A4MeJOKX43Wbu7wDNPQrh0qwNu1xfN10";
                    c6578bT.A0C();
                }
            } else {
                String[] strArr3 = A0p;
                strArr3[1] = "uxhOTaOwbBr7x682JVxutMugyCdaSc2z";
                strArr3[2] = "WtxTL59IucrgXt9Ertpm7Y8tzE2Zsttw";
                if (i == 1) {
                    c6578bT = this.A07;
                    if (A0p[4].charAt(14) != 'r') {
                        throw new RuntimeException();
                    }
                    A0p[5] = "A4MeJOKX43Wbu7wDNPQrh0qwNu1xfN10";
                    c6578bT.A0C();
                }
            }
        }
        this.A0A = this.A0b.getVideoStartReason();
        this.A0L = z;
        this.A0b.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1K(boolean z) {
        if (this.A0b.getState() == EnumC6844fm.A06 || this.A0A == null) {
            return;
        }
        if (!this.A0L || z) {
            C5183Ek c5183Ek = this.A0b;
            EnumC6789et enumC6789et = this.A0A;
            String[] strArr = A0p;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[1] = "9WZdaf1ZSKrkBdUpSM4gGNVox8spVJjj";
            strArr2[2] = "I46V5u0Uk9rGg82Mpkl9CB9pMmc46Jha";
            c5183Ek.A0e(enumC6789et, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1L() {
        if (super.A06.A29().A0V() && super.A06.A29().A0K().A04()) {
            boolean z = this.A0I;
            if (A0p[4].charAt(14) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0p;
            strArr[1] = "C2SzQuWg94rP8CljhRH7nkSf4iQhtgDx";
            strArr[2] = "CARYfrdNq1rie86wRQdSwAxjb6sfTLqG";
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1N() {
        return this.A0B;
    }

    public final boolean A1O() {
        return !A0x();
    }

    public C5728Na getColors() {
        return this.A0T;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public C6719dk getFullScreenAdStyle() {
        return new C6719dk(true, C6719dk.A06, super.A06.A28().A01(), ViewOnClickListenerC5560Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    private int getHeightPixels() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    private ViewOnClickListenerC5560Kr getRegularCtaForEndCard() {
        ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr = new ViewOnClickListenerC5560Kr(this.A0U, super.A06.A0w(), super.A06.A28().A01(), super.A08, super.A0B, (C6847fp) null, super.A0A, super.A06.A2A());
        viewOnClickListenerC5560Kr.setViewShowsOverMedia(true);
        AbstractC6374YB.A0K(viewOnClickListenerC5560Kr);
        viewOnClickListenerC5560Kr.setText(super.A06.A29().A0J().A04());
        AbstractC6374YB.A0G(1001, viewOnClickListenerC5560Kr);
        viewOnClickListenerC5560Kr.setCta(super.A06.A29().A0J(), super.A06.A2E(), new HashMap(), null);
        return viewOnClickListenerC5560Kr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0I) {
            return;
        }
        A0X(configuration.orientation);
        A0w(this.A0D, false);
        if (this.A07 != null) {
            this.A07.A0D(configuration.orientation);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
        } else {
            this.A0C = true;
            A1J(false);
        }
    }

    private void setUpBrowserControls(C5634M3 c5634m3) {
        if (this.A04 != null) {
            AbstractC6374YB.A0J(this.A04);
        }
        this.A04 = new C5639M8(this.A0U, c5634m3, true);
        if (this.A0m) {
            A0v(this.A0J, 1);
        }
        c5634m3.setBrowserNavigationListener(this.A04.getBrowserNavigationListener());
        AbstractC6374YB.A0K(this.A04);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC6332XV.A0v, AbstractC6332XV.A0v, AbstractC6332XV.A0v, AbstractC6332XV.A0v);
        this.A04.setListener(new C5374Hq(this));
        this.A03.addView(this.A04, layoutParams);
        if (this.A05 != null) {
            AbstractC6374YB.A0J(this.A05);
        }
        this.A05 = new C6530ah(this.A0U, null, R.attr.progressBarStyleHorizontal);
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, A0q));
    }
}
