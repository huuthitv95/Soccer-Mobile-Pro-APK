package com.mbridge.msdk.foundation.same;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.b */
/* JADX INFO: compiled from: MBridgeRefactor.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13089b {

    /* JADX INFO: renamed from: b */
    private static volatile C13089b f35885b;

    /* JADX INFO: renamed from: a */
    private Boolean f35886a = null;

    private C13089b() {
    }

    /* JADX INFO: renamed from: b */
    public static C13089b m37095b() {
        if (f35885b == null) {
            synchronized (C13089b.class) {
                if (f35885b == null) {
                    f35885b = new C13089b();
                }
            }
        }
        return f35885b;
    }

    /* JADX INFO: renamed from: a */
    public Boolean m37096a() {
        return this.f35886a;
    }
}
