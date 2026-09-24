package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.z0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8435z0 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final String f18769p;

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f18770q;

    public C8435z0(InterfaceC8374f0 interfaceC8374f0, String str) {
        super(interfaceC8374f0, C8377g0.f18655c.m20755a(), null);
        this.f18770q = new AtomicInteger();
        this.f18769p = str;
    }

    /* JADX INFO: renamed from: b */
    public static void m20813b(String str) {
        IAConfigManager.f17654M.f17686r.m20768a(new C8435z0(new C8433y0(str, System.currentTimeMillis()), str));
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws C8398n0 {
        try {
            C8401o0 c8401o0 = new C8401o0();
            c8401o0.f18690a = String.valueOf(i);
            InputStream inputStream = c8391l.f18668c;
            if (inputStream != null) {
                c8401o0.f18691b = AbstractC9195v.m22033b(inputStream).toString();
            }
            return c8401o0;
        } catch (Exception e) {
            IAlog.m21944a("failed parse hit network request", e, new Object[0]);
            throw new C8398n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return ((int) Math.pow(2.0d, this.f18770q.get())) * 1000;
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
        return this.f18769p;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return this.f18770q.getAndIncrement() < 4;
    }
}
