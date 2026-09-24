package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11189g {

    /* JADX INFO: renamed from: b */
    private static C11189g f23393b = new C11189g();

    /* JADX INFO: renamed from: a */
    private Context f23394a;

    private C11189g() {
    }

    /* JADX INFO: renamed from: b */
    public static C11189g m24513b() {
        return f23393b;
    }

    /* JADX INFO: renamed from: a */
    public Context m24514a() {
        return this.f23394a;
    }

    /* JADX INFO: renamed from: a */
    public void m24515a(Context context) {
        this.f23394a = context != null ? context.getApplicationContext() : null;
    }
}
