package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.AbstractC8476q;
import com.fyber.inneractive.sdk.player.controller.RunnableC8469j;
import com.fyber.inneractive.sdk.player.enums.EnumC8489b;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8854a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f20795b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C8869p f20796c;

    public RunnableC8854a(C8869p c8869p, int i, int i2) {
        this.f20796c = c8869p;
        this.f20794a = i;
        this.f20795b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20796c.f20821i != null) {
            Locale locale = Locale.ENGLISH;
            String str = "Player Error: " + this.f20794a + ", " + this.f20795b;
            InterfaceC8867n interfaceC8867n = this.f20796c.f20821i;
            C8868o c8868o = new C8868o(str);
            AbstractC8476q abstractC8476q = (AbstractC8476q) interfaceC8867n;
            abstractC8476q.m20907a(EnumC8489b.Error);
            IAlog.m21945a("%sonPlayerError called with: %s for onPlayerError", IAlog.m21943a(abstractC8476q), c8868o);
            abstractC8476q.f18875i.post(new RunnableC8469j(abstractC8476q, c8868o));
            abstractC8476q.m20909k();
        }
    }
}
