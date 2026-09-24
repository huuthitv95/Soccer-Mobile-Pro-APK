package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzefa implements zzhbf {
    final /* synthetic */ zzefg zza;

    zzefa(zzefg zzefgVar) {
        Objects.requireNonNull(zzefgVar);
        this.zza = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfke zzfkeVar = (zzfke) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcS)).booleanValue()) {
            this.zza.zzf().zzdQ(zzfkeVar);
        }
    }
}
