package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.AbstractC8167o;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8406q implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8412s f18695a;

    public C8406q(C8412s c8412s) {
        this.f18695a = c8412s;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        InneractiveErrorCode inneractiveErrorCode;
        AbstractC8167o abstractC8167o;
        AbstractC9087e abstractC9087e = (AbstractC9087e) obj;
        if (exc == null) {
            C8412s c8412s = this.f18695a;
            c8412s.m20772a(c8412s.f18705e, abstractC9087e);
            return;
        }
        this.f18695a.getClass();
        if (exc instanceof C8390k1) {
            inneractiveErrorCode = ((C8390k1) exc).f18665a == 204 ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.SERVER_INTERNAL_ERROR;
        } else {
            inneractiveErrorCode = (!(exc instanceof FileNotFoundException) && (exc instanceof C8398n0)) ? InneractiveErrorCode.SERVER_INVALID_RESPONSE : InneractiveErrorCode.CONNECTION_ERROR;
        }
        C8412s c8412s2 = this.f18695a;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, EnumC8125i.NETWORK_ERROR, exc);
        InneractiveAdRequest inneractiveAdRequest = c8412s2.f18705e;
        if (c8412s2.f18681a == null) {
            return;
        }
        if (c8412s2.f18682b) {
            IAlog.m21949e("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
        } else {
            if (c8412s2.f18682b || (abstractC8167o = c8412s2.f18681a) == null) {
                return;
            }
            abstractC8167o.m20580a(inneractiveAdRequest, abstractC9087e, inneractiveInfrastructureError);
        }
    }
}
