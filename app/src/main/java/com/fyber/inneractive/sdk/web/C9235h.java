package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9151g0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C9235h implements InterfaceC9229f {

    /* JADX INFO: renamed from: a */
    public final String f21560a;

    /* JADX INFO: renamed from: b */
    public final C9152g1 f21561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC9238i f21562c;

    public C9235h(AbstractC9238i abstractC9238i, String str, C9152g1 c9152g1) {
        this.f21562c = abstractC9238i;
        this.f21561b = c9152g1;
        this.f21560a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9229f
    /* JADX INFO: renamed from: a */
    public final String mo22054a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9229f
    /* JADX INFO: renamed from: b */
    public final void mo22055b() {
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9229f
    /* JADX INFO: renamed from: c */
    public final String mo22056c() {
        return "open";
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9229f
    /* JADX INFO: renamed from: d */
    public final void mo22057d() {
        AbstractC9238i abstractC9238i = this.f21562c;
        String str = this.f21560a;
        C9152g1 c9152g1 = this.f21561b;
        InterfaceC9243j1 interfaceC9243j1 = abstractC9238i.f21570g;
        if (interfaceC9243j1 != null) {
            EnumC9151g0 enumC9151g0 = interfaceC9243j1.mo20920a(str, c9152g1).f21443a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.f21560a;
    }
}
