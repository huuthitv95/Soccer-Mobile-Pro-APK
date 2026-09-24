package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbv extends zzgbt {
    private static zzgbv zzd;

    private zzgbv(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgbv zzh(Context context) {
        zzgbv zzgbvVar;
        synchronized (zzgbv.class) {
            if (zzd == null) {
                zzd = new zzgbv(context);
            }
            zzgbvVar = zzd;
        }
        return zzgbvVar;
    }

    public final zzgbq zzi(long j, boolean z) throws IOException {
        synchronized (zzgbv.class) {
            if (this.zzc.zzc()) {
                return zza(null, null, j, z);
            }
            return new zzgbq();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgbv.class) {
            if (zzg(false)) {
                zzc(false);
            }
        }
    }
}
