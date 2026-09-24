package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C11453G9;
import com.ironsource.C11692U2;
import com.ironsource.C12261j5;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC11592O4;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.C12352e;
import com.ironsource.mediationsdk.C12353f;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.c */
/* JADX INFO: loaded from: classes6.dex */
public class C12337c implements InterfaceC12343i.a {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, C12338d> f31118a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private InterfaceC11592O4 f31119b;

    public C12337c(List<NetworkSettings> list, C11692U2 c11692u2, String str, String str2, InterfaceC11592O4 interfaceC11592O4) {
        String strM32764d = IronSourceUtils.m32764d();
        boolean zM27567k = c11692u2.m27567k();
        this.f31119b = interfaceC11592O4;
        C12352e c12352e = new C12352e(new C12353f(c11692u2.m27560d(), strM32764d));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterM32318a = C12332c.m32303b().m32318a(networkSettings, networkSettings.getBannerSettings(), true);
                if (abstractAdapterM32318a != null) {
                    C12338d c12338d = new C12338d(str, str2, networkSettings, c11692u2.m27558b(), abstractAdapterM32318a, c12352e);
                    c12338d.m32436a(zM27567k);
                    this.f31118a.put(c12338d.m32446l(), c12338d);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.a
    /* JADX INFO: renamed from: a */
    public void mo32358a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C12338d c12338d = this.f31118a.get(str);
        if (c12338d != null) {
            c12338d.m32370a(iSDemandOnlyBannerLayout);
            return;
        }
        this.f31119b.mo26723a(EnumC12598x5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().m34031a(str, ironSourceErrorBuildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.a
    /* JADX INFO: renamed from: a */
    public void mo32359a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C12338d c12338d = this.f31118a.get(str);
        if (c12338d == null) {
            this.f31119b.mo26723a(EnumC12598x5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.getListener().m34031a(str, ironSourceErrorBuildNonExistentInstanceError);
            return;
        }
        c12338d.m32371a(iSDemandOnlyBannerLayout, new InterfaceC12349o.a(C11453G9.m25865b(C12261j5.m31853b().m31855c(), str2)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12343i.a
    /* JADX INFO: renamed from: a */
    public synchronized void mo32360a(String str) {
        C12338d c12338d = this.f31118a.get(str);
        if (c12338d == null) {
            this.f31119b.mo26723a(EnumC12598x5.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
            return;
        }
        c12338d.m32374r();
    }
}
