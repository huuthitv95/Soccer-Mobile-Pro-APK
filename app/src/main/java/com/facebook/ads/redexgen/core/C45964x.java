package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4x */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C45964x extends AbstractC5305Gj {
    public static byte[] A07;
    public static String[] A08 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC6614c3 A00;
    public C5110DZ A01;
    public final ImageView A02;
    public final InterfaceC5982Rk A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-17, -25, -27, -20};
    }

    static {
        A07();
    }

    public C45964x(C6902gi c6902gi, InterfaceC6455ZU interfaceC6455ZU, InterfaceC6192VA interfaceC6192VA, AbstractC7077jd abstractC7077jd, C6056Sx c6056Sx, InterfaceC6406Yh interfaceC6406Yh) {
        super(c6902gi, interfaceC6455ZU, interfaceC6192VA, abstractC7077jd, c6056Sx, interfaceC6406Yh);
        this.A03 = new C5298Gc(this);
        this.A05 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
        this.A06 = new AtomicBoolean(false);
        this.A02 = new ImageView(getContext());
        if (abstractC7077jd.A29().A0H().A04() > 0) {
            this.A01 = new C5110DZ(c6902gi, abstractC7077jd.A29().A0H().A04() * 1000);
        }
        this.A02.setScaleType(ImageView.ScaleType.CENTER);
        this.A02.setAdjustViewBounds(true);
        new AsyncTaskC5591LM(this.A02, super.A05).A05(super.A03.A29().A0H().A00(), super.A03.A29().A0H().A01()).A06(new C5297Gb(this)).A07(super.A03.A29().A0H().A08());
    }

    private AbstractC6614c3 A01(int i) {
        if (this.A02.getParent() != null) {
            AbstractC6374YB.A0J(this.A02);
        }
        C6617c6 c6617c6A0M = new C6617c6(super.A05, super.A06, this.A0A, super.A03, this.A02, this.A0C, this.A08).A0J(this.A09.getToolbarHeight()).A0P(this.A09).A0I(i).A0M(this.A07);
        if (this.A01 != null) {
            c6617c6A0M.A0R(this.A01);
        }
        c6617c6A0M.A0L(C5687Mu.A00(super.A05, super.A06, A03(0, 0, 52), AbstractC6312XB.A00(super.A03.A29().A0J().A05()), new HashMap(), super.A03.A2A()));
        C6618c7 params = c6617c6A0M.A0U();
        return AbstractC6615c4.A00(params, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A05.get() && this.A04.get()) {
            A0e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    private void A08(int i) {
        boolean z;
        AbstractC6374YB.A0J(this.A00);
        this.A00 = A01(i);
        this.A00.setAccidentalClickCappingListener(new InterfaceC5684Mr() { // from class: com.facebook.ads.redexgen.X.Gd
            @Override // com.facebook.ads.redexgen.core.InterfaceC5684Mr
            public final void ACk() {
                this.A00.A0n();
            }
        });
        C5728Na colors = this.A00.getColors();
        Integer backgroundColorForToolbar = getBackgroundColorForToolbar();
        boolean z2 = true;
        if (backgroundColorForToolbar == null) {
            if (this.A00 != null) {
                if (!this.A00.A1O()) {
                    AbstractC6614c3 abstractC6614c3 = this.A00;
                    if (A08[4].length() == 3) {
                        String[] strArr = A08;
                        strArr[2] = "fKHhGKaWmtnLqlWg01lC";
                        strArr[5] = "lG6mBbCbmu9ZuvMubYOS";
                        if (!(abstractC6614c3 instanceof AbstractC5543Ka)) {
                            z = false;
                        }
                        AbstractC6374YB.A0N(this, colors.A08(z));
                    }
                }
                z = true;
                AbstractC6374YB.A0N(this, colors.A08(z));
            } else {
                z = false;
                AbstractC6374YB.A0N(this, colors.A08(z));
            }
            throw new RuntimeException();
        }
        int iIntValue = backgroundColorForToolbar.intValue();
        String[] strArr2 = A08;
        if (strArr2[2].length() != strArr2[5].length()) {
            AbstractC6374YB.A0N(this, iIntValue);
        } else {
            A08[0] = "OBMiQo8I4Ts7yjqshk6bkpwsmCqa0sTm";
            AbstractC6374YB.A0N(this, iIntValue);
        }
        AbstractC6400Yb abstractC6400Yb = this.A09;
        String[] strArr3 = A08;
        if (strArr3[2].length() == strArr3[5].length()) {
            String[] strArr4 = A08;
            strArr4[2] = "a7i0pPPxGgijq0ih0stJ";
            strArr4[5] = "yYRdNfPwhLNXT50Mgldr";
            abstractC6400Yb.setFullscreen(this.A00.A1O());
            this.A09.A0D(colors, ViewOnClickListenerC5560Kr.A05(super.A03));
            A0j(this.A00);
            if (super.A01 != null) {
                addView(super.A01, 0, AbstractC5305Gj.A0H);
            }
            if (this.A00 == null || !this.A00.A1O()) {
                z2 = false;
            }
            setUpFullscreenMode(z2);
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5305Gj
    public final AbstractC6400Yb A0c() {
        AbstractC6400Yb abstractC6400YbA0c = super.A0c();
        if (super.A03.A2T()) {
            abstractC6400YbA0c.setOnClickListener(new ViewOnClickListenerC6722dn(this));
        }
        return abstractC6400YbA0c;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5305Gj
    public final void A0g() {
        if (this.A00 != null) {
            this.A07.A04(EnumC6199VH.A0Y, null);
            EnumC5683Mq enumC5683MqA1B = this.A00.A1B(A03(0, 4, 63));
            if (super.A03.A2N()) {
                return;
            }
            EnumC5683Mq actionOutcome = EnumC5683Mq.A09;
            if (enumC5683MqA1B != actionOutcome) {
                EnumC5683Mq actionOutcome2 = EnumC5683Mq.A06;
                if (enumC5683MqA1B != actionOutcome2) {
                    A0f();
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5305Gj
    public final void A0h() {
        AbstractC6374YB.A0L(this.A00);
        AbstractC6374YB.A0L(this.A09);
        this.A04.set(true);
        A06();
        int iA04 = super.A03.A29().A0H().A04();
        int secondsForNextCta = super.A03.A29().A0H().A02();
        if (iA04 > 0) {
            if (this.A00 != null) {
                this.A00.A1G();
            }
            A0i(iA04, new C5296Ga(this), this.A01);
            if (secondsForNextCta == 0 || secondsForNextCta >= iA04) {
                super.A02 = true;
                this.A09.setToolbarActionMode(8);
                return;
            } else {
                if (secondsForNextCta <= 0) {
                    return;
                }
                this.A09.setProgressSpinnerInvisible(true);
                A0i(secondsForNextCta, new C5295GZ(this), null);
                return;
            }
        }
        this.A06.set(true);
        AbstractC6400Yb abstractC6400Yb = this.A09;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC6400Yb.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5305Gj
    public final void A0k(C5976Re c5976Re) {
        FrameLayout.LayoutParams layoutParams;
        c5976Re.A0A(this.A03);
        int orientation = c5976Re.A05().getResources().getConfiguration().orientation;
        A08(orientation);
        if (A0m()) {
            AbstractC6374YB.A0J(this.A09);
        }
        if (A0m()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Rect requestedMargins = this.A09.getRequestedMargins();
            if (requestedMargins == null) {
                layoutParams.setMargins(0, AbstractC6332XV.A0r, 0, 0);
            } else {
                int i = requestedMargins.left;
                int i2 = requestedMargins.top;
                int i3 = requestedMargins.right;
                int i4 = requestedMargins.bottom;
                if (A08[4].length() != 3) {
                    throw new RuntimeException();
                }
                A08[0] = "j24x2xTHwZJixq019qlFmxSWfXtsmamW";
                layoutParams.setMargins(i, i2, i3, i4);
            }
        } else {
            int orientation2 = this.A09.getToolbarHeight();
            layoutParams = new FrameLayout.LayoutParams(-1, orientation2);
        }
        addView(this.A09, layoutParams);
        AbstractC6374YB.A0H(this.A00);
        AbstractC6374YB.A0H(this.A09);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5305Gj
    public final boolean A0l() {
        if (this.A00 == null) {
            return false;
        }
        AbstractC6614c3 abstractC6614c3 = this.A00;
        if (A08[4].length() != 3) {
            throw new RuntimeException();
        }
        A08[4] = "kMg";
        return abstractC6614c3.A1P(false);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5305Gj
    public final boolean A0m() {
        return super.A03.A1j() || super.A03.A1y();
    }

    public final /* synthetic */ void A0n() {
        A0f();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFA(boolean z) {
        if (this.A00 != null) {
            this.A00.A1L(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFi(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5305Gj, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A03.A29().A0T() && !A0m()) {
            A08(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5305Gj, com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void onDestroy() {
        if (C6171Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A02);
        }
        if (this.A00 != null) {
            AbstractC6614c3 abstractC6614c3 = this.A00;
            String[] strArr = A08;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A08[4] = "hIQ";
            abstractC6614c3.A1C();
        }
        super.onDestroy();
    }
}
