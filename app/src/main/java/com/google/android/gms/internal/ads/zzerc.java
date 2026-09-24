package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzerc implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdlo zza;

    zzerc(zzerd zzerdVar, zzdlo zzdloVar) {
        this.zza = zzdloVar;
        Objects.requireNonNull(zzerdVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdlo zzdloVar = this.zza;
        zzdloVar.zzd().zza();
        zzdloVar.zze().zza();
    }
}
