package com.fyber.inneractive.sdk.util;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C9153h {

    /* JADX INFO: renamed from: a */
    public final Long f21453a;

    public C9153h(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = null;
        }
        this.f21453a = lValueOf;
    }
}
