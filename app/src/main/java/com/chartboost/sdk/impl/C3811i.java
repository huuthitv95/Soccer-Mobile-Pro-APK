package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C3811i {

    /* JADX INFO: renamed from: a */
    public final Function0 f14521a;

    /* JADX INFO: renamed from: b */
    public final Mediation f14522b;

    /* JADX INFO: renamed from: c */
    public final C3678c4 f14523c;

    /* JADX INFO: renamed from: d */
    public final Lazy f14524d;

    /* JADX INFO: renamed from: e */
    public final C3720e0 f14525e;

    /* JADX INFO: renamed from: f */
    public final C3904m0 f14526f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3945ni f14527g;

    /* JADX INFO: renamed from: h */
    public final Lazy f14528h;

    /* JADX INFO: renamed from: i */
    public final ScheduledExecutorService f14529i;

    /* JADX INFO: renamed from: j */
    public final C4031rg f14530j;

    /* JADX INFO: renamed from: k */
    public final C3768g2 f14531k;

    /* JADX INFO: renamed from: l */
    public final C3719e f14532l;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.i$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC3628a0 f14534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3628a0 abstractC3628a0) {
            super(0);
            this.f14534c = abstractC3628a0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3835j0 invoke() {
            return new C3835j0(C3811i.this.f14523c.mo17024d(), C3811i.this.f14523c.mo17019a(), this.f14534c, C3811i.this.f14523c.m17032l(), C3811i.this.f14523c.m17030j(), C3811i.this.f14522b, C3811i.this.f14523c.m17028h(), C3811i.this.f14523c.mo17022b());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.i$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AtomicReference invoke() {
            return C3811i.this.f14523c.mo17019a().mo18988b();
        }
    }

    public C3811i(AbstractC3628a0 adType, Function0 get, Mediation mediation, C3678c4 dependencyContainer) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(get, "get");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f14521a = get;
        this.f14522b = mediation;
        this.f14523c = dependencyContainer;
        this.f14524d = LazyKt.lazy(new a(adType));
        this.f14525e = m17941b().m18100b();
        this.f14526f = m17941b().m18101c();
        this.f14527g = dependencyContainer.mo17024d().mo18319c();
        this.f14528h = LazyKt.lazy(new b());
        this.f14529i = dependencyContainer.m17027g().mo19461b();
        this.f14530j = dependencyContainer.mo17019a().mo18997k();
        this.f14531k = dependencyContainer.mo17024d().mo18317a();
        this.f14532l = new C3742f(dependencyContainer.mo17024d()).m17598a();
    }

    public /* synthetic */ C3811i(AbstractC3628a0 abstractC3628a0, Function0 function0, Mediation mediation, C3678c4 c3678c4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3628a0, function0, mediation, (i & 8) != 0 ? C3678c4.f13658b : c3678c4);
    }

    /* JADX INFO: renamed from: a */
    public final Object m17940a() {
        return ((Function9) this.f14521a.invoke()).invoke(this.f14525e, this.f14526f, this.f14527g, m17942c(), this.f14529i, this.f14532l, this.f14530j, this.f14531k, this.f14523c.mo17022b().mo19602a());
    }

    /* JADX INFO: renamed from: b */
    public final C3835j0 m17941b() {
        return (C3835j0) this.f14524d.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final AtomicReference m17942c() {
        return (AtomicReference) this.f14528h.getValue();
    }
}
