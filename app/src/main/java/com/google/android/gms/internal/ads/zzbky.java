package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbky {
    private final Context zza;

    public zzbky(Context context) {
        this.zza = context;
    }

    public final void zza(zzbzs zzbzsVar) {
        try {
            ((zzbkz) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbkx.zza)).zze(zzbzsVar);
        } catch (RemoteException e) {
            String message = e.getMessage();
            String.valueOf(message);
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(message)));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            String message2 = e2.getMessage();
            String.valueOf(message2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(message2)));
        }
    }
}
