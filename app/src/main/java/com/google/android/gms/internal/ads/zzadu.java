package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzadu {
    private final zzadm zza;
    private final zzadn zzf;
    private long zzk;
    private final zzacm zzl;
    private final zzadk zzb = new zzadk();
    private final zzfg zzc = new zzfg(10);
    private final zzfg zzd = new zzfg(10);
    private final zzeh zze = new zzeh(16);
    private long zzg = -9223372036854775807L;
    private zzbv zzj = zzbv.zza;
    private long zzh = -9223372036854775807L;
    private long zzi = -9223372036854775807L;

    public zzadu(zzacm zzacmVar, zzadm zzadmVar, zzadn zzadnVar) {
        this.zzl = zzacmVar;
        this.zza = zzadmVar;
        this.zzf = zzadnVar;
    }

    private static Object zzh(zzfg zzfgVar) {
        zzgsw.zza(zzfgVar.zzc() > 0);
        while (zzfgVar.zzc() > 1) {
            zzfgVar.zzd();
        }
        Object objZzd = zzfgVar.zzd();
        objZzd.getClass();
        return objZzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        zzfg zzfgVar = this.zzd;
        if (zzfgVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzfgVar)).longValue();
        }
        zzfg zzfgVar2 = this.zzc;
        if (zzfgVar2.zzc() > 0) {
            zzfgVar2.zza(0L, (zzbv) zzh(zzfgVar2));
        }
    }

    public final void zzb(long j, long j2) throws zzje {
        while (true) {
            zzeh zzehVar = this.zze;
            if (zzehVar.zzd()) {
                return;
            }
            zzfg zzfgVar = this.zzd;
            long jZzc = zzehVar.zzc();
            Long l = (Long) zzfgVar.zze(jZzc);
            if (l != null && l.longValue() != this.zzk) {
                this.zzk = l.longValue();
                this.zza.zza(2);
            }
            zzadm zzadmVar = this.zza;
            long j3 = this.zzk;
            zzadk zzadkVar = this.zzb;
            int iZzk = zzadmVar.zzk(jZzc, j, j2, j3, false, false, zzadkVar);
            if (iZzk != 5 && iZzk != 4) {
                this.zzf.zza(jZzc, zzadkVar.zza());
            }
            if (iZzk == 0 || iZzk == 1) {
                this.zzh = jZzc;
                long jZzb = zzehVar.zzb();
                zzbv zzbvVar = (zzbv) this.zzc.zze(jZzb);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzj)) {
                    this.zzj = zzbvVar;
                    this.zzl.zza(zzbvVar);
                }
                this.zzl.zzb(iZzk == 0 ? System.nanoTime() : zzadkVar.zzb(), jZzb, zzadmVar.zzf());
            } else if (iZzk == 2 || iZzk == 3) {
                this.zzh = jZzc;
                zzehVar.zzb();
                final zzacm zzacmVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzack
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzacmVar.zza.zzB().zzc();
                    }
                };
                zzacn zzacnVar = zzacmVar.zza;
                zzacnVar.zzC().execute(runnable);
                ((zzaek) zzacnVar.zzz().remove()).zzb();
            } else if (iZzk != 4) {
                return;
            } else {
                this.zzh = jZzc;
            }
        }
    }

    public final void zzc(int i, int i2) {
        long j = this.zzg;
        this.zzc.zza(j == -9223372036854775807L ? 0L : j + 1, new zzbv(i, i2, 1.0f));
    }

    public final void zzd(int i, long j) {
        if (this.zze.zzd()) {
            this.zza.zza(i);
            this.zzk = j;
        } else {
            zzfg zzfgVar = this.zzd;
            long j2 = this.zzg;
            zzfgVar.zza(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    public final void zze(long j) {
        this.zze.zza(j);
        this.zzg = j;
        this.zzi = -9223372036854775807L;
    }

    public final void zzf() {
        long j = this.zzg;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j;
    }

    public final boolean zzg() {
        long j = this.zzi;
        return j != -9223372036854775807L && this.zzh == j;
    }
}
