package com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.ri.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2666ka extends AbstractC2671sf {
    public C2670ri jbs;

    /* JADX INFO: renamed from: mj */
    public C2663di f7585mj;

    public C2666ka(AbstractC2671sf.ri riVar) {
        super(riVar);
        this.f7585mj = new C2663di();
        this.jbs = new C2670ri(this.f7585mj.mo9919lr());
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf
    /* JADX INFO: renamed from: ri */
    public AbstractC2650ka mo9986ri() {
        return this.f7585mj;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf
    /* JADX INFO: renamed from: ri */
    public InterfaceC2651lr mo9987ri(AbstractC2646co abstractC2646co) {
        abstractC2646co.m9891ri(this);
        if (abstractC2646co == null || abstractC2646co.mo9886ka() == null || abstractC2646co.mo9886ka().m10030ri() == null || TextUtils.isEmpty(abstractC2646co.mo9886ka().m10030ri().toString())) {
            return null;
        }
        if (C2670ri.f7599ri == null || !C2670ri.f7599ri.mo10003lr() || !this.jbs.m10006fi() || "setting".equals(abstractC2646co.mo9888mj())) {
            C2667lr c2667lr = new C2667lr(abstractC2646co, this.f7585mj);
            this.f7585mj.mo9917ik().add(c2667lr);
            return c2667lr;
        }
        C2667lr c2667lr2 = new C2667lr(abstractC2646co, this.jbs);
        this.jbs.mo9917ik().add(c2667lr2);
        return c2667lr2;
    }
}
