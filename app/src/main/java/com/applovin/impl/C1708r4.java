package com.applovin.impl;

import android.content.Context;

/* JADX INFO: renamed from: com.applovin.impl.r4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1708r4 {

    /* JADX INFO: renamed from: a */
    private final String f2725a;

    /* JADX INFO: renamed from: b */
    private final String f2726b;

    /* JADX INFO: renamed from: c */
    private final boolean f2727c;

    C1708r4(String str, String str2, Context context) {
        this.f2725a = str.replace("android.permission.", "");
        this.f2726b = str2;
        this.f2727c = AbstractC1677p0.m3799a(str, context);
    }

    /* JADX INFO: renamed from: a */
    public String m4198a() {
        return this.f2726b;
    }

    /* JADX INFO: renamed from: b */
    public String m4199b() {
        return this.f2725a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m4200c() {
        return this.f2727c;
    }
}
