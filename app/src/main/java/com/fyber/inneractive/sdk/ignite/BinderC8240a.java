package com.fyber.inneractive.sdk.ignite;

import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9259r0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.a */
/* JADX INFO: loaded from: classes4.dex */
public final class BinderC8240a extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final C9259r0 f18397a;

    public BinderC8240a(C9259r0 c9259r0) {
        this.f18397a = c9259r0;
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        IAlog.m21945a("CancelTaskCallback onError %s", str);
        this.f18397a.m22088a(false);
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
        IAlog.m21945a("CancelTaskCallback onProgress %s", str);
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
        IAlog.m21945a("CancelTaskCallback onScheduled %s", str);
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
        IAlog.m21945a("CancelTaskCallback onStart %s", str);
    }

    @Override // com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        IAlog.m21945a("CancelTaskCallback onSuccess %s", str);
        this.f18397a.m22088a(true);
    }
}
