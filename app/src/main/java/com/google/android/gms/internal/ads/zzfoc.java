package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfoc implements zzbey {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Map zzc = new HashMap();
    private boolean zzd = false;

    zzfoc(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = scheduledExecutorService;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        Map map = this.zzc;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
            zzfob zzfobVar = (zzfob) map.get(scheduledFuture);
            if (zzfobVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                zzb(zzfobVar.zza, Math.max(0L, zzfobVar.zzb - com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbey
    public final void zza(boolean z) {
        if (z) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfoa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final synchronized void zzb(Runnable runnable, long j, TimeUnit timeUnit) {
        if (!this.zzd) {
            com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            this.zzd = true;
        }
        final zzfob zzfobVar = new zzfob(this, runnable, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + timeUnit.toMillis(j));
        zzfobVar.zzc = this.zza.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfob zzfobVar2;
                zzfob zzfobVar3 = zzfobVar;
                zzfoc zzfocVar = zzfobVar3.zzd;
                synchronized (zzfocVar) {
                    ScheduledFuture scheduledFuture = zzfobVar3.zzc;
                    zzfobVar2 = scheduledFuture != null ? (zzfob) zzfocVar.zze().remove(scheduledFuture) : null;
                }
                if (zzfobVar2 != null) {
                    zzfobVar3.zzd.zzd().execute(zzfobVar3.zza);
                }
            }
        }, j, timeUnit);
        this.zzc.put(zzfobVar.zzc, zzfobVar);
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
