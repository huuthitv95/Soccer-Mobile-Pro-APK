package com.ironsource.mediationsdk.logger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class IronSourceLogger {

    /* JADX INFO: renamed from: a */
    int f31298a;

    /* JADX INFO: renamed from: b */
    private String f31299b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    IronSourceLogger(String str) {
        this.f31299b = str;
        this.f31298a = 0;
    }

    /* JADX INFO: renamed from: a */
    int m32566a() {
        return this.f31298a;
    }

    /* JADX INFO: renamed from: b */
    String m32567b() {
        return this.f31299b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f31299b;
            if (str != null && str.equals(ironSourceLogger.f31299b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i) {
        this.f31298a = i;
    }

    IronSourceLogger(String str, int i) {
        this.f31299b = str;
        this.f31298a = i;
    }
}
