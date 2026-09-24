package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfkz {
    private final zzfjt zza;
    private final zzfjw zzb;
    private final zzfro zzc;
    private final zzfrg zzd;
    private final zzfps zze;
    private final zzcsx zzf;

    public zzfkz(zzfro zzfroVar, zzfrg zzfrgVar, zzfjt zzfjtVar, zzfjw zzfjwVar, zzcsx zzcsxVar, zzfps zzfpsVar) {
        this.zza = zzfjtVar;
        this.zzb = zzfjwVar;
        this.zzc = zzfroVar;
        this.zzd = zzfrgVar;
        this.zzf = zzcsxVar;
        this.zze = zzfpsVar;
    }

    public final void zza(List list, zzdeu zzdeuVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), 2, zzdeuVar);
        }
    }

    public final void zzb(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzhbi.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlu)).booleanValue() && zzcsx.zzc(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhbi.zza(str), new zzfky(this, i), zzcff.zza);
        }
    }

    public final void zzc(String str, int i, zzdeu zzdeuVar) {
        zzfjt zzfjtVar = this.zza;
        if (zzfjtVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i);
            return;
        }
        this.zzc.zzb(str, zzfjtVar.zzax, this.zze, zzdeuVar);
    }
}
