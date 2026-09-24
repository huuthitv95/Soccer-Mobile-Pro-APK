package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.error.C12974a;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.splash.common.C13651c;
import com.mbridge.msdk.splash.inter.InterfaceC13653a;
import com.mbridge.msdk.splash.middle.InterfaceC13661a;
import com.mbridge.msdk.splash.signal.C13678b;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.c */
/* JADX INFO: compiled from: NativeViewRenderManager.java */
/* JADX INFO: loaded from: classes7.dex */
class C13656c extends C13654a {

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.c$a */
    /* JADX INFO: compiled from: NativeViewRenderManager.java */
    class a implements DyCountDownListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ DyOption f38233a;

        a(DyOption dyOption) {
            this.f38233a = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
        public void getCountDownValue(int i) {
            this.f38233a.setDyCountDownListener(i);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.c$b */
    /* JADX INFO: compiled from: NativeViewRenderManager.java */
    class b implements DynamicViewBackListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13653a f38235a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MBSplashView f38236b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C13651c f38237c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ DyOption f38238d;

        b(InterfaceC13653a interfaceC13653a, MBSplashView mBSplashView, C13651c c13651c, DyOption dyOption) {
            this.f38235a = interfaceC13653a;
            this.f38236b = mBSplashView;
            this.f38237c = c13651c;
            this.f38238d = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewClicked(BaseRespData baseRespData) {
            C13678b splashSignalCommunicationImpl;
            MBSplashView mBSplashView = this.f38236b;
            InterfaceC13661a interfaceC13661aM40062a = (mBSplashView == null || (splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl()) == null) ? null : splashSignalCommunicationImpl.m40062a();
            DyOption dyOption = this.f38238d;
            CampaignEx campaignEx = dyOption != null ? dyOption.getCampaignEx() : null;
            boolean z = baseRespData instanceof SplashResData;
            EAction eAction = z ? ((SplashResData) baseRespData).geteAction() : null;
            if (eAction != null) {
                int i = c.f38240a[eAction.ordinal()];
                if (i == 1) {
                    if (interfaceC13661aM40062a != null) {
                        if (baseRespData == null) {
                            interfaceC13661aM40062a.mo39871a(campaignEx);
                            return;
                        } else {
                            if (z) {
                                SplashResData splashResData = (SplashResData) baseRespData;
                                if (splashResData.getBaseViewData() != null) {
                                    C13656c.this.m39828a(splashResData.getBaseViewData(), interfaceC13661aM40062a, campaignEx);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (i == 2) {
                    if (interfaceC13661aM40062a != null) {
                        interfaceC13661aM40062a.close();
                    }
                } else if (i == 3) {
                    if (this.f38238d != null) {
                        C12684c.m34661e(C13008c.m36588n().m36542d(), this.f38238d.getAdChoiceLink());
                    }
                } else if (i == 4 && baseRespData != null && z) {
                    SplashResData splashResData2 = (SplashResData) baseRespData;
                    if (splashResData2.getBaseViewData() != null) {
                        C13656c.this.m39829a(interfaceC13661aM40062a, campaignEx, splashResData2.getBaseViewData());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewCreateFail(C12974a c12974a) {
            MBSplashView mBSplashView = this.f38236b;
            if (mBSplashView != null) {
                Context context = mBSplashView.getContext();
                if (context == null) {
                    context = C13008c.m36588n().m36542d();
                }
                C13656c.this.m39827a(context, this.f38236b, this.f38237c, this.f38235a);
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewCreatedSuccess(View view) {
            InterfaceC13653a interfaceC13653a = this.f38235a;
            if (interfaceC13653a != null) {
                if (view != null) {
                    interfaceC13653a.mo39826a(view);
                } else {
                    interfaceC13653a.onError("View render error.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.c$c */
    /* JADX INFO: compiled from: NativeViewRenderManager.java */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f38240a;

        static {
            int[] iArr = new int[EAction.values().length];
            f38240a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38240a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38240a[EAction.NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38240a[EAction.FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.c$d */
    /* JADX INFO: compiled from: NativeViewRenderManager.java */
    static class d {

        /* JADX INFO: renamed from: a */
        private static final C13656c f38241a = new C13656c(null);
    }

    private C13656c() {
    }

    /* synthetic */ C13656c(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C13656c m39874a() {
        return d.f38241a;
    }

    @Override // com.mbridge.msdk.splash.manager.C13654a
    /* JADX INFO: renamed from: a */
    protected void mo39831a(List<String> list, MBSplashView mBSplashView, C13651c c13651c, InterfaceC13653a interfaceC13653a) {
        C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        DyOption dyOptionBuild = new DyOption.Builder().campaignEx(c13651c.m39784b()).fileDirs(list).dyAdType(DyAdType.SPLASH).canSkip(c13651c.m39795m()).isScreenClick(c13651c.m39788f() == 1).isClickButtonVisible(c13651c.m39785c() == 0).isShakeVisible(c13651c.m39791i() == 1).isApkInfoVisible(c13651c.m39783a() == 0).isLogoVisible(c13651c.m39787e() == 1).shakeStrenght(c13651c.m39792j()).shakeTime(c13651c.m39793k()).orientation(c13651c.m39789g()).countDownTime(c13651c.m39786d()).adChoiceLink(C13229v0.m37883a(c13651c.m39784b())).build();
        mBSplashView.setDyCountDownListener(new a(dyOptionBuild));
        DynamicViewCreator.getInstance().createDynamicView(dyOptionBuild, new b(interfaceC13653a, mBSplashView, c13651c, dyOptionBuild));
    }
}
