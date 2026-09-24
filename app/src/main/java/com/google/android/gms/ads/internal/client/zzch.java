package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbuq;
import com.google.android.gms.internal.ads.zzcbw;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface zzch extends IInterface {
    void zze(List list, zzcb zzcbVar) throws RemoteException;

    boolean zzf(String str) throws RemoteException;

    zzcbw zzg(String str) throws RemoteException;

    boolean zzh(String str) throws RemoteException;

    zzbfx zzi(String str) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    zzbu zzk(String str) throws RemoteException;

    void zzl(zzbuq zzbuqVar) throws RemoteException;

    boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException;

    boolean zzn(int i, String str) throws RemoteException;

    zzbu zzo(String str) throws RemoteException;

    zzbfx zzp(String str) throws RemoteException;

    zzcbw zzq(String str) throws RemoteException;

    zzfp zzr(int i, String str) throws RemoteException;

    Bundle zzs(int i) throws RemoteException;

    int zzt(int i, String str) throws RemoteException;

    boolean zzu(int i, String str) throws RemoteException;

    void zzv(int i) throws RemoteException;
}
