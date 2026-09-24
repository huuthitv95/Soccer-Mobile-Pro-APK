package com.chartboost.sdk.impl;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.fk */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3763fk {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fk$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m17748a(InterfaceC3763fk interfaceC3763fk, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startProgressUpdate");
            }
            if ((i & 1) != 0) {
                j = 500;
            }
            interfaceC3763fk.mo17747a(j);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fk$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        long mo16777a();
    }

    /* JADX INFO: renamed from: a */
    void mo17746a();

    /* JADX INFO: renamed from: a */
    void mo17747a(long j);
}
