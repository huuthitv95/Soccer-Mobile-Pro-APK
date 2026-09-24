package com.mbridge.msdk.config.component.common.express.operator.parts;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.parts.a */
/* JADX INFO: compiled from: ExpressionResult.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12746a {

    /* JADX INFO: renamed from: a */
    private final boolean f33907a;

    /* JADX INFO: renamed from: b */
    private final Object f33908b;

    private C12746a(boolean z, Object obj) {
        this.f33907a = z;
        this.f33908b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C12746a m35016a(Object obj) {
        return new C12746a(true, obj);
    }

    /* JADX INFO: renamed from: c */
    public static C12746a m35017c() {
        return new C12746a(false, null);
    }

    /* JADX INFO: renamed from: b */
    public boolean m35019b() {
        return this.f33907a;
    }

    /* JADX INFO: renamed from: a */
    public Object m35018a() {
        Object obj = this.f33908b;
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        return obj instanceof Integer ? String.valueOf(obj) : obj;
    }
}
