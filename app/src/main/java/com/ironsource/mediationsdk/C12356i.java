package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C11518K2;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.i */
/* JADX INFO: loaded from: classes6.dex */
public class C12356i extends AbstractC12329a<BannerAdListener> implements BannerSmashListener {
    public C12356i(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.EnumC12328a.BANNER, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: a */
    protected void mo32243a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        C12366o c12366o = (C12366o) adData.getAdUnitData().get(C11518K2.f24806t);
        if (c12366o == null) {
            IronLog.INTERNAL.error(m32241a("Banner layout is null, cannot load banner ad"));
            if (this.f30988b.get() != null) {
                ((BannerAdListener) this.f30988b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "Banner layout is null");
                return;
            }
            return;
        }
        if (num == null || num.intValue() != 1) {
            this.f30987a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), c12366o.getSize(), this);
        } else {
            this.f30987a.loadBanner(jSONObject, jSONObject2, c12366o.getSize(), this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: b */
    protected IronSource.EnumC12328a mo32245b() {
        return IronSource.EnumC12328a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: c */
    public void mo32247c(JSONObject jSONObject) {
        this.f30987a.onBannerViewBound(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: d */
    public void mo32248d(JSONObject jSONObject) {
        this.f30987a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((BannerAdListener) this.f30988b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(Map map) {
        onBannerAdClicked();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((BannerAdListener) this.f30988b.get()).onAdLeftApplication();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(Map map) {
        onBannerAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(m32241a("error = " + ironSourceError));
        if (this.f30988b.get() != null) {
            ((BannerAdListener) this.f30988b.get()).onAdLoadFailed(m32522a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(IronSourceError ironSourceError, Map map) {
        onBannerAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        onBannerAdLoaded(view, layoutParams, new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((BannerAdListener) this.f30988b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(Map map) {
        onBannerAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((BannerAdListener) this.f30988b.get()).onAdScreenPresented();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(Map map) {
        onBannerAdScreenPresented();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        onBannerAdShown(new HashMap());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(IronSourceError ironSourceError, Map map) {
        onBannerInitFailed(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(Map map) {
        onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((BannerAdListener) this.f30988b.get()).onAdLoadSuccess(view, layoutParams, map);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown(Map<String, Object> map) {
        IronLog.ADAPTER_CALLBACK.verbose(m32240a());
        if (this.f30988b.get() != null) {
            ((BannerAdListener) this.f30988b.get()).onAdOpened(map);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: a */
    protected void mo32242a(JSONObject jSONObject) {
        this.f30987a.destroyBanner(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC12329a
    /* JADX INFO: renamed from: a */
    protected void mo32244a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f30987a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    /* JADX INFO: renamed from: a */
    protected boolean m32522a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }
}
