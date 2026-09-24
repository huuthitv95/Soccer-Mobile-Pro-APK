package com.bytedance.sdk.component.p145fi.p154ri;

import com.bytedance.sdk.component.p145fi.InterfaceC2593di;
import com.bytedance.sdk.component.p145fi.xha;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2626ik<T> implements InterfaceC2593di {

    /* JADX INFO: renamed from: fi */
    private xha f7388fi;

    /* JADX INFO: renamed from: ik */
    private T f7389ik;

    /* JADX INFO: renamed from: ka */
    private String f7390ka;

    /* JADX INFO: renamed from: lr */
    private int f7391lr;

    /* JADX INFO: renamed from: ri */
    Map<String, String> f7392ri;

    public C2626ik(int i, T t, String str) {
        this.f7391lr = i;
        this.f7389ik = t;
        this.f7390ka = str;
    }

    public C2626ik(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.f7392ri = map;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2593di
    /* JADX INFO: renamed from: ik */
    public String mo9561ik() {
        return this.f7390ka;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2593di
    /* JADX INFO: renamed from: lr */
    public T mo9562lr() {
        return this.f7389ik;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2593di
    /* JADX INFO: renamed from: ri */
    public int mo9563ri() {
        return this.f7391lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m9735ri(xha xhaVar) {
        this.f7388fi = xhaVar;
    }
}
