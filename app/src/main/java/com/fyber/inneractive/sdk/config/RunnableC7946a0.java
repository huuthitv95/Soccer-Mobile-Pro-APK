package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.util.AbstractC9183r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.a0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7946a0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAConfigManager f17695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f17696b;

    public RunnableC7946a0(IAConfigManager iAConfigManager, Context context) {
        this.f17695a = iAConfigManager;
        this.f17696b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Class.forName("com.iab.omid.library.fyber.Omid");
            AbstractC9183r.f21478b.post(new RunnableC8053z(this));
        } catch (Throwable unused) {
        }
    }
}
