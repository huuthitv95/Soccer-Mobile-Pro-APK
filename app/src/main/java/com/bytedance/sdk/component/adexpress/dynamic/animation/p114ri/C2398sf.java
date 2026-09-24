package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2398sf extends AbstractC2393ka {
    public C2398sf(View view, C2477ri c2477ri) {
        super(view, c2477ri);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof AbstractC2412fi)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof AbstractC2412fi)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        float f;
        float fM8688sf = (float) this.f6413lr.m8688sf();
        float fM8659co = (float) this.f6413lr.m8659co();
        String strSlm = this.f6413lr.slm();
        float f2 = 1.0f;
        if ("reverse".equals(strSlm) || "alternate-reverse".equals(strSlm)) {
            f = 1.0f;
        } else {
            f = fM8659co;
            fM8659co = 1.0f;
            f2 = fM8688sf;
            fM8688sf = 1.0f;
        }
        this.f6411ik.setTag(2097610710, this.f6413lr.m8675lr());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "scaleX", fM8688sf, f2).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f6411ik, "scaleY", fM8659co, f).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        arrayList.add(m8297ri(duration2));
        return arrayList;
    }
}
