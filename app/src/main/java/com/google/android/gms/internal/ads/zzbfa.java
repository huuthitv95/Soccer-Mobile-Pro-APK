package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbfa implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbfe zzb;

    zzbfa(zzbfe zzbfeVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbfeVar);
        this.zzb = zzbfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
