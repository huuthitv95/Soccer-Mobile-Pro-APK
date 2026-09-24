package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzkx implements zzma {
    private final Object zza;
    private zzbf zzb;

    public zzkx(Object obj, zzwx zzwxVar) {
        this.zza = obj;
        this.zzb = zzwxVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
