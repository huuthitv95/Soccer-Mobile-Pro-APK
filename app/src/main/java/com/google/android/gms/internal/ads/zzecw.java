package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzecw extends AdListener {
    final /* synthetic */ zzedc zza;

    zzecw(zzedc zzedcVar) {
        Objects.requireNonNull(zzedcVar);
        this.zza = zzedcVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zza.zzg(zzedc.zzm(loadAdError));
    }
}
