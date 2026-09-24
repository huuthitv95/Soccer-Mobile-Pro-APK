package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfxx extends zzbds implements IInterface {
    zzfxx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfxv zze(zzfxt zzfxtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzfxtVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzfxv zzfxvVar = (zzfxv) zzbdu.zzb(parcelZzcZ, zzfxv.CREATOR);
        parcelZzcZ.recycle();
        return zzfxvVar;
    }

    public final void zzf(zzfxq zzfxqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzfxqVar);
        zzda(2, parcelZza);
    }

    public final zzfye zzg(zzfyc zzfycVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzfycVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzfye zzfyeVar = (zzfye) zzbdu.zzb(parcelZzcZ, zzfye.CREATOR);
        parcelZzcZ.recycle();
        return zzfyeVar;
    }
}
