package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class slm implements InterfaceC2488ik {

    /* JADX INFO: renamed from: aw */
    public JSONObject f11345aw;
    public boolean bgr;

    /* JADX INFO: renamed from: co */
    public int f11346co;

    /* JADX INFO: renamed from: di */
    public final long f11347di;

    /* JADX INFO: renamed from: fi */
    public final long f11348fi;

    /* JADX INFO: renamed from: ik */
    public final float f11349ik;
    public JSONObject jbs;

    /* JADX INFO: renamed from: ka */
    public final float f11350ka;

    /* JADX INFO: renamed from: lr */
    public final float f11351lr;

    /* JADX INFO: renamed from: mj */
    public int f11352mj;

    /* JADX INFO: renamed from: qt */
    public SparseArray<AbstractViewOnClickListenerC3218ik.ri> f11353qt;

    /* JADX INFO: renamed from: ri */
    public final float f11354ri;

    /* JADX INFO: renamed from: sf */
    public final boolean f11355sf;

    /* JADX INFO: renamed from: vr */
    public int f11356vr;
    public final String xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.slm$ri */
    public static class C3292ri {

        /* JADX INFO: renamed from: aw */
        private JSONObject f11357aw;

        /* JADX INFO: renamed from: co */
        private int f11358co;

        /* JADX INFO: renamed from: di */
        private float f11359di;

        /* JADX INFO: renamed from: fi */
        private float f11360fi;

        /* JADX INFO: renamed from: ik */
        private long f11361ik;
        private String jbs;

        /* JADX INFO: renamed from: ka */
        private float f11362ka;

        /* JADX INFO: renamed from: lr */
        private long f11363lr;

        /* JADX INFO: renamed from: mj */
        private int f11364mj;

        /* JADX INFO: renamed from: qt */
        private int f11365qt;

        /* JADX INFO: renamed from: sf */
        private JSONObject f11367sf;

        /* JADX INFO: renamed from: vr */
        private boolean f11368vr;
        private float xha;
        private boolean bgr = false;

        /* JADX INFO: renamed from: ri */
        protected SparseArray<AbstractViewOnClickListenerC3218ik.ri> f11366ri = new SparseArray<>();

        /* JADX INFO: renamed from: ik */
        public C3292ri m14279ik(float f) {
            this.f11359di = f;
            return this;
        }

        /* JADX INFO: renamed from: ik */
        public C3292ri m14280ik(int i) {
            this.f11364mj = i;
            return this;
        }

        /* JADX INFO: renamed from: ka */
        public C3292ri m14281ka(float f) {
            this.xha = f;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C3292ri m14282lr(float f) {
            this.f11360fi = f;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C3292ri m14283lr(int i) {
            this.f11365qt = i;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C3292ri m14284lr(long j) {
            this.f11361ik = j;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C3292ri m14285lr(JSONObject jSONObject) {
            this.f11357aw = jSONObject;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public C3292ri m14286lr(boolean z) {
            this.bgr = z;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3292ri m14287ri(float f) {
            this.f11362ka = f;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3292ri m14288ri(int i) {
            this.f11358co = i;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3292ri m14289ri(long j) {
            this.f11363lr = j;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3292ri m14290ri(SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray) {
            this.f11366ri = sparseArray;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3292ri m14291ri(String str) {
            this.jbs = str;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3292ri m14292ri(JSONObject jSONObject) {
            this.f11367sf = jSONObject;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3292ri m14293ri(boolean z) {
            this.f11368vr = z;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public slm m14294ri() {
            return new slm(this);
        }
    }

    private slm(C3292ri c3292ri) {
        this.bgr = false;
        this.f11354ri = c3292ri.xha;
        this.f11351lr = c3292ri.f11359di;
        this.f11349ik = c3292ri.f11360fi;
        this.f11350ka = c3292ri.f11362ka;
        this.f11348fi = c3292ri.f11361ik;
        this.f11347di = c3292ri.f11363lr;
        this.xha = c3292ri.jbs;
        this.f11353qt = c3292ri.f11366ri;
        this.f11355sf = c3292ri.f11368vr;
        this.f11352mj = c3292ri.f11365qt;
        this.jbs = c3292ri.f11367sf;
        this.f11346co = c3292ri.f11358co;
        this.f11345aw = c3292ri.f11357aw;
        this.bgr = c3292ri.bgr;
        this.f11356vr = c3292ri.f11364mj;
    }
}
