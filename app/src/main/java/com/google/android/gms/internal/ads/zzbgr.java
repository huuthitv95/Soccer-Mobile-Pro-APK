package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbgr extends zzbds implements IInterface {
    zzbgr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbgm zze(zzbgp zzbgpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzbgpVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzbgm zzbgmVar = (zzbgm) zzbdu.zzb(parcelZzcZ, zzbgm.CREATOR);
        parcelZzcZ.recycle();
        return zzbgmVar;
    }

    public final zzbgm zzf(zzbgp zzbgpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzbgpVar);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        zzbgm zzbgmVar = (zzbgm) zzbdu.zzb(parcelZzcZ, zzbgm.CREATOR);
        parcelZzcZ.recycle();
        return zzbgmVar;
    }

    public final long zzg(zzbgp zzbgpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzbgpVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }
}
