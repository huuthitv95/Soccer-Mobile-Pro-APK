package com.google.android.gms.internal.ads;

import com.ironsource.C12148d8;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcgl implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcgp zzb;

    zzcgl(zzcgp zzcgpVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzcgpVar);
        this.zzb = zzcgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{C12148d8.f30227k, String.valueOf(this.zza)});
    }
}
