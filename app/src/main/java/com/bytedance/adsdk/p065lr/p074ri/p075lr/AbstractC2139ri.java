package com.bytedance.adsdk.p065lr.p074ri.p075lr;

import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.xha.C2166lr;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2139ri<K, A> {

    /* JADX INFO: renamed from: fi */
    private final ik<K> f5203fi;

    /* JADX INFO: renamed from: ik */
    protected C2166lr<A> f5204ik;

    /* JADX INFO: renamed from: ri */
    final List<ri> f5208ri = new ArrayList(1);

    /* JADX INFO: renamed from: ka */
    private boolean f5205ka = false;

    /* JADX INFO: renamed from: lr */
    protected float f5206lr = 0.0f;

    /* JADX INFO: renamed from: di */
    private A f5202di = null;
    private float xha = -1.0f;

    /* JADX INFO: renamed from: mj */
    private float f5207mj = -1.0f;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ri$fi */
    private static final class fi<T> implements ik<T> {

        /* JADX INFO: renamed from: lr */
        private float f5209lr = -1.0f;

        /* JADX INFO: renamed from: ri */
        private final C2167ri<T> f5210ri;

        fi(List<? extends C2167ri<T>> list) {
            this.f5210ri = list.get(0);
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ik */
        public float mo7112ik() {
            return this.f5210ri.m7208ik();
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ka */
        public float mo7113ka() {
            return this.f5210ri.m7209ka();
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: lr */
        public C2167ri<T> mo7114lr() {
            return this.f5210ri;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: lr */
        public boolean mo7115lr(float f) {
            if (this.f5209lr == f) {
                return true;
            }
            this.f5209lr = f;
            return false;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ri */
        public boolean mo7116ri() {
            return false;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ri */
        public boolean mo7117ri(float f) {
            return !this.f5210ri.m7207fi();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ri$ik */
    private interface ik<T> {
        /* JADX INFO: renamed from: ik */
        float mo7112ik();

        /* JADX INFO: renamed from: ka */
        float mo7113ka();

        /* JADX INFO: renamed from: lr */
        C2167ri<T> mo7114lr();

        /* JADX INFO: renamed from: lr */
        boolean mo7115lr(float f);

        /* JADX INFO: renamed from: ri */
        boolean mo7116ri();

        /* JADX INFO: renamed from: ri */
        boolean mo7117ri(float f);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ri$ka */
    private static final class ka<T> implements ik<T> {

        /* JADX INFO: renamed from: ik */
        private C2167ri<T> f5211ik = null;

        /* JADX INFO: renamed from: ka */
        private float f5212ka = -1.0f;

        /* JADX INFO: renamed from: lr */
        private C2167ri<T> f5213lr = m7118ik(0.0f);

        /* JADX INFO: renamed from: ri */
        private final List<? extends C2167ri<T>> f5214ri;

        ka(List<? extends C2167ri<T>> list) {
            this.f5214ri = list;
        }

        /* JADX INFO: renamed from: ik */
        private C2167ri<T> m7118ik(float f) {
            List<? extends C2167ri<T>> list = this.f5214ri;
            C2167ri<T> c2167ri = list.get(list.size() - 1);
            if (f >= c2167ri.m7208ik()) {
                return c2167ri;
            }
            for (int size = this.f5214ri.size() - 2; size > 0; size--) {
                C2167ri<T> c2167ri2 = this.f5214ri.get(size);
                if (this.f5213lr != c2167ri2 && c2167ri2.m7212ri(f)) {
                    return c2167ri2;
                }
            }
            return this.f5214ri.get(0);
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ik */
        public float mo7112ik() {
            return this.f5214ri.get(0).m7208ik();
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ka */
        public float mo7113ka() {
            List<? extends C2167ri<T>> list = this.f5214ri;
            return list.get(list.size() - 1).m7209ka();
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: lr */
        public C2167ri<T> mo7114lr() {
            return this.f5213lr;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: lr */
        public boolean mo7115lr(float f) {
            C2167ri<T> c2167ri = this.f5211ik;
            C2167ri<T> c2167ri2 = this.f5213lr;
            if (c2167ri == c2167ri2 && this.f5212ka == f) {
                return true;
            }
            this.f5211ik = c2167ri2;
            this.f5212ka = f;
            return false;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ri */
        public boolean mo7116ri() {
            return false;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ri */
        public boolean mo7117ri(float f) {
            if (this.f5213lr.m7212ri(f)) {
                return !this.f5213lr.m7207fi();
            }
            this.f5213lr = m7118ik(f);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ri$lr */
    private static final class lr<T> implements ik<T> {
        private lr() {
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ik */
        public float mo7112ik() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ka */
        public float mo7113ka() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: lr */
        public C2167ri<T> mo7114lr() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: lr */
        public boolean mo7115lr(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ri */
        public boolean mo7116ri() {
            return true;
        }

        @Override // com.bytedance.adsdk.p065lr.p074ri.p075lr.AbstractC2139ri.ik
        /* JADX INFO: renamed from: ri */
        public boolean mo7117ri(float f) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo6789ri();
    }

    AbstractC2139ri(List<? extends C2167ri<K>> list) {
        this.f5203fi = m7104ri(list);
    }

    private float jbs() {
        if (this.xha == -1.0f) {
            this.xha = this.f5203fi.mo7112ik();
        }
        return this.xha;
    }

    /* JADX INFO: renamed from: ri */
    private static <T> ik<T> m7104ri(List<? extends C2167ri<T>> list) {
        if (list.isEmpty()) {
            return new lr();
        }
        return list.size() == 1 ? new fi(list) : new ka(list);
    }

    /* JADX INFO: renamed from: di */
    float mo7087di() {
        if (this.f5207mj == -1.0f) {
            this.f5207mj = this.f5203fi.mo7113ka();
        }
        return this.f5207mj;
    }

    /* JADX INFO: renamed from: fi */
    protected float m7105fi() {
        C2167ri<K> c2167riM7106ik = m7106ik();
        if (c2167riM7106ik == null || c2167riM7106ik.m7207fi()) {
            return 0.0f;
        }
        return c2167riM7106ik.f5399ik.getInterpolation(m7107ka());
    }

    /* JADX INFO: renamed from: ik */
    protected C2167ri<K> m7106ik() {
        C2023fi.m6599ri("BaseKeyframeAnimation#getCurrentKeyframe");
        C2167ri<K> c2167riMo7114lr = this.f5203fi.mo7114lr();
        C2023fi.m6596lr("BaseKeyframeAnimation#getCurrentKeyframe");
        return c2167riMo7114lr;
    }

    /* JADX INFO: renamed from: ka */
    float m7107ka() {
        if (this.f5205ka) {
            return 0.0f;
        }
        C2167ri<K> c2167riM7106ik = m7106ik();
        if (c2167riM7106ik.m7207fi()) {
            return 0.0f;
        }
        return (this.f5206lr - c2167riM7106ik.m7208ik()) / (c2167riM7106ik.m7209ka() - c2167riM7106ik.m7208ik());
    }

    /* JADX INFO: renamed from: lr */
    public void mo7088lr() {
        for (int i = 0; i < this.f5208ri.size(); i++) {
            this.f5208ri.get(i).mo6789ri();
        }
    }

    /* JADX INFO: renamed from: mj */
    public float m7108mj() {
        return this.f5206lr;
    }

    /* JADX INFO: renamed from: ri */
    abstract A mo7083ri(C2167ri<K> c2167ri, float f);

    /* JADX INFO: renamed from: ri */
    protected A mo7109ri(C2167ri<K> c2167ri, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: ri */
    public void m7110ri() {
        this.f5205ka = true;
    }

    /* JADX INFO: renamed from: ri */
    public void mo7086ri(float f) {
        if (this.f5203fi.mo7116ri()) {
            return;
        }
        if (f < jbs()) {
            f = jbs();
        } else if (f > mo7087di()) {
            f = mo7087di();
        }
        if (f == this.f5206lr) {
            return;
        }
        this.f5206lr = f;
        if (this.f5203fi.mo7117ri(f)) {
            mo7088lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7111ri(ri riVar) {
        this.f5208ri.add(riVar);
    }

    public A xha() {
        float fM7107ka = m7107ka();
        if (this.f5204ik == null && this.f5203fi.mo7115lr(fM7107ka)) {
            return this.f5202di;
        }
        C2167ri<K> c2167riM7106ik = m7106ik();
        A aMo7083ri = (c2167riM7106ik.f5400ka == null || c2167riM7106ik.f5398fi == null) ? mo7083ri(c2167riM7106ik, m7105fi()) : mo7109ri(c2167riM7106ik, fM7107ka, c2167riM7106ik.f5400ka.getInterpolation(fM7107ka), c2167riM7106ik.f5398fi.getInterpolation(fM7107ka));
        this.f5202di = aMo7083ri;
        return aMo7083ri;
    }
}
