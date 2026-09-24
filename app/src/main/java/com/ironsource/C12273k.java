package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.k */
/* JADX INFO: loaded from: classes6.dex */
public class C12273k implements InterfaceC12412og {

    /* JADX INFO: renamed from: a */
    private WeakReference<Activity> f30713a;

    public C12273k(Activity activity) {
        this.f30713a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.InterfaceC12412og
    /* JADX INFO: renamed from: a */
    public void mo31915a() {
        Activity activity = this.f30713a.get();
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}
