package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC5117Dg extends RelativeLayout implements InterfaceC6790eu, View.OnClickListener {
    public C5183Ek A00;
    public final AbstractC5147EA A01;
    public final AbstractC5141E4 A02;
    public final AbstractC5139E2 A03;
    public final AbstractC5137E0 A04;
    public final C6814fI A05;
    public static final int A07 = (int) (AbstractC6334XX.A02 * 16.0f);
    public static final int A06 = (int) (AbstractC6334XX.A02 * 6.0f);

    public ViewOnClickListenerC5117Dg(C6902gi c6902gi) {
        super(c6902gi);
        this.A04 = new AbstractC5137E0() { // from class: com.facebook.ads.redexgen.X.3a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5138E1 c5138e1) {
                this.A00.setVisibility(0);
            }
        };
        this.A02 = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.3Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45484B c45484b) {
                this.A00.A05.setChecked(true);
            }
        };
        this.A03 = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.3Y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                this.A00.A05.setChecked(false);
            }
        };
        this.A01 = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.3X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                this.A00.A05.setChecked(true);
            }
        };
        AbstractC6374YB.A0V(this, AbstractC6374YB.A06(855638016, A06));
        this.A05 = new C6814fI(c6902gi, true);
        this.A05.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A07, A07);
        layoutParams.addRule(13);
        setVisibility(8);
        addView(this.A05, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6790eu
    public final void AAv(C5183Ek c5183Ek) {
        this.A00 = c5183Ek;
        setOnClickListener(this);
        this.A05.setOnClickListener(this);
        if (this.A00 != null) {
            this.A00.getEventBus().A03(this.A04, this.A01, this.A02, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6790eu
    public final void AKV(C5183Ek c5183Ek) {
        if (this.A00 != null) {
            this.A00.getEventBus().A04(this.A03, this.A02, this.A01, this.A04);
        }
        setOnClickListener(null);
        this.A05.setOnClickListener(null);
        this.A00 = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                return;
            }
            if (this.A00.getState() == EnumC6844fm.A07 || this.A00.getState() == EnumC6844fm.A05 || this.A00.getState() == EnumC6844fm.A06) {
                this.A00.A0e(EnumC6789et.A04, 11);
            } else if (this.A00.getState() == EnumC6844fm.A0A) {
                this.A00.A0i(true, 7);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A05.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A05.setPlayAccessibilityLabel(str);
    }
}
