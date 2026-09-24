package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.l */
/* JADX INFO: loaded from: classes6.dex */
public class C12291l implements InterfaceC12412og {

    /* JADX INFO: renamed from: a */
    private WeakReference<Activity> f30757a;

    public C12291l(Activity activity) {
        this.f30757a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.InterfaceC12412og
    /* JADX INFO: renamed from: a */
    public void mo31915a() {
        Activity activity = this.f30757a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
