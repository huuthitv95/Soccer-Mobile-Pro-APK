package com.bytedance.sdk.component.xha.p169ik;

/* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2736ik {

    /* JADX INFO: renamed from: lr */
    private lr f7808lr;

    /* JADX INFO: renamed from: ri */
    private ri f7809ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ik.ik$ik */
    /* JADX INFO: loaded from: classes9.dex */
    private static class ik {

        /* JADX INFO: renamed from: ri */
        private static final C2736ik f7810ri = new C2736ik();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ik.ik$lr */
    public interface lr {
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.xha.ik.ik$ri */
    public enum ri {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    private C2736ik() {
        this.f7809ri = ri.OFF;
        this.f7808lr = new C2737lr();
    }

    /* JADX INFO: renamed from: ri */
    public static void m10351ri(ri riVar) {
        synchronized (C2736ik.class) {
            ik.f7810ri.f7809ri = riVar;
        }
    }
}
