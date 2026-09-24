package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC9140c1;
import com.fyber.inneractive.sdk.util.InterfaceC9137b1;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.l0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8016l0 implements InterfaceC9137b1 {

    /* JADX INFO: renamed from: a */
    public Integer f17797a = null;

    /* JADX INFO: renamed from: b */
    public UnitDisplayType f17798b;

    /* JADX INFO: renamed from: c */
    public Boolean f17799c;

    /* JADX INFO: renamed from: d */
    public Integer f17800d;

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9137b1
    /* JADX INFO: renamed from: a */
    public final JSONObject mo20439a() {
        JSONObject jSONObject = new JSONObject();
        AbstractC9140c1.m21959a(jSONObject, ToolBar.REFRESH, this.f17797a);
        AbstractC9140c1.m21959a(jSONObject, "unitDisplayType", this.f17798b);
        AbstractC9140c1.m21959a(jSONObject, "close", this.f17799c);
        AbstractC9140c1.m21959a(jSONObject, "hideDelay", this.f17800d);
        return jSONObject;
    }
}
