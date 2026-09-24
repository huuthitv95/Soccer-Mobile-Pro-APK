package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zztd {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzqy zze;
    private final zzck zzf;

    private zztd(zzv zzvVar, zzv zzvVar2, int i, int i2, zzqy zzqyVar, zzck zzckVar) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = zzqyVar;
        this.zzf = zzckVar;
    }

    /* synthetic */ zztd(zzv zzvVar, zzv zzvVar2, int i, int i2, zzqy zzqyVar, zzck zzckVar, byte[] bArr) {
        this(zzvVar, zzvVar2, i, i2, zzqyVar, zzckVar);
    }

    final /* synthetic */ zztd zza(zzqy zzqyVar) {
        return new zztd(this.zza, this.zzb, this.zzc, this.zzd, zzqyVar, this.zzf);
    }

    final /* synthetic */ long zzb(long j) {
        return zzfk.zzt(j, this.zza.zzI);
    }

    final /* synthetic */ long zzc(long j) {
        return zzfk.zzt(j, this.zze.zzb);
    }

    final /* synthetic */ zzrq zzd() {
        zzqy zzqyVar = this.zze;
        return new zzrq(zzqyVar.zza, zzqyVar.zzb, zzqyVar.zzc, false, false, zzqyVar.zze);
    }

    final /* synthetic */ boolean zze() {
        return Objects.equals(this.zza.zzp, "audio/raw");
    }

    final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    final /* synthetic */ zzv zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    final /* synthetic */ zzqy zzj() {
        return this.zze;
    }

    final /* synthetic */ zzck zzk() {
        return this.zzf;
    }
}
