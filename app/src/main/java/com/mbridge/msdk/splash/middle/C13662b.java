package com.mbridge.msdk.splash.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.middle.b */
/* JADX INFO: compiled from: SplashLoadListenerImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13662b {

    /* JADX INFO: renamed from: a */
    private MBSplashLoadListener f38314a;

    /* JADX INFO: renamed from: b */
    private C13663c f38315b;

    /* JADX INFO: renamed from: c */
    private String f38316c;

    /* JADX INFO: renamed from: d */
    private String f38317d;

    /* JADX INFO: renamed from: e */
    private MBridgeIds f38318e;

    public C13662b(C13663c c13663c, MBridgeIds mBridgeIds) {
        this.f38315b = c13663c;
        this.f38318e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f38316c = mBridgeIds.getUnitId();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39964a(CampaignEx campaignEx, int i) {
        C13663c c13663c;
        C13663c c13663c2 = this.f38315b;
        if (c13663c2 == null || !c13663c2.m40006g() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f38314a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f38318e, i);
            this.f38314a.isSupportZoomOut(this.f38318e, campaignEx.getFlb() == 1);
        }
        this.f38315b.m39994b(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        C13148j.m37387a(C13008c.m36588n().m36542d(), arrayList, this.f38316c, campaignEx.isBidCampaign());
        if (i != 2 || (c13663c = this.f38315b) == null) {
            return;
        }
        c13663c.m39990b(campaignEx, 0, true);
    }

    /* JADX INFO: renamed from: a */
    public void m39965a(C13082b c13082b, int i) {
        C13663c c13663c = this.f38315b;
        if (c13663c == null || !c13663c.m40006g()) {
            return;
        }
        String str = "";
        if (c13082b != null) {
            String strM37032l = c13082b.m37032l();
            if (!TextUtils.isEmpty(strM37032l)) {
                str = strM37032l;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f38314a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f38318e, str, i);
        }
        this.f38315b.m39994b(false);
        C13148j.m37385a(C13008c.m36588n().m36542d(), str, this.f38316c, !TextUtils.isEmpty(this.f38317d), c13082b != null ? c13082b.m37025d() : null);
    }

    /* JADX INFO: renamed from: a */
    public void m39966a(MBSplashLoadListener mBSplashLoadListener) {
        this.f38314a = mBSplashLoadListener;
    }

    /* JADX INFO: renamed from: a */
    public void m39967a(String str) {
        this.f38317d = str;
    }
}
