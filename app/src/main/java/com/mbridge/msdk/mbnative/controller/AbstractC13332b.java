package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.preload.listenter.C13604a;
import com.mbridge.msdk.setting.C13640l;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.b */
/* JADX INFO: compiled from: DemandNativePreloadController.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13332b {

    /* JADX INFO: renamed from: a */
    protected Handler f36946a;

    /* JADX INFO: renamed from: a */
    public abstract void mo38490a(int i, long j, int i2, C13640l c13640l, String str, String str2, C13604a c13604a, boolean z);

    /* JADX INFO: renamed from: a */
    public synchronized void m38491a(int i, long j, int i2, C13640l c13640l, String str, String str2, boolean z, C13604a c13604a) {
        try {
            mo38490a(i, j, i2, c13640l, str, str2, c13604a, z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38492a(Context context, CampaignEx campaignEx) {
    }

    /* JADX INFO: renamed from: a */
    public void m38493a(CampaignUnit campaignUnit) {
    }

    /* JADX INFO: renamed from: a */
    public void m38494a(C13126e c13126e, int i) {
    }
}
