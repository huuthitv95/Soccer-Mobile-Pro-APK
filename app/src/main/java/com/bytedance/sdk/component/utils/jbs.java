package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.p165mj.p167ri.C2687ri;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {

    /* JADX INFO: renamed from: ri */
    private static volatile Handler f7766ri;

    /* JADX INFO: renamed from: lr */
    public static Handler m10234lr() {
        if (f7766ri == null) {
            synchronized (jbs.class) {
                if (f7766ri == null) {
                    f7766ri = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f7766ri;
    }

    /* JADX INFO: renamed from: ri */
    public static Handler m10235ri() {
        return C2687ri.m10091ri().m10094lr();
    }
}
