package com.applovin.impl;

import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.q4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1698q4 {

    /* JADX INFO: renamed from: a */
    private final String f2655a;

    /* JADX INFO: renamed from: b */
    private Map f2656b;

    private C1698q4(String str, Map map) {
        this.f2655a = str;
        this.f2656b = map;
    }

    /* JADX INFO: renamed from: a */
    public static C1698q4 m4009a(String str) {
        return m4010a(str, null);
    }

    /* JADX INFO: renamed from: a */
    public static C1698q4 m4010a(String str, Map map) {
        return new C1698q4(str, map);
    }

    /* JADX INFO: renamed from: a */
    public Map m4011a() {
        return this.f2656b;
    }

    /* JADX INFO: renamed from: b */
    public String m4012b() {
        return this.f2655a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f2655a + "'params='" + this.f2656b + "'}";
    }
}
