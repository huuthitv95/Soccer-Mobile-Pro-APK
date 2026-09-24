package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzzc implements zzxa, zzwz {
    private final zzxa zza;
    private final long zzb;
    private zzwz zzc;

    public zzzc(zzxa zzxaVar, long j) {
        this.zza = zzxaVar;
        this.zzb = j;
    }

    public final zzxa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwz zzwzVar, long j) {
        this.zzc = zzwzVar;
        this.zza.zzb(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final zzzf zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zze(zzaas[] zzaasVarArr, boolean[] zArr, zzyu[] zzyuVarArr, boolean[] zArr2, long j) {
        zzyu[] zzyuVarArr2 = new zzyu[zzyuVarArr.length];
        int i = 0;
        while (true) {
            zzyu zzyuVarZza = null;
            if (i >= zzyuVarArr.length) {
                break;
            }
            zzzb zzzbVar = (zzzb) zzyuVarArr[i];
            if (zzzbVar != null) {
                zzyuVarZza = zzzbVar.zza();
            }
            zzyuVarArr2[i] = zzyuVarZza;
            i++;
        }
        zzxa zzxaVar = this.zza;
        long j2 = this.zzb;
        long jZze = zzxaVar.zze(zzaasVarArr, zArr, zzyuVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzyuVarArr.length; i2++) {
            zzyu zzyuVar = zzyuVarArr2[i2];
            if (zzyuVar == null) {
                zzyuVarArr[i2] = null;
            } else {
                zzyu zzyuVar2 = zzyuVarArr[i2];
                if (zzyuVar2 == null || ((zzzb) zzyuVar2).zza() != zzyuVar) {
                    zzyuVarArr[i2] = new zzzb(zzyuVar, j2);
                }
            }
        }
        return jZze + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
        this.zza.zzg(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzj(long j) {
        long j2 = this.zzb;
        return this.zza.zzj(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzk(long j, zznc zzncVar) {
        long j2 = this.zzb;
        return this.zza.zzk(j - j2, zzncVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        long j = zzluVar.zza;
        long j2 = this.zzb;
        zzlt zzltVarZza = zzluVar.zza();
        zzltVarZza.zza(j - j2);
        return this.zza.zzm(zzltVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final /* bridge */ /* synthetic */ void zzs(zzyw zzywVar) {
        zzwz zzwzVar = this.zzc;
        zzwzVar.getClass();
        zzwzVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzp(zzxa zzxaVar) {
        zzwz zzwzVar = this.zzc;
        zzwzVar.getClass();
        zzwzVar.zzp(this);
    }
}
