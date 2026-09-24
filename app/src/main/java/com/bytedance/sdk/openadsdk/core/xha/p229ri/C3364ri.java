package com.bytedance.sdk.openadsdk.core.xha.p229ri;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.C2480ri;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf;
import com.bytedance.sdk.openadsdk.core.model.slm;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.xha.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3364ri extends AbstractViewOnClickListenerC3218ik implements InterfaceC2404ri {

    /* JADX INFO: renamed from: lr */
    private InterfaceC2510sf f11894lr;

    /* JADX INFO: renamed from: ri */
    protected WeakReference<View> f11895ri;

    /* JADX INFO: renamed from: ri */
    private void m15143ri(View view, int i, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray) {
        if (this.f11894lr != null) {
            String strValueOf = "";
            try {
                if (view.getTag(C2480ri.ihz) != null) {
                    strValueOf = String.valueOf(view.getTag(C2480ri.ihz));
                }
            } catch (Exception unused) {
            }
            this.f11894lr.mo8756ri(view, i, new slm.C3292ri().m14281ka(f).m14279ik(f2).m14282lr(f3).m14287ri(f4).m14284lr(this.f10675ay).m14289ri(this.f10678fr).m14290ri(sparseArray).m14293ri(this.ory).m14291ri(strValueOf).m14294ri());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri
    /* JADX INFO: renamed from: ri */
    public void mo8307ri(View view) {
        this.f11895ri = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
    /* JADX INFO: renamed from: ri */
    public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
        m15143ri(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri
    /* JADX INFO: renamed from: ri */
    public void mo8308ri(InterfaceC2510sf interfaceC2510sf) {
        this.f11894lr = interfaceC2510sf;
    }
}
