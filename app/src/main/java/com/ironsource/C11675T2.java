package com.ironsource;

import com.ironsource.mediationsdk.C12357j;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.T2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11675T2 {

    /* JADX INFO: renamed from: a */
    private final b f25709a;

    /* JADX INFO: renamed from: b */
    private final Map<String, b> f25710b;

    /* JADX INFO: renamed from: com.ironsource.T2$a */
    static final class a extends Lambda implements Function1<JSONObject, b> {

        /* JADX INFO: renamed from: a */
        public static final a f25711a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new b(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.T2$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final JSONObject f25712a;

        /* JADX INFO: renamed from: b */
        private final int f25713b;

        /* JADX INFO: renamed from: c */
        private final boolean f25714c;

        /* JADX INFO: renamed from: d */
        private final long f25715d;

        /* JADX INFO: renamed from: e */
        private final float f25716e;

        /* JADX INFO: renamed from: f */
        private final List<String> f25717f;

        public b(JSONObject features) {
            Intrinsics.checkNotNullParameter(features, "features");
            JSONObject jSONObject = features.has(C11709V2.f26003a) ? features : null;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(C11709V2.f26003a) : null;
            this.f25712a = jSONObjectOptJSONObject;
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(C11709V2.f26004b, 25000) : 25000;
            this.f25713b = iOptInt;
            this.f25714c = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true;
            this.f25715d = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(C11709V2.f26006d) || jSONObjectOptJSONObject.isNull(C11709V2.f26006d)) ? iOptInt : jSONObjectOptJSONObject.optLong(C11709V2.f26006d);
            this.f25716e = features.has(C11709V2.f26007e) ? features.optInt(C11709V2.f26007e) / 100.0f : 0.15f;
            List<String> listM31483b = features.has(C11709V2.f26008f) ? C12194fa.m31483b(features.getJSONArray(C11709V2.f26008f)) : CollectionsKt.listOf((Object[]) new String[]{C12357j.f31263a, C12357j.f31266d});
            Intrinsics.checkNotNullExpressionValue(listM31483b, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f25717f = listM31483b;
        }

        /* JADX INFO: renamed from: a */
        public final List<String> m27495a() {
            return this.f25717f;
        }

        /* JADX INFO: renamed from: b */
        public final float m27496b() {
            return this.f25716e;
        }

        /* JADX INFO: renamed from: c */
        public final int m27497c() {
            return this.f25713b;
        }

        /* JADX INFO: renamed from: d */
        public final long m27498d() {
            return this.f25715d;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m27499e() {
            return this.f25714c;
        }
    }

    public C11675T2(JSONObject bannerConfigurations) {
        Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.f25709a = new b(bannerConfigurations);
        this.f25710b = new C11793a1(bannerConfigurations).m28096a(a.f25711a);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, b> m27492a() {
        return this.f25710b;
    }

    /* JADX INFO: renamed from: b */
    public final b m27493b() {
        return this.f25709a;
    }
}
