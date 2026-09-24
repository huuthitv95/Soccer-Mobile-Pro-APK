package com.ironsource;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.S6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11662S6 {
    /* JADX INFO: renamed from: a */
    public static final C11645R6.a m27451a(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        return new a(handler);
    }

    /* JADX INFO: renamed from: com.ironsource.S6$a */
    public static final class a implements C11645R6.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Handler f25663a;

        a(Handler handler) {
            this.f25663a = handler;
        }

        @Override // com.ironsource.C11645R6.a
        /* JADX INFO: renamed from: a */
        public C11645R6.a.InterfaceC15516a mo27337a(final Runnable runnable, long j) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f25663a.postDelayed(runnable, j);
            final Handler handler = this.f25663a;
            return new C11645R6.a.InterfaceC15516a() { // from class: com.ironsource.S6$a$$ExternalSyntheticLambda0
                @Override // com.ironsource.C11645R6.a.InterfaceC15516a
                public final void cancel() {
                    C11662S6.a.m27453a(handler, runnable);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m27453a(Handler this_asScheduler, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this_asScheduler, "$this_asScheduler");
            Intrinsics.checkNotNullParameter(runnable, "$runnable");
            this_asScheduler.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC12465rf.b m27452a(T t, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return InterfaceC12465rf.b.f31847b.m33255a(t, block);
    }
}
