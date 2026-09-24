package com.applovin.impl;

import android.net.Uri;
import android.text.format.Formatter;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAdSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.h2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1568h2 {
    /* JADX INFO: renamed from: a */
    public static String m2784a(String str) {
        return StringUtils.prefixToIndex(1000, str);
    }

    /* JADX INFO: renamed from: a */
    public static Map m2785a(AbstractC1482a3 abstractC1482a3) {
        Map mapM2786a = m2786a((C1619m3) abstractC1482a3);
        CollectionUtils.putStringIfValid("bcode", abstractC1482a3.m1817C(), mapM2786a);
        CollectionUtils.putStringIfValid(CampaignEx.JSON_KEY_CREATIVE_ID, abstractC1482a3.getCreativeId(), mapM2786a);
        CollectionUtils.putStringIfValid("ad_unit_id", abstractC1482a3.getAdUnitId(), mapM2786a);
        CollectionUtils.putStringIfValid("ad_event_id", abstractC1482a3.m1833T(), mapM2786a);
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, abstractC1482a3.getFormat().getLabel(), mapM2786a);
        CollectionUtils.putStringIfValid("dsp_id", abstractC1482a3.getDspId(), mapM2786a);
        CollectionUtils.putStringIfValid("dsp_name", abstractC1482a3.getDspName(), mapM2786a);
        return mapM2786a;
    }

    /* JADX INFO: renamed from: a */
    public static Map m2786a(C1619m3 c1619m3) {
        HashMap map = new HashMap(3);
        CollectionUtils.putStringIfValid("network_name", c1619m3.m3200c(), map);
        String strM3196b = c1619m3.m3196b();
        CollectionUtils.putStringIfValid("adapter_class", strM3196b, map);
        CollectionUtils.putStringIfValid("adapter_version", AbstractC1821y3.m5693a(strM3196b).getAdapterVersion(), map);
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static Map m2787a(AppLovinAdImpl appLovinAdImpl) {
        HashMap map = new HashMap(10);
        if (appLovinAdImpl != null) {
            CollectionUtils.putStringIfValid("ad_domain", appLovinAdImpl.getAdDomain(), map);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinAdImpl.getAdIdNumber()), map);
            MaxAdFormat maxAdFormatM5263d = appLovinAdImpl.getAdZone().m5263d();
            CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, maxAdFormatM5263d != null ? maxAdFormatM5263d.getLabel() : null, map);
            CollectionUtils.putStringIfValid("ad_zone_id", appLovinAdImpl.getAdZone().m5264e(), map);
            CollectionUtils.putStringIfValid("clcode", appLovinAdImpl.getClCode(), map);
            CollectionUtils.putStringIfValid("dsp_id", appLovinAdImpl.getDspId(), map);
            CollectionUtils.putStringIfValid("dsp_name", appLovinAdImpl.getDspName(), map);
            CollectionUtils.putStringIfValid("ad_size", appLovinAdImpl.getSize().getLabel(), map);
            CollectionUtils.putStringIfValid("ad_event_id", appLovinAdImpl.getMediationServeId(), map);
            CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinAdImpl.isOpenMeasurementEnabled()), map);
            if (appLovinAdImpl instanceof AbstractC1736b) {
                CollectionUtils.putStringIfValid("is_persisted_ad", String.valueOf(((AbstractC1736b) appLovinAdImpl).mo4246u0()), map);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static Map m2788a(AbstractC1736b abstractC1736b) {
        HashMap map = new HashMap();
        if (abstractC1736b != null) {
            C1748l sdk = abstractC1736b.getSdk();
            if (((Boolean) sdk.m4801a(C1831z4.f3758L)).booleanValue()) {
                HashMap map2 = new HashMap();
                Iterator it = new ArrayList(abstractC1736b.m4545l().keySet()).iterator();
                while (it.hasNext()) {
                    String path = Uri.parse((String) it.next()).getPath();
                    map2.put(path, Formatter.formatFileSize(C1748l.m4756p(), new File(path).length()));
                }
                map.put("path", map2.toString());
            }
            if ((abstractC1736b instanceof C1735a) && ((Boolean) sdk.m4801a(C1831z4.f3766M)).booleanValue()) {
                map.put("details", ((C1735a) abstractC1736b).m4440a1());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static Map m2789a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        HashMap map = new HashMap(7);
        if (appLovinNativeAdImpl == null) {
            return map;
        }
        CollectionUtils.putStringIfValid("ad_domain", appLovinNativeAdImpl.getAdDomain(), map);
        CollectionUtils.putStringIfValid("ad_id", String.valueOf(appLovinNativeAdImpl.getAdIdNumber()), map);
        CollectionUtils.putStringIfValid("clcode", appLovinNativeAdImpl.getClCode(), map);
        CollectionUtils.putStringIfValid("dsp_id", appLovinNativeAdImpl.getDspId(), map);
        CollectionUtils.putStringIfValid("dsp_name", appLovinNativeAdImpl.getDspName(), map);
        CollectionUtils.putStringIfValid("ad_size", AppLovinAdSize.NATIVE.toString(), map);
        CollectionUtils.putStringIfValid("ad_event_id", appLovinNativeAdImpl.getMediationServeId(), map);
        CollectionUtils.putStringIfValid("is_omsdk_enabled", String.valueOf(appLovinNativeAdImpl.isOpenMeasurementEnabled()), map);
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static Map m2790a(MaxError maxError) {
        HashMap map = new HashMap(4);
        CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), map);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), map);
        CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), map);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), map);
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static String m2791b(AbstractC1736b abstractC1736b) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "reshow_count", abstractC1736b.m4503R());
        return jSONObject.toString();
    }
}
