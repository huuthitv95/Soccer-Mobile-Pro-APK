package com.ironsource;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.a9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11801a9 {

    /* JADX INFO: renamed from: a */
    private final long f26768a;

    /* JADX INFO: renamed from: b */
    private final a f26769b;

    /* JADX INFO: renamed from: c */
    private final long f26770c;

    /* JADX INFO: renamed from: com.ironsource.a9$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final long f26771a;

        /* JADX INFO: renamed from: b */
        private final long f26772b;

        /* JADX INFO: renamed from: c */
        private final long f26773c;

        public a(long j, long j2, long j3) {
            this.f26771a = j;
            this.f26772b = j2;
            this.f26773c = j3;
        }

        /* JADX INFO: renamed from: a */
        public final long m28142a() {
            return this.f26771a;
        }

        /* JADX INFO: renamed from: b */
        public final long m28144b() {
            return this.f26772b;
        }

        /* JADX INFO: renamed from: c */
        public final long m28145c() {
            return this.f26773c;
        }

        /* JADX INFO: renamed from: d */
        public final long m28146d() {
            return this.f26771a;
        }

        /* JADX INFO: renamed from: e */
        public final long m28147e() {
            return this.f26772b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26771a == aVar.f26771a && this.f26772b == aVar.f26772b && this.f26773c == aVar.f26773c;
        }

        /* JADX INFO: renamed from: f */
        public final long m28148f() {
            return this.f26773c;
        }

        public int hashCode() {
            return (((UByte$$ExternalSyntheticBackport0.m43485m(this.f26771a) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f26772b)) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f26773c);
        }

        public String toString() {
            return "Memory(javaHeapKb=" + this.f26771a + ", nativeHeapKb=" + this.f26772b + ", sharedOtherKb=" + this.f26773c + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m28143a(long j, long j2, long j3) {
            return new a(j, j2, j3);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m28141a(a aVar, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.f26771a;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = aVar.f26772b;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = aVar.f26773c;
            }
            return aVar.m28143a(j4, j5, j3);
        }
    }

    public C11801a9(long j, a memory, long j2) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.f26768a = j;
        this.f26769b = memory;
        this.f26770c = j2;
    }

    /* JADX INFO: renamed from: a */
    public final long m28134a() {
        return this.f26768a;
    }

    /* JADX INFO: renamed from: b */
    public final a m28136b() {
        return this.f26769b;
    }

    /* JADX INFO: renamed from: c */
    public final long m28137c() {
        return this.f26770c;
    }

    /* JADX INFO: renamed from: d */
    public final long m28138d() {
        return this.f26770c;
    }

    /* JADX INFO: renamed from: e */
    public final a m28139e() {
        return this.f26769b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11801a9)) {
            return false;
        }
        C11801a9 c11801a9 = (C11801a9) obj;
        return this.f26768a == c11801a9.f26768a && Intrinsics.areEqual(this.f26769b, c11801a9.f26769b) && this.f26770c == c11801a9.f26770c;
    }

    /* JADX INFO: renamed from: f */
    public final long m28140f() {
        return this.f26768a;
    }

    public int hashCode() {
        return (((UByte$$ExternalSyntheticBackport0.m43485m(this.f26768a) * 31) + this.f26769b.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f26770c);
    }

    public String toString() {
        return "InitParsingMetrics(parsingDurationMs=" + this.f26768a + ", memory=" + this.f26769b + ", initResponseJsonSizeKb=" + this.f26770c + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11801a9 m28135a(long j, a memory, long j2) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        return new C11801a9(j, memory, j2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11801a9 m28133a(C11801a9 c11801a9, long j, a aVar, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c11801a9.f26768a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            aVar = c11801a9.f26769b;
        }
        a aVar2 = aVar;
        if ((i & 4) != 0) {
            j2 = c11801a9.f26770c;
        }
        return c11801a9.m28135a(j3, aVar2, j2);
    }
}
