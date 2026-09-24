package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.C11744X3;
import com.ironsource.environment.ContextProvider;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.logger.a */
/* JADX INFO: loaded from: classes6.dex */
public class C12360a extends IronSourceLogger {

    /* JADX INFO: renamed from: c */
    public static final String f31304c = "console";

    /* JADX INFO: renamed from: d */
    public static final String f31305d = "LevelPlaySDK: ";

    private C12360a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        StringBuilder sb = new StringBuilder("UIThread: ");
        sb.append(Looper.getMainLooper() == Looper.myLooper());
        sb.append(" ");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("Activity: ");
        sb2.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb2.append(" ");
        String string2 = sb2.toString();
        if (i == 0) {
            Log.v(f31305d + ironSourceTag, string + string2 + str);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                Log.w(f31305d + ironSourceTag, str);
                return;
            } else if (i == 3) {
                Log.e(f31305d + ironSourceTag, str);
                return;
            } else if (i != 4) {
                return;
            }
        }
        Log.i(f31305d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th) + C11744X3.j.f26440e, 3);
    }

    public C12360a(int i) {
        super("console", i);
    }
}
