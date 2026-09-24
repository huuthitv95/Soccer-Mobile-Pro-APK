package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeei implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;

    private zzeei(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
    }

    public static zzeei zza(zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4, zzimr zzimrVar5) {
        return new zzeei(zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4, zzimrVar5);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0058  */
    /* JADX WARN: Code duplicated, block: B:8:0x0076  */
    /* JADX WARN: Code duplicated, block: B:9:0x0080  */
    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        ListenableFuture listenableFutureZzc;
        final zzbai zzbaiVar = (zzbai) this.zza.zzb();
        final Context contextZza = ((zzcng) this.zzb).zza();
        zzfkm zzfkmVarZza = ((zzdbw) this.zzc).zza();
        long jLongValue = ((Long) this.zzd.zzb()).longValue();
        zzhbs zzhbsVarZzc = zzfno.zzc();
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdA)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzfkmVarZza.zzd)))) {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jLongValue < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdC)).intValue()) {
                    listenableFutureZzc = zzhbsVarZzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeed
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzbaiVar.zzb().zzk(contextZza);
                        }
                    });
                } else {
                    listenableFutureZzc = zzhbsVarZzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeec
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return zzbaiVar.zzb().zzl(contextZza);
                        }
                    });
                }
            } else {
                listenableFutureZzc = zzhbsVarZzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeec
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzbaiVar.zzb().zzl(contextZza);
                    }
                });
            }
        } else {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jLongValue < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdC)).intValue()) {
                listenableFutureZzc = zzhbsVarZzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeed
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzbaiVar.zzb().zzk(contextZza);
                    }
                });
            } else {
                listenableFutureZzc = zzhbsVarZzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeec
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzbaiVar.zzb().zzl(contextZza);
                    }
                });
            }
        }
        zzimq.zzb(listenableFutureZzc);
        return listenableFutureZzc;
    }
}
