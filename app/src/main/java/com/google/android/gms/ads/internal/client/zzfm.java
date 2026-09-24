package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzccd;
import com.google.android.gms.internal.ads.zzcce;
import com.google.android.gms.internal.ads.zzcck;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfm extends zzcbv {
    private static void zzu(final zzccd zzccdVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzccd zzccdVar2 = zzccdVar;
                if (zzccdVar2 != null) {
                    try {
                        zzccdVar2.zzf(1);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzc(zzm zzmVar, zzccd zzccdVar) throws RemoteException {
        zzu(zzccdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzd(zzm zzmVar, zzccd zzccdVar) throws RemoteException {
        zzu(zzccdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zze(zzcbz zzcbzVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzf(zzdn zzdnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final Bundle zzg() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzh(zzcck zzcckVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final boolean zzi() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzj() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzcbt zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzdx zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzo(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzp(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzr(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzs(zzcce zzcceVar) throws RemoteException {
    }
}
