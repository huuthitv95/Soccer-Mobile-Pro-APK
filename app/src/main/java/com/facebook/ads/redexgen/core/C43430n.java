package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0n */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C43430n extends C43460q {
    @Override // com.facebook.ads.redexgen.core.C5856Pg
    public final C5873Py A07(View view, C5873Py c5873Py) {
        WindowInsets result = (WindowInsets) C5873Py.A01(c5873Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C5873Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C5856Pg
    public final C5873Py A08(View view, C5873Py c5873Py) {
        WindowInsets result = (WindowInsets) C5873Py.A01(c5873Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C5873Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C5856Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.core.C5856Pg
    public final void A0E(View view, InterfaceC5842PR interfaceC5842PR) {
        if (interfaceC5842PR == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC5855Pf(this, interfaceC5842PR));
        }
    }
}
