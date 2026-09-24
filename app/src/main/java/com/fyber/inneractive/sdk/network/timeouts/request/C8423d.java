package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.C7983k;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.timeouts.request.d */
/* JADX INFO: loaded from: classes9.dex */
public final class C8423d extends AbstractC8420a {
    public C8423d(String str, C7983k c7983k, String str2) {
        super(str, c7983k, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: a */
    public final int mo20799a(C7983k c7983k) {
        String str = this.f18738l;
        c7983k.getClass();
        String strM20421a = C7983k.m20421a("timeout", "threshold", C7983k.m20423e(str));
        Integer numMo20416a = c7983k.mo20416a(C7983k.m20421a("timeout", "threshold", "all_mediators"));
        int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 300;
        Integer numMo20416a2 = c7983k.mo20416a(strM20421a);
        return numMo20416a2 != null ? numMo20416a2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: a */
    public final int mo20800a(C7983k c7983k, String str) {
        return c7983k.m20425c(str, this.f18738l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: b */
    public final int mo20802b(C7983k c7983k, String str) {
        String str2 = this.f18738l;
        c7983k.getClass();
        String strM20421a = C7983k.m20421a(str, "min", "rat", C7983k.m20423e(str2));
        "read".equalsIgnoreCase(str);
        Integer numMo20416a = c7983k.mo20416a(C7983k.m20421a(str, "min", "rat", "all_mediators"));
        int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 5000;
        Integer numMo20416a2 = c7983k.mo20416a(strM20421a);
        return numMo20416a2 != null ? numMo20416a2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: c */
    public final int mo20804c(C7983k c7983k, String str) {
        String str2 = this.f18738l;
        c7983k.getClass();
        String strM20421a = C7983k.m20421a(str, "rat", "perc", C7983k.m20423e(str2));
        String strM20421a2 = C7983k.m20421a(str, "rat", "perc", "all_mediators");
        int iIntValue = "read".equalsIgnoreCase(str) ? 15 : 10;
        Integer numMo20416a = c7983k.mo20416a(strM20421a2);
        if (numMo20416a != null) {
            iIntValue = numMo20416a.intValue();
        }
        Integer numMo20416a2 = c7983k.mo20416a(strM20421a);
        return numMo20416a2 != null ? numMo20416a2.intValue() : iIntValue;
    }
}
