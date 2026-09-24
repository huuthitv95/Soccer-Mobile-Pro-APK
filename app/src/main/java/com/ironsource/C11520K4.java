package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: renamed from: com.ironsource.K4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11520K4 implements InterfaceC12385n7 {

    /* JADX INFO: renamed from: a */
    private final Boolean f24817a;

    public C11520K4(Boolean bool) {
        this.f24817a = bool;
    }

    @Override // com.ironsource.InterfaceC12385n7
    /* JADX INFO: renamed from: a */
    public Object mo25262a() {
        Boolean bool = this.f24817a;
        if (bool == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m44946constructorimpl(bool);
    }
}
