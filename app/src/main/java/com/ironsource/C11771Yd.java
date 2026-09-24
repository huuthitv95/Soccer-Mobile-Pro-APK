package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.Yd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11771Yd extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: a */
    private final Function1<Throwable, Unit> f26647a;

    /* JADX INFO: renamed from: b */
    private final Function1<String, Unit> f26648b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.ironsource.Yd$a */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        public static final a f26649a = new a();

        a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m28055a(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            m28055a(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.ironsource.Yd$b */
    public static final class b extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a */
        public static final b f26650a = new b();

        b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m28056a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            m28056a(str);
            return Unit.INSTANCE;
        }
    }

    public C11771Yd() {
        this(0, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a */
    private final String m28054a(String str) {
        return C11771Yd.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th != null) {
            this.f26648b.invoke(m28054a(th.toString()));
            this.f26647a.invoke(th);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e) {
                C12317m4.m32153d().m32155a(e);
                this.f26648b.invoke(m28054a(e.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                C12317m4.m32153d().m32155a(e2);
                this.f26648b.invoke(m28054a(e2.toString()));
                this.f26647a.invoke(e2);
            } catch (ExecutionException e3) {
                C12317m4.m32153d().m32155a(e3);
                this.f26648b.invoke(m28054a(e3.toString()));
                this.f26647a.invoke(e3.getCause());
            }
        }
    }

    public /* synthetic */ C11771Yd(int i, Function1 function1, Function1 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C11788Zd.f26697a : i, (i2 & 2) != 0 ? a.f26649a : function1, (i2 & 4) != 0 ? b.f26650a : function2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11771Yd(int i, Function1<? super Throwable, Unit> report, Function1<? super String, Unit> log) {
        super(i, new ThreadFactoryC12132ca());
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(log, "log");
        this.f26647a = report;
        this.f26648b = log;
    }
}
