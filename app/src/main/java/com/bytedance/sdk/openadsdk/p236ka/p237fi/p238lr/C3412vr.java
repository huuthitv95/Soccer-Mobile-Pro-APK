package com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr;

import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1998ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C3412vr {

    /* JADX INFO: renamed from: fi */
    private wjv f12176fi;

    /* JADX INFO: renamed from: ik */
    private int f12177ik;

    /* JADX INFO: renamed from: ka */
    private C1996ik f12178ka;

    /* JADX INFO: renamed from: lr */
    private String f12179lr;

    /* JADX INFO: renamed from: ri */
    private long f12180ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.fi.lr.vr$ri */
    public static class ri {
        private C1998ri bgr;

        /* JADX INFO: renamed from: co */
        private int f12182co;

        /* JADX INFO: renamed from: fi */
        private boolean f12184fi;
        private int jbs;

        /* JADX INFO: renamed from: ka */
        private boolean f12186ka;

        /* JADX INFO: renamed from: mj */
        private int f12188mj;

        /* JADX INFO: renamed from: qt */
        private int f12189qt;

        /* JADX INFO: renamed from: sf */
        private int f12191sf;

        /* JADX INFO: renamed from: ri */
        private long f12190ri = 0;

        /* JADX INFO: renamed from: lr */
        private long f12187lr = 0;

        /* JADX INFO: renamed from: ik */
        private long f12185ik = 0;

        /* JADX INFO: renamed from: di */
        private long f12183di = 0;
        private boolean xha = false;

        /* JADX INFO: renamed from: aw */
        private boolean f12181aw = false;

        private void slm() {
            long j = this.f12185ik;
            if (j > 0) {
                long j2 = this.f12190ri;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.f12190ri = j3;
                    if (j3 == 0) {
                        this.f12190ri = j;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: aw */
        public C1998ri m15453aw() {
            return this.bgr;
        }

        public boolean bgr() {
            return this.f12186ka;
        }

        /* JADX INFO: renamed from: co */
        public boolean m15454co() {
            return this.xha;
        }

        /* JADX INFO: renamed from: di */
        public int m15455di() {
            return this.jbs;
        }

        /* JADX INFO: renamed from: fi */
        public int m15456fi() {
            return this.f12188mj;
        }

        /* JADX INFO: renamed from: ik */
        public long m15457ik() {
            return this.f12187lr;
        }

        /* JADX INFO: renamed from: ik */
        public void m15458ik(int i) {
            this.f12189qt = i;
        }

        /* JADX INFO: renamed from: ik */
        public void m15459ik(long j) {
            this.f12187lr = j;
        }

        /* JADX INFO: renamed from: ik */
        public void m15460ik(boolean z) {
            this.f12184fi = z;
        }

        public int jbs() {
            return this.f12191sf;
        }

        /* JADX INFO: renamed from: ka */
        public long m15461ka() {
            return this.f12185ik;
        }

        /* JADX INFO: renamed from: ka */
        public void m15462ka(int i) {
            this.f12182co = i;
        }

        /* JADX INFO: renamed from: ka */
        public void m15463ka(long j) {
            this.f12185ik = j;
            slm();
        }

        /* JADX INFO: renamed from: lr */
        public long m15464lr() {
            return this.f12190ri;
        }

        /* JADX INFO: renamed from: lr */
        public void m15465lr(int i) {
            this.jbs = i;
        }

        /* JADX INFO: renamed from: lr */
        public void m15466lr(long j) {
            this.f12190ri = j;
            slm();
        }

        /* JADX INFO: renamed from: lr */
        public void m15467lr(boolean z) {
            this.f12186ka = z;
        }

        /* JADX INFO: renamed from: mj */
        public int m15468mj() {
            return this.f12189qt;
        }

        /* JADX INFO: renamed from: qt */
        public int m15469qt() {
            return this.f12182co;
        }

        /* JADX INFO: renamed from: ri */
        public long m15470ri() {
            return this.f12183di;
        }

        /* JADX INFO: renamed from: ri */
        public void m15471ri(int i) {
            this.f12188mj = i;
        }

        /* JADX INFO: renamed from: ri */
        public void m15472ri(long j) {
            this.f12183di = j;
        }

        /* JADX INFO: renamed from: ri */
        public void m15473ri(C1998ri c1998ri) {
            this.bgr = c1998ri;
        }

        /* JADX INFO: renamed from: ri */
        public void m15474ri(boolean z) {
            this.xha = z;
        }

        /* JADX INFO: renamed from: sf */
        public boolean m15475sf() {
            return this.f12181aw;
        }

        /* JADX INFO: renamed from: vr */
        public boolean m15476vr() {
            return this.f12184fi;
        }

        public int xha() {
            long j = this.f12185ik;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.f12190ri * 100) / j), 100);
        }
    }

    public C3412vr(long j, String str, int i, C1996ik c1996ik, wjv wjvVar) {
        this.f12180ri = j;
        this.f12179lr = str;
        this.f12177ik = i;
        this.f12178ka = c1996ik;
        this.f12176fi = wjvVar;
    }

    /* JADX INFO: renamed from: fi */
    public wjv m15448fi() {
        return this.f12176fi;
    }

    /* JADX INFO: renamed from: ik */
    public int m15449ik() {
        return this.f12177ik;
    }

    /* JADX INFO: renamed from: ka */
    public C1996ik m15450ka() {
        return this.f12178ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m15451lr() {
        return this.f12179lr;
    }

    /* JADX INFO: renamed from: ri */
    public long m15452ri() {
        return this.f12180ri;
    }
}
