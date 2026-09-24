package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.g */
/* JADX INFO: compiled from: EventProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
class C13820g implements InterfaceC13825l {

    /* JADX INFO: renamed from: a */
    private final C13816c f39386a;

    /* JADX INFO: renamed from: b */
    private final C13876s f39387b;

    /* JADX INFO: renamed from: c */
    private final AtomicLong f39388c = new AtomicLong(0);

    /* JADX INFO: renamed from: d */
    private final long[] f39389d = new long[2];

    public C13820g(C13816c c13816c, C13876s c13876s) {
        this.f39386a = c13816c;
        this.f39387b = c13876s;
    }

    @Override // com.mbridge.msdk.tracker.InterfaceC13825l
    /* JADX INFO: renamed from: a */
    public void mo41022a(C13818e c13818e) {
        try {
            long jIncrementAndGet = this.f39388c.incrementAndGet();
            this.f39389d[0] = System.currentTimeMillis();
            this.f39389d[1] = jIncrementAndGet;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("TrackManager", "notice error", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.InterfaceC13825l
    /* JADX INFO: renamed from: a */
    public long[] mo41023a() {
        long[] jArr = this.f39389d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }

    @Override // com.mbridge.msdk.tracker.InterfaceC13825l
    /* JADX INFO: renamed from: b */
    public void mo41024b(C13818e c13818e) {
        try {
            C13822i c13822i = new C13822i(c13818e);
            c13822i.m41025a(1);
            c13822i.m41029b(0);
            c13822i.m41026a(System.currentTimeMillis() + c13818e.m41016k());
            this.f39386a.m40995a(c13822i);
            this.f39387b.m41375k();
            this.f39387b.m41371e();
            this.f39387b.m41369a(c13818e);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("TrackManager", "process error", e);
            }
        }
    }
}
