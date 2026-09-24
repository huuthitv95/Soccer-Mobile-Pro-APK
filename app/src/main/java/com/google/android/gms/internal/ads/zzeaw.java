package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzeaw extends zzcby {
    final /* synthetic */ zzeax zza;

    zzeaw(zzeax zzeaxVar) {
        Objects.requireNonNull(zzeaxVar);
        this.zza = zzeaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zze() throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzm(zzeaxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzf() throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzo(zzeaxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzg(zzcbt zzcbtVar) throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzp(zzeaxVar.zzd(), zzcbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzh(int i) throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzn(zzeaxVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzn(zzeaxVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzj() throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzq(zzeaxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzk() throws RemoteException {
        zzeax zzeaxVar = this.zza;
        zzeaxVar.zze().zzr(zzeaxVar.zzd());
    }
}
