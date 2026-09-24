package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.l1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3882l1 implements InterfaceC3859k1 {

    /* JADX INFO: renamed from: a */
    public final Context f15156a;

    /* JADX INFO: renamed from: b */
    public final Application f15157b;

    /* JADX INFO: renamed from: c */
    public final Lazy f15158c;

    /* JADX INFO: renamed from: d */
    public final Lazy f15159d;

    /* JADX INFO: renamed from: e */
    public final Lazy f15160e;

    /* JADX INFO: renamed from: f */
    public final Lazy f15161f;

    /* JADX INFO: renamed from: g */
    public final Lazy f15162g;

    /* JADX INFO: renamed from: h */
    public final Lazy f15163h;

    /* JADX INFO: renamed from: i */
    public final Lazy f15164i;

    /* JADX INFO: renamed from: j */
    public final Lazy f15165j;

    /* JADX INFO: renamed from: k */
    public final Lazy f15166k;

    /* JADX INFO: renamed from: l */
    public final Lazy f15167l;

    /* JADX INFO: renamed from: m */
    public final Lazy f15168m;

    /* JADX INFO: renamed from: n */
    public final Lazy f15169n;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f15170b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3836j1 invoke() {
            return C3836j1.m18133b();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final b f15171b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3768g2 invoke() {
            return new C3768g2();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$c */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContentResolver invoke() {
            return C3882l1.this.getContext().getContentResolver();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$d */
    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3864k6 invoke() {
            return new C3864k6(C3882l1.this.getContext(), C3882l1.this.mo18326j());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$e */
    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4021r6 invoke() {
            return new C4021r6(C3882l1.this.m18465m(), C3882l1.this.m18464l(), null, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$f */
    public static final class f extends Lambda implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DisplayMetrics invoke() {
            return C3882l1.this.getContext().getResources().getDisplayMetrics();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$g */
    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3713dg invoke() {
            Resources resources = C3882l1.this.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return new C3713dg(resources);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$h */
    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return C3882l1.this.getContext().getSharedPreferences("cbPrefs", 0);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$i */
    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4097ug invoke() {
            return new C4097ug(C3882l1.this.mo18325i());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$j */
    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return C3882l1.this.getContext().getSharedPreferences("cbPrefsTracking", 0);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$k */
    public static final class k extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final k f15180b = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3967oi invoke() {
            return new C3967oi();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.l1$l */
    public static final class l extends Lambda implements Function0 {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowManager invoke() {
            Object systemService = C3882l1.this.getContext().getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    public C3882l1(Context context, Application app) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(app, "app");
        this.f15156a = context;
        this.f15157b = app;
        this.f15158c = LazyKt.lazy(new h());
        this.f15159d = LazyKt.lazy(new j());
        this.f15160e = LazyKt.lazy(a.f15170b);
        this.f15161f = LazyKt.lazy(k.f15180b);
        this.f15162g = LazyKt.lazy(b.f15171b);
        this.f15163h = LazyKt.lazy(new g());
        this.f15164i = LazyKt.lazy(new i());
        this.f15165j = LazyKt.lazy(new l());
        this.f15166k = LazyKt.lazy(new f());
        this.f15167l = LazyKt.lazy(new e());
        this.f15168m = LazyKt.lazy(new d());
        this.f15169n = LazyKt.lazy(new c());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: a */
    public C3768g2 mo18317a() {
        return (C3768g2) this.f15162g.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: b */
    public ContentResolver mo18318b() {
        Object value = this.f15169n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ContentResolver) value;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: c */
    public InterfaceC3945ni mo18319c() {
        return (InterfaceC3945ni) this.f15161f.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: d */
    public C4097ug mo18320d() {
        return (C4097ug) this.f15164i.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: e */
    public C3836j1 mo18321e() {
        Object value = this.f15160e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (C3836j1) value;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: f */
    public C3864k6 mo18322f() {
        return (C3864k6) this.f15168m.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: g */
    public Application mo18323g() {
        return this.f15157b;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    public Context getContext() {
        return this.f15156a;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: h */
    public SharedPreferences mo18324h() {
        Object value = this.f15159d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: i */
    public SharedPreferences mo18325i() {
        Object value = this.f15158c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: j */
    public C4021r6 mo18326j() {
        return (C4021r6) this.f15167l.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3859k1
    /* JADX INFO: renamed from: k */
    public C3713dg mo18327k() {
        return (C3713dg) this.f15163h.getValue();
    }

    /* JADX INFO: renamed from: l */
    public DisplayMetrics m18464l() {
        Object value = this.f15166k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DisplayMetrics) value;
    }

    /* JADX INFO: renamed from: m */
    public WindowManager m18465m() {
        return (WindowManager) this.f15165j.getValue();
    }
}
