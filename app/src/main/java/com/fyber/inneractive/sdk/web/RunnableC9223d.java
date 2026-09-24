package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9223d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9238i f21536a;

    public RunnableC9223d(AbstractC9240i1 abstractC9240i1) {
        this.f21536a = abstractC9240i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC9238i abstractC9238i = this.f21536a;
        if (abstractC9238i.f21574k) {
            IAlog.m21945a("No user web action detected for : %s blocking.", abstractC9238i.f21575l);
            AbstractC9238i abstractC9238i2 = this.f21536a;
            String strMo22056c = abstractC9238i2.f21575l.mo22056c();
            String strMo22054a = this.f21536a.f21575l.mo22054a();
            InterfaceC9243j1 interfaceC9243j1 = abstractC9238i2.f21570g;
            if (interfaceC9243j1 != null) {
                interfaceC9243j1.mo20923a(strMo22056c, strMo22054a);
            }
            IAlog.m21948d("AD_AUTO_CLICK_DETECTED", new Object[0]);
            this.f21536a.f21575l.mo22055b();
            this.f21536a.m22064i();
        } else {
            IAlog.m21945a("User web action detected for: %s", abstractC9238i.f21575l);
            this.f21536a.f21575l.mo22057d();
        }
        this.f21536a.f21575l = null;
    }
}
