package androidx.media3.common.util;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes.dex */
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

    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            /* JADX INFO: renamed from: d */
            public void mo293d(String str, String str2, Throwable th) {
                android.util.Log.d(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* JADX INFO: renamed from: i */
            public void mo295i(String str, String str2, Throwable th) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* JADX INFO: renamed from: w */
            public void mo296w(String str, String str2, Throwable th) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* JADX INFO: renamed from: e */
            public void mo294e(String str, String str2, Throwable th) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th));
            }
        };

        /* JADX INFO: renamed from: d */
        void mo293d(String str, String str2, Throwable th);

        /* JADX INFO: renamed from: e */
        void mo294e(String str, String str2, Throwable th);

        /* JADX INFO: renamed from: i */
        void mo295i(String str, String str2, Throwable th);

        /* JADX INFO: renamed from: w */
        void mo296w(String str, String str2, Throwable th);
    }

    private Log() {
    }

    @Pure
    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
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
    /* JADX INFO: renamed from: d */
    public static void m285d(String str, String str2) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.mo293d(str, str2, null);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m286d(String str, String str2, Throwable th) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.mo293d(str, str2, th);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: i */
    public static void m289i(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.mo295i(str, str2, null);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: i */
    public static void m290i(String str, String str2, Throwable th) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.mo295i(str, str2, th);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: w */
    public static void m291w(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.mo296w(str, str2, null);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: w */
    public static void m292w(String str, String str2, Throwable th) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.mo296w(str, str2, th);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static void m287e(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.mo294e(str, str2, null);
            }
        }
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static void m288e(String str, String str2, Throwable th) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.mo294e(str, str2, th);
            }
        }
    }

    @Pure
    public static String getThrowableString(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (lock) {
            if (isCausedByUnknownHostException(th)) {
                return "UnknownHostException (no network)";
            }
            if (!logStackTraces) {
                return th.getMessage();
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    @Pure
    public static String appendThrowableString(String str, Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
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
}
