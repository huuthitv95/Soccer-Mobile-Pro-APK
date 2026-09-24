package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.f */
/* JADX INFO: compiled from: ExecutorDelivery.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13836f implements InterfaceC13868w {

    /* JADX INFO: renamed from: a */
    private final Executor f39444a;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.f$a */
    /* JADX INFO: compiled from: ExecutorDelivery.java */
    class a implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f39445a;

        a(Handler handler) {
            this.f39445a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f39445a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.f$b */
    /* JADX INFO: compiled from: ExecutorDelivery.java */
    private static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final AbstractC13850t f39447a;

        /* JADX INFO: renamed from: b */
        private final C13867v f39448b;

        /* JADX INFO: renamed from: c */
        private final Runnable f39449c;

        public b(AbstractC13850t abstractC13850t, C13867v c13867v, Runnable runnable) {
            this.f39447a = abstractC13850t;
            this.f39448b = c13867v;
            this.f39449c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39447a.m41250v()) {
                this.f39447a.m41233c("canceled-at-delivery");
                return;
            }
            if (this.f39448b.m41336a()) {
                this.f39447a.mo41118a(this.f39448b.f39590a);
            } else {
                this.f39447a.m41228b(this.f39448b.f39592c);
            }
            if (this.f39448b.f39593d) {
                this.f39447a.m41224a("intermediate-response");
            } else {
                this.f39447a.m41233c("done");
            }
            Runnable runnable = this.f39449c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C13836f(Handler handler) {
        this.f39444a = new a(handler);
    }

    public C13836f(Executor executor) {
        this.f39444a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC13868w
    /* JADX INFO: renamed from: a */
    public void mo41102a(AbstractC13850t<?> abstractC13850t, AbstractC13831b0 abstractC13831b0) {
        abstractC13850t.m41224a("post-error");
        this.f39444a.execute(new b(abstractC13850t, C13867v.m41334a(abstractC13831b0), null));
    }

    @Override // com.mbridge.msdk.tracker.network.InterfaceC13868w
    /* JADX INFO: renamed from: a */
    public void mo41103a(AbstractC13850t<?> abstractC13850t, C13867v<?> c13867v) {
        m41104a(abstractC13850t, c13867v, null);
    }

    /* JADX INFO: renamed from: a */
    public void m41104a(AbstractC13850t<?> abstractC13850t, C13867v<?> c13867v, Runnable runnable) {
        abstractC13850t.m41251w();
        abstractC13850t.m41224a("post-response");
        this.f39444a.execute(new b(abstractC13850t, c13867v, runnable));
    }
}
