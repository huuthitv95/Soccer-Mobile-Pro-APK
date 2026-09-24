package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12187f3 implements InterfaceC12281k7 {

    /* JADX INFO: renamed from: com.ironsource.f3$a */
    public static final class a extends AbstractC12187f3 {

        /* JADX INFO: renamed from: a */
        private final b f30367a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b firstReason) {
            super(null);
            Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            this.f30367a = firstReason;
        }

        /* JADX INFO: renamed from: a */
        public final a m31410a(b firstReason) {
            Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            return new a(firstReason);
        }

        /* JADX INFO: renamed from: d */
        public final b m31411d() {
            return this.f30367a;
        }

        /* JADX INFO: renamed from: e */
        public final b m31412e() {
            return this.f30367a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f30367a, ((a) obj).f30367a);
        }

        public int hashCode() {
            return this.f30367a.hashCode();
        }

        public String toString() {
            return "First(firstReason=" + this.f30367a + ")";
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m31409a(a aVar, b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = aVar.f30367a;
            }
            return aVar.m31410a(bVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f3$b */
    public static abstract class b implements InterfaceC12281k7 {

        /* JADX INFO: renamed from: com.ironsource.f3$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            public static final a f30368a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$b$b, reason: collision with other inner class name */
        public static final class C15536b extends b {

            /* JADX INFO: renamed from: a */
            public static final C15536b f30369a = new C15536b();

            private C15536b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$b$c */
        public static final class c extends b {

            /* JADX INFO: renamed from: a */
            public static final c f30370a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC12281k7
        /* JADX INFO: renamed from: a */
        public String mo31406a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C15536b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new NoWhenBranchMatchedException();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f3$c */
    public static final class c extends AbstractC12187f3 {

        /* JADX INFO: renamed from: a */
        private final long f30371a;

        /* JADX INFO: renamed from: b */
        private final d f30372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, d recurringReason) {
            super(null);
            Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            this.f30371a = j;
            this.f30372b = recurringReason;
        }

        /* JADX INFO: renamed from: a */
        public final c m31414a(long j, d recurringReason) {
            Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            return new c(j, recurringReason);
        }

        /* JADX INFO: renamed from: d */
        public final long m31415d() {
            return this.f30371a;
        }

        /* JADX INFO: renamed from: e */
        public final d m31416e() {
            return this.f30372b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30371a == cVar.f30371a && Intrinsics.areEqual(this.f30372b, cVar.f30372b);
        }

        /* JADX INFO: renamed from: f */
        public final d m31417f() {
            return this.f30372b;
        }

        /* JADX INFO: renamed from: g */
        public final long m31418g() {
            return this.f30371a;
        }

        public int hashCode() {
            return (UByte$$ExternalSyntheticBackport0.m43485m(this.f30371a) * 31) + this.f30372b.hashCode();
        }

        public String toString() {
            return "Recurring(reloadDuration=" + this.f30371a + ", recurringReason=" + this.f30372b + ")";
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ c m31413a(c cVar, long j, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                j = cVar.f30371a;
            }
            if ((i & 2) != 0) {
                dVar = cVar.f30372b;
            }
            return cVar.m31414a(j, dVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f3$d */
    public static abstract class d implements InterfaceC12281k7 {

        /* JADX INFO: renamed from: com.ironsource.f3$d$a */
        public static final class a extends d {

            /* JADX INFO: renamed from: a */
            public static final a f30373a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$b */
        public static final class b extends d {

            /* JADX INFO: renamed from: a */
            public static final b f30374a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$c */
        public static final class c extends d {

            /* JADX INFO: renamed from: a */
            public static final c f30375a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$d, reason: collision with other inner class name */
        public static final class C15537d extends d {

            /* JADX INFO: renamed from: a */
            public static final C15537d f30376a = new C15537d();

            private C15537d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$e */
        public static final class e extends d {

            /* JADX INFO: renamed from: a */
            public static final e f30377a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$f */
        public static final class f extends d {

            /* JADX INFO: renamed from: a */
            private final long f30378a;

            public f(long j) {
                super(null);
                this.f30378a = j;
            }

            /* JADX INFO: renamed from: a */
            public final f m31421a(long j) {
                return new f(j);
            }

            /* JADX INFO: renamed from: c */
            public final long m31422c() {
                return this.f30378a;
            }

            /* JADX INFO: renamed from: d */
            public final long m31423d() {
                return this.f30378a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f30378a == ((f) obj).f30378a;
            }

            public int hashCode() {
                return UByte$$ExternalSyntheticBackport0.m43485m(this.f30378a);
            }

            public String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.f30378a + ")";
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ f m31420a(f fVar, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = fVar.f30378a;
                }
                return fVar.m31421a(j);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$g */
        public static final class g extends d {

            /* JADX INFO: renamed from: a */
            public static final g f30379a = new g();

            private g() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$h */
        public static final class h extends d {

            /* JADX INFO: renamed from: a */
            public static final h f30380a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC12281k7
        /* JADX INFO: renamed from: a */
        public String mo31406a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C15537d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: b */
        public final long m31419b() {
            if (this instanceof f) {
                return ((f) this).m31423d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC12187f3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.ironsource.InterfaceC12281k7
    /* JADX INFO: renamed from: a */
    public String mo31406a() {
        if (this instanceof a) {
            return ((a) this).m31412e().mo31406a();
        }
        if (this instanceof c) {
            return ((c) this).m31417f().mo31406a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final long m31407b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).m31417f().m31419b();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final long m31408c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).m31418g();
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC12187f3() {
    }
}
