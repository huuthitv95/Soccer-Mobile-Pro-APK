package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8824w;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.y */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC8800y extends Handler implements Runnable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8801z f20600a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8799x f20601b;

    /* JADX INFO: renamed from: c */
    public final int f20602c;

    /* JADX INFO: renamed from: d */
    public final long f20603d;

    /* JADX INFO: renamed from: e */
    public IOException f20604e;

    /* JADX INFO: renamed from: f */
    public int f20605f;

    /* JADX INFO: renamed from: g */
    public volatile Thread f20606g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f20607h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C8761b0 f20608i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8800y(C8761b0 c8761b0, Looper looper, InterfaceC8801z interfaceC8801z, InterfaceC8799x interfaceC8799x, int i, long j) {
        super(looper);
        this.f20608i = c8761b0;
        this.f20600a = interfaceC8801z;
        this.f20601b = interfaceC8799x;
        this.f20602c = i;
        this.f20603d = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m21318a(boolean z) {
        this.f20607h = z;
        this.f20604e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f20600a.mo21062b();
            if (this.f20606g != null) {
                this.f20606g.interrupt();
            }
        }
        if (z) {
            this.f20608i.f20453b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f20601b.mo21095a(this.f20600a, jElapsedRealtime, jElapsedRealtime - this.f20603d, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f20607h) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.f20604e = null;
            C8761b0 c8761b0 = this.f20608i;
            c8761b0.f20452a.execute(c8761b0.f20453b);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f20608i.f20453b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f20603d;
        if (this.f20600a.mo21061a()) {
            this.f20601b.mo21095a(this.f20600a, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            this.f20601b.mo21095a(this.f20600a, jElapsedRealtime, j, false);
            return;
        }
        if (i2 == 2) {
            this.f20601b.mo21094a(this.f20600a, jElapsedRealtime, j);
            return;
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f20604e = iOException;
        int iMo21091a = this.f20601b.mo21091a(this.f20600a, jElapsedRealtime, j, iOException);
        if (iMo21091a == 3) {
            this.f20608i.f20454c = this.f20604e;
            return;
        }
        if (iMo21091a != 2) {
            int i3 = iMo21091a == 1 ? 1 : this.f20605f + 1;
            this.f20605f = i3;
            long jMin = Math.min((i3 - 1) * 1000, 5000);
            C8761b0 c8761b1 = this.f20608i;
            if (c8761b1.f20453b != null) {
                throw new IllegalStateException();
            }
            c8761b1.f20453b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f20604e = null;
                c8761b1.f20452a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f20606g = Thread.currentThread();
            if (!this.f20600a.mo21061a()) {
                AbstractC8824w.m21374a("load:".concat(this.f20600a.getClass().getSimpleName()));
                try {
                    this.f20600a.load();
                    AbstractC8824w.m21373a();
                } catch (Throwable th) {
                    AbstractC8824w.m21373a();
                    throw th;
                }
            }
            if (this.f20607h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f20607h) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            Log.e("LoadTask", "Unexpected error loading stream", e2);
            if (!this.f20607h) {
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (InterruptedException unused) {
            if (!this.f20600a.mo21061a()) {
                throw new IllegalStateException();
            }
            if (this.f20607h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (this.f20607h) {
                return;
            }
            obtainMessage(3, new C8759a0(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (this.f20607h) {
                return;
            }
            obtainMessage(3, new C8759a0(e4)).sendToTarget();
        }
    }
}
