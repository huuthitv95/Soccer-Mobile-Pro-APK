package com.mbridge.msdk.config.activity.backdispatcher;

import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: com.mbridge.msdk.config.activity.backdispatcher.a */
/* JADX INFO: compiled from: MBOnBackInvokedDispatcher.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12706a {

    /* JADX INFO: renamed from: a */
    OnBackInvokedCallback f33802a;

    /* JADX INFO: renamed from: a */
    public void m34815a(Window window, final InterfaceC12707b interfaceC12707b) {
        if (Build.VERSION.SDK_INT < 33 || window == null || interfaceC12707b == null) {
            return;
        }
        try {
            this.f33802a = new OnBackInvokedCallback() { // from class: com.mbridge.msdk.config.activity.backdispatcher.a$$ExternalSyntheticLambda1
                public final void onBackInvoked() {
                    interfaceC12707b.mo34374a();
                }
            };
            window.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f33802a);
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "registerOnBackInvokedCallback error");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34814a(Window window) {
        if (Build.VERSION.SDK_INT < 33 || window == null) {
            return;
        }
        try {
            window.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f33802a);
            this.f33802a = null;
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "unregisterOnBackInvokedCallback error");
        }
    }
}
