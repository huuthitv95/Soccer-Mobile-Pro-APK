package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.lf */
/* JADX INFO: loaded from: classes6.dex */
public class C12307lf extends AbstractC11388Cg {

    /* JADX INFO: renamed from: d */
    private final InterfaceC11635Qc f30866d;

    /* JADX INFO: renamed from: e */
    private final C12591wg f30867e;

    /* JADX INFO: renamed from: f */
    private final AbstractC11461H f30868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12307lf(C11707V0 adTools, InterfaceC11635Qc outcomeReporter, C12591wg waterfallInstances, AbstractC11461H adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.f30866d = outcomeReporter;
        this.f30867e = waterfallInstances;
        this.f30868f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.AbstractC11388Cg
    /* JADX INFO: renamed from: a */
    public void mo25588a(AbstractC11353B instance) {
        AbstractC11353B abstractC11353BM25969a;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f30868f.m25954a(instance)) {
            this.f30866d.mo27303a(this.f30867e.m34067b(), instance);
        } else {
            if (!this.f30868f.m25953a() || (abstractC11353BM25969a = this.f30868f.m25957c().m25969a()) == null) {
                return;
            }
            this.f30866d.mo27303a(this.f30867e.m34067b(), abstractC11353BM25969a);
        }
    }

    @Override // com.ironsource.AbstractC11388Cg
    /* JADX INFO: renamed from: b */
    public void mo25591b(AbstractC11353B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.AbstractC11388Cg
    /* JADX INFO: renamed from: c */
    public void mo25592c(AbstractC11353B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.f30866d.mo27303a(this.f30867e.m34067b(), instanceToShow);
    }

    @Override // com.ironsource.AbstractC11388Cg
    /* JADX INFO: renamed from: a */
    public void mo25587a() {
        AbstractC11353B abstractC11353BM25969a = this.f30868f.m25957c().m25969a();
        if (abstractC11353BM25969a != null) {
            this.f30866d.mo27303a(this.f30867e.m34067b(), abstractC11353BM25969a);
        }
    }
}
