package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Od */
/* JADX INFO: loaded from: classes6.dex */
public final class C11601Od implements InterfaceC11347Ab {

    /* JADX INFO: renamed from: a */
    private final RewardedAdRequest f25300a;

    /* JADX INFO: renamed from: b */
    private final RewardedAdLoaderListener f25301b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12203g1 f25302c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12451r1 f25303d;

    public C11601Od(RewardedAdRequest adRequest, RewardedAdLoaderListener publisherListener, InterfaceC12203g1 adapterConfigProvider, InterfaceC12451r1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f25300a = adRequest;
        this.f25301b = publisherListener;
        this.f25302c = adapterConfigProvider;
        this.f25303d = analyticsFactory;
    }

    @Override // com.ironsource.InterfaceC11347Ab
    /* JADX INFO: renamed from: a */
    public InterfaceC12604xb mo25303a() throws Exception {
        IronSourceError ironSourceErrorM33751d;
        String instanceId = this.f25300a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.REWARDED_VIDEO;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC12469s1 interfaceC12469s1Mo33137a = this.f25303d.mo33137a(new C12314m1(sDKVersion, instanceId, enumC12328a, false, false, false, 56, null));
        try {
            C12622yb c12622ybMo27200a = new C12640zb(this.f25300a.getAdm(), this.f25300a.getProviderName$mediationsdk_release(), this.f25302c, C12170ec.f30306e.m31373a().m31369c().get()).mo27200a();
            new C11565Md(c12622ybMo27200a).mo26555a();
            C12444qc c12444qc = new C12444qc();
            C12398o2 c12398o2 = new C12398o2(this.f25300a.getAdm(), this.f25300a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.f25300a;
            Intrinsics.checkNotNull(c12622ybMo27200a);
            C11613P7 c11613p7 = C11613P7.f25510a;
            return new C11547Ld(rewardedAdRequest, c12622ybMo27200a, new C11583Nd(c11613p7, this.f25301b), c12398o2, c12444qc, interfaceC12469s1Mo33137a, new C11457Gd(interfaceC12469s1Mo33137a, c11613p7.m27223d()), null, null, 384, null);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            if (e instanceof C12172ee) {
                ironSourceErrorM33751d = ((C12172ee) e).m31375a();
            } else {
                C12526t5 c12526t5 = C12526t5.f32437a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorM33751d = c12526t5.m33751d(message);
            }
            return new C12562v5(this.f25300a, new C11583Nd(C11613P7.f25510a, this.f25301b), interfaceC12469s1Mo33137a, ironSourceErrorM33751d);
        }
    }

    public /* synthetic */ C11601Od(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC12203g1 interfaceC12203g1, InterfaceC12451r1 interfaceC12451r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC12203g1, (i & 8) != 0 ? new C12433q1(IronSource.EnumC12328a.REWARDED_VIDEO) : interfaceC12451r1);
    }
}
