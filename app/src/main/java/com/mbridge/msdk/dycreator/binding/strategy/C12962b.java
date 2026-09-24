package com.mbridge.msdk.dycreator.binding.strategy;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.strategy.b */
/* JADX INFO: compiled from: ClickStrategy.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12962b<T extends View, K> implements BaseStrategy {
    @Override // com.mbridge.msdk.dycreator.binding.base.BaseStrategy
    public void bindClickData(View view, InterfaceC12986a interfaceC12986a) {
        SplashResData splashResData = new SplashResData();
        splashResData.setBaseViewData(interfaceC12986a);
        splashResData.seteAction(EAction.DOWNLOAD);
        EventBus.getDefault().post(splashResData);
    }
}
