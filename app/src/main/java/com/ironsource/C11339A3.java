package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: renamed from: com.ironsource.A3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11339A3 implements InterfaceC12385n7 {

    /* JADX INFO: renamed from: a */
    private final Boolean f23785a;

    /* JADX INFO: renamed from: b */
    private final Integer f23786b;

    /* JADX INFO: renamed from: c */
    private final EnumC11465H3 f23787c;

    public C11339A3(Boolean bool, Integer num, EnumC11465H3 enumC11465H3) {
        this.f23785a = bool;
        this.f23786b = num;
        this.f23787c = enumC11465H3;
    }

    @Override // com.ironsource.InterfaceC12385n7
    /* JADX INFO: renamed from: a */
    public Object mo25262a() {
        Boolean bool = this.f23785a;
        if (bool == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(Boolean.FALSE);
        }
        Integer num = this.f23786b;
        if (num == null || num.intValue() <= 0) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new Exception("limit flag is not provided or invalid")));
        }
        if (this.f23787c == null) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new Exception("unit flag is not provided or invalid")));
        }
        Result.Companion companion5 = Result.INSTANCE;
        return Result.m44946constructorimpl(Boolean.TRUE);
    }
}
