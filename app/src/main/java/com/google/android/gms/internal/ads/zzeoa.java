package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeoa implements zzhbf {
    final /* synthetic */ zzfjt zza;
    final /* synthetic */ zzeob zzb;

    zzeoa(zzeob zzeobVar, zzfjt zzfjtVar) {
        this.zza = zzfjtVar;
        Objects.requireNonNull(zzeobVar);
        this.zzb = zzeobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        zzeob zzeobVar = this.zzb;
        synchronized (zzeobVar) {
            zzeoc zzeocVarZzc = zzeobVar.zzc();
            zzfjt zzfjtVar = this.zza;
            zzeocVarZzc.zzc(th, zzfjtVar);
            zzfjt zzfjtVarZza = zzeobVar.zzc().zza();
            if (zzfjtVar.zzav) {
                while (zzfjtVarZza != null) {
                    zzeobVar.zzb(zzfjtVarZza);
                    zzfjtVarZza = zzeobVar.zzc().zza();
                }
            } else if (zzfjtVarZza != null) {
                zzeobVar.zzb(zzfjtVarZza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeob zzeobVar = this.zzb;
        zzeos zzeosVar = (zzeos) obj;
        synchronized (zzeobVar) {
            zzeobVar.zzc().zzb(zzeosVar, this.zza);
            zzfjt zzfjtVarZza = zzeobVar.zzc().zza();
            if (zzfjtVarZza != null) {
                zzeobVar.zzb(zzfjtVarZza);
            }
        }
    }
}
