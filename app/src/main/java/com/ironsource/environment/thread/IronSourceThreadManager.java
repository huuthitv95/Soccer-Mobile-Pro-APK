package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C11771Yd;
import com.ironsource.C12317m4;
import com.ironsource.HandlerThreadC11615P9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class IronSourceThreadManager {

    /* JADX INFO: renamed from: a */
    private static boolean f30339a;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* JADX INFO: renamed from: b */
    private static final Lazy f30340b = LazyKt.lazy(C12182g.f30353a);

    /* JADX INFO: renamed from: c */
    private static final Lazy f30341c = LazyKt.lazy(C12178c.f30349a);

    /* JADX INFO: renamed from: d */
    private static final Lazy f30342d = LazyKt.lazy(C12181f.f30352a);

    /* JADX INFO: renamed from: e */
    private static final Lazy f30343e = LazyKt.lazy(C12179d.f30350a);

    /* JADX INFO: renamed from: f */
    private static final Lazy f30344f = LazyKt.lazy(C12176a.f30347a);

    /* JADX INFO: renamed from: g */
    private static final Lazy f30345g = LazyKt.lazy(C12180e.f30351a);

    /* JADX INFO: renamed from: h */
    private static final Lazy f30346h = LazyKt.lazy(C12177b.f30348a);

    /* JADX INFO: renamed from: com.ironsource.environment.thread.IronSourceThreadManager$a */
    static final class C12176a extends Lambda implements Function0<HandlerThreadC11615P9> {

        /* JADX INFO: renamed from: a */
        public static final C12176a f30347a = new C12176a();

        C12176a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThreadC11615P9 invoke() {
            HandlerThreadC11615P9 handlerThreadC11615P9 = new HandlerThreadC11615P9("adapterBackground");
            handlerThreadC11615P9.start();
            handlerThreadC11615P9.m27240a();
            return handlerThreadC11615P9;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.environment.thread.IronSourceThreadManager$b */
    static final class C12177b extends Lambda implements Function0<C11771Yd> {

        /* JADX INFO: renamed from: a */
        public static final C12177b f30348a = new C12177b();

        C12177b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11771Yd invoke() {
            return new C11771Yd(0, null, null, 7, null);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.environment.thread.IronSourceThreadManager$c */
    static final class C12178c extends Lambda implements Function0<Handler> {

        /* JADX INFO: renamed from: a */
        public static final C12178c f30349a = new C12178c();

        C12178c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            HandlerThreadC11615P9 handlerThreadC11615P9 = new HandlerThreadC11615P9("IronSourceInitiatorHandler");
            handlerThreadC11615P9.start();
            handlerThreadC11615P9.m27240a();
            return new Handler(handlerThreadC11615P9.getLooper());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.environment.thread.IronSourceThreadManager$d */
    static final class C12179d extends Lambda implements Function0<HandlerThreadC11615P9> {

        /* JADX INFO: renamed from: a */
        public static final C12179d f30350a = new C12179d();

        C12179d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThreadC11615P9 invoke() {
            HandlerThreadC11615P9 handlerThreadC11615P9 = new HandlerThreadC11615P9("mediationBackground");
            handlerThreadC11615P9.start();
            handlerThreadC11615P9.m27240a();
            return handlerThreadC11615P9;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.environment.thread.IronSourceThreadManager$e */
    static final class C12180e extends Lambda implements Function0<HandlerThreadC11615P9> {

        /* JADX INFO: renamed from: a */
        public static final C12180e f30351a = new C12180e();

        C12180e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThreadC11615P9 invoke() {
            HandlerThreadC11615P9 handlerThreadC11615P9 = new HandlerThreadC11615P9("publisher-callbacks");
            handlerThreadC11615P9.start();
            handlerThreadC11615P9.m27240a();
            return handlerThreadC11615P9;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.environment.thread.IronSourceThreadManager$f */
    static final class C12181f extends Lambda implements Function0<HandlerThreadC11615P9> {

        /* JADX INFO: renamed from: a */
        public static final C12181f f30352a = new C12181f();

        C12181f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThreadC11615P9 invoke() {
            HandlerThreadC11615P9 handlerThreadC11615P9 = new HandlerThreadC11615P9("managersThread");
            handlerThreadC11615P9.start();
            handlerThreadC11615P9.m27240a();
            return handlerThreadC11615P9;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.environment.thread.IronSourceThreadManager$g */
    static final class C12182g extends Lambda implements Function0<Handler> {

        /* JADX INFO: renamed from: a */
        public static final C12182g f30353a = new C12182g();

        C12182g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    private IronSourceThreadManager() {
    }

    /* JADX INFO: renamed from: a */
    private final HandlerThreadC11615P9 m31382a() {
        return (HandlerThreadC11615P9) f30344f.getValue();
    }

    /* JADX INFO: renamed from: b */
    private final C11771Yd m31386b() {
        return (C11771Yd) f30346h.getValue();
    }

    /* JADX INFO: renamed from: c */
    private final HandlerThreadC11615P9 m31387c() {
        return (HandlerThreadC11615P9) f30343e.getValue();
    }

    /* JADX INFO: renamed from: d */
    private final HandlerThreadC11615P9 m31388d() {
        return (HandlerThreadC11615P9) f30345g.getValue();
    }

    /* JADX INFO: renamed from: e */
    private final Handler m31389e() {
        return (Handler) f30340b.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final void executeTasks(boolean z, boolean z2, List<? extends Runnable> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!z) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z2) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        for (final Runnable runnable : tasks) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.m31383a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    public final Handler getInitHandler() {
        return (Handler) f30341c.getValue();
    }

    public final HandlerThreadC11615P9 getSharedManagersThread() {
        return (HandlerThreadC11615P9) f30342d.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f30339a;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (m31385a(action)) {
            m31386b().remove(action);
        } else {
            m31382a().m27243b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (m31385a(action)) {
            m31386b().remove(action);
        } else {
            m31387c().m27243b(action);
        }
    }

    public final void removeUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m31389e().removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z) {
        f30339a = z;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m31385a(Runnable runnable) {
        return f30339a && m31386b().getQueue().contains(runnable);
    }

    public final void postAdapterBackgroundTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f30339a) {
            m31386b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            m31382a().m27242a(action, j);
        }
    }

    public final void postMediationBackgroundTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f30339a) {
            m31386b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            m31387c().m27242a(action, j);
        }
    }

    public final void postOnUiThreadTask(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        m31389e().postDelayed(action, j);
    }

    public final void postPublisherCallback(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        m31388d().m27242a(action, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31383a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.m31384a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31384a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }
}
