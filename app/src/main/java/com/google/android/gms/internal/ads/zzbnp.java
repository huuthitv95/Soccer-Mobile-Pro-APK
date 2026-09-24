package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbnp {
    private final com.google.android.gms.ads.formats.zze zza;
    private final com.google.android.gms.ads.formats.zzd zzb;
    private zzbmk zzc;

    public zzbnp(com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
        this.zza = zzeVar;
        this.zzb = zzdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbmk zze(zzbmj zzbmjVar) {
        zzbmk zzbmkVar = this.zzc;
        if (zzbmkVar != null) {
            return zzbmkVar;
        }
        zzbmk zzbmkVar2 = new zzbmk(zzbmjVar);
        this.zzc = zzbmkVar2;
        return zzbmkVar2;
    }

    public final zzbmw zza() {
        return new zzbno(this, null);
    }

    public final zzbmt zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbnn(this, null);
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zze zzc() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.formats.zzd zzd() {
        return this.zzb;
    }
}
