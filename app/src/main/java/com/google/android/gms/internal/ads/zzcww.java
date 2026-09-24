package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcww implements zzddt, zzbee, zzdhh {
    private final zzfjt zza;
    private final zzdcx zzb;
    private final zzdec zzc;
    private final zzdey zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcww(zzfjt zzfjtVar, zzdcx zzdcxVar, zzdec zzdecVar, zzdey zzdeyVar) {
        this.zza = zzfjtVar;
        this.zzb = zzdcxVar;
        this.zzc = zzdecVar;
        this.zzf = zzdeyVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdH() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzg() {
        int i = this.zza.zze;
        if (i == 1 || i == 4) {
            return;
        }
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final void zzdj(zzbed zzbedVar) {
        int i = this.zza.zze;
        if (i == 1) {
            if (zzbedVar.zzj) {
                zzd();
            }
        } else if (i == 4 && zzbedVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzbedVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }
}
