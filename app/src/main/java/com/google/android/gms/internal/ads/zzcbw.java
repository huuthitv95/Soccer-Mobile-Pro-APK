package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzcbw extends IInterface {
    void zzb(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar) throws RemoteException;

    void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar) throws RemoteException;

    void zze(zzcbz zzcbzVar) throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException;

    Bundle zzg() throws RemoteException;

    void zzh(zzcck zzcckVar) throws RemoteException;

    boolean zzi() throws RemoteException;

    String zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    zzcbt zzl() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdx zzm() throws RemoteException;

    String zzn() throws RemoteException;

    void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    void zzp(boolean z) throws RemoteException;

    long zzq() throws RemoteException;

    void zzr(long j) throws RemoteException;

    void zzs(zzcce zzcceVar) throws RemoteException;
}
