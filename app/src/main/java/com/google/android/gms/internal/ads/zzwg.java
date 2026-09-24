package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwg implements zzxa, zzwz {
    public final zzxa zza;
    long zzb;
    private zzwz zzc;
    private zzwf[] zzd = new zzwf[0];
    private long zze = 0;
    private long zzf = -9223372036854775807L;

    public zzwg(zzxa zzxaVar, boolean z, long j, long j2) {
        this.zza = zzxaVar;
        this.zzb = j2;
    }

    private static long zzt(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwz zzwzVar, long j) {
        this.zzc = zzwzVar;
        this.zza.zzb(this, j);
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
        int length = zzyuVarArr.length;
        this.zzd = new zzwf[length];
        zzyu[] zzyuVarArr2 = new zzyu[length];
        int i = 0;
        while (true) {
            zzyu zzyuVar = null;
            if (i >= zzyuVarArr.length) {
                break;
            }
            zzwf[] zzwfVarArr = this.zzd;
            zzwf zzwfVar = (zzwf) zzyuVarArr[i];
            zzwfVarArr[i] = zzwfVar;
            if (zzwfVar != null) {
                zzyuVar = zzwfVar.zza;
            }
            zzyuVarArr2[i] = zzyuVar;
            i++;
        }
        long jZze = this.zza.zze(zzaasVarArr, zArr, zzyuVarArr2, zArr2, j);
        long jZzt = zzt(jZze, j, this.zzb);
        long j2 = -9223372036854775807L;
        if (zzo()) {
            if (jZze < j) {
                j2 = jZzt;
                break;
            }
            if (jZze != 0) {
                for (zzaas zzaasVar : zzaasVarArr) {
                    if (zzaasVar != null) {
                        zzv zzvVarZzc = zzaasVar.zzc();
                        if (!zzas.zzd(zzvVarZzc.zzp, zzvVarZzc.zzk)) {
                            j2 = jZzt;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j2;
        for (int i2 = 0; i2 < zzyuVarArr.length; i2++) {
            zzyu zzyuVar2 = zzyuVarArr2[i2];
            if (zzyuVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzwf[] zzwfVarArr2 = this.zzd;
                zzwf zzwfVar2 = zzwfVarArr2[i2];
                if (zzwfVar2 == null || zzwfVar2.zza != zzyuVar2) {
                    zzwfVarArr2[i2] = new zzwf(this, zzyuVar2);
                }
            }
            zzyuVarArr[i2] = this.zzd[i2];
        }
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzh() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            this.zzf = j;
            long jZzh = zzh();
            return jZzh != -9223372036854775807L ? jZzh : j;
        }
        long jZzh2 = this.zza.zzh();
        if (jZzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jZzt = zzt(jZzh2, 0L, this.zzb);
        if (jZzt == this.zzf) {
            return -9223372036854775807L;
        }
        this.zzf = jZzt;
        return jZzt;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzi < j) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzj(long j) {
        this.zze = -9223372036854775807L;
        for (zzwf zzwfVar : this.zzd) {
            if (zzwfVar != null) {
                zzwfVar.zza();
            }
        }
        return zzt(this.zza.zzj(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final long zzk(long j, zznc zzncVar) {
        if (j == 0) {
            return 0L;
        }
        long j2 = zzncVar.zzd;
        String str = zzfk.zza;
        long jMax = Math.max(0L, Math.min(j2, j));
        long j3 = zzncVar.zze;
        long j4 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (jMax != j2 || jMax2 != j3) {
            zzncVar = new zznc(jMax, jMax2);
        }
        return this.zza.zzk(j, zzncVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzl < j) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzm(zzlu zzluVar) {
        return this.zza.zzm(zzluVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzyw
    public final boolean zzn() {
        return this.zza.zzn();
    }

    final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    final /* synthetic */ long zzq() {
        return this.zzf;
    }

    final /* synthetic */ void zzr(long j) {
        this.zzf = -9223372036854775807L;
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
