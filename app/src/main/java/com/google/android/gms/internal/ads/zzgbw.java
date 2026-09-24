package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbw {
    private static zzgbw zzb;
    final zzgbs zza;

    private zzgbw(Context context) {
        this.zza = zzgbs.zza(context);
        zzgbr.zza(context);
    }

    public static final zzgbw zza(Context context) {
        zzgbw zzgbwVar;
        synchronized (zzgbw.class) {
            if (zzb == null) {
                zzb = new zzgbw(context);
            }
            zzgbwVar = zzb;
        }
        return zzgbwVar;
    }

    public final void zzb(zzgbq zzgbqVar) throws IOException {
        synchronized (zzgbw.class) {
            zzgbs zzgbsVar = this.zza;
            zzgbsVar.zzf("vendor_scoped_gpid_v2_id");
            zzgbsVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
