package com.mbridge.msdk.reward.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.request.a */
/* JADX INFO: compiled from: RewarLoadVideoResponseHandler.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13625a extends AbstractC13627c {
    @Override // com.mbridge.msdk.reward.request.AbstractC13627c
    /* JADX INFO: renamed from: a */
    public void mo39355a(int i, String str, C13154c c13154c) {
        mo39141b(i, str, c13154c);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo39140a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.reward.request.AbstractC13627c
    /* JADX INFO: renamed from: a */
    public void mo39356a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.reward.request.AbstractC13627c
    /* JADX INFO: renamed from: a */
    public void mo39357a(List<C13837g> list, CampaignUnit campaignUnit) {
        mo39140a(campaignUnit);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo39141b(int i, String str, C13154c c13154c);
}
