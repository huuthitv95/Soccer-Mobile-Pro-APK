package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;

/* JADX INFO: loaded from: classes3.dex */
public class bgr {

    /* JADX INFO: renamed from: di */
    private slm f8759di;

    /* JADX INFO: renamed from: fi */
    private boolean f8760fi;

    /* JADX INFO: renamed from: ik */
    private final Runnable f8761ik;

    /* JADX INFO: renamed from: ka */
    private final C2951ri.lr f8762ka;

    /* JADX INFO: renamed from: lr */
    private final String f8763lr;

    /* JADX INFO: renamed from: ri */
    private final C3022ri f8764ri;
    private C2951ri.ri xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.bgr$ri */
    public static class C2930ri {

        /* JADX INFO: renamed from: ik */
        private final Runnable f8767ik;

        /* JADX INFO: renamed from: ka */
        private final C2951ri.lr f8768ka;

        /* JADX INFO: renamed from: lr */
        private final String f8769lr;

        /* JADX INFO: renamed from: ri */
        private final C3022ri f8770ri;

        /* JADX INFO: renamed from: fi */
        private boolean f8766fi = false;

        /* JADX INFO: renamed from: di */
        private slm f8765di = null;
        private C2951ri.ri xha = null;

        public C2930ri(C3022ri c3022ri, String str, Runnable runnable, C2951ri.lr lrVar) {
            this.f8770ri = c3022ri;
            this.f8769lr = str;
            this.f8767ik = runnable;
            this.f8768ka = lrVar;
        }

        /* JADX INFO: renamed from: ri */
        public C2930ri m11263ri(C2951ri.ri riVar) {
            this.xha = riVar;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2930ri m11264ri(slm slmVar) {
            this.f8765di = slmVar;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2930ri m11265ri(boolean z) {
            this.f8766fi = z;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public bgr m11266ri() {
            if (this.f8770ri == null) {
                throw new IllegalArgumentException("RewardFullContext cannot be null");
            }
            if (this.f8767ik == null) {
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            if (this.f8768ka != null) {
                return new bgr(this);
            }
            throw new IllegalArgumentException("SkipResultHandler cannot be null");
        }
    }

    private bgr(C2930ri c2930ri) {
        this.f8764ri = c2930ri.f8770ri;
        this.f8763lr = c2930ri.f8769lr;
        this.f8761ik = c2930ri.f8767ik;
        this.f8762ka = c2930ri.f8768ka;
        this.f8760fi = c2930ri.f8766fi;
        this.f8759di = c2930ri.f8765di;
        this.xha = c2930ri.xha;
    }

    /* JADX INFO: renamed from: di */
    public slm m11251di() {
        return this.f8759di;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m11252fi() {
        return this.f8760fi;
    }

    /* JADX INFO: renamed from: ik */
    public Runnable m11253ik() {
        return this.f8761ik;
    }

    /* JADX INFO: renamed from: ka */
    public C2951ri.lr m11254ka() {
        return this.f8762ka;
    }

    /* JADX INFO: renamed from: lr */
    public String m11255lr() {
        return this.f8763lr;
    }

    /* JADX INFO: renamed from: ri */
    public C3022ri m11256ri() {
        return this.f8764ri;
    }

    public C2951ri.ri xha() {
        return this.xha;
    }
}
