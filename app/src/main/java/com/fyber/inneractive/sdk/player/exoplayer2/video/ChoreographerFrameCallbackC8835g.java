package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.g */
/* JADX INFO: loaded from: classes4.dex */
public final class ChoreographerFrameCallbackC8835g implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: e */
    public static final ChoreographerFrameCallbackC8835g f20728e = new ChoreographerFrameCallbackC8835g();

    /* JADX INFO: renamed from: a */
    public volatile long f20729a;

    /* JADX INFO: renamed from: b */
    public final Handler f20730b;

    /* JADX INFO: renamed from: c */
    public Choreographer f20731c;

    /* JADX INFO: renamed from: d */
    public int f20732d;

    public ChoreographerFrameCallbackC8835g() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f20730b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f20729a = j;
        this.f20731c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f20731c = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.f20732d + 1;
            this.f20732d = i2;
            if (i2 == 1) {
                this.f20731c.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.f20732d - 1;
        this.f20732d = i3;
        if (i3 == 0) {
            this.f20731c.removeFrameCallback(this);
            this.f20729a = 0L;
        }
        return true;
    }
}
