package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12140d0 implements InterfaceC12122c0 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12569vc f30191a;

    public C12140d0(InterfaceC12569vc networkShowApi) {
        Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.f30191a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC12122c0
    /* JADX INFO: renamed from: a */
    public void mo31207a(Activity activity, C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.m25997g() + " adInstanceId=" + adInstance.m25995e());
        this.f30191a.mo33957a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC12122c0
    /* JADX INFO: renamed from: a */
    public boolean mo31208a(C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.f30191a.mo33958a(adInstance);
    }
}
