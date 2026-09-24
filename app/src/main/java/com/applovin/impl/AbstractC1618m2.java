package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.m2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1618m2 {

    /* JADX INFO: renamed from: a */
    private static boolean f2054a;

    /* JADX INFO: renamed from: a */
    public static void m3176a() {
        f2054a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3177a(C1748l c1748l) {
        if (f2054a) {
            return;
        }
        c1748l.m4764E().m2677a(C1548f2.f1515Z0, "no_ads_loaded");
    }

    /* JADX INFO: renamed from: b */
    public static void m3178b(final C1748l c1748l) {
        Long l = (Long) c1748l.m4801a(AbstractC1776t3.f3362p8);
        if (l.longValue() <= 0) {
            return;
        }
        c1748l.m4853s0().m2605a(new C1788u6(c1748l, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.m2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1618m2.m3177a(c1748l);
            }
        }), C1552f6.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }
}
