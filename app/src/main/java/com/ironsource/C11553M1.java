package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.M1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11553M1 {

    /* JADX INFO: renamed from: a */
    private final JSONObject f25096a;

    /* JADX INFO: renamed from: b */
    private final boolean f25097b;

    /* JADX INFO: renamed from: c */
    private final String f25098c;

    /* JADX INFO: renamed from: d */
    private final boolean f25099d;

    /* JADX INFO: renamed from: e */
    private final boolean f25100e;

    /* JADX INFO: renamed from: f */
    private final int f25101f;

    /* JADX INFO: renamed from: g */
    private final boolean f25102g;

    /* JADX INFO: renamed from: h */
    private final boolean f25103h;

    /* JADX INFO: renamed from: i */
    private final int f25104i;

    /* JADX INFO: renamed from: j */
    private final boolean f25105j;

    /* JADX INFO: renamed from: k */
    private final boolean f25106k;

    /* JADX INFO: renamed from: l */
    private final JSONObject f25107l;

    public C11553M1(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f25096a = config;
        this.f25097b = config.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = config.optString("externalArmEventsUrl", C11575N5.f25231j);
        Intrinsics.checkNotNullExpressionValue(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f25098c = strOptString;
        this.f25099d = config.optBoolean("sid", true);
        this.f25100e = config.optBoolean("radvid", false);
        this.f25101f = config.optInt("uaeh", 0);
        this.f25102g = config.optBoolean("sharedThreadPool", false);
        this.f25103h = config.optBoolean("sharedThreadPoolADP", true);
        this.f25104i = config.optInt(C11540L6.f24943T0, -1);
        this.f25105j = config.optBoolean("axal", false);
        this.f25106k = config.optBoolean("psrt", false);
        this.f25107l = config.optJSONObject(C11744X3.a.f26166c);
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m26448a() {
        return this.f25096a;
    }

    /* JADX INFO: renamed from: b */
    public final int m26450b() {
        return this.f25104i;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m26451c() {
        return this.f25107l;
    }

    /* JADX INFO: renamed from: d */
    public final String m26452d() {
        return this.f25098c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m26453e() {
        return this.f25106k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11553M1) && Intrinsics.areEqual(this.f25096a, ((C11553M1) obj).f25096a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m26454f() {
        return this.f25100e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m26455g() {
        return this.f25099d;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m26456h() {
        return this.f25102g;
    }

    public int hashCode() {
        return this.f25096a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m26457i() {
        return this.f25103h;
    }

    /* JADX INFO: renamed from: j */
    public final int m26458j() {
        return this.f25101f;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m26459k() {
        return this.f25105j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m26460l() {
        return this.f25097b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f25096a + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11553M1 m26449a(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new C11553M1(config);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11553M1 m26447a(C11553M1 c11553m1, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = c11553m1.f25096a;
        }
        return c11553m1.m26449a(jSONObject);
    }
}
