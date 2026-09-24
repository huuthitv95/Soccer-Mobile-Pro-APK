package com.iab.omid.library.ironsrc.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11138g {

    /* JADX INFO: renamed from: b */
    private static C11138g f23258b = new C11138g();

    /* JADX INFO: renamed from: a */
    private Context f23259a;

    private C11138g() {
    }

    /* JADX INFO: renamed from: b */
    public static C11138g m24260b() {
        return f23258b;
    }

    /* JADX INFO: renamed from: a */
    public Context m24261a() {
        return this.f23259a;
    }

    /* JADX INFO: renamed from: a */
    public void m24262a(Context context) {
        this.f23259a = context != null ? context.getApplicationContext() : null;
    }
}
