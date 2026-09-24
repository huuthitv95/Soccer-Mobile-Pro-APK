package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12620y9 implements InterfaceC11347Ab {

    /* JADX INFO: renamed from: a */
    private final InterstitialAdRequest f33225a;

    /* JADX INFO: renamed from: b */
    private final InterstitialAdLoaderListener f33226b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12203g1 f33227c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC12451r1 f33228d;

    public C12620y9(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, InterfaceC12203g1 adapterConfigProvider, InterfaceC12451r1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f33225a = adRequest;
        this.f33226b = publisherListener;
        this.f33227c = adapterConfigProvider;
        this.f33228d = analyticsFactory;
    }

    @Override // com.ironsource.InterfaceC11347Ab
    /* JADX INFO: renamed from: a */
    public InterfaceC12604xb mo25303a() throws Exception {
        IronSourceError ironSourceErrorM33746b;
        String instanceId = this.f33225a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.EnumC12328a enumC12328a = IronSource.EnumC12328a.INTERSTITIAL;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC12469s1 interfaceC12469s1Mo33137a = this.f33228d.mo33137a(new C12314m1(sDKVersion, instanceId, enumC12328a, false, false, false, 56, null));
        try {
            C12622yb c12622ybMo27200a = new C12640zb(this.f33225a.getAdm(), this.f33225a.getProviderName$mediationsdk_release(), this.f33227c, C12170ec.f30306e.m31373a().m31369c().get()).mo27200a();
            new C12584w9(c12622ybMo27200a).mo26555a();
            C12444qc c12444qc = new C12444qc();
            C12398o2 c12398o2 = new C12398o2(this.f33225a.getAdm(), this.f33225a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f33225a;
            Intrinsics.checkNotNull(c12622ybMo27200a);
            C11613P7 c11613p7 = C11613P7.f25510a;
            return new C12566v9(interstitialAdRequest, c12622ybMo27200a, new C12602x9(c11613p7, this.f33226b), c12398o2, c12444qc, interfaceC12469s1Mo33137a, new C12459r9(interfaceC12469s1Mo33137a, c11613p7.m27223d()), null, null, 384, null);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            if (e instanceof C12172ee) {
                ironSourceErrorM33746b = ((C12172ee) e).m31375a();
            } else {
                C12526t5 c12526t5 = C12526t5.f32437a;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorM33746b = c12526t5.m33746b(message);
            }
            return new C12544u5(this.f33225a, new C12602x9(C11613P7.f25510a, this.f33226b), interfaceC12469s1Mo33137a, ironSourceErrorM33746b);
        }
    }

    public /* synthetic */ C12620y9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC12203g1 interfaceC12203g1, InterfaceC12451r1 interfaceC12451r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC12203g1, (i & 8) != 0 ? new C12433q1(IronSource.EnumC12328a.INTERSTITIAL) : interfaceC12451r1);
    }
}
