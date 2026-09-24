package com.fyber.inneractive.sdk.util;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.c0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9139c0 {
    /* JADX INFO: renamed from: a */
    public static String m21957a(int i) {
        if (i <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i;
        long hours = timeUnit.toHours(j);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        long millis = j - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format("%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))));
    }

    /* JADX INFO: renamed from: a */
    public static String m21958a(long j, long j2, long j3) {
        long j4 = (j - j2) - j3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j4);
        long millis = timeUnit.toMillis(j4 - TimeUnit.SECONDS.toMillis(seconds));
        Locale locale = Locale.US;
        return seconds + "." + millis;
    }
}
