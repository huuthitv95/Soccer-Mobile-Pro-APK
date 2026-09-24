package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.e0 */
/* JADX INFO: compiled from: LimitExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
public class ExecutorC13193e0 implements Executor {

    /* JADX INFO: renamed from: a */
    private Runnable f36285a;

    /* JADX INFO: renamed from: b */
    private Runnable f36286b;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.e0$a */
    /* JADX INFO: compiled from: LimitExecutor.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f36287a;

        a(Runnable runnable) {
            this.f36287a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36287a.run();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("LimitExecutor", e.getMessage());
                }
            } finally {
                ExecutorC13193e0.this.m37666a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (this.f36285a == null) {
            this.f36285a = m37665a(runnable);
            C13187c0.m37643a().execute(this.f36285a);
        } else if (this.f36286b == null) {
            this.f36286b = m37665a(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private Runnable m37665a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m37666a() {
        Runnable runnable = this.f36286b;
        this.f36285a = runnable;
        this.f36286b = null;
        if (runnable != null) {
            C13187c0.m37643a().execute(this.f36285a);
        }
    }
}
