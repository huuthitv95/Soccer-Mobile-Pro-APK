package com.google.ads.mediation.mintegral.waterfall;

import android.content.Context;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralRewardedAdWrapper;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class MintegralWaterfallRewardedAd extends MintegralRewardedAd {
    private MintegralRewardedAdWrapper mintegralRewardedAdWrapper;

    public MintegralWaterfallRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd
    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        if (this.flagValueGetter.shouldRestrictMultipleAdLoads()) {
            this.mintegralSlotIdentifier = new MintegralSlotIdentifier(string, string2);
            WeakReference<Object> weakReference = MintegralMediationAdapter.loadedSlotIdentifiers.get(this.mintegralSlotIdentifier);
            if (weakReference != null && weakReference.get() != null) {
                this.adLoadCallback.onFailure(new AdError(106, MintegralConstants.ERROR_MSG_AD_ALREADY_LOADED, "com.google.ads.mediation.mintegral"));
                return;
            }
            MintegralMediationAdapter.loadedSlotIdentifiers.put(this.mintegralSlotIdentifier, new WeakReference<>(this));
        }
        MintegralRewardedAdWrapper mintegralRewardedAdWrapperCreateMintegralRewardedAdWrapper = MintegralFactory.createMintegralRewardedAdWrapper();
        this.mintegralRewardedAdWrapper = mintegralRewardedAdWrapperCreateMintegralRewardedAdWrapper;
        mintegralRewardedAdWrapperCreateMintegralRewardedAdWrapper.createAd(mediationRewardedAdConfiguration.getContext(), string2, string);
        this.mintegralRewardedAdWrapper.setRewardVideoListener(this);
        this.mintegralRewardedAdWrapper.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.mintegralRewardedAdWrapper.playVideoMute(this.muted ? 1 : 2);
        this.mintegralRewardedAdWrapper.show();
    }
}
