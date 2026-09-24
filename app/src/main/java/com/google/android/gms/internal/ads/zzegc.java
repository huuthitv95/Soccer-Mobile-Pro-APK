package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegc implements zzege {
    private final Map zza;
    private final zzhbs zzb;
    private final zzdfj zzc;

    public zzegc(Map map, zzhbs zzhbsVar, zzdfj zzdfjVar) {
        this.zza = map;
        this.zzb = zzhbsVar;
        this.zzc = zzdfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final ListenableFuture zza(final zzcar zzcarVar) {
        this.zzc.zzdP(zzcarVar);
        ListenableFuture listenableFutureZzc = zzhbi.zzc(new zzedr(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjv)).split(",")) {
            final zzimx zzimxVar = (zzimx) this.zza.get(str.trim());
            if (zzimxVar != null) {
                listenableFutureZzc = zzhbi.zzh(listenableFutureZzc, zzedr.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzegb
                    @Override // com.google.android.gms.internal.ads.zzhaq
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return ((zzege) zzimxVar.zzb()).zza(zzcarVar);
                    }
                }, this.zzb);
            }
        }
        zzhbi.zzr(listenableFutureZzc, new zzega(this), zzcff.zzh);
        return listenableFutureZzc;
    }

    final /* synthetic */ zzdfj zzb() {
        return this.zzc;
    }
}
