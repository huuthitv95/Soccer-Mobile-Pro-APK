package com.bytedance.sdk.component.p145fi.p146lr.p147ik;

import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.xha;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2601ka<T> implements InterfaceC2630sf {

    /* JADX INFO: renamed from: di */
    private int f7323di;

    /* JADX INFO: renamed from: fi */
    private int f7324fi;

    /* JADX INFO: renamed from: ik */
    private T f7325ik;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    private T f7326ka;

    /* JADX INFO: renamed from: lr */
    private String f7327lr;

    /* JADX INFO: renamed from: mj */
    private boolean f7328mj;

    /* JADX INFO: renamed from: qt */
    private xha f7329qt;

    /* JADX INFO: renamed from: ri */
    private String f7330ri;

    /* JADX INFO: renamed from: sf */
    private int f7331sf;
    private Map<String, String> xha;

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2630sf
    /* JADX INFO: renamed from: di */
    public boolean mo9669di() {
        return this.jbs;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2630sf
    /* JADX INFO: renamed from: fi */
    public boolean mo9670fi() {
        return this.f7328mj;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2630sf
    /* JADX INFO: renamed from: ik */
    public T mo9671ik() {
        return this.f7326ka;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2630sf
    /* JADX INFO: renamed from: ka */
    public Map<String, String> mo9672ka() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2630sf
    /* JADX INFO: renamed from: lr */
    public T mo9673lr() {
        return this.f7325ik;
    }

    /* JADX INFO: renamed from: ri */
    public C2601ka m9674ri(C2600ik c2600ik, T t) {
        this.f7325ik = t;
        this.f7330ri = c2600ik.m9626mj();
        this.f7327lr = c2600ik.mo9571ri();
        this.f7324fi = c2600ik.mo9570lr();
        this.f7323di = c2600ik.mo9569ik();
        this.jbs = c2600ik.m9621co();
        this.f7329qt = c2600ik.bgr();
        this.f7331sf = c2600ik.m9634vr();
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C2601ka m9675ri(C2600ik c2600ik, T t, Map<String, String> map, boolean z) {
        this.xha = map;
        this.f7328mj = z;
        return m9674ri(c2600ik, t);
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2630sf
    /* JADX INFO: renamed from: ri */
    public String mo9676ri() {
        return this.f7327lr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2630sf
    /* JADX INFO: renamed from: ri */
    public void mo9677ri(Object obj) {
        this.f7326ka = this.f7325ik;
        this.f7325ik = obj;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2630sf
    public int xha() {
        return this.f7331sf;
    }
}
