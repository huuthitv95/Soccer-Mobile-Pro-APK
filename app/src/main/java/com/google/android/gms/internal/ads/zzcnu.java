package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcnu implements zzimi {
    private final zzimr zza;

    private zzcnu(zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzcnu zza(zzimr zzimrVar) {
        return new zzcnu(zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcng) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmQ)).booleanValue()) {
            return com.google.android.gms.ads.internal.util.client.zzf.zzf(contextZza);
        }
        return null;
    }
}
