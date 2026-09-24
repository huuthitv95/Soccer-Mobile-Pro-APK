package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.AbstractC9140c1;
import com.fyber.inneractive.sdk.util.InterfaceC9137b1;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.o0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8022o0 implements InterfaceC9137b1 {

    /* JADX INFO: renamed from: a */
    public Set f17806a = null;

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9137b1
    /* JADX INFO: renamed from: a */
    public final JSONObject mo20439a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set set = this.f17806a;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jSONArray.put((Track) it.next());
            }
        }
        AbstractC9140c1.m21959a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
