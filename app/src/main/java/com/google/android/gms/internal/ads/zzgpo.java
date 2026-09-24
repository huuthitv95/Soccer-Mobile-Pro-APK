package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpo implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgpq zza;

    zzgpo(zzgpq zzgpqVar) {
        Objects.requireNonNull(zzgpqVar);
        this.zza = zzgpqVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzgpq zzgpqVar = this.zza;
        synchronized (zzgpqVar) {
            try {
                if (z) {
                    zzgpqVar.zzg(System.currentTimeMillis());
                    zzgpqVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgpqVar.zzh() > 0 && jCurrentTimeMillis >= zzgpqVar.zzh()) {
                        zzgpqVar.zzi(jCurrentTimeMillis - zzgpqVar.zzh());
                    }
                    zzgpqVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
