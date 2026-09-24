package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzczh implements com.google.android.gms.ads.internal.client.zza {
    private final zzczl zza;
    private final zzfkm zzb;

    zzczh(zzczl zzczlVar, zzfkm zzfkmVar) {
        this.zza = zzczlVar;
        this.zzb = zzfkmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
