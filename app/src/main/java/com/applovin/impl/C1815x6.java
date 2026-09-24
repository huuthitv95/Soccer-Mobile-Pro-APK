package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.x6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1815x6 extends AbstractC1824y6 {

    /* JADX INFO: renamed from: g */
    private final C1539e3 f3564g;

    public C1815x6(C1539e3 c1539e3, C1748l c1748l) {
        super("TaskValidateMaxReward", c1748l);
        this.f3564g = c1539e3;
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: a */
    protected void mo3882a(int i) {
        super.mo3882a(i);
        String str = (i < 400 || i >= 500) ? "network_timeout" : "rejected";
        this.f3564g.m2471a(C1698q4.m4009a(str));
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
        mapHashMap.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i));
        this.f1969a.m4784R().m2098a(C1548f2.f1569v0, this.f3564g, mapHashMap);
    }

    @Override // com.applovin.impl.AbstractC1824y6
    /* JADX INFO: renamed from: a */
    protected void mo5552a(C1698q4 c1698q4) {
        this.f3564g.m2471a(c1698q4);
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: a */
    protected void mo3883a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f3564g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f3564g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f3564g.m3208e());
        JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, this.f3564g.getFormat().getLabel());
        String strM2482v0 = this.f3564g.m2482v0();
        if (!StringUtils.isValidString(strM2482v0)) {
            strM2482v0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strM2482v0);
        String strM1817C = this.f3564g.m1817C();
        if (!StringUtils.isValidString(strM1817C)) {
            strM1817C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strM1817C);
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: f */
    protected String mo3885f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.AbstractC1824y6
    /* JADX INFO: renamed from: h */
    protected boolean mo5553h() {
        return this.f3564g.m2466A0();
    }
}
