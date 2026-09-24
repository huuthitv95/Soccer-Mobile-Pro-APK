package com.google.ads.mediation.mintegral.mediation;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MintegralNativeAdListener extends NativeAdWithCodeListener {
    protected MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> adLoadCallback;
    private final Context context;
    private MintegralNativeAd mintegralNativeAd;

    public MintegralNativeAdListener(MintegralNativeAd mintegralNativeAd, Context context, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.context = context;
        this.mintegralNativeAd = mintegralNativeAd;
        this.adLoadCallback = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        if (this.mintegralNativeAd.nativeCallback != null) {
            this.mintegralNativeAd.nativeCallback.reportAdClicked();
            this.mintegralNativeAd.nativeCallback.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public void onAdLoadErrorWithCode(int i, String str) {
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorCreateSdkError.toString());
        this.adLoadCallback.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i) {
        if (list == null || list.size() == 0) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(104, "Mintegral SDK failed to return a native ad.");
            Log.w(MintegralMediationAdapter.TAG, adErrorCreateAdapterError.toString());
            this.adLoadCallback.onFailure(adErrorCreateAdapterError);
        } else {
            this.mintegralNativeAd.mapNativeAd(list.get(0), this.context);
            MintegralNativeAd mintegralNativeAd = this.mintegralNativeAd;
            mintegralNativeAd.nativeCallback = this.adLoadCallback.onSuccess(mintegralNativeAd);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i) {
        if (this.mintegralNativeAd.nativeCallback != null) {
            this.mintegralNativeAd.nativeCallback.reportAdImpression();
        }
    }
}
