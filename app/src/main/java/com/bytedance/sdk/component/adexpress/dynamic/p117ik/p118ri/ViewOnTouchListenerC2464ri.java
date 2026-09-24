package com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC2464ri implements View.OnTouchListener {

    /* JADX INFO: renamed from: ik */
    private static int f6654ik = 10;

    /* JADX INFO: renamed from: fi */
    private int f6656fi;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2454mj f6657ka;

    /* JADX INFO: renamed from: lr */
    private float f6658lr;

    /* JADX INFO: renamed from: ri */
    private float f6661ri;

    /* JADX INFO: renamed from: di */
    private RectF f6655di = new RectF();
    private long xha = 0;

    /* JADX INFO: renamed from: mj */
    private final int f6659mj = 200;
    private final int jbs = 3;

    /* JADX INFO: renamed from: qt */
    private SoftReference<ViewGroup> f6660qt = new SoftReference<>(null);

    public ViewOnTouchListenerC2464ri(InterfaceC2454mj interfaceC2454mj, int i, final ViewGroup viewGroup) {
        this.f6656fi = f6654ik;
        this.f6657ka = interfaceC2454mj;
        if (i > 0) {
            this.f6656fi = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ViewOnTouchListenerC2464ri.this.f6660qt = new SoftReference(viewGroup);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    private RectF m8450ri(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC2454mj interfaceC2454mj;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6655di = m8450ri(this.f6660qt.get());
            this.f6661ri = motionEvent.getRawX();
            this.f6658lr = motionEvent.getRawY();
            this.xha = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.f6655di;
            if (rectF != null && !rectF.contains(this.f6661ri, this.f6658lr)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.f6661ri);
            float fAbs2 = Math.abs(rawY - this.f6658lr);
            int i = this.f6656fi;
            if (fAbs >= i && fAbs2 >= i) {
                InterfaceC2454mj interfaceC2454mj2 = this.f6657ka;
                if (interfaceC2454mj2 != null) {
                    interfaceC2454mj2.mo8445ri();
                }
            } else if ((System.currentTimeMillis() - this.xha < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (interfaceC2454mj = this.f6657ka) != null) {
                interfaceC2454mj.mo8445ri();
            }
        }
        return true;
    }
}
