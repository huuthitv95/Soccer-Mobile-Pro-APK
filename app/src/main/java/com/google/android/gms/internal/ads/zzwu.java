package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwu implements zzxa, zzwz {
    public final zzxc zza;
    private final long zzb;
    private final zzabd zzc;
    private zzxe zzd;
    private zzxa zze;
    private zzwz zzf;
    private long zzg = -9223372036854775807L;

    public zzwu(zzxc zzxcVar, zzabd zzabdVar, long j) {
        this.zza = zzxcVar;
        this.zzc = zzabdVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzg;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwz zzwzVar, long j) {
        this.zzf = zzwzVar;
        zzxa zzxaVar = this.zze;
        if (zzxaVar != null) {
            zzxaVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzc() throws IOException {
        zzxa zzxaVar = this.zze;
        if (zzxaVar != null) {
            zzxaVar.zzc();
            return;
        }
        zzxe zzxeVar = this.zzd;
        if (zzxeVar != null) {
            zzxeVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final zzzf zzd() {
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        return zzxaVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zze(zzaas[] zzaasVarArr, boolean[] zArr, zzyu[] zzyuVarArr, boolean[] zArr2, long j) {
        long j2 = this.zzg;
        long j3 = (j2 == -9223372036854775807L || j != this.zzb) ? j : j2;
        this.zzg = -9223372036854775807L;
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        return zzxaVar.zze(zzaasVarArr, zArr, zzyuVarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzf(long j, boolean z) {
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        zzxaVar.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        zzxaVar.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzh() {
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        return zzxaVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        return zzxaVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzj(long j) {
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        return zzxaVar.zzj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzk(long j, zznc zzncVar) {
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        return zzxaVar.zzk(j, zzncVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        zzxa zzxaVar = this.zze;
        String str = zzfk.zza;
        return zzxaVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        zzxa zzxaVar = this.zze;
        return zzxaVar != null && zzxaVar.zzm(zzluVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        zzxa zzxaVar = this.zze;
        return zzxaVar != null && zzxaVar.zzn();
    }

    public final void zzo(long j) {
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzp(zzxa zzxaVar) {
        zzwz zzwzVar = this.zzf;
        String str = zzfk.zza;
        zzwzVar.zzp(this);
    }

    public final long zzq() {
        return this.zzg;
    }

    public final void zzr(zzxe zzxeVar) {
        zzgsw.zzi(this.zzd == null);
        this.zzd = zzxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final /* bridge */ /* synthetic */ void zzs(zzyw zzywVar) {
        zzwz zzwzVar = this.zzf;
        String str = zzfk.zza;
        zzwzVar.zzs(this);
    }

    public final void zzt(zzxc zzxcVar) {
        long jZzv = zzv(this.zzb);
        zzxe zzxeVar = this.zzd;
        zzxeVar.getClass();
        zzxa zzxaVarZzG = zzxeVar.zzG(zzxcVar, this.zzc, jZzv);
        this.zze = zzxaVarZzG;
        if (this.zzf != null) {
            zzxaVarZzG.zzb(this, jZzv);
        }
    }

    public final void zzu() {
        zzxa zzxaVar = this.zze;
        if (zzxaVar != null) {
            zzxe zzxeVar = this.zzd;
            zzxeVar.getClass();
            zzxeVar.zzD(zzxaVar);
        }
    }
}
