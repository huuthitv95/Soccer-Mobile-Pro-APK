package com.android.billingclient.api;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class BillingConfig {
    private final String countryCode;
    private final String jsonString;
    private final JSONObject parsedJson;

    BillingConfig(String str) throws JSONException {
        this.jsonString = str;
        JSONObject jSONObject = new JSONObject(str);
        this.parsedJson = jSONObject;
        this.countryCode = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
    }

    public String getCountryCode() {
        return this.countryCode;
    }
}
