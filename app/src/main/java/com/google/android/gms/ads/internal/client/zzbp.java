package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzbmt;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnd;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbrx;
import com.google.android.gms.internal.ads.zzbry;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbp extends zzbdt implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbfVar = null;
        zzcp zzcpVar = null;
        switch (i) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                zzbdu.zze(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzbdu.zzh(parcel);
                zzf(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbmn zzbmnVarZzb = zzbmm.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzg(zzbmnVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbmq zzbmqVarZzb = zzbmp.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzh(zzbmqVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbmw zzbmwVarZzb = zzbmv.zzb(parcel.readStrongBinder());
                zzbmt zzbmtVarZzb = zzbms.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzi(string, zzbmwVarZzb, zzbmtVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzblh zzblhVar = (zzblh) zzbdu.zzb(parcel, zzblh.CREATOR);
                zzbdu.zzh(parcel);
                zzj(zzblhVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = iInterfaceQueryLocalInterface2 instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface2 : new zzcp(strongBinder2);
                }
                zzbdu.zzh(parcel);
                zzq(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbna zzbnaVarZzb = zzbmz.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzbdu.zzb(parcel, zzr.CREATOR);
                zzbdu.zzh(parcel);
                zzk(zzbnaVarZzb, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzbdu.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzbdu.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbnd zzbndVarZzb = zzbnc.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzm(zzbndVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbrp zzbrpVar = (zzbrp) zzbdu.zzb(parcel, zzbrp.CREATOR);
                zzbdu.zzh(parcel);
                zzn(zzbrpVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbry zzbryVarZzb = zzbrx.zzb(parcel.readStrongBinder());
                zzbdu.zzh(parcel);
                zzo(zzbryVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzbdu.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzbdu.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
