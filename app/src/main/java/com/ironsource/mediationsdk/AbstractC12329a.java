package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C12194fa;
import com.ironsource.C12518sf;
import com.ironsource.InterfaceC12471s3;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12329a<Listener extends AdapterAdListener> extends BaseAdAdapter<C12370s, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener>, AdapterBindAdViewInterface, InterfaceC12471s3 {

    /* JADX INFO: renamed from: a */
    protected AbstractAdapter f30987a;

    /* JADX INFO: renamed from: b */
    protected WeakReference<Listener> f30988b;

    public AbstractC12329a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a, UUID uuid) {
        super(C12518sf.m33676a(enumC12328a), networkSettings, uuid);
        this.f30988b = new WeakReference<>(null);
        this.f30987a = abstractAdapter;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC12329a<?> m32237a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.EnumC12328a enumC12328a, UUID uuid) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return new C12374v(abstractAdapter, networkSettings, uuid);
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return new C12365n(abstractAdapter, networkSettings, uuid);
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return new C12356i(abstractAdapter, networkSettings, uuid);
        }
        if (enumC12328a == IronSource.EnumC12328a.NATIVE_AD) {
            return new C12369r(abstractAdapter, networkSettings, uuid);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + enumC12328a);
        return null;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo32243a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    /* JADX INFO: renamed from: b */
    protected abstract IronSource.EnumC12328a mo32245b();

    /* JADX INFO: renamed from: b */
    protected boolean mo32246b(JSONObject jSONObject) {
        m32239b("isAdAvailable");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void mo32247c(JSONObject jSONObject) {
        m32239b("onAdViewWillBind");
    }

    @Override // com.ironsource.InterfaceC12471s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        mo32244a(C12194fa.m31479a(adData.getConfiguration()), C12194fa.m31479a(adData.getAdUnitData()), biddingDataCallback);
    }

    /* JADX INFO: renamed from: d */
    public void mo32248d(JSONObject jSONObject) {
        m32239b("onAdViewWillBind");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(AdData adData) {
        mo32242a(C12194fa.m31479a(adData.getConfiguration()));
    }

    /* JADX INFO: renamed from: e */
    protected void mo32249e(JSONObject jSONObject) {
        m32239b("showAd");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return mo32246b(C12194fa.m31479a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(AdData adData, Context context, Listener listener) {
        m32238a(adData, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(AdData adData) {
        mo32247c(C12194fa.m31479a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(AdData adData) {
        mo32248d(C12194fa.m31479a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, Listener listener) {
        this.f30988b = new WeakReference<>(listener);
        mo32249e(C12194fa.m31479a(adData.getConfiguration()));
    }

    /* JADX INFO: renamed from: b */
    private void m32239b(String str) {
        IronLog.INTERNAL.error(m32241a("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener) {
        m32238a(adData, listener);
    }

    /* JADX INFO: renamed from: a */
    protected void mo32242a(JSONObject jSONObject) {
        m32239b("destroyAd");
    }

    /* JADX INFO: renamed from: a */
    protected void mo32244a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        m32239b("collectBiddingData");
    }

    /* JADX INFO: renamed from: a */
    protected String m32241a(String str) {
        String string = mo32245b().toString();
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        return string + " - " + str;
    }

    /* JADX INFO: renamed from: a */
    protected String m32240a() {
        return m32241a((String) null);
    }

    /* JADX INFO: renamed from: a */
    private void m32238a(AdData adData, Listener listener) {
        this.f30988b = new WeakReference<>(listener);
        mo32243a(C12194fa.m31479a(adData.getConfiguration()), C12194fa.m31479a(adData.getAdUnitData()), adData);
    }
}
