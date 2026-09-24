package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2933di {

    /* JADX INFO: renamed from: ri */
    private static boolean f8789ri;

    /* JADX INFO: renamed from: ri */
    public static ISDKTypeFactory m11289ri(PAGLoadListener pAGLoadListener) {
        if (f8789ri) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(-1, PAGErrorCode.LOAD_SDK_DISABLE_MSG);
            }
            return null;
        }
        ISDKTypeFactory sdkTypeFactory = SDKTypeConfig.getSdkTypeFactory();
        if (sdkTypeFactory != null) {
            return sdkTypeFactory;
        }
        if (pAGLoadListener != null) {
            pAGLoadListener.onError(5000, PAGErrorCode.LOAD_FACTORY_NULL_MSG);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11290ri(boolean z) {
        f8789ri = z;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m11291ri() {
        return f8789ri;
    }
}
