package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.FyberReportAdActivity;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p278ui.FyberAdIdentifierFactory;
import com.fyber.inneractive.sdk.p278ui.FyberAdIdentifierLocal;
import com.fyber.inneractive.sdk.p278ui.FyberAdIdentifierRemote;
import com.fyber.inneractive.sdk.p278ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.response.AbstractC9087e;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8121g implements IFyberAdIdentifier.ClickListener, InterfaceC8123h {

    /* JADX INFO: renamed from: a */
    public final Context f18069a;

    /* JADX INFO: renamed from: b */
    public final InneractiveAdRequest f18070b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9087e f18071c;

    /* JADX INFO: renamed from: d */
    public final IFyberAdIdentifier f18072d;

    public C8121g(Context context, boolean z, InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e, C8006r c8006r) {
        this.f18069a = context;
        this.f18070b = inneractiveAdRequest;
        this.f18071c = abstractC9087e;
        new FyberAdIdentifierFactory();
        IFyberAdIdentifier fyberAdIdentifierRemote = z ? new FyberAdIdentifierRemote(c8006r) : new FyberAdIdentifierLocal(c8006r);
        this.f18072d = fyberAdIdentifierRemote;
        fyberAdIdentifierRemote.f21402a = this;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener
    /* JADX INFO: renamed from: a */
    public final void mo20542a() {
        Long demandId;
        String demandSource;
        AbstractC9087e abstractC9087e = this.f18071c;
        String str = null;
        if (abstractC9087e != null) {
            ImpressionData impressionData = abstractC9087e.f21318r;
            String advertiserDomain = impressionData != null ? impressionData.getAdvertiserDomain() : null;
            ImpressionData impressionData2 = this.f18071c.f21318r;
            demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f18071c.f21318r;
            str = advertiserDomain;
            demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
        } else {
            demandId = null;
            demandSource = null;
        }
        FyberReportAdActivity.start(this.f18069a, this, str, demandSource, demandId);
    }
}
