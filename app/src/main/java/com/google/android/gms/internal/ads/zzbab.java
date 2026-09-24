package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbab implements Runnable {
    final /* synthetic */ zzbac zza;

    zzbab(zzbac zzbacVar) {
        Objects.requireNonNull(zzbacVar);
        this.zza = zzbacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzbac zzbacVar = this.zza;
        if (zzbacVar.zzb != null) {
            return;
        }
        synchronized (zzbac.zzd) {
            if (zzbacVar.zzb != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) zzbie.zzdu.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzbac.zza = zzfym.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z);
            zzbac.zzd.open();
        }
    }
}
