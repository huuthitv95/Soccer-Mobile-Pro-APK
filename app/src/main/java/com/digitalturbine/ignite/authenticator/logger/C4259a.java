package com.digitalturbine.ignite.authenticator.logger;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.logger.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4259a {

    /* JADX INFO: renamed from: b */
    public static final C4259a f17346b = new C4259a();

    /* JADX INFO: renamed from: a */
    public ILogger f17347a;

    /* JADX INFO: renamed from: a */
    public static void m20308a(String str, Object... objArr) {
        ILogger iLogger = f17346b.f17347a;
        if (iLogger != null) {
            iLogger.mo20303d(str, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20309b(String str, Object... objArr) {
        ILogger iLogger = f17346b.f17347a;
        if (iLogger != null) {
            iLogger.mo20307w(str, objArr);
        }
    }
}
