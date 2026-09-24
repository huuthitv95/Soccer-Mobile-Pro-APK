package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6561bC {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC6560bB viewOnClickListenerC6560bB = new ViewOnClickListenerC6560bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC6560bB);
            view.setOnTouchListener(new ViewOnTouchListenerC6559bA(viewOnClickListenerC6560bB));
        }
    }
}
