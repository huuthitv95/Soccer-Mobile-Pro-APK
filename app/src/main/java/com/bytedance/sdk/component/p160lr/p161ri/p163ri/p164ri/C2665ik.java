package com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri;

import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2659mj;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.ri.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2665ik implements InterfaceC2659mj.ri {

    /* JADX INFO: renamed from: ik */
    int f7580ik = 0;

    /* JADX INFO: renamed from: lr */
    AbstractC2646co f7581lr;

    /* JADX INFO: renamed from: ri */
    List<InterfaceC2659mj> f7582ri;

    C2665ik(List<InterfaceC2659mj> list, AbstractC2646co abstractC2646co) {
        this.f7582ri = list;
        this.f7581lr = abstractC2646co;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2659mj.ri
    /* JADX INFO: renamed from: ri */
    public bgr mo9975ri(AbstractC2646co abstractC2646co) throws IOException {
        this.f7581lr = abstractC2646co;
        int i = this.f7580ik + 1;
        this.f7580ik = i;
        if (i >= this.f7582ri.size()) {
            return null;
        }
        return this.f7582ri.get(this.f7580ik).mo9974ri(this);
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2659mj.ri
    /* JADX INFO: renamed from: ri */
    public AbstractC2646co mo9976ri() {
        return this.f7581lr;
    }
}
