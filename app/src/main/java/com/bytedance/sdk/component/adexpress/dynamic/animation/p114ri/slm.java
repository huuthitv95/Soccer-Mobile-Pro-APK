package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class slm extends AbstractC2393ka {
    public slm(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "translationX", 0.0f, xha.m8833ri(C2490ka.m8811ri(), 20.0f), 0.0f, -xha.m8833ri(C2490ka.m8811ri(), 20.0f), 0.0f).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        return arrayList;
    }
}
