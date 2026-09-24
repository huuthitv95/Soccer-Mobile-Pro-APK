package com.pgl.ssdk;

import com.pgl.ssdk.InterfaceC14239a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.pgl.ssdk.a3 */
/* JADX INFO: loaded from: classes7.dex */
public class C14240a3<T extends InterfaceC14239a2> {

    /* JADX INFO: renamed from: a */
    private int f41203a;

    /* JADX INFO: renamed from: b */
    private BlockingQueue<T> f41204b = new LinkedBlockingQueue();

    private C14240a3(int i) {
        this.f41203a = i;
    }

    /* JADX INFO: renamed from: a */
    public static C14240a3 m42793a(int i) {
        return new C14240a3(i);
    }

    /* JADX INFO: renamed from: a */
    public T m42794a() {
        return this.f41204b.poll();
    }
}
