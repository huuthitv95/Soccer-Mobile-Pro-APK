package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C12305ld;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.k8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1604k8 {

    /* JADX INFO: renamed from: a */
    private final C1802w2 f1981a;

    /* JADX INFO: renamed from: b */
    private final C1520c4 f1982b;

    /* JADX INFO: renamed from: c */
    private final List f1983c;

    public C1604k8(JSONObject jSONObject, MaxAdFormat maxAdFormat, C1559g3 c1559g3, C1748l c1748l) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f1982b = new C1520c4(jSONObject2, c1748l);
        } else {
            this.f1982b = null;
        }
        this.f1981a = new C1802w2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, c1559g3);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, C12305ld.f30863c, new JSONArray());
        this.f1983c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f1983c.add(new C1520c4(jSONObject3, c1748l));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C1520c4 m3096a() {
        return this.f1982b;
    }

    /* JADX INFO: renamed from: b */
    public C1802w2 m3097b() {
        return this.f1981a;
    }

    /* JADX INFO: renamed from: c */
    public List m3098c() {
        return this.f1983c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3099d() {
        return this.f1982b != null;
    }
}
