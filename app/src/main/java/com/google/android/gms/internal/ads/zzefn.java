package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzefn implements zzhbf {
    final /* synthetic */ Context zza;

    zzefn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th) {
        if (((Boolean) zzbjw.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbhp.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbjw.zzj.zze()).booleanValue()) {
            zzbhp.zze(this.zza);
        }
    }
}
