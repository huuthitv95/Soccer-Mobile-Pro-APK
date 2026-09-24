package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.a */
/* JADX INFO: loaded from: classes4.dex */
public final class CallableC8439a implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8445g f18774a;

    public CallableC8439a(C8445g c8445g) {
        this.f18774a = c8445g;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f18774a) {
            C8445g c8445g = this.f18774a;
            if (c8445g.f18795i == null) {
                return null;
            }
            c8445g.m20828d();
            C8445g c8445g2 = this.f18774a;
            int i = c8445g2.f18797k;
            if (i >= 2000 && i >= c8445g2.f18796j.size()) {
                this.f18774a.m20826c();
                this.f18774a.f18797k = 0;
            }
            return null;
        }
    }
}
