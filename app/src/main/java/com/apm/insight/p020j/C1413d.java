package com.apm.insight.p020j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.C1373a;
import com.apm.insight.p022l.C1425a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.apm.insight.j.d */
/* JADX INFO: compiled from: ScheduleTaskManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1413d {

    /* JADX INFO: renamed from: a */
    private List<AbstractRunnableC1410a> f626a = new ArrayList(3);

    private C1413d(Handler handler, Context context) {
        if (C1425a.m1292b(context)) {
            this.f626a.add(new C1412c(handler));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1413d m1192a(Handler handler, Context context) {
        return new C1413d(handler, context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1193a() {
        C1373a.m861a((Object) ("[ScheduleTaskManager] execute, task size=" + this.f626a.size()));
        Iterator<AbstractRunnableC1410a> it = this.f626a.iterator();
        while (it.hasNext()) {
            try {
                it.next().m1188a();
            } catch (Throwable unused) {
            }
        }
    }
}
