package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.AbstractC9181q0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.o0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9253o0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f21650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9270v0 f21651b;

    public RunnableC9253o0(C9270v0 c9270v0, String str) {
        this.f21651b = c9270v0;
        this.f21650a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m21945a("injecting JS: %s", this.f21650a);
        try {
            String str = this.f21650a;
            if (str != null) {
                AbstractC9181q0.m22008a(this.f21651b.f21677a, str);
            }
        } catch (Exception unused) {
            IAlog.m21945a("Failed to inject JS", new Object[0]);
        }
    }
}
