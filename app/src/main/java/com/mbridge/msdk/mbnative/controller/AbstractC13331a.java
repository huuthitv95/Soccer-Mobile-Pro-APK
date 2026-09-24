package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.widget.dialog.InterfaceC14235b;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.a */
/* JADX INFO: compiled from: DemandNativeController.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13331a {

    /* JADX INFO: renamed from: a */
    public Handler f36945a;

    /* JADX INFO: renamed from: a */
    public abstract void mo38459a(int i, long j, int i2, String str);

    /* JADX INFO: renamed from: a */
    public synchronized void m38485a(long j, int i, boolean z, String str, String str2) {
        mo38459a(1, j, i, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m38486a(Context context, CampaignEx campaignEx) {
    }

    /* JADX INFO: renamed from: a */
    public void m38487a(CampaignUnit campaignUnit) {
    }

    /* JADX INFO: renamed from: a */
    public void m38488a(C13126e c13126e, int i) {
    }

    /* JADX INFO: renamed from: a */
    public boolean m38489a(C12682a c12682a, Context context, CampaignEx campaignEx, String str, InterfaceC14235b interfaceC14235b) {
        return false;
    }
}
