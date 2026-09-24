package com.ironsource;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.tf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12536tf {

    /* JADX INFO: renamed from: a */
    public static final C12536tf f32480a = new C12536tf();

    /* JADX INFO: renamed from: b */
    private static final Lazy f32481b = LazyKt.lazy(a.f32482a);

    /* JADX INFO: renamed from: com.ironsource.tf$a */
    static final class a extends Lambda implements Function0<C11771Yd> {

        /* JADX INFO: renamed from: a */
        public static final a f32482a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11771Yd invoke() {
            return new C11771Yd(16, null, null, 6, null);
        }
    }

    private C12536tf() {
    }

    /* JADX INFO: renamed from: a */
    public final void m33824a(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m33823a(this, action, 0L, 2, null);
    }

    /* JADX INFO: renamed from: a */
    private final C11771Yd m33822a() {
        return (C11771Yd) f32481b.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m33823a(C12536tf c12536tf, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c12536tf.m33825a(runnable, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m33825a(Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        m33822a().schedule(action, j, TimeUnit.MILLISECONDS);
    }
}
