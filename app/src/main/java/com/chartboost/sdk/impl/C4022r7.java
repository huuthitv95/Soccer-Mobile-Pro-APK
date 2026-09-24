package com.chartboost.sdk.impl;

import com.chartboost.sdk.Chartboost;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4022r7 {

    /* JADX INFO: renamed from: a */
    public static final C4022r7 f16130a = new C4022r7();

    /* JADX INFO: renamed from: b */
    public static InterfaceC3911m7 f16131b;

    /* JADX INFO: renamed from: a */
    public static final void m19308a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        C4022r7 c4022r7 = f16130a;
        Intrinsics.checkNotNull(th);
        if (c4022r7.m19311b(th)) {
            try {
                InterfaceC3911m7 interfaceC3911m7 = f16131b;
                if (interfaceC3911m7 != null) {
                    interfaceC3911m7.track((AbstractC3738ei) new C3796h7(InterfaceC3807hi.i.DISMISS_MISSING, c4022r7.m19309a(th), null, null, null, 28, null));
                }
            } catch (Exception unused) {
            }
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m19309a(Throwable th) {
        String string = new JSONObject().put("reason", "dismiss_event due to the unhandled exceptions").put("error", String.valueOf(th)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: a */
    public final void m19310a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        f16131b = Chartboost.isSdkStarted() ? AbstractC4142wh.m19810a() : null;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.chartboost.sdk.impl.r7$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                C4022r7.m19308a(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19311b(Throwable th) {
        String className;
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null) {
                Intrinsics.checkNotNull(className);
                if (StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
