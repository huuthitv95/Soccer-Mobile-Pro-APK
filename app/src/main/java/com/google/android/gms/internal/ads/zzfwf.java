package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwf {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfwe zzd = null;

    public zzfwf() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfwe zzfweVar = (zzfwe) this.zzc.poll();
        this.zzd = zzfweVar;
        if (zzfweVar != null) {
            zzfweVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfwe zzfweVar) {
        zzfweVar.zzb(this);
        this.zzc.add(zzfweVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzfwe zzfweVar) {
        this.zzd = null;
        zzc();
    }
}
