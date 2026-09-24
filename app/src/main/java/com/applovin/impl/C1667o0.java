package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.network.C1762a;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.o0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1667o0 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final String f2442g;

    /* JADX INFO: renamed from: h */
    private final C1762a f2443h;

    /* JADX INFO: renamed from: com.applovin.impl.o0$a */
    class a extends AbstractC1673o6 {
        a(C1762a c1762a, C1748l c1748l, boolean z) {
            super(c1762a, c1748l, z);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            this.f1969a.m4856u().m4706a(C1667o0.this.f2442g, C1667o0.this.f2443h.m5023f(), i, jSONObject, str2, false);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            this.f1969a.m4856u().m4706a(C1667o0.this.f2442g, C1667o0.this.f2443h.m5023f(), i, jSONObject, null, true);
        }
    }

    public C1667o0(String str, C1762a c1762a, C1748l c1748l) {
        super("CommunicatorRequestTask", c1748l, str);
        this.f2442g = str;
        this.f2443h = c1762a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1969a.m4853s0().m2603a(new a(this.f2443h, this.f1969a, m3087d()));
    }
}
