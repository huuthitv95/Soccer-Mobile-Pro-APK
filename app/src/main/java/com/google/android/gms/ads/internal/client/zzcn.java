package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbw;
import com.google.android.gms.internal.ads.zzcea;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcn extends zzbdt implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzbuq zzbuqVarZzf = zzbup.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbu zzbuVarZzb = zzb(iObjectWrapperAsInterface, zzrVar, string, zzbuqVarZzf, i3);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbuVarZzb);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzbuq zzbuqVarZzf2 = zzbup.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbu zzbuVarZzc = zzc(iObjectWrapperAsInterface2, zzrVar2, string2, zzbuqVarZzf2, i4);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbuVarZzc);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbuq zzbuqVarZzf3 = zzbup.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbq zzbqVarZzd = zzd(iObjectWrapperAsInterface3, string3, zzbuqVarZzf3, i5);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbqVarZzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzblw zzblwVarZze = zze(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzblwVarZze);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzbuqVarZzf4 = zzbup.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzcbg zzcbgVarZzf = zzf(iObjectWrapperAsInterface6, zzbuqVarZzf4, i6);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzcbgVarZzf);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzbyp zzbypVarZzg = zzg(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbypVarZzg);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzcy zzcyVarZzi = zzi(iObjectWrapperAsInterface8, i7);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzcyVarZzi);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbu zzbuVarZzj = zzj(iObjectWrapperAsInterface9, zzrVar3, string4, i8);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbuVarZzj);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzbmb zzbmbVarZzk = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbmbVarZzk);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbuq zzbuqVarZzf5 = zzbup.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzcbw zzcbwVarZzl = zzl(iObjectWrapperAsInterface13, string5, zzbuqVarZzf5, i9);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzcbwVarZzl);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzbuq zzbuqVarZzf6 = zzbup.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbu zzbuVarZzm = zzm(iObjectWrapperAsInterface14, zzrVar4, string6, zzbuqVarZzf6, i10);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbuVarZzm);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzbuqVarZzf7 = zzbup.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzcea zzceaVarZzn = zzn(iObjectWrapperAsInterface15, zzbuqVarZzf7, i11);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzceaVarZzn);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzbuqVarZzf8 = zzbup.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzbyi zzbyiVarZzo = zzo(iObjectWrapperAsInterface16, zzbuqVarZzf8, i12);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbyiVarZzo);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzbuqVarZzf9 = zzbup.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbqe zzbqeVarZzc = zzbqd.zzc(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzbqh zzbqhVarZzp = zzp(iObjectWrapperAsInterface17, zzbuqVarZzf9, i13, zzbqeVarZzc);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbqhVarZzp);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzbuqVarZzf10 = zzbup.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzdt zzdtVarZzq = zzq(iObjectWrapperAsInterface18, zzbuqVarZzf10, i14);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzdtVarZzq);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperAsInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbuq zzbuqVarZzf11 = zzbup.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzbdu.zzh(parcel);
                zzch zzchVarZzh = zzh(iObjectWrapperAsInterface19, zzbuqVarZzf11, i15);
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzchVarZzh);
                return true;
            default:
                return false;
        }
    }
}
