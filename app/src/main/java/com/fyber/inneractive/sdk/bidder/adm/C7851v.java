package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C8078c0;
import com.fyber.inneractive.sdk.flow.C8082e0;
import com.fyber.inneractive.sdk.flow.C8124h0;
import com.fyber.inneractive.sdk.flow.C8169p;
import com.fyber.inneractive.sdk.metrics.C8285d;
import com.fyber.inneractive.sdk.metrics.C8289h;
import com.fyber.inneractive.sdk.metrics.C8290i;
import com.fyber.inneractive.sdk.network.C8390k1;
import com.fyber.inneractive.sdk.network.C8403p;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.nativead.C9095a;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C7851v implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8078c0 f17509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC9087e f17510b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7854y f17511c;

    public C7851v(C7854y c7854y, C8078c0 c8078c0, AbstractC9087e abstractC9087e) {
        this.f17511c = c7854y;
        this.f17509a = c8078c0;
        this.f17510b = abstractC9087e;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        InneractiveErrorCode inneractiveErrorCode;
        AbstractC9087e abstractC9087e = (AbstractC9087e) obj;
        if (abstractC9087e == null || exc != null) {
            String message = exc != null ? exc.getMessage() : "empty";
            C8290i c8290iM20686b = C8285d.f18476d.m20686b(this.f17511c.f17517d);
            c8290iM20686b.f18490a.put(new C8289h(message), Long.valueOf(System.currentTimeMillis() - c8290iM20686b.f18492c));
            if (this.f17509a != null) {
                Exception exc2 = exc != null ? exc : new Exception("adm markup network result is empty");
                C8078c0 c8078c0 = this.f17509a;
                this.f17511c.getClass();
                if (exc == null || !(exc.getCause() instanceof C9095a)) {
                    inneractiveErrorCode = ((exc instanceof C8390k1) && ((C8390k1) exc).f18665a == 404) ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.CONNECTION_ERROR;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
                }
                c8078c0.m20495a(exc2, inneractiveErrorCode, this.f17510b);
                return;
            }
            return;
        }
        C8285d c8285d = C8285d.f18476d;
        C8290i c8290iM20686b2 = c8285d.m20686b(this.f17511c.f17517d);
        c8290iM20686b2.f18490a.put(new C8289h("success"), Long.valueOf(System.currentTimeMillis() - c8290iM20686b2.f18492c));
        C8078c0 c8078c1 = this.f17509a;
        if (c8078c1 != null) {
            IAlog.m21945a("%s : InneractiveAdSpotImpl data available", C8124h0.m20543a(c8078c1.f17971d));
            C8124h0 c8124h0 = c8078c1.f17971d;
            C8006r c8006r = c8078c1.f17969b;
            C8082e0 c8082e0 = c8124h0.f18076d;
            if (c8124h0.f18086n.get()) {
                IAlog.m21945a("%s: loadAdWithRetries: spot is already destroyed won't continue", IAlog.m21943a(c8124h0));
                c8124h0.m20547a(c8124h0.f18077e);
                return;
            }
            C8169p c8169p = c8124h0.f18084l;
            if (c8169p != null) {
                c8169p.f18185b = c8082e0;
                c8285d.m20686b(c8124h0.f18073a).f18493d = System.currentTimeMillis();
                c8169p.f18191g = abstractC9087e;
                if (!IAConfigManager.m20378d()) {
                    IAConfigManager.addListener(c8169p);
                    IAConfigManager.m20375a();
                } else {
                    c8169p.f18186c = c8006r;
                    C8403p c8403p = new C8403p(c8006r, abstractC9087e, c8124h0.f18073a, c8169p);
                    c8169p.f18187d = c8403p;
                    c8403p.m20777c();
                }
            }
        }
    }
}
