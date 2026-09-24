package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzem {
    final /* synthetic */ zzeq zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzem(zzeq zzeqVar, zzek zzekVar, Executor executor) {
        Objects.requireNonNull(zzeqVar);
        this.zza = zzeqVar;
        this.zzb = new WeakReference(zzekVar);
        this.zzc = executor;
    }

    public final boolean zza() {
        return this.zzb.get() == null;
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzel
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzek zzekVar = (zzek) this.zzb.get();
        if (zzekVar != null) {
            zzekVar.zza(this.zza.zzc());
        }
    }
}
