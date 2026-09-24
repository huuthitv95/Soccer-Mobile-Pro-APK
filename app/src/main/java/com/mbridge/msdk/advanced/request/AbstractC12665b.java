package com.mbridge.msdk.advanced.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.C13837g;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.request.b */
/* JADX INFO: compiled from: NativeAdvancedLoadResponseHandler.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12665b extends AbstractC12667d {

    /* JADX INFO: renamed from: d */
    private int f33552d;

    public AbstractC12665b(int i) {
        this.f33552d = i;
    }

    @Override // com.mbridge.msdk.advanced.request.AbstractC12667d
    /* JADX INFO: renamed from: a */
    public void mo34543a(int i, String str) {
        mo34471b(i, str);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo34470a(CampaignUnit campaignUnit, int i);

    @Override // com.mbridge.msdk.advanced.request.AbstractC12667d
    /* JADX INFO: renamed from: a */
    public void mo34544a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.advanced.request.AbstractC12667d
    /* JADX INFO: renamed from: a */
    public void mo34545a(List<C13837g> list, CampaignUnit campaignUnit) {
        mo34470a(campaignUnit, this.f33552d);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo34471b(int i, String str);
}
