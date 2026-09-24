package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzep extends BroadcastReceiver {
    final /* synthetic */ zzeq zza;

    /* synthetic */ zzep(zzeq zzeqVar, byte[] bArr) {
        Objects.requireNonNull(zzeqVar);
        this.zza = zzeqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.zza.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzd(context);
            }
        });
    }
}
