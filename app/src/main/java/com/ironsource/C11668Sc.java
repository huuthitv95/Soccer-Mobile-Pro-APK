package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Sc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11668Sc implements InterfaceC12403o7, InterfaceC12403o7.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12400o4 f25668a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11469H7 f25669b;

    /* JADX INFO: renamed from: c */
    private final Map<String, C11651Rc> f25670c;

    public C11668Sc(InterfaceC12400o4 currentTimeProvider, InterfaceC11469H7 repository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f25668a = currentTimeProvider;
        this.f25669b = repository;
        this.f25670c = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, C11651Rc> m27478a() {
        return this.f25670c;
    }

    @Override // com.ironsource.InterfaceC12403o7.a
    /* JADX INFO: renamed from: b */
    public void mo25658b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.f25670c.get(identifier) == null) {
            return;
        }
        this.f25669b.mo25984a(this.f25668a.mo32926a(), identifier);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m27477a(C11651Rc c11651Rc, String str) {
        Long lMo25983a = this.f25669b.mo25983a(str);
        return lMo25983a != null && this.f25668a.mo32926a() - lMo25983a.longValue() < c11651Rc.m27376a();
    }

    @Override // com.ironsource.InterfaceC12403o7
    /* JADX INFO: renamed from: a */
    public C11447G3 mo25656a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C11651Rc c11651Rc = this.f25670c.get(identifier);
        if (c11651Rc == null) {
            return new C11447G3(false, null, 2, null);
        }
        if (m27477a(c11651Rc, identifier)) {
            return new C11447G3(true, EnumC11483I3.Pacing);
        }
        return new C11447G3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC12403o7.a
    /* JADX INFO: renamed from: a */
    public Object mo25657a(String identifier, EnumC11483I3 cappingType, InterfaceC12320m7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objMo32213b = cappingConfig.mo32213b();
        if (Result.m44953isSuccessimpl(objMo32213b)) {
            C11651Rc c11651Rc = (C11651Rc) objMo32213b;
            if (c11651Rc != null) {
                this.f25670c.put(identifier, c11651Rc);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(Unit.INSTANCE);
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objMo32213b);
        if (thM44949exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m44946constructorimpl(Unit.INSTANCE);
    }
}
