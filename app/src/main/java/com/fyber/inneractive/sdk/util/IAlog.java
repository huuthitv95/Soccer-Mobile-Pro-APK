package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.C8266a;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.ironsource.C11744X3;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IAlog {

    /* JADX INFO: renamed from: a */
    public static int f21426a = 4;

    /* JADX INFO: renamed from: b */
    public static final C8266a f21427b = new C8266a();

    /* JADX INFO: renamed from: c */
    public static final C9205x0 f21428c = new C9205x0();

    /* JADX INFO: renamed from: a */
    public static String m21942a(Class cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + C11744X3.j.f26438d + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }

    /* JADX INFO: renamed from: a */
    public static String m21943a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + C11744X3.j.f26438d + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    /* JADX INFO: renamed from: a */
    public static void m21944a(String str, Throwable th, Object... objArr) {
        Iterator it = f21428c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th, objArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21945a(String str, Object... objArr) {
        Iterator it = f21428c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21946b(String str, Object... objArr) {
        Iterator it = f21428c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, null, objArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m21947c(String str, Object... objArr) {
        Iterator it = f21428c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m21948d(String str, Object... objArr) {
        Iterator it = f21428c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(1, null, str, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m21949e(String str, Object... objArr) {
        Iterator it = f21428c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m21950f(String str, Object... objArr) {
        Iterator it = f21428c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }
}
