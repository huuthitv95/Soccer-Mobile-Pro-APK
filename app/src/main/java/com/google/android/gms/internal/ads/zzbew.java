package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbew implements Runnable {
    final /* synthetic */ zzbex zza;

    zzbew(zzbex zzbexVar) {
        Objects.requireNonNull(zzbexVar);
        this.zza = zzbexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbex zzbexVar = this.zza;
        synchronized (zzbexVar.zzf()) {
            if (zzbexVar.zzg().get() && zzbexVar.zzh()) {
                zzbexVar.zzg().set(false);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbexVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbey) it.next()).zza(false);
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                    }
                }
            } else {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
