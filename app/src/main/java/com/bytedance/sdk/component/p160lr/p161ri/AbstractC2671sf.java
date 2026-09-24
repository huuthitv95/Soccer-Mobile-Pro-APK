package com.bytedance.sdk.component.p160lr.p161ri;

import com.bytedance.sdk.component.p160lr.p161ri.p163ri.C2662ri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.sf */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2671sf implements Cloneable {

    /* JADX INFO: renamed from: di */
    public long f7605di;

    /* JADX INFO: renamed from: fi */
    public TimeUnit f7606fi;

    /* JADX INFO: renamed from: ik */
    public TimeUnit f7607ik;

    /* JADX INFO: renamed from: ka */
    public long f7608ka;

    /* JADX INFO: renamed from: lr */
    public long f7609lr;

    /* JADX INFO: renamed from: ri */
    public List<InterfaceC2659mj> f7610ri;
    public TimeUnit xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.sf$ri */
    public static final class ri {

        /* JADX INFO: renamed from: di */
        public long f7611di;

        /* JADX INFO: renamed from: fi */
        public TimeUnit f7612fi;

        /* JADX INFO: renamed from: ik */
        public TimeUnit f7613ik;

        /* JADX INFO: renamed from: ka */
        public long f7614ka;

        /* JADX INFO: renamed from: lr */
        public long f7615lr;

        /* JADX INFO: renamed from: ri */
        public final List<InterfaceC2659mj> f7616ri;
        public TimeUnit xha;

        public ri() {
            this.f7616ri = new ArrayList();
            this.f7615lr = 10000L;
            this.f7613ik = TimeUnit.MILLISECONDS;
            this.f7614ka = 10000L;
            this.f7612fi = TimeUnit.MILLISECONDS;
            this.f7611di = 10000L;
            this.xha = TimeUnit.MILLISECONDS;
        }

        public ri(AbstractC2671sf abstractC2671sf) {
            this.f7616ri = new ArrayList();
            this.f7615lr = 10000L;
            this.f7613ik = TimeUnit.MILLISECONDS;
            this.f7614ka = 10000L;
            this.f7612fi = TimeUnit.MILLISECONDS;
            this.f7611di = 10000L;
            this.xha = TimeUnit.MILLISECONDS;
            this.f7615lr = abstractC2671sf.f7609lr;
            this.f7613ik = abstractC2671sf.f7607ik;
            this.f7614ka = abstractC2671sf.f7608ka;
            this.f7612fi = abstractC2671sf.f7606fi;
            this.f7611di = abstractC2671sf.f7605di;
            this.xha = abstractC2671sf.xha;
        }

        public ri(String str) {
            this.f7616ri = new ArrayList();
            this.f7615lr = 10000L;
            this.f7613ik = TimeUnit.MILLISECONDS;
            this.f7614ka = 10000L;
            this.f7612fi = TimeUnit.MILLISECONDS;
            this.f7611di = 10000L;
            this.xha = TimeUnit.MILLISECONDS;
        }

        /* JADX INFO: renamed from: ik */
        public ri m10008ik(long j, TimeUnit timeUnit) {
            this.f7611di = j;
            this.xha = timeUnit;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m10009lr(long j, TimeUnit timeUnit) {
            this.f7614ka = j;
            this.f7612fi = timeUnit;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m10010ri(long j, TimeUnit timeUnit) {
            this.f7615lr = j;
            this.f7613ik = timeUnit;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m10011ri(InterfaceC2659mj interfaceC2659mj) {
            this.f7616ri.add(interfaceC2659mj);
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public AbstractC2671sf m10012ri() {
            return C2662ri.m9979ri(this);
        }
    }

    public AbstractC2671sf(ri riVar) {
        this.f7609lr = riVar.f7615lr;
        this.f7608ka = riVar.f7614ka;
        this.f7605di = riVar.f7611di;
        this.f7610ri = riVar.f7616ri;
        this.f7607ik = riVar.f7613ik;
        this.f7606fi = riVar.f7612fi;
        this.xha = riVar.xha;
        this.f7610ri = riVar.f7616ri;
    }

    /* JADX INFO: renamed from: lr */
    public ri m10007lr() {
        return new ri(this);
    }

    /* JADX INFO: renamed from: ri */
    public abstract AbstractC2650ka mo9986ri();

    /* JADX INFO: renamed from: ri */
    public abstract InterfaceC2651lr mo9987ri(AbstractC2646co abstractC2646co);
}
