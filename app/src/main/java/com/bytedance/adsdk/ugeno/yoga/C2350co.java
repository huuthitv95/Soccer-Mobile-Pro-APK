package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2350co extends YogaNodeJNIBase {
    /* JADX INFO: renamed from: aw */
    public void m8108aw() {
        if (this.f6117ri != 0) {
            long j = this.f6117ri;
            this.f6117ri = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }

    protected void finalize() throws Throwable {
        try {
            m8108aw();
        } finally {
            super.finalize();
        }
    }
}
