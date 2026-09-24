package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzalb implements zzakx {
    private final zzes zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzalb(zzfx zzfxVar) {
        zzes zzesVar = zzfxVar.zza;
        this.zza = zzesVar;
        zzesVar.zzh(12);
        this.zzc = zzesVar.zzH() & 255;
        this.zzb = zzesVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzs();
        }
        if (i == 16) {
            return this.zza.zzt();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzs = this.zza.zzs();
        this.zze = iZzs;
        return (iZzs & 240) >> 4;
    }
}
