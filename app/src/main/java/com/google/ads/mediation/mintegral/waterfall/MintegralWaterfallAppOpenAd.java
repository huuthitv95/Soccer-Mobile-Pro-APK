package com.google.ads.mediation.mintegral.waterfall;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralAppOpenAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class MintegralWaterfallAppOpenAd extends MintegralAppOpenAd {
    public MintegralWaterfallAppOpenAd(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralAppOpenAd
    public void loadAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("ad_unit_id");
        String string2 = serverParameters.getString("placement_id");
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
        this.splashAdWrapper = MintegralFactory.createSplashAdWrapper();
        this.splashAdWrapper.createAd(string2, string);
        this.splashAdWrapper.setSplashLoadListener(this);
        this.splashAdWrapper.setSplashShowListener(this);
        this.splashAdWrapper.preLoad();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Activity activity = (Activity) context;
        if (this.splashAdWrapper != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.splashAdWrapper.show(relativeLayout);
        }
    }
}
