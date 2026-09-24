package com.bykv.p028vk.openvk.preload.geckox.logger;

/* JADX INFO: loaded from: classes3.dex */
public class GeckoLogger {
    private static boolean DEBUG;
    private static Logger sLogger = new DefaultLogger();

    /* JADX INFO: renamed from: d */
    public static void m6040d(String str, Object... objArr) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.mo6036d(str, objArr);
    }

    public static void disable() {
        DEBUG = false;
    }

    /* JADX INFO: renamed from: e */
    public static void m6041e(String str, String str2, Throwable th) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.mo6037e(str, str2, th);
    }

    public static void enable() {
        DEBUG = true;
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    public static void redirect(Logger logger) {
        sLogger = logger;
    }

    /* JADX INFO: renamed from: w */
    public static void m6042w(String str, String str2) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.mo6038w(str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m6043w(String str, String str2, Throwable th) {
        Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.mo6039w(str, str2, th);
    }
}
