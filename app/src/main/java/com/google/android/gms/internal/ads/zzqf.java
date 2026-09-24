package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzqf extends BroadcastReceiver {
    final /* synthetic */ zzqh zza;

    /* synthetic */ zzqf(zzqh zzqhVar, byte[] bArr) {
        Objects.requireNonNull(zzqhVar);
        this.zza = zzqhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzqh zzqhVar = this.zza;
        zzqhVar.zzh(zzqb.zzb(context, intent, zzqhVar.zzl(), zzqhVar.zzj(), zzqhVar.zzg()));
    }
}
