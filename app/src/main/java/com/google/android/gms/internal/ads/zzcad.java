package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcad extends zzbdt implements zzcae {
    public zzcad() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcai zzcagVar = null;
        zzcaj zzcajVar = null;
        zzcai zzcagVar2 = null;
        zzcai zzcagVar3 = null;
        zzcai zzcagVar4 = null;
        switch (i) {
            case 1:
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof zzcaf) {
                    }
                }
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzcar zzcarVar = (zzcar) zzbdu.zzb(parcel, zzcar.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcagVar = iInterfaceQueryLocalInterface2 instanceof zzcai ? (zzcai) iInterfaceQueryLocalInterface2 : new zzcag(strongBinder2);
                }
                zzbdu.zzh(parcel);
                zze(zzcarVar, zzcagVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzcar zzcarVar2 = (zzcar) zzbdu.zzb(parcel, zzcar.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcagVar4 = iInterfaceQueryLocalInterface3 instanceof zzcai ? (zzcai) iInterfaceQueryLocalInterface3 : new zzcag(strongBinder3);
                }
                zzbdu.zzh(parcel);
                zzf(zzcarVar2, zzcagVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzcar zzcarVar3 = (zzcar) zzbdu.zzb(parcel, zzcar.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcagVar3 = iInterfaceQueryLocalInterface4 instanceof zzcai ? (zzcai) iInterfaceQueryLocalInterface4 : new zzcag(strongBinder4);
                }
                zzbdu.zzh(parcel);
                zzg(zzcarVar3, zzcagVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzcagVar2 = iInterfaceQueryLocalInterface5 instanceof zzcai ? (zzcai) iInterfaceQueryLocalInterface5 : new zzcag(strongBinder5);
                }
                zzbdu.zzh(parcel);
                zzh(string, zzcagVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzcaa zzcaaVar = (zzcaa) zzbdu.zzb(parcel, zzcaa.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzcajVar = iInterfaceQueryLocalInterface6 instanceof zzcaj ? (zzcaj) iInterfaceQueryLocalInterface6 : new zzcaj(strongBinder6);
                }
                zzbdu.zzh(parcel);
                zzj(zzcaaVar, zzcajVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                zzbdu.zzh(parcel);
                zzi(string2);
                parcel2.writeNoException();
                return true;
        }
    }
}
