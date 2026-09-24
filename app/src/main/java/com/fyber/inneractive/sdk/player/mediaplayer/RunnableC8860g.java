package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.g */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8860g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8869p f20805a;

    public RunnableC8860g(C8869p c8869p) {
        this.f20805a = c8869p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8869p.m21406b(this.f20805a);
        Handler handler = this.f20805a.f20827o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f20805a.f20827o = null;
        }
        this.f20805a.f20826n = null;
        Looper.myLooper().quit();
    }
}
