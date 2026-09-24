package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8090h {

    /* JADX INFO: renamed from: a */
    public final C8021o f17996a;

    /* JADX INFO: renamed from: b */
    public final int f17997b;

    public C8090h() {
        C8021o c8021o = IAConfigManager.f17654M.f17688t.f17862b;
        this.f17996a = c8021o;
        this.f17997b = c8021o.m20443a("vast_endcard_x_delay", 5, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m20523a(AbstractC8084b abstractC8084b, boolean z) {
        int iM20447b;
        if (abstractC8084b == null) {
            IAlog.m21945a("%sapplyVastCompanionEndCardTime was called with a null endcard", IAlog.m21943a(this));
            return;
        }
        if (abstractC8084b.mo20515k()) {
            iM20447b = z ? this.f17996a.m20447b("d_e_pl_dl_pl", this.f17997b, 0) : this.f17996a.m20447b("d_e_pl", this.f17997b, 0);
        } else {
            iM20447b = z ? this.f17996a.m20447b("d_e_npl_dl_npl", this.f17997b, 0) : this.f17996a.m20447b("d_e_npl", this.f17997b, 0);
        }
        abstractC8084b.f17987f = iM20447b;
    }

    /* JADX INFO: renamed from: a */
    public final void m20524a(AbstractC8084b abstractC8084b, boolean z, boolean z2) {
        int iM20447b;
        if (abstractC8084b == null) {
            IAlog.m21945a("%sapplyNonVastCompanionEndCardTime was called with a null endcard", IAlog.m21943a(this));
            return;
        }
        if (z) {
            iM20447b = z2 ? this.f17996a.m20447b("d_e_pl_dl_dl", this.f17997b, 0) : this.f17996a.m20447b("d_e_npl_dl_dl", this.f17997b, 0);
        } else {
            iM20447b = this.f17996a.m20447b("d_e_def", this.f17997b, 0);
        }
        abstractC8084b.f17987f = iM20447b;
    }
}
