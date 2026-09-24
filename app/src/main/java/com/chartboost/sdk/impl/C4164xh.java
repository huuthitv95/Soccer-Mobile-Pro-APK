package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xh */
/* JADX INFO: loaded from: classes3.dex */
public final class C4164xh implements InterfaceC4098uh {

    /* JADX INFO: renamed from: a */
    public final Lazy f16950a;

    /* JADX INFO: renamed from: b */
    public final Lazy f16951b;

    /* JADX INFO: renamed from: c */
    public final Lazy f16952c;

    /* JADX INFO: renamed from: d */
    public final Lazy f16953d;

    /* JADX INFO: renamed from: e */
    public final Lazy f16954e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Lazy f16955b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lazy lazy) {
            super(0);
            this.f16955b = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3842j7 invoke() {
            C3692ci c3692ciM18670i = ((C3920mg) ((InterfaceC3972p1) this.f16955b.getValue()).mo18988b().get()).m18670i();
            return new C3842j7(c3692ciM18670i.m17199c(), c3692ciM18670i.m17202f());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Lazy f16956b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4164xh f16957c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Lazy f16958d;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$b$a */
        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4164xh f16959b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4164xh c4164xh) {
                super(0);
                this.f16959b = c4164xh;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3842j7 invoke() {
                return this.f16959b.m19963b();
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$b$b, reason: collision with other inner class name */
        public static final class C15490b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Lazy f16960b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15490b(Lazy lazy) {
                super(0);
                this.f16960b = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3644ag invoke() {
                return ((InterfaceC3972p1) this.f16960b.getValue()).mo19007u();
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$b$c */
        public static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Lazy f16961b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Lazy lazy) {
                super(0);
                this.f16961b = lazy;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3692ci invoke() {
                return ((C3920mg) ((InterfaceC3972p1) this.f16961b.getValue()).mo18988b().get()).m18670i();
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$b$d */
        public static final class d extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4164xh f16962b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C4164xh c4164xh) {
                super(0);
                this.f16962b = c4164xh;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3876ki invoke() {
                return this.f16962b.m19966e();
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$b$e */
        public static final class e extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4164xh f16963b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C4164xh c4164xh) {
                super(0);
                this.f16963b = c4164xh;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3784gi invoke() {
                return this.f16963b.m19965d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Lazy lazy, C4164xh c4164xh, Lazy lazy2) {
            super(0);
            this.f16956b = lazy;
            this.f16957c = c4164xh;
            this.f16958d = lazy2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3956o7 invoke() {
            Lazy lazy = LazyKt.lazy(new a(this.f16957c));
            Lazy lazy2 = LazyKt.lazy(new C15490b(this.f16958d));
            return new C3956o7(LazyKt.lazy(new c(this.f16958d)), lazy, lazy2, this.f16956b, LazyKt.lazy(new d(this.f16957c)), LazyKt.lazy(new e(this.f16957c)));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final c f16964b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3669bi invoke() {
            return new C3669bi(null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Lazy f16965b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4164xh f16966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Lazy lazy, C4164xh c4164xh) {
            super(0);
            this.f16965b = lazy;
            this.f16966c = c4164xh;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3784gi invoke() {
            return new C3784gi(((InterfaceC3859k1) this.f16965b.getValue()).mo18324h(), this.f16966c.m19964c(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xh$e */
    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Lazy f16967b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4164xh f16968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Lazy lazy, C4164xh c4164xh) {
            super(0);
            this.f16967b = lazy;
            this.f16968c = c4164xh;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3876ki invoke() {
            return new C3876ki(((InterfaceC3972p1) this.f16967b.getValue()).mo18993g(), this.f16968c.m19965d(), null, this.f16968c.mo19602a(), ((InterfaceC3972p1) this.f16967b.getValue()).mo18997k().m19354d(), 4, null);
        }
    }

    public C4164xh(Lazy androidComponent, Lazy applicationComponent, Lazy privacyApi) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        this.f16950a = LazyKt.lazy(new b(privacyApi, this, applicationComponent));
        this.f16951b = LazyKt.lazy(new a(applicationComponent));
        this.f16952c = LazyKt.lazy(new d(androidComponent, this));
        this.f16953d = LazyKt.lazy(c.f16964b);
        this.f16954e = LazyKt.lazy(new e(applicationComponent, this));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4098uh
    /* JADX INFO: renamed from: a */
    public InterfaceC3911m7 mo19602a() {
        return (InterfaceC3911m7) this.f16950a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public C3842j7 m19963b() {
        return (C3842j7) this.f16951b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public C3669bi m19964c() {
        return (C3669bi) this.f16953d.getValue();
    }

    /* JADX INFO: renamed from: d */
    public C3784gi m19965d() {
        return (C3784gi) this.f16952c.getValue();
    }

    /* JADX INFO: renamed from: e */
    public C3876ki m19966e() {
        return (C3876ki) this.f16954e.getValue();
    }
}
