package com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri;

import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2670ri extends AbstractC2650ka {

    /* JADX INFO: renamed from: ri */
    public static volatile InterfaceC2669qt f7599ri;

    /* JADX INFO: renamed from: ka */
    private ExecutorService f7601ka;

    /* JADX INFO: renamed from: lr */
    private List<InterfaceC2651lr> f7602lr = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ik */
    private List<InterfaceC2651lr> f7600ik = new CopyOnWriteArrayList();

    public C2670ri(ExecutorService executorService) {
        this.f7601ka = executorService;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10005ri(InterfaceC2669qt interfaceC2669qt) {
        f7599ri = interfaceC2669qt;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m10006fi() {
        return (f7599ri == null || f7599ri.mo10004ri() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: ik */
    public List<InterfaceC2651lr> mo9917ik() {
        return this.f7602lr;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: ka */
    public List<InterfaceC2651lr> mo9918ka() {
        return this.f7600ik;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: lr */
    public ExecutorService mo9919lr() {
        ExecutorService executorServiceMo10004ri = f7599ri != null ? f7599ri.mo10004ri() : null;
        return executorServiceMo10004ri != null ? executorServiceMo10004ri : this.f7601ka;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: ri */
    public int mo9920ri() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: ri */
    public void mo9921ri(int i) {
    }
}
