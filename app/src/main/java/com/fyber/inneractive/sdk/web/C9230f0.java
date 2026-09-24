package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.mraid.AbstractC8326e;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.f0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9230f0 implements InterfaceC9229f {

    /* JADX INFO: renamed from: a */
    public final AbstractC8326e f21556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC9239i0 f21557b;

    public C9230f0(AbstractC9239i0 abstractC9239i0, AbstractC8326e abstractC8326e) {
        this.f21557b = abstractC9239i0;
        this.f21556a = abstractC8326e;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9229f
    /* JADX INFO: renamed from: a */
    public final String mo22054a() {
        return this.f21556a.mo20718c();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9229f
    /* JADX INFO: renamed from: b */
    public final void mo22055b() {
        AbstractC8326e abstractC8326e = this.f21556a;
        if (abstractC8326e != null) {
            abstractC8326e.mo20719d();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9229f
    /* JADX INFO: renamed from: c */
    public final String mo22056c() {
        return this.f21556a.f18600a;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9229f
    /* JADX INFO: renamed from: d */
    public final void mo22057d() {
        IAmraidWebViewController iAmraidWebViewController = (IAmraidWebViewController) this.f21557b;
        if (iAmraidWebViewController.f21622I != null) {
            iAmraidWebViewController.f21622I.mo20679a();
        }
        this.f21556a.mo20721a();
    }

    public final String toString() {
        return "action = " + this.f21556a.f18600a + " url = " + this.f21556a.mo20718c();
    }
}
