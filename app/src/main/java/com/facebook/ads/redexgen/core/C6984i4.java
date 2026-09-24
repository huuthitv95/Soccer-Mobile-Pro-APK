package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6984i4 extends C5835PK {
    @Override // com.facebook.ads.redexgen.core.C5835PK
    public final View.AccessibilityDelegate A00(AbstractC5836PL abstractC5836PL) {
        return new C5833PI(this, abstractC5836PL);
    }

    @Override // com.facebook.ads.redexgen.core.C5835PK
    public final C5883Q8 A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C5883Q8(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C5835PK
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
