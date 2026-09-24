package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcne implements zzimi {
    private final zzcmz zza;

    private zzcne(zzcmz zzcmzVar) {
        this.zza = zzcmzVar;
    }

    public static zzcne zzc(zzcmz zzcmzVar) {
        return new zzcne(zzcmzVar);
    }

    public static Context zzd(zzcmz zzcmzVar) {
        Context contextZzb = zzcmzVar.zzb();
        zzimq.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
