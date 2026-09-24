package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbbj implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbbl zzb;

    zzbbj(zzbbl zzbblVar, int i, boolean z) {
        this.zza = i;
        Objects.requireNonNull(zzbblVar);
        this.zzb = zzbblVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayf zzayfVarZza;
        int i = this.zza;
        zzbbl zzbblVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbblVar.zza;
            zzayfVarZza = zzfwx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzayfVarZza = null;
        }
        zzbbl zzbblVar2 = this.zzb;
        zzbblVar2.zzs(zzayfVarZza);
        int i2 = this.zza;
        if (i2 < 4) {
            if (zzayfVarZza != null && zzayfVarZza.zza() && !zzayfVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzayfVarZza.zzg() && zzayfVarZza.zzh().zza() && zzayfVarZza.zzh().zzb() != -2) {
                return;
            }
            zzbblVar2.zzp(i2 + 1, true);
        }
    }
}
