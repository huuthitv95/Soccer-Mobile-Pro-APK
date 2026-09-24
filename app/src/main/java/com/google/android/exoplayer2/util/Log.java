package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();
    private static Logger logger = Logger.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    /* JADX INFO: loaded from: classes9.dex */
    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: com.google.android.exoplayer2.util.Log.Logger.1
            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* JADX INFO: renamed from: d */
            public void mo22242d(String str, String str2) {
                android.util.Log.d(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* JADX INFO: renamed from: e */
            public void mo22243e(String str, String str2) {
                android.util.Log.e(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* JADX INFO: renamed from: i */
            public void mo22244i(String str, String str2) {
                android.util.Log.i(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* JADX INFO: renamed from: w */
            public void mo22245w(String str, String str2) {
                android.util.Log.w(str, str2);
            }
        };

        /* JADX INFO: renamed from: d */
        void mo22242d(String str, String str2);

        /* JADX INFO: renamed from: e */
        void mo22243e(String str, String str2);

        /* JADX INFO: renamed from: i */
        void mo22244i(String str, String str2);

        /* JADX INFO: renamed from: w */
        void mo22245w(String str, String str2);
    }

    private Log() {
    }

    @Pure
    private static String appendThrowableString(String str, Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m22234d(String str, String str2) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.mo22242d(str, str2);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m22235d(String str, String str2, Throwable th) {
        m22234d(str, appendThrowableString(str2, th));
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static void m22236e(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.mo22243e(str, str2);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static void m22237e(String str, String str2, Throwable th) {
        m22236e(str, appendThrowableString(str2, th));
    }

    @Pure
    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    @Pure
    public static String getThrowableString(Throwable th) {
        synchronized (lock) {
            try {
                if (th == null) {
                    return null;
                }
                if (isCausedByUnknownHostException(th)) {
                    return "UnknownHostException (no network)";
                }
                if (logStackTraces) {
                    return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: i */
    public static void m22238i(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.mo22244i(str, str2);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: i */
    public static void m22239i(String str, String str2, Throwable th) {
        m22238i(str, appendThrowableString(str2, th));
    }

    @Pure
    private static boolean isCausedByUnknownHostException(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (lock) {
            logStackTraces = z;
        }
    }

    public static void setLogger(Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    @Pure
    /* JADX INFO: renamed from: w */
    public static void m22240w(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.mo22245w(str, str2);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: w */
    public static void m22241w(String str, String str2, Throwable th) {
        m22240w(str, appendThrowableString(str2, th));
    }
}
