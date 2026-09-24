package com.applovin.impl;

import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.e */
/* JADX INFO: loaded from: classes3.dex */
public class C1535e {

    /* JADX INFO: renamed from: a */
    private final String f1389a;

    /* JADX INFO: renamed from: b */
    private final String f1390b;

    /* JADX INFO: renamed from: c */
    private final Map f1391c;

    /* JADX INFO: renamed from: d */
    private final boolean f1392d;

    public C1535e(String str, String str2) {
        this(str, str2, null, false);
    }

    public C1535e(String str, String str2, Map map, boolean z) {
        this.f1389a = str;
        this.f1390b = str2;
        this.f1391c = map;
        this.f1392d = z;
    }

    /* JADX INFO: renamed from: a */
    public String m2448a() {
        return this.f1390b;
    }

    /* JADX INFO: renamed from: b */
    public Map m2449b() {
        return this.f1391c;
    }

    /* JADX INFO: renamed from: c */
    public String m2450c() {
        return this.f1389a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2451d() {
        return this.f1392d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f1389a + "', backupUrl='" + this.f1390b + "', headers='" + this.f1391c + "', shouldFireInWebView='" + this.f1392d + "'}";
    }
}
