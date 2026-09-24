package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.v1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9197v1 {

    /* JADX INFO: renamed from: a */
    public final TimeUnit f21498a;

    /* JADX INFO: renamed from: b */
    public final long f21499b;

    /* JADX INFO: renamed from: c */
    public final HandlerC9191t1 f21500c;

    /* JADX INFO: renamed from: e */
    public InterfaceC9194u1 f21502e;

    /* JADX INFO: renamed from: d */
    public boolean f21501d = false;

    /* JADX INFO: renamed from: f */
    public long f21503f = 0;

    public C9197v1(TimeUnit timeUnit, long j) {
        this.f21499b = j;
        this.f21498a = timeUnit;
        IAlog.m21945a("Visible time counter init - time %d", Long.valueOf(j));
        this.f21500c = new HandlerC9191t1(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m22035a(long j) {
        long jUptimeMillis = (SystemClock.uptimeMillis() - j) + 50 + this.f21503f;
        this.f21503f = jUptimeMillis;
        if (this.f21502e != null && jUptimeMillis > this.f21498a.toMillis(this.f21499b)) {
            this.f21502e.mo20394a();
            return;
        }
        HandlerC9191t1 handlerC9191t1 = this.f21500c;
        if (handlerC9191t1 == null || this.f21502e == null) {
            return;
        }
        handlerC9191t1.removeMessages(1932593528);
        this.f21500c.sendEmptyMessageDelayed(1932593528, 50L);
    }
}
