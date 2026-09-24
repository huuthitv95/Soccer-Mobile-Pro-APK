package com.fyber.inneractive.sdk.ignite;

import android.content.Context;
import com.digitalturbine.ignite.authenticator.IgniteManager;
import com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f;
import com.digitalturbine.ignite.authenticator.decorator.C4245e;
import com.digitalturbine.ignite.authenticator.decorator.C4247g;
import com.digitalturbine.ignite.authenticator.decorator.C4248h;
import com.digitalturbine.ignite.authenticator.decorator.C4249i;
import com.fyber.inneractive.sdk.ignite.events.wrappers.C8245a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8252l extends IgniteManager {
    public C8252l(Context context, C8251k c8251k, C8245a c8245a, boolean z, boolean z2, boolean z3, C8248h c8248h) {
        C8252l c8252l;
        AbstractC4246f c4247g;
        super(c8251k, c8245a);
        C4245e c4245e = new C4245e(context);
        if (z && z2) {
            c4247g = new C4248h(new C4247g(c4245e, c8248h), true, z3, c8248h, this);
            c8252l = this;
        } else if (z) {
            c8252l = this;
            c4247g = new C4248h(c4245e, false, z3, c8248h, c8252l);
        } else {
            c8252l = this;
            c4247g = z2 ? new C4247g(c4245e, c8248h) : new C4249i(c4245e, c8248h);
        }
        c8252l.f17294a = c4247g;
    }
}
