package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.u */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnKeyListenerC9267u implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9239i0 f21669a;

    public ViewOnKeyListenerC9267u(AbstractC9239i0 abstractC9239i0) {
        this.f21669a = abstractC9239i0;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f21669a.m22078p()) {
            return false;
        }
        IAlog.m21949e("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
        this.f21669a.m22077o();
        return true;
    }
}
