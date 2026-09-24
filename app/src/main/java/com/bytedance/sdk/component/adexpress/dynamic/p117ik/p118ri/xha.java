package com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements View.OnTouchListener {

    /* JADX INFO: renamed from: ik */
    private static int f6664ik = 10;

    /* JADX INFO: renamed from: fi */
    private int f6666fi;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2454mj f6667ka;

    /* JADX INFO: renamed from: lr */
    private float f6668lr;

    /* JADX INFO: renamed from: ri */
    private float f6671ri;

    /* JADX INFO: renamed from: di */
    private RectF f6665di = new RectF();
    private long xha = 0;

    /* JADX INFO: renamed from: mj */
    private final int f6669mj = 200;
    private final int jbs = 3;

    /* JADX INFO: renamed from: qt */
    private SoftReference<View> f6670qt = new SoftReference<>(null);

    public xha(InterfaceC2454mj interfaceC2454mj, int i, final ViewGroup viewGroup) {
        this.f6666fi = f6664ik;
        this.f6667ka = interfaceC2454mj;
        if (i > 0) {
            this.f6666fi = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.ri.xha.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    xha.this.f6670qt = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    private RectF m8452ri(View view) {
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
        InterfaceC2454mj interfaceC2454mj2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6665di = m8452ri(this.f6670qt.get());
            this.f6671ri = motionEvent.getRawX();
            this.f6668lr = motionEvent.getRawY();
            this.xha = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.f6665di;
            if (rectF != null && !rectF.contains(this.f6671ri, this.f6668lr)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.f6671ri);
            float fAbs2 = Math.abs(rawY - this.f6668lr);
            int iM8832lr = com.bytedance.sdk.component.adexpress.p124ka.xha.m8832lr(C2490ka.m8811ri(), Math.abs(rawX - this.f6671ri));
            int i = f6664ik;
            if (fAbs < i || fAbs2 < i) {
                if ((System.currentTimeMillis() - this.xha < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (interfaceC2454mj = this.f6667ka) != null) {
                    interfaceC2454mj.mo8445ri();
                }
            } else if (rawX > this.f6671ri && iM8832lr > this.f6666fi && (interfaceC2454mj2 = this.f6667ka) != null) {
                interfaceC2454mj2.mo8445ri();
            }
        }
        return true;
    }
}
