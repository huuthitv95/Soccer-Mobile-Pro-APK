package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbja extends CustomTabsCallback {
    final /* synthetic */ zzbjd zza;

    zzbja(zzbjd zzbjdVar) {
        Objects.requireNonNull(zzbjdVar);
        this.zza = zzbjdVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.zza.zzc(i);
    }
}
