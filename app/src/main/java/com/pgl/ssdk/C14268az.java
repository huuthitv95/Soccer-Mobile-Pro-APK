package com.pgl.ssdk;

import java.util.Calendar;

/* JADX INFO: renamed from: com.pgl.ssdk.az */
/* JADX INFO: loaded from: classes7.dex */
public class C14268az {
    /* JADX INFO: renamed from: a */
    public static void m43031a(long j) {
        try {
            Thread.currentThread();
            Thread.sleep(j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m43032a(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(6) == calendar2.get(6);
    }
}
