package com.bytedance.adsdk.ugeno.jbs.p099lr;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2279ri extends FrameLayout {

    /* JADX INFO: renamed from: lr */
    private Map<Integer, C2226aw> f5770lr;

    /* JADX INFO: renamed from: ri */
    private InterfaceC2282ka f5771ri;

    public C2279ri(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5771ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5771ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, C2226aw> map = this.f5770lr;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2282ka interfaceC2282ka = this.f5771ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7733di();
        }
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka2 = this.f5771ri;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7737ri(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC2282ka interfaceC2282ka = this.f5771ri;
        if (interfaceC2282ka != null) {
            int[] iArrMo7740ri = interfaceC2282ka.mo7740ri(i, i2);
            super.onMeasure(iArrMo7740ri[0], iArrMo7740ri[1]);
        } else {
            super.onMeasure(i, i2);
        }
        InterfaceC2282ka interfaceC2282ka2 = this.f5771ri;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7734fi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka = this.f5771ri;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7735lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: ri */
    public void m7727ri(InterfaceC2282ka interfaceC2282ka) {
        this.f5771ri = interfaceC2282ka;
    }

    public void setEventMap(Map<Integer, C2226aw> map) {
        this.f5770lr = map;
    }
}
