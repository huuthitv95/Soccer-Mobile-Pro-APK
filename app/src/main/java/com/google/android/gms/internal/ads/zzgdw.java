package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgdw implements zzgdu {
    private final Executor zza;
    private final Queue zzb = new PriorityQueue();

    public zzgdw(Executor executor, zzgbx zzgbxVar) {
        this.zza = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final void zza(Runnable runnable, long j) {
        if (j <= 0) {
            this.zza.execute(runnable);
            return;
        }
        zzgdy zzgdyVar = new zzgdy(runnable, System.currentTimeMillis() + j);
        Queue queue = this.zzb;
        synchronized (queue) {
            queue.add(zzgdyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final void zzb() {
        Queue queue = this.zzb;
        synchronized (queue) {
            if (queue.isEmpty()) {
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (zzgdy zzgdyVar = (zzgdy) queue.peek(); zzgdyVar != null && zzgdyVar.zzb <= jCurrentTimeMillis; zzgdyVar = (zzgdy) queue.peek()) {
                priorityQueue.add(zzgdyVar);
            }
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                try {
                    this.zza.execute(((zzgdy) it.next()).zza);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
