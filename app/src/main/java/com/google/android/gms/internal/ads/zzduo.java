package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzduo extends zzdtz implements zzdkm {
    private zzdkm zza;

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized void zzdR() {
        zzdkm zzdkmVar = this.zza;
        if (zzdkmVar != null) {
            zzdkmVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final synchronized void zzdu() {
        zzdkm zzdkmVar = this.zza;
        if (zzdkmVar != null) {
            zzdkmVar.zzdu();
        }
    }

    protected final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbnu zzbnuVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbnw zzbnwVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdkm zzdkmVar) throws Throwable {
        try {
            try {
                super.zzm(zzaVar, zzbnuVar, zzrVar, zzbnwVar, zzadVar);
                this.zza = zzdkmVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
