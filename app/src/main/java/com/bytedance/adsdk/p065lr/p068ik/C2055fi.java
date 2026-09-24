package com.bytedance.adsdk.p065lr.p068ik;

import com.bytedance.adsdk.p065lr.bgr;
import com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2055fi {

    /* JADX INFO: renamed from: ri */
    private static final C2055fi f4796ri = new C2055fi();

    /* JADX INFO: renamed from: lr */
    private final bgr<String, xha> f4797lr = new bgr<>(20);

    C2055fi() {
    }

    /* JADX INFO: renamed from: ri */
    public static C2055fi m6701ri() {
        return f4796ri;
    }

    /* JADX INFO: renamed from: ri */
    public xha m6702ri(String str) {
        if (str == null) {
            return null;
        }
        return this.f4797lr.m6469ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m6703ri(String str, xha xhaVar) {
        if (str == null) {
            return;
        }
        this.f4797lr.m6470ri(str, xhaVar);
    }
}
