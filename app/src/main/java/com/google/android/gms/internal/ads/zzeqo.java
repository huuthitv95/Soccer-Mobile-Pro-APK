package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeqo implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdcd zzb;
    private final zzdcx zzc;
    private final zzdko zzd;
    private final zzdkg zze;
    private final zzctu zzf;

    zzeqo(zzdcd zzdcdVar, zzdcx zzdcxVar, zzdko zzdkoVar, zzdkg zzdkgVar, zzctu zzctuVar) {
        this.zzb = zzdcdVar;
        this.zzc = zzdcxVar;
        this.zzd = zzdkoVar;
        this.zze = zzdkgVar;
        this.zzf = zzctuVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
