package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3189di extends xha {

    /* JADX INFO: renamed from: ri */
    private static volatile C3189di f10564ri;

    private C3189di(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: ri */
    public static C3189di m13325ri(Context context) {
        if (f10564ri == null) {
            synchronized (C3189di.class) {
                if (f10564ri == null) {
                    f10564ri = new C3189di(context);
                }
            }
        }
        return f10564ri;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xha
    /* JADX INFO: renamed from: ri */
    public /* bridge */ /* synthetic */ xha.C3361ik mo13326ri() {
        return super.mo13326ri();
    }
}
