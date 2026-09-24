package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p190aw.C3103qt;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3283ka {

    /* JADX INFO: renamed from: ri */
    private C3097ka f11298ri = new C3097ka();

    /* JADX INFO: renamed from: lr */
    private Set<C3103qt> f11297lr = new HashSet();

    /* JADX INFO: renamed from: lr */
    public Set<C3103qt> m14186lr() {
        return this.f11297lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14187lr(Set<C3103qt> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.f11297lr.addAll(set);
    }

    /* JADX INFO: renamed from: ri */
    public C3097ka m14188ri() {
        return this.f11298ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14189ri(C3097ka c3097ka) {
        if (c3097ka == null) {
            c3097ka = new C3097ka();
        }
        this.f11298ri = c3097ka;
    }

    /* JADX INFO: renamed from: ri */
    public void m14190ri(wjv wjvVar) {
        C3097ka c3097ka = this.f11298ri;
        if (c3097ka != null) {
            c3097ka.m12485ri(wjvVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14191ri(Set<C3103qt> set) {
        this.f11297lr = set;
    }
}
