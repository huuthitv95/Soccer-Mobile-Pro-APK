package com.mbridge.msdk.config.component.log;

import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.metrics.C12755a;
import com.mbridge.msdk.config.component.log.model.C12821a;
import com.mbridge.msdk.foundation.same.report.C13142d;
import com.mbridge.msdk.foundation.same.report.C13151m;
import com.mbridge.msdk.foundation.same.report.C13159n;
import com.mbridge.msdk.tracker.C13818e;
import com.mbridge.msdk.tracker.C13873p;
import com.mbridge.msdk.tracker.C13881x;
import com.mbridge.msdk.tracker.InterfaceC13819f;
import com.mbridge.msdk.tracker.network.toolbox.C13858h;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class LogCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    private C12821a f34252h;

    /* JADX INFO: renamed from: i */
    C13881x f34253i;

    /* JADX INFO: renamed from: a */
    private C13873p m35518a(int i) {
        return i == 1 ? new C13873p(new C13151m((byte) 2), this.f34252h.m35529i(), this.f34252h.m35530j()) : new C13873p(new C13858h(), this.f34252h.m35523c(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m35519a(C13818e c13818e) throws Exception {
        return true;
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        super.mo34834b(map);
        this.f33808f = "913001";
        C12821a c12821a = new C12821a();
        this.f34252h = c12821a;
        c12821a.m35521a(map);
        this.f34253i = new C13881x.b().m41401a(this.f34252h.m35531k()).m41407b(this.f34252h.m35524d()).m41409d(this.f34252h.m35527g()).m41408c(this.f34252h.m35522b()).m41410e(this.f34252h.m35520a()).m41403a(new C13142d()).m41404a(new InterfaceC13819f() { // from class: com.mbridge.msdk.config.component.log.LogCpt$$ExternalSyntheticLambda0
            @Override // com.mbridge.msdk.tracker.InterfaceC13819f
            /* JADX INFO: renamed from: a */
            public final boolean mo35095a(C13818e c13818e) {
                return LogCpt.m35519a(c13818e);
            }
        }).m41405a(new C13159n()).m41402a(this.f34252h.m35526f(), m35518a(this.f34252h.m35526f())).m41406a();
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        C12755a.m35087a().m35091a(this.f34253i);
        if (this.f34252h.m35528h() != null) {
            C12755a.m35087a().m35093b(this.f34252h.m35528h());
        }
        if (this.f34252h.m35525e() == 1) {
            C12755a.m35087a().m35094d();
        }
    }
}
