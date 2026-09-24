package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.AbstractC9181q0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.AbstractC9238i;
import com.fyber.inneractive.sdk.web.C9248m;
import com.fyber.inneractive.sdk.web.InterfaceC9232g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C8113s implements InterfaceC9232g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8115u f18049a;

    public C8113s(C8115u c8115u) {
        this.f18049a = c8115u;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9232g
    /* JADX INFO: renamed from: a */
    public final void mo20538a(AbstractC9238i abstractC9238i) {
        IAlog.m21945a("%s End-Card loaded", this.f18049a.f17980a);
        this.f18049a.f18057h.set(false);
        C8115u c8115u = this.f18049a;
        c8115u.getClass();
        boolean z = abstractC9238i != null;
        c8115u.f18055f = z;
        C9248m c9248m = z ? abstractC9238i.f21565b : null;
        String str = IAConfigManager.f17654M.f17661E.f17583e;
        if (!c8115u.mo20537f() || c9248m == null || TextUtils.isEmpty(str)) {
            c8115u.f17981b.mo20517m();
        } else {
            AbstractC9181q0.m22009a(c9248m, str, c8115u);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9232g
    /* JADX INFO: renamed from: a */
    public final void mo20539a(AbstractC9238i abstractC9238i, InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.m21950f("%s End-Card failed to load!", this.f18049a.f17980a);
        this.f18049a.f18057h.set(false);
        C8115u c8115u = this.f18049a;
        c8115u.f18055f = false;
        c8115u.f17981b.mo20504a(inneractiveInfrastructureError);
    }
}
