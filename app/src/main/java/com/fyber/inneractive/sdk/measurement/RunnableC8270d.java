package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8270d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f18431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8271e f18432b;

    public RunnableC8270d(C8271e c8271e, Context context) {
        this.f18432b = c8271e;
        this.f18431a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Omid.activate(this.f18431a);
            this.f18432b.f18437e = Partner.createPartner("Fyber", InneractiveAdManager.getVersion());
            C8271e.m20673a(this.f18432b, this.f18431a);
            IAlog.m21945a("OMID SDK was activated - version %s", Omid.getVersion());
            IAlog.m21948d("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th) {
            IAlog.m21945a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.f18432b.getClass();
            AbstractC8434z.m20811a(th.getClass().getSimpleName(), "OpenMeasurementMeasurer - " + th.getMessage(), null, null);
        }
    }
}
