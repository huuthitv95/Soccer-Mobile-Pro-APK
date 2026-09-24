package com.fyber.inneractive.sdk.web;

import com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a;
import com.fyber.inneractive.sdk.ignite.C8247g;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9257q0 implements InterfaceC4257a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9270v0 f21657a;

    public C9257q0(C9270v0 c9270v0) {
        this.f21657a = c9270v0;
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a
    /* JADX INFO: renamed from: a */
    public final void mo20301a() {
        IAlog.m21945a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        C9270v0 c9270v0 = this.f21657a;
        c9270v0.f21678b.m20648a(c9270v0.f21679c, new C8247g(c9270v0.f21682f, c9270v0.f21680d, c9270v0.f21684h.f18326a));
        this.f21657a.m22091d("onShowInstallStarted();");
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a
    /* JADX INFO: renamed from: a */
    public final void mo20302a(String str) {
        IAlog.m21945a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}
