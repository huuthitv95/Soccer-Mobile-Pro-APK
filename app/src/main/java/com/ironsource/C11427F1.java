package com.ironsource;

import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.F1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11427F1 {

    /* JADX INFO: renamed from: a */
    private final boolean f24303a;

    /* JADX INFO: renamed from: b */
    private final HashSet<String> f24304b;

    /* JADX INFO: renamed from: c */
    private final String f24305c;

    /* JADX INFO: renamed from: d */
    private final String f24306d;

    /* JADX INFO: renamed from: e */
    private final boolean f24307e;

    /* JADX INFO: renamed from: f */
    private final int f24308f;

    /* JADX INFO: renamed from: g */
    private final boolean f24309g;

    public C11427F1(JSONObject applicationCrashReporterSettings) throws JSONException {
        Intrinsics.checkNotNullParameter(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f24303a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> listM31483b = C12194fa.m31483b(applicationCrashReporterSettings.optJSONArray(C11463H1.f24406b));
        this.f24304b = listM31483b != null ? CollectionsKt.toHashSet(listM31483b) : null;
        String strOptString = applicationCrashReporterSettings.optString(C11463H1.f24407c);
        Intrinsics.checkNotNullExpressionValue(strOptString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f24305c = strOptString;
        String strOptString2 = applicationCrashReporterSettings.optString(C11463H1.f24408d);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f24306d = strOptString2;
        this.f24307e = applicationCrashReporterSettings.optBoolean(C11463H1.f24409e, false);
        this.f24308f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.f24309g = applicationCrashReporterSettings.optBoolean(C11463H1.f24411g, false);
    }

    /* JADX INFO: renamed from: a */
    public final int m25756a() {
        return this.f24308f;
    }

    /* JADX INFO: renamed from: b */
    public final HashSet<String> m25757b() {
        return this.f24304b;
    }

    /* JADX INFO: renamed from: c */
    public final String m25758c() {
        return this.f24306d;
    }

    /* JADX INFO: renamed from: d */
    public final String m25759d() {
        return this.f24305c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m25760e() {
        return this.f24307e;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25761f() {
        return this.f24303a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m25762g() {
        return this.f24309g;
    }
}
