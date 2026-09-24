package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.Pf */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11621Pf {

    /* JADX INFO: renamed from: com.ironsource.Pf$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m27261a(InterfaceC11621Pf interfaceC11621Pf, Runnable runnable, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
            }
            if ((i & 2) != 0) {
                j = 0;
            }
            interfaceC11621Pf.mo27216a(runnable, j);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo27215a(Runnable runnable);

    /* JADX INFO: renamed from: a */
    void mo27216a(Runnable runnable, long j);
}
