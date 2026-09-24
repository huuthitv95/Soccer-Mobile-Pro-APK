package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzxm {
    public final int zza;
    public final zzxc zzb;
    private final CopyOnWriteArrayList zzc;

    public zzxm() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzxm(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzxc zzxcVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxcVar;
    }

    public final zzxm zza(int i, zzxc zzxcVar) {
        return new zzxm(this.zzc, 0, zzxcVar);
    }

    public final void zzb(Handler handler, zzxn zzxnVar) {
        this.zzc.add(new zzxf(handler, zzxnVar));
    }

    public final void zzc(zzxn zzxnVar) {
        CopyOnWriteArrayList<zzxf> copyOnWriteArrayList = this.zzc;
        for (zzxf zzxfVar : copyOnWriteArrayList) {
            if (zzxfVar.zzb == zzxnVar) {
                copyOnWriteArrayList.remove(zzxfVar);
            }
        }
    }

    public final void zzd(final zzwt zzwtVar, final zzwy zzwyVar, final int i) {
        zzi(new zzds() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // com.google.android.gms.internal.ads.zzds
            public final /* synthetic */ void zza(Object obj) {
                ((zzxn) obj).zzai(0, this.zza.zzb, zzwtVar, zzwyVar, i);
            }
        });
    }

    public final void zze(final zzwt zzwtVar, final zzwy zzwyVar) {
        zzi(new zzds() { // from class: com.google.android.gms.internal.ads.zzxg
            @Override // com.google.android.gms.internal.ads.zzds
            public final /* synthetic */ void zza(Object obj) {
                ((zzxn) obj).zzaj(0, this.zza.zzb, zzwtVar, zzwyVar);
            }
        });
    }

    public final void zzf(final zzwt zzwtVar, final zzwy zzwyVar) {
        zzi(new zzds() { // from class: com.google.android.gms.internal.ads.zzxh
            @Override // com.google.android.gms.internal.ads.zzds
            public final /* synthetic */ void zza(Object obj) {
                ((zzxn) obj).zzak(0, this.zza.zzb, zzwtVar, zzwyVar);
            }
        });
    }

    public final void zzg(final zzwt zzwtVar, final zzwy zzwyVar, final IOException iOException, final boolean z) {
        zzi(new zzds() { // from class: com.google.android.gms.internal.ads.zzxi
            @Override // com.google.android.gms.internal.ads.zzds
            public final /* synthetic */ void zza(Object obj) {
                ((zzxn) obj).zzal(0, this.zza.zzb, zzwtVar, zzwyVar, iOException, z);
            }
        });
    }

    public final void zzh(final zzwy zzwyVar) {
        zzi(new zzds() { // from class: com.google.android.gms.internal.ads.zzxj
            @Override // com.google.android.gms.internal.ads.zzds
            public final /* synthetic */ void zza(Object obj) {
                ((zzxn) obj).zzam(0, this.zza.zzb, zzwyVar);
            }
        });
    }

    public final void zzi(final zzds zzdsVar) {
        for (zzxf zzxfVar : this.zzc) {
            final zzxn zzxnVar = zzxfVar.zzb;
            zzfk.zze(zzxfVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdsVar.zza(zzxnVar);
                }
            });
        }
    }
}
