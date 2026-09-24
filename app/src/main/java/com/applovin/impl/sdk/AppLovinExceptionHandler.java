package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.ironsource.C11744X3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e */
    private static final AppLovinExceptionHandler f2833e = new AppLovinExceptionHandler();

    /* JADX INFO: renamed from: a */
    private final Set f2834a = new HashSet(2);

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f2835b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f2836c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    private Thread.UncaughtExceptionHandler f2837d;

    /* JADX INFO: renamed from: a */
    private String m4391a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f2833e;
    }

    public void addSdk(C1748l c1748l) {
        if (this.f2834a.contains(c1748l)) {
            return;
        }
        this.f2834a.add(c1748l);
    }

    public void enable() {
        if (this.f2835b.compareAndSet(false, true)) {
            this.f2837d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.f2836c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (C1748l c1748l : this.f2834a) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) c1748l.m4801a(C1831z4.f3757K6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", m4391a(th, num.intValue()));
            }
            c1748l.m4764E().m2682d(C1548f2.f1509W0, mapHashMap);
            c1748l.m4768G().trackEventSynchronously(C11744X3.i.f26363e0);
            jLongValue = ((Long) c1748l.m4801a(C1831z4.f4022q3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2837d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
