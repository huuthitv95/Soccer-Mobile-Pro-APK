package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzetz implements zzfby {
    private final zzhbs zza;
    private final zzfkm zzb;

    zzetz(zzhbs zzhbsVar, zzfkm zzfkmVar, zzflc zzflcVar) {
        this.zza = zzhbsVar;
        this.zzb = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ zzeua zzc() {
        List listAsList;
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhY)).booleanValue()) {
            String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzia)).booleanValue()) {
                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzib)).split(","));
            } else {
                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhZ)).split(","));
            }
            if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(strZzc))) {
                strZza = zzflc.zza();
            }
        }
        return new zzeua(strZza);
    }
}
