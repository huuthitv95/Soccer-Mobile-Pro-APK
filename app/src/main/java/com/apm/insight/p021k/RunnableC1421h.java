package com.apm.insight.p021k;

import android.content.Context;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.entity.C1396b;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p011b.C1381f;
import com.apm.insight.p020j.C1413d;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1435k;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.C1473o;

/* JADX INFO: renamed from: com.apm.insight.k.h */
/* JADX INFO: compiled from: LaunchScanner.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1421h implements Runnable {

    /* JADX INFO: renamed from: a */
    private Context f697a;

    private RunnableC1421h(Context context) {
        this.f697a = context;
    }

    /* JADX INFO: renamed from: a */
    public static void m1267a(Context context) {
        C1471m.m1704a().m1736a(new RunnableC1421h(context), 0L);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1268a() {
        return C1415b.m1204a().m1221c() || !C1425a.m1292b(C1390e.m1032g());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C1381f.m945a(this.f697a).m947a().m925f();
        } catch (Throwable unused) {
        }
        try {
            if (C1425a.m1292b(this.f697a)) {
                C1415b.m1204a().m1219a(C1435k.m1406b(this.f697a));
            } else {
                NativeImpl.m1474j();
            }
            C1473o.m1709a().m1714a(C1390e.m1012a().m1510b(), C1396b.m1116b());
            if (C1471m.m1704a().m1734a() == null) {
            }
        } catch (Throwable th) {
            try {
                C1373a.m874b(th);
            } finally {
                C1473o.m1709a().m1714a(C1390e.m1012a().m1510b(), C1396b.m1116b());
                if (C1471m.m1704a().m1734a() != null) {
                    C1413d.m1192a(C1471m.m1704a().m1734a(), this.f697a).m1193a();
                }
            }
        }
    }
}
