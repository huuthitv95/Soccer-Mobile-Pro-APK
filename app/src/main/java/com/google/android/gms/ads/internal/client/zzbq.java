package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbmt;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnd;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzbry;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbh zzbhVar) throws RemoteException;

    void zzg(zzbmn zzbmnVar) throws RemoteException;

    void zzh(zzbmq zzbmqVar) throws RemoteException;

    void zzi(String str, zzbmw zzbmwVar, zzbmt zzbmtVar) throws RemoteException;

    void zzj(zzblh zzblhVar) throws RemoteException;

    void zzk(zzbna zzbnaVar, zzr zzrVar) throws RemoteException;

    void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzm(zzbnd zzbndVar) throws RemoteException;

    void zzn(zzbrp zzbrpVar) throws RemoteException;

    void zzo(zzbry zzbryVar) throws RemoteException;

    void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzq(zzcp zzcpVar) throws RemoteException;
}
