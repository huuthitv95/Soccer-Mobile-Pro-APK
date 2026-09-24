package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcmo extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcmp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcmo(zzcmp zzcmpVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzcmpVar);
        this.zzb = zzcmpVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}
