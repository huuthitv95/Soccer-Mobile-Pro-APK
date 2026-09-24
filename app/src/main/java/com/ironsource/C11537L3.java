package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.L3 */
/* JADX INFO: loaded from: classes6.dex */
public class C11537L3 {

    /* JADX INFO: renamed from: a */
    private a f24883a = a.NOT_READY;

    /* JADX INFO: renamed from: b */
    private ArrayList f24884b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private String f24885c;

    /* JADX INFO: renamed from: com.ironsource.L3$a */
    enum a {
        NOT_READY,
        READY
    }

    public C11537L3(String str) {
        this.f24885c = str;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m26345a(Runnable runnable) {
        if (this.f24883a != a.READY) {
            this.f24884b.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m26346b() {
        this.f24883a = a.NOT_READY;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m26347c() {
        this.f24883a = a.READY;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m26344a() {
        Object[] array = this.f24884b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.f24884b.clear();
    }
}
