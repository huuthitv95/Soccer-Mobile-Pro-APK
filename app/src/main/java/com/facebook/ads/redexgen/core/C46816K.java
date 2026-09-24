package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6K */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C46816K extends AbstractC5543Ka {
    public static byte[] A09;
    public float A00;
    public C6763eS A01;
    public boolean A02;
    public final Handler A03;
    public final View A04;
    public final RelativeLayout A05;
    public final RelativeLayout A06;
    public final AbstractC6400Yb A07;
    public final InterfaceC6406Yh A08;

    static {
        A06();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{112, 116, 120, 126, 124};
    }

    public C46816K(C6618c7 c6618c7) {
        super(c6618c7, true);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A02 = false;
        this.A08 = c6618c7.A0C();
        this.A07 = c6618c7.A0B();
        this.A06 = new RelativeLayout(c6618c7.A06());
        this.A05 = new RelativeLayout(c6618c7.A06());
        AbstractC6374YB.A0K(this.A05);
        AbstractC6374YB.A0K(this.A06);
        this.A04 = c6618c7.A02();
        A04();
        this.A06.addView(this.A05, new RelativeLayout.LayoutParams(-2, -2));
        addView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC6602br.A00(c6618c7.A06(), this.A06, getAdInfo().A0H().A08());
        A03();
        ((AbstractC6614c3) this).A07.A06().A0F().AKh(AbstractC6322XL.A00(this.A00), getResources().getConfiguration().orientation, false, false, AbstractC5686Mt.A0C(((AbstractC6614c3) this).A07.A04()));
    }

    private void A02() {
        AbstractC6374YB.A0d(this.A07, getAdDetailsView(), getCtaButton());
        this.A01 = new C6763eS(((AbstractC6614c3) this).A07.A06(), getAdDataBundle(), this.A08, getCtaButton(), this.A03, ((AbstractC6614c3) this).A07.A08());
        addView(this.A01.A0W(), new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A03() {
        AbstractC6374YB.A0J(getAdDetailsView());
        addView(getAdDetailsView(), new RelativeLayout.LayoutParams(-1, -1));
        getAdDetailsView().setVisibility(0);
        A07(getResources().getConfiguration().orientation);
        if (getAdDetailsView() instanceof AbstractC5589LK) {
            ((AbstractC5589LK) getAdDetailsView()).A0u(getResources().getConfiguration().orientation);
        }
    }

    private void A04() {
        if (this.A04 == null) {
            return;
        }
        this.A05.addView(this.A04, new RelativeLayout.LayoutParams(-2, -2));
        AbstractC6374YB.A0K(this.A04);
        C6328XR c6328xrA02 = super.A08.A02(getAdDataBundle());
        ((AbstractC6614c3) this).A07.A06().A0H().A00(c6328xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A08);
        if (c6328xrA02.A00) {
            this.A04.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1X(view);
                }
            });
        } else {
            if (!C6171Up.A1J(getAdContextWrapper())) {
                return;
            }
            AbstractC6561bC.A00(this.A04, C6171Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC6613c2(this));
        }
    }

    private void A05() {
        this.A09.set(true);
        AbstractC6374YB.A0W(this);
        int i = 2;
        AbstractC6374YB.A0d(this.A05, getAdDetailsView());
        AbstractC6374YB.A0L(this.A07);
        A02();
        if (getAdInfo().A0K().A00() >= 0) {
            this.A02 = true;
            if (this.A07 != null) {
                AbstractC6400Yb abstractC6400Yb = this.A07;
                if (getAdDataBundle().A2P()) {
                    i = 8;
                }
                abstractC6400Yb.setToolbarActionMode(i);
                this.A07.setProgressImmediate(0.0f);
            }
            new C6325XO((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C5541KY(this)).A07();
        }
    }

    private void A07(int i) {
        A08(i);
        A1V(i, this.A06, this.A05);
    }

    private void A08(int i) {
        if (this.A04 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (AbstractC6322XL.A05(this.A00)) {
                layoutParams.addRule(13);
                RelativeLayout.LayoutParams containerLayoutParam = (RelativeLayout.LayoutParams) this.A05.getLayoutParams();
                containerLayoutParam.addRule(14);
                this.A05.setLayoutParams(containerLayoutParam);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A04.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka, com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1C() {
        super.A1C();
        this.A03.removeCallbacksAndMessages(null);
        getAdDetailsView().A0j();
        if (this.A01 != null) {
            this.A01.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka, com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1H(C5719NR c5719nr, String str, double d, Bundle bundle) {
        super.A1H(c5719nr, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1L(boolean z) {
        super.A1L(z);
        getAdDetailsView().A0m(z);
        if (this.A01 != null) {
            this.A01.A0e(z);
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
        if (getAdInfo().A0V() && !this.A09.get()) {
            A05();
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka
    public final AbstractC6564bF A1R(C6618c7 c6618c7, C5719NR c5719nr, String str) {
        this.A00 = new C6056Sx(c6618c7.A06()).A0M(c5719nr.A0H().A08());
        return new C6603bs(this.A00, str, c6618c7.A06(), getColors(), c6618c7.A05(), c6618c7.A0C(), getCtaButton(), AbstractC5543Ka.A0G, false, c6618c7.A07(), c6618c7.A0F(), c6618c7.A0A(), c6618c7.A0E(), c6618c7.A08(), false).A03();
    }

    public final /* synthetic */ void A1X(View view) {
        getCtaButton().A0E(A01(0, 5, 115));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public int getCloseButtonStyle() {
        if (this.A02) {
            if (getAdDataBundle().A2P()) {
                return 8;
            }
            return 2;
        }
        if (A1M() && !this.A09.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5543Ka, com.facebook.ads.redexgen.core.AbstractC6614c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 != null && this.A09.get()) {
            this.A01.A0a(configuration.orientation);
        } else {
            A07(configuration.orientation);
        }
    }
}
