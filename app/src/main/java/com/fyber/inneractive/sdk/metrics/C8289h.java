package com.fyber.inneractive.sdk.metrics;

import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.metrics.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8289h {

    /* JADX INFO: renamed from: a */
    public final String f18488a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b */
    public final String f18489b;

    public C8289h(String str) {
        this.f18489b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8289h.class != obj.getClass()) {
            return false;
        }
        return this.f18488a.equals(((C8289h) obj).f18488a);
    }

    public final int hashCode() {
        return this.f18488a.hashCode();
    }
}
