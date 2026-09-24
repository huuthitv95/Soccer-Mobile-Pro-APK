package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdlw implements zzimi {
    private final zzdlr zza;

    private zzdlw(zzdlr zzdlrVar) {
        this.zza = zzdlrVar;
    }

    public static zzdlw zzc(zzdlr zzdlrVar) {
        return new zzdlw(zzdlrVar);
    }

    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
