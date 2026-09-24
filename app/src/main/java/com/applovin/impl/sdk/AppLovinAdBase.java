package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.AbstractC1570h4;
import com.applovin.impl.C1591j5;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1560g4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppLovinAdBase implements InterfaceC1560g4 {
    protected final JSONObject adObject;
    private final long createdAtMillis;
    protected final JSONObject fullResponse;
    protected final C1748l sdk;
    protected final C1591j5 synchronizedAdObject;
    protected final C1591j5 synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    protected AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.sdk = c1748l;
        if (((Boolean) c1748l.m4801a(C1831z4.f3709E6)).booleanValue()) {
            this.synchronizedAdObject = new C1591j5(jSONObject);
            this.synchronizedFullResponse = new C1591j5(jSONObject2);
            this.adObject = null;
            this.fullResponse = null;
        } else {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.synchronizedAdObject = null;
            this.synchronizedFullResponse = null;
        }
        this.createdAtMillis = System.currentTimeMillis();
    }

    protected boolean containsKeyForAdObject(String str) {
        boolean zHas;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m3004a(str);
        }
        synchronized (this.adObjectLock) {
            zHas = this.adObject.has(str);
        }
        return zHas;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    @Override // com.applovin.impl.InterfaceC1560g4
    public abstract /* synthetic */ AbstractC1570h4 getAdEventTracker();

    public abstract long getAdIdNumber();

    protected boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean zBooleanValue;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m2994a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            zBooleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return zBooleanValue;
    }

    protected boolean getBooleanFromFullResponse(String str, boolean z) {
        boolean zBooleanValue;
        C1591j5 c1591j5 = this.synchronizedFullResponse;
        if (c1591j5 != null) {
            return c1591j5.m2994a(str, Boolean.valueOf(z)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            zBooleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z)).booleanValue();
        }
        return zBooleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    protected int getColorFromAdObject(String str, int i) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    protected float getFloatFromAdObject(String str, float f) {
        float f2;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m2991a(str, f);
        }
        synchronized (this.adObjectLock) {
            f2 = JsonUtils.getFloat(this.adObject, str, f);
        }
        return f2;
    }

    protected int getIntFromAdObject(String str, int i) {
        int i2;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m2992a(str, i);
        }
        synchronized (this.adObjectLock) {
            i2 = JsonUtils.getInt(this.adObject, str, i);
        }
        return i2;
    }

    protected List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m2997a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    protected JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m2998a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    protected JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m3000a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    protected long getLongFromAdObject(String str, long j) {
        long j2;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m2993a(str, j);
        }
        synchronized (this.adObjectLock) {
            j2 = JsonUtils.getLong(this.adObject, str, j);
        }
        return j2;
    }

    protected long getLongFromFullResponse(String str, long j) {
        long j2;
        C1591j5 c1591j5 = this.synchronizedFullResponse;
        if (c1591j5 != null) {
            return c1591j5.m2993a(str, j);
        }
        synchronized (this.fullResponseLock) {
            j2 = JsonUtils.getLong(this.fullResponse, str, j);
        }
        return j2;
    }

    @Override // com.applovin.impl.InterfaceC1560g4
    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.InterfaceC1560g4
    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.InterfaceC1560g4
    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public C1748l getSdk() {
        return this.sdk;
    }

    protected String getStringFromAdObject(String str, String str2) {
        String string;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m2996a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    protected String getStringFromFullResponse(String str, String str2) {
        String string;
        C1591j5 c1591j5 = this.synchronizedFullResponse;
        if (c1591j5 != null) {
            return c1591j5.m2996a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    protected List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        C1591j5 c1591j5 = this.synchronizedAdObject;
        if (c1591j5 != null) {
            return c1591j5.m3006b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    @Override // com.applovin.impl.InterfaceC1560g4
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
