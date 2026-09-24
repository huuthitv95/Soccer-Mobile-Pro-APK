package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.remote.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C8039k {

    /* JADX INFO: renamed from: a */
    public Integer f17858a;

    /* JADX INFO: renamed from: b */
    public Integer f17859b;

    /* JADX INFO: renamed from: c */
    public Set f17860c = null;

    /* JADX INFO: renamed from: a */
    public static C8039k m20454a(JSONObject jSONObject) {
        Vendor vendorFromValue;
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("pausePct", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt("playPct", Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        C8039k c8039k = new C8039k();
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        c8039k.f17858a = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        c8039k.f17859b = numValueOf2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("vendor");
        if (jSONArrayOptJSONArray != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i, null);
                if (!TextUtils.isEmpty(strOptString) && (vendorFromValue = Vendor.fromValue(strOptString)) != null) {
                    linkedHashSet.add(vendorFromValue);
                }
            }
            c8039k.f17860c = linkedHashSet;
        }
        return c8039k;
    }
}
