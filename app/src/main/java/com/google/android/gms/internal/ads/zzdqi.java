package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdqi {
    private final zzdyz zza;

    zzdqi(zzdyz zzdyzVar) {
        this.zza = zzdyzVar;
    }

    public final void zza(View view, zzfjt zzfjtVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzor)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdyy zzdyyVarZza = this.zza.zza();
        zzdyyVarZza.zzc("action", "hcp");
        zzdyyVarZza.zzc("hcp", str);
        zzdyyVarZza.zzb(zzfjtVar);
        zzdyyVarZza.zzd();
    }
}
