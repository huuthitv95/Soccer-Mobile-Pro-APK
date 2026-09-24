package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9088f;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9238i;
import com.fyber.inneractive.sdk.web.InterfaceC9232g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8171q implements InterfaceC9232g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8175s f18205a;

    public C8171q(C8175s c8175s) {
        this.f18205a = c8175s;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9232g
    /* JADX INFO: renamed from: a */
    public final void mo20538a(AbstractC9238i abstractC9238i) {
        C8175s c8175s = this.f18205a;
        c8175s.getClass();
        IAlog.m21945a("%sweb view returned onReady!", IAlog.m21943a(c8175s));
        AbstractC9087e abstractC9087e = this.f18205a.f18090b;
        UnitDisplayType unitDisplayType = abstractC9087e != null ? ((C9088f) abstractC9087e).f21314n : null;
        if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
            C8175s c8175s2 = this.f18205a;
            c8175s2.getClass();
            try {
                EnumC8424u enumC8424u = EnumC8424u.EVENT_READY_ON_CLIENT;
                InneractiveAdRequest inneractiveAdRequest = c8175s2.f18089a;
                AbstractC8236x abstractC8236x = c8175s2.f18091c;
                new C8428w(enumC8424u, inneractiveAdRequest, abstractC8236x != null ? ((C8172q0) abstractC8236x).f18374b : null).m20808a((String) null);
            } catch (Exception unused) {
            }
        }
        this.f18205a.m20556f();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9232g
    /* JADX INFO: renamed from: a */
    public final void mo20539a(AbstractC9238i abstractC9238i, InneractiveInfrastructureError inneractiveInfrastructureError) {
        C8175s c8175s = this.f18205a;
        c8175s.getClass();
        AbstractC9183r.f21477a.execute(new RunnableC8081e(new C8119f(c8175s.f18090b, c8175s.f18089a, "send_failed_display_creatives", c8175s.f18095g.m20435b()), inneractiveInfrastructureError));
        C8175s c8175s2 = this.f18205a;
        c8175s2.getClass();
        IAlog.m21945a("%sweb view returned onFailedLoading!", IAlog.m21943a(c8175s2));
        this.f18205a.m20552b(inneractiveInfrastructureError);
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
            EnumC8415t enumC8415t = EnumC8415t.MRAID_ERROR_UNSECURE_CONTENT;
            C8175s c8175s3 = this.f18205a;
            new C8428w(enumC8415t, c8175s3.f18089a, c8175s3.f18090b).m20808a((String) null);
        }
    }
}
