package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.p6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1683p6 extends AbstractC1710r6 {

    /* JADX INFO: renamed from: g */
    private final AbstractC1736b f2542g;

    public C1683p6(AbstractC1736b abstractC1736b, C1748l c1748l) {
        super("TaskReportAppLovinReward", c1748l);
        this.f2542g = abstractC1736b;
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: a */
    protected void mo3882a(int i) {
        super.mo3882a(i);
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Failed to report reward for ad: " + this.f2542g + " - error code: " + i);
        }
        this.f1969a.m4830g().m2526a(C1548f2.f1478H, this.f2542g, CollectionUtils.map(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i)));
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: a */
    protected void mo3883a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f2542g.getAdZone().m5264e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f2542g.m4499P());
        String clCode = this.f2542g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.AbstractC1710r6
    /* JADX INFO: renamed from: b */
    protected void mo3884b(JSONObject jSONObject) {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Reported reward successfully for ad: " + this.f2542g);
        }
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: f */
    protected String mo3885f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.AbstractC1710r6
    /* JADX INFO: renamed from: h */
    protected C1698q4 mo3886h() {
        return this.f2542g.m4540i();
    }

    @Override // com.applovin.impl.AbstractC1710r6
    /* JADX INFO: renamed from: i */
    protected void mo3887i() {
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "No reward result was found for ad: " + this.f2542g);
        }
    }
}
