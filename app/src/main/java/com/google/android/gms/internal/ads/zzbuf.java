package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbuf {
    private final zzbti zza;
    private ListenableFuture zzb;

    zzbuf(zzbti zzbtiVar) {
        this.zza = zzbtiVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcfk zzcfkVar = new zzcfk();
            this.zzb = zzcfkVar;
            this.zza.zzb(null).zze(new zzcfo() { // from class: com.google.android.gms.internal.ads.zzbue
                @Override // com.google.android.gms.internal.ads.zzcfo
                public final /* synthetic */ void zza(Object obj) {
                    zzcfkVar.zzc((zzbtj) obj);
                }
            }, new zzcfm() { // from class: com.google.android.gms.internal.ads.zzbub
                @Override // com.google.android.gms.internal.ads.zzcfm
                public final /* synthetic */ void zza() {
                    zzcfkVar.zzd(new zzbtl("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbui zza(String str, zzbtp zzbtpVar, zzbto zzbtoVar) {
        zzd();
        return new zzbui(this.zzb, "google.afma.activeView.handleUpdate", zzbtpVar, zzbtoVar);
    }

    public final void zzb(final String str, final zzbpe zzbpeVar) {
        zzd();
        this.zzb = zzhbi.zzj(this.zzb, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzbuc
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzbtj zzbtjVar = (zzbtj) obj;
                zzbtjVar.zzm(str, zzbpeVar);
                return zzhbi.zza(zzbtjVar);
            }
        }, zzcff.zzh);
    }

    public final void zzc(final String str, final zzbpe zzbpeVar) {
        this.zzb = zzhbi.zzk(this.zzb, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzbud
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzbtj zzbtjVar = (zzbtj) obj;
                zzbtjVar.zzn(str, zzbpeVar);
                return zzbtjVar;
            }
        }, zzcff.zzh);
    }
}
