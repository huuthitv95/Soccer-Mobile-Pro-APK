package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzboi implements zzhbf {
    final /* synthetic */ zzcki zza;

    zzboi(zzcki zzckiVar) {
        this.zza = zzckiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcki zzckiVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzckiVar.getContext(), zzckiVar.zzs().afmaVersion, str, null, zzckiVar.zzC() != null ? zzckiVar.zzC().zzax : null).zzb();
    }
}
