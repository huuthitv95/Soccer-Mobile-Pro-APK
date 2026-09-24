package com.iab.omid.library.applovin.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public class C10933g {

    /* JADX INFO: renamed from: b */
    private static C10933g f22718b = new C10933g();

    /* JADX INFO: renamed from: a */
    private Context f22719a;

    private C10933g() {
    }

    /* JADX INFO: renamed from: b */
    public static C10933g m23250b() {
        return f22718b;
    }

    /* JADX INFO: renamed from: a */
    public Context m23251a() {
        return this.f22719a;
    }

    /* JADX INFO: renamed from: a */
    public void m23252a(Context context) {
        this.f22719a = context != null ? context.getApplicationContext() : null;
    }
}
