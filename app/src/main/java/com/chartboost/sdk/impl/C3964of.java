package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.of */
/* JADX INFO: loaded from: classes3.dex */
public final class C3964of implements InterfaceC3919mf {

    /* JADX INFO: renamed from: a */
    public final Lazy f15694a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.of$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3859k1 f15695b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC4098uh f15696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3859k1 interfaceC3859k1, InterfaceC4098uh interfaceC4098uh) {
            super(0);
            this.f15695b = interfaceC3859k1;
            this.f15696c = interfaceC4098uh;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4118vf invoke() {
            return new C4118vf(new C4090u9(this.f15695b.getContext()), this.f15696c.mo19602a());
        }
    }

    public C3964of(InterfaceC3859k1 androidComponent, InterfaceC4098uh trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f15694a = LazyKt.lazy(new a(androidComponent, trackerComponent));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3919mf
    /* JADX INFO: renamed from: a */
    public InterfaceC4096uf mo18660a() {
        return (InterfaceC4096uf) this.f15694a.getValue();
    }
}
