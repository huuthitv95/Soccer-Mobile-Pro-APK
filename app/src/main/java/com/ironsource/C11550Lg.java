package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Lg */
/* JADX INFO: loaded from: classes6.dex */
public final class C11550Lg {

    /* JADX INFO: renamed from: a */
    private volatile String f25090a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f25091b;

    /* JADX INFO: renamed from: c */
    private volatile int f25092c;

    /* JADX INFO: renamed from: d */
    private volatile int f25093d = -1;

    /* JADX INFO: renamed from: a */
    public final void m26444a(int i, String controllerUrl) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        this.f25092c = i;
        this.f25093d = i;
        this.f25091b = true;
        this.f25090a = controllerUrl;
        IronLog.INTERNAL.verbose("Reset load state for attempt " + i + ", pending URL: " + controllerUrl);
    }

    /* JADX INFO: renamed from: b */
    public final String m26445b() {
        if (this.f25093d != this.f25092c) {
            IronLog.INTERNAL.verbose("Ignoring stale onPageFinished callback from attempt " + this.f25093d + ", current attempt is " + this.f25092c);
            return null;
        }
        this.f25091b = false;
        if (this.f25090a == null) {
            return null;
        }
        IronLog.INTERNAL.verbose("BLANK_PAGE load completed for attempt " + this.f25092c + ", now loading controller");
        String str = this.f25090a;
        this.f25090a = null;
        return str;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m26446c() {
        return this.f25091b;
    }

    /* JADX INFO: renamed from: a */
    public final void m26443a() {
        this.f25090a = null;
        this.f25091b = false;
        this.f25092c = 0;
        this.f25093d = -1;
    }
}
