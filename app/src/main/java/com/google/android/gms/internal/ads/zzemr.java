package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzemr implements zzdnc {
    final /* synthetic */ zzcfk zza;
    final /* synthetic */ zzfjt zzb;
    final /* synthetic */ zzemt zzc;

    zzemr(zzemt zzemtVar, zzcfk zzcfkVar, zzfjt zzfjtVar) {
        this.zza = zzcfkVar;
        this.zzb = zzfjtVar;
        Objects.requireNonNull(zzemtVar);
        this.zzc = zzemtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final void zza(boolean z, Context context, zzdcs zzdcsVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnc
    public final zzfjt zzb() {
        return this.zzb;
    }
}
