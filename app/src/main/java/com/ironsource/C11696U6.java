package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.U6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11696U6 implements InterfaceC11713V6 {

    /* JADX INFO: renamed from: a */
    private final long f25886a;

    /* JADX INFO: renamed from: b */
    private final EnumC11764Y6 f25887b;

    public C11696U6(long j, EnumC11764Y6 recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.f25886a = j;
        this.f25887b = recoveryStrategy;
    }

    @Override // com.ironsource.InterfaceC11713V6
    /* JADX INFO: renamed from: a */
    public long mo27595a() {
        return this.f25886a;
    }

    @Override // com.ironsource.InterfaceC11713V6
    /* JADX INFO: renamed from: b */
    public EnumC11764Y6 mo27596b() {
        return this.f25887b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11696U6(C11747X6 feature) {
        this(feature.mo27519a(), feature.mo27520c());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }
}
