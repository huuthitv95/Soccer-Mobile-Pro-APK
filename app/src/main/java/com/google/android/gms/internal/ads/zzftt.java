package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzftt {
    private boolean zza;

    final boolean zza() {
        return this.zza;
    }

    final void zzb(Context context) {
        zzfvs.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfva.zza().zzb(context);
        zzfur.zza().zzd(context);
        zzfvn.zza(context);
        zzfvo.zza(context);
        zzfvr.zza(context);
        zzfux.zza().zzc(context);
        zzfuq.zza().zzc(context);
        zzfvc.zza().zzb(context);
    }
}
