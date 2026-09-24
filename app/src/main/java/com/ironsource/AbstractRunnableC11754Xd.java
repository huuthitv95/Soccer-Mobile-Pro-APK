package com.ironsource;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Xd */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractRunnableC11754Xd implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final a f26559a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.Xd$a */
    public static final class a {

        /* JADX INFO: renamed from: com.ironsource.Xd$a$a, reason: collision with other inner class name */
        public static final class C15519a extends AbstractRunnableC11754Xd {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Function0<Unit> f26560b;

            C15519a(Function0<Unit> function0) {
                this.f26560b = function0;
            }

            @Override // com.ironsource.AbstractRunnableC11754Xd
            /* JADX INFO: renamed from: a */
            public void mo25366a() {
                this.f26560b.invoke();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractRunnableC11754Xd m27962a(Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C15519a(block);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo25366a() throws Exception;

    /* JADX INFO: renamed from: a */
    public void mo27961a(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        C12518sf.m33680a(t);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo25366a();
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            try {
                mo27961a(th);
            } catch (Throwable th2) {
                C12317m4.m32153d().m32155a(th2);
            }
        }
    }
}
