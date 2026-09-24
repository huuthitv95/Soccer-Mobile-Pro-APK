package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimz extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzimz(zzbjf zzbjfVar) {
        this.zza = new WeakReference(zzbjfVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbjf zzbjfVar = (zzbjf) this.zza.get();
        if (zzbjfVar != null) {
            zzbjfVar.zzf(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbjf zzbjfVar = (zzbjf) this.zza.get();
        if (zzbjfVar != null) {
            zzbjfVar.zzg();
        }
    }
}
