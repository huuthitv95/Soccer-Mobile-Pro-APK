package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7102k2 implements InterfaceC6674d1 {
    public final /* synthetic */ C478681 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC6674d1
    public final void AAn() {
        String strA00 = this.A00.A03.A2C().A00();
        if (TextUtils.isEmpty(strA00)) {
            return;
        }
        C6307X6.A0O(new C6307X6(), this.A00.A04, AbstractC6312XB.A00(strA00), this.A00.A7O());
    }

    public C7102k2(C478681 c478681) {
        this.A00 = c478681;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6674d1
    public final void ADm(C466362 c466362) {
        new Handler(Looper.getMainLooper()).postDelayed(new C7103k3(this, c466362), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6674d1
    public final void AE2() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6674d1
    public final void AGC(View view, MotionEvent motionEvent) {
    }
}
