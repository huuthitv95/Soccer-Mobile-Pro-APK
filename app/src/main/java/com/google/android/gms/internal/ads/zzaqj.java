package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqj {
    private final zzapm zza;
    private final zzfh zzb;
    private final zzer zzc = new zzer(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaqj(zzapm zzapmVar, zzfh zzfhVar) {
        this.zza = zzapmVar;
        this.zzb = zzfhVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzes zzesVar) throws zzat {
        long jZze;
        char c;
        zzer zzerVar = this.zzc;
        zzesVar.zzm(zzerVar.zza, 0, 3);
        zzerVar.zzf(0);
        zzerVar.zzh(8);
        this.zzd = zzerVar.zzi();
        this.zze = zzerVar.zzi();
        zzerVar.zzh(6);
        zzesVar.zzm(zzerVar.zza, 0, zzerVar.zzj(8));
        zzerVar.zzf(0);
        if (this.zzd) {
            zzerVar.zzh(4);
            long jZzj = zzerVar.zzj(3);
            zzerVar.zzh(1);
            int iZzj = zzerVar.zzj(15) << 15;
            zzerVar.zzh(1);
            long jZzj2 = zzerVar.zzj(15);
            zzerVar.zzh(1);
            if (this.zzf || !this.zze) {
                c = 30;
            } else {
                zzerVar.zzh(4);
                long jZzj3 = ((long) zzerVar.zzj(3)) << 30;
                zzerVar.zzh(1);
                int iZzj2 = zzerVar.zzj(15) << 15;
                zzerVar.zzh(1);
                c = 30;
                long jZzj4 = zzerVar.zzj(15);
                zzerVar.zzh(1);
                this.zzb.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                this.zzf = true;
            }
            jZze = this.zzb.zze((jZzj << c) | ((long) iZzj) | jZzj2);
        } else {
            jZze = 0;
        }
        zzapm zzapmVar = this.zza;
        zzapmVar.zzc(jZze, 4);
        zzapmVar.zzd(zzesVar);
        zzapmVar.zze(false);
    }
}
