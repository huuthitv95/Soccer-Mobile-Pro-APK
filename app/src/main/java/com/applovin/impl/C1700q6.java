package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.q6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1700q6 extends AbstractC1710r6 {

    /* JADX INFO: renamed from: g */
    private final C1539e3 f2658g;

    public C1700q6(C1539e3 c1539e3, C1748l c1748l) {
        super("TaskReportMaxReward", c1748l);
        this.f2658g = c1539e3;
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: a */
    protected void mo3882a(int i) {
        super.mo3882a(i);
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Failed to report reward for mediated ad: " + this.f2658g + " - error code: " + i);
        }
        this.f1969a.m4784R().m2098a(C1548f2.f1567u0, this.f2658g, CollectionUtils.map(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i)));
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: a */
    protected void mo3883a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f2658g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f2658g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f2658g.m3208e());
        String strM2482v0 = this.f2658g.m2482v0();
        if (!StringUtils.isValidString(strM2482v0)) {
            strM2482v0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strM2482v0);
        String strM1817C = this.f2658g.m1817C();
        if (!StringUtils.isValidString(strM1817C)) {
            strM1817C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strM1817C);
    }

    @Override // com.applovin.impl.AbstractC1710r6
    /* JADX INFO: renamed from: b */
    protected void mo3884b(JSONObject jSONObject) {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Reported reward successfully for mediated ad: " + this.f2658g);
        }
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: f */
    protected String mo3885f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.AbstractC1710r6
    /* JADX INFO: renamed from: h */
    protected C1698q4 mo3886h() {
        return this.f2658g.m2478r0();
    }

    @Override // com.applovin.impl.AbstractC1710r6
    /* JADX INFO: renamed from: i */
    protected void mo3887i() {
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "No reward result was found for mediated ad: " + this.f2658g);
        }
    }
}
