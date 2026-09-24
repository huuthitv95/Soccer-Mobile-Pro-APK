package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.rk */
/* JADX INFO: loaded from: classes3.dex */
public final class C4035rk implements InterfaceC3991pk {

    /* JADX INFO: renamed from: a */
    public final Lazy f16203a;

    /* JADX INFO: renamed from: b */
    public final Lazy f16204b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.rk$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3859k1 f16205b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3859k1 interfaceC3859k1) {
            super(0);
            this.f16205b = interfaceC3859k1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3916mc invoke() {
            return new C3916mc(this.f16205b.getContext(), this.f16205b.mo18320d(), this.f16205b.mo18327k());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.rk$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final b f16206b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3983pc invoke() {
            return new C3983pc();
        }
    }

    public C4035rk(InterfaceC3859k1 androidComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        this.f16203a = LazyKt.lazy(new a(androidComponent));
        this.f16204b = LazyKt.lazy(b.f16206b);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3991pk
    /* JADX INFO: renamed from: a */
    public InterfaceC4123vk mo19079a() {
        return (InterfaceC4123vk) this.f16204b.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3991pk
    /* JADX INFO: renamed from: b */
    public InterfaceC4013qk mo19080b() {
        return (InterfaceC4013qk) this.f16203a.getValue();
    }
}
