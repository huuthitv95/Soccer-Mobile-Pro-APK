package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.da */
/* JADX INFO: loaded from: classes3.dex */
public final class C3707da implements InterfaceC3684ca {

    /* JADX INFO: renamed from: a */
    public final Function2 f13807a = new d();

    /* JADX INFO: renamed from: b */
    public final Function1 f13808b = a.f13812b;

    /* JADX INFO: renamed from: c */
    public final Function1 f13809c = c.f13814b;

    /* JADX INFO: renamed from: d */
    public final Function1 f13810d = b.f13813b;

    /* JADX INFO: renamed from: e */
    public final Function2 f13811e = e.f13816b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.da$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f13812b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4156x9 invoke(C3753fa impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new C4156x9(impressionDependency.m17671b(), impressionDependency.m17686q(), impressionDependency.m17682m(), impressionDependency.m17674e(), impressionDependency.m17675f(), impressionDependency.m17684o(), impressionDependency.m17680k(), impressionDependency.m17685p(), impressionDependency.m17672c(), null, 512, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.da$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final b f13813b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3661ba invoke(C3753fa impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new C3661ba(impressionDependency.m17671b(), impressionDependency.m17670a(), impressionDependency.m17676g(), impressionDependency.m17672c());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.da$c */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final c f13814b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3776ga invoke(C3753fa impressionDependency) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new C3776ga(impressionDependency.m17671b(), impressionDependency.m17683n(), impressionDependency.m17670a(), impressionDependency.m17672c(), impressionDependency.m17679j(), impressionDependency.m17673d(), impressionDependency.m17677h(), impressionDependency.m17685p(), impressionDependency.m17678i());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.da$d */
    public static final class d extends Lambda implements Function2 {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4149x2 invoke(C3753fa impressionDependency, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new C4149x2(impressionDependency, (InterfaceC4200z9) C3707da.this.f13808b.invoke(impressionDependency), (InterfaceC3799ha) C3707da.this.f13809c.invoke(impressionDependency), (InterfaceC3638aa) C3707da.this.f13810d.invoke(impressionDependency), (InterfaceC4025ra) C3707da.this.f13811e.invoke(impressionDependency, viewGroup));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.da$e */
    public static final class e extends Lambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public static final e f13816b = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3981pa invoke(C3753fa impressionDependency, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
            return new C3981pa(impressionDependency.m17673d(), impressionDependency.m17687r(), impressionDependency.m17677h(), viewGroup, impressionDependency.m17672c(), impressionDependency.m17679j(), impressionDependency.m17680k());
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3684ca
    /* JADX INFO: renamed from: a */
    public Function2 mo17061a() {
        return this.f13807a;
    }
}
