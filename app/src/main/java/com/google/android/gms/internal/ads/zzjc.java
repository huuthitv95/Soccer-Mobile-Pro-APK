package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzjc implements zzlv {
    private final zznf zza;
    private final zzjb zzb;
    private zzmu zzc;
    private zzlv zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzjc(zzjb zzjbVar, zzdo zzdoVar) {
        this.zzb = zzjbVar;
        this.zza = new zznf(zzdoVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j) {
        this.zza.zzc(j);
    }

    public final void zzd(zzmu zzmuVar) throws zzje {
        zzlv zzlvVar;
        zzlv zzlvVarZzd = zzmuVar.zzd();
        if (zzlvVarZzd == null || zzlvVarZzd == (zzlvVar = this.zzd)) {
            return;
        }
        if (zzlvVar != null) {
            throw zzje.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzlvVarZzd;
        this.zzc = zzmuVar;
        zzlvVarZzd.zzi(this.zza.zzj());
    }

    public final void zze(zzmu zzmuVar) {
        if (zzmuVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    public final long zzf(boolean z) {
        zznf zznfVar;
        zzav zzavVarZzj;
        zzmu zzmuVar = this.zzc;
        if (zzmuVar == null || zzmuVar.zzab() || ((z && this.zzc.zze() != 2) || (!this.zzc.zzaa() && (z || this.zzc.zzcW())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzlv zzlvVar = this.zzd;
            zzlvVar.getClass();
            long jZzg = zzlvVar.zzg();
            if (this.zze) {
                zznf zznfVar2 = this.zza;
                if (jZzg < zznfVar2.zzg()) {
                    zznfVar2.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zznfVar2.zza();
                    }
                    zznfVar = this.zza;
                    zznfVar.zzc(jZzg);
                    zzavVarZzj = zzlvVar.zzj();
                    if (!zzavVarZzj.equals(zznfVar.zzj())) {
                        zznfVar.zzi(zzavVarZzj);
                        this.zzb.zzc(zzavVarZzj);
                    }
                }
            } else {
                zznfVar = this.zza;
                zznfVar.zzc(jZzg);
                zzavVarZzj = zzlvVar.zzj();
                if (!zzavVarZzj.equals(zznfVar.zzj())) {
                    zznfVar.zzi(zzavVarZzj);
                    this.zzb.zzc(zzavVarZzj);
                }
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzlv zzlvVar = this.zzd;
        zzlvVar.getClass();
        return zzlvVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzi(zzav zzavVar) {
        zzlv zzlvVar = this.zzd;
        if (zzlvVar != null) {
            zzlvVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final zzav zzj() {
        zzlv zzlvVar = this.zzd;
        return zzlvVar != null ? zzlvVar.zzj() : this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzlv zzlvVar = this.zzd;
        zzlvVar.getClass();
        return zzlvVar.zzh();
    }
}
