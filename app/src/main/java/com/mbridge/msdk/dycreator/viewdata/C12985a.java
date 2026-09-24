package com.mbridge.msdk.dycreator.viewdata;

import com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewdata.a */
/* JADX INFO: compiled from: MBRewardData.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12985a implements InterfaceC12986a {

    /* JADX INFO: renamed from: a */
    private DyOption f35381a;

    /* JADX INFO: renamed from: b */
    private CampaignEx f35382b;

    public C12985a(DyOption dyOption) {
        this.f35381a = dyOption;
        this.f35382b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a
    public CampaignEx getBindData() {
        return this.f35382b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a
    public DyOption getEffectData() {
        return this.f35381a;
    }
}
