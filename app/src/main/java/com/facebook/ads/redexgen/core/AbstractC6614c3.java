package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6614c3 extends RelativeLayout {
    public static final int A08 = AbstractC6332XV.A0b;
    public static final int A09 = (int) (AbstractC6334XX.A02 * 28.0f);
    public static final int A0A = (int) (AbstractC6334XX.A02 * 32.0f);
    public C5728Na A00;
    public boolean A01;
    public C6506aJ A02;
    public final C6902gi A03;
    public final InterfaceC6192VA A04;
    public final ViewOnClickListenerC5560Kr A05;
    public final C6601bq A06;
    public final C6618c7 A07;

    public abstract boolean A1O();

    public AbstractC6614c3(C6618c7 c6618c7, boolean z) {
        C5728Na c5728NaA00;
        super(c6618c7.A06());
        this.A07 = c6618c7;
        this.A03 = c6618c7.A06();
        this.A04 = c6618c7.A07();
        if (c6618c7.A00() == 1) {
            c5728NaA00 = c6618c7.A05().A28().A01();
        } else {
            c5728NaA00 = c6618c7.A05().A28().A00();
        }
        this.A00 = c5728NaA00;
        this.A01 = z;
        this.A05 = new ViewOnClickListenerC5560Kr(c6618c7.A06(), c6618c7.A05(), this.A00, c6618c7.A07(), c6618c7.A0C(), c6618c7.A0F(), c6618c7.A0A(), c6618c7.A09());
        this.A05.setRoundedCornersEnabled(A02());
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setV2Design(A04());
        AbstractC6374YB.A0G(1001, this.A05);
        this.A06 = new C6601bq(this.A03, this.A00, this.A01, A03(), A0B());
        AbstractC6374YB.A0K(this.A06);
    }

    public final C6506aJ A00(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, C6200VI c6200vi, EnumC6509aM enumC6509aM, InterfaceC6406Yh interfaceC6406Yh) {
        this.A02 = AbstractC6511aO.A01(c6902gi, true, abstractC7077jd, c6200vi, interfaceC6406Yh, enumC6509aM, AbstractC6508aL.A00(abstractC7077jd));
        AbstractC6374YB.A0K(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (abstractC7077jd.A2U()) {
            layoutParams.setMargins(AbstractC6332XV.A0b, AbstractC6332XV.A0r, 0, 0);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else {
            layoutParams.setMargins(AbstractC6332XV.A0b, 0, 0, AbstractC6332XV.A0b);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
        this.A02.setLayoutParams(layoutParams);
        return this.A02;
    }

    public final C6510aN A01(C6902gi c6902gi, EnumC6509aM enumC6509aM) {
        C6510aN c6510aNA02 = AbstractC6511aO.A02(c6902gi, enumC6509aM, this.A07.A05());
        AbstractC6374YB.A0K(c6510aNA02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(AbstractC6332XV.A0b, 0, 0, AbstractC6332XV.A0b);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        c6510aNA02.setLayoutParams(layoutParams);
        return c6510aNA02;
    }

    public boolean A02() {
        return true;
    }

    public boolean A03() {
        return true;
    }

    public final boolean A04() {
        if (this.A07.A05().A29().A0H().A07() == null) {
            return this.A07.A05().A1w() || this.A07.A05().A1y();
        }
        return this.A07.A05().A1n();
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0B() {
        return true;
    }

    public EnumC5683Mq A1B(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1C() {
        if (this.A02 != null) {
            this.A02.A0O();
        }
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G() {
    }

    public void A1H(C5719NR c5719nr, String str, double d, Bundle bundle) {
        this.A06.A04(c5719nr.A0I().A0F(), c5719nr.A0I().A04(), null, false, !A1O() && d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < 1.0d);
        this.A05.setCta(c5719nr.A0J(), str, new HashMap());
    }

    public void A1I(C45574K c45574k) {
    }

    public void A1J(C5138E1 c5138e1) {
    }

    public void A1K(C45474A c45474a, int i) {
    }

    public void A1L(boolean z) {
        if (!z && this.A02 != null) {
            this.A02.A0P();
        }
    }

    public boolean A1M() {
        return false;
    }

    public boolean A1N() {
        return true;
    }

    public boolean A1P(boolean z) {
        return false;
    }

    public C6902gi getAdContextWrapper() {
        return this.A03;
    }

    public InterfaceC6192VA getAdEventManager() {
        return this.A04;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C5728Na getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC5560Kr getCtaButton() {
        return this.A05;
    }

    public C6601bq getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C5728Na c5728NaA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c5728NaA00 = this.A07.A05().A28().A01();
        } else {
            c5728NaA00 = this.A07.A05().A28().A00();
        }
        this.A00 = c5728NaA00;
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(InterfaceC5684Mr interfaceC5684Mr) {
        getCtaButton().getCtaActionHelper().A07(interfaceC5684Mr);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
    }
}
