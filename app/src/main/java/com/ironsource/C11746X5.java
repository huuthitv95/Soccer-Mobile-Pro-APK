package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.X5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11746X5 implements InterfaceC12212ga {

    /* JADX INFO: renamed from: a */
    private final RunnableC11548Le f26510a;

    /* JADX INFO: renamed from: b */
    private long f26511b;

    public C11746X5(InterfaceC12263j7 applicationLifecycleService, RunnableC11548Le task) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f26510a = task;
        applicationLifecycleService.mo26714a(this);
        m27936f();
    }

    /* JADX INFO: renamed from: e */
    private final long m27935e() {
        return System.currentTimeMillis() - this.f26511b;
    }

    /* JADX INFO: renamed from: f */
    private final void m27936f() {
        this.f26511b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC12212ga
    /* JADX INFO: renamed from: a */
    public void mo27937a() {
        this.f26510a.m26434a(Long.valueOf(m27935e()));
        this.f26510a.run();
    }

    @Override // com.ironsource.InterfaceC12212ga
    /* JADX INFO: renamed from: b */
    public void mo27938b() {
        m27936f();
    }

    @Override // com.ironsource.InterfaceC12212ga
    /* JADX INFO: renamed from: c */
    public void mo27939c() {
    }

    @Override // com.ironsource.InterfaceC12212ga
    /* JADX INFO: renamed from: d */
    public void mo27940d() {
    }
}
