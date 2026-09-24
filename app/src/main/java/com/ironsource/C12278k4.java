package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.k4 */
/* JADX INFO: loaded from: classes6.dex */
public class C12278k4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private Thread.UncaughtExceptionHandler f30728a;

    C12278k4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f30728a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C12296l4 c12296l4 = new C12296l4(th);
        if (c12296l4.m32054d()) {
            new C11503J5(c12296l4.m32052b(), "" + System.currentTimeMillis(), "Crash").m26176a();
        }
        this.f30728a.uncaughtException(thread, th);
    }
}
