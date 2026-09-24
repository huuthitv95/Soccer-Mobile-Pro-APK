package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfyl {
    final /* synthetic */ zzfym zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfyl(zzfym zzfymVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfymVar);
        this.zza = zzfymVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzfym zzfymVar = this.zza;
            if (zzfymVar.zzb) {
                zzfyp zzfypVar = zzfymVar.zza;
                zzfypVar.zzg(this.zzb);
                zzfypVar.zzh(this.zzc);
                zzfypVar.zzi(this.zzd);
                zzfypVar.zzf(null);
                zzfypVar.zze();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public final zzfyl zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final zzfyl zzc(int i) {
        this.zzd = i;
        return this;
    }
}
