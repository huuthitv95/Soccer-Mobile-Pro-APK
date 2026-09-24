package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.C8237x0;
import com.fyber.inneractive.sdk.model.vast.C8294c;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C8118x extends AbstractC8085c {
    public C8118x(C8237x0 c8237x0, C8294c c8294c, int i) {
        super(c8237x0, c8294c, i);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: a */
    public final void mo20505a(JSONArray jSONArray) {
        this.f17983b = jSONArray;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: c */
    public final InterfaceC8108n mo20507c() {
        return new C8115u(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.AbstractC8084b
    /* JADX INFO: renamed from: k */
    public final boolean mo20515k() {
        JSONArray jSONArray = this.f17983b;
        return jSONArray != null && jSONArray.length() > 0;
    }
}
