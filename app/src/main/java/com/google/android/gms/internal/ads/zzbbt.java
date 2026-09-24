package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbbt implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbbu zza;

    zzbbt(zzbbu zzbbuVar) {
        Objects.requireNonNull(zzbbuVar);
        this.zza = zzbbuVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            zzbbu zzbbuVar = this.zza;
            zzbbuVar.zze(System.currentTimeMillis());
            zzbbuVar.zzh(true);
            return;
        }
        zzbbu zzbbuVar2 = this.zza;
        long jZzf = zzbbuVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbbuVar2.zzf()) {
            zzbbuVar2.zzg(jCurrentTimeMillis - zzbbuVar2.zzf());
        }
        zzbbuVar2.zzh(false);
    }
}
