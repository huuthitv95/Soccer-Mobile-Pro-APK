package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5F */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C46145F extends AbstractC5428Ij {
    public static byte[] A0o;
    public static String[] A0p = {"uilIZmuHzpP0N9Y8quer6Kb2u", "9UUD4l8CpJqeXgkdEQyriIYmJbPiqOP7", "EZE4mnuFogdbCIqsVVCLHtYnmK0aZj", "syebs7ncPc1rj4O1rMWtVdBIydy8e5", "8mpGklwdfsm8yo", "l0wQPHeYLTHnG4", "V5rJxyMt8frjvUGIYtzHbFROecFIJypl", "I99F1f62ejGluaFUQtWt4OKUQ"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C5728Na A0D;
    public C5637M6 A0E;
    public C6530ah A0F;
    public C5634M3 A0G;
    public C6650cd A0H;
    public EnumC6789et A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final AbstractC5686Mt A0V;
    public final C6902gi A0W;
    public final C6200VI A0X;
    public final AbstractC6400Yb A0Y;
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
    public final C5116Df A0j;
    public final C5110DZ A0k;
    public final Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static String A0L(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0o, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0X() {
        byte[] bArr = {-15, -6, -9, -15, -7, -19, 1, -3, 3, 0, -15, -13, -68, -63, -61, -56, -57, -78, -64, -72, -57, -69, -62, -73, -26, -28, -42, -29, -44, -35, -38, -44, -36, -48, -41, -38, -35, -27, -42, -29, -42, -43, -40, -54, -49, -59, -48, -40, 47};
        String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0p;
        strArr2[4] = "nVqp18ph7ekHb6";
        strArr2[5] = "wg1nH4uIQgdKmM";
        A0o = bArr;
    }

    static {
        A0X();
        A0q = (int) (AbstractC6334XX.A02 * 4.0f);
        A0r = (int) (AbstractC6334XX.A02 * 8.0f);
        A0s = AbstractC5819P3.A02(-1, 77);
        A0w = (int) (AbstractC6334XX.A02 * 26.0f);
        A0x = (int) (AbstractC6334XX.A02 * 12.0f);
        A0u = (int) (AbstractC6334XX.A02 * 12.0f);
        A0v = (int) (AbstractC6334XX.A02 * 44.0f);
        A0t = AbstractC6332XV.A0v;
    }

    public C46145F(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, AbstractC6400Yb abstractC6400Yb, AbstractC7077jd abstractC7077jd, C6056Sx c6056Sx, InterfaceC6455ZU interfaceC6455ZU, int i, InterfaceC6406Yh interfaceC6406Yh, C6200VI c6200vi, int i2, boolean z, boolean z2, InterfaceC6721dm interfaceC6721dm, int i3, int i4) {
        C5728Na c5728NaA00;
        super(c6902gi, interfaceC6455ZU, interfaceC6192VA, abstractC7077jd, i, z, z2, interfaceC6406Yh, i4);
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0R = true;
        this.A0l = new RunnableC6706dX(this);
        this.A0L = false;
        this.A0T = false;
        this.A01 = 0.0f;
        this.A0h = new AbstractC5137E0() { // from class: com.facebook.ads.redexgen.X.5R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5138E1 c5138e1) {
                this.A00.A0T = true;
            }
        };
        this.A0g = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.5P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                if (!((AbstractC5428Ij) this.A00).A0A.A07()) {
                    this.A00.A1F();
                }
            }
        };
        this.A0f = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.5M
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            public final /* bridge */ /* synthetic */ void A03(C6141UL c6141ul) {
            }
        };
        this.A0i = new AbstractC5136Dz() { // from class: com.facebook.ads.redexgen.X.5K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45474A c45474a) {
                this.A00.A0f(c45474a);
                this.A00.A0Z.ADw((this.A00.A01 * this.A00.A0b.getDuration()) + c45474a.A00());
            }
        };
        this.A0d = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.5J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                this.A00.A0Z.ADc(this.A00.A0b.getDuration());
                C46145F.A03(this.A00, 1.0f);
                this.A00.A0b.A0e(EnumC6789et.A02, 28);
            }
        };
        this.A0e = new C46155G(this);
        this.A0Y = abstractC6400Yb;
        this.A0U = i3;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c6902gi.getSystemService(A0L(12, 12, 28));
        this.A0V = C5687Mu.A01(c6902gi, interfaceC6192VA, abstractC7077jd.A2E(), AbstractC6312XB.A00(abstractC7077jd.A29().A0J().A05()), new HashMap(), false, true, abstractC7077jd.A2A());
        this.A0W = c6902gi;
        this.A0X = c6200vi;
        this.A0j = new C5116Df(this.A0W, this.A0X);
        this.A0k = new C5110DZ(this.A0W, -1);
        this.A0Z = interfaceC6721dm;
        if (i2 == 1) {
            c5728NaA00 = super.A06.A28().A01();
        } else {
            c5728NaA00 = super.A06.A28().A00();
        }
        this.A0D = c5728NaA00;
        this.A0b = new C5183Ek(this.A0W);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new C45584L(c6902gi, interfaceC6192VA, this.A0b, abstractC7077jd.A2E());
        A0U();
        String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c6056Sx.A0T(videoUrl));
        A0R();
        A0O();
        A0N();
        C6902gi c6902gi2 = this.A0W;
        String videoUrl2 = abstractC7077jd.A29().A0H().A08();
        AbstractC6602br.A00(c6902gi2, this, videoUrl2);
        setupLayoutConfiguration(false);
        A0T();
        A0S();
        postDelayed(new C5376Hs(this), 1000L);
        if (C6171Up.A1z(this.A0W)) {
            InterfaceC6204VM interfaceC6204VMA0B = this.A0W.A0B();
            C5183Ek c5183Ek = this.A0b;
            String videoUrl3 = super.A06.A2E();
            interfaceC6204VMA0B.AKn(c5183Ek, videoUrl3, true);
        }
        if (C6171Up.A20(this.A0W)) {
            this.A0a = new C5193Eu(this.A0W, interfaceC6192VA, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0Y(abstractC7077jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        c6902gi.A0F().ACI(this.A0m, this.A0n, true);
    }

    public static /* synthetic */ float A03(C46145F c46145f, float f) {
        float f2 = c46145f.A01 + f;
        c46145f.A01 = f2;
        return f2;
    }

    public static /* synthetic */ int A05(C46145F c46145f) {
        int i = c46145f.A02;
        c46145f.A02 = i + 1;
        return i;
    }

    public static /* synthetic */ int A07(C46145F c46145f) {
        int i = c46145f.A07;
        c46145f.A07 = i + 1;
        return i;
    }

    private void A0M() {
        AbstractC6374YB.A0J(this.A0B);
        this.A0B = new LinearLayout(this.A0W);
        AbstractC6374YB.A0U(this.A0B, this.A0W);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0N() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0x, A0x, A0x, A0x);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0w);
        layoutParams.addRule(12);
        addView(this.A0k, layoutParams);
    }

    private void A0O() {
        this.A0j.setPadding(A0u, A0u, A0u, A0u);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0v, A0v);
        layoutParams.setMargins(0, AbstractC6400Yb.A00, A0t, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P() {
        if (super.A06.A1e() && this.A0L) {
            this.A0L = false;
            A0h(A0L(24, 18, 58));
        }
    }

    private void A0Q() {
        if (super.A06.A1e() && this.A0L) {
            this.A0L = false;
            Map<String, String> mapA05 = new C6558b9().A03(null).A02(null).A05();
            mapA05.put(A0L(0, 12, 87), A0L(24, 18, 58));
            super.A08.AB6(super.A06.A2E(), mapA05);
        }
    }

    private void A0R() {
        postDelayed(new C5379Hv(this), C6171Up.A0P(this.A0W));
    }

    private void A0S() {
        AbstractC6374YB.A0J(this.A0A);
        this.A0A = new LinearLayout(this.A0W);
        this.A0A.setOrientation(1);
        AbstractC6374YB.A0K(this.A0A);
        A0V();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0T() {
        View view = this.A0b;
        if (super.A06.A1e()) {
            view.setOnClickListener(new ViewOnClickListenerC6708dZ(this));
        }
        AbstractC6374YB.A0J(view);
        AbstractC6374YB.A0K(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        this.A0C = new TextView(this.A0W);
        View mMediaView = this.A0C;
        AbstractC6374YB.A0K(mMediaView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A06(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(A0r, A0r / 2, A0r, A0w);
        View mMediaView2 = this.A0C;
        addView(mMediaView2, layoutParams);
        View mMediaView3 = this.A0C;
        AbstractC6374YB.A0K(mMediaView3);
        this.A0H = new C6650cd(this.A0W, null, super.A06, super.A08, super.A0B, super.A0D, super.A0A, getColors(), new C5388I4(this));
        View mMediaView4 = this.A0H;
        AbstractC6374YB.A0G(1001, mMediaView4);
        View mMediaView5 = this.A0H;
        addView(mMediaView5);
        A0W();
        A0M();
        if (C6171Up.A17(this.A0W)) {
            this.A0B.setOnClickListener(new ViewOnClickListenerC6700dR(this));
            View mMediaView6 = this.A0Y;
            if (mMediaView6 != null) {
                this.A0Y.setCTAClickListener(new ViewOnClickListenerC6701dS(this));
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C45043S c45043s = new C45043S(this.A0W);
            this.A0b.A0f(c45043s);
            c45043s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new C44893B(this.A0W));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0A;
        String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0p[1] = "4k5LHuHIhnjzZvLx7p7MkTP5YYpiYy7M";
        linearLayout.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0Y(C5719NR c5719nr) {
        double dA00 = AbstractC6605bu.A00(c5719nr);
        String strA0F = c5719nr.A0I().A0F();
        if (strA0F == null || strA0F.trim().length() == 0) {
            AbstractC6374YB.A0O(this.A0B, 8);
            if (C6171Up.A17(this.A0W)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(strA0F);
            if (C6171Up.A17(this.A0W)) {
                this.A0B.setClickable(true);
            }
        }
        if (dA00 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.A03 = (int) (((double) this.A06) / dA00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(C45474A c45474a) {
        if (this.A0b.getState() == EnumC6844fm.A02 && C6171Up.A1e(this.A0W)) {
            postDelayed(new C5377Ht(this, c45474a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(String str) {
        C5634M3 c5634m3;
        AbstractC6374YB.A0J(this.A0G);
        C5385I1 c5385i1 = new C5385I1(this);
        if (this.A0W.A0E() == null) {
            this.A0W.A0F().A9v();
        }
        boolean zA02 = AbstractC6172Uq.A02(this.A0W);
        if (A0p[6].charAt(12) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A0p;
        strArr[4] = "Q7cFr2gPd7sCHl";
        strArr[5] = "KP59UR8sut1qsy";
        if (zA02 || this.A0W.A0E() == null) {
            c5634m3 = new C5634M3(this.A0W, c5385i1);
        } else {
            c5634m3 = new C5634M3(this.A0W, this.A0W.A0E(), c5385i1);
        }
        this.A0G = c5634m3;
        this.A0G.setOnTouchListener(new ViewOnTouchListenerC6702dT(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0h(String str) {
        Map<String, String> mapA05 = new C6558b9().A03(null).A02(null).A05();
        mapA05.put(A0L(0, 12, 87), str);
        this.A0X.A04(EnumC6199VH.A0J, mapA05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), mapA05);
        if (C6171Up.A2U(this.A0W)) {
            HashMap map = new HashMap();
            map.put(AbstractC7116kH.A04, Boolean.TRUE.toString());
            map.put(AbstractC7116kH.A05, Boolean.TRUE.toString());
            map.put(AbstractC7116kH.A06, Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O()) {
                boolean z = this.A0M;
                if (A0p[1].charAt(27) != 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0p;
                strArr[4] = "wgFga5xemtqUSQ";
                strArr[5] = "c72BHAWejdxIIo";
                if (z) {
                    return;
                }
            }
            this.A0M = true;
            A0h(str);
            return;
        }
        boolean zA1d = super.A06.A1d();
        if (A0p[1].charAt(27) == 'i') {
            String[] strArr2 = A0p;
            strArr2[4] = "tZ3pnOdiXKjC0M";
            strArr2[5] = "WpWfv8IGy682Ke";
            if (!zA1d) {
                return;
            }
        } else if (!zA1d) {
            return;
        }
        A0P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0j(boolean z) {
        if (!z && this.A0m && !this.A0R) {
            return;
        }
        this.A0K = z;
        ObjectAnimator objectAnimatorOfFloat = null;
        if (!z) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        String strA0L = A0L(48, 1, 127);
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.A0H, strA0L, this.A0H.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float y = this.A0A.getY();
        int i = this.A05;
        if (z) {
            i /= 5;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, strA0L, y, i);
        objectAnimatorOfFloat2.setDuration(500L);
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(this.A0b, strA0L, this.A0b.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int height = this.A0b.getHeight();
        int i2 = this.A05;
        if (z) {
            i2 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i2).setDuration(500L);
        duration.addUpdateListener(new C6704dV(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, browserTransAnim, duration);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(500L);
            animatorSet.playTogether(objectAnimatorOfFloat);
        }
        animatorSet.addListener(new C6705dW(this, z));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z);
        }
        animatorSet.start();
    }

    private void A0k(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        AbstractC6374YB.A0J(this.A0b);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0S();
        }
        this.A0b.setTranslationY(0.0f);
        addView(this.A0b, 1, layoutParams);
        A0M();
        A0W();
    }

    private void A0l(boolean z, int i) {
        this.A0W.A0F().ACG(!z, i);
        if (this.A0E == null) {
            return;
        }
        this.A0E.setCloseButtonVisibility(z ? 0 : 4);
    }

    private final boolean A0m() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final EnumC5683Mq A1D(String str) {
        if (!A0m()) {
            EnumC5683Mq enumC5683MqA02 = this.A0H.A02(str);
            String[] strArr = A0p;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A0p[1] = "gDqV8VnRL5n4dziTmRcIoSoDocYisV3G";
            return enumC5683MqA02;
        }
        return EnumC5683Mq.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1E() {
        A0Q();
        if (C6171Up.A1z(this.A0W)) {
            this.A0W.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            C5193Eu c5193Eu = this.A0a;
            if (A0p[6].charAt(12) != 'v') {
                throw new RuntimeException();
            }
            A0p[6] = "qZF2LURQ0N2avpQsVigAjVMCIAfnIk4T";
            c5193Eu.A07();
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
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1H() {
        C5183Ek c5183Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c5183Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(EnumC6789et.A02, 20);
        int iA02 = super.A06.A29().A0H().A02();
        if (iA02 != 0) {
            int secondsForNextCta2 = this.A0U;
            if (iA02 < secondsForNextCta2) {
                if (iA02 <= 0) {
                    return;
                }
                this.A0Y.setProgressSpinnerInvisible(true);
                new C6325XO(iA02, new C5381Hx(this)).A07();
                return;
            }
        }
        this.A0Y.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1I(boolean z) {
        this.A0R = z;
        A0l(z, 4);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1J(boolean z) {
        if (this.A0b.A0n()) {
            return;
        }
        this.A0I = this.A0b.getVideoStartReason();
        this.A0S = z;
        this.A0b.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1K(boolean z) {
        if (this.A0b.getState() != EnumC6844fm.A06) {
            EnumC6789et enumC6789et = this.A0I;
            String[] strArr = A0p;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[4] = "XPxqC5lbhdZAQT";
            strArr2[5] = "OGUEg1S7IFb9ga";
            if (enumC6789et != null) {
                if (!this.A0S || z) {
                    this.A0b.A0e(this.A0I, 19);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1L() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1N() {
        return true;
    }

    public final boolean A1O() {
        return !A0m();
    }

    public C5728Na getColors() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public C6719dk getFullScreenAdStyle() {
        return new C6719dk(true, C6719dk.A06, super.A06.A28().A01(), ViewOnClickListenerC5560Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public C6365Y2 getTouchDataRecorder() {
        return super.A0A;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0k(A0m());
        setupLayoutConfiguration(A0m());
        A0V();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
        } else {
            A1J(false);
        }
    }

    private void setUpBrowserControls(C5634M3 c5634m3) {
        AbstractC6374YB.A0J(this.A0E);
        this.A0E = new C5637M6(this.A0W, c5634m3, true, this.A0n);
        if (this.A0m) {
            A0l(this.A0R, 1);
        }
        c5634m3.setBrowserNavigationListener(this.A0E.getBrowserNavigationListener());
        AbstractC6374YB.A0K(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new C5382Hy(this));
        this.A0E.setOnTouchListener(new ViewOnTouchListenerC6703dU(this));
        this.A0A.addView(this.A0E, layoutParams);
        AbstractC6374YB.A0J(this.A0F);
        this.A0F = new C6530ah(this.A0W, null, R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0q));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0W.getSystemService(A0L(42, 6, 42));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
