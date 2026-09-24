package com.bytedance.adsdk.p065lr;

import java.util.Arrays;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.co */
/* JADX INFO: loaded from: classes3.dex */
public final class C2015co<V> {

    /* JADX INFO: renamed from: lr */
    private final Throwable f4681lr;

    /* JADX INFO: renamed from: ri */
    private final V f4682ri;

    public C2015co(V v) {
        this.f4682ri = v;
        this.f4681lr = null;
    }

    public C2015co(Throwable th) {
        this.f4681lr = th;
        this.f4682ri = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2015co)) {
            return false;
        }
        C2015co c2015co = (C2015co) obj;
        if (m6474ri() != null && m6474ri().equals(c2015co.m6474ri())) {
            return true;
        }
        if (m6473lr() == null || c2015co.m6473lr() == null) {
            return false;
        }
        return m6473lr().toString().equals(m6473lr().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m6474ri(), m6473lr()});
    }

    /* JADX INFO: renamed from: lr */
    public Throwable m6473lr() {
        return this.f4681lr;
    }

    /* JADX INFO: renamed from: ri */
    public V m6474ri() {
        return this.f4682ri;
    }
}
