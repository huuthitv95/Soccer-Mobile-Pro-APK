package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.mraid.EnumC8335k;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.w */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9271w implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9273x f21703a;

    public RunnableC9271w(C9273x c9273x) {
        this.f21703a = c9273x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21703a.f21711a.getClass();
        AbstractC9183r.f21478b.post(new RunnableC9269v("Image failed to download."));
        this.f21703a.f21711a.m22071a(EnumC8335k.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.m21945a("failed to download and save the image file.", new Object[0]);
    }
}
