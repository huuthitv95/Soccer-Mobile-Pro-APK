package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfhb implements zzfhk {
    private final zzfhk zza;
    private zzdbn zzb;

    public zzfhb(zzfhk zzfhkVar) {
        this.zza = zzfhkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdbn zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfhl zzfhlVar, zzfhj zzfhjVar, Object obj) {
        return zzb(zzfhlVar, zzfhjVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfhl zzfhlVar, zzfhj zzfhjVar, zzdbn zzdbnVar) {
        zzcar zzcarVar;
        this.zzb = zzdbnVar;
        if (zzdbnVar == null || (zzcarVar = zzfhlVar.zza) == null) {
            return ((zzfha) this.zza).zzb(zzfhlVar, zzfhjVar, zzdbnVar);
        }
        zzcyl zzcylVarZza = zzdbnVar.zza();
        return zzcylVarZza.zzc(zzcylVarZza.zza(zzhbi.zza(zzcarVar)));
    }
}
