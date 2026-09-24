package com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2477ri;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2397ri extends AbstractC2393ka {
    public C2397ri(View view, C2477ri c2477ri) {
        super(view, c2477ri);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.AbstractC2393ka
    /* JADX INFO: renamed from: ri */
    List<ObjectAnimator> mo8287ri() {
        float fM8681nr = this.f6413lr.m8681nr() / 100.0f;
        float fTan = this.f6413lr.tan() / 100.0f;
        if ("reverse".equals(this.f6413lr.slm()) && this.f6413lr.bgr() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            fTan = fM8681nr;
            fM8681nr = fTan;
        }
        this.f6411ik.setAlpha(fM8681nr);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f6411ik, "alpha", fM8681nr, fTan).setDuration((int) (this.f6413lr.m8682qt() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(m8297ri(duration));
        return arrayList;
    }
}
