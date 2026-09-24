package com.google.ads.mediation.mintegral.rtb;

import android.util.Log;
import android.widget.FrameLayout;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.BannerSize;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class MintegralRtbBannerAd extends MintegralBannerAd {
    public MintegralRtbBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralBannerAd
    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        BannerSize mintegralBannerSizeFromAdMobAdSize = getMintegralBannerSizeFromAdMobAdSize(mediationBannerAdConfiguration.getAdSize(), mediationBannerAdConfiguration.getContext(), true);
        if (mintegralBannerSizeFromAdMobAdSize == null) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getAdSize()));
            Log.e(MintegralMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.adLoadCallback.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        this.mbBannerView = MintegralFactory.createMBBannerView(mediationBannerAdConfiguration.getContext());
        this.mbBannerView.init(mintegralBannerSizeFromAdMobAdSize, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationBannerAdConfiguration.getWatermark());
            this.mbBannerView.setExtraInfo(jSONObject);
        } catch (JSONException e) {
            Log.w(MintegralMediationAdapter.TAG, "Failed to apply watermark to Mintegral bidding banner ad.", e);
        }
        this.mbBannerView.setLayoutParams(new FrameLayout.LayoutParams(MintegralUtils.convertDipToPixel(mediationBannerAdConfiguration.getContext(), mintegralBannerSizeFromAdMobAdSize.getWidth()), MintegralUtils.convertDipToPixel(mediationBannerAdConfiguration.getContext(), mintegralBannerSizeFromAdMobAdSize.getHeight())));
        this.mbBannerView.setBannerAdListener(this);
        this.mbBannerView.loadFromBid(bidResponse);
    }
}
