package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwe implements zzdda {
    private final zzcki zza;

    zzdwe(zzcki zzckiVar) {
        this.zza = zzckiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zza(Context context) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzb(Context context) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzc(Context context) {
        zzcki zzckiVar = this.zza;
        if (zzckiVar != null) {
            zzckiVar.destroy();
        }
    }
}
