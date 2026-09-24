package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzazx implements zzfxo {
    final /* synthetic */ zzfwq zza;

    zzazx(zzfwq zzfwqVar) {
        this.zza = zzfwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zza(int i, long j) {
        this.zza.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final void zzb(int i, long j, String str) {
        this.zza.zzf(i, System.currentTimeMillis() - j, str);
    }
}
