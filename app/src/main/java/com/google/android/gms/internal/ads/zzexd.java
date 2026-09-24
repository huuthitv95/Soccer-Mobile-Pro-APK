package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzexd implements zzimi {
    public static zzexd zza() {
        return zzexc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbhv zzbhvVar = zzbie.zznh;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).split(","));
        }
        zzimq.zzb(arrayList);
        return arrayList;
    }
}
