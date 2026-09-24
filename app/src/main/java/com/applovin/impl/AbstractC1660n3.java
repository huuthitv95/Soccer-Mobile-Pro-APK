package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.n3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1660n3 extends AbstractC1714s0 {

    /* JADX INFO: renamed from: e */
    private static final String[] f2399e = {AbstractC13068b.JSON_KEY_ADS, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* JADX INFO: renamed from: f */
    private static final String[] f2400f = {AbstractC13068b.JSON_KEY_ADS, "settings", "signal_providers", "ad_unit_signal_providers"};

    /* JADX INFO: renamed from: a */
    public static String m3619a(C1748l c1748l) {
        return AbstractC1714s0.m4310a((String) c1748l.m4801a(AbstractC1776t3.f3367s7), "1.0/mediate", c1748l);
    }

    /* JADX INFO: renamed from: b */
    public static String m3620b(C1748l c1748l) {
        return AbstractC1714s0.m4310a((String) c1748l.m4801a(AbstractC1776t3.f3365r7), "1.0/mediate", c1748l);
    }

    /* JADX INFO: renamed from: d */
    public static void m3621d(JSONObject jSONObject, C1748l c1748l) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            C1709r5.m4205a(jSONObject, c1748l);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3622e(JSONObject jSONObject, C1748l c1748l) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            c1748l.m4823c(C1511b5.f1149G);
            return;
        }
        JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f2400f);
        c1748l.m4818b(C1511b5.f1149G, jSONObjectShallowCopy.toString());
    }

    /* JADX INFO: renamed from: f */
    public static void m3623f(JSONObject jSONObject, C1748l c1748l) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f2399e);
            c1748l.m4818b(C1511b5.f1148F, jSONObjectShallowCopy.toString());
            C1709r5.m4204a(jSONObjectShallowCopy);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3624g(JSONObject jSONObject, C1748l c1748l) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(JsonUtils.getString(jSONArray.getJSONObject(i), "name", null));
                }
                HashSet hashSet2 = new HashSet();
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
                Iterator it = JsonUtils.toList(jSONObject2.names()).iterator();
                while (it.hasNext()) {
                    hashSet2.addAll(JsonUtils.getList(jSONObject2, (String) it.next(), null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                Set differenceSet = CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                C1768p.m5167h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                Set differenceSet2 = CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                C1768p.m5167h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                c1748l.m4764E().m2678a(C1548f2.f1537h1, "signalProvidersMismatch", CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                AbstractC1617m1.m3169a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new Object[0]);
            } catch (JSONException e) {
                C1768p.m5164c("MediationConnectionUtils", "Failed to parse JSON", e);
                c1748l.m4764E().m4329a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e);
                AbstractC1617m1.m3171a((Throwable) e, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m3625h(C1748l c1748l) {
        C1831z4 c1831z4 = AbstractC1776t3.f3322F8;
        return AbstractC1714s0.m4310a((String) c1748l.m4801a(((Boolean) c1748l.m4801a(c1831z4)).booleanValue() ? AbstractC1776t3.f3320E8 : AbstractC1776t3.f3367s7), ((Boolean) c1748l.m4801a(c1831z4)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", c1748l);
    }

    /* JADX INFO: renamed from: i */
    public static String m3626i(C1748l c1748l) {
        C1831z4 c1831z4 = AbstractC1776t3.f3322F8;
        return AbstractC1714s0.m4310a((String) c1748l.m4801a(((Boolean) c1748l.m4801a(c1831z4)).booleanValue() ? AbstractC1776t3.f3318D8 : AbstractC1776t3.f3365r7), ((Boolean) c1748l.m4801a(c1831z4)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", c1748l);
    }
}
