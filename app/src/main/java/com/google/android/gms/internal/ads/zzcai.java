package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzcai extends IInterface {
    @Deprecated
    void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException;

    void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcar zzcarVar) throws RemoteException;
}
