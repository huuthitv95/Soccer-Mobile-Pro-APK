package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2193di;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.InterfaceC2194fi;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2199lr;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.facebook.internal.security.CertificateUtil;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tan implements InterfaceC2199lr {

    /* JADX INFO: renamed from: ik */
    private InterfaceC2200ri f5460ik;

    /* JADX INFO: renamed from: lr */
    private InterfaceC2200ri f5461lr;

    /* JADX INFO: renamed from: ri */
    private InterfaceC2200ri f5462ri;

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2199lr
    /* JADX INFO: renamed from: ik */
    public void mo7288ik(InterfaceC2200ri interfaceC2200ri) {
        this.f5460ik = interfaceC2200ri;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: lr */
    public String mo7291lr() {
        return this.f5462ri.mo7291lr() + "?" + this.f5461lr.mo7291lr() + CertificateUtil.DELIMITER + this.f5460ik.mo7291lr();
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2199lr
    /* JADX INFO: renamed from: lr */
    public void mo7289lr(InterfaceC2200ri interfaceC2200ri) {
        this.f5461lr = interfaceC2200ri;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2194fi mo7292ri() {
        return EnumC2193di.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        Object objMo7293ri = this.f5462ri.mo7293ri(map);
        if (objMo7293ri == null) {
            return null;
        }
        return ((Boolean) objMo7293ri).booleanValue() ? this.f5461lr.mo7293ri(map) : this.f5460ik.mo7293ri(map);
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2199lr
    /* JADX INFO: renamed from: ri */
    public void mo7290ri(InterfaceC2200ri interfaceC2200ri) {
        this.f5462ri = interfaceC2200ri;
    }

    public String toString() {
        return mo7291lr();
    }
}
