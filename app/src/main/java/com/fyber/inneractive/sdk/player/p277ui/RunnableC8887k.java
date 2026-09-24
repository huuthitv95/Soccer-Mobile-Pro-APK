package com.fyber.inneractive.sdk.player.p277ui;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.k */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8887k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC8888l f20891a;

    public RunnableC8887k(AbstractC8888l abstractC8888l) {
        this.f20891a = abstractC8888l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8888l abstractC8888l = this.f20891a;
        int i = abstractC8888l.f20955k;
        if (i != 0) {
            int i2 = (abstractC8888l.f20954j / i) + abstractC8888l.f20898F;
            abstractC8888l.f20898F = i2;
            abstractC8888l.mo21455a(i2);
        }
        AbstractC8888l abstractC8888l2 = this.f20891a;
        if (abstractC8888l2.f20898F < abstractC8888l2.f20899G) {
            abstractC8888l2.postDelayed(abstractC8888l2.f20897E, abstractC8888l2.f20956l);
            return;
        }
        abstractC8888l2.f20897E = null;
        abstractC8888l2.f20898F = 0;
        abstractC8888l2.f20899G = 0;
    }
}
