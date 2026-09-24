package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.d */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8922d {

    /* JADX INFO: renamed from: a */
    public static final Class f20995a;

    /* JADX INFO: renamed from: b */
    public static final boolean f20996b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f20995a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f20996b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21528a() {
        return (f20995a == null || f20996b) ? false : true;
    }
}
