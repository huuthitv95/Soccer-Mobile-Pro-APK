package com.google.ads.mediation.mintegral.mediation;

import android.util.Log;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MintegralRewardedAd extends RewardVideoWithCodeListener implements MediationRewardedAd {
    protected final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    protected final FlagValueGetter flagValueGetter;
    protected MintegralSlotIdentifier mintegralSlotIdentifier;
    protected final boolean muted;
    protected MediationRewardedAdCallback rewardedAdCallback;

    public MintegralRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        this.muted = MintegralUtils.shouldMuteAudio(mediationRewardedAdConfiguration.getMediationExtras());
        this.adLoadCallback = mediationAdLoadCallback;
        this.flagValueGetter = flagValueGetter;
    }

    public abstract void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.rewardedAdCallback == null) {
            return;
        }
        if (rewardInfo == null || !rewardInfo.isCompleteView()) {
            Log.w(MintegralMediationAdapter.TAG, "Mintegral SDK failed to reward user due to missing rewarded settings or rewarded ad playback not completed.");
        } else {
            this.rewardedAdCallback.onUserEarnedReward();
        }
        this.rewardedAdCallback.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    public void onAdShow(MBridgeIds mBridgeIds) {
        if (this.flagValueGetter.shouldRestrictMultipleAdLoads() && this.mintegralSlotIdentifier != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(this.mintegralSlotIdentifier);
        }
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.rewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        if (this.flagValueGetter.shouldRestrictMultipleAdLoads() && this.mintegralSlotIdentifier != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(this.mintegralSlotIdentifier);
        }
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorCreateSdkError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorCreateSdkError);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i, String str) {
        if (this.flagValueGetter.shouldRestrictMultipleAdLoads() && this.mintegralSlotIdentifier != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(this.mintegralSlotIdentifier);
        }
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorCreateSdkError.toString());
        this.adLoadCallback.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.rewardedAdCallback = this.adLoadCallback.onSuccess(this);
    }
}
