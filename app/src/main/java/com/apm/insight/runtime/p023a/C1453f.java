package com.apm.insight.runtime.p023a;

import android.content.Context;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.Header;
import com.apm.insight.runtime.C1468j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.f */
/* JADX INFO: compiled from: CrashContextAssembly.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1453f {

    /* JADX INFO: renamed from: a */
    private static volatile C1453f f833a;

    /* JADX INFO: renamed from: b */
    private Context f834b;

    /* JADX INFO: renamed from: c */
    private Map<CrashType, AbstractC1450c> f835c = new HashMap();

    /* JADX INFO: renamed from: d */
    private C1449b f836d;

    /* JADX INFO: renamed from: e */
    private C1451d f837e;

    /* JADX INFO: renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    /* JADX INFO: compiled from: CrashContextAssembly.java */
    /* JADX INFO: loaded from: classes9.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f838a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f838a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f838a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f838a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f838a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f838a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f838a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f838a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f838a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private C1453f(Context context) {
        this.f834b = context;
        try {
            this.f836d = C1449b.m1566d();
            this.f837e = new C1451d(this.f834b);
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
    }

    /* JADX INFO: renamed from: a */
    private AbstractC1450c m1607a(CrashType crashType) {
        AbstractC1450c c1457j = this.f835c.get(crashType);
        if (c1457j != null) {
            return c1457j;
        }
        switch (AnonymousClass1.f838a[crashType.ordinal()]) {
            case 1:
                c1457j = new C1457j(this.f834b, this.f836d, this.f837e);
                break;
            case 2:
                c1457j = new C1458k(this.f834b, this.f836d, this.f837e);
                break;
            case 3:
                c1457j = new C1459l(this.f834b, this.f836d, this.f837e);
                break;
            case 4:
                c1457j = new C1448a(this.f834b, this.f836d, this.f837e);
                break;
            case 5:
                c1457j = new C1455h(this.f834b, this.f836d, this.f837e);
                break;
            case 6:
                c1457j = new C1454g(this.f834b, this.f836d, this.f837e);
                break;
            case 7:
                c1457j = new C1452e(this.f834b, this.f836d, this.f837e);
                break;
            case 8:
                c1457j = new C1456i(this.f834b, this.f836d, this.f837e);
                break;
        }
        if (c1457j != null) {
            this.f835c.put(crashType, c1457j);
        }
        return c1457j;
    }

    /* JADX INFO: renamed from: a */
    public static C1453f m1608a() {
        if (f833a == null) {
            Context contextM1032g = C1390e.m1032g();
            if (contextM1032g == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f833a = new C1453f(contextM1032g);
        }
        return f833a;
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1609a(CrashType crashType, C1395a c1395a) {
        AbstractC1450c abstractC1450cM1607a;
        return (crashType == null || (abstractC1450cM1607a = m1607a(crashType)) == null) ? c1395a : abstractC1450cM1607a.m1602a(c1395a, null, false);
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1610a(CrashType crashType, AbstractC1450c.a aVar) {
        AbstractC1450c abstractC1450cM1607a;
        if (crashType == null || (abstractC1450cM1607a = m1607a(crashType)) == null) {
            return null;
        }
        return abstractC1450cM1607a.m1602a(null, aVar, true);
    }

    /* JADX INFO: renamed from: a */
    public final C1395a m1611a(List<C1395a> list, JSONArray jSONArray) {
        if (list.isEmpty()) {
            return null;
        }
        C1395a c1395a = new C1395a();
        JSONArray jSONArray2 = new JSONArray();
        Iterator<C1395a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next().m1102c());
        }
        c1395a.m1095a("data", (Object) jSONArray2);
        c1395a.m1095a("all_data", (Object) jSONArray);
        Header headerM1061a = Header.m1061a(this.f834b);
        Header.m1062a(headerM1061a);
        headerM1061a.m1073c();
        headerM1061a.m1074d();
        headerM1061a.m1075e();
        Header.m1065b(headerM1061a);
        c1395a.m1089a(headerM1061a);
        return c1395a;
    }
}
