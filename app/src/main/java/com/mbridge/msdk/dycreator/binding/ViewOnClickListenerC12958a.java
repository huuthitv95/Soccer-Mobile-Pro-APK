package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.MBCountDownView;
import com.mbridge.msdk.dycreator.baseview.MBLinearLayout;
import com.mbridge.msdk.dycreator.baseview.MBRelativeLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.utils.C12981d;
import com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.a */
/* JADX INFO: compiled from: BindViewClickListener.java */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnClickListenerC12958a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private InterfaceC12986a f35187a;

    public ViewOnClickListenerC12958a(InterfaceC12986a interfaceC12986a) {
        this.f35187a = interfaceC12986a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        BaseStrategy baseStrategyM36326a;
        InterfaceC12986a interfaceC12986a;
        if (view == 0 || !(view instanceof InterBase)) {
            return;
        }
        if (!(view instanceof MBCountDownView) || (interfaceC12986a = this.f35187a) == null || interfaceC12986a.getEffectData() == null || this.f35187a.getEffectData().isCanSkip()) {
            InterfaceC12986a interfaceC12986a2 = this.f35187a;
            if (interfaceC12986a2 != null && (view instanceof MBRelativeLayout) && C12981d.m36408a(view, interfaceC12986a2)) {
                InterfaceC12986a interfaceC12986a3 = this.f35187a;
                if (interfaceC12986a3 instanceof MBSplashData) {
                    MBRelativeLayout mBRelativeLayout = (MBRelativeLayout) view;
                    ((MBSplashData) interfaceC12986a3).setxInScreen(mBRelativeLayout.getxInScreen());
                    ((MBSplashData) this.f35187a).setyInScreen(mBRelativeLayout.getyInScreen());
                    ((MBSplashData) this.f35187a).setClickType(1);
                }
            }
            InterfaceC12986a interfaceC12986a4 = this.f35187a;
            if (interfaceC12986a4 != null && (view instanceof MBLinearLayout) && C12981d.m36408a(view, interfaceC12986a4)) {
                InterfaceC12986a interfaceC12986a5 = this.f35187a;
                if (interfaceC12986a5 instanceof MBSplashData) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) view;
                    ((MBSplashData) interfaceC12986a5).setxInScreen(mBLinearLayout.getxInScreen());
                    ((MBSplashData) this.f35187a).setyInScreen(mBLinearLayout.getyInScreen());
                    ((MBSplashData) this.f35187a).setClickType(0);
                }
            }
            String strategyDes = ((InterBase) view).getStrategyDes();
            if (TextUtils.isEmpty(strategyDes) || (baseStrategyM36326a = C12960c.m36325a().m36326a(strategyDes)) == null) {
                return;
            }
            baseStrategyM36326a.bindClickData(view, this.f35187a);
        }
    }
}
