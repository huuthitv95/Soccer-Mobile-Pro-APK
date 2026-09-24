package com.fyber.inneractive.sdk.click;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.n */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7940n implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7928b f17638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7944r f17639b;

    public RunnableC7940n(C7944r c7944r, C7928b c7928b) {
        this.f17639b = c7944r;
        this.f17638a = c7928b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7941o interfaceC7941o = this.f17639b.f17644e;
        if (interfaceC7941o != null) {
            interfaceC7941o.mo20328a(this.f17638a);
        }
    }
}
