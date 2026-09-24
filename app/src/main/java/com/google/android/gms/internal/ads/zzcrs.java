package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcrs implements zzcri {
    private final zzecf zza;

    zzcrs(zzecf zzecfVar) {
        this.zza = zzecfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcri
    public final void zza(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkC)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
