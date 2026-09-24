package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfha implements zzfhk {
    private zzdbn zza;

    @Override // com.google.android.gms.internal.ads.zzfhk
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdbn zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfhl zzfhlVar, zzfhj zzfhjVar, Object obj) {
        return zzb(zzfhlVar, zzfhjVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfhl zzfhlVar, zzfhj zzfhjVar, zzdbn zzdbnVar) {
        zzcyl zzcylVarZza;
        try {
            if (zzdbnVar != null) {
                this.zza = zzdbnVar;
            } else {
                this.zza = (zzdbn) zzfhjVar.zza(zzfhlVar.zzb).zzh();
            }
            zzcylVarZza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzcylVarZza.zzc(zzcylVarZza.zzb());
    }
}
