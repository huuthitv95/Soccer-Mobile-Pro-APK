package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.e0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8082e0 implements InterfaceC8135n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8124h0 f17979a;

    public C8082e0(C8124h0 c8124h0) {
        this.f17979a = c8124h0;
    }

    /* JADX INFO: renamed from: a */
    public final void m20497a(InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e, InneractiveInfrastructureError inneractiveInfrastructureError) {
        C8006r c8006r;
        if (this.f17979a.f18086n.get()) {
            IAlog.m21945a("%s : onAdRequestFailed: spot is already destroyed", C8124h0.m20543a(this.f17979a));
            C8124h0 c8124h0 = this.f17979a;
            C8169p c8169p = c8124h0.f18084l;
            c8124h0.m20547a(c8124h0.f18077e);
            return;
        }
        if (this.f17979a.f18074b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f17979a.m20545a(inneractiveAdRequest, abstractC9087e);
            }
            C8124h0 c8124h1 = this.f17979a;
            if (!c8124h1.f18082j) {
                InterfaceC8122g0 interfaceC8122g0 = c8124h1.f18081i;
                if (interfaceC8122g0 != null) {
                    interfaceC8122g0.onAdRefreshFailed(c8124h1, inneractiveInfrastructureError.getErrorCode());
                    return;
                }
                return;
            }
            C8133m c8133m = c8124h1.f18080h;
            C8169p c8169p2 = c8124h1.f18084l;
            JSONArray jSONArrayM20435b = null;
            C8006r c8006r2 = c8169p2 != null ? c8169p2.f18186c : null;
            if (c8133m != null && (c8006r = c8133m.f18186c) != null) {
                jSONArrayM20435b = c8006r.m20435b();
            } else if (c8006r2 != null) {
                jSONArrayM20435b = c8006r2.m20435b();
            }
            AbstractC8073a.m20470a(inneractiveAdRequest, inneractiveInfrastructureError, c8124h1.f18077e, abstractC9087e, jSONArrayM20435b);
            C8124h0 c8124h2 = this.f17979a;
            InneractiveAdSpot.RequestListener requestListener = c8124h2.f18074b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(c8124h2, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
