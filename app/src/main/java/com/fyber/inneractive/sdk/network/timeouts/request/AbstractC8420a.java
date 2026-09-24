package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.C7983k;
import com.fyber.inneractive.sdk.network.timeouts.AbstractC8418a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.timeouts.request.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8420a extends AbstractC8418a {

    /* JADX INFO: renamed from: h */
    public int f18734h;

    /* JADX INFO: renamed from: i */
    public int f18735i;

    /* JADX INFO: renamed from: j */
    public int f18736j;

    /* JADX INFO: renamed from: k */
    public int f18737k;

    /* JADX INFO: renamed from: l */
    public final String f18738l;

    public AbstractC8420a(String str, C7983k c7983k, String str2) {
        this.f18738l = str2;
        mo20805d(c7983k, str);
    }

    /* JADX INFO: renamed from: a */
    public int mo20798a(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo20799a(C7983k c7983k);

    /* JADX INFO: renamed from: a */
    public abstract int mo20800a(C7983k c7983k, String str);

    /* JADX INFO: renamed from: b */
    public int mo20801b() {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo20802b(C7983k c7983k, String str);

    /* JADX INFO: renamed from: c */
    public int mo20803c() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo20804c(C7983k c7983k, String str);

    /* JADX INFO: renamed from: d */
    public void mo20805d(C7983k c7983k, String str) {
        int iMo20802b = mo20802b(c7983k, "read");
        int iMo20802b2 = mo20802b(c7983k, "conn");
        int iMo20800a = mo20800a(c7983k, str);
        this.f18731f = mo20799a(c7983k);
        this.f18736j = mo20804c(c7983k, "read");
        int iMo20804c = mo20804c(c7983k, "conn");
        this.f18737k = iMo20804c;
        int i = (this.f18736j * iMo20800a) / 100;
        this.f18734h = i;
        this.f18735i = (iMo20800a * iMo20804c) / 100;
        this.f18734h = Math.max(iMo20802b, i);
        this.f18735i = Math.max(iMo20802b2, this.f18735i);
    }
}
