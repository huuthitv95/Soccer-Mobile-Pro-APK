package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.p080ri.C2181lr;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class bgr extends AbstractC2203bu {
    public bgr() {
        super(EnumC2195ik.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        Object objMo7293ri = this.f5452ri.mo7293ri(map);
        Object objMo7293ri2 = this.f5451lr.mo7293ri(map);
        if (objMo7293ri == null && objMo7293ri2 == null) {
            return Boolean.FALSE;
        }
        if (objMo7293ri == null && objMo7293ri2 != null) {
            return Boolean.TRUE;
        }
        if (objMo7293ri == null || objMo7293ri2 != null) {
            return ((objMo7293ri instanceof Number) && (objMo7293ri2 instanceof Number)) ? Boolean.valueOf(!C2181lr.m7254ri((Number) objMo7293ri, (Number) objMo7293ri2)) : Boolean.valueOf(!objMo7293ri.equals(objMo7293ri2));
        }
        return Boolean.TRUE;
    }
}
