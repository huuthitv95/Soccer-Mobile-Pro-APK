package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhak extends zzhao {
    private static final zzhbq zza = new zzhbq(zzhak.class);
    private zzgvv zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzhak(zzgvv zzgvvVar, boolean z, boolean z2) {
        super(zzgvvVar.size());
        zzgvvVar.getClass();
        this.zzb = zzgvvVar;
        this.zzc = z;
        this.zzd = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzz(null);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i, Future future) {
        try {
            zzw(i, zzhcj.zza(future));
        } catch (ExecutionException e) {
            zzE(e.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgvv zzgvvVar) {
        int iZzC = zzC();
        int i = 0;
        zzgsw.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgvvVar != null) {
                zzgyn it = zzgvvVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    void zzA(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    protected final void zzc() {
        zzgvv zzgvvVar = this.zzb;
        zzA(1);
        if ((zzgvvVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgyn it = zzgvvVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    protected final String zzd() {
        zzgvv zzgvvVar = this.zzb;
        return zzgvvVar != null ? "futures=".concat(zzgvvVar.toString()) : super.zzd();
    }

    final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgyn it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    zzy(i, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhaj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i, listenableFuture);
                        }
                    }, zzhax.INSTANCE);
                }
                i = i2;
            }
            return;
        }
        zzgvv zzgvvVar = this.zzb;
        final zzgvv zzgvvVar2 = true != this.zzd ? null : zzgvvVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzhai
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgvvVar2);
            }
        };
        zzgyn it2 = zzgvvVar.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                zzz(zzgvvVar2);
            } else {
                listenableFuture2.addListener(runnable, zzhax.INSTANCE);
            }
        }
    }

    abstract void zzw(int i, Object obj);

    abstract void zzx();

    @Override // com.google.android.gms.internal.ads.zzhao
    final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        zzI(set, (Throwable) Objects.requireNonNull(zzl()));
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }
}
