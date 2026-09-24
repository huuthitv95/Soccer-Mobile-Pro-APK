package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfnd {
    private final zzfmv zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfnd(final zzfmb zzfmbVar, final zzfmu zzfmuVar, final zzfmv zzfmvVar) {
        this.zza = zzfmvVar;
        this.zzb = zzhbi.zzh(zzhbi.zzj(zzfmuVar.zza(zzfmvVar), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfnc
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfmuVar, zzfmbVar, zzfmvVar, (zzfmk) obj);
            }
        }, zzfmvVar.zza()), Exception.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfna
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzfmuVar, (Exception) obj);
            }
        }, zzfmvVar.zza());
    }

    public final synchronized void zza(zzhbf zzhbfVar) {
        zzfmv zzfmvVar = this.zza;
        zzhbi.zzr(zzhbi.zzj(this.zzb, zzfnb.zza, zzfmvVar.zza()), zzhbfVar, zzfmvVar.zza());
    }

    public final synchronized ListenableFuture zzb(zzfmv zzfmvVar) {
        if (!this.zzd && !this.zzc) {
            zzfmv zzfmvVar2 = this.zza;
            if (zzfmvVar2.zzb() != null && zzfmvVar.zzb() != null && zzfmvVar2.zzb().equals(zzfmvVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    final /* synthetic */ ListenableFuture zzc(zzfmu zzfmuVar, zzfmb zzfmbVar, zzfmv zzfmvVar, zzfmk zzfmkVar) {
        synchronized (this) {
            this.zzd = true;
            zzfmuVar.zzb(zzfmkVar);
            if (this.zzc) {
                return zzhbi.zza(new zzfmt(zzfmkVar, zzfmvVar));
            }
            zzfmbVar.zzb(zzfmvVar.zzb(), zzfmkVar);
            return zzhbi.zza(null);
        }
    }

    final /* synthetic */ ListenableFuture zzd(zzfmu zzfmuVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
