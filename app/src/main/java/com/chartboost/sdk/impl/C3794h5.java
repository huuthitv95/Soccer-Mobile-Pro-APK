package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3794h5 {

    /* JADX INFO: renamed from: a */
    public static final C3794h5 f14372a = new C3794h5();

    /* JADX INFO: renamed from: b */
    public static WeakReference f14373b;

    /* JADX INFO: renamed from: c */
    public static Application f14374c;

    /* JADX INFO: renamed from: a */
    public final Context m17855a() {
        Context context;
        WeakReference weakReference = f14373b;
        return (weakReference == null || (context = (Context) weakReference.get()) == null) ? f14374c : context;
    }

    /* JADX INFO: renamed from: a */
    public final void m17856a(Context context) {
        if (context instanceof Application) {
            f14374c = (Application) context;
            return;
        }
        f14373b = new WeakReference(context);
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        f14374c = applicationContext instanceof Application ? (Application) applicationContext : null;
    }
}
