package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.m0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8018m0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f17802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8048w f17803b;

    public RunnableC8018m0(Context context, C8048w c8048w) {
        this.f17802a = context;
        this.f17803b = c8048w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (InneractiveAdManager.isCurrentUserAChild()) {
            return;
        }
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AbstractC8020n0.m20441a(this.f17802a, this.f17803b);
            C8046v c8046v = AbstractC8044u.f17878a.f17886b;
            if (TextUtils.isEmpty(c8046v != null ? c8046v.f17882a : null)) {
                AbstractC8019n.m20440a(this.f17802a, this.f17803b);
            }
        } catch (Throwable th) {
            IAlog.m21944a("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project", th, new Object[0]);
        }
    }
}
