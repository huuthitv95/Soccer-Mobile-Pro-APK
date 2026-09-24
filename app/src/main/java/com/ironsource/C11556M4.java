package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.M4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11556M4 implements InterfaceC12403o7, InterfaceC12403o7.a {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, C11502J4> f25117a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC12403o7
    /* JADX INFO: renamed from: a */
    public C11447G3 mo25656a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C11502J4 c11502j4 = this.f25117a.get(identifier);
        return (c11502j4 == null || c11502j4.m26175a()) ? new C11447G3(false, null, 2, null) : new C11447G3(true, EnumC11483I3.Delivery);
    }

    @Override // com.ironsource.InterfaceC12403o7.a
    /* JADX INFO: renamed from: b */
    public void mo25658b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC12403o7.a
    /* JADX INFO: renamed from: a */
    public Object mo25657a(String identifier, EnumC11483I3 cappingType, InterfaceC12320m7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objMo32212a = cappingConfig.mo32212a();
        if (Result.m44953isSuccessimpl(objMo32212a)) {
            C11502J4 c11502j4 = (C11502J4) objMo32212a;
            if (c11502j4 != null) {
                this.f25117a.put(identifier, c11502j4);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(Unit.INSTANCE);
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objMo32212a);
        if (thM44949exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m44946constructorimpl(Unit.INSTANCE);
    }
}
