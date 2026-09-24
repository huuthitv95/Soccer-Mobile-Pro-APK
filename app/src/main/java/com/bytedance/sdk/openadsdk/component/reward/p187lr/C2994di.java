package com.bytedance.sdk.openadsdk.component.reward.p187lr;

import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2994di {
    /* JADX INFO: renamed from: ri */
    public static AbstractC2998lr m11714ri(C3022ri c3022ri) {
        wjv wjvVar = c3022ri.f9389lr;
        if (xha.m11763ri(wjvVar) && !C2996ik.m11720ri(wjvVar)) {
            return new xha(c3022ri);
        }
        if (C2997ka.m11728ri(wjvVar)) {
            return new C2997ka(c3022ri);
        }
        return C2996ik.m11720ri(wjvVar) ? new C2996ik(c3022ri) : new C2995fi(c3022ri);
    }
}
