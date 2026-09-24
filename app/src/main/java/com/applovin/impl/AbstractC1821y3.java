package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.vungle.ads.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.y3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1821y3 {

    /* JADX INFO: renamed from: a */
    private static final TreeMap f3635a;

    /* JADX INFO: renamed from: b */
    private static final Map f3636b;

    /* JADX INFO: renamed from: c */
    private static final List f3637c;

    /* JADX INFO: renamed from: d */
    private static JSONArray f3638d;

    /* JADX INFO: renamed from: e */
    private static final Map f3639e = new HashMap();

    /* JADX INFO: renamed from: f */
    private static final Object f3640f = new Object();

    /* JADX INFO: renamed from: g */
    private static final Map f3641g = Collections.synchronizedMap(new HashMap(1));

    static {
        TreeMap treeMap = new TreeMap();
        f3635a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdjoeAdsMediationAdapter", "adjoe Ads");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "PubMatic");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", BuildConfig.OMSDK_PARTNER_NAME);
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        treeMap.put("com.applovin.mediation.ALYsoNetworkMediationAdapter", "YSO Network");
        treeMap.put("com.applovin.mediation.adapters.YsoNetworkMediationAdapter", "YSO Network");
        f3637c = new ArrayList(treeMap.keySet());
        HashMap map = new HashMap();
        f3636b = map;
        map.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "3.0.1.1");
        map.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "6.5.0.8.1");
        map.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "9.7.0.3");
        map.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "6.17.0.1");
        map.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "23.3.0.1");
        map.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "6.4.2.1");
        map.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "10.7.7.1");
        map.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "8.3.6.1");
        map.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "8.3.0.0.2");
        map.put("com.applovin.mediation.adapters.LineMediationAdapter", "2024.8.27.1");
        map.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "16.8.51.1");
        map.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "1.7.6.1");
        map.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "3.1.0.1");
        map.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "5.22.1.1");
        map.put("com.applovin.mediation.adapters.PubMaticMediationAdapter", "3.9.0.2");
        map.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "22.7.0.1");
        map.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "4.12.2.1");
        map.put("com.applovin.mediation.adapters.VerveMediationAdapter", "3.0.4.1");
        map.put("com.applovin.mediation.adapters.VungleMediationAdapter", "7.4.1.1");
        map.put("com.applovin.mediation.adapters.YandexMediationAdapter", "7.4.0.1");
    }

    /* JADX INFO: renamed from: a */
    public static MaxMediatedNetworkInfo m5693a(String str) {
        MaxMediatedNetworkInfo maxMediatedNetworkInfo;
        synchronized (f3640f) {
            maxMediatedNetworkInfo = (MaxMediatedNetworkInfo) f3639e.get(str);
        }
        if (maxMediatedNetworkInfo != null) {
            return maxMediatedNetworkInfo;
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "class", str);
        return new MaxMediatedNetworkInfoImpl(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static MaxAdapter m5694a(String str, C1748l c1748l) {
        if (TextUtils.isEmpty(str)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(c1748l.m4758A0());
            }
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5174b("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            }
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5172a("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static AppLovinSdkUtils.Size m5695a(int i, Context context) {
        int iRound;
        if (i >= 600) {
            iRound = Math.round(i / 8.088889f);
        } else {
            iRound = i > 450 ? Math.round(i / 7.8f) : Math.round(i / 6.4f);
        }
        AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(i, Math.max(50, Math.min(iRound, Math.min(90, Math.round(AppLovinSdkUtils.pxToDp(context, AbstractC1677p0.m3800b(context).y) * 0.15f)))));
        f3641g.put(Integer.valueOf(i), size);
        return size;
    }

    /* JADX INFO: renamed from: a */
    public static AppLovinSdkUtils.Size m5696a(int i, MaxAdFormat maxAdFormat, Context context) {
        if (i < 0) {
            i = AppLovinSdkUtils.pxToDp(context, AbstractC1677p0.m3793a(context).x);
        }
        Map map = f3641g;
        if (map.containsKey(Integer.valueOf(i))) {
            return (AppLovinSdkUtils.Size) map.get(Integer.valueOf(i));
        }
        return Boolean.TRUE.equals((Boolean) C1521c5.m2201a(C1511b5.f1152J, Boolean.FALSE, context)) ? m5695a(i, context) : m5703b(i, maxAdFormat, context);
    }

    /* JADX INFO: renamed from: a */
    public static String m5697a(MaxAdapter maxAdapter) {
        try {
            return StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (Throwable th) {
            C1768p.m5164c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static List m5698a(C1748l c1748l) {
        HashSet hashSet;
        ArrayList arrayList = new ArrayList(c1748l.m4821c(AbstractC1776t3.f3359o7));
        if (!((Boolean) c1748l.m4801a(AbstractC1776t3.f3361p7)).booleanValue()) {
            return arrayList;
        }
        synchronized (f3640f) {
            hashSet = new HashSet(f3639e.keySet());
        }
        arrayList.retainAll(hashSet);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static Map m5699a(AbstractC1482a3 abstractC1482a3, C1748l c1748l) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(c1748l.m4865y0().m3898e());
        if (!((Boolean) c1748l.m4801a(C1831z4.f3762L3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", StringUtils.emptyIfNull(abstractC1482a3.getPlacement()));
        map.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(abstractC1482a3.m3208e()));
        map.put("{CREATIVE_ID}", StringUtils.emptyIfNull(abstractC1482a3.getCreativeId()));
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5700a(MaxAdapter maxAdapter, String str) {
        String str2 = (String) f3636b.get(str);
        return TextUtils.isEmpty(str2) || AbstractC1701q7.m4018a(maxAdapter.getAdapterVersion(), str2) >= 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5701a(Object obj) {
        return (obj instanceof AbstractC1736b) && StringUtils.isValidString(((AbstractC1736b) obj).getMediationServeId());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5702a(JSONObject jSONObject, String str, C1748l c1748l) {
        if (!JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray("no_fill_reason"), IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE)) {
            return false;
        }
        c1748l.m4764E().m2679a(C1548f2.f1515Z0, "invalid_or_disabled_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "invalid_or_disabled_ad_unit_id" + str);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static AppLovinSdkUtils.Size m5703b(int i, MaxAdFormat maxAdFormat, Context context) {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
            Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
            Method method2 = cls.getMethod("getWidth", null);
            Method method3 = cls.getMethod("getHeight", null);
            Object objInvoke = method.invoke(null, context, Integer.valueOf(i));
            AppLovinSdkUtils.Size size = new AppLovinSdkUtils.Size(((Integer) method2.invoke(objInvoke, null)).intValue(), ((Integer) method3.invoke(objInvoke, null)).intValue());
            f3641g.put(Integer.valueOf(i), size);
            return size;
        } catch (Throwable unused) {
            return maxAdFormat.getSize();
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m5704b(C1748l c1748l) {
        synchronized (f3640f) {
            if (f3638d != null) {
                m5709d(c1748l);
                return f3638d;
            }
            f3638d = new JSONArray();
            for (String str : f3637c) {
                MaxAdapter maxAdapterM5694a = m5694a(str, c1748l);
                if (maxAdapterM5694a != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("name", f3635a.get(str));
                        jSONObject.put("class", str);
                        jSONObject.put("sdk_version", m5697a(maxAdapterM5694a));
                        jSONObject.put("version", maxAdapterM5694a.getAdapterVersion());
                        jSONObject.put("is_supported", m5700a(maxAdapterM5694a, str));
                    } catch (Throwable unused) {
                    }
                    f3638d.put(jSONObject);
                    f3639e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
                }
            }
            return f3638d;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m5705b(JSONObject jSONObject, String str, C1748l c1748l) {
        synchronized (f3640f) {
            Integer numM3506a = c1748l.m4789U().m3506a(str);
            if (numM3506a == null) {
                return;
            }
            JsonUtils.putInt(jSONObject, "initialization_status", numM3506a.intValue());
            f3639e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5706b(Object obj) {
        return (obj instanceof AbstractC1482a3) && "APPLOVIN".equals(((AbstractC1482a3) obj).m3215k());
    }

    /* JADX INFO: renamed from: c */
    public static Map m5707c(C1748l c1748l) {
        HashMap map = new HashMap(4);
        String strEmptyIfNull = StringUtils.emptyIfNull(c1748l.m4865y0().m3898e());
        if (!((Boolean) c1748l.m4801a(C1831z4.f3762L3)).booleanValue()) {
            strEmptyIfNull = "";
        }
        map.put("{CUID}", strEmptyIfNull);
        map.put("{PLACEMENT}", "");
        map.put("{CUSTOM_DATA}", "");
        map.put("{CREATIVE_ID}", "");
        return map;
    }

    /* JADX INFO: renamed from: c */
    private static void m5708c(JSONObject jSONObject, String str, C1748l c1748l) {
        synchronized (f3640f) {
            if (StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", ""))) {
                return;
            }
            MaxAdapter maxAdapterM5694a = m5694a(str, c1748l);
            if (maxAdapterM5694a == null) {
                return;
            }
            String strM5697a = m5697a(maxAdapterM5694a);
            if (TextUtils.isEmpty(strM5697a)) {
                return;
            }
            JsonUtils.putString(jSONObject, "sdk_version", strM5697a);
            f3639e.put(str, new MaxMediatedNetworkInfoImpl(jSONObject));
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m5709d(C1748l c1748l) {
        synchronized (f3640f) {
            for (int i = 0; i < f3638d.length(); i++) {
                JSONObject jSONObject = JsonUtils.getJSONObject(f3638d, i, (JSONObject) null);
                String string = JsonUtils.getString(jSONObject, "class", "");
                m5705b(jSONObject, string, c1748l);
                m5708c(jSONObject, string, c1748l);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5710e(C1748l c1748l) {
        JSONArray jSONArrayM5704b = m5704b(c1748l);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayM5704b.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayM5704b, i, (JSONObject) null);
            if (!JsonUtils.getBoolean(jSONObject, "is_supported", Boolean.TRUE).booleanValue()) {
                arrayList.add(JsonUtils.getString(jSONObject, "name", "unknown") + " (" + JsonUtils.getString(jSONObject, "version", "unknown") + ")");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String strJoin = StringUtils.join(", ", arrayList);
        String str = "Please update to the latest adapter versions. Incompatible adapter(s) found: " + strJoin;
        if (AbstractC1701q7.m4092c(c1748l)) {
            throw new IllegalArgumentException(str);
        }
        C1768p.m5167h("MediationUtils", str);
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("details", strJoin, map);
        c1748l.m4764E().m2682d(C1548f2.f1515Z0, map);
    }
}
