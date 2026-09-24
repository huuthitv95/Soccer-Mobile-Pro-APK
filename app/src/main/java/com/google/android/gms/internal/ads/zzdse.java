package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdse implements zzhbf {
    final /* synthetic */ zzcfk zza;

    zzdse(zzdsq zzdsqVar, zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
        Objects.requireNonNull(zzdsqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcki zzckiVar = (zzcki) obj;
        if (zzckiVar == null) {
            this.zza.zzd(new zzeov(1, "Missing webview from video view future."));
            return;
        }
        final zzcfk zzcfkVar = this.zza;
        zzckiVar.zzab("/video", new zzcia(new zzchz() { // from class: com.google.android.gms.internal.ads.zzdsd
            @Override // com.google.android.gms.internal.ads.zzchz
            public final /* synthetic */ void zza(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", str);
                zzcfkVar.zzc(bundle);
            }
        }));
        zzckiVar.zzI();
    }
}
