package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import com.bytedance.sdk.component.adexpress.p124ka.C2496lr;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2399vr extends AbstractC2393ka {
    public C2399vr(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        float f;
        float fM8833ri = xha.m8833ri(C2490ka.m8811ri(), this.f6413lr.m8660di());
        float fM8833ri2 = xha.m8833ri(C2490ka.m8811ri(), this.f6413lr.xha());
        float f2 = 0.0f;
        if ("reverse".equals(this.f6413lr.slm())) {
            f = fM8833ri2;
            fM8833ri2 = 0.0f;
            f2 = fM8833ri;
            fM8833ri = 0.0f;
        } else {
            f = 0.0f;
        }
        if (C2496lr.m8822ri(this.f6411ik.getContext())) {
            fM8833ri = -fM8833ri;
            f2 = -f2;
        }
        this.f6411ik.setTranslationX(fM8833ri);
        this.f6411ik.setTranslationY(fM8833ri2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "translationX", fM8833ri, f2).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f6411ik, "translationY", fM8833ri2, f).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        arrayList.add(m8297ri(duration2));
        return arrayList;
    }
}
