package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaga implements zzags {
    private final zzagc zza;
    private final long zzb;

    public zzaga(zzagc zzagcVar, long j) {
        this.zza = zzagcVar;
        this.zzb = j;
    }

    private final zzagt zze(long j, long j2) {
        return new zzagt((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final zzagq zzc(long j) {
        zzagc zzagcVar = this.zza;
        zzagb zzagbVar = zzagcVar.zzk;
        zzagbVar.getClass();
        long jZzb = zzagcVar.zzb(j);
        long[] jArr = zzagbVar.zza;
        int iZzo = zzfk.zzo(jArr, jZzb, true, false);
        long j2 = iZzo == -1 ? 0L : jArr[iZzo];
        long[] jArr2 = zzagbVar.zzb;
        zzagt zzagtVarZze = zze(j2, iZzo != -1 ? jArr2[iZzo] : 0L);
        if (zzagtVarZze.zzb == j || iZzo == jArr.length - 1) {
            return new zzagq(zzagtVarZze, zzagtVarZze);
        }
        int i = iZzo + 1;
        return new zzagq(zzagtVarZze, zze(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public /* synthetic */ boolean zzj() {
        return zzags.CC.$default$zzj(this);
    }
}
