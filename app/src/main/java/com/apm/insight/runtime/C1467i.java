package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.apm.insight.C1373a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.apm.insight.runtime.i */
/* JADX INFO: compiled from: LooperMessageManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1467i {

    /* JADX INFO: renamed from: a */
    private static C1467i f862a;

    /* JADX INFO: renamed from: b */
    private long f863b = -1;

    /* JADX INFO: renamed from: c */
    private final List<Printer> f864c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final List<Printer> f865d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private boolean f866e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    C1467i.m1645a().m1648a(str);
                } else if (str.charAt(0) == '<') {
                    C1467i.m1645a().m1649b(str);
                }
                C1467i.m1647c();
            }
        };
    }

    private C1467i() {
    }

    /* JADX INFO: renamed from: a */
    public static C1467i m1645a() {
        if (f862a == null) {
            synchronized (C1467i.class) {
                if (f862a == null) {
                    f862a = new C1467i();
                }
            }
        }
        return f862a;
    }

    /* JADX INFO: renamed from: a */
    private static void m1646a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Printer printer = list.get(i);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            C1373a.m865a(th);
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Printer m1647c() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    final void m1648a(String str) {
        this.f863b = -1L;
        try {
            m1646a(this.f864c, str);
        } catch (Exception e) {
            C1373a.m865a((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m1649b(String str) {
        this.f863b = SystemClock.uptimeMillis();
        try {
            m1646a(this.f865d, str);
        } catch (Exception e) {
            C1373a.m874b((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1650b() {
        return this.f863b != -1 && SystemClock.uptimeMillis() - this.f863b > 5000;
    }
}
