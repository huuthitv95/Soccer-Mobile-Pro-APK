package com.bytedance.sdk.openadsdk.core.p219ik;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xha extends AbstractViewOnClickListenerC3218ik {

    /* JADX INFO: renamed from: ik */
    private AbstractViewOnClickListenerC3218ik f10711ik;

    /* JADX INFO: renamed from: lr */
    private final C3104ri f10712lr;

    /* JADX INFO: renamed from: ri */
    private final String f10713ri;

    public xha(String str, C3104ri c3104ri) {
        this(str, c3104ri, null);
    }

    public xha(String str, C3104ri c3104ri, AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik) {
        this.f10713ri = str;
        this.f10712lr = c3104ri;
        this.f10711ik = abstractViewOnClickListenerC3218ik;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
    /* JADX INFO: renamed from: ri */
    protected void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
        C3104ri c3104ri = this.f10712lr;
        if (c3104ri != null) {
            c3104ri.m12536fi(this.f10713ri);
        }
        if (view != null) {
            if (view.getId() == slm.f13268fi) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == slm.jbs) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.f10713ri);
            }
        }
        AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik = this.f10711ik;
        if (abstractViewOnClickListenerC3218ik != null) {
            abstractViewOnClickListenerC3218ik.f10675ay = this.f10675ay;
            this.f10711ik.f10678fr = this.f10678fr;
            this.f10711ik.f10684su = this.f10684su;
            this.f10711ik.igq = this.f10684su;
            this.f10711ik.f10686zf = this.f10684su;
            this.f10711ik.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13549ri(AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik) {
        this.f10711ik = abstractViewOnClickListenerC3218ik;
    }
}
