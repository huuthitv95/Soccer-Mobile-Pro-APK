package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6735e0 {
    public final int[] A00(View view, int i, int i2) {
        C5939R3 c5939r3 = (C5939R3) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c5939r3.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i2, childWidthSpec + view.getPaddingBottom(), c5939r3.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c5939r3.leftMargin + c5939r3.rightMargin, childWidthSpec3 + c5939r3.bottomMargin + c5939r3.topMargin};
    }
}
