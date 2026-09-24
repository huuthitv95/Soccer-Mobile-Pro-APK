package com.fyber.inneractive.sdk.web;

import android.window.OnBackInvokedCallback;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.t */
/* JADX INFO: loaded from: classes4.dex */
public final class C9265t implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9239i0 f21668a;

    public C9265t(AbstractC9239i0 abstractC9239i0) {
        this.f21668a = abstractC9239i0;
    }

    public final void onBackInvoked() {
        AbstractC9239i0 abstractC9239i0 = this.f21668a;
        if (abstractC9239i0.m22078p()) {
            IAlog.m21949e("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            abstractC9239i0.m22077o();
        }
    }
}
