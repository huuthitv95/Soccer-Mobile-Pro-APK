package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import com.bytedance.sdk.component.adexpress.p124ka.C2496lr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2389co extends AbstractC2393ka {
    public C2389co(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        int i;
        int i2;
        this.f6411ik.setTag(2097610711, Integer.valueOf(this.f6413lr.m8671ka()));
        if (this.f6411ik == null || !C2496lr.m8822ri(this.f6411ik.getContext())) {
            i = 0;
            i2 = 1;
        } else {
            i2 = 0;
            i = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "shineValue", i, i2).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        return arrayList;
    }
}
