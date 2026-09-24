package com.mbridge.msdk.video.p291bt.module.orglistener;

import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.video.p291bt.module.MBTempContainer;

/* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.orglistener.e */
/* JADX INFO: compiled from: ReportBTContainerErrorListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13936e extends MBTempContainer.InterfaceC13904k.a {

    /* JADX INFO: renamed from: b */
    private InterfaceC13939h f39935b;

    /* JADX INFO: renamed from: c */
    private C13154c f39936c;

    public C13936e(C13154c c13154c, InterfaceC13939h interfaceC13939h) {
        this.f39935b = interfaceC13939h;
        this.f39936c = c13154c;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBTempContainer.InterfaceC13904k.a, com.mbridge.msdk.video.p291bt.module.MBTempContainer.InterfaceC13904k
    public void onError(String str) {
        super.onError(str);
        InterfaceC13939h interfaceC13939h = this.f39935b;
        if (interfaceC13939h != null) {
            interfaceC13939h.mo39291a(this.f39936c, str);
        }
    }
}
