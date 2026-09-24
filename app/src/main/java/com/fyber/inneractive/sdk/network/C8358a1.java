package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.ignite.C8241b;
import com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.a1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8358a1 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final byte[] f18622p;

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f18623q;

    public C8358a1(C8241b c8241b, byte[] bArr, C8006r c8006r) {
        super(c8241b, C8377g0.f18655c.m20755a(), c8006r);
        this.f18623q = new AtomicInteger();
        this.f18622p = bArr;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws C8398n0 {
        try {
            C8401o0 c8401o0 = new C8401o0();
            InputStream inputStream = c8391l.f18668c;
            if (inputStream != null) {
                String str = new String(AbstractC9195v.m22031a(inputStream), "UTF-8");
                IgniteResponseOuterClass$IgniteResponse from = IgniteResponseOuterClass$IgniteResponse.parseFrom(str.getBytes());
                c8401o0.f18691b = str;
                c8401o0.f18690a = from;
            }
            return c8401o0;
        } catch (Exception e) {
            IAlog.m21944a("failed parse ignite network request", e, new Object[0]);
            throw new C8398n0(e);
        } catch (Throwable th) {
            IAlog.m21944a("failed parse ignite network request", th, new Object[0]);
            throw new C8398n0("failed to parse ignite network request");
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: f */
    public final byte[] mo20727f() {
        return this.f18622p;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return ((int) Math.pow(2.0d, this.f18623q.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: m */
    public final EnumC8395m0 mo20729m() {
        return EnumC8395m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: n */
    public final String mo20730n() {
        return "application/x-protobuf; messageType=IgniteRequest";
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: o */
    public final EnumC8378g1 mo20731o() {
        return EnumC8378g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: r */
    public final String mo20732r() {
        return "https://init-mp.fyber.com/init";
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return this.f18623q.getAndIncrement() < 4;
    }
}
