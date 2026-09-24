package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbxm implements View.OnClickListener {
    final /* synthetic */ zzbxo zza;

    zzbxm(zzbxo zzbxoVar) {
        Objects.requireNonNull(zzbxoVar);
        this.zza = zzbxoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
