package com.iab.omid.library.bytedance2.internal;

import android.content.Context;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public class C10984g {

    /* JADX INFO: renamed from: b */
    private static C10984g f22853b = new C10984g();

    /* JADX INFO: renamed from: a */
    private Context f22854a;

    private C10984g() {
    }

    /* JADX INFO: renamed from: b */
    public static C10984g m23503b() {
        return f22853b;
    }

    /* JADX INFO: renamed from: a */
    public Context m23504a() {
        return this.f22854a;
    }

    /* JADX INFO: renamed from: a */
    public void m23505a(Context context) {
        this.f22854a = context != null ? context.getApplicationContext() : null;
    }
}
