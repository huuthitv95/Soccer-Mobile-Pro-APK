package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfmx {
    private final zzfmb zza;
    private final zzfmu zzb;
    private final zzflx zzc;
    private zzfnd zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfmx(zzfmb zzfmbVar, zzflx zzflxVar, zzfmu zzfmuVar) {
        this.zza = zzfmbVar;
        this.zzc = zzflxVar;
        this.zzb = zzfmuVar;
        zzflxVar.zza(new zzflw() { // from class: com.google.android.gms.internal.ads.zzfmw
            @Override // com.google.android.gms.internal.ads.zzflw
            public final /* synthetic */ void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd() {
        zzfmv zzfmvVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhk)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (!arrayDeque.isEmpty()) {
                    zzfmvVar = (zzfmv) arrayDeque.pollFirst();
                    if (zzfmvVar == null || (zzfmvVar.zzb() != null && this.zza.zzc(zzfmvVar.zzb()))) {
                        break;
                    }
                }
            }
            zzfnd zzfndVar = new zzfnd(this.zza, this.zzb, zzfmvVar);
            this.zze = zzfndVar;
            zzfndVar.zza(new zzfms(this, zzfmvVar));
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzfmv zzfmvVar) {
        this.zzd.add(zzfmvVar);
    }

    public final synchronized ListenableFuture zzb(zzfmv zzfmvVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfmvVar);
    }

    final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(zzfnd zzfndVar) {
        this.zze = null;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
