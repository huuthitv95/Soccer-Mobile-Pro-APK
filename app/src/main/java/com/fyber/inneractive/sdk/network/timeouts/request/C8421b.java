package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.C7983k;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.timeouts.request.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8421b extends AbstractC8420a {
    public C8421b(C7983k c7983k, String str) {
        super(str, c7983k, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: a */
    public final int mo20799a(C7983k c7983k) {
        c7983k.getClass();
        Integer numMo20416a = c7983k.mo20416a(C7983k.m20421a("timeout", "threshold"));
        if (numMo20416a != null) {
            return numMo20416a.intValue();
        }
        return 300;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: a */
    public final int mo20800a(C7983k c7983k, String str) {
        c7983k.getClass();
        String str2 = str + "_global_timeout";
        int i = C7983k.m20422d(str) ? 30000 : 10000;
        Integer numMo20416a = c7983k.mo20416a(str2);
        return numMo20416a != null ? numMo20416a.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: b */
    public final int mo20802b(C7983k c7983k, String str) {
        c7983k.getClass();
        String strM20421a = C7983k.m20421a(str, "min", "rat");
        "read".equalsIgnoreCase(str);
        Integer numMo20416a = c7983k.mo20416a(strM20421a);
        if (numMo20416a != null) {
            return numMo20416a.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: c */
    public final int mo20804c(C7983k c7983k, String str) {
        c7983k.getClass();
        String strM20421a = C7983k.m20421a(str, "rat_perc");
        int i = "read".equalsIgnoreCase(str) ? 15 : 10;
        Integer numMo20416a = c7983k.mo20416a(strM20421a);
        return numMo20416a != null ? numMo20416a.intValue() : i;
    }
}
