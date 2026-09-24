package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5521KE extends AbstractC6614c3 {
    public static byte[] A0k;
    public static String[] A0l = {"fr3Y9tf6ePgTPq", "pEcG", "X6n0DjY1D3c56kEYNT7NkudbHULcUpi8", "xLfqb7j3EStc", "2nglUwJ7J1gVDM", "1eQzmRPEbuFcZFemJlVYaDXjMdIAS51D", "mnsD3rfSZRPYnMaeA3V0PZWjFbonJuRI", "JvQjcWyuZKXxmxTpCuNSfYxSgxmPRmOD"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public View A09;
    public InputMethodManager A0A;
    public LinearLayout A0B;
    public LinearLayout A0C;
    public TextView A0D;
    public AbstractC7077jd A0E;
    public AbstractRunnableC6279Wc A0F;
    public C5637M6 A0G;
    public C6530ah A0H;
    public C5634M3 A0I;
    public C6618c7 A0J;
    public C6650cd A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final Handler A0Z;
    public final View A0a;
    public final AbstractC5686Mt A0b;
    public final C6200VI A0c;
    public final InterfaceC6579bU A0d;
    public final InterfaceC6592bh A0e;
    public final C6593bi A0f;
    public final C5110DZ A0g;
    public final Runnable A0h;
    public final boolean A0i;
    public final boolean A0j;

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0k, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0l;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "BAn7g4Tg6kNh";
            strArr2[1] = "sSvO";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 34);
            i4++;
        }
    }

    public static void A0W() {
        A0k = new byte[]{75, 68, 65, 75, 67, 119, 91, 71, 93, 90, 75, 77, 86, 81, 79, 74, 75, 96, 82, 90, 75, 87, 80, 91, 107, 109, 123, 108, 125, 114, 119, 125, 117, 65, 120, 119, 114, 106, 123, 108, 123, 122, 98, 124, 123, 113, 122, 98, 65};
    }

    static {
        A0W();
        A0o = AbstractC6332XV.A0E;
        A0m = AbstractC6332XV.A0I;
        A0q = AbstractC6332XV.A0U;
        A0n = AbstractC5819P3.A02(-1, 77);
        A0p = AbstractC6332XV.A05;
    }

    public C5521KE(C6618c7 c6618c7) {
        super(c6618c7, true);
        this.A02 = 0;
        this.A0L = false;
        this.A0T = false;
        this.A0V = false;
        this.A0W = false;
        this.A0X = false;
        this.A0U = false;
        this.A0Y = false;
        this.A0P = false;
        this.A0R = false;
        this.A0Q = false;
        this.A0O = false;
        this.A07 = 0;
        this.A01 = 0;
        this.A0S = false;
        this.A0Z = new Handler(Looper.getMainLooper());
        this.A0h = new RunnableC6635cO(this);
        this.A0N = false;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A0A = (InputMethodManager) c6618c7.A06().getSystemService(A0I(12, 12, 29));
        this.A0J = c6618c7;
        this.A0E = this.A0J.A05();
        this.A0c = new C6200VI(c6618c7.A05().A2E(), c6618c7.A07());
        this.A0g = this.A0J.A0E();
        if (this.A0g != null) {
            AbstractC6374YB.A0K(this.A0g);
        }
        this.A0a = this.A0J.A03();
        this.A0b = C5687Mu.A01(c6618c7.A06(), c6618c7.A07(), c6618c7.A05().A2E(), AbstractC6312XB.A00(c6618c7.A05().A29().A0J().A05()), new HashMap(), false, true, this.A0E.A2A());
        this.A0d = new C5532KP(this);
        AbstractC6602br.A00(c6618c7.A06(), this, c6618c7.A05().A29().A0H().A08());
        setupLayoutConfiguration(false);
        A0R();
        A0N();
        this.A0F = new C5524KH(this);
        postDelayed(this.A0F, 1000L);
        A0V();
        this.A0e = new C5523KG(this);
        C5183Ek c5183Ek = this.A0J.A02() instanceof C5183Ek ? (C5183Ek) this.A0J.A02() : null;
        this.A0f = new C6593bi(c6618c7, this.A0E, c5183Ek, this.A0J.A0C(), this.A0e, this.A0D, this.A0K, this.A0g, this.A0a);
        if (c5183Ek != null && C6171Up.A1L(getAdContextWrapper())) {
            AbstractC6561bC.A00(c5183Ek.getVideoImplView(), C6171Up.A1M(getAdContextWrapper()), new ViewOnClickListenerC6636cP(this));
        } else if (c5183Ek == null && this.A09 != null && C6171Up.A1J(getAdContextWrapper())) {
            AbstractC6561bC.A00(this.A09, C6171Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC6637cQ(this));
        }
        this.A0i = c6618c7.A05().A1m();
        this.A0j = c6618c7.A05().A1z();
        getAdContextWrapper().A0F().ACI(this.A0i, this.A0j, c6618c7.A05().A2L());
    }

    public static /* synthetic */ int A03(C5521KE c5521ke) {
        int i = c5521ke.A01;
        c5521ke.A01 = i + 1;
        return i;
    }

    public static /* synthetic */ int A05(C5521KE c5521ke) {
        int i = c5521ke.A07;
        c5521ke.A07 = i + 1;
        return i;
    }

    private void A0J() {
        AbstractC6374YB.A0J(this.A0C);
        this.A0C = new LinearLayout(this.A0J.A06());
        AbstractC6374YB.A0U(this.A0C, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0L ? this.A03 / 4 : this.A03 / 5);
        layoutParams.addRule(12);
        this.A0C.setLayoutParams(layoutParams);
        addView(this.A0C, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K() {
        if (this.A0E.A1e() && this.A0N) {
            this.A0N = false;
            A0g(A0I(24, 18, 60));
        }
    }

    private void A0L() {
        if (this.A0E.A1e() && this.A0N) {
            this.A0N = false;
            Map<String, String> mapA05 = new C6558b9().A03(null).A02(null).A05();
            mapA05.put(A0I(0, 12, 10), A0I(24, 18, 60));
            getAdEventManager().AB6(this.A0E.A2E(), mapA05);
        }
    }

    private void A0M() {
        AbstractC6400Yb abstractC6400YbA0B;
        if (this.A0J.A05().A1x() && (abstractC6400YbA0B = this.A0J.A0B()) != null) {
            abstractC6400YbA0B.setProgressSpinnerInvisible(false);
        }
    }

    private void A0N() {
        AbstractC6374YB.A0J(this.A0B);
        this.A0B = new LinearLayout(this.A0J.A06());
        this.A0B.setOrientation(1);
        AbstractC6374YB.A0K(this.A0B);
        A0T();
        this.A0B.setBackgroundColor(-1);
        addView(this.A0B);
    }

    private void A0O() {
        if (this.A0a != null) {
            AbstractC6374YB.A0J(this.A0a);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC6614c3.A09, AbstractC6614c3.A09);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC6614c3.A08, this.A06, AbstractC6614c3.A08, AbstractC6614c3.A08);
            addView(this.A0a, layoutParams);
        }
    }

    private void A0P() {
        if (this.A0g != null) {
            AbstractC6374YB.A0J(this.A0g);
            this.A0g.setPadding(A0p, A0p, A0p, A0p);
            this.A0g.A08(-1, A0n, false);
            this.A0g.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0o);
            layoutParams.addRule(12);
            addView(this.A0g, layoutParams);
        }
    }

    private void A0Q() {
        AbstractC6400Yb abstractC6400YbA0B = this.A0J.A0B();
        if (abstractC6400YbA0B == null) {
            return;
        }
        abstractC6400YbA0B.setPageDetailsVisible((this.A0M || abstractC6400YbA0B.A0E()) ? false : true);
    }

    private void A0R() {
        this.A09 = this.A0J.A02();
        if (this.A09 != null) {
            if (this.A0E.A1e()) {
                this.A09.setOnClickListener(new ViewOnClickListenerC6638cR(this));
            }
            AbstractC6374YB.A0J(this.A09);
            AbstractC6374YB.A0K(this.A09);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(15);
            addView(this.A09, 1, layoutParams);
        }
        this.A0D = new TextView(this.A0J.A06());
        AbstractC6374YB.A0K(this.A0D);
        this.A0D.setGravity(17);
        this.A0D.setTextColor(getColors().A06(true));
        this.A0D.setEllipsize(TextUtils.TruncateAt.END);
        this.A0D.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        layoutParams2.setMargins(A0q, A0q / 2, A0q, this.A0g == null ? A0q : A0o);
        addView(this.A0D, layoutParams2);
        AbstractC6374YB.A0K(this.A0D);
        this.A0K = new C6650cd(this.A0J.A06(), getCtaButton(), this.A0J.A05(), this.A0J.A07(), this.A0J.A0C(), this.A0J.A0F(), this.A0J.A0A(), getColors(), this.A0d);
        this.A0K.setAutoClickTime(this.A0J.A05(), this.A0J.A0B());
        AbstractC6374YB.A0G(1010, this.A0K);
        addView(this.A0K);
        A0U();
        A0J();
        if (C6171Up.A17(this.A0J.A06())) {
            View.OnClickListener onClickListener = new ViewOnClickListenerC6639cS(this);
            this.A0C.setOnClickListener(onClickListener);
            if (this.A0J.A0B() != null) {
                View.OnClickListener onClickListener2 = new ViewOnClickListenerC6640cT(this);
                this.A0J.A0B().setCTAClickListener(onClickListener2);
            }
        }
    }

    private void A0S() {
        this.A0U = true;
        this.A0K.setVisibility(8);
        AbstractC6374YB.A0W(this);
        removeCallbacks(this.A0F);
        AbstractC6374YB.A0d(this.A0K);
        AbstractC6374YB.A0d(this.A0g, this.A0a, this.A0f, this.A0D, this.A0G, this.A0J.A0B(), this.A0B, this.A0H);
        if (Build.VERSION.SDK_INT >= 35) {
            Object parent = getParent();
            if (parent instanceof View) {
                View parentView = (View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
        if (this.A09 instanceof C5183Ek) {
            C5183Ek c5183Ek = (C5183Ek) this.A09;
            for (InterfaceC6790eu interfaceC6790eu : c5183Ek.getPlugins()) {
                if (interfaceC6790eu instanceof C448234) {
                    c5183Ek.A0g(interfaceC6790eu);
                    break;
                }
            }
        }
        addView(new C6630cJ(this.A0J.A06(), this.A0E, this.A0c, this.A0Z, this.A0J.A0C()).A0C(getRegularCtaForEndCard()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0T() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A04);
        if (A1Q()) {
            layoutParams.setMargins(0, this.A04 / 5, 0, 0);
            layoutParams.addRule(12);
            String[] strArr = A0l;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "lVu96jIJ4wtN";
            strArr2[1] = "vEsO";
            this.A0B.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A04 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0B;
        String[] strArr3 = A0l;
        if (strArr3[4].length() != strArr3[0].length()) {
            linearLayout.setTranslationY(0.0f);
            this.A0B.setLayoutParams(layoutParams);
            return;
        }
        String[] strArr4 = A0l;
        strArr4[6] = "ao8FhOByUXKbyI2dbjVU10hQSvAA73UK";
        strArr4[5] = "1fPkz4yBU6BXLdgQ7SVXdDzzX5ZOz4LN";
        linearLayout.setTranslationY(0.0f);
        this.A0B.setLayoutParams(layoutParams);
    }

    private void A0U() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0L ? this.A03 / 4 : this.A03 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0D.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0K.setLayoutParams(layoutParams);
        this.A0K.A03();
    }

    private void A0V() {
        if (!this.A0U) {
            A0P();
            A0O();
        }
        A0Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(String str) {
        C5634M3 c5634m3;
        AbstractC6374YB.A0J(this.A0I);
        C5534KR c5534kr = new C5534KR(this);
        if (this.A0J.A06().A0E() == null) {
            this.A0J.A06().A0F().A9v();
        }
        if (AbstractC6172Uq.A02(this.A0J.A06()) || this.A0J.A06().A0E() == null) {
            c5634m3 = new C5634M3(this.A0J.A06(), c5534kr);
        } else {
            c5634m3 = new C5634M3(this.A0J.A06(), this.A0J.A06().A0E(), c5534kr);
        }
        this.A0I = c5634m3;
        this.A0I.setOnTouchListener(new ViewOnTouchListenerC6632cL(this));
        setUpBrowserControls(this.A0I);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0B.addView(this.A0I, layoutParams);
        this.A0I.loadUrl(str);
    }

    private void A0g(String str) {
        Map<String, String> mapA05 = new C6558b9().A03(null).A02(null).A05();
        mapA05.put(A0I(0, 12, 10), str);
        this.A0c.A04(EnumC6199VH.A0J, mapA05);
        this.A0J.A0C().A4j(this.A0E.A0w());
        getAdEventManager().ABM(this.A0E.A2E(), mapA05);
        if (C6171Up.A2U(this.A0J.A06())) {
            HashMap map = new HashMap();
            map.put(AbstractC7116kH.A04, Boolean.TRUE.toString());
            map.put(AbstractC7116kH.A05, Boolean.TRUE.toString());
            map.put(AbstractC7116kH.A06, Boolean.TRUE.toString());
            getAdEventManager().ABn(this.A0E.A2E(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(String str) {
        if (this.A0E.A25() > 0) {
            if (this.A0E.A2O() && this.A0O) {
                return;
            }
            this.A0O = true;
            A0g(str);
            return;
        }
        if (this.A0E.A1d()) {
            A0K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(boolean z) {
        if (!z && A0m()) {
            return;
        }
        this.A0M = z;
        ObjectAnimator objectAnimatorOfFloat = null;
        if (!z) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A07 = 0;
            this.A0P = false;
            this.A0Q = false;
            this.A0R = false;
            this.A0O = false;
            A0k(!A0m(), 0);
            A0M();
        }
        if (!this.A0S) {
            postDelayed(new C5533KQ(this, z), 250L);
        }
        String strA0I = A0I(48, 1, 26);
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.A0K, strA0I, this.A0K.getY(), this.A04 / 5);
        }
        LinearLayout linearLayout = this.A0B;
        float y = this.A0B.getY();
        int i = this.A04;
        if (z) {
            i /= 5;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, strA0I, y, i);
        objectAnimatorOfFloat2.setDuration(500L);
        if (this.A09 != null) {
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.A09, strA0I, this.A09.getY(), 0.0f);
            objectAnimatorOfFloat3.setDuration(500L);
            int height = this.A09.getHeight();
            int i2 = this.A04;
            if (z) {
                i2 /= 5;
            }
            ValueAnimator duration = ValueAnimator.ofInt(height, i2).setDuration(500L);
            duration.addUpdateListener(new C6633cM(this));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3, duration);
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setDuration(500L);
                animatorSet.playTogether(objectAnimatorOfFloat);
            }
            animatorSet.addListener(new C6634cN(this, z));
            if (this.A0j) {
                boolean z2 = this.A09 instanceof C5183Ek;
                String[] strArr = A0l;
                if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0l;
                strArr2[3] = "kmPKPZPxIo82";
                strArr2[1] = "o2de";
                if (z2) {
                    ((C5183Ek) this.A09).A0c(animatorSet, z);
                }
            }
            animatorSet.start();
        }
    }

    private void A0j(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        AbstractC6374YB.A0J(this.A09);
        if (this.A09 == null) {
            this.A09 = this.A0J.A02();
            AbstractC6374YB.A0K(this.A09);
        }
        boolean z2 = this.A0M;
        String[] strArr = A0l;
        if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0l;
        strArr2[2] = "vsQMzuL85pElT0uyLkCOYkbLp6FYZ6Kp";
        strArr2[7] = "Jg0wEDfumSgIDDBadFZcUW5HjHx0Xq4t";
        if (z2) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A04 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (C6171Up.A1J(getAdContextWrapper()) && getResources().getConfiguration().orientation == 2 && !(this.A09 instanceof C5183Ek)) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            layoutParams.addRule(13);
            A0N();
        }
        if (this.A09 != null) {
            this.A09.setTranslationY(0.0f);
            addView(this.A09, 1, layoutParams);
        }
        A0J();
        A0U();
    }

    private void A0k(boolean z, int i) {
        if (this.A0G != null && this.A0i) {
            this.A0G.setCloseButtonVisibility(z ? 0 : 4);
            C6902gi adContextWrapper = getAdContextWrapper();
            String[] strArr = A0l;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[4] = "GBT9VwLYKrAlXj";
            strArr2[0] = "vffPPOX2qjrj4g";
            adContextWrapper.A0F().ACG(!z, i);
        }
    }

    private boolean A0l() {
        return this.A0E.A29().A0H().A0B() && this.A0X && !this.A0Y && !this.A0V;
    }

    private boolean A0m() {
        return this.A0i && this.A0W;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final EnumC5683Mq A1B(String str) {
        return this.A0K.A02(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1C() {
        this.A0Z.removeCallbacksAndMessages(null);
        A0L();
        super.A1C();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1D() {
        AbstractC6400Yb abstractC6400YbA0B = this.A0J.A0B();
        if (abstractC6400YbA0B != null) {
            abstractC6400YbA0B.setPageDetailsVisible((A1Q() || abstractC6400YbA0B.A0E()) ? false : true);
        }
        this.A0X = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1E() {
        if (this.A0J.A0B() != null) {
            this.A0J.A0B().setPageDetailsVisible(false);
        }
        this.A0X = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1F() {
        this.A0V = false;
        this.A0W = false;
        A0k(true, 3);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1G() {
        this.A0V = this.A0E.A29().A0H().A04() > 0;
        this.A0W = true;
        A0k(false, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0033  */
    /* JADX WARN: Code duplicated, block: B:8:0x0046  */
    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1H(C5719NR c5719nr, String str, double d, Bundle bundle) {
        super.A1H(c5719nr, str, d, bundle);
        this.A0K.setCta(this.A0E.A29().A0J(), this.A0E.A2E(), new HashMap<>(), this.A0d);
        String strA0F = c5719nr.A0I().A0F();
        if (strA0F != null) {
            String description = strA0F.trim();
            if (description.length() == 0) {
                AbstractC6374YB.A0O(this.A0C, 8);
                if (C6171Up.A17(this.A0J.A06())) {
                    this.A0C.setClickable(false);
                }
            } else {
                this.A0D.setText(strA0F);
                if (C6171Up.A17(this.A0J.A06())) {
                    LinearLayout linearLayout = this.A0C;
                    String[] strArr = A0l;
                    if (strArr[2].charAt(25) == strArr[7].charAt(25)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0l;
                    strArr2[3] = "eomTAZA5kOTO";
                    strArr2[1] = "I37n";
                    linearLayout.setClickable(true);
                }
            }
        } else {
            AbstractC6374YB.A0O(this.A0C, 8);
            if (C6171Up.A17(this.A0J.A06())) {
                this.A0C.setClickable(false);
            }
        }
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.A02 = (int) (((double) this.A05) / d);
        }
        this.A02 = this.A0L ? this.A03 : this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1I(C45574K c45574k) {
        super.A1I(c45574k);
        if (this.A0E.A29().A0K().A04() && !A1Q()) {
            A0S();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1N() {
        return !A1Q();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1P(boolean z) {
        if (A1Q()) {
            getAdContextWrapper().A0F().ACF();
            A0i(false);
            return true;
        }
        if (A0l()) {
            getAdContextWrapper().A0F().ACJ();
            this.A0f.A07(this);
            return true;
        }
        if (this.A0E.A29().A0K().A04()) {
            getAdContextWrapper().A0F().ACK();
            if (this.A09 instanceof C5183Ek) {
                C5183Ek simpleVideoView = (C5183Ek) this.A09;
                simpleVideoView.A0h(true);
            }
            A0S();
            return true;
        }
        getAdContextWrapper().A0F().ACH();
        return false;
    }

    public final boolean A1Q() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public int getCloseButtonStyle() {
        if (A1Q()) {
            return A0m() ? 2 : 3;
        }
        if (this.A0E.A29().A0H().A02() >= 0 && A1N() && (this.A0V || this.A0X)) {
            return 8;
        }
        if (this.A0V) {
            return 2;
        }
        if (this.A0E.A29().A0H().A0B()) {
            return 1;
        }
        if (this.A0X) {
            return 4;
        }
        if (this.A0E.A29().A0K().A04()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    private ViewOnClickListenerC5560Kr getRegularCtaForEndCard() {
        ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr = new ViewOnClickListenerC5560Kr(getAdContextWrapper(), this.A0J.A05().A0w(), this.A0E.A28().A01(), getAdEventManager(), this.A0J.A0C(), (C6847fp) null, this.A0J.A0A(), this.A0E.A2A());
        viewOnClickListenerC5560Kr.setViewShowsOverMedia(true);
        AbstractC6374YB.A0K(viewOnClickListenerC5560Kr);
        viewOnClickListenerC5560Kr.setText(this.A0E.A29().A0J().A04());
        AbstractC6374YB.A0G(1001, viewOnClickListenerC5560Kr);
        viewOnClickListenerC5560Kr.setCta(this.A0E.A29().A0J(), this.A0E.A2E(), new HashMap(), null);
        return viewOnClickListenerC5560Kr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0j(A1Q());
        A0V();
        setupLayoutConfiguration(A1Q());
        A0T();
        if (this.A0U && Build.VERSION.SDK_INT >= 35) {
            Object parent = getParent();
            if (parent instanceof View) {
                View parentView = (View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserProgressBarValue(int i) {
        if (this.A0H != null) {
            this.A0H.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
        this.A0W = !z;
        A0k(z, 4);
    }

    public void setChildChainedAd(boolean z) {
        this.A0S = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleToBrowser(String str) {
        if (this.A0G != null) {
            this.A0G.setTitle(str);
        }
    }

    private void setUpBrowserControls(C5634M3 c5634m3) {
        AbstractC6374YB.A0J(this.A0G);
        this.A0G = new C5637M6(this.A0J.A06(), c5634m3, true, this.A0j);
        if (this.A0i) {
            String[] strArr = A0l;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[4] = "M6ycP1RHJpeE8b";
            strArr2[0] = "ycEZieyXOIyeai";
            A0k(false, 1);
        }
        c5634m3.setBrowserNavigationListener(this.A0G.getBrowserNavigationListener());
        AbstractC6374YB.A0K(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0G.setListener(new C5535KS(this));
        this.A0G.setOnTouchListener(new ViewOnTouchListenerC6631cK(this));
        this.A0B.addView(this.A0G, layoutParams);
        AbstractC6374YB.A0J(this.A0H);
        this.A0H = new C6530ah(this.A0J.A06(), null, R.attr.progressBarStyleHorizontal);
        this.A0B.addView(this.A0H, new LinearLayout.LayoutParams(-1, A0m));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlToBrowser(String str) {
        if (this.A0G != null) {
            this.A0G.setUrl(str);
        }
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0L = getResources().getConfiguration().orientation == 2;
        this.A06 = this.A0J.A0B() != null ? this.A0J.A0B().getToolbarHeight() : 0;
        this.A0M = z;
        this.A03 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A05 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) getAdContextWrapper().getSystemService(A0I(42, 6, 55));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A04 = point.y > 0 ? point.y : this.A03;
        this.A02 = this.A03;
    }
}
