package com.google.ads.mediation.mintegral.rtb;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MintegralRtbInterstitialAd extends MintegralInterstitialAd {
    private MintegralBidNewInterstitialAdWrapper mbBidNewInterstitialAdWrapper;

    public MintegralRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd
    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        if (this.flagValueGetter.shouldRestrictMultipleAdLoads()) {
            this.mintegralSlotIdentifier = new MintegralSlotIdentifier(string, string2);
            MintegralMediationAdapter.loadedSlotIdentifiers.put(this.mintegralSlotIdentifier, new WeakReference<>(this));
        }
        MintegralBidNewInterstitialAdWrapper mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler = MintegralFactory.createBidInterstitialHandler();
        this.mbBidNewInterstitialAdWrapper = mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler;
        mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler.createAd(mediationInterstitialAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationInterstitialAdConfiguration.getWatermark());
            this.mbBidNewInterstitialAdWrapper.setExtraInfo(jSONObject);
        } catch (JSONException e) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding interstitial ad.", e);
        }
        this.mbBidNewInterstitialAdWrapper.setInterstitialVideoListener(this);
        this.mbBidNewInterstitialAdWrapper.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.mbBidNewInterstitialAdWrapper.playVideoMute(this.muted ? 1 : 2);
        this.mbBidNewInterstitialAdWrapper.showFromBid();
    }
}
