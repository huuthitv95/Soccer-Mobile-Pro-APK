package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: ri */
    private WeakReference<InterfaceC2532ri> f7029ri;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<InterfaceC2532ri> weakReference = this.f7029ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f7029ri.get().onThemeChanged(intExtra);
    }

    /* JADX INFO: renamed from: ri */
    public void m9173ri(InterfaceC2532ri interfaceC2532ri) {
        this.f7029ri = new WeakReference<>(interfaceC2532ri);
    }
}
