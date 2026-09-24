package com.apm.insight.p011b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.apm.insight.b.h */
/* JADX INFO: compiled from: LooperMonitor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1383h {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f477a;

    /* JADX INFO: renamed from: b */
    private static Printer f478b;

    /* JADX INFO: renamed from: c */
    private static final CopyOnWriteArrayList<AbstractC1380e> f479c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d */
    private static volatile boolean f480d = false;

    /* JADX INFO: renamed from: com.apm.insight.b.h$a */
    /* JADX INFO: compiled from: LooperMonitor.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        String m977a();

        /* JADX INFO: renamed from: b */
        String m978b();

        /* JADX INFO: renamed from: c */
        String m979c();
    }

    /* JADX INFO: renamed from: a */
    public static void m974a() {
        if (f477a) {
            return;
        }
        f477a = true;
        f478b = new Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    C1383h.m976a(true, str);
                } else if (str.charAt(0) == '<') {
                    C1383h.m976a(false, str);
                }
            }
        };
        C1384i.m980a();
        C1384i.m981a(f478b);
    }

    /* JADX INFO: renamed from: a */
    public static void m975a(AbstractC1380e abstractC1380e) {
        CopyOnWriteArrayList<AbstractC1380e> copyOnWriteArrayList = f479c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(abstractC1380e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m976a(boolean z, String str) {
        AbstractC1380e.f421a = System.nanoTime() / 1000000;
        AbstractC1380e.f422b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<AbstractC1380e> copyOnWriteArrayList = f479c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            AbstractC1380e abstractC1380e = copyOnWriteArrayList.get(i);
            if (abstractC1380e == null || !abstractC1380e.mo943a()) {
                if (!z && abstractC1380e.f423c) {
                    abstractC1380e.mo944b("");
                }
            } else if (z) {
                if (!abstractC1380e.f423c) {
                    abstractC1380e.mo942a(str);
                }
            } else if (abstractC1380e.f423c) {
                abstractC1380e.mo944b(str);
            }
        }
    }
}
