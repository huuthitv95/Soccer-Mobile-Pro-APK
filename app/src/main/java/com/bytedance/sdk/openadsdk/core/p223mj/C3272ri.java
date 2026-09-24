package com.bytedance.sdk.openadsdk.core.p223mj;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mj.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3272ri {

    /* JADX INFO: renamed from: ik */
    private static volatile long f11088ik;

    /* JADX INFO: renamed from: lr */
    private static volatile boolean f11089lr;

    /* JADX INFO: renamed from: ri */
    private static volatile C3272ri f11090ri;

    /* JADX INFO: renamed from: fi */
    private Handler f11092fi;

    /* JADX INFO: renamed from: ka */
    private final Queue<ri> f11093ka = new LinkedList();

    /* JADX INFO: renamed from: di */
    private final C3322sf f11091di = C3299nr.m14639ka();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mj.ri$ri */
    private static class ri {

        /* JADX INFO: renamed from: lr */
        private final String f11095lr;

        /* JADX INFO: renamed from: ri */
        private final long f11096ri;

        private ri(long j, String str) {
            this.f11096ri = j;
            this.f11095lr = str;
        }
    }

    private C3272ri() {
    }

    /* JADX INFO: renamed from: lr */
    private synchronized void m13935lr(long j) {
        f11088ik = j;
    }

    /* JADX INFO: renamed from: lr */
    private synchronized boolean m13936lr(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM14866oh = this.f11091di.m14866oh();
        long jHcw = this.f11091di.hcw();
        if (this.f11093ka.size() <= 0 || this.f11093ka.size() < iM14866oh) {
            this.f11093ka.offer(new ri(jCurrentTimeMillis, str));
        } else {
            long jAbs = Math.abs(jCurrentTimeMillis - this.f11093ka.peek().f11096ri);
            if (jAbs <= jHcw) {
                m13935lr(jHcw - jAbs);
                return true;
            }
            this.f11093ka.poll();
            this.f11093ka.offer(new ri(jCurrentTimeMillis, str));
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public static C3272ri m13937ri() {
        if (f11090ri == null) {
            synchronized (C3272ri.class) {
                if (f11090ri == null) {
                    f11090ri = new C3272ri();
                }
            }
        }
        return f11090ri;
    }

    /* JADX INFO: renamed from: ri */
    private synchronized void m13938ri(long j) {
        if (this.f11092fi == null) {
            this.f11092fi = new Handler(Looper.getMainLooper());
        }
        this.f11092fi.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mj.ri.1
            @Override // java.lang.Runnable
            public void run() {
                C3272ri.this.m13940ri(false);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public synchronized void m13940ri(boolean z) {
        f11089lr = z;
    }

    /* JADX INFO: renamed from: ik */
    public synchronized String m13941ik() {
        String str;
        HashMap map = new HashMap();
        for (ri riVar : this.f11093ka) {
            if (map.containsKey(riVar.f11095lr)) {
                map.put(riVar.f11095lr, Integer.valueOf(((Integer) map.get(riVar.f11095lr)).intValue() + 1));
            } else {
                map.put(riVar.f11095lr, 1);
            }
        }
        str = "";
        int i = Integer.MIN_VALUE;
        for (String str2 : map.keySet()) {
            int iIntValue = ((Integer) map.get(str2)).intValue();
            if (i < iIntValue) {
                str = str2;
                i = iIntValue;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: lr */
    public synchronized boolean m13942lr() {
        return f11089lr;
    }

    /* JADX INFO: renamed from: ri */
    public synchronized boolean m13943ri(String str) {
        if (m13936lr(str)) {
            m13940ri(true);
            m13938ri(f11088ik);
        } else {
            m13940ri(false);
        }
        return f11089lr;
    }
}
