package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C7911m;
import com.fyber.inneractive.sdk.cache.InterfaceC7899a;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.v0 */
/* JADX INFO: loaded from: classes4.dex */
public class C8427v0 extends AbstractC8416t0 {

    /* JADX INFO: renamed from: p */
    public final Context f18749p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC7899a f18750q;

    /* JADX INFO: renamed from: r */
    public C8366d0 f18751r;

    public C8427v0(InterfaceC8374f0 interfaceC8374f0, Context context, InterfaceC7899a interfaceC7899a) {
        super(interfaceC8374f0, C8377g0.f18655c.m20755a(), null);
        this.f18749p = context;
        this.f18750q = interfaceC7899a;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws Exception {
        C8401o0 c8401o0 = new C8401o0();
        try {
            String string = AbstractC9195v.m22033b(c8391l.f18668c).toString();
            c8401o0.f18690a = this.f18750q.mo20349a(string);
            c8401o0.f18691b = string;
            return c8401o0;
        } catch (Exception e) {
            IAlog.m21944a("failed parse cacheable network request", e, new Object[0]);
            if (e instanceof InvalidAppIdException) {
                throw e;
            }
            throw new C8398n0(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public void mo20788a(C8401o0 c8401o0, String str, String str2) {
        C8366d0 c8366d0 = this.f18751r;
        if (c8366d0 != null) {
            c8366d0.m20740b(str2);
            if (c8401o0 == null || c8401o0.f18691b.isEmpty() || str.isEmpty()) {
                return;
            }
            if (this.f18751r.mo20738a(str, c8401o0.f18691b)) {
                this.f18750q.mo20351a(c8401o0.f18690a);
            } else {
                IAlog.m21946b("Failed to cache file", new Object[0]);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: g */
    public final int mo20728g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: h */
    public final String mo20792h() {
        return this.f18750q.mo20353c();
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: i */
    public C8356a mo20793i() throws Throwable {
        C8366d0 c8366d0 = new C8366d0(this.f18749p, this.f18750q);
        this.f18751r = c8366d0;
        C7911m c7911mMo20736a = c8366d0.mo20736a();
        String str = c7911mMo20736a.f17587b;
        Object obj = c7911mMo20736a.f17586a;
        this.f18750q.mo20353c();
        return new C8356a(obj, str);
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
        return this.f18750q.mo20350a();
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: u */
    public final boolean mo20733u() {
        return false;
    }
}
