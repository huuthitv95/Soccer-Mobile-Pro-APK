package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcbv extends zzbdt implements zzcbw {
    public zzcbv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcbw zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzcbw ? (zzcbw) iInterfaceQueryLocalInterface : new zzcbu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzccd zzccbVar = null;
        zzccd zzccbVar2 = null;
        zzcce zzcceVar = null;
        zzcbz zzcbxVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccbVar = iInterfaceQueryLocalInterface instanceof zzccd ? (zzccd) iInterfaceQueryLocalInterface : new zzccb(strongBinder);
                }
                zzbdu.zzh(parcel);
                zzc(zzmVar, zzccbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcbxVar = iInterfaceQueryLocalInterface2 instanceof zzcbz ? (zzcbz) iInterfaceQueryLocalInterface2 : new zzcbx(strongBinder2);
                }
                zzbdu.zzh(parcel);
                zze(zzcbxVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                int i3 = zzbdu.zza;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzb(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcceVar = iInterfaceQueryLocalInterface3 instanceof zzcce ? (zzcce) iInterfaceQueryLocalInterface3 : new zzcce(strongBinder3);
                }
                zzbdu.zzh(parcel);
                zzs(zzcceVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcck zzcckVar = (zzcck) zzbdu.zzb(parcel, zzcck.CREATOR);
                zzbdu.zzh(parcel);
                zzh(zzcckVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzf(zzdnVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzbdu.zzd(parcel2, bundleZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZza = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzk(iObjectWrapperAsInterface2, zZza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzcbt zzcbtVarZzl = zzl();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzcbtVarZzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdx zzdxVarZzm = zzm();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzdxVarZzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzo(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbdu.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccbVar2 = iInterfaceQueryLocalInterface4 instanceof zzccd ? (zzccd) iInterfaceQueryLocalInterface4 : new zzccb(strongBinder4);
                }
                zzbdu.zzh(parcel);
                zzd(zzmVar2, zzccbVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZza2 = zzbdu.zza(parcel);
                zzbdu.zzh(parcel);
                zzp(zZza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j = parcel.readLong();
                zzbdu.zzh(parcel);
                zzr(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
