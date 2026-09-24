package com.bytedance.sdk.component.adexpress.p125lr;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.lr.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2501co implements InterfaceC2508qt.ri {

    /* JADX INFO: renamed from: ik */
    private jbs f6939ik;

    /* JADX INFO: renamed from: ka */
    private AtomicBoolean f6940ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lr */
    private List<InterfaceC2508qt> f6941lr;

    /* JADX INFO: renamed from: ri */
    InterfaceC2513vr f6942ri;

    public C2501co(List<InterfaceC2508qt> list, jbs jbsVar) {
        this.f6941lr = list;
        this.f6939ik = jbsVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt.ri
    /* JADX INFO: renamed from: ik */
    public boolean mo8970ik() {
        return this.f6940ka.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt.ri
    /* JADX INFO: renamed from: lr */
    public InterfaceC2513vr mo8971lr() {
        return this.f6942ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt.ri
    /* JADX INFO: renamed from: lr */
    public boolean mo8972lr(InterfaceC2508qt interfaceC2508qt) {
        int iIndexOf = this.f6941lr.indexOf(interfaceC2508qt);
        return iIndexOf < this.f6941lr.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt.ri
    /* JADX INFO: renamed from: ri */
    public void mo8973ri() {
        this.f6939ik.mo8990ka();
        Iterator<InterfaceC2508qt> it = this.f6941lr.iterator();
        while (it.hasNext() && !it.next().mo8980ri(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt.ri
    /* JADX INFO: renamed from: ri */
    public void mo8974ri(InterfaceC2508qt interfaceC2508qt) {
        int iIndexOf = this.f6941lr.indexOf(interfaceC2508qt);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.f6941lr.size()) {
                return;
            }
        } while (!this.f6941lr.get(iIndexOf).mo8980ri(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt.ri
    /* JADX INFO: renamed from: ri */
    public void mo8975ri(InterfaceC2513vr interfaceC2513vr) {
        this.f6942ri = interfaceC2513vr;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt.ri
    /* JADX INFO: renamed from: ri */
    public void mo8976ri(boolean z) {
        this.f6940ka.getAndSet(z);
    }
}
