package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    /* JADX INFO: renamed from: d */
    public void m23021d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m23027v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m23025i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m23029w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m23023e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m23020d(String str) {
        m23021d(str, null);
    }

    /* JADX INFO: renamed from: v */
    public void m23026v(String str) {
        m23027v(str, null);
    }

    /* JADX INFO: renamed from: i */
    public void m23024i(String str) {
        m23025i(str, null);
    }

    /* JADX INFO: renamed from: w */
    public void m23028w(String str) {
        m23029w(str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m23022e(String str) {
        m23023e(str, null);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }
}
