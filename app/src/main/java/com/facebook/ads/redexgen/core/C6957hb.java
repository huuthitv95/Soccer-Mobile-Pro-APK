package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6957hb extends AbstractC5836PL {
    public final AbstractC5836PL A00 = new C6960he(this);
    public final C47457M A01;

    public C6957hb(C47457M c47457m) {
        this.A01 = c47457m;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5836PL
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C47457M.class.getName());
        if ((view instanceof C47457M) && !A0B()) {
            C47457M c47457m = (C47457M) view;
            if (c47457m.getLayoutManager() != null) {
                c47457m.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5836PL
    public final void A08(View view, C5881Q6 c5881q6) {
        super.A08(view, c5881q6);
        c5881q6.A0O(C47457M.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(c5881q6);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5836PL
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i, bundle);
        }
        return false;
    }

    public final AbstractC5836PL A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
