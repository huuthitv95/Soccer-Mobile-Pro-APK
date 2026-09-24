package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcag extends zzbds implements zzcai {
    zzcag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzbaVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcar zzcarVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, parcelFileDescriptor);
        zzbdu.zzc(parcelZza, zzcarVar);
        zzda(3, parcelZza);
    }
}
