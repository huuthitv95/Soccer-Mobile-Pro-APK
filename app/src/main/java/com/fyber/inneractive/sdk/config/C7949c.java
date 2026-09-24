package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.C7921g;
import com.fyber.inneractive.sdk.cache.session.C7923i;
import com.fyber.inneractive.sdk.cache.session.RunnableC7915d;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7917a;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9139c0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.C9209z0;
import com.fyber.inneractive.sdk.util.HandlerC9191t1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C7949c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7961e f17699a;

    public C7949c(C7961e c7961e) {
        this.f17699a = c7961e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f17699a.f17721f.hasMessages(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) || this.f17699a.f17717b.get()) {
            return;
        }
        this.f17699a.f17721f.sendEmptyMessageDelayed(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C8006r c8006r;
        C7921g c7921g;
        this.f17699a.f17721f.removeMessages(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        C7961e c7961e = this.f17699a;
        if (c7961e.f17717b.compareAndSet(true, false)) {
            if (c7961e.f17718c) {
                IAlog.m21945a("onActivityResumed: restartSession", new Object[0]);
                c7961e.f17718c = false;
                C8051x0 c8051x0 = c7961e.f17720e;
                if (c8051x0 != null) {
                    C7916e c7916e = c8051x0.f17888a;
                    if (c7916e != null) {
                        C7923i c7923i = c7916e.f17595a;
                        for (EnumC7919c enumC7919c : EnumC7919c.values()) {
                            if (enumC7919c != EnumC7919c.NONE && (c7921g = (C7921g) c7923i.f17605a.get(enumC7919c)) != null && c7921g.f17601a != 0) {
                                c7916e.m20357a(enumC7919c, c7921g);
                            }
                        }
                        AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, EnumC7917a.NEW_SESSION, EnumC7919c.NONE));
                    }
                    c7961e.f17720e.f17891d.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                    c7961e.f17720e.f17890c.clear();
                }
            }
            C9197v1 c9197v1 = c7961e.f17719d;
            if (c9197v1 != null) {
                c9197v1.f21501d = false;
                c9197v1.f21503f = 0L;
                HandlerC9191t1 handlerC9191t1 = c9197v1.f21500c;
                if (handlerC9191t1 != null) {
                    handlerC9191t1.removeMessages(1932593528);
                }
            }
        }
        for (C9209z0 c9209z0 : this.f17699a.f17716a) {
            if (c9209z0.f21517c) {
                c9209z0.f21517c = false;
                C7961e c7961e2 = IAConfigManager.f17654M.f17691w.f17889b;
                if (c7961e2 != null) {
                    c7961e2.f17716a.remove(c9209z0);
                }
                String strM21958a = AbstractC9139c0.m21958a(System.currentTimeMillis(), c9209z0.f21516b, 0L);
                c9209z0.f21516b = 0L;
                EnumC8424u enumC8424u = EnumC8424u.TIME_SPENT_IN_PLAY_STORE;
                AbstractC8236x abstractC8236x = c9209z0.f21515a;
                InneractiveAdRequest inneractiveAdRequest = abstractC8236x == null ? null : abstractC8236x.f18373a;
                AbstractC9087e abstractC9087e = abstractC8236x == null ? null : abstractC8236x.f18374b;
                JSONArray jSONArrayM20435b = (abstractC8236x == null || (c8006r = abstractC8236x.f18375c) == null) ? null : c8006r.m20435b();
                C8428w c8428w = new C8428w(abstractC9087e);
                c8428w.f18755c = enumC8424u;
                c8428w.f18753a = inneractiveAdRequest;
                c8428w.f18756d = jSONArrayM20435b;
                c8428w.m20807a("appstore_time", strM21958a);
                c8428w.m20808a((String) null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
