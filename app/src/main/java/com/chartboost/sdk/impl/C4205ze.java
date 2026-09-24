package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ze */
/* JADX INFO: loaded from: classes3.dex */
public final class C4205ze implements InterfaceC4183ye {

    /* JADX INFO: renamed from: a */
    public final Lazy f17131a;

    /* JADX INFO: renamed from: b */
    public final Lazy f17132b;

    /* JADX INFO: renamed from: c */
    public final Lazy f17133c;

    /* JADX INFO: renamed from: d */
    public final Lazy f17134d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ze$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3859k1 f17135b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3859k1 interfaceC3859k1) {
            super(0);
            this.f17135b = interfaceC3859k1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4067t8 invoke() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f17135b.getContext());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
            return new C4067t8(defaultSharedPreferences);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ze$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C4205ze.this.m20142b().m19462a();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ze$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3859k1 f17137b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC4098uh f17138c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4205ze f17139d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC3859k1 interfaceC3859k1, InterfaceC4098uh interfaceC4098uh, C4205ze c4205ze) {
            super(0);
            this.f17137b = interfaceC3859k1;
            this.f17138c = interfaceC4098uh;
            this.f17139d = c4205ze;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4117ve invoke() {
            SharedPreferences sharedPreferencesMo18325i = this.f17137b.mo18325i();
            InterfaceC3911m7 interfaceC3911m7Mo19602a = this.f17138c.mo19602a();
            C3643af c3643af = new C3643af(sharedPreferencesMo18325i, interfaceC3911m7Mo19602a);
            C4117ve c4117ve = new C4117ve(new C3781gf(c3643af, interfaceC3911m7Mo19602a), new C4089u8(c3643af), new C3896lf(c3643af), new C4111v8(), new C4133w8(c3643af), this.f17139d.m20144d(), this.f17139d.m20142b(), this.f17139d.m20143c());
            c4117ve.m19698a(new C3920mg.b());
            return c4117ve;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ze$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3859k1 f17140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC3859k1 interfaceC3859k1) {
            super(0);
            this.f17140b = interfaceC3859k1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3783gh invoke() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f17140b.getContext());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
            return new C3783gh(defaultSharedPreferences);
        }
    }

    public C4205ze(InterfaceC3859k1 androidComponent, InterfaceC4098uh trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f17131a = LazyKt.lazy(new c(androidComponent, trackerComponent, this));
        this.f17132b = LazyKt.lazy(new d(androidComponent));
        this.f17133c = LazyKt.lazy(new a(androidComponent));
        this.f17134d = LazyKt.lazy(new b());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4183ye
    /* JADX INFO: renamed from: a */
    public C4117ve mo20056a() {
        return (C4117ve) this.f17131a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public C4067t8 m20142b() {
        return (C4067t8) this.f17133c.getValue();
    }

    /* JADX INFO: renamed from: c */
    public String m20143c() {
        return (String) this.f17134d.getValue();
    }

    /* JADX INFO: renamed from: d */
    public C3783gh m20144d() {
        return (C3783gh) this.f17132b.getValue();
    }
}
