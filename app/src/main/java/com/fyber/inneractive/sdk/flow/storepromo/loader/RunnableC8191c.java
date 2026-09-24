package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.C8183a;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8191c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f18242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8192d f18243b;

    public RunnableC8191c(C8192d c8192d, String str) {
        this.f18243b = c8192d;
        this.f18242a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8194f c8194f = this.f18243b.f18244a;
        String str = this.f18242a;
        C8183a c8183a = c8194f.f18247a;
        if (c8183a != null) {
            try {
                c8183a.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
            } catch (Throwable th) {
                if (c8194f.f18251e != null) {
                    c8194f.f18251e.mo20602a(EnumC8372b.WEB_VIEW_CRASH_ERROR, "Unable to load data: " + th.getMessage(), "");
                }
            }
        }
    }
}
