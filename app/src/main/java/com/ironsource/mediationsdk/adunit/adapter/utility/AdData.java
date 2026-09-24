package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C12194fa;
import com.ironsource.mediationsdk.C12366o;
import com.ironsource.mediationsdk.IronSource;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AdData {
    private final Map<String, Object> mAdUnitData;
    private final Map<String, Object> mConfiguration;
    private final String mServerData;

    public AdData(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.mServerData = str;
        this.mConfiguration = map;
        this.mAdUnitData = map2;
    }

    public static AdData createAdDataForNetworkAdapter(JSONObject jSONObject, IronSource.EnumC12328a enumC12328a, String str) {
        return createAdDataForNetworkAdapter(jSONObject, enumC12328a, str, null);
    }

    public Map<String, Object> getAdUnitData() {
        return this.mAdUnitData;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.mConfiguration.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.mConfiguration;
    }

    public Integer getInt(String str) {
        return (Integer) this.mConfiguration.get(str);
    }

    public String getServerData() {
        return this.mServerData;
    }

    public String getString(String str) {
        return (String) this.mConfiguration.get(str);
    }

    public static AdData createAdDataForNetworkAdapter(JSONObject jSONObject, IronSource.EnumC12328a enumC12328a, String str, C12366o c12366o) {
        HashMap map = new HashMap();
        map.put("adUnit", enumC12328a);
        if (str != null) {
            map.put("userId", str);
        }
        if (c12366o != null) {
            map.put("bannerSize", c12366o.getSize());
        }
        return new AdData(null, C12194fa.m31478a(jSONObject), map);
    }
}
