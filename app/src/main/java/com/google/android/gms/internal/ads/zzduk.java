package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzduk implements zzbpe {
    final /* synthetic */ zzdul zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbpe zzd;

    /* synthetic */ zzduk(zzdul zzdulVar, WeakReference weakReference, String str, zzbpe zzbpeVar, byte[] bArr) {
        Objects.requireNonNull(zzdulVar);
        this.zza = zzdulVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
