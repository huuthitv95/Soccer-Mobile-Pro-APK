package com.fyber.inneractive.sdk.player.p277ui;

import com.fyber.inneractive.sdk.player.controller.AbstractC8485z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9194u1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8886j implements InterfaceC9194u1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8888l f20890b;

    public C8886j(AbstractC8888l abstractC8888l, int i) {
        this.f20890b = abstractC8888l;
        this.f20889a = i;
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9194u1
    /* JADX INFO: renamed from: a */
    public final void mo20394a() {
        if (this.f20890b.f20883h) {
            IAlog.m21945a("Autoclick is aborted - app in background", new Object[0]);
        } else {
            IAlog.m21945a("Autoclick is triggered", new Object[0]);
            ((AbstractC8485z) this.f20890b.f20882g).m20932a(this.f20889a, AbstractC8888l.f20892J);
        }
        this.f20890b.m21458p();
    }
}
