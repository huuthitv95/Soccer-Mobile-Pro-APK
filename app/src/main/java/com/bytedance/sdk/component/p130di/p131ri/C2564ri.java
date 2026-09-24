package com.bytedance.sdk.component.p130di.p131ri;

import com.bytedance.sdk.component.p130di.p131ri.p135ka.p136lr.C2551ri;
import com.bytedance.sdk.component.p130di.p131ri.p138lr.InterfaceC2556ik;
import com.bytedance.sdk.component.p130di.p131ri.p141ri.InterfaceC2566fi;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2564ri {

    /* JADX INFO: renamed from: co */
    private long f7165co;

    /* JADX INFO: renamed from: di */
    private C2551ri f7166di;

    /* JADX INFO: renamed from: fi */
    private C2551ri f7167fi;

    /* JADX INFO: renamed from: ik */
    private C2551ri f7168ik;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    private C2551ri f7169ka;

    /* JADX INFO: renamed from: lr */
    private InterfaceC2556ik f7170lr;

    /* JADX INFO: renamed from: mj */
    private InterfaceC2540fi f7171mj;

    /* JADX INFO: renamed from: qt */
    private int f7172qt;

    /* JADX INFO: renamed from: ri */
    private InterfaceC2566fi f7173ri;

    /* JADX INFO: renamed from: sf */
    private int f7174sf;
    private C2551ri xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri$ri */
    public static class ri {

        /* JADX INFO: renamed from: di */
        private InterfaceC2540fi f7175di;

        /* JADX INFO: renamed from: fi */
        private C2551ri f7176fi;

        /* JADX INFO: renamed from: ik */
        private C2551ri f7177ik;

        /* JADX INFO: renamed from: ka */
        private C2551ri f7178ka;

        /* JADX INFO: renamed from: lr */
        private C2551ri f7179lr;

        /* JADX INFO: renamed from: mj */
        private boolean f7180mj;

        /* JADX INFO: renamed from: ri */
        private InterfaceC2556ik f7182ri;

        /* JADX INFO: renamed from: sf */
        private long f7183sf;
        private InterfaceC2566fi xha;
        private int jbs = 5000;

        /* JADX INFO: renamed from: qt */
        private int f7181qt = 10;

        /* JADX INFO: renamed from: ik */
        public ri m9438ik(C2551ri c2551ri) {
            this.f7178ka = c2551ri;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m9439lr(int i) {
            this.f7181qt = i;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m9440lr(C2551ri c2551ri) {
            this.f7177ik = c2551ri;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9441ri(int i) {
            this.jbs = i;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9442ri(long j) {
            this.f7183sf = j;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9443ri(InterfaceC2540fi interfaceC2540fi) {
            this.f7175di = interfaceC2540fi;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9444ri(C2551ri c2551ri) {
            this.f7179lr = c2551ri;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9445ri(InterfaceC2556ik interfaceC2556ik) {
            this.f7182ri = interfaceC2556ik;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9446ri(InterfaceC2566fi interfaceC2566fi) {
            this.xha = interfaceC2566fi;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2564ri m9447ri() {
            C2564ri c2564ri = new C2564ri();
            c2564ri.f7170lr = this.f7182ri;
            c2564ri.f7168ik = this.f7179lr;
            c2564ri.f7169ka = this.f7177ik;
            c2564ri.f7167fi = this.f7178ka;
            c2564ri.f7166di = this.f7176fi;
            c2564ri.f7171mj = this.f7175di;
            c2564ri.f7173ri = this.xha;
            c2564ri.jbs = this.f7180mj;
            c2564ri.f7174sf = this.f7181qt;
            c2564ri.f7172qt = this.jbs;
            c2564ri.f7165co = this.f7183sf;
            return c2564ri;
        }
    }

    private C2564ri() {
        this.f7172qt = 200;
        this.f7174sf = 10;
    }

    /* JADX INFO: renamed from: co */
    public int m9428co() {
        return this.f7174sf;
    }

    /* JADX INFO: renamed from: di */
    public C2551ri m9429di() {
        return this.xha;
    }

    /* JADX INFO: renamed from: fi */
    public long m9430fi() {
        return this.f7165co;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m9431ik() {
        return this.jbs;
    }

    public C2551ri jbs() {
        return this.f7167fi;
    }

    /* JADX INFO: renamed from: ka */
    public InterfaceC2540fi m9432ka() {
        return this.f7171mj;
    }

    /* JADX INFO: renamed from: lr */
    public C2551ri m9433lr() {
        return this.f7166di;
    }

    /* JADX INFO: renamed from: mj */
    public C2551ri m9434mj() {
        return this.f7169ka;
    }

    /* JADX INFO: renamed from: qt */
    public InterfaceC2556ik m9435qt() {
        return this.f7170lr;
    }

    /* JADX INFO: renamed from: ri */
    public InterfaceC2566fi m9436ri() {
        return this.f7173ri;
    }

    /* JADX INFO: renamed from: sf */
    public int m9437sf() {
        return this.f7172qt;
    }

    public C2551ri xha() {
        return this.f7168ik;
    }
}
