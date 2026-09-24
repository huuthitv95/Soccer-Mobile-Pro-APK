package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzacs implements zzaek {
    final /* synthetic */ zzvb zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzacw zzd;

    zzacs(zzacw zzacwVar, zzvb zzvbVar, int i, long j) {
        this.zza = zzvbVar;
        this.zzb = i;
        this.zzc = j;
        Objects.requireNonNull(zzacwVar);
        this.zzd = zzacwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final void zza(long j) {
        this.zzd.zzaB(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final void zzb() {
        this.zzd.zzay(this.zza, this.zzb, this.zzc);
    }
}
