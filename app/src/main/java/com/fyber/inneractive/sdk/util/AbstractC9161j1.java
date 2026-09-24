package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.j1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9161j1 {
    /* JADX INFO: renamed from: a */
    public static boolean m21972a(String str) {
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        return property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains(AppMeasurement.CRASH_ORIGIN);
    }
}
