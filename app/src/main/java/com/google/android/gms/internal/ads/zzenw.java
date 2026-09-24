package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzenw extends zzbwi {
    final /* synthetic */ zzenx zza;
    private final zzelj zzb;

    /* synthetic */ zzenw(zzenx zzenxVar, zzelj zzeljVar, byte[] bArr) {
        Objects.requireNonNull(zzenxVar);
        this.zza = zzenxVar;
        this.zzb = zzeljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zze(zzbvf zzbvfVar) throws RemoteException {
        this.zza.zzc(zzbvfVar);
        ((zzemv) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzf(String str) throws RemoteException {
        ((zzemv) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzemv) this.zzb.zzc).zzx(zzeVar);
    }
}
