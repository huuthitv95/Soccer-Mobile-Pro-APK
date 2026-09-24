package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfr {
    private boolean zza;

    public zzfr(Context context, Looper looper, zzdo zzdoVar) {
        context.getApplicationContext();
        zzdoVar.zzd(looper, null);
        zzdoVar.zzd(Looper.getMainLooper(), null);
    }

    public final void zza(boolean z) {
        if (this.zza == z) {
            return;
        }
        this.zza = z;
    }
}
