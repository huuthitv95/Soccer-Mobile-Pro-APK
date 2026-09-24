package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ce */
/* JADX INFO: loaded from: classes3.dex */
public final class C3688ce implements InterfaceC4182yd {

    /* JADX INFO: renamed from: a */
    public final Lazy f13704a;

    /* JADX INFO: renamed from: b */
    public final Lazy f13705b;

    /* JADX INFO: renamed from: c */
    public final Lazy f13706c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ce$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4204zd invoke() {
            return new C4204zd(C3688ce.this.mo17169a(), C3688ce.this.m17171c());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ce$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3859k1 f13708b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC3972p1 f13709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3859k1 interfaceC3859k1, InterfaceC3972p1 interfaceC3972p1) {
            super(0);
            this.f13708b = interfaceC3859k1;
            this.f13709c = interfaceC3972p1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3665be invoke() {
            return new C3665be(this.f13708b.getContext(), this.f13708b.mo18320d(), this.f13708b.mo18327k(), this.f13709c.mo18988b(), null, 16, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ce$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final c f13710b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3711de invoke() {
            return new C3711de();
        }
    }

    public C3688ce(InterfaceC3859k1 androidComponent, InterfaceC3972p1 applicationComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f13704a = LazyKt.lazy(new b(androidComponent, applicationComponent));
        this.f13705b = LazyKt.lazy(c.f13710b);
        this.f13706c = LazyKt.lazy(new a());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4182yd
    /* JADX INFO: renamed from: a */
    public C3665be mo17169a() {
        return (C3665be) this.f13704a.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4182yd
    /* JADX INFO: renamed from: b */
    public C4204zd mo17170b() {
        return (C4204zd) this.f13706c.getValue();
    }

    /* JADX INFO: renamed from: c */
    public C3711de m17171c() {
        return (C3711de) this.f13705b.getValue();
    }
}
