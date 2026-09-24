package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l1 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12293l1 {

    /* JADX INFO: renamed from: com.ironsource.l1$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C15541a f30759a = new C15541a(null);

        /* JADX INFO: renamed from: com.ironsource.l1$a$a, reason: collision with other inner class name */
        public static final class C15541a {
            public /* synthetic */ C15541a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31971a(C12397o1.j errorCode, C12397o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(403, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @JvmStatic
            /* JADX INFO: renamed from: b */
            public final InterfaceC12293l1 m31974b(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(404, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            /* JADX INFO: renamed from: c */
            public final InterfaceC12293l1 m31975c(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(409, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            /* JADX INFO: renamed from: d */
            public final InterfaceC12293l1 m31976d(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(401, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            /* JADX INFO: renamed from: e */
            public final InterfaceC12293l1 m31977e(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(408, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            /* JADX INFO: renamed from: f */
            public final InterfaceC12293l1 m31978f(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(405, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            private C15541a() {
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31970a() {
                return new b(406, new ArrayList());
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31973a(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(407, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31972a(boolean z) {
                if (z) {
                    return new b(410, new ArrayList());
                }
                return new b(411, new ArrayList());
            }
        }

        /* JADX INFO: renamed from: com.ironsource.l1$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final b f30760a = new b();

            /* JADX INFO: renamed from: b */
            public static final int f30761b = 401;

            /* JADX INFO: renamed from: c */
            public static final int f30762c = 403;

            /* JADX INFO: renamed from: d */
            public static final int f30763d = 404;

            /* JADX INFO: renamed from: e */
            public static final int f30764e = 405;

            /* JADX INFO: renamed from: f */
            public static final int f30765f = 406;

            /* JADX INFO: renamed from: g */
            public static final int f30766g = 407;

            /* JADX INFO: renamed from: h */
            public static final int f30767h = 408;

            /* JADX INFO: renamed from: i */
            public static final int f30768i = 409;

            /* JADX INFO: renamed from: j */
            public static final int f30769j = 410;

            /* JADX INFO: renamed from: k */
            public static final int f30770k = 411;

            private b() {
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31961a() {
            return f30759a.m31970a();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public static final InterfaceC12293l1 m31965b(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30759a.m31974b(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public static final InterfaceC12293l1 m31966c(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30759a.m31975c(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public static final InterfaceC12293l1 m31967d(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30759a.m31976d(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public static final InterfaceC12293l1 m31968e(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30759a.m31977e(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public static final InterfaceC12293l1 m31969f(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30759a.m31978f(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31964a(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30759a.m31973a(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31963a(boolean z) {
            return f30759a.m31972a(z);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31962a(C12397o1.j jVar, C12397o1.k kVar) {
            return f30759a.m31971a(jVar, kVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$b */
    public static final class b implements InterfaceC12293l1 {

        /* JADX INFO: renamed from: a */
        private final int f30771a;

        /* JADX INFO: renamed from: b */
        private final List<InterfaceC12415p1> f30772b;

        public b(int i, List<InterfaceC12415p1> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            this.f30771a = i;
            this.f30772b = arrayList;
        }

        @Override // com.ironsource.InterfaceC12293l1
        /* JADX INFO: renamed from: a */
        public void mo31960a(InterfaceC12469s1 analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            analytics.mo31924a(this.f30771a, this.f30772b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final a f30773a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.l1$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31985a() {
                return new b(201, new ArrayList());
            }

            @JvmStatic
            /* JADX INFO: renamed from: b */
            public final InterfaceC12293l1 m31990b() {
                return new b(206, new ArrayList());
            }

            private a() {
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31987a(C12397o1.l ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(207, CollectionsKt.mutableListOf(ext1));
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31988a(InterfaceC12415p1 duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(202, CollectionsKt.mutableListOf(duration));
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31986a(C12397o1.j errorCode, C12397o1.k errorReason, C12397o1.f duration) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(203, CollectionsKt.mutableListOf(errorCode, errorReason, duration));
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m31989a(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(204, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.l1$c$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final b f30774a = new b();

            /* JADX INFO: renamed from: b */
            public static final int f30775b = 201;

            /* JADX INFO: renamed from: c */
            public static final int f30776c = 202;

            /* JADX INFO: renamed from: d */
            public static final int f30777d = 203;

            /* JADX INFO: renamed from: e */
            public static final int f30778e = 204;

            /* JADX INFO: renamed from: f */
            public static final int f30779f = 205;

            /* JADX INFO: renamed from: g */
            public static final int f30780g = 206;

            /* JADX INFO: renamed from: h */
            public static final int f30781h = 207;

            private b() {
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31983a(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30773a.m31989a(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public static final InterfaceC12293l1 m31984b() {
            return f30773a.m31990b();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31979a() {
            return f30773a.m31985a();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31980a(C12397o1.j jVar, C12397o1.k kVar, C12397o1.f fVar) {
            return f30773a.m31986a(jVar, kVar, fVar);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31982a(InterfaceC12415p1 interfaceC12415p1) {
            return f30773a.m31988a(interfaceC12415p1);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31981a(C12397o1.l lVar) {
            return f30773a.m31987a(lVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final a f30782a = new a(null);

        /* JADX INFO: renamed from: com.ironsource.l1$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m32001a() {
                return new b(101, new ArrayList());
            }

            @JvmStatic
            /* JADX INFO: renamed from: b */
            public final InterfaceC12293l1 m32009b(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(110, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            /* JADX INFO: renamed from: c */
            public final b m32010c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m32007a(InterfaceC12415p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(102, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            /* JADX INFO: renamed from: b */
            public final InterfaceC12293l1 m32008b() {
                return new b(112, new ArrayList());
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m32002a(C12397o1.f duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(103, CollectionsKt.mutableListOf(duration));
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m32004a(C12397o1.j errorCode, C12397o1.k errorReason, C12397o1.f duration, C12397o1.l loaderState) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(loaderState, "loaderState");
                return new b(104, CollectionsKt.mutableListOf(errorCode, errorReason, duration, loaderState));
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m32003a(C12397o1.j errorCode, C12397o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(109, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m32006a(InterfaceC12415p1 ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(111, CollectionsKt.mutableListOf(ext1));
            }

            @JvmStatic
            /* JADX INFO: renamed from: a */
            public final InterfaceC12293l1 m32005a(C12397o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(113, CollectionsKt.mutableListOf(errorReason));
            }
        }

        /* JADX INFO: renamed from: com.ironsource.l1$d$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final b f30783a = new b();

            /* JADX INFO: renamed from: b */
            public static final int f30784b = 101;

            /* JADX INFO: renamed from: c */
            public static final int f30785c = 102;

            /* JADX INFO: renamed from: d */
            public static final int f30786d = 103;

            /* JADX INFO: renamed from: e */
            public static final int f30787e = 104;

            /* JADX INFO: renamed from: f */
            public static final int f30788f = 105;

            /* JADX INFO: renamed from: g */
            public static final int f30789g = 109;

            /* JADX INFO: renamed from: h */
            public static final int f30790h = 110;

            /* JADX INFO: renamed from: i */
            public static final int f30791i = 111;

            /* JADX INFO: renamed from: j */
            public static final int f30792j = 112;

            /* JADX INFO: renamed from: k */
            public static final int f30793k = 113;

            private b() {
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31991a() {
            return f30782a.m32001a();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public static final InterfaceC12293l1 m31998b() {
            return f30782a.m32008b();
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public static final b m32000c() {
            return f30782a.m32010c();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31997a(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30782a.m32007a(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public static final InterfaceC12293l1 m31999b(InterfaceC12415p1... interfaceC12415p1Arr) {
            return f30782a.m32009b(interfaceC12415p1Arr);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31993a(C12397o1.j jVar, C12397o1.k kVar) {
            return f30782a.m32003a(jVar, kVar);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31994a(C12397o1.j jVar, C12397o1.k kVar, C12397o1.f fVar, C12397o1.l lVar) {
            return f30782a.m32004a(jVar, kVar, fVar, lVar);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31996a(InterfaceC12415p1 interfaceC12415p1) {
            return f30782a.m32006a(interfaceC12415p1);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31992a(C12397o1.f fVar) {
            return f30782a.m32002a(fVar);
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public static final InterfaceC12293l1 m31995a(C12397o1.k kVar) {
            return f30782a.m32005a(kVar);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo31960a(InterfaceC12469s1 interfaceC12469s1);
}
