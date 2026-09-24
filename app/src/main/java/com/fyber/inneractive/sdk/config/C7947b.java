package com.fyber.inneractive.sdk.config;

import android.os.Handler;
import android.os.Message;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C7947b implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7961e f17697a;

    public C7947b(C7961e c7961e) {
        this.f17697a = c7961e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 123) {
            return false;
        }
        C7961e c7961e = this.f17697a;
        if (c7961e.f17717b.compareAndSet(false, true)) {
            if (c7961e.f17717b.get() && c7961e.f17719d != null) {
                IAlog.m21945a("startCounting", new Object[0]);
                C9197v1 c9197v1 = c7961e.f17719d;
                c9197v1.f21501d = false;
                c9197v1.f21500c.sendEmptyMessage(1932593528);
            }
            IAlog.m21945a("Pause signal", new Object[0]);
        }
        return true;
    }
}
