package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzepg extends zzbwl {
    private final zzelj zza;

    /* synthetic */ zzepg(zzeph zzephVar, zzelj zzeljVar, byte[] bArr) {
        Objects.requireNonNull(zzephVar);
        this.zza = zzeljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze() throws RemoteException {
        ((zzemv) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(String str) throws RemoteException {
        ((zzemv) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzemv) this.zza.zzc).zzx(zzeVar);
    }
}
