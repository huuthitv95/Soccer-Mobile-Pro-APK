package com.chartboost.sdk.impl;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.b1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3652b1 {
    /* JADX INFO: renamed from: b */
    public static final String m16886b(int i) {
        if (i == 1) {
            return "STATE_IDLE";
        }
        if (i == 2) {
            return "STATE_BUFFERING";
        }
        if (i != 3) {
            return i != 4 ? "UNKNOWN" : "STATE_ENDED";
        }
        return "STATE_READY";
    }
}
