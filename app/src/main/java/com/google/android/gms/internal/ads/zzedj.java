package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedj {
    private final Context zza;
    private zzarq zzb;

    zzedj(Context context) {
        this.zza = context;
    }

    public final void zza() {
        this.zzb = zzarp.zza(this.zza);
    }

    public final void zzb(zzart zzartVar) {
        this.zzb.zzb(zzartVar);
    }

    public final void zzc() {
        this.zzb.zzc();
    }

    public final zzaru zzd() {
        try {
            zzarq zzarqVar = this.zzb;
            if (zzarqVar == null || !zzarqVar.zza()) {
                return null;
            }
            return zzarqVar.zzd();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
