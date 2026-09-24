package com.mbridge.msdk.dycreator.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.dycreator.binding.C12959b;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewobserver.C12990c;
import com.mbridge.msdk.dycreator.viewobserver.C12991d;
import com.mbridge.msdk.dycreator.viewobserver.C12993f;
import com.mbridge.msdk.dycreator.viewobserver.C12995h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;

/* JADX INFO: loaded from: classes5.dex */
public class MBSplashViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a */
    private C12991d f35394a;

    /* JADX INFO: renamed from: b */
    private C12990c f35395b;

    /* JADX INFO: renamed from: c */
    private C12993f f35396c;

    /* JADX INFO: renamed from: d */
    private C12995h f35397d;

    /* JADX INFO: renamed from: e */
    private DynamicViewBackListener f35398e;

    /* JADX INFO: renamed from: f */
    private DyOption f35399f;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1 */
    static /* synthetic */ class C129871 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f35400a;

        static {
            int[] iArr = new int[EAction.values().length];
            f35400a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35400a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBSplashViewVModel(DyOption dyOption) {
        this.f35399f = dyOption;
        String campaignUnitId = (dyOption == null || dyOption.getCampaignEx() == null) ? "" : dyOption.getCampaignEx().getCampaignUnitId();
        if (TextUtils.isEmpty(campaignUnitId)) {
            EventBus.getDefault().register(this);
        } else {
            EventBus.getDefault().register(campaignUnitId, this);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36428a(Object obj) {
        C12990c c12990c = this.f35395b;
        if (c12990c != null) {
            c12990c.m36434a(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36430b(Object obj) {
        C12991d c12991d = this.f35394a;
        if (c12991d != null) {
            c12991d.m36435a(obj);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m36431c(Object obj) {
        C12993f c12993f = this.f35396c;
        if (c12993f != null) {
            c12993f.m36436a(obj);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        m36427a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(C12990c c12990c) {
        if (c12990c != null) {
            this.f35395b = c12990c;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(C12991d c12991d) {
        if (c12991d != null) {
            this.f35394a = c12991d;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f35398e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(C12993f c12993f) {
        if (c12993f != null) {
            this.f35396c = c12993f;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        MBSplashData mBSplashData = new MBSplashData(this.f35399f);
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d != null) {
            DyOption dyOption = this.f35399f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                mBSplashData.setCountDownText(contextM36542d.getResources().getString(C13203i0.m37707a(contextM36542d, this.f35399f.isCanSkip() ? "mbridge_splash_count_time_can_skip" : "mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING)));
            }
            mBSplashData.setNoticeImage(C13203i0.m37707a(contextM36542d, "mbridge_splash_notice", "drawable"));
            String strM37763p = C13211m0.m37763p(contextM36542d);
            mBSplashData.setLogoText((TextUtils.isEmpty(strM37763p) || !strM37763p.contains("zh")) ? "AD" : "广告");
        }
        m36430b(mBSplashData);
        m36428a(mBSplashData);
        m36431c(mBSplashData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(C12995h c12995h) {
        if (c12995h != null) {
            this.f35397d = c12995h;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36427a(SplashResData splashResData) {
        if (this.f35398e == null || splashResData == null) {
            return;
        }
        int i = C129871.f35400a[splashResData.geteAction().ordinal()];
        if (i == 1 || i == 2) {
            m36429b(splashResData);
        }
        this.f35398e.viewClicked(splashResData);
    }

    /* JADX INFO: renamed from: b */
    private void m36429b(SplashResData splashResData) {
        try {
            String campaignUnitId = "";
            if (splashResData.getBaseViewData() != null && splashResData.getBaseViewData().getBindData() != null) {
                campaignUnitId = splashResData.getBaseViewData().getBindData().getCampaignUnitId();
            }
            if (!TextUtils.isEmpty(campaignUnitId)) {
                EventBus.getDefault().unregister(campaignUnitId);
                C12959b.m36295a().m36316b();
            } else {
                EventBus.getDefault().unregister(this);
                C12959b.m36295a().m36316b();
            }
        } catch (Exception e) {
            e.printStackTrace();
            EventBus.getDefault().unregister(this);
            EventBus.getDefault().release();
            C12959b.m36295a().m36316b();
        }
    }
}
