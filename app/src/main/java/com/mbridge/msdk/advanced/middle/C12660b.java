package com.mbridge.msdk.advanced.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.b */
/* JADX INFO: compiled from: NativeAdvancedLoadListenerImpl.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12660b {

    /* JADX INFO: renamed from: a */
    private NativeAdvancedAdListener f33509a;

    /* JADX INFO: renamed from: b */
    private C12661c f33510b;

    /* JADX INFO: renamed from: c */
    private MBridgeIds f33511c;

    /* JADX INFO: renamed from: d */
    private String f33512d;

    /* JADX INFO: renamed from: e */
    private String f33513e;

    public C12660b(C12661c c12661c, MBridgeIds mBridgeIds) {
        this.f33510b = c12661c;
        this.f33511c = mBridgeIds;
        this.f33512d = mBridgeIds.getUnitId();
    }

    /* JADX INFO: renamed from: a */
    public void m34483a(CampaignEx campaignEx, int i) {
        C12661c c12661c;
        C13219q0.m37816b("NativeAdvancedLoadManager", "onLoadSuccessed: " + i);
        C12661c c12661c2 = this.f33510b;
        if (c12661c2 == null || !c12661c2.m34522g() || campaignEx == null) {
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33509a;
        if (nativeAdvancedAdListener != null && this.f33510b != null) {
            nativeAdvancedAdListener.onLoadSuccessed(this.f33511c);
        }
        this.f33510b.m34507a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        C13148j.m37387a(C13008c.m36588n().m36542d(), arrayList, this.f33512d, campaignEx.isBidCampaign());
        if (i != 2 || (c12661c = this.f33510b) == null) {
            return;
        }
        c12661c.m34505a(campaignEx, true);
    }

    /* JADX INFO: renamed from: a */
    public void m34484a(C13082b c13082b, int i) {
        C12661c c12661c = this.f33510b;
        if (c12661c == null || !c12661c.m34522g()) {
            return;
        }
        String str = "";
        if (c13082b != null) {
            String strM37032l = c13082b.m37032l();
            if (!TextUtils.isEmpty(strM37032l)) {
                str = strM37032l;
            }
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f33509a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f33511c, str);
        }
        this.f33510b.m34507a(false);
        C13148j.m37385a(C13008c.m36588n().m36542d(), str, this.f33512d, !TextUtils.isEmpty(this.f33513e), c13082b != null ? c13082b.m37025d() : null);
    }

    /* JADX INFO: renamed from: a */
    public void m34485a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f33509a = nativeAdvancedAdListener;
    }

    /* JADX INFO: renamed from: a */
    public void m34486a(String str) {
        this.f33513e = str;
    }
}
