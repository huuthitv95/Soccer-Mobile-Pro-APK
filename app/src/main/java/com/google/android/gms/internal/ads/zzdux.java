package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdux implements zzbpw {
    private final zzddm zza;
    private final zzcbp zzb;
    private final String zzc;
    private final String zzd;

    public zzdux(zzddm zzddmVar, zzfjt zzfjtVar) {
        this.zza = zzddmVar;
        this.zzb = zzfjtVar.zzl;
        this.zzc = zzfjtVar.zzj;
        this.zzd = zzfjtVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    @ParametersAreNonnullByDefault
    public final void zzb(zzcbp zzcbpVar) {
        int i;
        String str;
        zzcbp zzcbpVar2 = this.zzb;
        if (zzcbpVar2 != null) {
            zzcbpVar = zzcbpVar2;
        }
        if (zzcbpVar != null) {
            str = zzcbpVar.zza;
            i = zzcbpVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zze(new zzcba(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzc() {
        this.zza.zzf();
    }
}
