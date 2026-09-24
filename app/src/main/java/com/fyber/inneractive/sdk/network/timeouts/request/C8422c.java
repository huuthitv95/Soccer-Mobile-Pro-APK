package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.C7983k;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.timeouts.request.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8422c extends AbstractC8420a {

    /* JADX INFO: renamed from: m */
    public double f18739m;

    public C8422c(String str, C7983k c7983k, String str2) {
        super(str, c7983k, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: a */
    public final int mo20798a(int i) {
        if (this.f18732g) {
            i = this.f18726a - i;
        }
        int i2 = (this.f18727b * i) + this.f18729d;
        IAlog.m21945a("%s : RequestBiddingAdTimeout resolveTimeoutForRetry, timeout: %d ms for retry: %d", IAlog.m21943a(this), Integer.valueOf(i2), Integer.valueOf(i));
        m20806b(i2);
        return i2;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: a */
    public final int mo20799a(C7983k c7983k) {
        String str = this.f18738l;
        c7983k.getClass();
        String strM20421a = C7983k.m20421a("timeout", "threshold", "rat", "bidding", C7983k.m20423e(str));
        Integer numMo20416a = c7983k.mo20416a(C7983k.m20421a("timeout", "threshold", "rat", "bidding", "all_mediators"));
        int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 300;
        Integer numMo20416a2 = c7983k.mo20416a(strM20421a);
        return numMo20416a2 != null ? numMo20416a2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: a */
    public final int mo20800a(C7983k c7983k, String str) {
        return c7983k.m20424b(str, this.f18738l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: b */
    public final int mo20801b() {
        return this.f18726a;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: b */
    public final int mo20802b(C7983k c7983k, String str) {
        String str2 = this.f18738l;
        c7983k.getClass();
        String strM20421a = C7983k.m20421a(str, "min", "rat", "bidding", C7983k.m20423e(str2));
        String strM20421a2 = C7983k.m20421a(str, "min", "rat", "bidding", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numMo20416a = c7983k.mo20416a(strM20421a2);
        int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 5000;
        Integer numMo20416a2 = c7983k.mo20416a(strM20421a);
        return numMo20416a2 != null ? numMo20416a2.intValue() : iIntValue;
    }

    /* JADX INFO: renamed from: b */
    public final void m20806b(int i) {
        double d = this.f18739m;
        if (d == 1.0d || d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            IAlog.m21945a("%s : RequestBiddingAdTimeout Ratio: %f, connection and read timeouts should be divided in equal proportions", IAlog.m21943a(this), Double.valueOf(this.f18739m));
            this.f18739m = 0.5d;
        }
        int i2 = (int) (((double) i) * this.f18739m);
        this.f18734h = i2;
        this.f18735i = i - i2;
        IAlog.m21945a("%s : RequestBiddingAdTimeout Update timeouts connection: %d read: %d", IAlog.m21943a(this), Integer.valueOf(this.f18735i), Integer.valueOf(this.f18734h));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: c */
    public final int mo20803c() {
        return this.f18730e;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: c */
    public final int mo20804c(C7983k c7983k, String str) {
        String str2 = this.f18738l;
        c7983k.getClass();
        String strM20421a = C7983k.m20421a(str, "rat", "bidding", "perc", C7983k.m20423e(str2));
        String strM20421a2 = C7983k.m20421a(str, "rat", "bidding", "perc", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numMo20416a = c7983k.mo20416a(strM20421a2);
        int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 15;
        Integer numMo20416a2 = c7983k.mo20416a(strM20421a);
        return numMo20416a2 != null ? numMo20416a2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.AbstractC8420a
    /* JADX INFO: renamed from: d */
    public final void mo20805d(C7983k c7983k, String str) {
        super.mo20805d(c7983k, str);
        Boolean boolMo20420c = c7983k.mo20420c("reverse_retries");
        this.f18732g = boolMo20420c != null ? boolMo20420c.booleanValue() : true;
        String strM20421a = C7983k.m20421a("retry_interval", "rat", "bidding");
        Integer numMo20416a = c7983k.mo20416a(C7983k.m20421a("retry_interval", "all_mediators"));
        int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 100;
        Integer numMo20416a2 = c7983k.mo20416a(strM20421a);
        if (numMo20416a2 != null) {
            iIntValue = numMo20416a2.intValue();
        }
        this.f18730e = iIntValue;
        this.f18728c = (this.f18735i + this.f18734h) - (iIntValue + this.f18731f);
        String strM20421a2 = C7983k.m20421a("bidding", "irat", C7983k.m20423e(this.f18738l));
        Integer numMo20416a3 = c7983k.mo20416a(C7983k.m20421a("bidding", "irat", "all_mediators"));
        int iIntValue2 = numMo20416a3 != null ? numMo20416a3.intValue() : 10000;
        Integer numMo20416a4 = c7983k.mo20416a(strM20421a2);
        if (numMo20416a4 != null) {
            iIntValue2 = numMo20416a4.intValue();
        }
        this.f18729d = iIntValue2;
        this.f18739m = ((double) Math.min(this.f18737k, this.f18736j)) / ((double) Math.max(this.f18737k, this.f18736j));
        m20806b(this.f18729d);
        this.f18726a = Math.max(0, m20797a());
        if (this.f18732g) {
            IAlog.m21945a("%s : RequestBiddingAdTimeout shouldReverseRetries - reversing timeouts", IAlog.m21943a(this));
            mo20798a(0);
        }
        IAlog.m21945a("%s : RequestBiddingAdTimeout init timeouts, total retries: %d", IAlog.m21943a(this), Integer.valueOf(this.f18726a));
    }
}
