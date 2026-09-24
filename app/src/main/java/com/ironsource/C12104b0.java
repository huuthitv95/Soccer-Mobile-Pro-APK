package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12104b0 implements InterfaceC11792a0 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12426pc f30055a;

    /* JADX INFO: renamed from: com.ironsource.b0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f30056a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f30057b = 1000;

        private a() {
        }
    }

    public C12104b0(InterfaceC12426pc networkLoadApi) {
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.f30055a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC11792a0
    /* JADX INFO: renamed from: a */
    public String mo28094a() {
        return this.f30055a.mo33070a();
    }

    @Override // com.ironsource.InterfaceC11792a0
    /* JADX INFO: renamed from: a */
    public void mo28095a(C11471H9 adInstance, Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.f30055a.mo33071a(adInstance, new C12462rc(null, false, 3, null));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.m25995e() + " failed. error: " + e.getMessage());
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder("1000: loadAd failed: ");
            sb.append(message);
            String string = sb.toString();
            InterfaceC11384Cc interfaceC11384CcM25992b = adInstance.m25992b();
            if (interfaceC11384CcM25992b instanceof C11763Y5) {
                InterfaceC11384Cc interfaceC11384CcM25992b2 = adInstance.m25992b();
                Intrinsics.checkNotNull(interfaceC11384CcM25992b2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C11763Y5) interfaceC11384CcM25992b2).onInterstitialLoadFailed(string);
            } else if (interfaceC11384CcM25992b instanceof C11420Ec) {
                InterfaceC11384Cc interfaceC11384CcM25992b3 = adInstance.m25992b();
                Intrinsics.checkNotNull(interfaceC11384CcM25992b3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((C11420Ec) interfaceC11384CcM25992b3).onBannerLoadFail(string);
            }
        }
    }
}
