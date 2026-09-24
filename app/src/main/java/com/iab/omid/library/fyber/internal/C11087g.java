package com.iab.omid.library.fyber.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11087g {

    /* JADX INFO: renamed from: b */
    private static C11087g f23123b = new C11087g();

    /* JADX INFO: renamed from: a */
    private Context f23124a;

    private C11087g() {
    }

    /* JADX INFO: renamed from: b */
    public static C11087g m24007b() {
        return f23123b;
    }

    /* JADX INFO: renamed from: a */
    public Context m24008a() {
        return this.f23124a;
    }

    /* JADX INFO: renamed from: a */
    public void m24009a(Context context) {
        this.f23124a = context != null ? context.getApplicationContext() : null;
    }
}
