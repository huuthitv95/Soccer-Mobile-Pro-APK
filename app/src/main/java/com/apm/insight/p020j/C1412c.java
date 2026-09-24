package com.apm.insight.p020j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;

/* JADX INFO: renamed from: com.apm.insight.j.c */
/* JADX INFO: compiled from: DeviceIdTask.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1412c extends AbstractRunnableC1410a {
    C1412c(Handler handler) {
        super(handler, 15000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C1390e.m1024c().m1641b()) {
            return;
        }
        String strM1512d = C1390e.m1012a().m1512d();
        if (TextUtils.isEmpty(strM1512d) || "0".equals(strM1512d)) {
            m1189a(m1190b());
            C1373a.m861a((Object) "[DeviceIdTask] did is null, continue check.");
        } else {
            C1390e.m1024c().m1640a(strM1512d);
            C1373a.m861a((Object) "[DeviceIdTask] did is ".concat(String.valueOf(strM1512d)));
        }
    }
}
