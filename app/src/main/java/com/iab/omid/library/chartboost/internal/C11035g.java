package com.iab.omid.library.chartboost.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11035g {

    /* JADX INFO: renamed from: b */
    private static C11035g f22988b = new C11035g();

    /* JADX INFO: renamed from: a */
    private Context f22989a;

    private C11035g() {
    }

    /* JADX INFO: renamed from: b */
    public static C11035g m23750b() {
        return f22988b;
    }

    /* JADX INFO: renamed from: a */
    public Context m23751a() {
        return this.f22989a;
    }

    /* JADX INFO: renamed from: a */
    public void m23752a(Context context) {
        this.f22989a = context != null ? context.getApplicationContext() : null;
    }
}
