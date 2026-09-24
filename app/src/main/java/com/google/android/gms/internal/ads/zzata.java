package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzata {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzash zze;
    private final zzasq zzf;
    private final zzasr[] zzg;
    private zzasj zzh;
    private final List zzi;
    private final List zzj;
    private final zzaso zzk;

    public zzata(zzash zzashVar, zzasq zzasqVar, int i) {
        zzaso zzasoVar = new zzaso(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzashVar;
        this.zzf = zzasqVar;
        this.zzg = new zzasr[4];
        this.zzk = zzasoVar;
    }

    public final void zza() {
        zzasj zzasjVar = this.zzh;
        if (zzasjVar != null) {
            zzasjVar.zza();
        }
        zzasr[] zzasrVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzasr zzasrVar = zzasrVarArr[i];
            if (zzasrVar != null) {
                zzasrVar.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzash zzashVar = this.zze;
        zzaso zzasoVar = this.zzk;
        zzasj zzasjVar2 = new zzasj(priorityBlockingQueue, priorityBlockingQueue2, zzashVar, zzasoVar);
        this.zzh = zzasjVar2;
        zzasjVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzasr zzasrVar2 = new zzasr(priorityBlockingQueue2, this.zzf, zzashVar, zzasoVar);
            zzasrVarArr[i2] = zzasrVar2;
            zzasrVar2.start();
        }
    }

    public final zzasx zzb(zzasx zzasxVar) {
        zzasxVar.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzasxVar);
        }
        zzasxVar.zzg(this.zza.incrementAndGet());
        zzasxVar.zzc("add-to-queue");
        zzd(zzasxVar, 0);
        this.zzc.add(zzasxVar);
        return zzasxVar;
    }

    final void zzc(zzasx zzasxVar) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzasxVar);
        }
        List list = this.zzi;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zzasz) it.next()).zza();
            }
        }
        zzd(zzasxVar, 5);
    }

    final void zzd(zzasx zzasxVar, int i) {
        List list = this.zzj;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zzasy) it.next()).zza();
            }
        }
    }
}
