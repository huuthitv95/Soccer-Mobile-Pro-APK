package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.u7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4088u7 implements InterfaceC4066t7 {

    /* JADX INFO: renamed from: a */
    public final Lazy f16475a = LazyKt.lazy(b.f16478b);

    /* JADX INFO: renamed from: b */
    public final Lazy f16476b = LazyKt.lazy(a.f16477b);

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u7$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f16477b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return C3951o2.m18870a(0, null, 3, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.u7$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final b f16478b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return C3951o2.m18868a(4, 0L, null, 6, null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4066t7
    /* JADX INFO: renamed from: a */
    public ExecutorService mo19460a() {
        return (ExecutorService) this.f16475a.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4066t7
    /* JADX INFO: renamed from: b */
    public ScheduledExecutorService mo19461b() {
        return (ScheduledExecutorService) this.f16476b.getValue();
    }
}
