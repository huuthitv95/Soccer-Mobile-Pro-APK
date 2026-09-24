package com.fyber.inneractive.sdk.config.global.features;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.features.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C7986n extends AbstractC7981i implements InterfaceC7988p {
    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(45L);
        timeUnit.toMillis(5L);
        timeUnit.toMillis(5L);
        timeUnit.toMillis(45L);
        timeUnit.toMillis(10L);
        timeUnit.toMillis(2L);
        timeUnit.toMillis(15L);
        timeUnit.toMillis(8L);
    }

    public C7986n() {
        super("bid_net");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC7981i
    /* JADX INFO: renamed from: b */
    public final AbstractC7981i mo20413b() {
        C7986n c7986n = new C7986n();
        m20418a(c7986n);
        return c7986n;
    }
}
