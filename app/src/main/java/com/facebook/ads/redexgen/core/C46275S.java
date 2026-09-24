package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.ironsource.InterfaceC11381C9;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5S */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C46275S extends AbstractC5428Ij {
    public static byte[] A0e;
    public static String[] A0f = {"uwiFFMiPjkxeIpnCelDmRbiHk5Vwnfgt", "wLfFuslsjBH4uPGwj2Xycf6hIgRvR8Oe", "HvNwre", "LU1P5nNd", "IrSP0rhp", "3tH6XBAURu1AudBFEixfPGQY1Q", "mKjuxDaulnRYw", "yhw0zrPGEZfB7fyQoDKXN69L0o"};
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public float A00;
    public C5728Na A01;
    public C6325XO A02;
    public C6630cJ A03;
    public C6763eS A04;
    public EnumC6789et A05;
    public C5102DR A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Handler A0I;
    public final View A0J;
    public final C6902gi A0K;
    public final C6200VI A0L;
    public final AbstractC6400Yb A0M;
    public final AbstractC6564bF A0N;
    public final ViewOnClickListenerC5560Kr A0O;
    public final InterfaceC6721dm A0P;
    public final C6757eM A0Q;
    public final C5193Eu A0R;
    public final C5183Ek A0S;
    public final C45584L A0T;
    public final AbstractC5147EA A0U;
    public final AbstractC5145E8 A0V;
    public final AbstractC5141E4 A0W;
    public final AbstractC5139E2 A0X;
    public final AbstractC5137E0 A0Y;
    public final AbstractC5136Dz A0Z;
    public final C5123Dm A0a;
    public final C5110DZ A0b;
    public final boolean A0c;
    public final boolean A0d;

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0J() {
        A0e = new byte[]{82, 94, 92, Ascii.f22502US, 87, 80, 82, 84, 83, 94, 94, 90, Ascii.f22502US, 80, 85, 66, Ascii.f22502US, 88, 95, 69, 84, 67, 66, 69, 88, 69, 88, 80, 93, Ascii.f22502US, 82, 93, 88, 82, 90, 84, 85, 54, 33, 51, 37, 54, 32, 33, 32, Ascii.ESC, 50, 45, 32, 33, 43, 105, 118, 123, 122, 112};
    }

    static {
        A0J();
        A0k = (int) (AbstractC6334XX.A02 * 48.0f);
        A0i = AbstractC5819P3.A02(-1, 77);
        A0p = (int) (AbstractC6334XX.A02 * 26.0f);
        A0q = (int) (AbstractC6334XX.A02 * 12.0f);
        A0m = (int) (AbstractC6334XX.A02 * 12.0f);
        A0n = (int) (AbstractC6334XX.A02 * 44.0f);
        A0l = AbstractC6332XV.A0v;
        A0o = (int) (AbstractC6334XX.A02 * 16.0f);
        A0j = AbstractC5819P3.A02(A0i, 90);
        A0h = (int) (AbstractC6334XX.A02 * 4.0f);
        A0g = (int) (AbstractC6334XX.A03 * 32.0f);
    }

    public C46275S(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, AbstractC7077jd abstractC7077jd, C6056Sx c6056Sx, InterfaceC6455ZU interfaceC6455ZU, int i, InterfaceC6406Yh interfaceC6406Yh, C6200VI c6200vi, AbstractC6400Yb abstractC6400Yb, int i2, int customVideoDurationMs, int i3, boolean z, int i4, boolean z2, boolean z3, boolean z4, InterfaceC6721dm interfaceC6721dm, int i5, int i6) {
        C5728Na c5728NaA00;
        super(c6902gi, interfaceC6455ZU, interfaceC6192VA, abstractC7077jd, i, z3, z4, interfaceC6406Yh, i6);
        this.A0I = new Handler(Looper.getMainLooper());
        this.A00 = 0.0f;
        this.A07 = false;
        this.A08 = false;
        this.A0C = false;
        this.A09 = false;
        this.A0A = false;
        this.A0Y = new AbstractC5137E0() { // from class: com.facebook.ads.redexgen.X.5g
            public static String[] A01 = {"7gUYNYKFrrI6cUcpcHgvAqL4Gs6ZbmaO", "eulXJJXioKb3UmnXwerKdv", "DeECHluE8BU5loeJcqNW1HYG1mHcuBH8", "x81kE4wfDh8vlLxHq80CctXU2mbMn00Z", "zBHmazzeC9pHgiKU9uedQ6l4AdxQz", "WRgOWCAEbqLirqS5ZGHJuFqEkTHfhP5W", "572CNMLKJv9WD0LgrUqd1zfS4LkJfaLe", "B1saI0DOHUkU6pw"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5138E1 c5138e1) {
                this.A00.A0C = true;
                if (this.A00.getAdDataBundle().A1c()) {
                    this.A00.A0K.A0F().AKh(AbstractC6322XL.A00((float) ((AbstractC5428Ij) this.A00).A06.A0k()), this.A00.getResources().getConfiguration().orientation, true, true, AbstractC5686Mt.A0C(C5687Mu.A00(this.A00.A0K, ((AbstractC5428Ij) this.A00).A08, "", AbstractC6312XB.A00(((AbstractC5428Ij) this.A00).A06.A29().A0J().A05()), new HashMap(), ((AbstractC5428Ij) this.A00).A06.A2A())));
                    this.A00.A0L(this.A00.getResources().getConfiguration().orientation);
                    this.A00.A0N.setVisibility(0);
                    if (this.A00.A0N instanceof AbstractC5589LK) {
                        ((AbstractC5589LK) this.A00.A0N).A0u(this.A00.getResources().getConfiguration().orientation);
                    }
                }
                if (this.A00.getAdDataBundle().A1e()) {
                    C46275S c46275s = this.A00;
                    if (A01[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[2] = "UfF1b519MGYLAJGTcPK3SRNJ7v4WOh3N";
                    strArr[0] = "9iqifXeSGzjDh5N7cdDazqMOJ7agOy96";
                    c46275s.A0b.setOnClickListener(this.A00.A0O);
                }
            }
        };
        this.A0X = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.5c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                if (!((AbstractC5428Ij) this.A00).A0A.A07()) {
                    this.A00.A1F();
                }
            }
        };
        this.A0W = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.5a
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            public final /* bridge */ /* synthetic */ void A03(C6141UL c6141ul) {
            }
        };
        this.A0Z = new AbstractC5136Dz() { // from class: com.facebook.ads.redexgen.X.5Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45474A c45474a) {
                this.A00.A0R(c45474a);
                this.A00.A0P.ADw((this.A00.A00 * this.A00.A0S.getDuration()) + c45474a.A00());
            }
        };
        this.A0U = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.5U
            public static String[] A01 = {"wKs2F0CoKZ83CrYftessGgwUooVDkZ8i", "2Ibb583RxwN39nWjhOn5WWPQj1VmynHE", "A0Qs557f", "DKPVxx7rRSfdfe4bDqdhQ5dEhLiH9LON", "bebhf1UP90kEJwgsUj64UnMMPskca", "Y97MwE7h44FvVbPafIuJT7XHPF7ToAyu", "yGLwGxqGR6Hkk5b2IyfusTMojDv2e", "vJPYkkaf"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                this.A00.A0P.ADc(this.A00.A0S.getDuration());
                if (this.A00.A00 < ((AbstractC5428Ij) this.A00).A06.A29().A0G()) {
                    C46275S.A01(this.A00, 1.0f);
                    this.A00.A0S.A0e(EnumC6789et.A02, 28);
                    return;
                }
                C46275S c46275s = this.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "gUju5w26hU6oOlSn7mf4ATVXJhH4p8zJ";
                strArr2[1] = "33WeYKtkMTovDIRRTCZ4bD6vTYI44Qru";
                if (!c46275s.A1L()) {
                    this.A00.A0P.ADA();
                } else {
                    this.A00.A1G();
                }
            }
        };
        this.A0V = new C46285T(this);
        this.A0K = c6902gi;
        this.A0L = c6200vi;
        this.A0M = abstractC6400Yb;
        this.A0H = i5;
        int i7 = -1;
        if (!super.A06.A1c()) {
            this.A0J = new C5116Df(this.A0K, c6200vi);
        } else {
            i7 = i5;
            this.A0J = new C5114Dd(this.A0K, c6200vi);
        }
        this.A0b = new C5110DZ(this.A0K, i7);
        if (this.A00 < abstractC7077jd.A29().A0G()) {
            this.A0b.setShouldClearAnimationWhenVideoCompleted(false);
        }
        this.A0F = i4;
        this.A0d = z2;
        this.A0E = i2;
        this.A0G = customVideoDurationMs;
        this.A0P = interfaceC6721dm;
        this.A0D = i3;
        this.A0c = z;
        this.A0Q = new C6757eM(this.A0K, interfaceC6192VA, super.A06);
        if (customVideoDurationMs == 1) {
            c5728NaA00 = super.A06.A28().A01();
        } else {
            c5728NaA00 = super.A06.A28().A00();
        }
        this.A01 = c5728NaA00;
        this.A0S = new C5183Ek(this.A0K);
        this.A0S.getEventBus().A03(this.A0Y, this.A0X, this.A0W, this.A0Z, this.A0U, this.A0V);
        this.A0T = new C45584L(c6902gi, interfaceC6192VA, this.A0S, abstractC7077jd.A2E(), 0, 0, abstractC7077jd.A29().A0U(), null, null);
        A0I();
        this.A0S.setVideoURI(c6056Sx.A0T(super.A06.A29().A0H().A09()));
        A0H();
        C6328XR c6328xrA02 = super.A09.A02(abstractC7077jd);
        this.A0K.A0H().A00(c6328xrA02.A01);
        this.A0N = A06();
        if (this.A0N instanceof C5546Kd) {
            new C5085DA(this.A0N, 400, 100, 0).A4A(true, false);
        } else {
            this.A0N.setVisibility(8);
        }
        this.A0a = new C5123Dm(true, abstractC7077jd.A29().A0U());
        A0K();
        this.A0O = this.A0N.getCTAButton();
        if (c6328xrA02.A00) {
            this.A0S.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.dN
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1O(view);
                }
            });
        }
        AbstractC6374YB.A0G(1001, this.A0O);
        A0G();
        if (!getAdDataBundle().A1c()) {
            A0F();
        }
        this.A0N.bringToFront();
        if (C6171Up.A1z(this.A0K)) {
            this.A0K.A0B().AKn(this.A0S, super.A06.A2E(), true);
        }
        if (C6171Up.A20(this.A0K)) {
            this.A0R = new C5193Eu(this.A0K, interfaceC6192VA, this.A0S, super.A06.A2E(), abstractC7077jd.A29().A0U(), this.A0T, null);
        } else {
            this.A0R = null;
        }
    }

    public static /* synthetic */ float A01(C46275S c46275s, float f) {
        float f2 = c46275s.A00 + f;
        c46275s.A00 = f2;
        return f2;
    }

    private AbstractC6564bF A06() {
        String strA0C;
        AbstractC6564bF c5546Kd;
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -2);
        adDetailsParams.addRule(12);
        if (super.A06.A10().equals(A0C(37, 14, 3))) {
            strA0C = EnumC6795ez.A04.A03();
        } else {
            strA0C = A0C(0, 37, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        }
        double dA0k = super.A06.A0k();
        if (!getAdDataBundle().A1c()) {
            C6902gi c6902gi = this.A0K;
            int i = A0k;
            boolean z = super.A06.A29().A0I().A00() == EnumC5724NW.A05;
            C5728Na colors = getColors();
            boolean zA06 = super.A06.A29().A0J().A06();
            InterfaceC6192VA interfaceC6192VA = super.A08;
            InterfaceC6406Yh interfaceC6406Yh = super.A0B;
            C6847fp c6847fp = super.A0D;
            C6365Y2 c6365y2 = super.A0A;
            AbstractC7077jd abstractC7077jd = super.A06;
            if (A0f[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[5] = "xymrPLzTH8UHDAaiBZe05WSUA2";
            strArr[7] = "XCaDYNVy2gwp6c65cWzWipC7tC";
            c5546Kd = new C5546Kd(c6902gi, null, i, z, colors, zA06, strA0C, interfaceC6192VA, interfaceC6406Yh, c6847fp, c6365y2, abstractC7077jd);
        } else {
            c5546Kd = new C6603bs((float) dA0k, strA0C, this.A0K, getColors(), super.A06, super.A0B, this.A0O, AbstractC5428Ij.A0G, false, super.A08, super.A0D, super.A0A, this.A0b, this.A0L, false).A03();
            ((AbstractC5589LK) c5546Kd).setChainedAdInfo(super.A00);
        }
        c5546Kd.getCTAButton().getCtaActionHelper().A08(super.A06);
        c5546Kd.getCTAButton().setCreativeAsCtaLoggingHelper(super.A09);
        AbstractC6374YB.A0G(1008, c5546Kd);
        c5546Kd.A0l(this.A0G);
        addView(c5546Kd, adDetailsParams);
        c5546Kd.setInfo(super.A06.A29().A0I(), super.A06.A29().A0J(), super.A06.A2E(), super.A06.A2C().A01(), null, null);
        return c5546Kd;
    }

    private void A0D() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A04 != null) {
            C6763eS c6763eS = this.A04;
            if (A0f[6].length() != 13) {
                throw new RuntimeException();
            }
            A0f[0] = "pczVUfQTZlSxQoKEEMr5D2oLadoOsoUQ";
            c6763eS.A0f(false);
            addView(this.A04.A0W(), layoutParams);
        }
    }

    private void A0E() {
        if (getAdDataBundle().A29().A0K().A03() && !getAdDataBundle().A29().A0K().A02().isEmpty()) {
            AbstractC6374YB.A0d(this.A0N, this.A0J, this.A0O);
            this.A04 = new C6763eS(this.A0K, getAdDataBundle(), super.A0B, this.A0O, this.A0I, this.A0L);
            A0D();
        } else {
            if (getAdDataBundle().A29().A0K().A04() || getAdDataBundle().A29().A0K().A03()) {
                AbstractC6374YB.A0d(this.A0N, this.A0J, this.A0O);
                this.A03 = new C6630cJ(this.A0K, super.A06, this.A0L, this.A0I, super.A0B);
                this.A03.A0I(false);
                addView(this.A03.A0C(this.A0O));
                return;
            }
            Pair<EnumC6756eL, View> pairA03 = this.A0Q.A03(this.A0O);
            View endCardView = (View) pairA03.second;
            AbstractC6374YB.A0G(1101, endCardView);
            A0Q((EnumC6756eL) pairA03.first, endCardView);
        }
    }

    private void A0F() {
        this.A0b.A08(-1, A0i, false);
        this.A0b.setPadding(A0q, A0q, A0q, A0q);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0p);
        layoutParams.addRule(12);
        addView(this.A0b, layoutParams);
    }

    private void A0G() {
        RelativeLayout.LayoutParams layoutParams;
        if (!super.A06.A1c()) {
            this.A0J.setPadding(A0m, A0m, A0m, A0m);
            layoutParams = new RelativeLayout.LayoutParams(A0n, A0n);
            layoutParams.setMargins(0, AbstractC6400Yb.A00, A0l, 0);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(A0g, A0g);
            layoutParams.setMargins(AbstractC6332XV.A0b, AbstractC6332XV.A0r, AbstractC6332XV.A0b, AbstractC6332XV.A0Z);
            layoutParams.addRule(9);
        }
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0S, videoViewParams);
        addView(this.A0J, layoutParams);
    }

    private void A0H() {
        postDelayed(new C5405IL(this), C6171Up.A0P(this.A0K));
    }

    private void A0I() {
        this.A0S.A0f(this.A0b);
        if (this.A0J instanceof InterfaceC6790eu) {
            this.A0S.A0f((InterfaceC6790eu) this.A0J);
        }
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C45043S c45043s = new C45043S(this.A0K);
            this.A0S.A0f(c45043s);
            c45043s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0S.A0f(new C44893B(this.A0K));
    }

    private final void A0K() {
        View expandableLayout = this.A0N.getExpandableLayout();
        if (expandableLayout != null) {
            if (this.A06 != null) {
                C5123Dm c5123Dm = this.A0a;
                C5102DR c5102dr = this.A06;
                String[] strArr = A0f;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0f[1] = "yPUFQNIw4jpGFPLG5nXj9YsdQuCVJrWl";
                c5123Dm.A0L(c5102dr);
            }
            C5728Na c5728NaA01 = super.A06.A28().A01();
            this.A0a.A0L(new C5086DB(this.A0N.getCTAButton(), 300, -1, c5728NaA01.A0A(true)));
            Drawable drawableA08 = AbstractC6374YB.A08(A0i, A0j, A0h);
            Drawable endDrawable = AbstractC6374YB.A05(c5728NaA01.A09(true), A0h);
            this.A0a.A0L(new C5103DS(this.A0N.getCTAButton(), 300, drawableA08, endDrawable));
            this.A0a.A0L(new C5101DQ(expandableLayout, 150, false));
            this.A0a.AAv(this.A0S);
            this.A0a.A0K(InterfaceC11381C9.b.f24160g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i) {
        if (!getAdDataBundle().A1c()) {
            return;
        }
        this.A0K.A0F().AKj(i);
        this.A0S.A0Z(i);
        A0M(i, this.A0S, (RelativeLayout) this.A0S.getVideoView());
    }

    private final void A0M(int i, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (this.A0N instanceof AbstractC5589LK) {
            boolean z = this.A0N instanceof C46926V;
            if (A0f[0].charAt(8) == 'J') {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[5] = "oeSYnKfd6qg69aJdYBhoeO0UNx";
            strArr[7] = "WvPjUISg3i5kB9lwMl0NPsGMqU";
            if (z || (this.A0N instanceof C46916U)) {
                AbstractC6374YB.A0J(this.A0N);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    this.A0N.setLayoutParams(layoutParams);
                    viewGroup.addView(this.A0N);
                } else {
                    addView(this.A0N, layoutParams);
                }
            }
            this.A0N.A0l(i);
            ((AbstractC5589LK) this.A0N).A0y(viewGroup, relativeLayout, i);
        }
    }

    private void A0Q(EnumC6756eL enumC6756eL, View view) {
        this.A0S.A0h(false);
        this.A0S.setVisibility(8);
        switch (C6698dP.A00[enumC6756eL.ordinal()]) {
            case 1:
                this.A0N.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, AbstractC6400Yb.A00, 0, 0);
                layoutParams.addRule(2, this.A0N.getId());
                addView(view, layoutParams);
                break;
            case 2:
                AbstractC6374YB.A0d(this.A0N);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(A0o, A0o, A0o, A0o);
                addView(view, layoutParams2);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(C45474A c45474a) {
        if (this.A0S.getState() == EnumC6844fm.A02 && C6171Up.A1e(this.A0K)) {
            postDelayed(new C5391I7(this, c45474a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(String str) {
        if (!this.A0A) {
            this.A0A = true;
            this.A0P.AGQ(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final EnumC5683Mq A1D(String str) {
        return this.A0O.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1E() {
        super.A1E();
        this.A0N.A0j();
        if (this.A02 != null) {
            C6325XO c6325xo = this.A02;
            String[] strArr = A0f;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[4] = "vVds5dTr";
            strArr2[3] = "mwltsewL";
            c6325xo.A06();
        }
        this.A0I.removeCallbacksAndMessages(null);
        if (this.A04 != null) {
            this.A04.A0Y();
        }
        if (this.A03 != null) {
            this.A03.A0F();
        }
        if (C6171Up.A1z(this.A0K)) {
            this.A0K.A0B().AKU(this.A0S);
        }
        if (this.A0R != null) {
            this.A0R.A07();
        }
        if (this.A0S != null) {
            this.A0S.getEventBus().A04(this.A0Y, this.A0X, this.A0W, this.A0Z, this.A0U, this.A0V);
            AbstractC6374YB.A0H(this.A0S);
            this.A0S.A0W();
        }
        this.A0T.A0p();
        AbstractC6374YB.A0d(this.A0S, this.A0b, this.A0J);
        super.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1G() {
        this.A0K.A0F().A4x();
        this.A07 = true;
        AbstractC6374YB.A0W(this);
        AbstractC6374YB.A0H(this.A0S);
        AbstractC6374YB.A0d(this.A0S, this.A0b, this.A0J);
        A0E();
        if (this.A0D != 0 || !this.A0c) {
            this.A0P.AFw(true);
            if (this.A0M != null && getAdDataBundle().A29().A0K().A00() > 0) {
                this.A08 = false;
                if (getAdDataBundle().A2P()) {
                    this.A0M.setToolbarActionMode(8);
                } else {
                    this.A0M.setToolbarActionMode(2);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6697dO(this), getAdDataBundle().A29().A0K().A00());
                return;
            }
            this.A08 = true;
            return;
        }
        if (this.A0d) {
            this.A0P.AKc();
        }
        if (this.A0M != null) {
            this.A0M.setToolbarActionMode(getAdDataBundle().A2P() ? 8 : 2);
        }
        this.A02 = new C6325XO(this.A0F, 100.0f, 100L, new Handler(Looper.getMainLooper()), new C5413IU(this));
        this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1H() {
        C5183Ek c5183Ek = this.A0S;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c5183Ek.setVolume(secondsForNextCta);
        this.A0S.A0e(EnumC6789et.A02, 20);
        int iA02 = super.A06.A29().A0H().A02();
        if (iA02 >= 0) {
            this.A0M.setProgressSpinnerInvisible(true);
        }
        if (iA02 != 0) {
            int secondsForNextCta2 = this.A0H;
            if (iA02 < secondsForNextCta2) {
                if (iA02 > 0) {
                    new C6325XO(iA02, new C5412IT(this)).A07();
                    return;
                }
                return;
            }
        }
        AbstractC6400Yb abstractC6400Yb = this.A0M;
        if (A0f[6].length() != 13) {
            throw new RuntimeException();
        }
        A0f[6] = "z6ph3MLFkPTln";
        abstractC6400Yb.setToolbarActionMode(8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1J(boolean z) {
        if (!this.A09) {
            this.A0N.A0m(z);
        }
        if (this.A04 != null && !this.A09) {
            this.A04.A0e(z);
        }
        if (this.A03 != null) {
            boolean z2 = this.A09;
            if (A0f[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A0f[1] = "b5uF0JnyggmSeY84XgIRQgfLbHOcd54k";
            if (!z2) {
                this.A03.A0H(z);
            }
        }
        this.A09 = false;
        if (this.A02 != null) {
            this.A02.A06();
        }
        if (this.A0S.A0n()) {
            return;
        }
        this.A05 = this.A0S.getVideoStartReason();
        this.A0B = z;
        this.A0S.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final void A1K(boolean z) {
        if (this.A02 != null && !this.A02.A05()) {
            this.A02.A07();
        }
        if (this.A07 || this.A0S.getState() == EnumC6844fm.A06 || this.A05 == null) {
            return;
        }
        if (!this.A0B || z) {
            this.A0S.A0e(this.A05, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1L() {
        return (this.A0D == 2 || !super.A06.A29().A0V() || this.A07) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1M() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5428Ij
    public final boolean A1N() {
        return this.A08;
    }

    public final /* synthetic */ void A1O(View view) {
        this.A0O.A0E(A0C(51, 5, 88));
    }

    public C5728Na getColors() {
        return this.A01;
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
        C5728Na c5728NaA00;
        super.onConfigurationChanged(configuration);
        if (!this.A07) {
            if (getAdDataBundle().A1c()) {
                A0L(configuration.orientation);
                return;
            }
            if (configuration.orientation == 1) {
                C5715NN c5715nnA28 = super.A06.A28();
                String[] strArr = A0f;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A0f[1] = "ZWQFADQdeKHmDIXasxpY6pydlWSUwrFV";
                c5728NaA00 = c5715nnA28.A01();
            } else {
                c5728NaA00 = super.A06.A28().A00();
            }
            this.A01 = c5728NaA00;
            this.A0O.setViewShowsOverMedia(true);
            this.A0O.setUpButtonColors(this.A01);
            this.A0N.A0l(configuration.orientation);
            return;
        }
        if (this.A04 == null) {
            return;
        }
        this.A04.A0a(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View expandableLayout;
        super.onLayout(z, i, i2, i3, i4);
        if (!getAdDataBundle().A1c() && (expandableLayout = this.A0N.getExpandableLayout()) != null && z && this.A06 == null) {
            this.A06 = new C5102DR(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A0a.A0L(this.A06);
            this.A0a.A0J();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A1K(false);
        } else {
            this.A09 = true;
            A1J(false);
        }
    }
}
