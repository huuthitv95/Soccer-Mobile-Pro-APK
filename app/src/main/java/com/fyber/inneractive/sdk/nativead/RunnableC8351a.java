package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.player.cache.AbstractC8450l;
import com.fyber.inneractive.sdk.player.cache.C8445g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.nativead.a */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8351a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8352b f18612a;

    public RunnableC8351a(C8352b c8352b) {
        this.f18612a = c8352b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        File fileM20724a = C8352b.m20724a(this.f18612a);
        if (fileM20724a != null) {
            try {
                IAlog.m21945a("NativeCache opening the cache in directory - %s", fileM20724a);
                this.f18612a.f18615b = C8445g.m20819a(fileM20724a, 41943040L);
                C8445g c8445g = this.f18612a.f18615b;
                c8445g.getClass();
                IAlog.m21949e("DiskLruCache delete cache", new Object[0]);
                c8445g.close();
                AbstractC8450l.m20833a(c8445g.f18787a);
                this.f18612a.f18615b = C8445g.m20819a(fileM20724a, 41943040L);
                C8445g c8445g2 = this.f18612a.f18615b;
                synchronized (c8445g2) {
                    j = c8445g2.f18794h;
                }
                IAlog.m21945a("NativeCache opened the cache in directory - %s current size is %d", fileM20724a, Long.valueOf(j));
                C8352b c8352b = this.f18612a;
                c8352b.f18615b.f18798l = c8352b;
                c8352b.f18616c = true;
            } catch (Throwable th) {
                AbstractC8434z.m20811a("Failed to open cache directory", th.getMessage(), null, null);
                IAlog.m21944a("Failed to open cache directory", th, new Object[0]);
            }
        }
    }
}
