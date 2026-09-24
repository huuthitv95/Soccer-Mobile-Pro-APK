package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: com.apm.insight.runtime.m */
/* JADX INFO: compiled from: NpthHandlerThread.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1471m {

    /* JADX INFO: renamed from: a */
    private static volatile C1474p f883a;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f884b;

    /* JADX INFO: renamed from: a */
    public static C1474p m1704a() {
        if (f883a == null) {
            m1705b();
        }
        return f883a;
    }

    /* JADX INFO: renamed from: b */
    private static HandlerThread m1705b() {
        if (f883a == null) {
            synchronized (C1471m.class) {
                if (f883a == null) {
                    C1474p c1474p = new C1474p("default_npth_thread");
                    f883a = c1474p;
                    c1474p.m1737b();
                }
            }
        }
        return f883a.m1738c();
    }
}
