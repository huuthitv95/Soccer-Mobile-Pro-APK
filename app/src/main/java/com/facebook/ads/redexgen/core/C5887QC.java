package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5887QC extends AccessibilityNodeProvider {
    public final /* synthetic */ InterfaceC5888QD A00;

    public C5887QC(InterfaceC5888QD interfaceC5888QD) {
        this.A00 = interfaceC5888QD;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        return (AccessibilityNodeInfo) this.A00.A5G(i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        return this.A00.A6Y(str, i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        return (AccessibilityNodeInfo) this.A00.A6Z(i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.AGv(i, i2, bundle);
    }
}
