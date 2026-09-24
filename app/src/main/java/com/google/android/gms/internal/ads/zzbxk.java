package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbxk implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbxl zza;

    zzbxk(zzbxl zzbxlVar) {
        Objects.requireNonNull(zzbxlVar);
        this.zza = zzbxlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
