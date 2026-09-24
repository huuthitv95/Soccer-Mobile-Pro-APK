package com.iab.omid.library.unity3d.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.internal.f */
/* JADX INFO: loaded from: classes6.dex */
public class C11237f {

    /* JADX INFO: renamed from: b */
    private static C11237f f23527b = new C11237f();

    /* JADX INFO: renamed from: a */
    private Context f23528a;

    private C11237f() {
    }

    /* JADX INFO: renamed from: b */
    public static C11237f m24762b() {
        return f23527b;
    }

    /* JADX INFO: renamed from: a */
    public Context m24763a() {
        return this.f23528a;
    }

    /* JADX INFO: renamed from: a */
    public void m24764a(Context context) {
        this.f23528a = context != null ? context.getApplicationContext() : null;
    }
}
