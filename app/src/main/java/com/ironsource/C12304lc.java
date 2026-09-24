package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.lc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12304lc implements InterfaceC12286kc {
    @Override // com.ironsource.InterfaceC12286kc
    /* JADX INFO: renamed from: a */
    public void mo31951a(InterfaceC11474Hc onNetworkSDKInitListener) {
        Intrinsics.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC12286kc
    /* JADX INFO: renamed from: b */
    public void mo31953b(String controllerUrl) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC12286kc
    /* JADX INFO: renamed from: a */
    public void mo31950a(Context applicationContext, String applicationKey, String userId, Map<String, String> initParams) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC12286kc
    /* JADX INFO: renamed from: a */
    public void mo31952a(String controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.InterfaceC12286kc
    /* JADX INFO: renamed from: a */
    public void mo31949a(int i) {
        SDKUtils.setDebugMode(i);
    }
}
