package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeqb implements zzeli {
    private final zzerf zza;
    private final zzdwq zzb;

    zzeqb(zzerf zzerfVar, zzdwq zzdwqVar) {
        this.zza = zzerfVar;
        this.zzb = zzdwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final zzelj zza(String str, JSONObject jSONObject) throws zzfkt {
        zzbwp zzbwpVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcp)).booleanValue()) {
            try {
                zzbwpVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbwpVarZzb = null;
            }
        } else {
            zzbwpVarZzb = this.zza.zzb(str);
        }
        if (zzbwpVarZzb == null) {
            return null;
        }
        return new zzelj(zzbwpVarZzb, new zzemv(), str);
    }
}
