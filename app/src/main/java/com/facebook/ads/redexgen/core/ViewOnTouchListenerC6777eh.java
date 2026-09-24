package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC6777eh implements View.OnTouchListener {
    public final /* synthetic */ C5183Ek A00;

    public ViewOnTouchListenerC6777eh(C5183Ek c5183Ek) {
        this.A00 = c5183Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new C5131Du(view, motionEvent));
        return false;
    }
}
