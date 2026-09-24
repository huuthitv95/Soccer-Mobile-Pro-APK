package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C11455Gb;
import com.ironsource.C11532Kg;
import com.ironsource.C12429pf;
import com.ironsource.InterfaceC12108b4;

/* JADX INFO: loaded from: classes6.dex */
public class ContextProvider {

    /* JADX INFO: renamed from: b */
    private static volatile ContextProvider f30323b;

    /* JADX INFO: renamed from: a */
    private InterfaceC12108b4 f30324a = new C12429pf();

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f30323b == null) {
            synchronized (ContextProvider.class) {
                if (f30323b == null) {
                    f30323b = new ContextProvider();
                }
            }
        }
        return f30323b;
    }

    public Context getActiveContext() {
        Activity activityMo26309a = this.f30324a.mo26309a();
        return activityMo26309a != null ? activityMo26309a : this.f30324a.mo26312b();
    }

    public Context getApplicationContext() {
        Context contextMo26312b = this.f30324a.mo26312b();
        Activity activityMo26309a = this.f30324a.mo26309a();
        return (contextMo26312b != null || activityMo26309a == null) ? contextMo26312b : activityMo26309a.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f30324a.mo26309a();
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f30324a.mo26310a(activity);
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f30324a.mo26311a(context);
        }
    }

    public void updateStrategyIfNeeded() {
        if (C11455Gb.m25891U().mo25846h().mo32191r()) {
            this.f30324a = new C11532Kg(this.f30324a.mo26309a(), this.f30324a.mo26312b());
        }
    }
}
