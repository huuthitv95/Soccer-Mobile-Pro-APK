package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.x0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8431x0 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final String f18761p;

    /* JADX INFO: renamed from: q */
    public final String f18762q;

    /* JADX INFO: renamed from: r */
    public final AtomicInteger f18763r;

    public C8431x0(C8368e c8368e, String str, String str2) {
        super(c8368e, C8377g0.f18655c.m20755a(), null);
        this.f18763r = new AtomicInteger();
        this.f18762q = str;
        this.f18761p = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws C8398n0 {
        try {
            C8401o0 c8401o0 = new C8401o0();
            c8401o0.f18690a = String.valueOf(i);
            return c8401o0;
        } catch (Exception e) {
            IAlog.m21944a("failed parse event network request", e, new Object[0]);
            throw new C8398n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: f */
    public final byte[] mo20727f() {
        byte[] bArr = new byte[0];
        try {
            IAlog.m21945a("NetworkRequestEvent: network request body %s", this.f18761p);
            return this.f18761p.getBytes(StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return bArr;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return ((int) Math.pow(2.0d, this.f18763r.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: m */
    public final EnumC8395m0 mo20729m() {
        return EnumC8395m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: o */
    public final EnumC8378g1 mo20731o() {
        return EnumC8378g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: r */
    public final String mo20732r() {
        return this.f18762q;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return this.f18763r.getAndIncrement() < 4;
    }
}
