package com.bytedance.adsdk.ugeno.p093fi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2263ik {

    /* JADX INFO: renamed from: aw */
    int f5668aw;

    /* JADX INFO: renamed from: bu */
    boolean f5669bu;

    /* JADX INFO: renamed from: co */
    int f5670co;

    /* JADX INFO: renamed from: di */
    int f5671di;

    /* JADX INFO: renamed from: fi */
    int f5672fi;
    int jbs;

    /* JADX INFO: renamed from: mj */
    int f5676mj;

    /* JADX INFO: renamed from: nr */
    boolean f5677nr;

    /* JADX INFO: renamed from: qt */
    float f5678qt;

    /* JADX INFO: renamed from: sf */
    float f5680sf;
    int slm;

    /* JADX INFO: renamed from: vr */
    int f5681vr;
    int xha;

    /* JADX INFO: renamed from: ri */
    int f5679ri = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: lr */
    int f5675lr = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ik */
    int f5673ik = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ka */
    int f5674ka = Integer.MIN_VALUE;
    List<Integer> bgr = new ArrayList();

    C2263ik() {
    }

    /* JADX INFO: renamed from: lr */
    public int m7610lr() {
        return this.f5676mj - this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public int m7611ri() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ri */
    void m7612ri(View view, int i, int i2, int i3, int i4) {
        InterfaceC2265lr interfaceC2265lr = (InterfaceC2265lr) view.getLayoutParams();
        this.f5679ri = Math.min(this.f5679ri, (view.getLeft() - interfaceC2265lr.mo7589aw()) - i);
        this.f5675lr = Math.min(this.f5675lr, (view.getTop() - interfaceC2265lr.bgr()) - i2);
        this.f5673ik = Math.max(this.f5673ik, view.getRight() + interfaceC2265lr.mo7607vr() + i3);
        this.f5674ka = Math.max(this.f5674ka, view.getBottom() + interfaceC2265lr.slm() + i4);
    }
}
