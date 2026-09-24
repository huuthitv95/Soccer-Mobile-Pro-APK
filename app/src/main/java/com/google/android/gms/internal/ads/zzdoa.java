package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdoa implements zzbpe {
    private final WeakReference zza;
    private final zzfro zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final zzfps zzd;

    /* synthetic */ zzdoa(zzdob zzdobVar, zzfro zzfroVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfps zzfpsVar, byte[] bArr) {
        this.zza = new WeakReference(zzdobVar);
        this.zzb = zzfroVar;
        this.zzc = zzvVar;
        this.zzd = zzfpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final void zza(Object obj, Map map) {
        zzdob zzdobVar = (zzdob) this.zza.get();
        String str = (String) map.get("u");
        if (zzdobVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdobVar.zzF());
    }
}
