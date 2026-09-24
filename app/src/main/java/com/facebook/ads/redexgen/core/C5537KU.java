package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5537KU extends AbstractC6614c3 implements InterfaceC6327XQ {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC7077jd A00;
    public final C6329XS A01;
    public final InterfaceC6406Yh A02;
    public final C6641cU A03;
    public final C6739e4 A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 42, Ascii.f22498RS, 36, 34};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C5537KU(C6618c7 c6618c7, boolean z) {
        int id;
        int iA01;
        super(c6618c7, z);
        this.A02 = c6618c7.A0C();
        this.A00 = c6618c7.A05();
        this.A03 = new C6641cU(c6618c7.A06(), c6618c7.A02());
        this.A03.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC6614c3.A08, AbstractC6614c3.A08, AbstractC6614c3.A08, AbstractC6614c3.A08);
        getCtaButton().setLayoutParams(layoutParams);
        if (c6618c7.A0H()) {
            this.A04 = new C6739e4(c6618c7.A06());
            this.A04.setPageDetails(c6618c7.A05().A2C());
            AbstractC6374YB.A0G(1007, this.A04);
            RelativeLayout.LayoutParams pageDetailsParams = new RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(AbstractC6614c3.A08, AbstractC6614c3.A08 - (AbstractC6614c3.A08 / 2), AbstractC6614c3.A08, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id = this.A04.getId();
            iA01 = c6618c7.A01() - (AbstractC6614c3.A08 / 2);
        } else {
            id = getCtaButton().getId();
            iA01 = c6618c7.A01();
            this.A04 = null;
        }
        FrameLayout insideContainerLayout = new FrameLayout(c6618c7.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id);
        layoutParams2.setMargins(0, iA01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC6614c3.A08, 0, AbstractC6614c3.A08, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0F(c6618c7.A05(), c6618c7.A0B());
        View viewA02 = c6618c7.A02();
        this.A01 = C6329XS.A00(c6618c7.A06(), this.A00, this);
        C6328XR c6328xrA02 = this.A01.A02(this.A00);
        c6618c7.A06().A0H().A00(c6328xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (viewA02 != null && c6328xrA02.A00) {
            viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cD
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1Q(view);
                }
            });
        } else if (viewA02 != null && C6171Up.A1J(getAdContextWrapper())) {
            AbstractC6561bC.A00(viewA02, C6171Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC6625cE(this));
        }
        if (C6171Up.A17(c6618c7.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c6618c7.A0B() != null) {
                c6618c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && C6171Up.A18(c6618c7.A06())) {
            this.A04.setOnClickListener(getCtaButton());
        }
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
    public final void A1C() {
        super.A1C();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1H(C5719NR c5719nr, String str, double d, Bundle bundle) {
        super.A1H(c5719nr, str, d, bundle);
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            int mediaHeight = (int) (((double) (A06 - (AbstractC6614c3.A08 * 2))) / d);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1O() {
        return false;
    }

    public final /* synthetic */ void A1Q(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
