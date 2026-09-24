package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.ironsource.C11540L6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.s1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9188s1 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f21485a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b */
    public volatile String f21486b = null;

    /* JADX INFO: renamed from: c */
    public Context f21487c = null;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f21488d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final RunnableC9179p1 f21489e = new RunnableC9179p1(this);

    /* JADX INFO: renamed from: a */
    public final String m22016a() {
        if (!TextUtils.isEmpty(this.f21486b)) {
            return this.f21486b;
        }
        if (this.f21489e != null && this.f21485a.get()) {
            Handler handler = AbstractC9183r.f21478b;
            handler.removeCallbacks(this.f21489e);
            handler.postDelayed(this.f21489e, 50L);
        }
        return System.getProperty("http.agent");
    }

    /* JADX INFO: renamed from: b */
    public final void m22017b() {
        if (this.f21487c == null || !TextUtils.isEmpty(this.f21486b)) {
            return;
        }
        this.f21486b = this.f21487c.getSharedPreferences("fyber.ua", 0).getString(C11540L6.f24966d0, null);
        if (!TextUtils.isEmpty(this.f21486b)) {
            IAlog.m21945a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.f21488d.compareAndSet(false, true);
        }
        AbstractC9183r.f21477a.execute(new RunnableC9185r1(this));
    }

    /* JADX INFO: renamed from: c */
    public final void m22018c() {
        String defaultUserAgent;
        Context context = this.f21487c;
        if (context != null) {
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                this.f21485a.set(false);
                defaultUserAgent = null;
            }
            if (TextUtils.isEmpty(defaultUserAgent)) {
                return;
            }
            this.f21486b = defaultUserAgent;
            if (!TextUtils.isEmpty(this.f21486b)) {
                IAlog.m21945a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.f21488d.compareAndSet(false, true);
            }
            AbstractC9183r.f21477a.execute(new RunnableC9182q1(this, defaultUserAgent));
        }
    }
}
