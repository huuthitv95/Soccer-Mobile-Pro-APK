package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.g3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1559g3 implements Comparable, AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: A */
    private final List f1660A;

    /* JADX INFO: renamed from: B */
    private final List f1661B;

    /* JADX INFO: renamed from: C */
    private final List f1662C;

    /* JADX INFO: renamed from: D */
    private final List f1663D;

    /* JADX INFO: renamed from: E */
    private final Map f1664E;

    /* JADX INFO: renamed from: F */
    private final boolean f1665F;

    /* JADX INFO: renamed from: G */
    private final C1533d7 f1666G;

    /* JADX INFO: renamed from: H */
    private final boolean f1667H;

    /* JADX INFO: renamed from: I */
    private final String f1668I;

    /* JADX INFO: renamed from: J */
    private final Map f1669J;

    /* JADX INFO: renamed from: a */
    private final C1748l f1670a;

    /* JADX INFO: renamed from: b */
    private final a f1671b;

    /* JADX INFO: renamed from: c */
    private int f1672c;

    /* JADX INFO: renamed from: d */
    private final boolean f1673d;

    /* JADX INFO: renamed from: e */
    private final boolean f1674e;

    /* JADX INFO: renamed from: f */
    private final boolean f1675f;

    /* JADX INFO: renamed from: g */
    private final boolean f1676g;

    /* JADX INFO: renamed from: h */
    private boolean f1677h;

    /* JADX INFO: renamed from: i */
    private final boolean f1678i;

    /* JADX INFO: renamed from: j */
    private final boolean f1679j;

    /* JADX INFO: renamed from: k */
    private final boolean f1680k;

    /* JADX INFO: renamed from: l */
    private final boolean f1681l;

    /* JADX INFO: renamed from: m */
    private final boolean f1682m;

    /* JADX INFO: renamed from: n */
    private final boolean f1683n;

    /* JADX INFO: renamed from: o */
    private final boolean f1684o;

    /* JADX INFO: renamed from: p */
    private final String f1685p;

    /* JADX INFO: renamed from: q */
    private final String f1686q;

    /* JADX INFO: renamed from: r */
    private String f1687r;

    /* JADX INFO: renamed from: s */
    private String f1688s;

    /* JADX INFO: renamed from: t */
    private final String f1689t;

    /* JADX INFO: renamed from: u */
    private final String f1690u;

    /* JADX INFO: renamed from: v */
    private final String f1691v;

    /* JADX INFO: renamed from: w */
    private final String f1692w;

    /* JADX INFO: renamed from: x */
    private final int f1693x;

    /* JADX INFO: renamed from: y */
    private final List f1694y;

    /* JADX INFO: renamed from: z */
    private final List f1695z;

    /* JADX INFO: renamed from: com.applovin.impl.g3$a */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a */
        private final String f1701a;

        a(String str) {
            this.f1701a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public String m2726b() {
            return this.f1701a;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.g3$b */
    public enum b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a */
        private final String f1708a;

        /* JADX INFO: renamed from: b */
        private final int f1709b;

        /* JADX INFO: renamed from: c */
        private final String f1710c;

        b(String str, int i, String str2) {
            this.f1708a = str;
            this.f1709b = i;
            this.f1710c = str2;
        }

        /* JADX INFO: renamed from: b */
        public String m2728b() {
            return this.f1710c;
        }

        /* JADX INFO: renamed from: c */
        public String m2729c() {
            return this.f1708a;
        }

        /* JADX INFO: renamed from: d */
        public int m2730d() {
            return this.f1709b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0257  */
    /* JADX WARN: Code duplicated, block: B:76:0x0269  */
    /* JADX WARN: Code duplicated, block: B:77:0x0275  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c5  */
    /* JADX WARN: Multi-variable type inference failed */
    public C1559g3(JSONObject jSONObject, C1748l c1748l) {
        char c;
        String adapterVersion;
        String strM5697a;
        boolean zEquals;
        boolean zIsBeta;
        String str;
        boolean z;
        boolean z2;
        int iLastIndexOf;
        String lowerCase;
        Integer numM3506a;
        JSONObject jSONObject2;
        String string;
        String string2;
        boolean z3;
        this.f1670a = c1748l;
        String string3 = JsonUtils.getString(jSONObject, "name", "");
        this.f1685p = string3;
        this.f1686q = JsonUtils.getString(jSONObject, "display_name", "");
        this.f1687r = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.f1690u = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.f1661B = m2685a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.f1680k = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "configuration", new JSONObject());
        this.f1695z = m2686a(jSONObject3, c1748l);
        this.f1684o = JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.f1665F = JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.f1683n = JsonUtils.getBoolean(jSONObject3, "check_sdk_adapter_version_mismatch", Boolean.TRUE).booleanValue();
        this.f1662C = JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "test_mode", new JSONObject());
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "network_names", (JSONObject) null);
        if (jSONObject5 == null || jSONObject5.length() <= 0) {
            this.f1663D = Arrays.asList(string3);
            this.f1664E = null;
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(string3));
            HashMap map = new HashMap(jSONObject5.length());
            Iterator<String> itKeys = jSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                MaxAdFormat fromString = MaxAdFormat.formatFromString(next);
                String string4 = JsonUtils.getString(jSONObject5, next, null);
                if (fromString != null && !TextUtils.isEmpty(string4)) {
                    arrayList.add(string4);
                    map.put(fromString, string4);
                }
            }
            this.f1663D = arrayList;
            this.f1664E = map;
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        Boolean bool2 = Boolean.TRUE;
        this.f1678i = JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.f1679j = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.f1691v = JsonUtils.getString(jSONObject6, "message", null);
        this.f1666G = new C1533d7(JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.f1686q);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f1673d = AbstractC1701q7.m4069a(list);
        } else {
            this.f1673d = AbstractC1701q7.m4066a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List listM2684a = Collections.EMPTY_LIST;
        String str2 = this.f1687r;
        String string5 = JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string5 != null) {
            this.f1687r = string5;
        }
        MaxAdapter maxAdapterM5694a = AbstractC1821y3.m5694a(str2, c1748l);
        if (maxAdapterM5694a != null) {
            this.f1674e = true;
            try {
                adapterVersion = maxAdapterM5694a.getAdapterVersion();
                try {
                    strM5697a = AbstractC1821y3.m5697a(maxAdapterM5694a);
                    c = 1;
                    try {
                        this.f1677h = AbstractC1821y3.m5700a(maxAdapterM5694a, this.f1687r);
                        listM2684a = m2684a(maxAdapterM5694a, JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                        JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (JSONObject) null);
                        if (jSONObject7 != null) {
                            String string6 = JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                            z = string6 == null || AbstractC1701q7.m4018a(adapterVersion, string6) >= 0;
                            try {
                                string2 = JsonUtils.getString(jSONObject7, "network_name", null);
                            } catch (Throwable th) {
                                th = th;
                                string2 = null;
                                C1768p.m5167h("MediatedNetwork", "Failed to load adapter for network " + this.f1685p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                str = string2;
                                zIsBeta = false;
                                Class<?> cls = Class.forName(this.f1687r);
                                z3 = false;
                                try {
                                    Class<?>[] clsArr = new Class[3];
                                    clsArr[0] = MaxAdapterResponseParameters.class;
                                    clsArr[c] = Activity.class;
                                    clsArr[2] = MaxNativeAdAdapterListener.class;
                                    zEquals = cls.getMethod("loadNativeAd", clsArr).getDeclaringClass().equals(cls);
                                } catch (Throwable th2) {
                                    th = th2;
                                    c1748l.m4782Q();
                                    if (C1768p.m5160a()) {
                                        c1748l.m4782Q().m5172a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th);
                                    }
                                    zEquals = z3;
                                }
                                this.f1689t = adapterVersion;
                                this.f1688s = strM5697a;
                                this.f1694y = listM2684a;
                                this.f1681l = zEquals;
                                this.f1682m = z;
                                this.f1692w = str;
                                this.f1660A = m2687a(jSONObject3, adapterVersion, c1748l);
                                this.f1676g = AbstractC1701q7.m4066a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                this.f1671b = m2683a();
                                if (adapterVersion.equals(this.f1690u)) {
                                    z2 = 0;
                                } else {
                                    z2 = 0;
                                }
                                this.f1675f = z2;
                                Context contextM4756p = C1748l.m4756p();
                                iLastIndexOf = this.f1685p.lastIndexOf("_");
                                if (iLastIndexOf != -1) {
                                    lowerCase = this.f1685p.toLowerCase().substring(0, iLastIndexOf);
                                } else {
                                    lowerCase = this.f1685p.toLowerCase();
                                }
                                this.f1693x = contextM4756p.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextM4756p.getPackageName());
                                this.f1672c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                AppLovinCommunicator.getInstance(contextM4756p).subscribe(this, "adapter_initialization_status");
                                numM3506a = c1748l.m4789U().m3506a(this.f1687r);
                                if (numM3506a != null) {
                                    this.f1672c = numM3506a.intValue();
                                }
                                jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                if (jSONObject2 != null) {
                                }
                                this.f1667H = false;
                                this.f1668I = null;
                                this.f1669J = null;
                                return;
                            }
                        } else {
                            string2 = null;
                            z = false;
                        }
                        try {
                            str = string2;
                            zIsBeta = maxAdapterM5694a.isBeta();
                        } catch (Throwable th3) {
                            th = th3;
                            C1768p.m5167h("MediatedNetwork", "Failed to load adapter for network " + this.f1685p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                            str = string2;
                            zIsBeta = false;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        string2 = null;
                        z = false;
                        C1768p.m5167h("MediatedNetwork", "Failed to load adapter for network " + this.f1685p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                        str = string2;
                        zIsBeta = false;
                        Class<?> cls2 = Class.forName(this.f1687r);
                        z3 = false;
                        Class<?>[] clsArr2 = new Class[3];
                        clsArr2[0] = MaxAdapterResponseParameters.class;
                        clsArr2[c] = Activity.class;
                        clsArr2[2] = MaxNativeAdAdapterListener.class;
                        zEquals = cls2.getMethod("loadNativeAd", clsArr2).getDeclaringClass().equals(cls2);
                        this.f1689t = adapterVersion;
                        this.f1688s = strM5697a;
                        this.f1694y = listM2684a;
                        this.f1681l = zEquals;
                        this.f1682m = z;
                        this.f1692w = str;
                        this.f1660A = m2687a(jSONObject3, adapterVersion, c1748l);
                        this.f1676g = AbstractC1701q7.m4066a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                        this.f1671b = m2683a();
                        if (adapterVersion.equals(this.f1690u)) {
                            z2 = 0;
                        } else {
                            z2 = 0;
                        }
                        this.f1675f = z2;
                        Context contextM4756p2 = C1748l.m4756p();
                        iLastIndexOf = this.f1685p.lastIndexOf("_");
                        if (iLastIndexOf != -1) {
                            lowerCase = this.f1685p.toLowerCase().substring(0, iLastIndexOf);
                        } else {
                            lowerCase = this.f1685p.toLowerCase();
                        }
                        this.f1693x = contextM4756p2.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextM4756p2.getPackageName());
                        this.f1672c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                        AppLovinCommunicator.getInstance(contextM4756p2).subscribe(this, "adapter_initialization_status");
                        numM3506a = c1748l.m4789U().m3506a(this.f1687r);
                        if (numM3506a != null) {
                            this.f1672c = numM3506a.intValue();
                        }
                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                        if (jSONObject2 != null) {
                        }
                        this.f1667H = false;
                        this.f1668I = null;
                        this.f1669J = null;
                        return;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c = 1;
                    strM5697a = "";
                }
            } catch (Throwable th6) {
                th = th6;
                c = 1;
                adapterVersion = "";
                strM5697a = adapterVersion;
            }
            try {
                Class<?> cls3 = Class.forName(this.f1687r);
                z3 = false;
                Class<?>[] clsArr3 = new Class[3];
                clsArr3[0] = MaxAdapterResponseParameters.class;
                clsArr3[c] = Activity.class;
                clsArr3[2] = MaxNativeAdAdapterListener.class;
                zEquals = cls3.getMethod("loadNativeAd", clsArr3).getDeclaringClass().equals(cls3);
            } catch (Throwable th7) {
                th = th7;
                z3 = false;
            }
        } else {
            c = 1;
            this.f1674e = false;
            adapterVersion = "";
            strM5697a = adapterVersion;
            zEquals = false;
            zIsBeta = false;
            str = null;
            z = false;
        }
        this.f1689t = adapterVersion;
        this.f1688s = strM5697a;
        this.f1694y = listM2684a;
        this.f1681l = zEquals;
        this.f1682m = z;
        this.f1692w = str;
        this.f1660A = m2687a(jSONObject3, adapterVersion, c1748l);
        this.f1676g = AbstractC1701q7.m4066a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.f1671b = m2683a();
        if (adapterVersion.equals(this.f1690u) || zIsBeta) {
            z2 = 0;
        } else {
            z2 = c;
        }
        this.f1675f = z2;
        Context contextM4756p3 = C1748l.m4756p();
        iLastIndexOf = this.f1685p.lastIndexOf("_");
        if (iLastIndexOf != -1) {
            lowerCase = this.f1685p.toLowerCase().substring(0, iLastIndexOf);
        } else {
            lowerCase = this.f1685p.toLowerCase();
        }
        this.f1693x = contextM4756p3.getResources().getIdentifier("applovin_ic_mediation_" + lowerCase, "drawable", contextM4756p3.getPackageName());
        this.f1672c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(contextM4756p3).subscribe(this, "adapter_initialization_status");
        numM3506a = c1748l.m4789U().m3506a(this.f1687r);
        if (numM3506a != null) {
            this.f1672c = numM3506a.intValue();
        }
        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
        if (jSONObject2 != null || !this.f1673d) {
            this.f1667H = false;
            this.f1668I = null;
            this.f1669J = null;
            return;
        }
        this.f1667H = c;
        this.f1668I = JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
        JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new JSONObject());
        HashMap map2 = new HashMap(jSONObject8.length());
        Iterator<String> itKeys2 = jSONObject8.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            MaxAdFormat fromString2 = MaxAdFormat.formatFromString(next2);
            JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONObject8, next2, (JSONObject) null);
            if (fromString2 != null && jSONObject9 != null && (string = JsonUtils.getString(jSONObject9, "uuid", null)) != null) {
                map2.put(fromString2, new C1808x(string, jSONObject9, fromString2));
            }
        }
        this.f1669J = map2;
    }

    /* JADX INFO: renamed from: a */
    private a m2683a() {
        a aVar;
        if (!this.f1673d) {
            aVar = this.f1674e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        } else if (this.f1674e) {
            aVar = a.COMPLETE;
        } else {
            aVar = this.f1676g ? a.MISSING : a.INCOMPLETE_INTEGRATION;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f1695z.iterator();
        while (it.hasNext()) {
            if (!((C1708r4) it.next()).m4200c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.f1660A.iterator();
        while (it2.hasNext()) {
            if (!((C1607l1) it2.next()).m3116c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        if (!this.f1684o || C1748l.m4716H0()) {
            return m2692E() ? a.INCOMPLETE_INTEGRATION : aVar;
        }
        return a.INVALID_INTEGRATION;
    }

    /* JADX INFO: renamed from: a */
    private List m2684a(MaxAdapter maxAdapter, boolean z) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private List m2685a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    /* JADX INFO: renamed from: a */
    private List m2686a(JSONObject jSONObject, C1748l c1748l) {
        ArrayList arrayList = new ArrayList();
        if (this.f1687r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            C1708r4 c1708r4 = new C1708r4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", C1748l.m4756p());
            if (c1708r4.m4200c()) {
                arrayList.add(c1708r4);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new C1708r4(next, jSONObject2.getString(next), C1748l.m4756p()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private List m2687a(JSONObject jSONObject, String str, C1748l c1748l) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1607l1(jSONObject2, c1748l));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && C1607l1.m3113a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new C1607l1(jSONObject3, c1748l));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public boolean m2688A() {
        return this.f1675f;
    }

    /* JADX INFO: renamed from: B */
    public boolean m2689B() {
        return this.f1677h;
    }

    /* JADX INFO: renamed from: C */
    public boolean m2690C() {
        return this.f1667H;
    }

    /* JADX INFO: renamed from: D */
    public boolean m2691D() {
        return this.f1684o;
    }

    /* JADX INFO: renamed from: E */
    public boolean m2692E() {
        if (!this.f1683n || !StringUtils.isValidString(this.f1688s)) {
            return false;
        }
        return !AbstractC1701q7.m4097d(this.f1688s).equals(AbstractC1701q7.m4034a(this.f1689t, this.f1688s.split("\\.").length));
    }

    /* JADX INFO: renamed from: F */
    public boolean m2693F() {
        return this.f1673d;
    }

    /* JADX INFO: renamed from: G */
    public boolean m2694G() {
        return this.f1671b == a.MISSING && this.f1680k;
    }

    /* JADX INFO: renamed from: H */
    public boolean m2695H() {
        return this.f1665F;
    }

    /* JADX INFO: renamed from: I */
    public boolean m2696I() {
        return this.f1681l;
    }

    /* JADX INFO: renamed from: J */
    public boolean m2697J() {
        return this.f1682m;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1559g3 c1559g3) {
        return this.f1686q.compareToIgnoreCase(c1559g3.f1686q);
    }

    /* JADX INFO: renamed from: b */
    public String m2699b() {
        return this.f1687r;
    }

    /* JADX INFO: renamed from: c */
    public String m2700c() {
        return this.f1689t;
    }

    /* JADX INFO: renamed from: d */
    public Map m2701d() {
        return this.f1669J;
    }

    /* JADX INFO: renamed from: e */
    public String m2702e() {
        return this.f1668I;
    }

    /* JADX INFO: renamed from: f */
    public List m2703f() {
        return this.f1660A;
    }

    /* JADX INFO: renamed from: g */
    public String m2704g() {
        return this.f1686q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* JADX INFO: renamed from: h */
    public int m2705h() {
        return this.f1693x;
    }

    /* JADX INFO: renamed from: i */
    public int m2706i() {
        return this.f1672c;
    }

    /* JADX INFO: renamed from: j */
    public final String m2707j() {
        StringBuilder sb = new StringBuilder("\n---------- ");
        sb.append(this.f1685p);
        sb.append(" ----------\nStatus  - ");
        sb.append(this.f1671b.m2726b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f1673d || TextUtils.isEmpty(this.f1688s)) ? "UNAVAILABLE" : this.f1688s);
        sb.append("\nAdapter - ");
        if (this.f1674e && !TextUtils.isEmpty(this.f1689t)) {
            str = this.f1689t;
        }
        sb.append(str);
        for (C1708r4 c1708r4 : m2711n()) {
            if (!c1708r4.m4200c()) {
                sb.append("\n* MISSING ");
                sb.append(c1708r4.m4199b());
                sb.append(": ");
                sb.append(c1708r4.m4198a());
            }
        }
        for (C1607l1 c1607l1 : m2703f()) {
            if (!c1607l1.m3116c()) {
                sb.append("\n* MISSING ");
                sb.append(c1607l1.m3115b());
                sb.append(": ");
                sb.append(c1607l1.m3114a());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public String m2708k() {
        return this.f1690u;
    }

    /* JADX INFO: renamed from: l */
    public List m2709l() {
        return this.f1662C;
    }

    /* JADX INFO: renamed from: m */
    public String m2710m() {
        return this.f1685p;
    }

    /* JADX INFO: renamed from: n */
    public List m2711n() {
        return this.f1695z;
    }

    /* JADX INFO: renamed from: o */
    public final C1748l m2712o() {
        return this.f1670a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f1687r.equals(string)) {
            this.f1672c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterM5694a = AbstractC1821y3.m5694a(string, this.f1670a);
            if (maxAdapterM5694a != null) {
                String strM5697a = AbstractC1821y3.m5697a(maxAdapterM5694a);
                if (this.f1688s.equals(strM5697a)) {
                    return;
                }
                this.f1688s = strM5697a;
                this.f1670a.m4856u().m4705a(this.f1688s, string);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public String m2713p() {
        return this.f1688s;
    }

    /* JADX INFO: renamed from: q */
    public a m2714q() {
        return this.f1671b;
    }

    /* JADX INFO: renamed from: r */
    public List m2715r() {
        return this.f1694y;
    }

    /* JADX INFO: renamed from: s */
    public List m2716s() {
        return this.f1661B;
    }

    /* JADX INFO: renamed from: t */
    public C1533d7 m2717t() {
        return this.f1666G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f1685p + ", displayName=" + this.f1686q + ", sdkAvailable=" + this.f1673d + ", sdkVersion=" + this.f1688s + ", adapterAvailable=" + this.f1674e + ", adapterVersion=" + this.f1689t + "}";
    }

    /* JADX INFO: renamed from: u */
    public List m2718u() {
        return this.f1663D;
    }

    /* JADX INFO: renamed from: v */
    public String m2719v() {
        return this.f1691v;
    }

    /* JADX INFO: renamed from: w */
    public String m2720w() {
        return this.f1692w;
    }

    /* JADX INFO: renamed from: x */
    public Map m2721x() {
        return this.f1664E;
    }

    /* JADX INFO: renamed from: y */
    public b m2722y() {
        if (!this.f1678i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f1671b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !m2693F() || !m2723z())) {
            return b.INVALID_INTEGRATION;
        }
        if (this.f1670a.m4857u0().m2928c()) {
            return (this.f1679j && (this.f1672c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f1672c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY;
        }
        return b.DISABLED;
    }

    /* JADX INFO: renamed from: z */
    public boolean m2723z() {
        return this.f1674e;
    }
}
