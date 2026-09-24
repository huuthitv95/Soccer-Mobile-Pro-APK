package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C9287h {

    /* JADX INFO: renamed from: a */
    public final String f21738a;

    /* JADX INFO: renamed from: b */
    public final EnumC9083a f21739b;

    /* JADX INFO: renamed from: c */
    public final Map f21740c;

    public C9287h(JSONObject jSONObject, EnumC9083a enumC9083a, Map map) {
        try {
            this.f21738a = jSONObject.getJSONObject("ad").optString("markup");
        } catch (JSONException e) {
            IAlog.m21944a("Failed extracting markup", e, new Object[0]);
        }
        this.f21739b = enumC9083a;
        this.f21740c = map;
    }
}
