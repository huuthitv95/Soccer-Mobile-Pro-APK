package com.mbridge.msdk.config.component.trans;

import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.trans.model.C12848a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TransCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    private C12848a f34445h;

    /* JADX INFO: renamed from: i */
    private Map<String, Object> f34446i;

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "911001";
        if (this.f33803a.containsKey(C12770c.m35209b("50")) && (this.f33803a.get(C12770c.m35209b("50")) instanceof Map)) {
            this.f34446i = (Map) this.f33803a.get(C12770c.m35209b("50"));
        }
        this.f34445h = new C12848a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        Object objM34892a = new C12717d().m34892a(this.f34445h.m35796a(), this.f33806d);
        HashMap map = new HashMap();
        if (objM34892a != null) {
            map.put(C12770c.m35209b("500"), objM34892a);
        }
        m34829a(m34827a("911002", map));
    }
}
