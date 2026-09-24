package com.fyber.inneractive.sdk.serverapi.extradata;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.serverapi.extradata.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C9117b implements InterfaceC9118c {
    @Override // com.fyber.inneractive.sdk.serverapi.extradata.InterfaceC9118c
    /* JADX INFO: renamed from: a */
    public final void mo21924a(String str, String str2, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        jSONObject.put("value", str2);
        ((JSONArray) obj).put(jSONObject);
    }

    @Override // com.fyber.inneractive.sdk.serverapi.extradata.InterfaceC9118c
    /* JADX INFO: renamed from: a */
    public final boolean mo21925a(Object obj) {
        return ((JSONArray) obj).length() == 0;
    }
}
