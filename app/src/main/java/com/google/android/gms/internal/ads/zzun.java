package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzun extends Handler {
    final /* synthetic */ zzup zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzun(zzup zzupVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zzupVar);
        this.zza = zzupVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
