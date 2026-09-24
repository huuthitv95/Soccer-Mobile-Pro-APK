package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5208F9 extends C6596bl {
    public final ImageView A00;
    public final C6902gi A01;

    public C5208F9(C6902gi c6902gi) {
        super(c6902gi);
        this.A01 = c6902gi;
        setRadius(30);
        this.A00 = new ImageView(c6902gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C6556b7 c6556b7) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        AsyncTaskC5591LM asyncTaskC5591LM = new AsyncTaskC5591LM(this.A00, this.A01);
        asyncTaskC5591LM.A04();
        asyncTaskC5591LM.A07(str);
        asyncTaskC5591LM.A06(new InterfaceC6557b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.facebook.ads.redexgen.core.InterfaceC6557b8
            public final void AE7(C6556b7 c6556b7) {
                this.A00.A00(c6556b7);
            }
        });
    }
}
