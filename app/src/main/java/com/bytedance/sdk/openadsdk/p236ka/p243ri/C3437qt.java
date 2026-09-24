package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3437qt {

    /* JADX INFO: renamed from: ri */
    public static C3437qt f12460ri = new C3437qt();

    /* JADX INFO: renamed from: ik */
    private final Map<String, ri> f12461ik = new HashMap();

    /* JADX INFO: renamed from: ka */
    private volatile boolean f12462ka;

    /* JADX INFO: renamed from: lr */
    private ri f12463lr;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.qt$ri */
    public static class ri {

        /* JADX INFO: renamed from: lr */
        private final int f12464lr;

        /* JADX INFO: renamed from: ri */
        private final int f12465ri;

        public ri(int i, int i2) {
            this.f12465ri = (i < 0 || i > 5) ? 3 : i;
            this.f12464lr = i2 < 10 ? 30 : i2;
        }

        /* JADX INFO: renamed from: lr */
        public int m15683lr() {
            return this.f12464lr;
        }

        /* JADX INFO: renamed from: ri */
        public int m15684ri() {
            return this.f12465ri;
        }
    }

    /* JADX INFO: renamed from: ik */
    private int m15675ik() {
        ri riVar = this.f12463lr;
        if (riVar != null) {
            return riVar.m15683lr();
        }
        return 30;
    }

    /* JADX INFO: renamed from: lr */
    private int m15676lr() {
        ri riVar = this.f12463lr;
        if (riVar != null) {
            return riVar.m15684ri();
        }
        return 3;
    }

    /* JADX INFO: renamed from: lr */
    public int m15677lr(String str) {
        ri riVar = this.f12461ik.get(str);
        return riVar == null ? m15675ik() : riVar.m15683lr();
    }

    /* JADX INFO: renamed from: ri */
    public int m15678ri(String str) {
        if (!m15682ri()) {
            return 4;
        }
        ri riVar = this.f12461ik.get(str);
        return riVar == null ? m15676lr() : riVar.m15684ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m15679ri(ri riVar) {
        this.f12463lr = riVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m15680ri(String str, ri riVar) {
        if (TextUtils.isEmpty(str) || riVar == null) {
            return;
        }
        this.f12461ik.put(str, riVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m15681ri(boolean z) {
        this.f12462ka = z;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m15682ri() {
        return this.f12462ka;
    }
}
