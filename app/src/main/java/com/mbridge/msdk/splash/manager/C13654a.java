package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.feedback.bean.C13085a;
import com.mbridge.msdk.foundation.tools.C13236z;
import com.mbridge.msdk.splash.common.C13651c;
import com.mbridge.msdk.splash.common.util.C13652a;
import com.mbridge.msdk.splash.inter.InterfaceC13653a;
import com.mbridge.msdk.splash.middle.InterfaceC13661a;
import com.mbridge.msdk.splash.view.MBSplashNativeView;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.a */
/* JADX INFO: compiled from: BaseNativeViewRenderManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13654a {

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.a$a */
    /* JADX INFO: compiled from: BaseNativeViewRenderManager.java */
    class a implements InterfaceC13083a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13661a f38191a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f38192b;

        a(InterfaceC13661a interfaceC13661a, int i) {
            this.f38191a = interfaceC13661a;
            this.f38192b = i;
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            this.f38191a.mo39870a(2, this.f38192b);
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            this.f38191a.mo39870a(2, this.f38192b);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m39827a(Context context, MBSplashView mBSplashView, C13651c c13651c, InterfaceC13653a interfaceC13653a) {
        try {
            MBSplashNativeView mBSplashNativeView = new MBSplashNativeView(context, mBSplashView, c13651c);
            if (interfaceC13653a != null) {
                interfaceC13653a.mo39826a(mBSplashNativeView);
            }
        } catch (Throwable unused) {
            if (interfaceC13653a != null) {
                interfaceC13653a.onError("View render error.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m39828a(InterfaceC12986a interfaceC12986a, InterfaceC13661a interfaceC13661a, CampaignEx campaignEx) {
        float f;
        int clickType;
        float f2;
        if (interfaceC12986a == null || !(interfaceC12986a instanceof MBSplashData)) {
            f = 0.0f;
            clickType = 0;
            f2 = 0.0f;
        } else {
            MBSplashData mBSplashData = (MBSplashData) interfaceC12986a;
            f = mBSplashData.getxInScreen();
            f2 = mBSplashData.getyInScreen();
            clickType = mBSplashData.getClickType();
        }
        if (interfaceC13661a != null) {
            try {
                interfaceC13661a.mo39871a(C13652a.m39824a(C13652a.m39825a(clickType, f, f2), campaignEx));
            } catch (Throwable th) {
                th.printStackTrace();
                interfaceC13661a.mo39871a(campaignEx);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m39829a(InterfaceC13661a interfaceC13661a, CampaignEx campaignEx, InterfaceC12986a interfaceC12986a) {
        if (campaignEx != null) {
            String campaignUnitId = campaignEx.getCampaignUnitId();
            String requestId = campaignEx.getRequestId();
            int currentCountDown = interfaceC12986a != null ? interfaceC12986a.getEffectData().getCurrentCountDown() : 0;
            interfaceC13661a.mo39870a(1, currentCountDown);
            C13085a c13085aM37052b = C13084b.m37036b().m37052b(campaignUnitId + "_" + requestId);
            if (c13085aM37052b != null) {
                c13085aM37052b.m37077a(campaignEx);
                C13084b.m37036b().m37047a(campaignUnitId + "_" + requestId, new a(interfaceC13661a, currentCountDown));
                c13085aM37052b.m37090p();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39830a(MBSplashView mBSplashView, C13651c c13651c, InterfaceC13653a interfaceC13653a) {
        Context context = mBSplashView.getContext();
        if (context == null) {
            context = C13008c.m36588n().m36542d();
        }
        if (c13651c == null && interfaceC13653a != null) {
            interfaceC13653a.onError("The render parameters is unavailable.");
            return;
        }
        String strM37959a = (c13651c == null || c13651c.m39784b() == null) ? "" : C13236z.m37959a(c13651c.m39784b().getAdZip());
        if (TextUtils.isEmpty(strM37959a)) {
            m39827a(context, mBSplashView, c13651c, interfaceC13653a);
            return;
        }
        if (c13651c == null || c13651c.m39784b() == null) {
            return;
        }
        if (TextUtils.isEmpty(c13651c.m39784b().getAdZip())) {
            m39827a(context, mBSplashView, c13651c, interfaceC13653a);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(strM37959a);
            mo39831a(arrayList, mBSplashView, c13651c, interfaceC13653a);
        } catch (Exception unused) {
            m39827a(context, mBSplashView, c13651c, interfaceC13653a);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo39831a(List<String> list, MBSplashView mBSplashView, C13651c c13651c, InterfaceC13653a interfaceC13653a) {
        throw null;
    }
}
