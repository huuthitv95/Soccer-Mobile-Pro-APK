package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.I4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11484I4 extends AbstractC11388Cg {

    /* JADX INFO: renamed from: d */
    private final InterfaceC11635Qc f24474d;

    /* JADX INFO: renamed from: e */
    private final C12591wg f24475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11484I4(C11707V0 adTools, InterfaceC11635Qc outcomeReporter, C12591wg waterfallInstances) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f24474d = outcomeReporter;
        this.f24475e = waterfallInstances;
    }

    @Override // com.ironsource.AbstractC11388Cg
    /* JADX INFO: renamed from: a */
    public void mo25587a() {
    }

    @Override // com.ironsource.AbstractC11388Cg
    /* JADX INFO: renamed from: a */
    public void mo25588a(AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.AbstractC11388Cg
    /* JADX INFO: renamed from: b */
    public void mo25591b(AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f24474d.mo27303a(this.f24475e.m34067b(), instance);
    }

    @Override // com.ironsource.AbstractC11388Cg
    /* JADX INFO: renamed from: c */
    public void mo25592c(AbstractC11353B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
    }
}
