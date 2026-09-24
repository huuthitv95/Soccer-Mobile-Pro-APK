package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbs implements zzimi {
    private final zzdbp zza;

    private zzdbs(zzdbp zzdbpVar) {
        this.zza = zzdbpVar;
    }

    public static zzdbs zzc(zzdbp zzdbpVar) {
        return new zzdbs(zzdbpVar);
    }

    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
