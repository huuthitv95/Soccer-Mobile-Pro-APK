package com.google.ads.mediation.mintegral.waterfall;

import android.content.Context;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class MintegralWaterfallInterstitialAd extends MintegralInterstitialAd {
    private MintegralNewInterstitialAdWrapper mbNewInterstitialAdWrapper;

    public MintegralWaterfallInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd
    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString("placement_id");
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
        MintegralNewInterstitialAdWrapper mintegralNewInterstitialAdWrapperCreateInterstitialHandler = MintegralFactory.createInterstitialHandler();
        this.mbNewInterstitialAdWrapper = mintegralNewInterstitialAdWrapperCreateInterstitialHandler;
        mintegralNewInterstitialAdWrapperCreateInterstitialHandler.createAd(mediationInterstitialAdConfiguration.getContext(), string2, string);
        this.mbNewInterstitialAdWrapper.setInterstitialVideoListener(this);
        this.mbNewInterstitialAdWrapper.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.mbNewInterstitialAdWrapper.playVideoMute(this.muted ? 1 : 2);
        this.mbNewInterstitialAdWrapper.show();
    }
}
