package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeqs implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcfk zza;
    final /* synthetic */ zzfke zzb;
    final /* synthetic */ zzfjt zzc;
    final /* synthetic */ zzeqz zzd;
    final /* synthetic */ zzequ zze;

    zzeqs(zzequ zzequVar, zzcfk zzcfkVar, zzfke zzfkeVar, zzfjt zzfjtVar, zzeqz zzeqzVar) {
        this.zza = zzcfkVar;
        this.zzb = zzfkeVar;
        this.zzc = zzfjtVar;
        this.zzd = zzeqzVar;
        Objects.requireNonNull(zzequVar);
        this.zze = zzequVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzeqz zzeqzVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzeqzVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
