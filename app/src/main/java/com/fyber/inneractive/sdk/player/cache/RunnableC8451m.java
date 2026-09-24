package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.m */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8451m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8452n f18810a;

    public RunnableC8451m(C8452n c8452n) {
        this.f18810a = c8452n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        File fileM20834a = C8452n.m20834a(this.f18810a.f18812a, "fyb.vamp.vid.cache");
        if (fileM20834a != null) {
            try {
                IAlog.m21945a("VideoCache opening the cache in directory - %s", fileM20834a);
                this.f18810a.f18813b = C8445g.m20819a(fileM20834a, 52428800L);
                C8445g c8445g = this.f18810a.f18813b;
                c8445g.getClass();
                IAlog.m21949e("DiskLruCache delete cache", new Object[0]);
                c8445g.close();
                AbstractC8450l.m20833a(c8445g.f18787a);
                this.f18810a.f18813b = C8445g.m20819a(fileM20834a, 52428800L);
                C8445g c8445g2 = this.f18810a.f18813b;
                synchronized (c8445g2) {
                    j = c8445g2.f18794h;
                }
                IAlog.m21945a("VideoCache opened the cache in directory - %s current size is %d", fileM20834a, Long.valueOf(j));
                C8452n c8452n = this.f18810a;
                c8452n.f18813b.f18798l = c8452n;
                c8452n.f18814c = true;
            } catch (Throwable th) {
                AbstractC8434z.m20811a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.m21944a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
