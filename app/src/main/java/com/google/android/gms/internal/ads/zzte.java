package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzte {
    private final zzco[] zza;
    private final zztr zzb;
    private final zzcu zzc;

    public zzte(zzco... zzcoVarArr) {
        zztr zztrVar = new zztr();
        zzcu zzcuVar = new zzcu();
        zzco[] zzcoVarArr2 = {zztrVar, zzcuVar};
        this.zza = zzcoVarArr2;
        System.arraycopy(zzcoVarArr, 0, zzcoVarArr2, 0, 0);
        this.zzb = zztrVar;
        this.zzc = zzcuVar;
    }

    public final zzco[] zza() {
        return this.zza;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcu zzcuVar = this.zzc;
        zzcuVar.zzk(zzavVar.zzb);
        zzcuVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z) {
        this.zzb.zzq(z);
        return z;
    }

    public final long zzd(long j) {
        zzcu zzcuVar = this.zzc;
        return zzcuVar.zzc() ? zzcuVar.zzm(j) : j;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
