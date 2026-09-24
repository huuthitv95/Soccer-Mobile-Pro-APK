package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcbu extends zzbds implements zzcbw {
    zzcbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, zzccdVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, zzccdVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zze(zzcbz zzcbzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, zzcbzVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, zzdnVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final Bundle zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzbdu.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzh(zzcck zzcckVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzcckVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzcbt zzl() throws RemoteException {
        zzcbt zzcbrVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcbrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcbrVar = iInterfaceQueryLocalInterface instanceof zzcbt ? (zzcbt) iInterfaceQueryLocalInterface : new zzcbr(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final com.google.android.gms.ads.internal.client.zzdx zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzb = com.google.android.gms.ads.internal.client.zzdw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, zzdqVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzbdu.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzr(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzs(zzcce zzcceVar) throws RemoteException {
        throw null;
    }
}
