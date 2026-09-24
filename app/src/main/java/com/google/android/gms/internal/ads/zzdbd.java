package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdbd implements zzddt, zzdda {
    private final zzfjt zza;

    public zzdbd(Context context, zzfjt zzfjtVar, zzbyu zzbyuVar) {
        this.zza = zzfjtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzc(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        zzbyv zzbyvVar = this.zza.zzad;
        if (zzbyvVar == null || !zzbyvVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbyvVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}
