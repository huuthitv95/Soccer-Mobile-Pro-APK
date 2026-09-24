package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.O3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11591O3 {

    /* JADX INFO: renamed from: a */
    private final C12538u f25270a;

    /* JADX INFO: renamed from: b */
    private final C12538u f25271b;

    /* JADX INFO: renamed from: c */
    private final C11675T2 f25272c;

    /* JADX INFO: renamed from: d */
    private final C11563Mb f25273d;

    /* JADX INFO: renamed from: e */
    private final C11355B1 f25274e;

    /* JADX INFO: renamed from: f */
    private final Map<LevelPlay.AdFormat, C12538u> f25275f;

    public C11591O3(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        C12538u c12538u = new C12538u(m26717a(configurations, "rewarded"));
        this.f25270a = c12538u;
        C12538u c12538u2 = new C12538u(m26717a(configurations, "interstitial"));
        this.f25271b = c12538u2;
        this.f25272c = new C11675T2(m26717a(configurations, "banner"));
        this.f25273d = new C11563Mb(m26717a(configurations, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = configurations.optJSONObject("application");
        this.f25274e = new C11355B1(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.f25275f = MapsKt.mapOf(TuplesKt.m43482to(LevelPlay.AdFormat.INTERSTITIAL, c12538u2), TuplesKt.m43482to(LevelPlay.AdFormat.REWARDED, c12538u));
    }

    /* JADX INFO: renamed from: a */
    public final Map<LevelPlay.AdFormat, C12538u> m26718a() {
        return this.f25275f;
    }

    /* JADX INFO: renamed from: b */
    public final C11355B1 m26719b() {
        return this.f25274e;
    }

    /* JADX INFO: renamed from: c */
    public final C11675T2 m26720c() {
        return this.f25272c;
    }

    /* JADX INFO: renamed from: d */
    public final C11563Mb m26721d() {
        return this.f25273d;
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m26717a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
        return jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
    }
}
