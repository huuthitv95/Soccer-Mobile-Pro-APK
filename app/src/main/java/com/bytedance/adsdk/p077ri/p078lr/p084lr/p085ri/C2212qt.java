package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2197lr;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.InterfaceC2194fi;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p086ri.C2218ri;
import com.bytedance.adsdk.p077ri.slm;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.lr.ri.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2212qt implements InterfaceC2200ri {

    /* JADX INFO: renamed from: ik */
    private C2218ri f5455ik;

    /* JADX INFO: renamed from: ka */
    private boolean f5456ka;

    /* JADX INFO: renamed from: lr */
    private String f5457lr;

    /* JADX INFO: renamed from: ri */
    private InterfaceC2200ri[] f5458ri;

    public C2212qt(String str) {
        this.f5457lr = str;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m7297ik() {
        return this.f5456ka;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: lr */
    public String mo7291lr() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5457lr);
        sb.append("(");
        InterfaceC2200ri[] interfaceC2200riArr = this.f5458ri;
        if (interfaceC2200riArr != null && interfaceC2200riArr.length > 0) {
            int i = 0;
            while (true) {
                InterfaceC2200ri[] interfaceC2200riArr2 = this.f5458ri;
                if (i >= interfaceC2200riArr2.length) {
                    break;
                }
                sb.append(interfaceC2200riArr2[i].mo7291lr());
                sb.append(",");
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2194fi mo7292ri() {
        return EnumC2197lr.METHOD;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        C2218ri c2218ri = new C2218ri();
        this.f5455ik = c2218ri;
        c2218ri.m7308ri(this.f5457lr);
        Object[] objArr = new Object[this.f5458ri.length];
        int i = 0;
        while (true) {
            InterfaceC2200ri[] interfaceC2200riArr = this.f5458ri;
            if (i >= interfaceC2200riArr.length) {
                this.f5455ik.m7309ri(objArr);
                return slm.m7312ri(this.f5457lr).mo7214ri(map.get("default_key"), objArr);
            }
            InterfaceC2200ri interfaceC2200ri = interfaceC2200riArr[i];
            if (interfaceC2200ri != null) {
                objArr[i] = interfaceC2200ri.mo7293ri(map);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7298ri(boolean z) {
        this.f5456ka = z;
    }

    /* JADX INFO: renamed from: ri */
    public void m7299ri(InterfaceC2200ri[] interfaceC2200riArr) {
        this.f5458ri = interfaceC2200riArr;
    }
}
