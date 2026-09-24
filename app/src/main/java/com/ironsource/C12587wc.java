package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.wc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12587wc implements InterfaceC12569vc {
    @Override // com.ironsource.InterfaceC12569vc
    /* JADX INFO: renamed from: a */
    public void mo33957a(Activity activity, C11471H9 adInstance, Map<String, String> showParams) throws Exception {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.InterfaceC12569vc
    /* JADX INFO: renamed from: a */
    public boolean mo33958a(C11471H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
