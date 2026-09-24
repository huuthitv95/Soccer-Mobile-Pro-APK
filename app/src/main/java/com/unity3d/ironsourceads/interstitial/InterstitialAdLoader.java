package com.unity3d.ironsourceads.interstitial;

import com.ironsource.C11613P7;
import com.ironsource.C12170ec;
import com.ironsource.C12620y9;
import com.ironsource.InterfaceC11347Ab;
import com.ironsource.InterfaceC12604xb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.Executor;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAdLoader {
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();

    /* JADX INFO: renamed from: a */
    private static final Executor f41424a = C11613P7.f25510a.m27223d();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m43186a(InterfaceC12604xb loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    @JvmStatic
    public static final void loadAd(InterstitialAdRequest adRequest, InterstitialAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f41424a, new C12620y9(adRequest, listener, C12170ec.f30306e.m31374a(IronSource.EnumC12328a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(Executor executor, InterfaceC11347Ab loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final InterfaceC12604xb interfaceC12604xbMo25303a = loadTaskProvider.mo25303a();
        executor.execute(new Runnable() { // from class: com.unity3d.ironsourceads.interstitial.InterstitialAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoader.m43186a(interfaceC12604xbMo25303a);
            }
        });
    }
}
