package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5271GB extends FrameLayout implements InterfaceC6407Yi {
    public static String[] A0F = {"", "W4Q5rze9OaCj8zYeEqMqJDKHVn1jlwCj", "tfMK6ikBUwqELtuMuu5Kubqydzlt1dTF", "vHKgDETdn9HfwlFLESHxJfcBT5o8ovHI", "7Mubz7OjQQHbSYG", "T8sk6PPloyPWHv5iczs8jf8QHRZ1ZSou", "3ZCO1Nznw11DnI4nXgj4IK6CNfFIYy0N", "YX"};
    public static final RelativeLayout.LayoutParams A0G = new RelativeLayout.LayoutParams(-1, -1);
    public C5976Re A00;
    public InterfaceC6407Yi A01;
    public Intent A02;
    public Bundle A03;
    public InterfaceC6407Yi A04;
    public final AbstractC7077jd A05;
    public final AbstractC7077jd A06;
    public final C5742No A07;
    public final C6902gi A08;
    public final InterfaceC6192VA A09;
    public final EnumC6262WK A0A;
    public final ViewOnSystemUiVisibilityChangeListenerC6360Xx A0B;
    public final InterfaceC6406Yh A0C;
    public final InterfaceC6455ZU A0D;
    public final boolean A0E;

    public C5271GB(C6902gi c6902gi, InterfaceC6192VA interfaceC6192VA, AbstractC7077jd abstractC7077jd, AbstractC7077jd abstractC7077jd2, InterfaceC6406Yh interfaceC6406Yh, C5976Re c5976Re, EnumC6262WK enumC6262WK) {
        super(c6902gi);
        this.A08 = c6902gi;
        this.A09 = interfaceC6192VA;
        this.A06 = abstractC7077jd;
        this.A05 = abstractC7077jd2;
        this.A07 = this.A05.A29().A0H().A07();
        this.A0C = interfaceC6406Yh;
        this.A0B = new ViewOnSystemUiVisibilityChangeListenerC6360Xx(this);
        this.A0B.A05(EnumC6359Xw.A02);
        this.A0A = enumC6262WK;
        if (this.A0A == EnumC6262WK.A0J) {
            this.A0D = new C5647MG();
        } else {
            this.A0D = new C5648MH();
        }
        boolean z = false;
        if (this.A07 != null) {
            if (this.A07.A0b() && this.A05.A1n()) {
                z = true;
            }
            this.A0E = z;
            return;
        }
        this.A0E = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC6407Yi A05(InterfaceC6455ZU interfaceC6455ZU, C5742No c5742No, Boolean bool) {
        if (bool.booleanValue()) {
            return new C5663MW(this.A08, this.A09, this.A0C, this.A05, c5742No, this.A05.A1G(), interfaceC6455ZU);
        }
        return new C5716NO(this.A08, this.A09, this.A0C, this.A05, this.A05.A1G(), interfaceC6455ZU, true);
    }

    private C45684V A0A() {
        if (this.A07 != null) {
            this.A06.A1R(this.A07.A0X());
            this.A06.A1S(this.A07.A0c());
        }
        C45684V c45684v = new C45684V(this.A08, this.A0D, this.A09, this.A06, new C6056Sx(this.A08), this.A0C);
        c45684v.setVideoLeadingPlayableAdListener(new C5273GD(this));
        return c45684v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A04 != null) {
            this.A04.onDestroy();
            if (this.A04 instanceof View) {
                ((View) this.A04).setVisibility(8);
                removeView((View) this.A04);
            }
        }
    }

    private final void A0C(Intent intent, Bundle bundle, C5976Re c5976Re) {
        this.A04 = A0A();
        this.A04.AAu(intent, bundle, c5976Re);
        if (this.A0E && this.A07 != null) {
            this.A01 = A05(this.A0D, this.A07, Boolean.valueOf(this.A05.A1n()));
            this.A01.AAu(intent, bundle, c5976Re);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AAu(Intent intent, Bundle bundle, C5976Re c5976Re) {
        this.A02 = intent;
        this.A03 = bundle;
        this.A00 = c5976Re;
        this.A0C.A45(this, A0G);
        A0C(intent, bundle, c5976Re);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFA(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AFi(boolean z) {
        if (this.A04 instanceof C5663MW) {
            InterfaceC6407Yi interfaceC6407Yi = this.A04;
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "";
            strArr2[4] = "sBQPYruyJOWbMZu";
            interfaceC6407Yi.AFi(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void AIv(Bundle bundle) {
    }

    public InterfaceC6407Yi getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public String getCurrentClientToken() {
        return this.A06.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (this.A04 != null) {
            this.A04.onActivityResult(i, i2, intent);
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A04 instanceof C5663MW) {
            ((C5663MW) this.A04).onConfigurationChanged(configuration);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6407Yi
    public final void onDestroy() {
    }

    public void setListener(InterfaceC6406Yh interfaceC6406Yh) {
    }
}
