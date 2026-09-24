package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.HandlerC9191t1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C7961e implements InterfaceC8027r {

    /* JADX INFO: renamed from: d */
    public C9197v1 f17719d;

    /* JADX INFO: renamed from: e */
    public final C8051x0 f17720e;

    /* JADX INFO: renamed from: g */
    public final C7959d f17722g;

    /* JADX INFO: renamed from: a */
    public final Set f17716a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f17717b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public boolean f17718c = false;

    /* JADX INFO: renamed from: f */
    public final Handler f17721f = new Handler(Looper.getMainLooper(), new C7947b(this));

    public C7961e(C8051x0 c8051x0) {
        C7949c c7949c = new C7949c(this);
        this.f17722g = new C7959d(this);
        this.f17720e = c8051x0;
        Application application = AbstractC9174o.f21470a;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(c7949c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20395a() {
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        C8040s c8040s = iAConfigManager.f17688t;
        if (!c8040s.f17864d) {
            c8040s.f17863c.add(this);
        }
        C9197v1 c9197v1 = new C9197v1(TimeUnit.MINUTES, iAConfigManager.f17688t.f17862b.m20443a("session_duration", 30, 1));
        this.f17719d = c9197v1;
        c9197v1.f21502e = this.f17722g;
    }

    @Override // com.fyber.inneractive.sdk.config.InterfaceC8027r
    public final void onGlobalConfigChanged(C8040s c8040s, C8021o c8021o) {
        C9197v1 c9197v1 = this.f17719d;
        if (c9197v1 != null) {
            c9197v1.f21501d = false;
            c9197v1.f21503f = 0L;
            HandlerC9191t1 handlerC9191t1 = c9197v1.f21500c;
            if (handlerC9191t1 != null) {
                handlerC9191t1.removeMessages(1932593528);
            }
            TimeUnit timeUnit = TimeUnit.MINUTES;
            long jM20443a = c8021o.m20443a("session_duration", 30, 1);
            long j = this.f17719d.f21503f;
            C9197v1 c9197v2 = new C9197v1(timeUnit, jM20443a);
            c9197v2.f21503f = j;
            IAlog.m21945a("Visible time counter init - time %d", Long.valueOf(jM20443a));
            this.f17719d = c9197v2;
            c9197v2.f21502e = this.f17722g;
        }
        c8040s.f17863c.remove(this);
    }
}
