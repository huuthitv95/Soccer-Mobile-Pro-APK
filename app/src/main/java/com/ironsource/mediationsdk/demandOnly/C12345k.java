package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C11453G9;
import com.ironsource.C11652Rd;
import com.ironsource.C12261j5;
import com.ironsource.C12317m4;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC11592O4;
import com.ironsource.InterfaceC11714V7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.C12352e;
import com.ironsource.mediationsdk.C12353f;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.k */
/* JADX INFO: loaded from: classes6.dex */
public class C12345k implements InterfaceC12343i.c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11592O4 f31181a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap<String, C12346l> f31182b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11714V7<ISDemandOnlyRewardedVideoListener> f31183c;

    public C12345k(List<NetworkSettings> list, C11652Rd c11652Rd, C12332c c12332c, InterfaceC11714V7<ISDemandOnlyRewardedVideoListener> interfaceC11714V7, String str, String str2, InterfaceC11592O4 interfaceC11592O4) {
        String strM32764d = IronSourceUtils.m32764d();
        boolean zM27383d = c11652Rd.m27383d();
        C12353f c12353f = new C12353f(c11652Rd.m27390k(), strM32764d);
        this.f31182b = new ConcurrentHashMap<>();
        this.f31181a = interfaceC11592O4;
        this.f31183c = interfaceC11714V7;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterM32318a = c12332c.m32318a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (abstractAdapterM32318a != null) {
                    C12346l c12346l = new C12346l(str, str2, networkSettings, this.f31183c.mo27669a(networkSettings.getSubProviderId()), c11652Rd.m27388i(), abstractAdapterM32318a, new C12352e(c12353f));
                    c12346l.m32436a(zM27383d);
                    this.f31182b.put(networkSettings.getSubProviderId(), c12346l);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.c
    /* JADX INFO: renamed from: a */
    public void mo32410a(InterfaceC12342h.d dVar) {
        String strMo32397e = dVar.mo32397e();
        try {
            C12346l c12346l = this.f31182b.get(strMo32397e);
            if (c12346l == null) {
                this.f31181a.mo26723a(EnumC12598x5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_LOAD, strMo32397e);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f31183c.mo27669a(strMo32397e).onRewardedVideoAdLoadFailed(strMo32397e, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (dVar.mo32396c()) {
                c12346l.mo32428b(new InterfaceC12349o.a(C11453G9.m25865b(C12261j5.m31853b().m31855c(), dVar.mo32395b())));
            } else {
                c12346l.mo32429c();
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f31183c.mo27669a(strMo32397e).onRewardedVideoAdLoadFailed(strMo32397e, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.c
    /* JADX INFO: renamed from: b */
    public void mo32412b(String str) {
        try {
            C12346l c12346l = this.f31182b.get(str);
            if (c12346l != null) {
                c12346l.mo32430d();
                return;
            }
            this.f31181a.mo26723a(EnumC12598x5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_SHOW, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.f31183c.mo27669a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f31183c.mo27669a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.c
    /* JADX INFO: renamed from: a */
    public boolean mo32411a(String str) {
        C12346l c12346l = this.f31182b.get(str);
        if (c12346l == null) {
            this.f31181a.mo26723a(EnumC12598x5.RV_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
            return false;
        }
        return c12346l.mo32427a();
    }

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, C12346l> m32413a() {
        return this.f31182b;
    }
}
