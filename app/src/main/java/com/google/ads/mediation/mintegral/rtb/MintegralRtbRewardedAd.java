package com.google.ads.mediation.mintegral.rtb;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralBidRewardedAdWrapper;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MintegralRtbRewardedAd extends MintegralRewardedAd {
    private MintegralBidRewardedAdWrapper mintegralBidRewardedAdWrapper;

    public MintegralRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd
    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        if (this.flagValueGetter.shouldRestrictMultipleAdLoads()) {
            this.mintegralSlotIdentifier = new MintegralSlotIdentifier(string, string2);
            MintegralMediationAdapter.loadedSlotIdentifiers.put(this.mintegralSlotIdentifier, new WeakReference<>(this));
        }
        MintegralBidRewardedAdWrapper mintegralBidRewardedAdWrapperCreateMintegralBidRewardedAdWrapper = MintegralFactory.createMintegralBidRewardedAdWrapper();
        this.mintegralBidRewardedAdWrapper = mintegralBidRewardedAdWrapperCreateMintegralBidRewardedAdWrapper;
        mintegralBidRewardedAdWrapperCreateMintegralBidRewardedAdWrapper.createAd(mediationRewardedAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationRewardedAdConfiguration.getWatermark());
            this.mintegralBidRewardedAdWrapper.setExtraInfo(jSONObject);
        } catch (JSONException e) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding rewarded video ad.", e);
        }
        this.mintegralBidRewardedAdWrapper.setRewardVideoListener(this);
        this.mintegralBidRewardedAdWrapper.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.mintegralBidRewardedAdWrapper.playVideoMute(this.muted ? 1 : 2);
        this.mintegralBidRewardedAdWrapper.showFromBid();
    }
}
