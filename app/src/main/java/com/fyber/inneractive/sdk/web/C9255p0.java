package com.fyber.inneractive.sdk.web;

import com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a;
import com.fyber.inneractive.sdk.ignite.C8247g;
import com.fyber.inneractive.sdk.network.EnumC8415t;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.p0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9255p0 implements InterfaceC4257a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f21653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f21654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9270v0 f21655c;

    public C9255p0(C9270v0 c9270v0, String str, String str2) {
        this.f21655c = c9270v0;
        this.f21653a = str;
        this.f21654b = str2;
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a
    /* JADX INFO: renamed from: a */
    public final void mo20301a() {
        C9270v0 c9270v0 = this.f21655c;
        c9270v0.f21678b.m20648a(c9270v0.f21679c, new C8247g(c9270v0.f21682f, c9270v0.f21680d, c9270v0.f21684h.f18326a));
        this.f21655c.m22091d("onShowInstallStarted();");
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a
    /* JADX INFO: renamed from: a */
    public final void mo20302a(String str) {
        C9270v0 c9270v0 = this.f21655c;
        c9270v0.f21678b.m20649m();
        c9270v0.m22091d("onInstallationFailed();");
        C9270v0 c9270v1 = this.f21655c;
        c9270v1.f21684h.m20626a(EnumC8415t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.f21653a, this.f21654b, c9270v1.f21680d);
    }
}
