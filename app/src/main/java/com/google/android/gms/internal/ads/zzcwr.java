package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwr implements zzbee {
    private final zzcki zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    zzcwr(zzcki zzckiVar, Executor executor) {
        this.zza = zzckiVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final synchronized void zzdj(zzbed zzbedVar) {
        final zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoa)).booleanValue()) {
                if (zzbedVar.zzj) {
                    if (!Boolean.TRUE.equals(this.zzc.getAndSet(true))) {
                        Executor executor = this.zzb;
                        Objects.requireNonNull(zzckiVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzckiVar.onResume();
                            }
                        });
                    }
                } else {
                    if (!Boolean.FALSE.equals(this.zzc.getAndSet(false))) {
                        Executor executor2 = this.zzb;
                        Objects.requireNonNull(zzckiVar);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwp
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzckiVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
