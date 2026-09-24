package com.bytedance.sdk.component.adexpress.dynamic.p119ka;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {

    /* JADX INFO: renamed from: lr */
    public float f6761lr;

    /* JADX INFO: renamed from: ri */
    public float f6762ri;

    public jbs(float f, float f2) {
        this.f6762ri = f;
        this.f6761lr = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jbs jbsVar = (jbs) obj;
            if (Float.compare(jbsVar.f6762ri, this.f6762ri) == 0 && Float.compare(jbsVar.f6761lr, this.f6761lr) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6762ri), Float.valueOf(this.f6761lr)});
    }
}
