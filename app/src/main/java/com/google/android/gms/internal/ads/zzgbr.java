package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbr {
    private static zzgbr zzb;
    final zzgbs zza;

    private zzgbr(Context context) {
        this.zza = zzgbs.zza(context);
    }

    public static final zzgbr zza(Context context) {
        zzgbr zzgbrVar;
        synchronized (zzgbr.class) {
            if (zzb == null) {
                zzb = new zzgbr(context);
            }
            zzgbrVar = zzb;
        }
        return zzgbrVar;
    }

    public final void zzb(boolean z) throws IOException {
        synchronized (zzgbr.class) {
            zzgbs zzgbsVar = this.zza;
            zzgbsVar.zzb("paidv2_publisher_option", Boolean.valueOf(z));
            if (!z) {
                zzgbsVar.zzf("paidv2_creation_time");
                zzgbsVar.zzf("paidv2_id");
                zzgbsVar.zzf("vendor_scoped_gpid_v2_id");
                zzgbsVar.zzf("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzgbr.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z) throws IOException {
        synchronized (zzgbr.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzgbr.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }
}
