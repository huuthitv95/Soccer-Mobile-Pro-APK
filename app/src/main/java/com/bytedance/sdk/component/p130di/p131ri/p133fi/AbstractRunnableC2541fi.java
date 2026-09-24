package com.bytedance.sdk.component.p130di.p131ri.p133fi;

import java.util.UUID;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.fi.fi */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC2541fi implements Comparable<AbstractRunnableC2541fi>, Runnable {

    /* JADX INFO: renamed from: ik */
    private String f7054ik;

    /* JADX INFO: renamed from: ri */
    private int f7056ri = 5;

    /* JADX INFO: renamed from: lr */
    private String f7055lr = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public AbstractRunnableC2541fi(String str) {
        this.f7054ik = str;
    }

    /* JADX INFO: renamed from: ri */
    public int m9231ri() {
        return this.f7056ri;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractRunnableC2541fi abstractRunnableC2541fi) {
        if (m9231ri() < abstractRunnableC2541fi.m9231ri()) {
            return 1;
        }
        return m9231ri() >= abstractRunnableC2541fi.m9231ri() ? -1 : 0;
    }

    /* JADX INFO: renamed from: ri */
    public void m9233ri(int i) {
        this.f7056ri = i;
    }
}
