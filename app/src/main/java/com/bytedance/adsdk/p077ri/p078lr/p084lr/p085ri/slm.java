package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.InterfaceC2194fi;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class slm implements InterfaceC2200ri {

    /* JADX INFO: renamed from: ri */
    private final EnumC2195ik f5459ri;

    public slm(EnumC2195ik enumC2195ik) {
        this.f5459ri = enumC2195ik;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: lr */
    public String mo7291lr() {
        return this.f5459ri.m7281ri();
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2194fi mo7292ri() {
        return this.f5459ri;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public Object mo7293ri(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return mo7291lr();
    }
}
