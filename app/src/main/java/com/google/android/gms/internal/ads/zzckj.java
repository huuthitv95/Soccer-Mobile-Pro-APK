package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzckj implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcdb zza;
    final /* synthetic */ zzckt zzb;

    zzckj(zzckt zzcktVar, zzcdb zzcdbVar) {
        this.zza = zzcdbVar;
        Objects.requireNonNull(zzcktVar);
        this.zzb = zzcktVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
