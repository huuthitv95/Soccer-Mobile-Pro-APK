package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.network.C8390k1;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8241b implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8248h f18398a;

    public C8241b(C8248h c8248h) {
        this.f18398a = c8248h;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        IgniteResponseOuterClass$IgniteResponse igniteResponseOuterClass$IgniteResponse = (IgniteResponseOuterClass$IgniteResponse) obj;
        this.f18398a.getClass();
        if (exc == null && igniteResponseOuterClass$IgniteResponse != null && igniteResponseOuterClass$IgniteResponse.hasClientId() && igniteResponseOuterClass$IgniteResponse.hasClientSecret()) {
            this.f18398a.onCredentialsRequestSuccess(igniteResponseOuterClass$IgniteResponse.getClientId(), igniteResponseOuterClass$IgniteResponse.getClientSecret());
            return;
        }
        String message = "";
        IAlog.m21945a("Failed to fetch ignite client credentials with error: %s", exc != null ? exc.getMessage() : "");
        this.f18398a.getClass();
        if (!(exc instanceof C8390k1) || ((C8390k1) exc).f18665a != 204) {
            this.f18398a.m20647a(EnumC8250j.FAILED_TO_RETRIEVE_CREDENTIALS, exc != null ? exc.getMessage() : null);
        }
        if (exc != null && exc.getMessage() != null) {
            message = exc.getMessage();
        }
        this.f18398a.onCredentialsRequestFailed(message);
    }
}
