package com.facebook.ads.redexgen.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5118Dh implements InterfaceC6790eu {
    public View A00;
    public C5183Ek A01;
    public EnumC6805f9 A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC5147EA A05;
    public final AbstractC5141E4 A06;
    public final AbstractC5139E2 A07;
    public final AbstractC5130Dt A08;
    public final boolean A09;
    public final boolean A0A;

    public C5118Dh(View view, EnumC6805f9 enumC6805f9, boolean z) {
        this(view, enumC6805f9, z, false);
    }

    public C5118Dh(View view, EnumC6805f9 enumC6805f9, boolean z, boolean z2) {
        this.A06 = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.3p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45484B c45484b) {
                this.A00.A06(1, 0);
            }
        };
        this.A07 = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.3n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                if (!this.A00.A03) {
                    return;
                }
                if (this.A00.A02 == EnumC6805f9.A02 || this.A00.A09) {
                    this.A00.A02 = null;
                    this.A00.A05();
                } else {
                    this.A00.A06(0, 8);
                }
            }
        };
        this.A05 = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.3e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                if (this.A00.A02 == EnumC6805f9.A03) {
                    return;
                }
                this.A00.A00.setAlpha(1.0f);
                this.A00.A00.setVisibility(0);
            }
        };
        this.A08 = new C45143c(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC6805f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C6804f8(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC6805f9 enumC6805f9) {
        this.A02 = enumC6805f9;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC6805f9 == EnumC6805f9.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6790eu
    public final void AAv(C5183Ek c5183Ek) {
        this.A01 = c5183Ek;
        c5183Ek.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6790eu
    public final void AKV(C5183Ek c5183Ek) {
        A06(1, 0);
        c5183Ek.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
