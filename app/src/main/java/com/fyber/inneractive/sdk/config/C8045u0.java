package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.AbstractC9140c1;
import com.fyber.inneractive.sdk.util.InterfaceC9137b1;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.u0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8045u0 implements InterfaceC9137b1 {

    /* JADX INFO: renamed from: a */
    public Integer f17879a = 50;

    /* JADX INFO: renamed from: b */
    public Integer f17880b = 50;

    /* JADX INFO: renamed from: c */
    public Set f17881c = null;

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9137b1
    /* JADX INFO: renamed from: a */
    public final JSONObject mo20439a() {
        JSONObject jSONObject = new JSONObject();
        AbstractC9140c1.m21959a(jSONObject, "pausePct", this.f17879a);
        AbstractC9140c1.m21959a(jSONObject, "playPct", this.f17880b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f17881c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        AbstractC9140c1.m21959a(jSONObject, "vendor", jSONArray);
        return jSONObject;
    }
}
