package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Cb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11383Cb {

    /* JADX INFO: renamed from: a */
    private final int f24173a;

    /* JADX INFO: renamed from: b */
    private final int f24174b;

    /* JADX INFO: renamed from: c */
    private final int f24175c;

    /* JADX INFO: renamed from: d */
    private final boolean f24176d;

    public C11383Cb(JSONObject applicationLogger) {
        Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.f24173a = applicationLogger.optInt(C11401Db.f24216a, 3);
        this.f24174b = applicationLogger.optInt(C11401Db.f24217b, 3);
        this.f24175c = applicationLogger.optInt("console", 3);
        this.f24176d = applicationLogger.optBoolean(C11401Db.f24219d, false);
    }

    /* JADX INFO: renamed from: a */
    public final int m25578a() {
        return this.f24175c;
    }

    /* JADX INFO: renamed from: b */
    public final int m25579b() {
        return this.f24174b;
    }

    /* JADX INFO: renamed from: c */
    public final int m25580c() {
        return this.f24173a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25581d() {
        return this.f24176d;
    }
}
