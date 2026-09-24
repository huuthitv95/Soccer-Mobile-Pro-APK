package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdrh implements zzdcz {
    private final zzdph zza;
    private final zzdpm zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdrh(zzdph zzdphVar, zzdpm zzdpmVar, Executor executor, Executor executor2) {
        this.zza = zzdphVar;
        this.zzb = zzdpmVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcki zzckiVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzckiVar.zze("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdph zzdphVar = this.zza;
            zzelb zzelbVarZzZ = zzdphVar.zzZ();
            if (zzelbVarZzZ == null && zzdphVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzgr)).booleanValue()) {
                ListenableFuture listenableFutureZzX = zzdphVar.zzX();
                zzcfk zzcfkVarZzY = zzdphVar.zzY();
                if (listenableFutureZzX == null || zzcfkVarZzY == null) {
                    return;
                }
                zzhbi.zzr(zzhbi.zzq(listenableFutureZzX, zzcfkVarZzY), new zzdrf(this), this.zzd);
                return;
            }
            if (zzelbVarZzZ != null) {
                zzcki zzckiVarZzW = zzdphVar.zzW();
                zzcki zzckiVarZzT = zzdphVar.zzT();
                if (zzckiVarZzW == null) {
                    zzckiVarZzW = zzckiVarZzT == null ? null : zzckiVarZzT;
                }
                if (zzckiVarZzW != null) {
                    zza(zzckiVarZzW);
                }
            }
        }
    }
}
