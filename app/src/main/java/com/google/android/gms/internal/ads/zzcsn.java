package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcsn implements zzdda {
    private final zzflk zza;

    public zzcsn(zzflk zzflkVar) {
        this.zza = zzflkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfkt e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzb(Context context) {
        try {
            zzflk zzflkVar = this.zza;
            zzflkVar.zzj();
            if (context != null) {
                zzflkVar.zzp(context);
            }
        } catch (zzfkt e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfkt e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
