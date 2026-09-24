package com.fyber.inneractive.sdk.network;

import com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C7971e;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.factories.AbstractC8065d;
import com.fyber.inneractive.sdk.factories.InterfaceC8066e;
import com.fyber.inneractive.sdk.flow.AbstractC8073a;
import com.fyber.inneractive.sdk.flow.AbstractC8129k;
import com.fyber.inneractive.sdk.flow.AbstractC8167o;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8082e0;
import com.fyber.inneractive.sdk.flow.C8119f;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.flow.InterfaceC8135n;
import com.fyber.inneractive.sdk.flow.RunnableC8081e;
import com.fyber.inneractive.sdk.ignite.C8248h;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8262c;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.m */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8394m {

    /* JADX INFO: renamed from: a */
    public AbstractC8167o f18681a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f18682b = false;

    /* JADX INFO: renamed from: c */
    public final C8006r f18683c;

    /* JADX INFO: renamed from: d */
    public final String f18684d;

    public AbstractC8394m(C8006r c8006r, String str, AbstractC8167o abstractC8167o) {
        this.f18681a = abstractC8167o;
        this.f18683c = c8006r;
        this.f18684d = str;
    }

    /* JADX INFO: renamed from: a */
    public void mo20771a() {
        this.f18682b = true;
        this.f18681a = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20772a(InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e) {
        AbstractC8167o abstractC8167o;
        AbstractC8236x abstractC8236x;
        if (this.f18681a == null) {
            return;
        }
        if (this.f18682b) {
            IAlog.m21949e("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
            return;
        }
        C8028r0 c8028r0M20382a = AbstractC7945a.m20382a(abstractC9087e.f21313m);
        if (inneractiveAdRequest != null) {
            inneractiveAdRequest.setSelectedUnitConfig(c8028r0M20382a);
        }
        C7971e c7971e = new C7971e();
        ImpressionData impressionData = abstractC9087e.f21318r;
        c7971e.f17750a = impressionData != null ? impressionData.getDemandId() : null;
        try {
            c7971e.f17751b = Long.valueOf(IAConfigManager.f17654M.f17672d);
        } catch (NumberFormatException unused) {
            IAlog.m21945a("invalid publisherId", new Object[0]);
        }
        this.f18683c.m20433a(c7971e);
        InneractiveErrorCode inneractiveErrorCodeMo21891a = c8028r0M20382a == null ? InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH : abstractC9087e.mo21891a(inneractiveAdRequest, this.f18683c);
        if (inneractiveErrorCodeMo21891a != null) {
            EnumC8125i enumC8125i = EnumC8125i.CONTENT_ERROR_UNSPECIFIED;
            if (c8028r0M20382a == null || inneractiveErrorCodeMo21891a == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
                enumC8125i = EnumC8125i.NO_APP_CONFIG_AVAILABLE;
                IAlog.m21946b("%sGot configuration mismatch!", IAlog.m21943a(this));
                IAConfigManager.m20375a();
            }
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCodeMo21891a, enumC8125i);
            Exception exc = abstractC9087e.f21323w;
            if (exc != null) {
                inneractiveInfrastructureError.setCause(exc);
            }
            EnumC9083a enumC9083aM21884a = EnumC9083a.m21884a(abstractC9087e.f21307g);
            if (enumC9083aM21884a != null) {
                Exception exc2 = abstractC9087e.f21323w;
                if (exc2 != null) {
                    inneractiveInfrastructureError.setCause(exc2);
                }
                AbstractC9183r.f21477a.execute(new RunnableC8081e(new C8119f(abstractC9087e, inneractiveAdRequest, enumC9083aM21884a == EnumC9083a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", this.f18683c.m20435b()), inneractiveInfrastructureError));
            }
            C8006r c8006r = this.f18683c;
            if (c8006r == null) {
                InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(this.f18684d);
                c8006r = (spot == null || spot.getAdContent() == null) ? null : spot.getAdContent().f18375c;
            }
            AbstractC8073a.m20470a(inneractiveAdRequest, inneractiveInfrastructureError, null, abstractC9087e, c8006r != null ? c8006r.m20435b() : null);
            if (this.f18682b || (abstractC8167o = this.f18681a) == null) {
                return;
            }
            abstractC8167o.m20580a(inneractiveAdRequest, abstractC9087e, inneractiveInfrastructureError);
            return;
        }
        AbstractC8167o abstractC8167o2 = this.f18681a;
        if (abstractC8167o2.f18189f) {
            IAlog.m21949e("IAAdSourceBase: load cancelled: ignoring response. Previous load request was cancelled", new Object[0]);
            return;
        }
        C8006r c8006r2 = abstractC8167o2.f18186c;
        IAlog.m21949e("%sonAdDataAvailable: got response data: %s", abstractC8167o2.mo20561d(), abstractC9087e);
        if (abstractC9087e.m21893a()) {
            C8248h c8248h = IAConfigManager.f17654M.f17660D;
            if (c8248h.f18412f) {
                c8248h.m20645a((InterfaceC4257a) null);
            }
        }
        EnumC9083a enumC9083aM21884a2 = EnumC9083a.m21884a(abstractC9087e.f21307g);
        InterfaceC8262c interfaceC8262c = abstractC8167o2.f18184a;
        if (interfaceC8262c != null && (abstractC8236x = ((AbstractC8129k) interfaceC8262c).f18091c) != null) {
            abstractC8236x.destroy();
        }
        InterfaceC8066e interfaceC8066e = (InterfaceC8066e) AbstractC8065d.f17949a.f17950a.get(enumC9083aM21884a2);
        InterfaceC8262c interfaceC8262cMo20465a = interfaceC8066e != null ? interfaceC8066e.mo20465a() : null;
        abstractC8167o2.f18184a = interfaceC8262cMo20465a;
        if (interfaceC8262cMo20465a == null) {
            IAlog.m21950f("%sonAdDataAvailable: Cannot find content handler for ad type: %s", abstractC8167o2.mo20561d(), enumC9083aM21884a2);
            InterfaceC8135n interfaceC8135n = abstractC8167o2.f18185b;
            if (interfaceC8135n != null) {
                ((C8082e0) interfaceC8135n).m20497a(inneractiveAdRequest, abstractC9087e, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC8125i.NO_CONTENT_LOADER_AVAILABLE));
            }
        } else {
            IAlog.m21949e("%sonAdDataAvailable: found response loader: %s", abstractC8167o2.mo20561d(), abstractC8167o2.f18184a);
        }
        InterfaceC8262c interfaceC8262c2 = abstractC8167o2.f18184a;
        if (interfaceC8262c2 != null) {
            ((AbstractC8129k) interfaceC8262c2).m20550a(inneractiveAdRequest, abstractC9087e, c8006r2, abstractC8167o2, abstractC8167o2);
        } else {
            AbstractC8434z.m20811a("NullPointerException prevented", "mAdContentLoader is null", inneractiveAdRequest, abstractC9087e);
        }
    }

    /* JADX INFO: renamed from: b */
    public String mo20773b() {
        return null;
    }
}
