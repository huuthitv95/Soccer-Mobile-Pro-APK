package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcdz extends zzbdt implements zzcea {
    public zzcdz() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcea zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzcea ? (zzcea) iInterfaceQueryLocalInterface : new zzcdy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcdx zzcdvVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcee zzceeVar = (zzcee) zzbdu.zzb(parcel, zzcee.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcdvVar = iInterfaceQueryLocalInterface instanceof zzcdx ? (zzcdx) iInterfaceQueryLocalInterface : new zzcdv(strongBinder);
                }
                zzbdu.zzh(parcel);
                zze(iObjectWrapperAsInterface, zzceeVar, zzcdvVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzf(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbze zzbzeVarZzb = zzbzd.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzg(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbzeVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbze zzbzeVarZzb2 = zzbzd.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzh(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbzeVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbzh zzbzhVar = (zzbzh) zzbdu.zzb(parcel, zzbzh.CREATOR);
                zzbdu.zzh(parcel);
                zzi(zzbzhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzj(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbze zzbzeVarZzb3 = zzbzd.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzk(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbzeVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbze zzbzeVarZzb4 = zzbzd.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzl(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbzeVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                IObjectWrapper iObjectWrapperZzm = zzm(iObjectWrapperAsInterface8, iObjectWrapperAsInterface9, string, iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, iObjectWrapperZzm);
                return true;
            default:
                return false;
        }
    }
}
