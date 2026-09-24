package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.C2175lr;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.lr.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2209lr extends AbstractC2203bu {
    public C2209lr() {
        super(EnumC2195ik.DOUBLE_AMP);
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        return Boolean.valueOf(C2175lr.m7225ri(this.f5452ri.mo7293ri(map)) && C2175lr.m7225ri(this.f5451lr.mo7293ri(map)));
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.AbstractC2203bu
    public String toString() {
        return mo7291lr();
    }
}
