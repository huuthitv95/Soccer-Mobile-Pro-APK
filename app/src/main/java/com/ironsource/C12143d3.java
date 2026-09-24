package com.ironsource;

import com.google.android.material.internal.ViewUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12143d3 implements InterfaceC11347Ab {

    /* JADX INFO: renamed from: a */
    private final BannerAdRequest f30193a;

    /* JADX INFO: renamed from: b */
    private final BannerAdLoaderListener f30194b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12203g1 f30195c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12451r1 f30196d;

    public C12143d3(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, InterfaceC12203g1 adapterConfigProvider, InterfaceC12451r1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f30193a = adRequest;
        this.f30194b = publisherListener;
        this.f30195c = adapterConfigProvider;
        this.f30196d = analyticsFactory;
    }

    @Override // com.ironsource.InterfaceC11347Ab
    /* JADX INFO: renamed from: a */
    public InterfaceC12604xb mo25303a() throws Exception {
        IronSourceError ironSourceErrorM33743a;
        String instanceId = this.f30193a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.BANNER;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC12469s1 interfaceC12469s1Mo33137a = this.f30196d.mo33137a(new C12314m1(sDKVersion, instanceId, enumC12328a, false, false, false, 56, null));
        try {
            C12622yb c12622ybMo27200a = new C12640zb(this.f30193a.getAdm(), this.f30193a.getProviderName$mediationsdk_release(), this.f30195c, C12170ec.f30306e.m31373a().m31369c().get()).mo27200a();
            new C12107b3(c12622ybMo27200a, this.f30193a.getSize()).mo26555a();
            C12444qc c12444qc = new C12444qc();
            C12398o2 c12398o2 = new C12398o2(this.f30193a.getAdm(), this.f30193a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f30193a;
            AdSize size = bannerAdRequest.getSize();
            Intrinsics.checkNotNull(c12622ybMo27200a);
            C11613P7 c11613p7 = C11613P7.f25510a;
            return new C11795a3(bannerAdRequest, size, c12398o2, c12622ybMo27200a, c12444qc, interfaceC12469s1Mo33137a, new C12125c3(c11613p7, this.f30194b), new C11482I2(interfaceC12469s1Mo33137a, c11613p7.m27223d()), null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            if (e instanceof C12172ee) {
                ironSourceErrorM33743a = ((C12172ee) e).m31375a();
            } else {
                C12526t5 c12526t5 = C12526t5.f32437a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorM33743a = c12526t5.m33743a(message);
            }
            return new C12473s5(ironSourceErrorM33743a, new C12125c3(C11613P7.f25510a, this.f30194b), interfaceC12469s1Mo33137a);
        }
    }

    public /* synthetic */ C12143d3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC12203g1 interfaceC12203g1, InterfaceC12451r1 interfaceC12451r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC12203g1, (i & 8) != 0 ? new C12433q1(IronSource.EnumC12328a.BANNER) : interfaceC12451r1);
    }
}
