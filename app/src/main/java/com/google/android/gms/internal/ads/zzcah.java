package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcah extends zzbdt implements zzcai {
    public zzcah() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbdu.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbdu.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzbdu.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbdu.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzcar zzcarVar = (zzcar) zzbdu.zzb(parcel, zzcar.CREATOR);
            zzbdu.zzh(parcel);
            zzg(parcelFileDescriptor2, zzcarVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
