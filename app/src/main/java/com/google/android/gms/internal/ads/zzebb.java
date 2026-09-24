package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzebb extends zzbrg {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfpi zzd;
    final /* synthetic */ zzcfk zze;
    final /* synthetic */ zzebk zzf;

    zzebb(zzebk zzebkVar, Object obj, String str, long j, zzfpi zzfpiVar, zzcfk zzcfkVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfpiVar;
        this.zze = zzcfkVar;
        Objects.requireNonNull(zzebkVar);
        this.zzf = zzebkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zze() {
        synchronized (this.zza) {
            zzebk zzebkVar = this.zzf;
            String str = this.zzb;
            zzebkVar.zzm(str, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzebkVar.zzr().zzb(str);
            zzebkVar.zzs().zzb(str);
            zzfpv zzfpvVarZzt = zzebkVar.zzt();
            zzfpi zzfpiVar = this.zzd;
            zzfpiVar.zzd(true);
            zzfpvVarZzt.zzb(zzfpiVar.zzm());
            this.zze.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzebk zzebkVar = this.zzf;
            String str2 = this.zzb;
            zzebkVar.zzm(str2, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzebkVar.zzr().zzc(str2, "error");
            zzebkVar.zzs().zzc(str2, "error");
            zzfpv zzfpvVarZzt = zzebkVar.zzt();
            zzfpi zzfpiVar = this.zzd;
            zzfpiVar.zzk(str);
            zzfpiVar.zzd(false);
            zzfpvVarZzt.zzb(zzfpiVar.zzm());
            this.zze.zzc(false);
        }
    }
}
