package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaqe implements zzaqm {
    private zzv zza;
    private zzfh zzb;
    private zzahb zzc;

    public zzaqe(String str, String str2) {
        zzt zztVar = new zzt();
        zztVar.zzn("video/mp2t");
        zztVar.zzo(str);
        this.zza = zztVar.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza(zzfh zzfhVar, zzafs zzafsVar, zzara zzaraVar) {
        this.zzb = zzfhVar;
        zzaraVar.zza();
        zzahb zzahbVarZzu = zzafsVar.zzu(zzaraVar.zzb(), 5);
        this.zzc = zzahbVarZzu;
        zzahbVarZzu.zzA(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zzb(zzes zzesVar) {
        this.zzb.getClass();
        String str = zzfk.zza;
        long jZzb = this.zzb.zzb();
        long jZzc = this.zzb.zzc();
        if (jZzb == -9223372036854775807L || jZzc == -9223372036854775807L) {
            return;
        }
        zzv zzvVar = this.zza;
        if (jZzc != zzvVar.zzu) {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzt(jZzc);
            zzv zzvVarZzO = zztVarZza.zzO();
            this.zza = zzvVarZzO;
            this.zzc.zzA(zzvVarZzO);
        }
        int iZzd = zzesVar.zzd();
        this.zzc.zzc(zzesVar, iZzd);
        this.zzc.zze(jZzb, 1, iZzd, 0, null);
    }
}
