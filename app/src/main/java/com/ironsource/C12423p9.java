package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12423p9 {

    /* JADX INFO: renamed from: a */
    private final Handler f31709a;

    /* JADX INFO: renamed from: com.ironsource.p9$a */
    public static final class a extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f31710b;

        a(Runnable runnable) {
            this.f31710b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            this.f31710b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12423p9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    private final void m33064c(Runnable runnable) {
        AbstractRunnableC11754Xd aVar = runnable instanceof AbstractRunnableC11754Xd ? (AbstractRunnableC11754Xd) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f31709a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            m33063a(this, aVar, 0L, 2, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Handler m33065a() {
        return this.f31709a;
    }

    /* JADX INFO: renamed from: b */
    public final void m33069b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        m33064c(runnable);
    }

    public C12423p9(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f31709a = handler;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33063a(C12423p9 c12423p9, AbstractRunnableC11754Xd abstractRunnableC11754Xd, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c12423p9.m33067a(abstractRunnableC11754Xd, j);
    }

    public /* synthetic */ C12423p9(Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    /* JADX INFO: renamed from: a */
    public final void m33067a(AbstractRunnableC11754Xd task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f31709a.postDelayed(task, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m33066a(AbstractRunnableC11754Xd task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f31709a.removeCallbacks(task);
    }

    /* JADX INFO: renamed from: a */
    public final void m33068a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        m33064c(callback);
    }
}
