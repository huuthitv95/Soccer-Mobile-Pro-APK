package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzepy extends zzcbn {
    final /* synthetic */ zzdeq zza;
    final /* synthetic */ zzdcd zzb;
    final /* synthetic */ zzddm zzc;
    final /* synthetic */ zzdkv zzd;

    zzepy(zzepz zzepzVar, zzdeq zzdeqVar, zzdcd zzdcdVar, zzddm zzddmVar, zzdkv zzdkvVar) {
        this.zza = zzdeqVar;
        this.zzb = zzdcdVar;
        this.zzc = zzddmVar;
        this.zzd = zzdkvVar;
        Objects.requireNonNull(zzepzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzf(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzg(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.zzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdU(4);
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzk(IObjectWrapper iObjectWrapper, zzcbp zzcbpVar) {
        this.zzd.zzb(zzcbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzm(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzb(null);
    }
}
