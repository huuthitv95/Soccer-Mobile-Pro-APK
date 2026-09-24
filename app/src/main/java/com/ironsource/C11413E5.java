package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: renamed from: com.ironsource.E5 */
/* JADX INFO: loaded from: classes6.dex */
class C11413E5 {

    /* JADX INFO: renamed from: a */
    static final String f24235a = "ironbeast";

    /* JADX INFO: renamed from: b */
    static final String f24236b = "outcome";

    /* JADX INFO: renamed from: c */
    static final int f24237c = 4;

    /* JADX INFO: renamed from: d */
    static final int f24238d = 3;

    /* JADX INFO: renamed from: e */
    static final int f24239e = 2;

    /* JADX INFO: renamed from: f */
    static final int f24240f = 0;

    C11413E5() {
    }

    /* JADX INFO: renamed from: a */
    static AbstractC12157e m25661a(String str, int i) {
        if (f24235a.equals(str)) {
            return new C12168ea(i);
        }
        if (f24236b.equals(str)) {
            return new C11618Pc(i);
        }
        if (i == 2) {
            return new C12168ea(i);
        }
        if (i == 3) {
            return new C11618Pc(i);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
