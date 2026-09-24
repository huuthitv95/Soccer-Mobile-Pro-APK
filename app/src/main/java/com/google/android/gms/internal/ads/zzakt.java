package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzakt {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzes zzf;
    private final zzes zzg;
    private int zzh;
    private int zzi;

    public zzakt(zzes zzesVar, zzes zzesVar2, boolean z) throws zzat {
        this.zzg = zzesVar;
        this.zzf = zzesVar2;
        this.zze = z;
        zzesVar2.zzh(12);
        this.zza = zzesVar2.zzH();
        zzesVar.zzh(12);
        this.zzi = zzesVar.zzH();
        zzaft.zza(zzesVar.zzB() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzJ() : this.zzf.zzz();
        if (this.zzb == this.zzh) {
            zzes zzesVar = this.zzg;
            this.zzc = zzesVar.zzH();
            zzesVar.zzk(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + zzesVar.zzH() : -1;
        }
        return true;
    }
}
