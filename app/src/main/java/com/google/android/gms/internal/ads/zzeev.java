package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeev implements zzhbf {
    final /* synthetic */ zzeey zza;

    zzeev(zzeey zzeeyVar) {
        Objects.requireNonNull(zzeeyVar);
        this.zza = zzeeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhh)).booleanValue()) {
            Matcher matcher = zzeey.zzh.matcher(th.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzeey zzeeyVar = this.zza;
                zzeeyVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfke zzfkeVar = (zzfke) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhh)).booleanValue()) {
            zzeey zzeeyVar = this.zza;
            zzfjw zzfjwVar = zzfkeVar.zzb.zzb;
            zzeeyVar.zzc().zzc(zzfjwVar.zzf);
            zzeeyVar.zzc().zze(zzfjwVar.zzg);
        }
    }
}
