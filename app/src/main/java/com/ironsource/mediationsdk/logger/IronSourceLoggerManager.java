package com.ironsource.mediationsdk.logger;

import com.ironsource.C12151db;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class IronSourceLoggerManager extends IronSourceLogger {

    /* JADX INFO: renamed from: d */
    private static volatile IronSourceLoggerManager f31302d;

    /* JADX INFO: renamed from: c */
    private final List<IronSourceLogger> f31303c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f31303c = new CopyOnWriteArrayList();
        m32571c();
    }

    /* JADX INFO: renamed from: c */
    private void m32571c() {
        this.f31303c.add(new C12360a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (f31302d == null) {
            synchronized (IronSourceLoggerManager.class) {
                if (f31302d == null) {
                    f31302d = new IronSourceLoggerManager("IronSourceLoggerManager");
                }
            }
        }
        return f31302d;
    }

    /* JADX INFO: renamed from: a */
    void m32572a(IronSourceLogger.IronSourceTag ironSourceTag, C12151db c12151db) {
        if (m32570a(c12151db.m31311a())) {
            return;
        }
        m32574a(ironSourceTag, c12151db.m31312c(), c12151db.m31311a());
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f31303c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (m32570a(i)) {
            return;
        }
        m32574a(ironSourceTag, str, i);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f31303c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f31303c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerM32569a = m32569a(str);
        if (ironSourceLoggerM32569a == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            return;
        }
        if (i < 0 || i > 3) {
            this.f31303c.remove(ironSourceLoggerM32569a);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
        ironSourceLoggerM32569a.setDebugLevel(i);
    }

    private IronSourceLoggerManager(String str, int i) {
        super(str, i);
        this.f31303c = new CopyOnWriteArrayList();
        m32571c();
    }

    /* JADX INFO: renamed from: a */
    void m32573a(IronSourceLogger.IronSourceTag ironSourceTag, C12151db c12151db, Throwable th) {
        if (m32570a(c12151db.m31311a())) {
            return;
        }
        logException(ironSourceTag, c12151db.m31312c(), th);
    }

    public static IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager logger = getLogger();
        logger.f31298a = i;
        return logger;
    }

    /* JADX INFO: renamed from: a */
    private boolean m32570a(int i) {
        return i < this.f31298a;
    }

    /* JADX INFO: renamed from: a */
    protected void m32574a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        for (IronSourceLogger ironSourceLogger : this.f31303c) {
            if (ironSourceLogger.m32566a() <= i) {
                ironSourceLogger.log(ironSourceTag, str, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private IronSourceLogger m32569a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f31303c) {
            if (ironSourceLogger.m32567b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}
