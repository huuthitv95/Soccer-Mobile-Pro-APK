package com.fyber.inneractive.sdk.web;

import android.widget.Toast;
import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.v */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9269v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f21671a;

    public RunnableC9269v(String str) {
        this.f21671a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(AbstractC9174o.f21470a, this.f21671a, 0).show();
    }
}
