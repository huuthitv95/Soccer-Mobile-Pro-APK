package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfgx implements zzfhk {
    private final zzfmb zza;
    private final Executor zzb;
    private final zzhbf zzc = new zzfgu(this);

    public zzfgx(zzfmb zzfmbVar, Executor executor) {
        this.zza = zzfmbVar;
        this.zzb = executor;
    }

    public final ListenableFuture zza(zzfhl zzfhlVar, zzfhj zzfhjVar, final zzdbn zzdbnVar) {
        zzfmb zzfmbVar = this.zza;
        Executor executor = this.zzb;
        return (zzhba) zzhbi.zzg((zzhba) zzhbi.zzj(zzhba.zzw(new zzfhg(zzfmbVar, zzdbnVar, executor).zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfgv
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzdbnVar, (zzfhe) obj);
            }
        }, executor), Exception.class, new zzfgt(this), executor);
    }

    final /* synthetic */ ListenableFuture zzb(zzdbn zzdbnVar, zzfhe zzfheVar) {
        zzfmb zzfmbVar = this.zza;
        zzfml zzfmlVar = zzfheVar.zzb;
        zzcar zzcarVar = zzfheVar.zza;
        zzfmk zzfmkVarZza = zzfmbVar.zza(zzfmlVar);
        if (zzfmkVarZza != null && zzcarVar != null) {
            zzhbi.zzr(zzdbnVar.zza().zzf(zzcarVar), this.zzc, this.zzb);
        }
        return zzhbi.zza(new zzfgw(zzfmlVar, zzcarVar, zzfmkVarZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfhl zzfhlVar, zzfhj zzfhjVar, Object obj) {
        return zza(zzfhlVar, zzfhjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
