package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2j */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C44612j extends AbstractC5884Q9<C6847fp> implements InterfaceC6063T4 {
    public C6902gi A00;
    public boolean A01;

    public C44612j(C6847fp c6847fp, C6902gi c6902gi) {
        super(c6847fp);
        this.A00 = c6902gi;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0F().A3v(i);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC6279Wc
    public final void A07() {
        C6847fp c6847fpA08 = A08();
        int iIntValue = 0;
        if (c6847fpA08 == null) {
            A00(0);
            return;
        }
        View view = c6847fpA08.A0C;
        AbstractC6846fo abstractC6846fo = (AbstractC6846fo) c6847fpA08.A0E.get();
        int i = 1;
        boolean z = view == null;
        if (!z && abstractC6846fo != null) {
            C6848fq c6848fqA0E = C6847fp.A0E(view, c6847fpA08.A0A, this.A00);
            if (c6848fqA0E.A04()) {
                C6847fp.A05(c6847fpA08);
            } else {
                c6847fpA08.A00 = 0;
            }
            boolean z2 = c6847fpA08.A00 > c6847fpA08.A09;
            boolean wasViewable = c6847fpA08.A05 != null && c6847fpA08.A05.A04();
            if (z2 || !c6848fqA0E.A04()) {
                c6847fpA08.A05 = c6848fqA0E;
            }
            String strValueOf = String.valueOf(c6848fqA0E.A01());
            synchronized (c6847fpA08) {
                if (c6847fpA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c6847fpA08.A06.get(strValueOf)).intValue();
                }
                c6847fpA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z2 && !wasViewable) {
                this.A01 = true;
                c6847fpA08.A03 = System.currentTimeMillis();
                if (c6847fpA08.A07) {
                    this.A00.A0F().A3w();
                }
                abstractC6846fo.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c6847fpA08.A0F) {
                    return;
                }
            } else if (!z2 && wasViewable) {
                this.A01 = true;
                if (c6847fpA08.A07) {
                    this.A00.A0F().A3S(c6848fqA0E.A02());
                }
                abstractC6846fo.A00();
            } else {
                abstractC6846fo.A02();
                if (!this.A01 && c6847fpA08.A07) {
                    this.A00.A0F().A3u(c6848fqA0E.A02());
                }
                this.A01 = true;
            }
            if (!c6847fpA08.A08 && c6847fpA08.A04 != null) {
                c6847fpA08.A0B.postDelayed(c6847fpA08.A04, c6847fpA08.A02);
                return;
            }
            return;
        }
        if (c6847fpA08.A07) {
            if (!z) {
                i = 2;
            }
            A00(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6063T4
    public final C6902gi A6m() {
        return this.A00;
    }
}
