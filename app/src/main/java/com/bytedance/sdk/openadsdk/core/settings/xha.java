package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3435lr;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: ri */
    private static final AtomicInteger f11650ri = new AtomicInteger(1);

    /* JADX INFO: renamed from: ri */
    protected static void m14906ri(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            try {
                AtomicInteger atomicInteger = f11650ri;
                if (atomicInteger.get() != i) {
                    try {
                        atomicInteger.set(i);
                    } catch (Throwable th) {
                        th = th;
                        C2707ac.m10196ik("SdkSwitch", th.getMessage());
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (z) {
                Log.e("SdkSwitch", "switch status changed: " + m14907ri());
                if (m14907ri()) {
                    C3435lr.m15665lr();
                } else {
                    C3435lr.m15664ik();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m14907ri() {
        return f11650ri.get() == 1;
    }
}
