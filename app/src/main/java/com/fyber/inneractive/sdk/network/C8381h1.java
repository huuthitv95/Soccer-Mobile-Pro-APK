package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.click.C7929c;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.h1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8381h1 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final String f18659p;

    public C8381h1(InterfaceC8374f0 interfaceC8374f0, String str) {
        super(interfaceC8374f0, C8377g0.f18655c.m20755a(), null);
        this.f18659p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) {
        C8401o0 c8401o0 = new C8401o0();
        C7929c c7929c = new C7929c();
        if (c8391l != null) {
            ArrayList arrayList = c8391l.f18671f;
            c7929c.f17613a.clear();
            c7929c.f17613a.addAll(arrayList);
            InputStream inputStream = c8391l.f18668c;
            if (inputStream != null) {
                String string = AbstractC9195v.m22033b(inputStream).toString();
                c7929c.f17614b = string;
                c8401o0.f18691b = string;
            }
        }
        c8401o0.f18690a = c7929c;
        return c8401o0;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: m */
    public final EnumC8395m0 mo20729m() {
        return EnumC8395m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: o */
    public final EnumC8378g1 mo20731o() {
        return EnumC8378g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: r */
    public final String mo20732r() {
        return this.f18659p;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return false;
    }
}
