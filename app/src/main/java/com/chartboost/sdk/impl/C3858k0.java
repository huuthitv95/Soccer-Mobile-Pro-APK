package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3858k0 {

    /* JADX INFO: renamed from: a */
    public final C3768g2 f14999a;

    /* JADX INFO: renamed from: b */
    public String f15000b;

    /* JADX INFO: renamed from: c */
    public int f15001c;

    /* JADX INFO: renamed from: d */
    public String f15002d;

    /* JADX INFO: renamed from: e */
    public String f15003e;

    /* JADX INFO: renamed from: f */
    public String f15004f;

    public C3858k0(C3768g2 base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f14999a = base64Wrapper;
        this.f15000b = "";
        this.f15002d = "";
        this.f15003e = "";
        this.f15004f = "";
    }

    /* JADX INFO: renamed from: a */
    public final C3651b0 m18310a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            throw new JSONException("Missing response");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject(C11744X3.i.f26336K);
        JSONArray jSONArray = jSONObject2.getJSONArray(MessengerShareContentUtility.ELEMENTS);
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        m18313a(jSONArray, linkedHashMap, linkedHashMap2);
        String string = jSONObject2.getString("template");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString = jSONObject.optString("name");
        String string2 = jSONObject.getString("ad_id");
        String str = this.f15003e;
        String strOptString2 = jSONObject.optString("baseurl");
        C4113va c4113vaM18315c = m18315c(jSONObject.optJSONObject("infoicon"));
        String string3 = jSONObject.getString("cgn");
        String string4 = jSONObject.getString("creative");
        String strOptString3 = jSONObject.optString("media-type");
        String str2 = this.f15000b;
        String strM18463a = AbstractC3881l0.m18463a(str2);
        String string5 = jSONObject.getString("link");
        String strOptString4 = jSONObject.optString("deep-link");
        String string6 = jSONObject.getString("to");
        int i = this.f15001c;
        String str3 = this.f15002d;
        C4038s1 c4038s1 = (C4038s1) linkedHashMap.get("body");
        if (c4038s1 == null) {
            throw new IllegalStateException("WebView AdUnit does not have a template html body asset".toString());
        }
        EnumC4184yf enumC4184yfM20060a = EnumC4184yf.f17052c.m20060a(jSONObject.optString("renderingengine"));
        List listM18311a = m18311a(jSONObject.optJSONArray("scripts"));
        Map mapM18314b = m18314b(jSONObject.optJSONObject("events"));
        EnumC3709dc enumC3709dcM18462a = AbstractC3881l0.m18462a(jSONObject.optInt("mtype"));
        EnumC3816i4 enumC3816i4M17959a = EnumC3816i4.f14553c.m17959a(jSONObject.optInt("clkp"));
        String str4 = this.f15004f;
        Intrinsics.checkNotNull(strOptString);
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNull(strOptString2);
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string4);
        Intrinsics.checkNotNull(strOptString3);
        Intrinsics.checkNotNull(string5);
        Intrinsics.checkNotNull(strOptString4);
        Intrinsics.checkNotNull(string6);
        return new C3651b0(strOptString, string2, strOptString2, str, c4113vaM18315c, string3, string4, strOptString3, linkedHashMap, str2, strM18463a, string5, strOptString4, string6, i, str3, string, c4038s1, linkedHashMap2, enumC4184yfM20060a, listM18311a, mapM18314b, null, null, enumC3709dcM18462a, enumC3816i4M17959a, str4, 12582912, null);
    }

    /* JADX INFO: renamed from: a */
    public final List m18311a(JSONArray jSONArray) {
        List listAsList;
        return (jSONArray == null || (listAsList = AbstractC3912m8.asList(jSONArray)) == null) ? CollectionsKt.emptyList() : listAsList;
    }

    /* JADX INFO: renamed from: a */
    public final void m18312a(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        this.f15001c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m18313a(JSONArray jSONArray, Map map, Map map2) throws JSONException {
        for (JSONObject jSONObject : AbstractC3912m8.asList(jSONArray)) {
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("value");
            String strOptString = jSONObject.optString("param");
            if (string2 != null) {
                int iHashCode = string2.hashCode();
                if (iHashCode != -1333900842) {
                    if (iHashCode == 3213227) {
                        if (string2.equals("html")) {
                            Intrinsics.checkNotNull(strOptString);
                            if (strOptString.length() == 0) {
                                strOptString = "body";
                            }
                        }
                        Intrinsics.checkNotNull(strOptString);
                        map.put(strOptString, new C4038s1(string2, string, string3));
                    } else if (iHashCode == 106436749 && string2.equals("param")) {
                        Intrinsics.checkNotNull(strOptString);
                        Intrinsics.checkNotNull(string3);
                        map2.put(strOptString, string3);
                        if (string != null) {
                            int iHashCode2 = string.hashCode();
                            if (iHashCode2 != -1422292723) {
                                if (iHashCode2 != -1389119727) {
                                    if (iHashCode2 != -878282975) {
                                        if (iHashCode2 == -315925656 && string.equals(CampaignEx.JSON_KEY_REWARD_AMOUNT)) {
                                            m18312a(string3);
                                        }
                                    } else if (string.equals("reward_currency")) {
                                        this.f15002d = string3;
                                    }
                                } else if (string.equals("impression_id")) {
                                    this.f15003e = string3;
                                }
                            } else if (string.equals("adm.js")) {
                                this.f15004f = this.f14999a.m17751b(string3);
                            }
                        }
                    }
                } else if (string2.equals("preCachedVideo")) {
                    Intrinsics.checkNotNull(string3);
                    this.f15000b = string3;
                }
            }
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() == 0) {
                strOptString = string;
            }
            Intrinsics.checkNotNull(strOptString);
            map.put(strOptString, new C4038s1(string2, string, string3));
        }
    }

    /* JADX INFO: renamed from: b */
    public final Map m18314b(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys;
        HashMap map = new HashMap();
        if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    arrayList.add(string);
                }
                Intrinsics.checkNotNull(next);
                map.put(next, arrayList);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final C4113va m18315c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new C4113va(null, null, null, null, null, null, 63, null);
        }
        String strOptString = jSONObject.optString("imageurl");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("clickthroughUrl");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        return new C4113va(strOptString, strOptString2, C4113va.b.f16585c.m19692a(jSONObject.optInt(C11744X3.i.f26338L)), m18316d(jSONObject.optJSONObject("margin")), m18316d(jSONObject.optJSONObject("padding")), m18316d(jSONObject.optJSONObject("size")));
    }

    /* JADX INFO: renamed from: d */
    public final C4113va.a m18316d(JSONObject jSONObject) {
        return jSONObject != null ? new C4113va.a(jSONObject.optDouble("w"), jSONObject.optDouble(CmcdData.Factory.STREAMING_FORMAT_HLS)) : new C4113va.a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 3, null);
    }
}
