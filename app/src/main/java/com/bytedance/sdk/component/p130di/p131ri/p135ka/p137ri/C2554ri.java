package com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri;

import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ka.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2554ri implements InterfaceC2552ri {

    /* JADX INFO: renamed from: di */
    private long f7070di;

    /* JADX INFO: renamed from: fi */
    private long f7071fi;

    /* JADX INFO: renamed from: ik */
    private byte f7072ik;
    private byte jbs;

    /* JADX INFO: renamed from: ka */
    private byte f7073ka;

    /* JADX INFO: renamed from: lr */
    private InterfaceC2553lr f7074lr;

    /* JADX INFO: renamed from: mj */
    private String f7075mj;

    /* JADX INFO: renamed from: qt */
    private String f7076qt;

    /* JADX INFO: renamed from: ri */
    protected JSONObject f7077ri;

    /* JADX INFO: renamed from: sf */
    private int f7078sf;
    private long xha;

    private C2554ri() {
    }

    public C2554ri(String str, InterfaceC2553lr interfaceC2553lr) {
        this.f7075mj = str;
        this.f7074lr = interfaceC2553lr;
    }

    public C2554ri(String str, JSONObject jSONObject) {
        this.f7075mj = str;
        this.f7077ri = jSONObject;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: di */
    public synchronized JSONObject mo9282di() {
        InterfaceC2553lr interfaceC2553lr;
        if (this.f7077ri == null && (interfaceC2553lr = this.f7074lr) != null) {
            this.f7077ri = interfaceC2553lr.mo9301ri(m9304qt());
        }
        return this.f7077ri;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: fi */
    public byte mo9283fi() {
        return this.f7073ka;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: ik */
    public String mo9284ik() {
        return this.f7075mj;
    }

    /* JADX INFO: renamed from: ik */
    public void m9302ik(byte b) {
        this.f7073ka = b;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: ik */
    public void mo9285ik(long j) {
        this.xha = j;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    public int jbs() {
        return this.f7078sf;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: ka */
    public byte mo9286ka() {
        return this.f7072ik;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: lr */
    public byte mo9287lr() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: lr */
    public void m9303lr(byte b) {
        this.f7072ik = b;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: lr */
    public void mo9288lr(long j) {
        this.f7070di = j;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: mj */
    public long mo9289mj() {
        return this.f7070di;
    }

    /* JADX INFO: renamed from: qt */
    public String m9304qt() {
        return this.f7076qt;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2553lr mo9291ri() {
        return this.f7074lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m9305ri(byte b) {
        this.jbs = b;
    }

    /* JADX INFO: renamed from: ri */
    public void m9306ri(int i) {
        this.f7078sf = i;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    /* JADX INFO: renamed from: ri */
    public void mo9293ri(long j) {
        this.f7071fi = j;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri
    public long xha() {
        return this.f7071fi;
    }
}
