package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class SDKTypeConfig {

    /* JADX INFO: renamed from: ri */
    private static ISDKTypeFactory f8547ri;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return f8547ri;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        f8547ri = iSDKTypeFactory;
    }
}
