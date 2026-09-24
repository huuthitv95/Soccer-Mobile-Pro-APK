package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.ironsource.C11495If;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeam {
    private final zzbqe zza;

    zzeam(zzbqe zzbqeVar) {
        this.zza = zzbqeVar;
    }

    private final void zzs(zzeal zzealVar) throws RemoteException {
        String strZza = zzealVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzeal(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("creation", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("nativeObjectCreated");
        zzs(zzealVar);
    }

    public final void zzc(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("creation", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("nativeObjectNotCreated");
        zzs(zzealVar);
    }

    public final void zzd(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzealVar);
    }

    public final void zze(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc(C11495If.f24691j);
        zzs(zzealVar);
    }

    public final void zzf(long j, int i) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onAdFailedToLoad");
        zzealVar.zzd(Integer.valueOf(i));
        zzs(zzealVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc(C11495If.f24684c);
        zzs(zzealVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc(C11495If.f24687f);
        this.zza.zzb(zzealVar.zza());
    }

    public final void zzi(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("interstitial", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc(C11495If.f24688g);
        zzs(zzealVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzealVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onRewardedAdLoaded");
        zzs(zzealVar);
    }

    public final void zzl(long j, int i) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onRewardedAdFailedToLoad");
        zzealVar.zzd(Integer.valueOf(i));
        zzs(zzealVar);
    }

    public final void zzm(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onRewardedAdOpened");
        zzs(zzealVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onRewardedAdFailedToShow");
        zzealVar.zzd(Integer.valueOf(i));
        zzs(zzealVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onRewardedAdClosed");
        zzs(zzealVar);
    }

    public final void zzp(long j, zzcbt zzcbtVar) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onUserEarnedReward");
        zzealVar.zze(zzcbtVar.zze());
        zzealVar.zzf(Integer.valueOf(zzcbtVar.zzf()));
        zzs(zzealVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc("onAdImpression");
        zzs(zzealVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzeal zzealVar = new zzeal("rewarded", null);
        zzealVar.zzb(Long.valueOf(j));
        zzealVar.zzc(C11495If.f24687f);
        zzs(zzealVar);
    }
}
