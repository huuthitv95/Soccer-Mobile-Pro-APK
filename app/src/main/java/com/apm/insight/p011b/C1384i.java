package com.apm.insight.p011b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import com.apm.insight.C1390e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.apm.insight.b.i */
/* JADX INFO: compiled from: LooperPrinterUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1384i {

    /* JADX INFO: renamed from: a */
    private static int f481a = 5;

    /* JADX INFO: renamed from: b */
    private static b f482b;

    /* JADX INFO: renamed from: c */
    private static boolean f483c;

    /* JADX INFO: renamed from: d */
    private static Printer f484d;

    /* JADX INFO: renamed from: com.apm.insight.b.i$a */
    /* JADX INFO: compiled from: LooperPrinterUtils.java */
    public interface a {
    }

    /* JADX INFO: renamed from: com.apm.insight.b.i$b */
    /* JADX INFO: compiled from: LooperPrinterUtils.java */
    static class b implements Printer {

        /* JADX INFO: renamed from: a */
        List<Printer> f485a = new ArrayList();

        /* JADX INFO: renamed from: d */
        private List<Printer> f488d = new ArrayList();

        /* JADX INFO: renamed from: b */
        List<Printer> f486b = new ArrayList();

        /* JADX INFO: renamed from: e */
        private boolean f489e = false;

        /* JADX INFO: renamed from: c */
        boolean f487c = false;

        b() {
        }

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C1384i.m982b();
            if (str.charAt(0) == '>' && this.f487c) {
                for (Printer printer : this.f486b) {
                    if (!this.f485a.contains(printer)) {
                        this.f485a.add(printer);
                    }
                }
                this.f486b.clear();
                this.f487c = false;
            }
            if (this.f485a.size() > C1384i.f481a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f485a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            C1384i.m982b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m980a() {
        if (f483c) {
            return;
        }
        f483c = true;
        f482b = new b();
        Printer printerM984d = m984d();
        f484d = printerM984d;
        if (printerM984d != null) {
            f482b.f485a.add(f484d);
        }
        if (C1390e.m1044s()) {
            Looper.getMainLooper().setMessageLogging(f482b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m981a(Printer printer) {
        if (printer == null || f482b.f486b.contains(printer)) {
            return;
        }
        f482b.f486b.add(printer);
        f482b.f487c = true;
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ a m982b() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static Printer m984d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
