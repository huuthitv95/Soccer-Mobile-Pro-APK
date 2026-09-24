package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.e6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C3726e6 implements InterfaceC3703d6 {

    /* JADX INFO: renamed from: a */
    public String f14017a;

    /* JADX INFO: renamed from: b */
    public String f14018b;

    /* JADX INFO: renamed from: c */
    public Application f14019c;

    /* JADX INFO: renamed from: d */
    public final Lazy f14020d = LazyKt.lazy(new a());

    /* JADX INFO: renamed from: e */
    public final Lazy f14021e = LazyKt.lazy(new b());

    /* JADX INFO: renamed from: f */
    public final Lazy f14022f = LazyKt.lazy(new f());

    /* JADX INFO: renamed from: g */
    public final Lazy f14023g = LazyKt.lazy(c.f14032b);

    /* JADX INFO: renamed from: h */
    public final Lazy f14024h = LazyKt.lazy(new e());

    /* JADX INFO: renamed from: i */
    public final Lazy f14025i = LazyKt.lazy(d.f14033b);

    /* JADX INFO: renamed from: j */
    public final Lazy f14026j = LazyKt.lazy(new i());

    /* JADX INFO: renamed from: k */
    public final Lazy f14027k = LazyKt.lazy(new h());

    /* JADX INFO: renamed from: l */
    public final Lazy f14028l = LazyKt.lazy(new g());

    /* JADX INFO: renamed from: m */
    public final Lazy f14029m = LazyKt.lazy(new j());

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$a */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3882l1 invoke() {
            Context applicationContext = C3726e6.this.m17489g().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new C3882l1(applicationContext, C3726e6.this.m17489g());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$b */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4016r1 invoke() {
            return new C4016r1(C3726e6.this.mo17024d(), C3726e6.this.m17490h(), C3726e6.this.m17494l(), null, C3726e6.this.mo17022b(), 8, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$c */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final c f14032b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4088u7 invoke() {
            return new C4088u7();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$d */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final d f14033b = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3707da invoke() {
            return new C3707da();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$e */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3688ce invoke() {
            return new C3688ce(C3726e6.this.mo17024d(), C3726e6.this.mo17019a());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$f */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4205ze invoke() {
            return new C4205ze(C3726e6.this.mo17024d(), C3726e6.this.mo17022b());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$g */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3964of invoke() {
            return new C3964of(C3726e6.this.mo17024d(), C3726e6.this.mo17022b());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$h */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4009qg invoke() {
            return new C4009qg(C3726e6.this.mo17024d(), C3726e6.this.m17490h(), C3726e6.this.mo17019a(), C3726e6.this.m17493k(), C3726e6.this.mo17022b());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$i */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class i extends Lambda implements Function0 {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$i$a */
        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3726e6 f14039b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3726e6 c3726e6) {
                super(0);
                this.f14039b = c3726e6;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3859k1 invoke() {
                return this.f14039b.mo17024d();
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$i$b */
        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3726e6 f14040b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3726e6 c3726e6) {
                super(0);
                this.f14040b = c3726e6;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3972p1 invoke() {
                return this.f14040b.mo17019a();
            }
        }

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$i$c */
        public static final class c extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3726e6 f14041b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C3726e6 c3726e6) {
                super(0);
                this.f14041b = c3726e6;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4117ve invoke() {
                return this.f14041b.m17494l().mo20056a();
            }
        }

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4164xh invoke() {
            return new C4164xh(LazyKt.lazy(new a(C3726e6.this)), LazyKt.lazy(new b(C3726e6.this)), LazyKt.lazy(new c(C3726e6.this)));
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e6$j */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4035rk invoke() {
            return new C4035rk(C3726e6.this.mo17024d());
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3703d6
    /* JADX INFO: renamed from: a */
    public InterfaceC3972p1 mo17019a() {
        return (InterfaceC3972p1) this.f14021e.getValue();
    }

    /* JADX INFO: renamed from: a */
    public void m17485a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            C4048sb.m19411b("Failed to initialize Chartboost SDK. Application is null.", (Throwable) null, 2, (Object) null);
            return;
        }
        this.f14019c = application;
        try {
            InterruptionController.m20224a(InterruptionController.f17246a, m17489g(), null, 2, null);
            C4048sb.m19413c("InterruptionController initialized.", null, 2, null);
        } catch (Exception e2) {
            C4048sb.m19410b("Error initializing InterruptionController.", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m17486a(String appId, String appSignature) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        this.f14017a = appId;
        this.f14018b = appSignature;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3703d6
    /* JADX INFO: renamed from: b */
    public InterfaceC4098uh mo17022b() {
        return (InterfaceC4098uh) this.f14026j.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3703d6
    /* JADX INFO: renamed from: c */
    public InterfaceC3991pk mo17023c() {
        return (InterfaceC3991pk) this.f14029m.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3703d6
    /* JADX INFO: renamed from: d */
    public InterfaceC3859k1 mo17024d() {
        return (InterfaceC3859k1) this.f14020d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public String m17487e() {
        String str = this.f14017a;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: f */
    public String m17488f() {
        String str = this.f14018b;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: g */
    public final Application m17489g() {
        Application application = this.f14019c;
        if (application != null) {
            return application;
        }
        C4048sb.m19411b("Missing application. Cannot start Chartboost SDK.", (Throwable) null, 2, (Object) null);
        throw new C3701d4();
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC4066t7 m17490h() {
        return (InterfaceC4066t7) this.f14023g.getValue();
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC3684ca m17491i() {
        return (InterfaceC3684ca) this.f14025i.getValue();
    }

    /* JADX INFO: renamed from: j */
    public boolean m17492j() {
        return this.f14019c != null;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC4182yd m17493k() {
        return (InterfaceC4182yd) this.f14024h.getValue();
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC4183ye m17494l() {
        return (InterfaceC4183ye) this.f14022f.getValue();
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC3919mf m17495m() {
        return (InterfaceC3919mf) this.f14028l.getValue();
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC3897lg m17496n() {
        return (InterfaceC3897lg) this.f14027k.getValue();
    }

    /* JADX INFO: renamed from: o */
    public boolean m17497o() {
        String str;
        String str2 = this.f14017a;
        return (str2 == null || str2.length() == 0 || (str = this.f14018b) == null || str.length() == 0) ? false : true;
    }
}
