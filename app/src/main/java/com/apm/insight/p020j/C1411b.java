package com.apm.insight.p020j;

import android.content.Context;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.apm.insight.C1390e;
import com.apm.insight.entity.C1396b;
import com.apm.insight.nativecrash.C1442b;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.C1473o;
import java.util.Map;

/* JADX INFO: renamed from: com.apm.insight.j.b */
/* JADX INFO: compiled from: CommonParamsTask.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1411b extends AbstractRunnableC1410a {

    /* JADX INFO: renamed from: b */
    private static Runnable f624b = new Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public final void run() {
            C1471m.m1704a().m1734a().removeCallbacks(this);
            C1471m.m1704a().m1735a(new C1411b(C1471m.m1704a().m1734a(), C1390e.m1032g()));
        }
    };

    /* JADX INFO: renamed from: a */
    private Context f625a;

    public C1411b(Handler handler, Context context) {
        super(handler, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        this.f625a = context;
    }

    /* JADX INFO: renamed from: c */
    public static void m1191c() {
        C1471m.m1704a().m1736a(f624b, 100L);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:6:0x0010, B:8:0x0016, B:9:0x001e), top: B:13:0x0010 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Map<String, Object> commonParams;
        try {
            commonParams = C1390e.m1012a().m1511c().getCommonParams();
        } catch (Throwable unused) {
            commonParams = null;
        }
        if (commonParams != null) {
            try {
                if (C1442b.m1506a(commonParams)) {
                    m1189a(m1190b());
                } else {
                    C1473o.m1709a().m1714a(commonParams, C1396b.m1116b());
                }
            } catch (Throwable unused2) {
            }
        } else {
            C1473o.m1709a().m1714a(commonParams, C1396b.m1116b());
        }
    }
}
