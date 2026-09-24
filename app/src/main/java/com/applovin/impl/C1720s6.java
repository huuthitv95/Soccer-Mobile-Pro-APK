package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: renamed from: com.applovin.impl.s6 */
/* JADX INFO: loaded from: classes3.dex */
class C1720s6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final AbstractC1798v7 f2801g;

    /* JADX INFO: renamed from: h */
    private final AppLovinAdLoadListener f2802h;

    /* JADX INFO: renamed from: com.applovin.impl.s6$a */
    class a extends AbstractC1673o6 {
        a(C1762a c1762a, C1748l c1748l) {
            super(c1762a, c1748l);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, C1702q8 c1702q8) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to resolve VAST wrapper. Server returned " + i);
            }
            C1720s6.this.m4348a(i);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, C1702q8 c1702q8, int i) {
            this.f1969a.m4853s0().m2603a(AbstractC1602k6.m3088a(c1702q8, C1720s6.this.f2801g, C1720s6.this.f2802h, C1720s6.this.f1969a));
        }
    }

    C1720s6(AbstractC1798v7 abstractC1798v7, AppLovinAdLoadListener appLovinAdLoadListener, C1748l c1748l) {
        super("TaskResolveVastWrapper", c1748l);
        this.f2802h = appLovinAdLoadListener;
        this.f2801g = abstractC1798v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m4348a(int i) {
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i != -1009) {
            AbstractC1534d8.m2437a(this.f2801g, this.f2802h, i == -1001 ? EnumC1807w7.TIMED_OUT : EnumC1807w7.GENERAL_WRAPPER_ERROR, i, this.f1969a);
            return;
        }
        AppLovinAdLoadListener appLovinAdLoadListener = this.f2802h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String strM2433a = AbstractC1534d8.m2433a(this.f2801g);
        if (!StringUtils.isValidString(strM2433a)) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Resolving VAST failed. Could not find resolution URL");
            }
            m4348a(-1);
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Resolving VAST ad with depth " + this.f2801g.m5485d() + " at " + strM2433a);
        }
        try {
            this.f1969a.m4853s0().m2603a(new a(C1762a.m5013a(this.f1969a).mo5045b(strM2433a).mo5049c("GET").mo5038a(C1702q8.f2669f).mo5036a(((Integer) this.f1969a.m4801a(C1831z4.f3859X4)).intValue()).mo5048c(((Integer) this.f1969a.m4801a(C1831z4.f3867Y4)).intValue()).mo5042a(false).mo5043a(), this.f1969a));
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Unable to resolve VAST wrapper", th);
            }
            m4348a(-1);
        }
    }
}
