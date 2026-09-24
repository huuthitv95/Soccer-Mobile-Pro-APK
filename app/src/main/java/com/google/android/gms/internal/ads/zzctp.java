package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzctp {
    private final String zza;
    private final zzbuf zzb;
    private final Executor zzc;
    private zzctu zzd;
    private final zzbpe zze = new zzctm(this);
    private final zzbpe zzf = new zzcto(this);

    public zzctp(String str, zzbuf zzbufVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbufVar;
        this.zzc = executor;
    }

    public final void zza(zzctu zzctuVar) {
        zzbuf zzbufVar = this.zzb;
        zzbufVar.zzb("/updateActiveView", this.zze);
        zzbufVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzctuVar;
    }

    public final void zzb(zzcki zzckiVar) {
        zzckiVar.zzab("/updateActiveView", this.zze);
        zzckiVar.zzab("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzc(zzcki zzckiVar) {
        zzckiVar.zzac("/updateActiveView", this.zze);
        zzckiVar.zzac("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzd() {
        zzbuf zzbufVar = this.zzb;
        zzbufVar.zzc("/updateActiveView", this.zze);
        zzbufVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    final /* synthetic */ boolean zze(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zza);
    }

    final /* synthetic */ Executor zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzctu zzg() {
        return this.zzd;
    }
}
