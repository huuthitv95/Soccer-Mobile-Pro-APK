package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC2393ka {
    public xha(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        this.f6411ik.setTag(2097610709, Integer.valueOf(this.f6413lr.m8667ik()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        return arrayList;
    }
}
