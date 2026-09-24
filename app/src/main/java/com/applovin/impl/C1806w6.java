package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.w6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1806w6 extends AbstractC1824y6 {

    /* JADX INFO: renamed from: g */
    private final AbstractC1736b f3524g;

    /* JADX INFO: renamed from: h */
    private final AppLovinAdRewardListener f3525h;

    public C1806w6(AbstractC1736b abstractC1736b, AppLovinAdRewardListener appLovinAdRewardListener, C1748l c1748l) {
        super("TaskValidateAppLovinReward", c1748l);
        this.f3524g = abstractC1736b;
        this.f3525h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: a */
    protected void mo3882a(int i) {
        String str;
        super.mo3882a(i);
        if (i < 400 || i >= 500) {
            this.f3525h.validationRequestFailed(this.f3524g, i);
            str = "network_timeout";
        } else {
            this.f3525h.userRewardRejected(this.f3524g, Collections.EMPTY_MAP);
            str = "rejected";
        }
        this.f3524g.m4521a(C1698q4.m4009a(str));
    }

    @Override // com.applovin.impl.AbstractC1824y6
    /* JADX INFO: renamed from: a */
    protected void mo5552a(C1698q4 c1698q4) {
        this.f3524g.m4521a(c1698q4);
        String strM4012b = c1698q4.m4012b();
        Map<String, String> mapM4011a = c1698q4.m4011a();
        if (strM4012b.equals("accepted")) {
            this.f3525h.userRewardVerified(this.f3524g, mapM4011a);
            return;
        }
        if (strM4012b.equals("quota_exceeded")) {
            this.f3525h.userOverQuota(this.f3524g, mapM4011a);
        } else if (strM4012b.equals("rejected")) {
            this.f3525h.userRewardRejected(this.f3524g, mapM4011a);
        } else {
            this.f3525h.validationRequestFailed(this.f3524g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: a */
    protected void mo3883a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f3524g.getAdZone().m5264e());
        String clCode = this.f3524g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: f */
    public String mo3885f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.AbstractC1824y6
    /* JADX INFO: renamed from: h */
    protected boolean mo5553h() {
        return this.f3524g.m4479E0();
    }
}
