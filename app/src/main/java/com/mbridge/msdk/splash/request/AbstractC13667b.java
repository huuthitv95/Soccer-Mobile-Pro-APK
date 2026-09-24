package com.mbridge.msdk.splash.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.request.b */
/* JADX INFO: compiled from: SplashLoadResponseHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13667b extends AbstractC13669d {

    /* JADX INFO: renamed from: d */
    private int f38356d;

    public AbstractC13667b(int i) {
        this.f38356d = i;
    }

    @Override // com.mbridge.msdk.splash.request.AbstractC13669d
    /* JADX INFO: renamed from: a */
    public void mo40031a(int i, String str) {
        mo39943b(i, str);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo39942a(CampaignUnit campaignUnit, int i);

    @Override // com.mbridge.msdk.splash.request.AbstractC13669d
    /* JADX INFO: renamed from: a */
    public void mo40032a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.splash.request.AbstractC13669d
    /* JADX INFO: renamed from: a */
    public void mo40033a(List<C13837g> list, CampaignUnit campaignUnit) {
        mo39942a(campaignUnit, this.f38356d);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo39943b(int i, String str);
}
