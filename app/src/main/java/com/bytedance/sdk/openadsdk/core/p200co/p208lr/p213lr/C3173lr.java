package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p213lr;

import android.content.Context;
import com.bytedance.adsdk.p065lr.C2016di;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3173lr extends C2016di {

    /* JADX INFO: renamed from: ri */
    private InterfaceC2282ka f10441ri;

    public C3173lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.p065lr.C2016di, android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f10441ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // com.bytedance.adsdk.p065lr.C2016di, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f10441ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13225ri(InterfaceC2282ka interfaceC2282ka) {
        this.f10441ri = interfaceC2282ka;
    }
}
