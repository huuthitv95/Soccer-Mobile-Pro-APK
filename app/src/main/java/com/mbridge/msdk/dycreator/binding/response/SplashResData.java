package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a;

/* JADX INFO: loaded from: classes5.dex */
public class SplashResData extends BaseRespData {

    /* JADX INFO: renamed from: a */
    private InterfaceC12986a f35217a;

    /* JADX INFO: renamed from: b */
    private EAction f35218b;

    public InterfaceC12986a getBaseViewData() {
        return this.f35217a;
    }

    public EAction geteAction() {
        return this.f35218b;
    }

    public void setBaseViewData(InterfaceC12986a interfaceC12986a) {
        this.f35217a = interfaceC12986a;
    }

    public void seteAction(EAction eAction) {
        this.f35218b = eAction;
    }
}
