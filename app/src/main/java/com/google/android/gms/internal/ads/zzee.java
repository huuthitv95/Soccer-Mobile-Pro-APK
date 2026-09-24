package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzee {
    private final Thread zza;
    private final zzdy zzb;
    private final zzea zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzee(Looper looper, zzdo zzdoVar, zzea zzeaVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), zzdoVar, zzeaVar, true);
    }

    private final void zzi() {
        if (this.zzi) {
            zzgsw.zzi(zzb());
        }
    }

    public final zzee zza(Looper looper, zzdo zzdoVar, zzea zzeaVar) {
        return new zzee(this.zzd, looper, looper.getThread(), zzdoVar, zzeaVar, this.zzi);
    }

    public final boolean zzb() {
        return Thread.currentThread() == this.zza;
    }

    public final void zzd(Object obj) {
        zzi();
        CopyOnWriteArraySet<zzeb> copyOnWriteArraySet = this.zzd;
        for (zzeb zzebVar : copyOnWriteArraySet) {
            if (zzebVar.zza.equals(obj)) {
                zzebVar.zzc(this.zzc);
                copyOnWriteArraySet.remove(zzebVar);
            }
        }
    }

    public final void zze(final int i, final zzdz zzdzVar) {
        zzi();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzec
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    zzdz zzdzVar2 = zzdzVar;
                    ((zzeb) it.next()).zza(i, zzdzVar2);
                }
            }
        });
    }

    public final void zzf() {
        zzi();
        ArrayDeque arrayDeque = this.zzf;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.zzc != null) {
            zzdy zzdyVar = this.zzb;
            zzdyVar.getClass();
            if (!zzdyVar.zzb(1)) {
                zzdyVar.zzg(zzdyVar.zzc(1));
            }
        }
        ArrayDeque arrayDeque2 = this.zze;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void zzg() {
        zzi();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.zzd;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((zzeb) it.next()).zzc(this.zzc);
        }
        copyOnWriteArraySet.clear();
    }

    final /* synthetic */ boolean zzh(Message message) {
        zzea zzeaVar = this.zzc;
        zzeaVar.getClass();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzeb) it.next()).zzb(zzeaVar);
            zzdy zzdyVar = this.zzb;
            zzdyVar.getClass();
            if (zzdyVar.zzb(1)) {
                break;
            }
        }
        return true;
    }

    public zzee(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    private zzee(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, zzdo zzdoVar, zzea zzeaVar, boolean z) {
        this.zza = thread;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzeaVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = (looper == null || zzdoVar == null || zzeaVar == null) ? null : zzdoVar.zzd(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzed
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                this.zza.zzh(message);
                return true;
            }
        });
        this.zzi = z;
    }

    public final void zzc(Object obj) {
        obj.getClass();
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzeb(obj));
        }
    }
}
