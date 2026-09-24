package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.a2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11794a2 {

    /* JADX INFO: renamed from: a */
    public static final C11794a2 f26720a = new C11794a2();

    /* JADX INFO: renamed from: b */
    public static final String f26721b = "trials_fail";

    /* JADX INFO: renamed from: c */
    public static final String f26722c = "parsing";

    /* JADX INFO: renamed from: d */
    public static final String f26723d = "other";

    /* JADX INFO: renamed from: e */
    public static final String f26724e = "disabled";

    /* JADX INFO: renamed from: f */
    public static final String f26725f = "-1";

    private C11794a2() {
    }

    /* JADX INFO: renamed from: a */
    public final String m28098a(boolean z) {
        if (!z) {
            return f26725f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m28097a(C11794a2 c11794a2, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c11794a2.m28099a(z, num);
    }

    /* JADX INFO: renamed from: a */
    public final String m28099a(boolean z, Integer num) {
        if (!z) {
            return f26724e;
        }
        if (num != null && num.intValue() == 1003) {
            return f26722c;
        }
        if (num != null && num.intValue() == 1008) {
            return f26722c;
        }
        if (num != null && num.intValue() == 1002) {
            return f26722c;
        }
        if (num != null && num.intValue() == 1006) {
            return f26721b;
        }
        return (num != null && num.intValue() == 1001) ? f26721b : "other";
    }
}
