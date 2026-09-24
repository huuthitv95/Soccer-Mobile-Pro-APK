package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.viewobserver.C12990c;
import com.mbridge.msdk.dycreator.viewobserver.C12991d;
import com.mbridge.msdk.dycreator.viewobserver.C12993f;
import com.mbridge.msdk.dycreator.viewobserver.C12995h;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* JADX INFO: loaded from: classes5.dex */
public class MBCommonViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a */
    private C12991d f35383a;

    /* JADX INFO: renamed from: b */
    private C12990c f35384b;

    /* JADX INFO: renamed from: c */
    private C12993f f35385c;

    /* JADX INFO: renamed from: d */
    private C12995h f35386d;

    /* JADX INFO: renamed from: e */
    private DynamicViewBackListener f35387e;

    public MBCommonViewVModel() {
        EventBus.getDefault().register(this);
    }

    /* JADX INFO: renamed from: a */
    private void m36421a(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f35387e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        m36421a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(C12990c c12990c) {
        if (c12990c != null) {
            this.f35384b = c12990c;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(C12991d c12991d) {
        if (c12991d != null) {
            this.f35383a = c12991d;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f35387e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(C12993f c12993f) {
        if (c12993f != null) {
            this.f35385c = c12993f;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(C12995h c12995h) {
        if (c12995h != null) {
            this.f35386d = c12995h;
        }
    }
}
