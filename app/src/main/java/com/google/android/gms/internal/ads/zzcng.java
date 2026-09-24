package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcng implements zzimi {
    private final zzcmz zza;

    private zzcng(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcng zzc(zzcmz zzcmzVar) {
        return new zzcng(zzcmzVar);
    }

    public static Context zzd(zzcmz zzcmzVar) {
        Context contextZza = zzcmzVar.zza();
        zzimq.zzb(contextZza);
        return contextZza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
