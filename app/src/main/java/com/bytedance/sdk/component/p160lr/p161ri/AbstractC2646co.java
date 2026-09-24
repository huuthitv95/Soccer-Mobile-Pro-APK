package com.bytedance.sdk.component.p160lr.p161ri;

import androidx.work.WorkRequest;
import com.bytedance.sdk.component.p155ik.p156ri.C2633ri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.co */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2646co {

    /* JADX INFO: renamed from: ik */
    private List<String> f7527ik;

    /* JADX INFO: renamed from: ka */
    private long f7528ka = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    /* JADX INFO: renamed from: lr */
    public C2633ri f7529lr = new C2633ri();

    /* JADX INFO: renamed from: ri */
    public AbstractC2671sf f7530ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.co$ri */
    public static class ri {

        /* JADX INFO: renamed from: di */
        C2645aw f7531di;

        /* JADX INFO: renamed from: fi */
        Object f7532fi;

        /* JADX INFO: renamed from: ik */
        xha f7533ik;
        private List<String> jbs;

        /* JADX INFO: renamed from: ka */
        String f7534ka;

        /* JADX INFO: renamed from: lr */
        Map<String, List<String>> f7535lr;

        /* JADX INFO: renamed from: mj */
        String f7536mj;

        /* JADX INFO: renamed from: qt */
        private long f7537qt;

        /* JADX INFO: renamed from: ri */
        C2661ri f7538ri;
        int xha;

        public ri() {
            this.f7537qt = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
            this.f7535lr = new HashMap();
        }

        ri(AbstractC2646co abstractC2646co) {
            this.f7537qt = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
            this.f7533ik = abstractC2646co.mo9886ka();
            this.f7534ka = abstractC2646co.mo9884fi();
            this.f7535lr = abstractC2646co.mo9883di();
            this.f7532fi = abstractC2646co.mo9885ik();
            this.f7531di = abstractC2646co.mo9889qt();
            this.f7538ri = abstractC2646co.xha();
            this.xha = abstractC2646co.jbs();
            this.f7536mj = abstractC2646co.mo9888mj();
            this.jbs = abstractC2646co.mo9890ri();
            this.f7537qt = abstractC2646co.mo9887lr();
        }

        /* JADX INFO: renamed from: ri */
        private ri m9894ri(String str, C2645aw c2645aw) {
            this.f7534ka = str;
            this.f7531di = c2645aw;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m9896lr(String str) {
            return m9904ri(xha.m10013ik(str));
        }

        /* JADX INFO: renamed from: lr */
        public ri m9897lr(String str, String str2) {
            if (!this.f7535lr.containsKey(str)) {
                this.f7535lr.put(str, new ArrayList());
            }
            this.f7535lr.get(str).add(str2);
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public AbstractC2646co m9898lr() {
            return new AbstractC2646co() { // from class: com.bytedance.sdk.component.lr.ri.co.ri.1
                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                /* JADX INFO: renamed from: di */
                public Map mo9883di() {
                    return ri.this.f7535lr;
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                /* JADX INFO: renamed from: fi */
                public String mo9884fi() {
                    return ri.this.f7534ka;
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                /* JADX INFO: renamed from: ik */
                public Object mo9885ik() {
                    return ri.this.f7532fi;
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                public int jbs() {
                    return ri.this.xha;
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                /* JADX INFO: renamed from: ka */
                public xha mo9886ka() {
                    return ri.this.f7533ik;
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                /* JADX INFO: renamed from: lr */
                public long mo9887lr() {
                    return ri.this.f7537qt;
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                /* JADX INFO: renamed from: mj */
                public String mo9888mj() {
                    return ri.this.f7536mj;
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                /* JADX INFO: renamed from: qt */
                public C2645aw mo9889qt() {
                    return ri.this.f7531di;
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                /* JADX INFO: renamed from: ri */
                public List<String> mo9890ri() {
                    return ri.this.jbs;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co
                public C2661ri xha() {
                    return ri.this.f7538ri;
                }
            };
        }

        /* JADX INFO: renamed from: ri */
        public ri m9899ri() {
            return m9894ri("GET", (C2645aw) null);
        }

        /* JADX INFO: renamed from: ri */
        public ri m9900ri(int i) {
            this.xha = i;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9901ri(long j) {
            this.f7537qt = j;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9902ri(C2645aw c2645aw) {
            return m9894ri("POST", c2645aw);
        }

        /* JADX INFO: renamed from: ri */
        public ri m9903ri(C2661ri c2661ri) {
            this.f7538ri = c2661ri;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9904ri(xha xhaVar) {
            this.f7533ik = xhaVar;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9905ri(Object obj) {
            this.f7532fi = obj;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9906ri(String str) {
            this.f7536mj = str;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9907ri(String str, String str2) {
            return m9897lr(str, str2);
        }

        /* JADX INFO: renamed from: ri */
        public ri m9908ri(List<String> list) {
            this.jbs = list;
            return this;
        }
    }

    /* JADX INFO: renamed from: di */
    public abstract Map<String, List<String>> mo9883di();

    /* JADX INFO: renamed from: fi */
    public abstract String mo9884fi();

    /* JADX INFO: renamed from: ik */
    public abstract Object mo9885ik();

    public abstract int jbs();

    /* JADX INFO: renamed from: ka */
    public abstract xha mo9886ka();

    /* JADX INFO: renamed from: lr */
    public long mo9887lr() {
        return this.f7528ka;
    }

    /* JADX INFO: renamed from: mj */
    public abstract String mo9888mj();

    /* JADX INFO: renamed from: qt */
    public C2645aw mo9889qt() {
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public List<String> mo9890ri() {
        return this.f7527ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m9891ri(AbstractC2671sf abstractC2671sf) {
        this.f7530ri = abstractC2671sf;
    }

    /* JADX INFO: renamed from: sf */
    public ri m9892sf() {
        return new ri(this);
    }

    public abstract C2661ri xha();
}
