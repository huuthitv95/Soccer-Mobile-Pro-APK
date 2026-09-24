package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcdy extends zzbds implements zzcea {
    zzcdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zze(IObjectWrapper iObjectWrapper, zzcee zzceeVar, zzcdx zzcdxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zzc(parcelZza, zzceeVar);
        zzbdu.zze(parcelZza, zzcdxVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzi(zzbzh zzbzhVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzbdu.zze(parcelZza, iObjectWrapper3);
        Parcel parcelZzcZ = zzcZ(11, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }
}
