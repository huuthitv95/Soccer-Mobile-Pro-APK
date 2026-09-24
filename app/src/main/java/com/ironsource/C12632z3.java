package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12632z3 implements InterfaceC12320m7 {

    /* JADX INFO: renamed from: a */
    private final Boolean f33237a;

    /* JADX INFO: renamed from: b */
    private final Integer f33238b;

    /* JADX INFO: renamed from: c */
    private final EnumC11465H3 f33239c;

    public C12632z3(Boolean bool, Integer num, EnumC11465H3 enumC11465H3) {
        this.f33237a = bool;
        this.f33238b = num;
        this.f33239c = enumC11465H3;
    }

    /* JADX INFO: renamed from: a */
    private final Object m34251a(EnumC11465H3 enumC11465H3) {
        return new C11339A3(this.f33237a, this.f33238b, enumC11465H3).mo25262a();
    }

    @Override // com.ironsource.InterfaceC12320m7
    /* JADX INFO: renamed from: b */
    public Object mo32213b() {
        EnumC11465H3 enumC11465H3 = EnumC11465H3.Second;
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(m34251a(enumC11465H3));
        if (thM44949exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        C11651Rc c11651Rc = (!Intrinsics.areEqual(this.f33237a, Boolean.TRUE) || this.f33238b == null) ? null : new C11651Rc(enumC11465H3.m25978a(this.f33238b), null, 2, null);
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m44946constructorimpl(c11651Rc);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Override // com.ironsource.InterfaceC12320m7
    /* JADX INFO: renamed from: c */
    public Object mo32214c() {
        C12217gf c12217gf;
        Integer num;
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(m34251a(this.f33239c));
        if (thM44949exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        if (!Intrinsics.areEqual(this.f33237a, Boolean.TRUE) || (num = this.f33238b) == null) {
            c12217gf = null;
        } else {
            int iIntValue = num.intValue();
            EnumC11465H3 enumC11465H3 = this.f33239c;
            if (enumC11465H3 != null) {
                c12217gf = new C12217gf(iIntValue, enumC11465H3);
            } else {
                c12217gf = null;
            }
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m44946constructorimpl(c12217gf);
    }

    /* JADX INFO: renamed from: d */
    public final Boolean m34252d() {
        return this.f33237a;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m34253e() {
        return this.f33238b;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC11465H3 m34254f() {
        return this.f33239c;
    }

    @Override // com.ironsource.InterfaceC12320m7
    /* JADX INFO: renamed from: a */
    public Object mo32212a() {
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(new C11520K4(this.f33237a).mo25262a());
        if (thM44949exceptionOrNullimpl != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        Result.Companion companion2 = Result.INSTANCE;
        Boolean bool = this.f33237a;
        return Result.m44946constructorimpl(bool != null ? new C11502J4(bool.booleanValue()) : null);
    }

    public /* synthetic */ C12632z3(Boolean bool, Integer num, EnumC11465H3 enumC11465H3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : enumC11465H3);
    }
}
