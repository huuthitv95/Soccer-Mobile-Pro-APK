package com.bytedance.sdk.openadsdk.core.p190aw.p192lr;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3100lr extends C3099ik implements Comparable<C3100lr> {

    /* JADX INFO: renamed from: ri */
    private final float f9842ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.lr$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        private C3099ik.ik f9843ik = C3099ik.ik.TRACKING_URL;

        /* JADX INFO: renamed from: ka */
        private boolean f9844ka = false;

        /* JADX INFO: renamed from: lr */
        private final float f9845lr;

        /* JADX INFO: renamed from: ri */
        private final String f9846ri;

        public ri(String str, float f) {
            this.f9846ri = str;
            this.f9845lr = f;
        }

        /* JADX INFO: renamed from: ri */
        public C3100lr m12513ri() {
            return new C3100lr(this.f9845lr, this.f9846ri, this.f9843ik, Boolean.valueOf(this.f9844ka));
        }
    }

    private C3100lr(float f, String str, C3099ik.ik ikVar, Boolean bool) {
        super(str, ikVar, bool);
        this.f9842ri = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik
    /* JADX INFO: renamed from: l_ */
    public void mo12507l_() {
        super.mo12507l_();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3100lr c3100lr) {
        if (c3100lr == null) {
            return 1;
        }
        float f = this.f9842ri;
        float f2 = c3100lr.f9842ri;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m12512ri(float f) {
        return this.f9842ri <= f && !m12506ka();
    }

    public String toString() {
        return super.toString();
    }
}
