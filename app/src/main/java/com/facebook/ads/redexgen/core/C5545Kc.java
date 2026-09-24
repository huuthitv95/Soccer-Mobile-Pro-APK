package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5545Kc extends AbstractC6614c3 implements InterfaceC6327XQ {
    public static String[] A0F = {"CRyUSCOowkTfoe8xXMA5e17hdMg", "WkFBEVgF0nyPchlhdBM9PAwmOGJ", "zSHiyACtWS1MQDlmmeiywmMfEBCYqg8r", "a6voQfhnzW62WB0803n3akdQXSWLA", "ESev22IS7ntvGAjOW6Y11JRWDyKuDF5b", "qYjSUGFL2zXSYltHWao95ysggj7pRI", "zEaDWfefMQybHYLhUDvoHIQpUffGUNEN", "lLaoJShXnQXOT6Cok4oNwdKWfBYo0"};
    public static final int A0G = (int) (AbstractC6334XX.A02 * 80.0f);
    public float A00;
    public C6630cJ A01;
    public C6763eS A02;
    public boolean A03;
    public final Handler A04;
    public final View A05;
    public final RelativeLayout A06;
    public final RelativeLayout A07;
    public final AbstractC7077jd A08;
    public final AbstractC6400Yb A09;
    public final InterfaceC6406Yh A0A;
    public final AbstractC5589LK A0B;
    public final AtomicBoolean A0C;
    public final boolean A0D;
    public final C6329XS A0E;

    public C5545Kc(C6618c7 c6618c7) {
        super(c6618c7, true);
        this.A04 = new Handler(Looper.getMainLooper());
        this.A0D = false;
        this.A0C = new AtomicBoolean(false);
        this.A03 = true;
        this.A0A = c6618c7.A0C();
        this.A09 = c6618c7.A0B();
        this.A08 = c6618c7.A05();
        this.A0E = C6329XS.A00(c6618c7.A06(), this.A08, this);
        this.A07 = new RelativeLayout(c6618c7.A06());
        this.A0B = A00(c6618c7, this.A08.A29(), this.A08.A0w());
        this.A06 = new RelativeLayout(c6618c7.A06());
        AbstractC6374YB.A0K(this.A06);
        AbstractC6374YB.A0K(this.A07);
        this.A05 = c6618c7.A02();
        A04();
        this.A07.addView(this.A06, new RelativeLayout.LayoutParams(-2, -2));
        addView(this.A07, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC6602br.A00(c6618c7.A06(), this.A07, this.A08.A29().A0H().A08());
        this.A0B.setInfo(this.A08.A29().A0I(), this.A08.A29().A0J(), this.A08.A2E(), this.A08.A2C().A01(), null, null);
        A03();
        super.A07.A06().A0F().AKh(AbstractC6322XL.A00(this.A00), getResources().getConfiguration().orientation, false, true, AbstractC5686Mt.A0C(super.A07.A04()));
    }

    private AbstractC5589LK A00(C6618c7 c6618c7, C5719NR c5719nr, String str) {
        this.A00 = new C6056Sx(c6618c7.A06()).A0M(c5719nr.A0H().A08());
        AbstractC5589LK adDetailsView = new C6603bs(this.A00, str, c6618c7.A06(), getColors(), c6618c7.A05(), c6618c7.A0C(), getCtaButton(), A0G, false, c6618c7.A07(), c6618c7.A0F(), c6618c7.A0A(), c6618c7.A0E(), c6618c7.A08(), false).A03();
        if (c6618c7.A0G() != null) {
            adDetailsView.setChainedAdInfo(c6618c7.A0G());
        }
        return adDetailsView;
    }

    private void A01() {
        this.A01 = new C6630cJ(super.A07.A06(), this.A08, super.A07.A08(), this.A04, super.A07.A0C());
        this.A01.A0I(false);
        addView(this.A01.A0C(getCtaButton()));
    }

    private void A02() {
        AbstractC6374YB.A0d(this.A0B);
        if (!this.A08.A29().A0K().A02().isEmpty()) {
            this.A02 = new C6763eS(super.A07.A06(), this.A08, this.A0A, getCtaButton(), this.A04, super.A07.A08());
            this.A02.A0f(false);
            addView(this.A02.A0W(), new RelativeLayout.LayoutParams(-1, -1));
            return;
        }
        A01();
    }

    private void A03() {
        AbstractC6374YB.A0J(this.A0B);
        addView(this.A0B, new RelativeLayout.LayoutParams(-1, -1));
        this.A0B.setVisibility(0);
        A05(getResources().getConfiguration().orientation);
        this.A0B.A0u(getResources().getConfiguration().orientation);
        this.A0B.bringToFront();
    }

    private void A04() {
        if (this.A05 == null) {
            return;
        }
        this.A06.addView(this.A05, new RelativeLayout.LayoutParams(-2, -2));
        AbstractC6374YB.A0K(this.A05);
        C6328XR c6328xrA02 = this.A0E.A02(this.A08);
        super.A07.A06().A0H().A00(c6328xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0E);
        if (c6328xrA02.A00) {
            this.A05.setOnClickListener(new ViewOnClickListenerC6606bv(this));
        } else {
            if (!C6171Up.A1J(getAdContextWrapper())) {
                return;
            }
            AbstractC6561bC.A00(this.A05, C6171Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC6607bw(this));
        }
    }

    private void A05(int i) {
        A06(i);
        A07(i, this.A07, this.A06);
    }

    private void A06(int i) {
        if (this.A05 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A05.getLayoutParams();
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
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A05.setLayoutParams(layoutParams);
    }

    private final void A07(int i, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if ((this.A0B instanceof C46926V) || (this.A0B instanceof C46916U)) {
            AbstractC6374YB.A0J(this.A0B);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0B.setLayoutParams(layoutParams);
                String[] strArr = A0F;
                if (strArr[0].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                A0F[6] = "EmhBF28Af3az5oL74X7a9tytdWpdYPgl";
                viewGroup.addView(this.A0B);
            } else {
                addView(this.A0B, layoutParams);
            }
        }
        this.A0B.A0l(i);
        this.A0B.A0y(viewGroup, relativeLayout, i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final EnumC5683Mq A1B(String str) {
        return this.A0B.getCTAButton().A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1C() {
        super.A1C();
        this.A04.removeCallbacksAndMessages(null);
        this.A0B.A0j();
        if (this.A02 != null) {
            this.A02.A0Y();
        }
        if (this.A01 != null) {
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1H(C5719NR c5719nr, String str, double d, Bundle bundle) {
        super.A1H(c5719nr, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1L(boolean z) {
        super.A1L(z);
        this.A0B.A0m(z);
        if (this.A02 != null) {
            this.A02.A0e(z);
        }
        if (this.A01 != null) {
            this.A01.A0H(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1M() {
        return this.A08.A29().A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1P(boolean z) {
        if (this.A08.A29().A0V() && !this.A0C.get()) {
            A1Q();
            return true;
        }
        return false;
    }

    public final void A1Q() {
        this.A0C.set(true);
        AbstractC6374YB.A0d(this.A06, this.A0B, this.A07);
        AbstractC6374YB.A0L(this.A09);
        AbstractC6374YB.A0W(this);
        A02();
        this.A03 = true;
        if (super.A07.A0D() != null) {
            super.A07.A0D().AFw(true);
            if (this.A09 != null && this.A08.A29().A0K().A00() > 0) {
                this.A03 = false;
                if (this.A08.A2P()) {
                    this.A09.setToolbarActionMode(8);
                } else {
                    this.A09.setToolbarActionMode(2);
                }
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6608bx(this), this.A08.A29().A0K().A00());
            }
        }
    }

    public final boolean A1R() {
        return this.A0C.get();
    }

    public final boolean A1S() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public int getCloseButtonStyle() {
        if (A1M() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A02 != null && this.A0C.get()) {
            this.A02.A0a(configuration.orientation);
            String[] strArr = A0F;
            if (strArr[0].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0F[6] = "qGsvoGIijzM6smaTEa50KnvmYJop2SBn";
            return;
        }
        A05(configuration.orientation);
    }
}
