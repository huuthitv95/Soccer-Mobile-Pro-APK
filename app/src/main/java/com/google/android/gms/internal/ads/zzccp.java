package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzccp extends zzccc {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzccq zzb;

    public zzccp(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzccq zzccqVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzccqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zze() {
        zzccq zzccqVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzccqVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzccqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
