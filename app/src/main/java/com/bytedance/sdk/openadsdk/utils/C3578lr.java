package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3578lr {

    /* JADX INFO: renamed from: ik */
    private static Boolean f13195ik;

    /* JADX INFO: renamed from: lr */
    private static Boolean f13196lr;

    /* JADX INFO: renamed from: ri */
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.wjv> f13197ri;

    /* JADX INFO: renamed from: ik */
    public static com.bytedance.sdk.openadsdk.core.model.wjv m16534ik() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.wjv> softReference = f13197ri;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16535lr() {
        try {
            if (f13195ik == null) {
                boolean z = true;
                if (C3606fi.m16703ri("iv_rv_load_show_new", 0) != 1) {
                    z = false;
                }
                f13195ik = Boolean.valueOf(z);
            }
            return f13195ik.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16536ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar == null) {
            return;
        }
        f13197ri = new SoftReference<>(wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16537ri() {
        try {
            if (f13196lr == null) {
                boolean z = true;
                if (C3606fi.m16703ri("net_opt_multiple_domain_retry", 0) != 1) {
                    z = false;
                }
                f13196lr = Boolean.valueOf(z);
            }
            return f13196lr.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }
}
