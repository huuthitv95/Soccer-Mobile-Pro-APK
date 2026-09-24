package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.n */
/* JADX INFO: loaded from: classes6.dex */
public class C12365n extends AbstractC12329a<InterstitialAdListener> implements InterstitialSmashListener {
    public C12365n(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.EnumC12328a.INTERSTITIAL, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: a */
    protected void mo32243a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        if (num == null || num.intValue() != 1) {
            this.f30987a.loadInterstitialForBidding(jSONObject, jSONObject2, adData.getServerData(), this);
        } else {
            this.f30987a.loadInterstitial(jSONObject, jSONObject2, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: b */
    protected boolean mo32246b(JSONObject jSONObject) {
        return this.f30987a.isInterstitialReady(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: e */
    protected void mo32249e(JSONObject jSONObject) {
        this.f30987a.showInterstitial(jSONObject, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((InterstitialAdListener) this.f30988b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClicked(Map map) {
        onInterstitialAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((InterstitialAdListener) this.f30988b.get()).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClosed(Map map) {
        onInterstitialAdClosed();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m32241a("error = " + ironSourceError));
        if (this.f30988b.get() != null) {
            ((InterstitialAdListener) this.f30988b.get()).onAdLoadFailed(m32579a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdLoadFailed(IronSourceError ironSourceError, Map map) {
        onInterstitialAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        onInterstitialAdOpened(new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((InterstitialAdListener) this.f30988b.get()).onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m32241a("error = " + ironSourceError));
        if (this.f30988b.get() != null) {
            ((InterstitialAdListener) this.f30988b.get()).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowFailed(IronSourceError ironSourceError, Map map) {
        onInterstitialAdShowFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdVisible(Map map) {
        onInterstitialAdVisible();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitFailed(IronSourceError ironSourceError, Map map) {
        onInterstitialInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitSuccess(Map map) {
        onInterstitialInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: b */
    protected IronSource.EnumC12328a mo32245b() {
        return IronSource.EnumC12328a.INTERSTITIAL;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((InterstitialAdListener) this.f30988b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((InterstitialAdListener) this.f30988b.get()).onAdLoadSuccess(map);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: a */
    protected void mo32244a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f30987a.collectInterstitialBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: a */
    protected void mo32242a(JSONObject jSONObject) {
        this.f30987a.destroyInterstitialAd(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    protected boolean m32579a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 1158;
    }
}
