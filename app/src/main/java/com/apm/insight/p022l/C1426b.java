package com.apm.insight.p022l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: com.apm.insight.l.b */
/* JADX INFO: compiled from: DateUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426b {

    /* JADX INFO: renamed from: a */
    private static DateFormat f713a;

    /* JADX INFO: renamed from: a */
    public static DateFormat m1299a() {
        if (f713a == null) {
            f713a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f713a;
    }
}
