package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.jf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12271jf implements InterfaceC12403o7, InterfaceC12403o7.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12400o4 f30705a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11596O8 f30706b;

    /* JADX INFO: renamed from: c */
    private final Map<String, C12217gf> f30707c;

    /* JADX INFO: renamed from: com.ironsource.jf$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private int f30708a;

        /* JADX INFO: renamed from: b */
        private long f30709b;

        /* JADX INFO: renamed from: c */
        private Long f30710c;

        public a(int i, long j, Long l) {
            this.f30708a = i;
            this.f30709b = j;
            this.f30710c = l;
        }

        /* JADX INFO: renamed from: a */
        public final int m31904a() {
            return this.f30708a;
        }

        /* JADX INFO: renamed from: b */
        public final long m31909b() {
            return this.f30709b;
        }

        /* JADX INFO: renamed from: c */
        public final Long m31910c() {
            return this.f30710c;
        }

        /* JADX INFO: renamed from: d */
        public final int m31911d() {
            return this.f30708a;
        }

        /* JADX INFO: renamed from: e */
        public final long m31912e() {
            return this.f30709b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30708a == aVar.f30708a && this.f30709b == aVar.f30709b && Intrinsics.areEqual(this.f30710c, aVar.f30710c);
        }

        /* JADX INFO: renamed from: f */
        public final Long m31913f() {
            return this.f30710c;
        }

        public int hashCode() {
            int iM43485m = ((this.f30708a * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f30709b)) * 31;
            Long l = this.f30710c;
            return iM43485m + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f30708a + ", currentTime=" + this.f30709b + ", currentTimeThreshold=" + this.f30710c + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m31905a(int i, long j, Long l) {
            return new a(i, j, l);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m31903a(a aVar, int i, long j, Long l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.f30708a;
            }
            if ((i2 & 2) != 0) {
                j = aVar.f30709b;
            }
            if ((i2 & 4) != 0) {
                l = aVar.f30710c;
            }
            return aVar.m31905a(i, j, l);
        }

        /* JADX INFO: renamed from: a */
        public final void m31906a(int i) {
            this.f30708a = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m31907a(long j) {
            this.f30709b = j;
        }

        /* JADX INFO: renamed from: a */
        public final void m31908a(Long l) {
            this.f30710c = l;
        }
    }

    public C12271jf(InterfaceC12400o4 currentTimeProvider, InterfaceC11596O8 serviceDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.f30705a = currentTimeProvider;
        this.f30706b = serviceDataRepository;
        this.f30707c = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: c */
    private final a m31901c(String str) {
        return new a(this.f30706b.mo26736a(str), this.f30705a.mo32926a(), this.f30706b.mo26739b(str));
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, C12217gf> m31902a() {
        return this.f30707c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    @Override // com.ironsource.InterfaceC12403o7.a
    /* JADX INFO: renamed from: b */
    public void mo25658b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C12217gf c12217gf = this.f30707c.get(identifier);
        if (c12217gf == null) {
            return;
        }
        a aVarM31901c = m31901c(identifier);
        if (aVarM31901c.m31911d() != 0) {
            long jM31912e = aVarM31901c.m31912e();
            Long lM31913f = aVarM31901c.m31913f();
            if (jM31912e >= (lM31913f != null ? lM31913f.longValue() : 0L)) {
                this.f30706b.mo26738a(aVarM31901c.m31912e() + EnumC11465H3.m25975a(c12217gf.m31565b(), null, 1, null), identifier);
                aVarM31901c.m31906a(0);
            }
        } else {
            this.f30706b.mo26738a(aVarM31901c.m31912e() + EnumC11465H3.m25975a(c12217gf.m31565b(), null, 1, null), identifier);
            aVarM31901c.m31906a(0);
        }
        aVarM31901c.m31906a(aVarM31901c.m31911d() + 1);
        this.f30706b.mo26737a(aVarM31901c.m31911d(), identifier);
    }

    @Override // com.ironsource.InterfaceC12403o7
    /* JADX INFO: renamed from: a */
    public C11447G3 mo25656a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C12217gf c12217gf = this.f30707c.get(identifier);
        if (c12217gf == null) {
            return new C11447G3(false, null, 2, null);
        }
        return m31900a(c12217gf, identifier) ? new C11447G3(true, EnumC11483I3.ShowCount) : new C11447G3(false, null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m31900a(C12217gf c12217gf, String str) {
        a aVarM31901c = m31901c(str);
        Long lM31913f = aVarM31901c.m31913f();
        if (lM31913f != null) {
            long jLongValue = lM31913f.longValue();
            if (aVarM31901c.m31911d() >= c12217gf.m31564a() && this.f30705a.mo32926a() < jLongValue) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC12403o7.a
    /* JADX INFO: renamed from: a */
    public Object mo25657a(String identifier, EnumC11483I3 cappingType, InterfaceC12320m7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object objMo32214c = cappingConfig.mo32214c();
        if (Result.m44953isSuccessimpl(objMo32214c)) {
            C12217gf c12217gf = (C12217gf) objMo32214c;
            if (c12217gf != null) {
                this.f30707c.put(identifier, c12217gf);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(Unit.INSTANCE);
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objMo32214c);
        if (thM44949exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m44946constructorimpl(Unit.INSTANCE);
    }
}
