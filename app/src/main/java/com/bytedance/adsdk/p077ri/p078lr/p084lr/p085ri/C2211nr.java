package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.p080ri.C2182mj;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.lr.ri.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2211nr extends AbstractC2203bu {

    /* JADX INFO: renamed from: ka */
    private static final ThreadLocal<StringBuilder> f5454ka = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.ri.lr.lr.ri.nr.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public C2211nr() {
        super(EnumC2195ik.PLUS);
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        Object objMo7293ri;
        Object objMo7293ri2 = this.f5452ri.mo7293ri(map);
        if (objMo7293ri2 == null || (objMo7293ri = this.f5451lr.mo7293ri(map)) == null) {
            return null;
        }
        if (!(objMo7293ri2 instanceof String) && !(objMo7293ri instanceof String)) {
            return C2182mj.m7259ri((Number) objMo7293ri2, (Number) objMo7293ri);
        }
        StringBuilder sb = f5454ka.get();
        sb.append(objMo7293ri2);
        sb.append(objMo7293ri);
        String string = sb.toString();
        sb.setLength(0);
        return string;
    }
}
