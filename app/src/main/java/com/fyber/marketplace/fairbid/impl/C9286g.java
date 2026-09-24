package com.fyber.marketplace.fairbid.impl;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.AbstractC8044u;
import com.fyber.inneractive.sdk.config.C8046v;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.AbstractC7995g;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.ignite.C8248h;
import com.fyber.inneractive.sdk.ignite.C8252l;
import com.fyber.inneractive.sdk.serverapi.C9114c;
import com.fyber.inneractive.sdk.serverapi.InterfaceC9115d;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.ironsource.C12288ke;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C9286g implements MarketplaceAuctionParameters {

    /* JADX INFO: renamed from: a */
    public final HashMap f21735a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final InterfaceC9115d f21736b;

    /* JADX INFO: renamed from: c */
    public String f21737c;

    public C9286g(C9114c c9114c) {
        this.f21736b = c9114c;
    }

    /* JADX INFO: renamed from: a */
    public static Object m22094a(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String string = obj.toString();
        if (TextUtils.equals(string, Integer.class.toString())) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (TextUtils.equals(string, String.class.toString())) {
            return str;
        }
        if (TextUtils.equals(string, Boolean.class.toString())) {
            if (str.equalsIgnoreCase("1")) {
                return Boolean.TRUE;
            }
            if (str.equalsIgnoreCase("0")) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m22095a(HashMap map, EnumC9285f... enumC9285fArr) {
        JSONObject jSONObject = new JSONObject();
        for (EnumC9285f enumC9285f : enumC9285fArr) {
            String str = (String) map.get(enumC9285f.marketPlaceParam);
            if (!TextUtils.isEmpty(str)) {
                try {
                    Object objM22094a = m22094a(enumC9285f.type, str);
                    if (objM22094a != null) {
                        jSONObject.put(enumC9285f.fairBidParam, objM22094a);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getAdvertisingId() {
        C8046v c8046v = AbstractC8044u.f17878a.f17886b;
        if (c8046v != null ? c8046v.f17884c : false) {
            return null;
        }
        ((C9114c) this.f21736b).getClass();
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        if (!TextUtils.isEmpty(property)) {
            return property;
        }
        C8046v c8046v2 = AbstractC8044u.f17878a.f17886b;
        if (c8046v2 != null) {
            return c8046v2.f17882a;
        }
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getAmazonAdvertisingId() {
        C8046v c8046v = AbstractC8044u.f17878a.f17886b;
        if (!(c8046v != null ? c8046v.f17884c : false)) {
            return null;
        }
        ((C9114c) this.f21736b).getClass();
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.device");
        if (!TextUtils.isEmpty(property)) {
            return property;
        }
        C8046v c8046v2 = AbstractC8044u.f17878a.f17886b;
        if (c8046v2 != null) {
            return c8046v2.f17882a;
        }
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getAppVersion() {
        ((C9114c) this.f21736b).getClass();
        return AbstractC9162k.m21976l();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getBundleId() {
        ((C9114c) this.f21736b).getClass();
        return AbstractC9174o.f21470a.getPackageName();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getCarrier() {
        return ((C9114c) this.f21736b).m21922a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getDeviceModel() {
        ((C9114c) this.f21736b).getClass();
        return AbstractC9162k.m21974j();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final C8006r getFeatureProvider(String str) {
        return (C8006r) this.f21735a.get(str);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getHeight() {
        ((C9114c) this.f21736b).getClass();
        return AbstractC9174o.m22001c(AbstractC9174o.m22002d());
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getHorizontalAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final List getInputLanguages() {
        ((C9114c) this.f21736b).getClass();
        return IAConfigManager.f17654M.f17684p;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getLanguage() {
        ((C9114c) this.f21736b).getClass();
        return IAConfigManager.f17654M.f17683o;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getLatitudeLongitude() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final JSONObject getMarketplaceEntry() {
        HashMap map = new HashMap();
        ((C9114c) this.f21736b).m21923a(this.f21737c, map);
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String str = EnumC9285f.KEY_COUNTRY_CODE.marketPlaceParam;
            ((C9114c) this.f21736b).getClass();
            map.put(str, AbstractC9162k.m21973i());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_params", m22095a(map, EnumC9285f.KEY_TIME_OF_DAY));
        } catch (Exception unused) {
        }
        try {
            jSONObject.put("device_params", m22095a(map, EnumC9285f.KEY_AVAILABLE_DISK_SPACE, EnumC9285f.KEY_DO_NOT_DISTURB, EnumC9285f.KEY_AIRPLANE_MODE, EnumC9285f.KEY_ANDROID_LEVEL, EnumC9285f.KEY_IS_MUTED, EnumC9285f.KEY_HEADSET, EnumC9285f.KEY_BATTERY_CONNECTED, EnumC9285f.KEY_BATTERY_LEVEL, EnumC9285f.KEY_BLUETOOTH_CONNECTED, EnumC9285f.KEY_LOW_POWER_MODE, EnumC9285f.KEY_COUNTRY_CODE, EnumC9285f.KEY_DARK_MODE, EnumC9285f.KEY_TOTAL_DISK_SPACE, EnumC9285f.KEY_MEDIA_MUTED, EnumC9285f.KEY_AD_SERVICES_VERSION));
        } catch (Exception unused2) {
        }
        try {
            jSONObject.put("content_params", m22095a(map, EnumC9285f.KEY_LAST_BUNDLE_SHOWED, EnumC9285f.KEY_LAST_DOMAIN_SHOWED));
        } catch (Exception unused3) {
        }
        C8006r c8006rM20431a = C8006r.m20431a();
        this.f21735a.put(this.f21737c, c8006rM20431a);
        c8006rM20431a.m20434a(false, this.f21737c);
        JSONArray jSONArrayM20428a = AbstractC7995g.m20428a(c8006rM20431a.f17776b, true);
        IAlog.m21945a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayM20428a);
        if (jSONArrayM20428a != null && jSONArrayM20428a.length() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C12288ke.f30747d, jSONArrayM20428a);
            } catch (Exception unused4) {
            }
            try {
                jSONObject.put("sdk_experiments", jSONObject2);
            } catch (Exception unused5) {
            }
        }
        ((C9114c) this.f21736b).getClass();
        StringBuilder sb = new StringBuilder("2.2.0-Android-8.4.3");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        try {
            jSONObject.put("version", sb.toString());
        } catch (JSONException unused6) {
        }
        C8248h c8248h = IAConfigManager.f17654M.f17660D;
        if (c8248h != null) {
            C8252l c8252l = c8248h.f18422p;
            String strMo20291i = c8252l != null ? c8252l.f17294a.mo20291i() : null;
            C8252l c8252l2 = c8248h.f18422p;
            String strMo20286d = c8252l2 != null ? c8252l2.f17294a.mo20286d() : null;
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(strMo20291i) && !TextUtils.isEmpty(strMo20286d)) {
                try {
                    jSONObject3.put("version", strMo20291i);
                } catch (JSONException unused7) {
                }
                try {
                    jSONObject3.put("package_name", strMo20286d);
                } catch (JSONException unused8) {
                }
                try {
                    jSONObject.put("ignite_params", jSONObject3);
                } catch (Exception unused9) {
                }
            }
        }
        IAlog.m21945a("getMarketplaceEntry:Json object - %s", jSONObject.toString());
        return jSONObject;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getMobileCountryCode() {
        String str = ((C9114c) this.f21736b).f21368b;
        return str == null ? "" : str.substring(0, Math.min(3, str.length()));
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getMobileNetworkCode() {
        String str = ((C9114c) this.f21736b).f21368b;
        return str == null ? "" : str.substring(Math.min(3, str.length()));
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getNetwork() {
        ((C9114c) this.f21736b).getClass();
        EnumC9134a1 enumC9134a1M21954a = EnumC9134a1.m21954a();
        IAlog.m21945a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", enumC9134a1M21954a, enumC9134a1M21954a.m21955b());
        return enumC9134a1M21954a.m21955b();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final List getSupportedApis() {
        ((C9114c) this.f21736b).getClass();
        return C9114c.f21365c;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final List getSupportedProtocols() {
        ((C9114c) this.f21736b).getClass();
        return C9114c.f21366d;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getSupportedTypesBitwise() {
        this.f21736b.getClass();
        return 372;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getTimeAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final String getVerticalAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getWidth() {
        ((C9114c) this.f21736b).getClass();
        return AbstractC9174o.m22001c(AbstractC9174o.m22004e());
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final boolean hasAmazonAdvertisingId() {
        C8046v c8046v = AbstractC8044u.f17878a.f17886b;
        if (c8046v != null) {
            return c8046v.f17884c;
        }
        return false;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final Boolean isLimitTrackingEnabled() {
        ((C9114c) this.f21736b).getClass();
        C8046v c8046v = AbstractC8044u.f17878a.f17886b;
        return Boolean.valueOf(c8046v != null ? c8046v.f17883b : false);
    }
}
