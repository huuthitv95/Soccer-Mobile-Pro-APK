package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.AbstractC8065d;
import com.fyber.inneractive.sdk.factories.InterfaceC8066e;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8262c;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8397n;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9084b;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.C9093k;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9284e {
    C9290k adSpot;
    MarketplaceAuctionParameters mMarketplaceAuctionParameters;
    private C9287h mMarketplaceAuctionResponse;
    private boolean mMuted;
    protected String mPlacementId;

    public AbstractC9284e(String str, JSONObject jSONObject, Map map, boolean z, MarketplaceAuctionParameters marketplaceAuctionParameters) {
        Map<String, String> mapLowerCaseHeaders = lowerCaseHeaders(map);
        EnumC9083a responseAdType = getResponseAdType(mapLowerCaseHeaders);
        this.mMarketplaceAuctionParameters = marketplaceAuctionParameters;
        this.mPlacementId = str;
        if (responseAdType != null) {
            this.mMarketplaceAuctionResponse = new C9287h(jSONObject, responseAdType, mapLowerCaseHeaders);
        }
        this.mMuted = z;
    }

    public static void access$000(AbstractC9284e abstractC9284e, InneractiveUnitController inneractiveUnitController, MarketplaceAdLoadListener marketplaceAdLoadListener, AbstractC9087e abstractC9087e, InterfaceC8262c interfaceC8262c) {
        abstractC9284e.getClass();
        if (abstractC9087e == null || interfaceC8262c == null) {
            return;
        }
        AbstractC9183r.f21478b.post(new RunnableC9282c(abstractC9284e, inneractiveUnitController, marketplaceAdLoadListener, abstractC9087e, interfaceC8262c));
    }

    public InterfaceC8262c getAdContentLoader(MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, EnumC9083a enumC9083a) {
        InterfaceC8066e interfaceC8066e = (InterfaceC8066e) AbstractC8065d.f17949a.f17950a.get(enumC9083a);
        InterfaceC8262c interfaceC8262cMo20465a = interfaceC8066e != null ? interfaceC8066e.mo20465a() : null;
        if (interfaceC8262cMo20465a != null) {
            return interfaceC8262cMo20465a;
        }
        notifyFailToListener(MarketplaceAdLoadError.UNSUPPORTED_AD_TYPE, marketplaceAdLoadListener);
        return null;
    }

    public EnumC9083a getResponseAdType(Map<String, String> map) {
        String str = map.get(EnumC8397n.RETURNED_AD_TYPE.m20774a().toLowerCase(Locale.ENGLISH));
        if (str == null) {
            return null;
        }
        try {
            return EnumC9083a.m21884a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public abstract void internalOnAdLoaded(AbstractC9284e abstractC9284e, C9290k c9290k);

    public abstract boolean isFullscreen();

    public boolean isMuted() {
        return this.mMuted;
    }

    public void loadAd(InneractiveUnitController<?> inneractiveUnitController, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        C9287h c9287h = this.mMarketplaceAuctionResponse;
        if (c9287h == null) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            return;
        }
        EnumC9083a enumC9083a = c9287h.f21739b;
        String str = c9287h.f21738a;
        Map map = c9287h.f21740c;
        if (enumC9083a == null || str == null || map.isEmpty()) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
        } else {
            AbstractC9183r.f21477a.execute(new RunnableC9280a(this, marketplaceAdLoadListener, enumC9083a, str, map, inneractiveUnitController));
        }
    }

    public Map<String, String> lowerCaseHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (String str : map.keySet()) {
                map2.put(TextUtils.isEmpty(str) ? str : str.toLowerCase(Locale.ENGLISH), map.get(str));
            }
        }
        return map2;
    }

    public void notifyFailToListener(MarketplaceAdLoadError marketplaceAdLoadError, MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener) {
        if (isFullscreen()) {
            IAlog.m21945a("Firing Event 801 - AdLoadFailed - errorCode - %s", marketplaceAdLoadError.getErrorMessage());
            C8428w c8428w = new C8428w(EnumC8415t.IA_AD_LOAD_FAILED, (InneractiveAdRequest) null, (AbstractC9087e) null);
            JSONObject jSONObject = new JSONObject();
            String string = marketplaceAdLoadError.toString();
            try {
                jSONObject.put("message", string);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "message", string);
            }
            String errorMessage = marketplaceAdLoadError.getErrorMessage();
            try {
                jSONObject.put("extra_description", errorMessage);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "extra_description", errorMessage);
            }
            c8428w.f18758f.put(jSONObject);
            c8428w.m20808a((String) null);
        }
        marketplaceAdLoadListener.onAdLoadFailed(marketplaceAdLoadError);
    }

    public AbstractC9087e parseResponseData(MarketplaceAdLoadListener<? extends MarketplaceBridgeAd> marketplaceAdLoadListener, EnumC9083a enumC9083a, String str, Map<String, String> map) {
        InterfaceC8066e interfaceC8066e = (InterfaceC8066e) AbstractC8065d.f17949a.f17950a.get(enumC9083a);
        AbstractC9084b abstractC9084bMo20466b = interfaceC8066e != null ? interfaceC8066e.mo20466b() : null;
        IAlog.m21945a("IA Exchange response handler: final headers: %s", map);
        if (abstractC9084bMo20466b != null) {
            C9283d c9283d = new C9283d(map, str);
            abstractC9084bMo20466b.f21280a = abstractC9084bMo20466b.mo21885a();
            abstractC9084bMo20466b.f21282c = new C9093k(c9283d);
        }
        try {
            AbstractC9087e abstractC9087eM21886a = abstractC9084bMo20466b.m21886a(str);
            InneractiveErrorCode inneractiveErrorCodeMo21894b = abstractC9087eM21886a.mo21894b();
            if (inneractiveErrorCodeMo21894b == null) {
                return abstractC9087eM21886a;
            }
            notifyFailToListener(MarketplaceAdLoadError.RESPONSE_VALIDATION_FAILED, marketplaceAdLoadListener);
            IAlog.m21945a("failed parsing response data with error: %s", inneractiveErrorCodeMo21894b.toString());
            return null;
        } catch (Exception e) {
            notifyFailToListener(MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            if (e.getMessage() != null) {
                IAlog.m21945a("failed parsing response data with error: %s", e.getMessage());
            }
            return null;
        }
    }
}
