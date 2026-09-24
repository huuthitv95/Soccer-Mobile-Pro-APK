package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.viewdata.C12985a;
import com.mbridge.msdk.dycreator.viewobserver.C12990c;
import com.mbridge.msdk.dycreator.viewobserver.C12991d;
import com.mbridge.msdk.dycreator.viewobserver.C12993f;
import com.mbridge.msdk.dycreator.viewobserver.C12995h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* JADX INFO: loaded from: classes5.dex */
public class MBRewardViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a */
    private C12991d f35388a;

    /* JADX INFO: renamed from: b */
    private C12990c f35389b;

    /* JADX INFO: renamed from: c */
    private C12993f f35390c;

    /* JADX INFO: renamed from: d */
    private C12995h f35391d;

    /* JADX INFO: renamed from: e */
    private DynamicViewBackListener f35392e;

    /* JADX INFO: renamed from: f */
    private DyOption f35393f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f35393f = dyOption;
        EventBus.getDefault().register(this);
    }

    /* JADX INFO: renamed from: a */
    private void m36423a(Object obj) {
        C12990c c12990c = this.f35389b;
        if (c12990c != null) {
            c12990c.m36434a(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36424b(Object obj) {
        C12991d c12991d = this.f35388a;
        if (c12991d != null) {
            c12991d.m36435a(obj);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m36425c(Object obj) {
        C12993f c12993f = this.f35390c;
        if (c12993f != null) {
            c12993f.m36436a(obj);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m36426d(Object obj) {
        C12995h c12995h = this.f35391d;
        if (c12995h != null) {
            c12995h.m36437a(obj);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        m36422a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(C12990c c12990c) {
        if (c12990c != null) {
            this.f35389b = c12990c;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(C12991d c12991d) {
        if (c12991d != null) {
            this.f35388a = c12991d;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f35392e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(C12993f c12993f) {
        if (c12993f != null) {
            this.f35390c = c12993f;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        C12985a c12985a = new C12985a(this.f35393f);
        m36424b(c12985a);
        m36423a(c12985a);
        m36425c(c12985a);
        m36426d(c12985a);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(C12995h c12995h) {
        if (c12995h != null) {
            this.f35391d = c12995h;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36422a(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f35392e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }
}
