package com.mbridge.msdk.foundation.same.task;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.C13223s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.b */
/* JADX INFO: compiled from: CommonTaskLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13164b {

    /* JADX INFO: renamed from: a */
    ThreadPoolExecutor f36196a;

    /* JADX INFO: renamed from: b */
    HashMap<Long, AbstractRunnableC13163a> f36197b;

    /* JADX INFO: renamed from: c */
    WeakReference<Context> f36198c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.task.b$a */
    /* JADX INFO: compiled from: CommonTaskLoader.java */
    class a implements AbstractRunnableC13163a.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractRunnableC13163a f36199a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractRunnableC13163a.a f36200b;

        a(AbstractRunnableC13163a abstractRunnableC13163a, AbstractRunnableC13163a.a aVar) {
            this.f36199a = abstractRunnableC13163a;
            this.f36200b = aVar;
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a.a
        /* JADX INFO: renamed from: a */
        public void mo34752a(AbstractRunnableC13163a.b bVar) {
            if (bVar == AbstractRunnableC13163a.b.CANCEL || bVar == AbstractRunnableC13163a.b.FINISH) {
                C13164b.this.f36197b.remove(Long.valueOf(this.f36199a.getId()));
            } else if (bVar == AbstractRunnableC13163a.b.RUNNING && C13164b.this.f36198c.get() == null) {
                C13164b.this.m37534a();
            }
            AbstractRunnableC13163a.a aVar = this.f36200b;
            if (aVar != null) {
                aVar.mo34752a(bVar);
            }
        }
    }

    public C13164b(Context context, int i) {
        if (C13223s0.m37831a().m37842a("c_t_l_t_p", true)) {
            this.f36196a = C13165c.m37539b();
        } else {
            if (i == 0) {
                this.f36196a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f36196a = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f36196a.allowCoreThreadTimeOut(true);
        }
        this.f36197b = new HashMap<>();
        this.f36198c = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public void m37535a(AbstractRunnableC13163a abstractRunnableC13163a) {
        m37533a(abstractRunnableC13163a, null);
        this.f36196a.execute(abstractRunnableC13163a);
    }

    /* JADX INFO: renamed from: b */
    public void m37536b(AbstractRunnableC13163a abstractRunnableC13163a, AbstractRunnableC13163a.a aVar) {
        m37533a(abstractRunnableC13163a, aVar);
        this.f36196a.execute(abstractRunnableC13163a);
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m37533a(AbstractRunnableC13163a abstractRunnableC13163a, AbstractRunnableC13163a.a aVar) {
        this.f36197b.put(Long.valueOf(abstractRunnableC13163a.getId()), abstractRunnableC13163a);
        abstractRunnableC13163a.setOnStateChangeListener(new a(abstractRunnableC13163a, aVar));
    }

    public C13164b(Context context) {
        if (C13223s0.m37831a().m37842a("c_t_l_t_p", true)) {
            this.f36196a = C13165c.m37539b();
        } else {
            if (C13223s0.m37831a().m37842a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f36196a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f36196a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f36196a.allowCoreThreadTimeOut(true);
        }
        this.f36197b = new HashMap<>();
        this.f36198c = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m37534a() {
        try {
            Iterator<Map.Entry<Long, AbstractRunnableC13163a>> it = this.f36197b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f36197b.clear();
        } catch (Exception unused) {
        }
    }
}
