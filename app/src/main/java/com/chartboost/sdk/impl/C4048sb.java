package com.chartboost.sdk.impl;

import android.util.Log;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.chartboost.sdk.LoggingLevel;
import com.facebook.internal.security.CertificateUtil;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.sb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4048sb {

    /* JADX INFO: renamed from: a */
    public static final C4048sb f16248a = new C4048sb();

    /* JADX INFO: renamed from: b */
    public static LoggingLevel f16249b = LoggingLevel.INTEGRATION;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f16250c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static Boolean f16251d;

    /* JADX INFO: renamed from: e */
    public static boolean f16252e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.sb$a */
    public enum a {
        DEBUG,
        ERROR,
        WARNING,
        INFO,
        VERBOSE,
        WTF;


        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ EnumEntries f16260i = EnumEntriesKt.enumEntries(m19423a());
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.sb$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16261a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VERBOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.WTF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f16261a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m19406a(C4048sb c4048sb, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return c4048sb.m19418a(i);
    }

    /* JADX INFO: renamed from: a */
    public static final void m19407a(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f16248a.m19419a(a.DEBUG, msg, th);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19408a(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m19407a(str, th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m19409b(C4048sb c4048sb, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return c4048sb.m19421b(i);
    }

    /* JADX INFO: renamed from: b */
    public static final void m19410b(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f16248a.m19419a(a.ERROR, msg, th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19411b(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m19410b(str, th);
    }

    /* JADX INFO: renamed from: c */
    public static final void m19412c(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f16248a.m19419a(a.INFO, msg, th);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m19413c(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m19412c(str, th);
    }

    /* JADX INFO: renamed from: d */
    public static final void m19414d(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f16248a.m19419a(a.VERBOSE, msg, th);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m19415d(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m19414d(str, th);
    }

    /* JADX INFO: renamed from: e */
    public static final void m19416e(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f16248a.m19419a(a.WARNING, msg, th);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m19417e(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m19416e(str, th);
    }

    /* JADX INFO: renamed from: a */
    public final String m19418a(int i) {
        StackTraceElement stackTraceElementM19422c = m19422c(i);
        if (stackTraceElementM19422c == null) {
            return "";
        }
        String str = stackTraceElementM19422c.getClassName() + CertificateUtil.DELIMITER + stackTraceElementM19422c.getMethodName() + CertificateUtil.DELIMITER + stackTraceElementM19422c.getLineNumber();
        ConcurrentHashMap concurrentHashMap = f16250c;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            if (concurrentHashMap.size() >= 1000) {
                Set setKeySet = concurrentHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                Iterator it = CollectionsKt.take(setKeySet, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION).iterator();
                while (it.hasNext()) {
                    f16250c.remove((String) it.next());
                }
            }
            String className = stackTraceElementM19422c.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            obj = StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + stackTraceElementM19422c.getMethodName() + "():";
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
            if (objPutIfAbsent != null) {
                obj = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return (String) obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m19419a(a aVar, String str, Throwable th) {
        if (f16249b == LoggingLevel.ALL || f16249b == LoggingLevel.INTEGRATION) {
            String str2 = (m19420a() ? m19406a(this, 0, 1, (Object) null) : m19409b(this, 0, 1, (Object) null)) + " " + str;
            switch (b.f16261a[aVar.ordinal()]) {
                case 1:
                    Log.d("[ChartboostMonetization]", str2, th);
                    break;
                case 2:
                    Log.e("[ChartboostMonetization]", str2, th);
                    break;
                case 3:
                    Log.w("[ChartboostMonetization]", str2, th);
                    break;
                case 4:
                    Log.i("[ChartboostMonetization]", str2, th);
                    break;
                case 5:
                    Log.v("[ChartboostMonetization]", str2, th);
                    break;
                case 6:
                    Log.wtf("[ChartboostMonetization]", str2, th);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19420a() {
        Boolean bool = f16251d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (f16252e) {
            return false;
        }
        try {
            f16252e = true;
            C3920mg c3920mg = (C3920mg) C3678c4.f13658b.mo17019a().mo18988b().get();
            boolean z = c3920mg != null ? c3920mg.f15381m : false;
            f16251d = Boolean.valueOf(z);
            return z;
        } catch (Exception unused) {
            f16251d = Boolean.FALSE;
            return false;
        } finally {
            f16252e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m19421b(int i) {
        StackTraceElement stackTraceElementM19422c = m19422c(i);
        if (stackTraceElementM19422c == null) {
            return "";
        }
        String className = stackTraceElementM19422c.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        String str = StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + stackTraceElementM19422c.getMethodName() + "():";
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: c */
    public final StackTraceElement m19422c(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i) {
            return stackTrace[i];
        }
        return null;
    }
}
