package com.bytedance.adsdk.ugeno.p090di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2251lr extends AbstractC2256ri<AbstractViewOnTouchListenerC2318ik> {

    /* JADX INFO: renamed from: ka */
    private InterfaceC2282ka f5592ka;

    public C2251lr(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5592ka;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5592ka;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2282ka interfaceC2282ka = this.f5592ka;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7733di();
        }
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka2 = this.f5592ka;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7737ri(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC2282ka interfaceC2282ka = this.f5592ka;
        if (interfaceC2282ka != null) {
            int[] iArrMo7740ri = interfaceC2282ka.mo7740ri(i, i2);
            super.onMeasure(iArrMo7740ri[0], iArrMo7740ri[1]);
        } else {
            super.onMeasure(i, i2);
        }
        InterfaceC2282ka interfaceC2282ka2 = this.f5592ka;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7734fi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka = this.f5592ka;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7735lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.adsdk.ugeno.p090di.AbstractC2256ri
    /* JADX INFO: renamed from: qt */
    public View mo7476qt(int i) {
        return ((AbstractViewOnTouchListenerC2318ik) this.f5611ri.get(i)).m7879sf();
    }

    /* JADX INFO: renamed from: ri */
    public void m7477ri(InterfaceC2282ka interfaceC2282ka) {
        this.f5592ka = interfaceC2282ka;
    }
}
