package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3742f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3859k1 f14128a;

    /* JADX INFO: renamed from: b */
    public final Lazy f14129b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.f$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3719e invoke() {
            return new C3719e(C3742f.this.f14128a.mo18319c());
        }
    }

    public C3742f(InterfaceC3859k1 androidComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        this.f14128a = androidComponent;
        this.f14129b = LazyKt.lazy(new a());
    }

    /* JADX INFO: renamed from: a */
    public C3719e m17598a() {
        return (C3719e) this.f14129b.getValue();
    }
}
