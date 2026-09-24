package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2193di;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.InterfaceC2194fi;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.lr.ri.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2216vr implements InterfaceC2200ri {

    /* JADX INFO: renamed from: ri */
    private Number f5464ri;

    public C2216vr(String str) {
        if (str.indexOf(46) < 0) {
            try {
                this.f5464ri = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.f5464ri = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.f5464ri = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.f5464ri = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: lr */
    public String mo7291lr() {
        return this.f5464ri.toString();
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2194fi mo7292ri() {
        return EnumC2193di.NUMBER;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        return this.f5464ri;
    }

    public String toString() {
        return mo7291lr();
    }
}
