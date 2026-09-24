package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.p080ri.C2177di;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.lr.ri.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2204co extends AbstractC2203bu {
    public C2204co() {
        super(EnumC2195ik.MOD);
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        Object objMo7293ri;
        Object objMo7293ri2 = this.f5452ri.mo7293ri(map);
        if (objMo7293ri2 == null || (objMo7293ri = this.f5451lr.mo7293ri(map)) == null) {
            return null;
        }
        return C2177di.m7234ri((Number) objMo7293ri2, (Number) objMo7293ri);
    }
}
