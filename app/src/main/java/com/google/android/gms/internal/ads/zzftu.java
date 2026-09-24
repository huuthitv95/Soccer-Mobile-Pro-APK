package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzftu {
    public static zzftu zze(zzftv zzftvVar, zzftw zzftwVar) {
        zzfvs.zza();
        return new zzfty(zzftvVar, zzftwVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfub zzfubVar, String str);
}
