package com.ironsource;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C12538u {

    /* JADX INFO: renamed from: d */
    public static final c f32483d = new c(null);

    /* JADX INFO: renamed from: e */
    public static final String f32484e = "capping";

    /* JADX INFO: renamed from: f */
    public static final String f32485f = "pacing";

    /* JADX INFO: renamed from: g */
    public static final String f32486g = "delivery";

    /* JADX INFO: renamed from: h */
    public static final String f32487h = "progressiveLoadingConfig";

    /* JADX INFO: renamed from: i */
    public static final String f32488i = "expiredDurationInMinutes";

    /* JADX INFO: renamed from: j */
    public static final String f32489j = "reward";

    /* JADX INFO: renamed from: k */
    public static final String f32490k = "name";

    /* JADX INFO: renamed from: l */
    public static final String f32491l = "amount";

    /* JADX INFO: renamed from: m */
    public static final String f32492m = "virtualItemName";

    /* JADX INFO: renamed from: n */
    public static final String f32493n = "virtualItemCount";

    /* JADX INFO: renamed from: o */
    public static final long f32494o = 60;

    /* JADX INFO: renamed from: a */
    private final Map<String, d> f32495a;

    /* JADX INFO: renamed from: b */
    private final d f32496b;

    /* JADX INFO: renamed from: c */
    private final Map<String, d> f32497c;

    /* JADX INFO: renamed from: com.ironsource.u$a */
    static final class a extends Lambda implements Function1<JSONObject, d> {

        /* JADX INFO: renamed from: a */
        public static final a f32498a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$b */
    static final class b extends Lambda implements Function1<JSONObject, d> {

        /* JADX INFO: renamed from: a */
        public static final b f32499a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final C11375C3 f32500a;

        /* JADX INFO: renamed from: b */
        private final C11736Wc f32501b;

        /* JADX INFO: renamed from: c */
        private final C11538L4 f32502c;

        /* JADX INFO: renamed from: d */
        private final Long f32503d;

        /* JADX INFO: renamed from: e */
        private final C11403Dd f32504e;

        /* JADX INFO: renamed from: f */
        private final C11403Dd f32505f;

        /* JADX INFO: renamed from: g */
        private final C12409od f32506g;

        public d(JSONObject features) throws JSONException {
            C11375C3 c11375c3;
            C11736Wc c11736Wc;
            Intrinsics.checkNotNullParameter(features, "features");
            C12409od c12409od = null;
            if (features.has(C12538u.f32484e)) {
                JSONObject jSONObject = features.getJSONObject(C12538u.f32484e);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                c11375c3 = new C11375C3(jSONObject);
            } else {
                c11375c3 = null;
            }
            this.f32500a = c11375c3;
            if (features.has(C12538u.f32485f)) {
                JSONObject jSONObject2 = features.getJSONObject(C12538u.f32485f);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                c11736Wc = new C11736Wc(jSONObject2);
            } else {
                c11736Wc = null;
            }
            this.f32501b = c11736Wc;
            this.f32502c = features.has(C12538u.f32486g) ? new C11538L4(features.getBoolean(C12538u.f32486g)) : null;
            this.f32503d = features.has(C12538u.f32488i) ? Long.valueOf(features.getLong(C12538u.f32488i)) : null;
            JSONObject jSONObjectOptJSONObject = features.optJSONObject(C12538u.f32489j);
            this.f32504e = jSONObjectOptJSONObject != null ? new C11403Dd(jSONObjectOptJSONObject, "name", "amount") : null;
            C11403Dd c11403Dd = new C11403Dd(features, C12538u.f32492m, C12538u.f32493n);
            String strM25627b = c11403Dd.m25627b();
            this.f32505f = (strM25627b == null || strM25627b.length() == 0 || c11403Dd.m25626a() == null) ? null : c11403Dd;
            if (features.has(C12538u.f32487h)) {
                JSONObject jSONObject3 = features.getJSONObject(C12538u.f32487h);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                c12409od = new C12409od(jSONObject3);
            }
            this.f32506g = c12409od;
        }

        /* JADX INFO: renamed from: a */
        public final C11403Dd m33833a() {
            return this.f32504e;
        }

        /* JADX INFO: renamed from: b */
        public final C11375C3 m33834b() {
            return this.f32500a;
        }

        /* JADX INFO: renamed from: c */
        public final C11538L4 m33835c() {
            return this.f32502c;
        }

        /* JADX INFO: renamed from: d */
        public final Long m33836d() {
            return this.f32503d;
        }

        /* JADX INFO: renamed from: e */
        public final C11736Wc m33837e() {
            return this.f32501b;
        }

        /* JADX INFO: renamed from: f */
        public final C11403Dd m33838f() {
            return this.f32505f;
        }

        /* JADX INFO: renamed from: g */
        public final C12409od m33839g() {
            return this.f32506g;
        }
    }

    public C12538u(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f32495a = new C12305ld(configurations).m32084a(b.f32499a);
        this.f32496b = new d(configurations);
        this.f32497c = new C11793a1(configurations).m28096a(a.f32498a);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, d> m33828a() {
        return this.f32497c;
    }

    /* JADX INFO: renamed from: b */
    public final d m33829b() {
        return this.f32496b;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, d> m33830c() {
        return this.f32495a;
    }
}
