package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbwn extends zzbds implements zzbwp {
    zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbws zzbwsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbdu.zzc(parcelZza, bundle);
        zzbdu.zzc(parcelZza, bundle2);
        zzbdu.zzc(parcelZza, zzrVar);
        zzbdu.zze(parcelZza, zzbwsVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbxe zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbxe zzbxeVar = (zzbxe) zzbdu.zzb(parcelZzcZ, zzbxe.CREATOR);
        parcelZzcZ.recycle();
        return zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbxe zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        zzbxe zzbxeVar = (zzbxe) zzbdu.zzb(parcelZzcZ, zzbxe.CREATOR);
        parcelZzcZ.recycle();
        return zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwd zzbwdVar, zzbuw zzbuwVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbwdVar);
        zzbdu.zze(parcelZza, zzbuwVar);
        zzbdu.zzc(parcelZza, zzrVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwg zzbwgVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbwgVar);
        zzbdu.zze(parcelZza, zzbuwVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        boolean zZza = zzbdu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwm zzbwmVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbwmVar);
        zzbdu.zze(parcelZza, zzbuwVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZza = zzbdu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwj zzbwjVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbwjVar);
        zzbdu.zze(parcelZza, zzbuwVar);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzo(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwm zzbwmVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbwmVar);
        zzbdu.zze(parcelZza, zzbuwVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwd zzbwdVar, zzbuw zzbuwVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbwdVar);
        zzbdu.zze(parcelZza, zzbuwVar);
        zzbdu.zzc(parcelZza, zzrVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwj zzbwjVar, zzbuw zzbuwVar, zzblh zzblhVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbwjVar);
        zzbdu.zze(parcelZza, zzbuwVar);
        zzbdu.zzc(parcelZza, zzblhVar);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwa zzbwaVar, zzbuw zzbuwVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbdu.zzc(parcelZza, zzmVar);
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbwaVar);
        zzbdu.zze(parcelZza, zzbuwVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(24, parcelZza);
        boolean zZza = zzbdu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
