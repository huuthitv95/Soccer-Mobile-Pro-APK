package com.applovin.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.applovin.impl.j1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1587j1 {

    /* JADX INFO: renamed from: a */
    private static final SimpleDateFormat f1888a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f1888a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m2978a(long j) {
        return f1888a.format(new Date(j));
    }
}
