package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.external.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8056c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public SharedPreferences f17940a;

    /* JADX INFO: renamed from: b */
    public final Thread.UncaughtExceptionHandler f17941b = Thread.getDefaultUncaughtExceptionHandler();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        SharedPreferences sharedPreferences = this.f17940a;
        if (sharedPreferences != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.getBuffer().toString();
            if (string.contains("com.fyber.inneractive")) {
                sharedPreferences.edit().putString("FyberExceptionKey", string).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f17941b;
        if (uncaughtExceptionHandler != null) {
            try {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Throwable unused) {
            }
        }
    }
}
