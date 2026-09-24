package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2395mj extends AbstractC2393ka {
    public C2395mj(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ((ViewGroup) this.f6411ik.getParent()).setClipChildren(false);
        ((ViewGroup) this.f6411ik.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.f6411ik.getParent().getParent().getParent()).setClipChildren(false);
        this.f6411ik.setTag(2097610712, this.f6413lr.m8679mj());
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        return arrayList;
    }
}
