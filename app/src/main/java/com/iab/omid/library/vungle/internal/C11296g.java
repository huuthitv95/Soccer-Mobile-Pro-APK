package com.iab.omid.library.vungle.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11296g {

    /* JADX INFO: renamed from: b */
    private static C11296g f23681b = new C11296g();

    /* JADX INFO: renamed from: a */
    private Context f23682a;

    private C11296g() {
    }

    /* JADX INFO: renamed from: b */
    public static C11296g m25029b() {
        return f23681b;
    }

    /* JADX INFO: renamed from: a */
    public Context m25030a() {
        return this.f23682a;
    }

    /* JADX INFO: renamed from: a */
    public void m25031a(Context context) {
        this.f23682a = context != null ? context.getApplicationContext() : null;
    }
}
