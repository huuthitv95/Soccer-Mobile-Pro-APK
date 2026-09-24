package com.mbridge.msdk.interstitial.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.interstitial.request.b */
/* JADX INFO: compiled from: InterstitialLoadVideoResponseHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13252b extends AbstractC13253c {
    /* JADX INFO: renamed from: a */
    public abstract void mo38032a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.interstitial.request.AbstractC13253c
    /* JADX INFO: renamed from: a */
    public void mo38078a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.interstitial.request.AbstractC13253c
    /* JADX INFO: renamed from: a */
    public void mo38079a(List<C13837g> list, CampaignUnit campaignUnit) {
        mo38032a(campaignUnit);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo38033b(int i, String str);

    @Override // com.mbridge.msdk.interstitial.request.AbstractC13253c
    /* JADX INFO: renamed from: a */
    public void mo38077a(int i, String str) {
        mo38033b(i, str);
    }
}
