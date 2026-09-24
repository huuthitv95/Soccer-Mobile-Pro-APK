package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: renamed from: com.ironsource.R6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11645R6 implements InterfaceC12465rf {

    /* JADX INFO: renamed from: a */
    private final a f25568a;

    /* JADX INFO: renamed from: com.ironsource.R6$a */
    public interface a {

        /* JADX INFO: renamed from: com.ironsource.R6$a$a, reason: collision with other inner class name */
        public interface InterfaceC15516a {
            void cancel();
        }

        /* JADX INFO: renamed from: a */
        InterfaceC15516a mo27337a(Runnable runnable, long j);
    }

    /* JADX INFO: renamed from: com.ironsource.R6$b */
    public static final class b extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f25569b;

        b(Runnable runnable) {
            this.f25569b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            this.f25569b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11645R6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC12465rf
    /* JADX INFO: renamed from: a */
    public InterfaceC12465rf.a mo27336a(Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        return new InterfaceC12465rf.a(this.f25568a.mo27337a(m27334a(task), Duration.m46302getInWholeMillisecondsimpl(j)));
    }

    public C11645R6(a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f25568a = handler;
    }

    public /* synthetic */ C11645R6(a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C11662S6.m27451a(new Handler(Looper.getMainLooper())) : aVar);
    }

    @Override // com.ironsource.InterfaceC12465rf
    /* JADX INFO: renamed from: a */
    public InterfaceC12465rf.a mo27335a(InterfaceC12465rf.b task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        return mo27336a(task.m33254a(), j);
    }

    /* JADX INFO: renamed from: a */
    private final AbstractRunnableC11754Xd m27334a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC11754Xd ? (AbstractRunnableC11754Xd) runnable : new b(runnable);
    }
}
