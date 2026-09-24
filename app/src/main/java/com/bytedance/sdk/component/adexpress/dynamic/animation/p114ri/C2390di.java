package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2390di extends AbstractC2393ka {
    public C2390di(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        float f = this.f6411ik.getLayoutParams().width;
        this.f6411ik.setTranslationX(f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "translationX", f, 0.0f).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f6411ik, "alpha", 0.0f, 1.0f).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        arrayList.add(m8297ri(duration2));
        return arrayList;
    }
}
