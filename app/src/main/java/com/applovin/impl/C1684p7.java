package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.applovin.impl.p7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1684p7 {

    /* JADX INFO: renamed from: a */
    private final C1748l f2543a;

    /* JADX INFO: renamed from: b */
    private String f2544b;

    /* JADX INFO: renamed from: c */
    private final String f2545c = m3888a(C1511b5.f1172l);

    /* JADX INFO: renamed from: d */
    private final String f2546d = m3888a(C1511b5.f1173m);

    /* JADX INFO: renamed from: e */
    private String f2547e = (String) C1521c5.m2201a(C1511b5.f1174n, (Object) null, C1748l.m4756p());

    /* JADX INFO: renamed from: f */
    private String f2548f = (String) C1521c5.m2201a(C1511b5.f1175o, (Object) null, C1748l.m4756p());

    public C1684p7(C1748l c1748l) {
        this.f2543a = c1748l;
        m3892a(m3890f());
    }

    /* JADX INFO: renamed from: a */
    private String m3888a(C1511b5 c1511b5) {
        String str = (String) C1521c5.m2201a(c1511b5, (Object) null, C1748l.m4756p());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        C1521c5.m2207b(c1511b5, lowerCase, C1748l.m4756p());
        return lowerCase;
    }

    /* JADX INFO: renamed from: a */
    public static String m3889a(C1748l c1748l) {
        C1511b5 c1511b5 = C1511b5.f1176p;
        String str = (String) c1748l.m4799a(c1511b5);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        c1748l.m4818b(c1511b5, strValueOf);
        return strValueOf;
    }

    /* JADX INFO: renamed from: f */
    private String m3890f() {
        if (!((Boolean) this.f2543a.m4801a(C1831z4.f3786O3)).booleanValue()) {
            this.f2543a.m4823c(C1511b5.f1171k);
        }
        String str = (String) this.f2543a.m4799a(C1511b5.f1171k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f2543a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2543a.m4782Q().m5171a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public String m3891a() {
        return this.f2546d;
    }

    /* JADX INFO: renamed from: a */
    public void m3892a(String str) {
        if (((Boolean) this.f2543a.m4801a(C1831z4.f3786O3)).booleanValue()) {
            this.f2543a.m4818b(C1511b5.f1171k, str);
        }
        this.f2544b = str;
        this.f2543a.m4856u().m4713b(str, m3891a());
    }

    /* JADX INFO: renamed from: b */
    public String m3893b() {
        return this.f2547e;
    }

    /* JADX INFO: renamed from: b */
    public void m3894b(String str) {
        this.f2547e = str;
        C1521c5.m2207b(C1511b5.f1174n, str, C1748l.m4756p());
    }

    /* JADX INFO: renamed from: c */
    public String m3895c() {
        return this.f2545c;
    }

    /* JADX INFO: renamed from: c */
    public void m3896c(String str) {
        this.f2548f = str;
        C1521c5.m2207b(C1511b5.f1175o, str, C1748l.m4756p());
    }

    /* JADX INFO: renamed from: d */
    public String m3897d() {
        return this.f2548f;
    }

    /* JADX INFO: renamed from: e */
    public String m3898e() {
        return this.f2544b;
    }
}
